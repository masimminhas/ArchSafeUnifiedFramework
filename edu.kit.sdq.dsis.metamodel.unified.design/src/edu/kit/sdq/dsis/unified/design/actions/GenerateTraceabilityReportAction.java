package edu.kit.sdq.dsis.unified.design.actions;

import java.io.BufferedWriter;
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

import unified.*;

/**
 * Generate Traceability Report Action - UPDATED to support Requirements
 * Generates a comprehensive traceability matrix including requirements elements.
 */
public class GenerateTraceabilityReportAction extends AbstractExternalJavaAction {

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

        Shell shell = Display.getDefault().getActiveShell();
        FileDialog dialog = new FileDialog(shell, SWT.SAVE);
        dialog.setFilterNames(new String[] { "CSV Files (*.csv)", "All Files (*.*)" });
        dialog.setFilterExtensions(new String[] { "*.csv", "*.*" });
        dialog.setFileName("TraceabilityReport_" +
            new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) + ".csv");

        String filePath = dialog.open();
        if (filePath == null) return;

        try {
            exportTraceabilityReport(model, filePath);
            showInfo("Export Successful",
                "Traceability report exported successfully to:\n" + filePath);
        } catch (IOException e) {
            showError("Export Failed", "Failed to export traceability report: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void exportTraceabilityReport(UnifiedSystemModel model, String filePath)
            throws IOException {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {

            writer.write("=== TRACEABILITY REPORT ===\n");
            writer.write("Generated: " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) + "\n\n");

            // Summary Section
            writer.write("=== SUMMARY ===\n");

            int requirementToBlockLinks  = countRequirementToBlockLinks(model);
            int requirementToHazardLinks = countRequirementToHazardLinks(model);
            int requirementToFMEALinks   = countRequirementToFMEALinks(model);
            int hazardToBlockLinks       = countHazardToBlockLinks(model);
            int fmeaToComponentLinks     = countFMEAToComponentLinks(model);
            int fmeaToFailureModeLinks   = countFMEAToFailureModeLinks(model);
            int fmeaToHazardLinks        = countFMEAToHazardLinks(model);
            int failureModeToBlockLinks  = countFailureModeToBlockLinks(model);
            int blockConnectionLinks     = model.getBlockConnections().size();

            int totalLinks = requirementToBlockLinks + requirementToHazardLinks + requirementToFMEALinks
                    + hazardToBlockLinks + fmeaToComponentLinks + fmeaToFailureModeLinks
                    + fmeaToHazardLinks + failureModeToBlockLinks + blockConnectionLinks;

            writer.write("Total Trace Links," + totalLinks + "\n");
            writer.write("Requirement \u2192 Block Links," + requirementToBlockLinks + "\n");
            writer.write("Requirement \u2192 Hazard Links," + requirementToHazardLinks + "\n");
            writer.write("Requirement \u2192 FMEA Links," + requirementToFMEALinks + "\n");
            writer.write("Hazard \u2192 Block Links," + hazardToBlockLinks + "\n");
            writer.write("FMEA \u2192 Component Links," + fmeaToComponentLinks + "\n");
            writer.write("FMEA \u2192 Failure Mode Links," + fmeaToFailureModeLinks + "\n");
            writer.write("FMEA \u2192 Hazard Links," + fmeaToHazardLinks + "\n");
            writer.write("Failure Mode \u2192 Block Links," + failureModeToBlockLinks + "\n");
            writer.write("Block Connection Links," + blockConnectionLinks + "\n\n\n");

            // Detailed Traceability Matrix
            writer.write("=== TRACEABILITY MATRIX ===\n");
            writer.write("Source Type,Source ID,Source Name,Relationship,Target Type,Target ID,Target Name,Additional Info\n");

            // 1. Requirement -> Block traces
            for (Requirement req : RequirementTraceHelper.getRequirements(model)) {
                Object reqType = RequirementTraceHelper.getRequirementType(req);
                for (SafetyCriticalBlock block : RequirementTraceHelper.getRelatedBlocks(req)) {
                    writer.write(String.format("%s,%s,%s,%s,%s,%s,%s,%s\n",
                        "Requirement", escapeCsv(req.getId()), escapeCsv(req.getName()),
                        "traces to", "SafetyCriticalBlock",
                        escapeCsv(block.getId()), escapeCsv(block.getName()),
                        "Type: " + (reqType != null ? reqType : "N/A")
                    ));
                }
            }

            // 2. Requirement -> Hazard traces
            for (Requirement req : RequirementTraceHelper.getRequirements(model)) {
                for (IntegratedHazard hazard : RequirementTraceHelper.getRelatedHazards(req)) {
                    writer.write(String.format("%s,%s,%s,%s,%s,%s,%s,%s\n",
                        "Requirement", escapeCsv(req.getId()), escapeCsv(req.getName()),
                        "addresses", "Hazard",
                        escapeCsv(hazard.getId()), escapeCsv(hazard.getName()),
                        "Risk: " + hazard.getRiskLevel()
                    ));
                }
            }

            // 3. Requirement <- FMEA traces
            for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
                for (FMEAItem item : analysis.getFmeaItems()) {
                    for (Requirement req : RequirementTraceHelper.getRelatedRequirements(item)) {
                        writer.write(String.format("%s,%s,%s,%s,%s,%s,%s,%s\n",
                            "Requirement", escapeCsv(req.getId()), escapeCsv(req.getName()),
                            "satisfied by", "FMEAItem",
                            escapeCsv(item.getId()), escapeCsv(item.getName()),
                            "RPN: " + (item.getSeverity() * item.getOccurrence() * item.getDetection())
                        ));
                    }
                }
            }

            // 4. Hazard -> Block traces
            for (IntegratedHazard hazard : model.getGlobalHazards()) {
                for (SafetyCriticalBlock block : hazard.getRelatedBlocks()) {
                    writer.write(String.format("%s,%s,%s,%s,%s,%s,%s,%s\n",
                        "Hazard", escapeCsv(hazard.getId()), escapeCsv(hazard.getName()),
                        "threatens", "SafetyCriticalBlock",
                        escapeCsv(block.getId()), escapeCsv(block.getName()),
                        "Risk: " + hazard.getRiskLevel()
                    ));
                }
            }

            // 5. FMEA Item -> Component traces
            for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
                for (FMEAItem item : analysis.getFmeaItems()) {
                    if (item.getAnalyzedComponent() != null) {
                        SafetyCriticalBlock component = item.getAnalyzedComponent();
                        int rpn = item.getSeverity() * item.getOccurrence() * item.getDetection();
                        writer.write(String.format("%s,%s,%s,%s,%s,%s,%s,%s\n",
                            "FMEAItem", escapeCsv(item.getId()), escapeCsv(item.getName()),
                            "analyzes", "SafetyCriticalBlock",
                            escapeCsv(component.getId()), escapeCsv(component.getName()),
                            "RPN: " + rpn
                        ));
                    }
                }
            }

            // 6. FMEA Item -> Failure Mode traces
            for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
                for (FMEAItem item : analysis.getFmeaItems()) {
                    if (item.getFailureMode() != null) {
                        BlockFailureMode fm = item.getFailureMode();
                        writer.write(String.format("%s,%s,%s,%s,%s,%s,%s,%s\n",
                            "FMEAItem", escapeCsv(item.getId()), escapeCsv(item.getName()),
                            "addresses", "FailureMode",
                            escapeCsv(fm.getId()), escapeCsv(fm.getName()),
                            "Rate: " + fm.getFailureRate()
                        ));
                    }
                }
            }

            // 7. FMEA Item -> Hazard traces
            for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
                for (FMEAItem item : analysis.getFmeaItems()) {
                    for (IntegratedHazard hazard : item.getRelatedHazards()) {
                        writer.write(String.format("%s,%s,%s,%s,%s,%s,%s,%s\n",
                            "FMEAItem", escapeCsv(item.getId()), escapeCsv(item.getName()),
                            "mitigates", "Hazard",
                            escapeCsv(hazard.getId()), escapeCsv(hazard.getName()),
                            "Status: " + item.getActionStatus()
                        ));
                    }
                }
            }

            // 8. Failure Mode -> Block traces
            for (SafetyCriticalBlock block : model.getRootBlocks()) {
                for (BlockFailureMode fm : block.getFailureModes()) {
                    writer.write(String.format("%s,%s,%s,%s,%s,%s,%s,%s\n",
                        "FailureMode", escapeCsv(fm.getId()), escapeCsv(fm.getName()),
                        "affects", "SafetyCriticalBlock",
                        escapeCsv(block.getId()), escapeCsv(block.getName()),
                        "ASIL: " + block.getAsilLevel()
                    ));
                }
            }

            // 9. Block Connections
            for (BlockConnection conn : model.getBlockConnections()) {
                for (SystemBlock from : conn.getFromBlock()) {
                    for (SystemBlock to : conn.getToBlock()) {
                        writer.write(String.format("%s,%s,%s,%s,%s,%s,%s,%s\n",
                            "Block", escapeCsv(from.getId()), escapeCsv(from.getName()),
                            conn.getConnectionType().toString(), "Block",
                            escapeCsv(to.getId()), escapeCsv(to.getName()),
                            "Connection: " + conn.getName()
                        ));
                    }
                }
            }

            writer.write("\n\n");

            // Requirements Coverage Analysis
            writer.write("=== REQUIREMENTS COVERAGE ANALYSIS ===\n");
            writer.write("Requirement ID,Requirement Name,Type,Priority,Block Links,Hazard Links,FMEA Links,Total Links,Coverage Status\n");

            for (Requirement req : RequirementTraceHelper.getRequirements(model)) {
                int blockLinks  = RequirementTraceHelper.getRelatedBlocks(req).size();
                int hazardLinks = RequirementTraceHelper.getRelatedHazards(req).size();
                int fmeaLinks   = RequirementTraceHelper.countFMEALinksForRequirement(model, req);
                int totalReqLinks = blockLinks + hazardLinks + fmeaLinks;

                String coverageStatus = totalReqLinks == 0 ? "NOT TRACED" :
                                        totalReqLinks < 3  ? "PARTIAL"    : "WELL TRACED";

                Object reqType  = RequirementTraceHelper.getRequirementType(req);
                Object priority = RequirementTraceHelper.getPriority(req);

                writer.write(String.format("%s,%s,%s,%s,%d,%d,%d,%d,%s\n",
                    escapeCsv(req.getId()), escapeCsv(req.getName()),
                    reqType  != null ? reqType.toString()  : "N/A",
                    priority != null ? priority.toString() : "N/A",
                    blockLinks, hazardLinks, fmeaLinks, totalReqLinks, coverageStatus
                ));
            }
        }
    }

    // ---- Counting helpers ----

    private int countRequirementToBlockLinks(UnifiedSystemModel model) {
        int count = 0;
        for (Requirement req : RequirementTraceHelper.getRequirements(model))
            count += RequirementTraceHelper.getRelatedBlocks(req).size();
        return count;
    }

    private int countRequirementToHazardLinks(UnifiedSystemModel model) {
        int count = 0;
        for (Requirement req : RequirementTraceHelper.getRequirements(model))
            count += RequirementTraceHelper.getRelatedHazards(req).size();
        return count;
    }

    private int countRequirementToFMEALinks(UnifiedSystemModel model) {
        int count = 0;
        for (FMEAAnalysis analysis : model.getFmeaAnalysis())
            for (FMEAItem item : analysis.getFmeaItems())
                count += RequirementTraceHelper.getRelatedRequirements(item).size();
        return count;
    }

    private int countHazardToBlockLinks(UnifiedSystemModel model) {
        int count = 0;
        for (IntegratedHazard hazard : model.getGlobalHazards())
            count += hazard.getRelatedBlocks().size();
        return count;
    }

    private int countFMEAToComponentLinks(UnifiedSystemModel model) {
        int count = 0;
        for (FMEAAnalysis analysis : model.getFmeaAnalysis())
            for (FMEAItem item : analysis.getFmeaItems())
                if (item.getAnalyzedComponent() != null) count++;
        return count;
    }

    private int countFMEAToFailureModeLinks(UnifiedSystemModel model) {
        int count = 0;
        for (FMEAAnalysis analysis : model.getFmeaAnalysis())
            for (FMEAItem item : analysis.getFmeaItems())
                if (item.getFailureMode() != null) count++;
        return count;
    }

    private int countFMEAToHazardLinks(UnifiedSystemModel model) {
        int count = 0;
        for (FMEAAnalysis analysis : model.getFmeaAnalysis())
            for (FMEAItem item : analysis.getFmeaItems())
                count += item.getRelatedHazards().size();
        return count;
    }

    private int countFailureModeToBlockLinks(UnifiedSystemModel model) {
        int count = 0;
        for (SafetyCriticalBlock block : model.getRootBlocks())
            count += block.getFailureModes().size();
        return count;
    }

    private String escapeCsv(String value) {
        if (value == null) return "";
        if (value.contains(",") || value.contains("\"") || value.contains("\n"))
            return "\"" + value.replace("\"", "\"\"") + "\"";
        return value;
    }

    private UnifiedSystemModel getUnifiedSystemModel(EObject obj) {
        if (obj instanceof UnifiedSystemModel) return (UnifiedSystemModel) obj;
        if (obj instanceof DSemanticDecorator)
            return getUnifiedSystemModel(((DSemanticDecorator) obj).getTarget());
        if (obj.eContainer() != null)
            return getUnifiedSystemModel(obj.eContainer());
        return null;
    }

    private void showError(String title, String message) {
        Display.getDefault().syncExec(() ->
            MessageDialog.openError(Display.getDefault().getActiveShell(), title, message)
        );
    }

    private void showInfo(String title, String message) {
        Display.getDefault().syncExec(() ->
            MessageDialog.openInformation(Display.getDefault().getActiveShell(), title, message)
        );
    }

    @Override
    public boolean canExecute(Collection<? extends EObject> selections) {
        return selections != null && !selections.isEmpty();
    }
}