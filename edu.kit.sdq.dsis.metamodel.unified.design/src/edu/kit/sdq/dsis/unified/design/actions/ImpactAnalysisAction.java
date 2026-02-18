package edu.kit.sdq.dsis.unified.design.actions;

import java.util.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.swt.widgets.Display;

import unified.*;

/**
 * Impact Analysis Action - NEW for Requirements Support
 * Analyzes the impact of changes to requirements, blocks, hazards, and FMEA items.
 */
public class ImpactAnalysisAction extends AbstractExternalJavaAction {

    @Override
    public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
        if (selections == null || selections.isEmpty()) {
            showError("No Selection", "Please select an element for impact analysis.");
            return;
        }

        EObject firstSelection = selections.iterator().next();
        EObject semanticElement = getSemanticElement(firstSelection);

        if (semanticElement == null) {
            showError("Invalid Selection", "Could not determine semantic element.");
            return;
        }

        UnifiedSystemModel model = getUnifiedSystemModel(semanticElement);
        if (model == null) {
            showError("Invalid Model", "Could not find UnifiedSystemModel.");
            return;
        }

        analyzeImpact(semanticElement, model);
    }

    private void analyzeImpact(EObject element, UnifiedSystemModel model) {
        StringBuilder report = new StringBuilder();
        report.append("\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\n");
        report.append("       IMPACT ANALYSIS REPORT\n");
        report.append("\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\n\n");

        String elementName = getElementName(element);
        String elementType = element.eClass().getName();
        report.append("Analyzing: " + elementName + " [" + elementType + "]\n\n");

        Set<EObject> impactedElements = new HashSet<>();

        if (element instanceof Requirement) {
            analyzeRequirementImpact((Requirement) element, model, impactedElements, report);
        } else if (element instanceof SafetyCriticalBlock) {
            analyzeBlockImpact((SafetyCriticalBlock) element, model, impactedElements, report);
        } else if (element instanceof IntegratedHazard) {
            analyzeHazardImpact((IntegratedHazard) element, model, impactedElements, report);
        } else if (element instanceof FMEAItem) {
            analyzeFMEAItemImpact((FMEAItem) element, model, impactedElements, report);
        } else if (element instanceof BlockFailureMode) {
            analyzeFailureModeImpact((BlockFailureMode) element, model, impactedElements, report);
        } else {
            report.append("Impact analysis not supported for this element type.\n");
        }

        report.append("\n\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\u2550\n");
        report.append("Total Impacted Elements: " + impactedElements.size() + "\n");

        if (!impactedElements.isEmpty()) {
            report.append("\nRECOMMENDATION:\n");
            report.append("Review all impacted elements before making changes.\n");
            report.append("Update documentation and trace links as needed.\n");
        }

        showInfo("Impact Analysis", report.toString());
    }

    private void analyzeRequirementImpact(Requirement req, UnifiedSystemModel model,
                                          Set<EObject> impactedElements, StringBuilder report) {
        report.append("REQUIREMENT IMPACT ANALYSIS\n");
        report.append("-------------------------------\n");

        Object reqType  = RequirementTraceHelper.getRequirementType(req);
        Object priority = RequirementTraceHelper.getPriority(req);
        report.append("Type: " + (reqType != null ? reqType : "N/A") + "\n");
        report.append("Priority: " + (priority != null ? priority : "N/A") + "\n\n");

        List<SafetyCriticalBlock> relatedBlocks  = RequirementTraceHelper.getRelatedBlocks(req);
        List<IntegratedHazard>   relatedHazards  = RequirementTraceHelper.getRelatedHazards(req);

        report.append("DIRECTLY IMPACTED ELEMENTS:\n");

        if (!relatedBlocks.isEmpty()) {
            report.append("\n  Blocks (" + relatedBlocks.size() + "):\n");
            for (SafetyCriticalBlock block : relatedBlocks) {
                report.append("    - " + block.getName() + " [" + block.getAsilLevel() + "]\n");
                impactedElements.add(block);
            }
        }

        if (!relatedHazards.isEmpty()) {
            report.append("\n  Hazards (" + relatedHazards.size() + "):\n");
            for (IntegratedHazard hazard : relatedHazards) {
                report.append("    - " + hazard.getName() + " [" + hazard.getRiskLevel() + "]\n");
                impactedElements.add(hazard);
            }
        }

        List<FMEAItem> relatedFMEA = new ArrayList<>();
        for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
            for (FMEAItem item : analysis.getFmeaItems()) {
                if (RequirementTraceHelper.getRelatedRequirements(item).contains(req)) {
                    relatedFMEA.add(item);
                    impactedElements.add(item);
                }
            }
        }

        if (!relatedFMEA.isEmpty()) {
            report.append("\n  FMEA Items (" + relatedFMEA.size() + "):\n");
            for (FMEAItem item : relatedFMEA) {
                int rpn = item.getSeverity() * item.getOccurrence() * item.getDetection();
                report.append("    - " + item.getName() + " [RPN: " + rpn + "]\n");
            }
        }

        report.append("\nINDIRECTLY IMPACTED ELEMENTS:\n");
        Set<BlockFailureMode> indirectFMs    = new HashSet<>();
        Set<BlockConnection>  indirectConns  = new HashSet<>();

        for (SafetyCriticalBlock block : relatedBlocks) {
            indirectFMs.addAll(block.getFailureModes());
            indirectConns.addAll(block.getConnectionAsSource());
            indirectConns.addAll(block.getConnectionAsTarget());
        }

        if (!indirectFMs.isEmpty()) {
            report.append("\n  Failure Modes (" + indirectFMs.size() + "):\n");
            for (BlockFailureMode fm : indirectFMs) {
                report.append("    - " + fm.getName() + "\n");
                impactedElements.add(fm);
            }
        }

        if (!indirectConns.isEmpty()) {
            report.append("\n  Block Connections (" + indirectConns.size() + "):\n");
            impactedElements.addAll(indirectConns);
        }

        report.append("\nIMPACT SUMMARY:\n");
        report.append("  - Changing this requirement affects " + impactedElements.size() + " elements\n");
        if (priority != null && priority.toString().equals("HIGH")) {
            report.append("  - HIGH priority - requires careful change management\n");
        }
        if (!relatedFMEA.isEmpty()) {
            report.append("  - Impacts FMEA analysis - may require re-evaluation\n");
        }
    }

    private void analyzeBlockImpact(SafetyCriticalBlock block, UnifiedSystemModel model,
                                    Set<EObject> impactedElements, StringBuilder report) {
        report.append("BLOCK IMPACT ANALYSIS\n");
        report.append("-------------------------------\n");
        report.append("ASIL Level: " + block.getAsilLevel() + "\n");
        report.append("Safety Criticality: " + block.getSafetyCriticality() + "\n\n");
        report.append("DIRECTLY IMPACTED ELEMENTS:\n");

        List<Requirement> relatedReqs = new ArrayList<>();
        for (Requirement req : RequirementTraceHelper.getRequirements(model)) {
            if (RequirementTraceHelper.getRelatedBlocks(req).contains(block)) {
                relatedReqs.add(req);
                impactedElements.add(req);
            }
        }

        if (!relatedReqs.isEmpty()) {
            report.append("\n  Requirements (" + relatedReqs.size() + "):\n");
            for (Requirement req : relatedReqs) {
                Object priority = RequirementTraceHelper.getPriority(req);
                report.append("    - " + req.getId() + ": " + req.getName() +
                    " [" + (priority != null ? priority : "N/A") + "]\n");
            }
        }

        List<IntegratedHazard> relatedHazards = new ArrayList<>();
        for (IntegratedHazard hazard : model.getGlobalHazards()) {
            if (hazard.getRelatedBlocks().contains(block)) {
                relatedHazards.add(hazard);
                impactedElements.add(hazard);
            }
        }

        if (!relatedHazards.isEmpty()) {
            report.append("\n  Hazards (" + relatedHazards.size() + "):\n");
            for (IntegratedHazard hazard : relatedHazards) {
                report.append("    - " + hazard.getName() + " [" + hazard.getRiskLevel() + "]\n");
            }
        }

        List<FMEAItem> relatedFMEA = new ArrayList<>();
        for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
            for (FMEAItem item : analysis.getFmeaItems()) {
                if (item.getAnalyzedComponent() == block) {
                    relatedFMEA.add(item);
                    impactedElements.add(item);
                }
            }
        }

        if (!relatedFMEA.isEmpty()) {
            report.append("\n  FMEA Items (" + relatedFMEA.size() + "):\n");
            for (FMEAItem item : relatedFMEA) {
                int rpn = item.getSeverity() * item.getOccurrence() * item.getDetection();
                report.append("    - " + item.getName() + " [RPN: " + rpn + "]\n");
            }
        }

        if (!block.getFailureModes().isEmpty()) {
            report.append("\n  Failure Modes (" + block.getFailureModes().size() + "):\n");
            for (BlockFailureMode fm : block.getFailureModes()) {
                report.append("    - " + fm.getName() + "\n");
                impactedElements.add(fm);
            }
        }

        Set<BlockConnection> allConns = new HashSet<>();
        allConns.addAll(block.getConnectionAsSource());
        allConns.addAll(block.getConnectionAsTarget());
        if (!allConns.isEmpty()) {
            report.append("\n  Block Connections (" + allConns.size() + "):\n");
            impactedElements.addAll(allConns);
        }

        report.append("\nIMPACT SUMMARY:\n");
        report.append("  - Changing this block affects " + impactedElements.size() + " elements\n");
        if (block.getSafetyCriticality() == SafetyCriticalityLevel.HIGH ||
            block.getSafetyCriticality() == SafetyCriticalityLevel.CRITICAL) {
            report.append("  - HIGH/CRITICAL safety criticality - requires safety review\n");
        }
        if (!relatedReqs.isEmpty()) {
            report.append("  - Impacts " + relatedReqs.size() + " requirement(s) - verify compliance\n");
        }
    }

    private void analyzeHazardImpact(IntegratedHazard hazard, UnifiedSystemModel model,
                                     Set<EObject> impactedElements, StringBuilder report) {
        report.append("HAZARD IMPACT ANALYSIS\n");
        report.append("-------------------------------\n");
        report.append("Risk Level: " + hazard.getRiskLevel() + "\n");
        report.append("Mitigation Status: " + hazard.getMitigationStatus() + "\n\n");
        report.append("DIRECTLY IMPACTED ELEMENTS:\n");

        List<Requirement> relatedReqs = new ArrayList<>();
        for (Requirement req : RequirementTraceHelper.getRequirements(model)) {
            if (RequirementTraceHelper.getRelatedHazards(req).contains(hazard)) {
                relatedReqs.add(req);
                impactedElements.add(req);
            }
        }

        if (!relatedReqs.isEmpty()) {
            report.append("\n  Requirements (" + relatedReqs.size() + "):\n");
            for (Requirement req : relatedReqs) {
                report.append("    - " + req.getId() + ": " + req.getName() + "\n");
            }
        }

        if (!hazard.getRelatedBlocks().isEmpty()) {
            report.append("\n  Blocks (" + hazard.getRelatedBlocks().size() + "):\n");
            for (SafetyCriticalBlock block : hazard.getRelatedBlocks()) {
                report.append("    - " + block.getName() + " [" + block.getAsilLevel() + "]\n");
                impactedElements.add(block);
            }
        }

        List<FMEAItem> relatedFMEA = new ArrayList<>();
        for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
            for (FMEAItem item : analysis.getFmeaItems()) {
                if (item.getRelatedHazards().contains(hazard)) {
                    relatedFMEA.add(item);
                    impactedElements.add(item);
                }
            }
        }

        if (!relatedFMEA.isEmpty()) {
            report.append("\n  FMEA Items (" + relatedFMEA.size() + "):\n");
            for (FMEAItem item : relatedFMEA) {
                int rpn = item.getSeverity() * item.getOccurrence() * item.getDetection();
                report.append("    - " + item.getName() + " [RPN: " + rpn + "]\n");
            }
        }

        report.append("\nIMPACT SUMMARY:\n");
        report.append("  - Changing this hazard affects " + impactedElements.size() + " elements\n");
        if (hazard.getRiskLevel() == RiskLevel.CATASTROPHIC ||
            hazard.getRiskLevel() == RiskLevel.CRITICAL_RISK) {
            report.append("  - CATASTROPHIC/CRITICAL risk - requires safety board approval\n");
        }
        if (!relatedReqs.isEmpty()) {
            report.append("  - Impacts " + relatedReqs.size() + " requirement(s)\n");
        }
    }

    private void analyzeFMEAItemImpact(FMEAItem item, UnifiedSystemModel model,
                                       Set<EObject> impactedElements, StringBuilder report) {
        report.append("FMEA ITEM IMPACT ANALYSIS\n");
        report.append("-------------------------------\n");

        int rpn = item.getSeverity() * item.getOccurrence() * item.getDetection();
        report.append("RPN: " + rpn + " (S:" + item.getSeverity() +
            " x O:" + item.getOccurrence() + " x D:" + item.getDetection() + ")\n");
        report.append("Action Status: " + item.getActionStatus() + "\n\n");
        report.append("DIRECTLY IMPACTED ELEMENTS:\n");

        List<Requirement> relatedReqs = RequirementTraceHelper.getRelatedRequirements(item);
        if (!relatedReqs.isEmpty()) {
            report.append("\n  Requirements (" + relatedReqs.size() + "):\n");
            for (Requirement req : relatedReqs) {
                report.append("    - " + req.getId() + ": " + req.getName() + "\n");
                impactedElements.add(req);
            }
        }

        if (item.getAnalyzedComponent() != null) {
            SafetyCriticalBlock block = item.getAnalyzedComponent();
            report.append("\n  Analyzed Component:\n");
            report.append("    - " + block.getName() + " [" + block.getAsilLevel() + "]\n");
            impactedElements.add(block);
        }

        if (item.getFailureMode() != null) {
            report.append("\n  Failure Mode:\n");
            report.append("    - " + item.getFailureMode().getName() + "\n");
            impactedElements.add(item.getFailureMode());
        }

        if (!item.getRelatedHazards().isEmpty()) {
            report.append("\n  Hazards (" + item.getRelatedHazards().size() + "):\n");
            for (IntegratedHazard hazard : item.getRelatedHazards()) {
                report.append("    - " + hazard.getName() + " [" + hazard.getRiskLevel() + "]\n");
                impactedElements.add(hazard);
            }
        }

        report.append("\nIMPACT SUMMARY:\n");
        report.append("  - Changing this FMEA item affects " + impactedElements.size() + " elements\n");
        if (rpn > 100) {
            report.append("  - High RPN - changes require safety review\n");
        }
        if (!relatedReqs.isEmpty()) {
            report.append("  - Impacts " + relatedReqs.size() + " requirement(s)\n");
        }
    }

    private void analyzeFailureModeImpact(BlockFailureMode fm, UnifiedSystemModel model,
                                          Set<EObject> impactedElements, StringBuilder report) {
        report.append("FAILURE MODE IMPACT ANALYSIS\n");
        report.append("-------------------------------\n");
        report.append("Failure Rate: " + fm.getFailureRate() + "\n\n");
        report.append("DIRECTLY IMPACTED ELEMENTS:\n");

        if (fm.getAffectedBlock() != null) {
            report.append("\n  Affected Block:\n");
            report.append("    - " + fm.getAffectedBlock().getName() + "\n");
            impactedElements.add(fm.getAffectedBlock());
        }

        List<FMEAItem> relatedFMEA = new ArrayList<>();
        for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
            for (FMEAItem item : analysis.getFmeaItems()) {
                if (item.getFailureMode() == fm) {
                    relatedFMEA.add(item);
                    impactedElements.add(item);
                }
            }
        }

        if (!relatedFMEA.isEmpty()) {
            report.append("\n  FMEA Items (" + relatedFMEA.size() + "):\n");
            for (FMEAItem item : relatedFMEA) {
                int rpn = item.getSeverity() * item.getOccurrence() * item.getDetection();
                report.append("    - " + item.getName() + " [RPN: " + rpn + "]\n");
            }
        }

        report.append("\nIMPACT SUMMARY:\n");
        report.append("  - Changing this failure mode affects " + impactedElements.size() + " elements\n");
        if (!relatedFMEA.isEmpty()) {
            report.append("  - Impacts " + relatedFMEA.size() + " FMEA item(s) - RPN may change\n");
        }
    }

    private String getElementName(EObject element) {
        if (element instanceof UnifiedElement) {
            String name = ((UnifiedElement) element).getName();
            return name != null ? name : "<unnamed>";
        }
        return element.eClass().getName();
    }

    private EObject getSemanticElement(EObject obj) {
        if (obj instanceof DDiagramElement) {
            EObject target = ((DDiagramElement) obj).getTarget();
            if (target != null) return target;
        }
        if (obj instanceof DSemanticDecorator)
            return ((DSemanticDecorator) obj).getTarget();
        return obj;
    }

    private UnifiedSystemModel getUnifiedSystemModel(EObject obj) {
        if (obj instanceof UnifiedSystemModel) return (UnifiedSystemModel) obj;
        if (obj.eContainer() != null) return getUnifiedSystemModel(obj.eContainer());
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