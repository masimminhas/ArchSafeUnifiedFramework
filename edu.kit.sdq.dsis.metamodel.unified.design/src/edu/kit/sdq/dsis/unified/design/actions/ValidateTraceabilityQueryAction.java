package edu.kit.sdq.dsis.unified.design.actions;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

import unified.UnifiedSystemModel;
import unified.FMEAAnalysis;
import unified.FMEAItem;
import unified.SafetyCriticalBlock;
import unified.BlockFailureMode;
import unified.IntegratedHazard;
import unified.ASILLevel;
import unified.MitigationStatus;
import unified.RiskLevel;


public class ValidateTraceabilityQueryAction extends AbstractExternalJavaAction {

    @Override
    public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
        if (selections == null || selections.isEmpty()) {
            showError("No model selected", "Please select a UnifiedSystemModel.");
            return;
        }

        EObject firstSelection = selections.iterator().next();
        UnifiedSystemModel model = getUnifiedSystemModel(firstSelection);

        if (model == null) {
            showError("Invalid Selection", "Please select a valid UnifiedSystemModel.");
            return;
        }

        StringBuilder report = new StringBuilder();
        report.append("═══════════════════════════════════════════════\n");
        report.append("    TRACEABILITY COVERAGE VALIDATION REPORT\n");
        report.append("═══════════════════════════════════════════════\n\n");
        
        // Compute metrics
        Map<String, Double> metrics = computeTraceabilityMetrics(model);
        
        report.append("📊 COVERAGE METRICS:\n");
        report.append("───────────────────────────────────────────────\n");
        
        // 1. Hazard Coverage
        double hazardCoverage = metrics.get("hazardCoverage");
        String hazardStatus = getStatus(hazardCoverage, 0.8, 0.6);
        report.append(String.format("Hazard → Block Coverage:        %5.1f%% %s\n", 
            hazardCoverage * 100, hazardStatus));
        
        // 2. FMEA Coverage
        double fmeaCoverage = metrics.get("fmeaCoverage");
        String fmeaStatus = getStatus(fmeaCoverage, 0.8, 0.6);
        report.append(String.format("Block → FMEA Coverage:          %5.1f%% %s\n", 
            fmeaCoverage * 100, fmeaStatus));
        
        // 3. Failure Mode Coverage
        double fmCoverage = metrics.get("failureModeCoverage");
        String fmStatus = getStatus(fmCoverage, 0.7, 0.5);
        report.append(String.format("Failure Mode → FMEA Coverage:   %5.1f%% %s\n", 
            fmCoverage * 100, fmStatus));
        
        // 4. Bidirectional Traceability
        double biDirCoverage = metrics.get("bidirectionalCoverage");
        String biDirStatus = getStatus(biDirCoverage, 0.9, 0.7);
        report.append(String.format("Bidirectional Trace Coverage:   %5.1f%% %s\n", 
            biDirCoverage * 100, biDirStatus));
        
        // 5. Overall Traceability Density
        double density = metrics.get("traceabilityDensity");
        String densityStatus = getStatus(density, 0.6, 0.4);
        report.append(String.format("Overall Traceability Density:   %5.1f%% %s\n", 
            density * 100, densityStatus));
        
        report.append("\n");
        
        // Detailed Counts
        report.append("📈 ELEMENT COUNTS:\n");
        report.append("───────────────────────────────────────────────\n");
        report.append(String.format("Total Hazards:                  %d\n", 
            model.getGlobalHazards().size()));
        report.append(String.format("  - With Block Links:           %d\n", 
            (metrics.get("hazardsWithBlocks"))));
        report.append(String.format("Total Safety-Critical Blocks:   %d\n", 
            model.getRootBlocks().size()));
        report.append(String.format("  - With FMEA Items:            %d\n", 
            (metrics.get("blocksWithFMEA"))));
        report.append(String.format("  - With Failure Modes:         %d\n", 
            (metrics.get("blocksWithFM"))));
        
        int totalFMEAItems = 0;
        for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
            totalFMEAItems += analysis.getFmeaItems().size();
        }
        report.append(String.format("Total FMEA Items:               %d\n", totalFMEAItems));
        report.append(String.format("  - With Components:            %d\n", 
            (metrics.get("fmeaWithComponents"))));
        report.append(String.format("  - With Failure Modes:         %d\n", 
            (metrics.get("fmeaWithFM"))));
        report.append(String.format("  - With Hazards:               %d\n", 
            (metrics.get("fmeaWithHazards"))));
        
        int totalFMs = 0;
        for (SafetyCriticalBlock block : model.getRootBlocks()) {
            totalFMs += block.getFailureModes().size();
        }
        report.append(String.format("Total Failure Modes:            %d\n", totalFMs));
        report.append(String.format("  - With FMEA Items:            %d\n", 
            (metrics.get("fmWithFMEA"))));
        
        report.append("\n");
        
        // ISO 26262 Compliance Check
        report.append("✓ ISO 26262 COMPLIANCE:\n");
        report.append("───────────────────────────────────────────────\n");
        
        boolean asilDCompliance = checkASILDCompliance(model);
        report.append(String.format("ASIL D Traceability:            %s\n", 
            asilDCompliance ? "✅ PASS" : "❌ FAIL"));
        
        boolean criticalHazards = checkCriticalHazardCoverage(model);
        report.append(String.format("Critical Hazard Coverage:       %s\n", 
            criticalHazards ? "✅ PASS" : "❌ FAIL"));
        
        boolean fmeaCompleteness = fmeaCoverage >= 0.8;
        report.append(String.format("FMEA Completeness (≥80%%):       %s\n", 
            fmeaCompleteness ? "✅ PASS" : "❌ FAIL"));
        
        report.append("\n");
        
        // Overall Assessment
        report.append("═══════════════════════════════════════════════\n");
        double overallScore = (hazardCoverage + fmeaCoverage + biDirCoverage + density) / 4.0;
        String grade = getGrade(overallScore);
        String emoji = getGradeEmoji(overallScore);
        
        report.append(String.format("OVERALL TRACEABILITY SCORE:     %.1f%% %s\n", 
            overallScore * 100, emoji));
        report.append(String.format("GRADE:                          %s\n", grade));
        
        if (overallScore >= 0.8) {
            report.append("\n✅ EXCELLENT: Model has comprehensive traceability.\n");
        } else if (overallScore >= 0.6) {
            report.append("\n⚠️  GOOD: Model has adequate traceability but could be improved.\n");
        } else {
            report.append("\n❌ NEEDS IMPROVEMENT: Significant traceability gaps exist.\n");
        }
        
        report.append("═══════════════════════════════════════════════\n");
        
        // Show report
        showInfo("Traceability Coverage Validation", report.toString());
        
        // Update metadata
        if (model.getAnalysisMetadata() != null) {
            model.getAnalysisMetadata().setTraceabilityDensity(density);
            model.getAnalysisMetadata().setHazardCoverage(hazardCoverage);
            model.getAnalysisMetadata().setFmeaCoverage(fmeaCoverage);
            model.getAnalysisMetadata().setLastAnalysisDate(new Date());
        }
    }

    private Map<String, Double> computeTraceabilityMetrics(UnifiedSystemModel model) {
        Map<String, Double> metrics = new HashMap<>();
        
        // 1. Hazard Coverage
        int hazardsWithBlocks = 0;
        for (IntegratedHazard hazard : model.getGlobalHazards()) {
            if (!hazard.getRelatedBlocks().isEmpty()) {
                hazardsWithBlocks++;
            }
        }
        double hazardCoverage = model.getGlobalHazards().isEmpty() ? 1.0 :
            (double) hazardsWithBlocks / model.getGlobalHazards().size();
        metrics.put("hazardCoverage", hazardCoverage);
        metrics.put("hazardsWithBlocks", (double) hazardsWithBlocks);
        
        // 2. FMEA Coverage
        int blocksWithFMEA = 0;
        for (SafetyCriticalBlock block : model.getRootBlocks()) {
            for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
                boolean found = false;
                for (FMEAItem item : analysis.getFmeaItems()) {
                    if (item.getAnalyzedComponent() == block) {
                        blocksWithFMEA++;
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }
        }
        double fmeaCoverage = model.getRootBlocks().isEmpty() ? 1.0 :
            (double) blocksWithFMEA / model.getRootBlocks().size();
        metrics.put("fmeaCoverage", fmeaCoverage);
        metrics.put("blocksWithFMEA", (double) blocksWithFMEA);
        
        // 3. Failure Mode Coverage
        int blocksWithFM = 0;
        for (SafetyCriticalBlock block : model.getRootBlocks()) {
            if (!block.getFailureModes().isEmpty()) {
                blocksWithFM++;
            }
        }
        metrics.put("blocksWithFM", (double) blocksWithFM);
        
        int fmWithFMEA = 0;
        int totalFMs = 0;
        for (SafetyCriticalBlock block : model.getRootBlocks()) {
            for (BlockFailureMode fm : block.getFailureModes()) {
                totalFMs++;
                for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
                    boolean found = false;
                    for (FMEAItem item : analysis.getFmeaItems()) {
                        if (item.getFailureMode() == fm) {
                            fmWithFMEA++;
                            found = true;
                            break;
                        }
                    }
                    if (found) break;
                }
            }
        }
        double fmCoverage = totalFMs == 0 ? 1.0 : (double) fmWithFMEA / totalFMs;
        metrics.put("failureModeCoverage", fmCoverage);
        metrics.put("fmWithFMEA", (double) fmWithFMEA);
        
        // 4. FMEA Item Completeness
        int fmeaWithComponents = 0;
        int fmeaWithFM = 0;
        int fmeaWithHazards = 0;
        int totalFMEAItems = 0;
        
        for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
            for (FMEAItem item : analysis.getFmeaItems()) {
                totalFMEAItems++;
                if (item.getAnalyzedComponent() != null) fmeaWithComponents++;
                if (item.getFailureMode() != null) fmeaWithFM++;
                if (!item.getRelatedHazards().isEmpty()) fmeaWithHazards++;
            }
        }
        
        metrics.put("fmeaWithComponents", (double) fmeaWithComponents);
        metrics.put("fmeaWithFM", (double) fmeaWithFM);
        metrics.put("fmeaWithHazards", (double) fmeaWithHazards);
        
        // 5. Bidirectional Coverage
        int bidirectionalLinks = 0;
        int totalExpectedBidirectional = 0;
        
        // Check Hazard ↔ Block bidirectionality
        for (IntegratedHazard hazard : model.getGlobalHazards()) {
            for (SafetyCriticalBlock block : hazard.getRelatedBlocks()) {
                totalExpectedBidirectional++;
                // Check if there's FMEA or FM linking back
                boolean hasBackLink = false;
                for (@SuppressWarnings("unused") BlockFailureMode fm : block.getFailureModes()) {
                    hasBackLink = true;
                    break;
                }
                if (hasBackLink) bidirectionalLinks++;
            }
        }
        
        double biDirCoverage = totalExpectedBidirectional == 0 ? 1.0 :
            (double) bidirectionalLinks / totalExpectedBidirectional;
        metrics.put("bidirectionalCoverage", biDirCoverage);
        
        // 6. Overall Traceability Density
        int totalTraceLinks = 0;
        
        // Count all trace links
        for (IntegratedHazard h : model.getGlobalHazards()) {
            totalTraceLinks += h.getRelatedBlocks().size();
        }
        for (FMEAAnalysis a : model.getFmeaAnalysis()) {
            for (FMEAItem item : a.getFmeaItems()) {
                if (item.getAnalyzedComponent() != null) totalTraceLinks++;
                if (item.getFailureMode() != null) totalTraceLinks++;
                totalTraceLinks += item.getRelatedHazards().size();
            }
        }
        for (SafetyCriticalBlock b : model.getRootBlocks()) {
            totalTraceLinks += b.getFailureModes().size();
        }
        
        int totalElements = model.getGlobalHazards().size() + 
                           model.getRootBlocks().size() + 
                           totalFMEAItems + 
                           totalFMs;
        
        double density = totalElements == 0 ? 0.0 : 
            (double) totalTraceLinks / (totalElements * 2); // Normalize to 0-1 range
        metrics.put("traceabilityDensity", Math.min(1.0, density));
        
        return metrics;
    }

    private boolean checkASILDCompliance(UnifiedSystemModel model) {
        // ASIL D blocks must have: hazards, failure modes, and FMEA
        for (SafetyCriticalBlock block : model.getRootBlocks()) {
            if (block.getAsilLevel() == ASILLevel.ASIL_D) {
                // Check hazards
                boolean hasHazard = false;
                for (IntegratedHazard h : model.getGlobalHazards()) {
                    if (h.getRelatedBlocks().contains(block)) {
                        hasHazard = true;
                        break;
                    }
                }
                
                // Check failure modes
                boolean hasFM = !block.getFailureModes().isEmpty();
                
                // Check FMEA
                boolean hasFMEA = false;
                for (FMEAAnalysis a : model.getFmeaAnalysis()) {
                    for (FMEAItem item : a.getFmeaItems()) {
                        if (item.getAnalyzedComponent() == block) {
                            hasFMEA = true;
                            break;
                        }
                    }
                    if (hasFMEA) break;
                }
                
                if (!hasHazard || !hasFM || !hasFMEA) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkCriticalHazardCoverage(UnifiedSystemModel model) {
        // All CATASTROPHIC and CRITICAL_RISK hazards must have mitigation
        for (IntegratedHazard hazard : model.getGlobalHazards()) {
            if (hazard.getRiskLevel() == RiskLevel.CATASTROPHIC || 
                hazard.getRiskLevel() == RiskLevel.CRITICAL_RISK) {
                
                if (hazard.getRelatedBlocks().isEmpty()) {
                    return false;
                }
                
                if (hazard.getMitigationStatus() == MitigationStatus.NOT_MITIGATED) {
                    return false;
                }
            }
        }
        return true;
    }

    private String getStatus(double value, double goodThreshold, double okThreshold) {
        if (value >= goodThreshold) return "✅";
        if (value >= okThreshold) return "⚠️ ";
        return "❌";
    }

    private String getGrade(double score) {
        if (score >= 0.9) return "A (Excellent)";
        if (score >= 0.8) return "B (Very Good)";
        if (score >= 0.7) return "C (Good)";
        if (score >= 0.6) return "D (Adequate)";
        return "F (Needs Improvement)";
    }

    private String getGradeEmoji(double score) {
        if (score >= 0.9) return "🌟";
        if (score >= 0.8) return "✅";
        if (score >= 0.7) return "👍";
        if (score >= 0.6) return "⚠️ ";
        return "❌";
    }

    private UnifiedSystemModel getUnifiedSystemModel(EObject obj) {
        if (obj instanceof UnifiedSystemModel) {
            return (UnifiedSystemModel) obj;
        }
        if (obj instanceof DSemanticDecorator) {
            return getUnifiedSystemModel(((DSemanticDecorator) obj).getTarget());
        }
        if (obj.eContainer() != null) {
            return getUnifiedSystemModel(obj.eContainer());
        }
        return null;
    }

    private void showError(String title, String message) {
        Display.getDefault().syncExec(() -> 
            MessageDialog.openError(Display.getDefault().getActiveShell(), title, message)
        );
    }

    private void showInfo(String title, String message) {
        Display.getDefault().syncExec(() -> {
            MessageDialog dialog = new MessageDialog(
                Display.getDefault().getActiveShell(),
                title,
                null,
                message,
                MessageDialog.INFORMATION,
                new String[] { "OK", "Export Report" },
                0
            );
            int result = dialog.open();
            
            if (result == 1) { // Export Report button
                exportReport(message);
            }
        });
    }

    private void exportReport(String report) {
        Shell shell = Display.getDefault().getActiveShell();
        FileDialog dialog = new FileDialog(shell, SWT.SAVE);
        dialog.setFilterNames(new String[] { "Text Files (*.txt)", "All Files (*.*)" });
        dialog.setFilterExtensions(new String[] { "*.txt", "*.*" });
        dialog.setFileName("TraceabilityCoverageReport_" + 
            new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) + ".txt");
        
        String filePath = dialog.open();
        if (filePath != null) {
            try (FileWriter writer = new FileWriter(filePath)) {
                writer.write(report);
                MessageDialog.openInformation(shell, "Export Successful",
                    "Coverage report exported to:\n" + filePath);
            } catch (IOException e) {
                MessageDialog.openError(shell, "Export Failed",
                    "Failed to export report: " + e.getMessage());
            }
        }
    }

    @Override
    public boolean canExecute(Collection<? extends EObject> selections) {
        return selections != null && !selections.isEmpty();
    }
}