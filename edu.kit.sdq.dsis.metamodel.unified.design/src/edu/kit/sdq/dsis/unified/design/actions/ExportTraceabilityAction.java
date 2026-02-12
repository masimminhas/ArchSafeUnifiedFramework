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
import unified.BlockConnection;
import unified.BlockFailureMode;
import unified.IntegratedHazard;
import unified.SystemBlock;

/**
 * Export Traceability Matrix Action
 * Generates a comprehensive traceability matrix in CSV or Excel format
 * showing all trace links between Architecture, Safety, and FMEA elements.
 */
public class ExportTraceabilityAction extends AbstractExternalJavaAction {

    @Override
    public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
        if (selections == null || selections.isEmpty()) {
            showError("No model selected", "Please select a UnifiedSystemModel to export traceability matrix.");
            return;
        }

        EObject firstSelection = selections.iterator().next();
        UnifiedSystemModel model = getUnifiedSystemModel(firstSelection);

        if (model == null) {
            showError("Invalid Selection", "Please select a valid UnifiedSystemModel.");
            return;
        }

        // Prompt user for file location
        Shell shell = Display.getDefault().getActiveShell();
        FileDialog dialog = new FileDialog(shell, SWT.SAVE);
        dialog.setFilterNames(new String[] { "CSV Files (*.csv)", "All Files (*.*)" });
        dialog.setFilterExtensions(new String[] { "*.csv", "*.*" });
        dialog.setFileName("TraceabilityMatrix_" + new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) + ".csv");
        
        String filePath = dialog.open();
        if (filePath == null) {
            return; // User cancelled
        }

        try {
            exportTraceabilityMatrix(model, filePath);
            showInfo("Export Successful", 
                "Traceability matrix exported successfully to:\n" + filePath);
        } catch (IOException e) {
            showError("Export Failed", "Failed to export traceability matrix: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void exportTraceabilityMatrix(UnifiedSystemModel model, String filePath) throws IOException {
        FileWriter writer = new FileWriter(filePath);
        
        // Write header
        writer.append("Source Type,Source ID,Source Name,Relationship,Target Type,Target ID,Target Name,Additional Info\n");
        
        // 1. Hazard → Block traces
        for (IntegratedHazard hazard : model.getGlobalHazards()) {
            for (SafetyCriticalBlock block : hazard.getRelatedBlocks()) {
                writer.append(String.format("%s,%s,%s,%s,%s,%s,%s,%s\n",
                    "Hazard",
                    escapeCsv(hazard.getId()),
                    escapeCsv(hazard.getName()),
                    "threatens",
                    "SafetyCriticalBlock",
                    escapeCsv(block.getId()),
                    escapeCsv(block.getName()),
                    "Risk: " + hazard.getRiskLevel()
                ));
            }
        }
        
        // 2. FMEA Item → Component traces
        for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
            for (FMEAItem item : analysis.getFmeaItems()) {
                if (item.getAnalyzedComponent() != null) {
                    SafetyCriticalBlock component = item.getAnalyzedComponent();
                    int rpn = item.getSeverity() * item.getOccurrence() * item.getDetection();
                    
                    writer.append(String.format("%s,%s,%s,%s,%s,%s,%s,%s\n",
                        "FMEAItem",
                        escapeCsv(item.getId()),
                        escapeCsv(item.getName()),
                        "analyzes",
                        "SafetyCriticalBlock",
                        escapeCsv(component.getId()),
                        escapeCsv(component.getName()),
                        "RPN: " + rpn
                    ));
                }
            }
        }
        
        // 3. FMEA Item → Failure Mode traces
        for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
            for (FMEAItem item : analysis.getFmeaItems()) {
                if (item.getFailureMode() != null) {
                    BlockFailureMode fm = item.getFailureMode();
                    
                    writer.append(String.format("%s,%s,%s,%s,%s,%s,%s,%s\n",
                        "FMEAItem",
                        escapeCsv(item.getId()),
                        escapeCsv(item.getName()),
                        "addresses",
                        "FailureMode",
                        escapeCsv(fm.getId()),
                        escapeCsv(fm.getName()),
                        "Rate: " + fm.getFailureRate()
                    ));
                }
            }
        }
        
        // 4. FMEA Item → Hazard traces
        for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
            for (FMEAItem item : analysis.getFmeaItems()) {
                for (IntegratedHazard hazard : item.getRelatedHazards()) {
                    writer.append(String.format("%s,%s,%s,%s,%s,%s,%s,%s\n",
                        "FMEAItem",
                        escapeCsv(item.getId()),
                        escapeCsv(item.getName()),
                        "mitigates",
                        "Hazard",
                        escapeCsv(hazard.getId()),
                        escapeCsv(hazard.getName()),
                        "Status: " + item.getActionStatus()
                    ));
                }
            }
        }
        
        // 5. Failure Mode → Block traces
        for (SafetyCriticalBlock block : model.getRootBlocks()) {
            for (BlockFailureMode fm : block.getFailureModes()) {
                writer.append(String.format("%s,%s,%s,%s,%s,%s,%s,%s\n",
                    "FailureMode",
                    escapeCsv(fm.getId()),
                    escapeCsv(fm.getName()),
                    "affects",
                    "SafetyCriticalBlock",
                    escapeCsv(block.getId()),
                    escapeCsv(block.getName()),
                    "ASIL: " + block.getAsilLevel()
                ));
            }
        }
        
        // 6. Block Connections (Architecture traces)
        for (BlockConnection conn : model.getBlockConnections()) {
            for (SystemBlock from : conn.getFromBlock()) {
                for (SystemBlock to : conn.getToBlock()) {
                    writer.append(String.format("%s,%s,%s,%s,%s,%s,%s,%s\n",
                        "Block",
                        escapeCsv(from.getId()),
                        escapeCsv(from.getName()),
                        conn.getConnectionType().toString(),
                        "Block",
                        escapeCsv(to.getId()),
                        escapeCsv(to.getName()),
                        "Connection: " + conn.getName()
                    ));
                }
            }
        }
        
        writer.flush();
        writer.close();
    }

    private String escapeCsv(String value) {
        if (value == null) return "";
        if (value.contains(",") || value.contains("\"") || value.contains("\n")) {
            return "\"" + value.replace("\"", "\"\"") + "\"";
        }
        return value;
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
        Display.getDefault().syncExec(() -> 
            MessageDialog.openInformation(Display.getDefault().getActiveShell(), title, message)
        );
    }

    @Override
    public boolean canExecute(Collection<? extends EObject> selections) {
        return selections != null && !selections.isEmpty();
    }
}
