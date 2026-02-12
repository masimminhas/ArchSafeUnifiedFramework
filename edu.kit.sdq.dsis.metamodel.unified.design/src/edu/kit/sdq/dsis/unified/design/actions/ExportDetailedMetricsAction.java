package edu.kit.sdq.dsis.unified.design.actions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;

import edu.kit.sdq.dsis.unified.design.services.AdvancedAnalysisServices;
import edu.kit.sdq.dsis.unified.design.services.AdvancedAnalysisServices.ModelMetrics;
import unified.UnifiedSystemModel;

/**
 * Action handler for exporting detailed metrics report to CSV.
 * Compatible with Sirius IExternalJavaAction interface.
 */
public class ExportDetailedMetricsAction implements IExternalJavaAction {
    
    private final AdvancedAnalysisServices analysisService = new AdvancedAnalysisServices();
    
    // IExternalJavaAction implementation
    @Override
    public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
        if (selections == null || selections.isEmpty()) {
            showError("Please select a model element");
            return;
        }
        
        EObject element = selections.iterator().next();
        exportMetrics(element);
    }
    
    @Override
    public boolean canExecute(Collection<? extends EObject> selections) {
        return !selections.isEmpty() && getModelFromSelections(selections) != null;
    }
    
    // Public service method that can be called from AQL
    public void exportMetrics(EObject element) {
        try {
            UnifiedSystemModel model = getModel(element);
            if (model == null) {
                showError("Please select a model element");
                return;
            }
            
            // Ask user for file location - must run in UI thread
            final String[] filepath = new String[1];
            Display.getDefault().syncExec(() -> {
                FileDialog dialog = new FileDialog(Display.getDefault().getActiveShell(), SWT.SAVE);
                dialog.setFilterExtensions(new String[] {"*.csv"});
                dialog.setFilterNames(new String[] {"CSV Files (*.csv)"});
                dialog.setFileName("Metrics_Report.csv");
                filepath[0] = dialog.open();
            });
            
            if (filepath[0] == null) return; // User cancelled
            
            // Compute metrics
            ModelMetrics metrics = analysisService.computeModelMetrics(model);
            
            // Export to CSV
            exportMetricsToCSV(metrics, model, filepath[0]);
            
            showInfo("Export Complete", 
                    "✅ Metrics report exported successfully to:\n" + filepath[0] + "\n\n" +
                    "Completeness Score: " + metrics.getCompletenessScore() + "/100\n" +
                    "Consistency Score: " + metrics.getConsistencyScore() + "/100");
            
        } catch (Exception e) {
            showError("Export failed: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    private void exportMetricsToCSV(ModelMetrics metrics, UnifiedSystemModel model, 
                                     String filepath) throws IOException {
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filepath))) {
            
            // Header
            writer.write("=== MODEL METRICS REPORT ===\n");
            writer.write("Generated: " + new java.util.Date().toString() + "\n");
            writer.write("Model: UnifiedSystemModel\n");
            writer.write("\n\n");
            
            // Architecture Metrics Section
            writer.write("=== ARCHITECTURE METRICS ===\n");
            writer.write("Metric,Value\n");
            writer.write("Total Blocks," + metrics.getTotalBlocks() + "\n");
            writer.write("System Blocks," + model.getSystemBlocks().size() + "\n");
            writer.write("Safety Critical Blocks," + model.getRootBlocks().size() + "\n");
            writer.write("Total Connections," + metrics.getTotalConnections() + "\n");
            writer.write("Total Associations," + model.getBlockAssociations().size() + "\n");
            writer.write("Cyclomatic Complexity," + metrics.getCyclomaticComplexity() + "\n");
            writer.write("Average Block Degree," + String.format("%.2f", metrics.getAverageBlockDegree()) + "\n");
            writer.write("\n\n");
            
            // Safety Metrics Section
            writer.write("=== SAFETY METRICS ===\n");
            writer.write("Metric,Value\n");
            writer.write("Total Hazards," + metrics.getTotalHazards() + "\n");
            writer.write("Catastrophic Hazards," + countCatastrophicHazards(model) + "\n");
            writer.write("Critical Hazards," + countCriticalHazards(model) + "\n");
            writer.write("Mitigated Hazards," + countMitigatedHazards(model) + "\n");
            writer.write("Hazard Coverage," + String.format("%.1f%%", metrics.getHazardCoverage() * 100) + "\n");
            writer.write("Total Failure Modes," + countTotalFailureModes(model) + "\n");
            writer.write("\n\n");
            
            // FMEA Metrics Section
            writer.write("=== FMEA METRICS ===\n");
            writer.write("Metric,Value\n");
            writer.write("Total FMEA Items," + metrics.getTotalFMEAItems() + "\n");
            writer.write("FMEA Coverage," + String.format("%.1f%%", metrics.getFmeaCoverage() * 100) + "\n");
            writer.write("Average RPN," + String.format("%.1f", metrics.getAverageRPN()) + "\n");
            writer.write("High Risk Items (RPN > Threshold)," + metrics.getHighRiskItems() + "\n");
            writer.write("Auto-Generated Items," + String.format("%.1f%%", metrics.getAutoGeneratedPercentage()) + "\n");
            writer.write("\n\n");
            
            // Traceability Metrics Section
            writer.write("=== TRACEABILITY METRICS ===\n");
            writer.write("Metric,Value\n");
            writer.write("Traceability Density," + String.format("%.1f%%", metrics.getTraceabilityDensity() * 100) + "\n");
            writer.write("Traceability Links," + metrics.getTraceabilityLinks() + "\n");
            writer.write("Hazard-to-Block Links," + countHazardToBlockLinks(model) + "\n");
            writer.write("FMEA-to-Component Links," + countFMEAToComponentLinks(model) + "\n");
            writer.write("\n\n");
            
            // Overall Quality Scores Section
            writer.write("=== OVERALL QUALITY SCORES ===\n");
            writer.write("Score,Value,Rating\n");
            writer.write("Completeness Score," + metrics.getCompletenessScore() + "/100," + 
                        getRating(metrics.getCompletenessScore()) + "\n");
            writer.write("Consistency Score," + metrics.getConsistencyScore() + "/100," + 
                        getRating(metrics.getConsistencyScore()) + "\n");
            writer.write("\n\n");
            
            // Recommendations Section
            writer.write("=== RECOMMENDATIONS ===\n");
            writer.write(generateRecommendations(metrics));
            writer.write("\n\n");
            
            // Detailed Breakdown Section
            writer.write("=== DETAILED BREAKDOWN ===\n");
            writer.write("Category,Element,Count\n");
            writer.write("Blocks,System Blocks," + model.getSystemBlocks().size() + "\n");
            writer.write("Blocks,Safety Critical Blocks," + model.getRootBlocks().size() + "\n");
            writer.write("Connections,Block Connections," + model.getBlockConnections().size() + "\n");
            writer.write("Connections,Block Associations," + model.getBlockAssociations().size() + "\n");
            writer.write("Safety,Global Hazards," + model.getGlobalHazards().size() + "\n");
            writer.write("Safety,Total Failure Modes," + countTotalFailureModes(model) + "\n");
            writer.write("Analysis,FMEA Analyses," + model.getFmeaAnalysis().size() + "\n");
            writer.write("Analysis,Total FMEA Items," + metrics.getTotalFMEAItems() + "\n");
        }
    }
    
    private String getRating(int score) {
        if (score >= 90) return "Excellent";
        if (score >= 80) return "Very Good";
        if (score >= 70) return "Good";
        if (score >= 60) return "Fair";
        if (score >= 50) return "Poor";
        return "Critical";
    }
    
    private String generateRecommendations(ModelMetrics metrics) {
        StringBuilder recommendations = new StringBuilder();
        recommendations.append("Recommendation,Priority,Description\n");
        
        if (metrics.getCompletenessScore() < 50) {
            recommendations.append("Improve Model Completeness,HIGH,\"Model completeness is below 50%. Add more hazard associations, FMEA items, and traceability links.\"\n");
        }
        
        if (metrics.getHazardCoverage() < 0.5) {
            recommendations.append("Increase Hazard Coverage,HIGH,\"Hazard coverage is below 50%. Link more hazards to safety-critical blocks.\"\n");
        }
        
        if (metrics.getFmeaCoverage() < 0.8) {
            recommendations.append("Expand FMEA Coverage,MEDIUM,\"FMEA coverage is below 80%. Perform FMEA analysis on more safety-critical blocks.\"\n");
        }
        
        if (metrics.getAverageRPN() > 100) {
            recommendations.append("Address High RPN Values,HIGH,\"Average RPN exceeds 100. Review and mitigate high-risk FMEA items.\"\n");
        }
        
        if (metrics.getTraceabilityDensity() < 0.3) {
            recommendations.append("Improve Traceability,MEDIUM,\"Traceability density is below 30%. Add more links between architecture and safety elements.\"\n");
        }
        
        if (metrics.getCyclomaticComplexity() > 20) {
            recommendations.append("Reduce Complexity,LOW,\"Cyclomatic complexity is high. Consider simplifying the architecture.\"\n");
        }
        
        if (recommendations.length() == 0 || recommendations.toString().equals("Recommendation,Priority,Description\n")) {
            recommendations.append("No Critical Issues,INFO,\"Model quality is good. Continue maintaining high standards.\"\n");
        }
        
        return recommendations.toString();
    }
    
    // Helper methods for additional metrics
    private int countCatastrophicHazards(UnifiedSystemModel model) {
        int count = 0;
        for (unified.IntegratedHazard hazard : model.getGlobalHazards()) {
            if (hazard.getRiskLevel() == unified.RiskLevel.CATASTROPHIC) {
                count++;
            }
        }
        return count;
    }
    
    private int countCriticalHazards(UnifiedSystemModel model) {
        int count = 0;
        for (unified.IntegratedHazard hazard : model.getGlobalHazards()) {
            if (hazard.getRiskLevel() == unified.RiskLevel.CRITICAL_RISK) {
                count++;
            }
        }
        return count;
    }
    
    private int countMitigatedHazards(UnifiedSystemModel model) {
        int count = 0;
        for (unified.IntegratedHazard hazard : model.getGlobalHazards()) {
            if (hazard.getMitigationStatus() != unified.MitigationStatus.NOT_MITIGATED) {
                count++;
            }
        }
        return count;
    }
    
    private int countTotalFailureModes(UnifiedSystemModel model) {
        int count = 0;
        for (unified.SafetyCriticalBlock block : model.getRootBlocks()) {
            count += block.getFailureModes().size();
        }
        return count;
    }
    
    private int countHazardToBlockLinks(UnifiedSystemModel model) {
        int count = 0;
        for (unified.IntegratedHazard hazard : model.getGlobalHazards()) {
            count += hazard.getRelatedBlocks().size();
        }
        return count;
    }
    
    private int countFMEAToComponentLinks(UnifiedSystemModel model) {
        int count = 0;
        for (unified.FMEAAnalysis analysis : model.getFmeaAnalysis()) {
            for (unified.FMEAItem item : analysis.getFmeaItems()) {
                if (item.getAnalyzedComponent() != null) {
                    count++;
                }
            }
        }
        return count;
    }
    
    // Helper methods
    private UnifiedSystemModel getModelFromSelections(Collection<? extends EObject> selections) {
        if (selections == null || selections.isEmpty()) {
            return null;
        }
        return getModel(selections.iterator().next());
    }
    
    private UnifiedSystemModel getModel(EObject element) {
        EObject current = element;
        while (current != null) {
            if (current instanceof UnifiedSystemModel) {
                return (UnifiedSystemModel) current;
            }
            current = current.eContainer();
        }
        return null;
    }
    
    private void showInfo(String title, String message) {
        Display.getDefault().asyncExec(() -> {
            MessageDialog.openInformation(Display.getDefault().getActiveShell(), title, message);
        });
    }
    
    private void showError(String message) {
        Display.getDefault().asyncExec(() -> {
            MessageDialog.openError(Display.getDefault().getActiveShell(), "Error", message);
        });
    }
}