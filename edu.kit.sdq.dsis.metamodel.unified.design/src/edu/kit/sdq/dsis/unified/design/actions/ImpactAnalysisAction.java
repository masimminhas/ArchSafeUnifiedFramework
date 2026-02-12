package edu.kit.sdq.dsis.unified.design.actions;

import java.util.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.swt.widgets.Display;

import unified.*;

public class ImpactAnalysisAction extends AbstractExternalJavaAction {

    @Override
    public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
        if (selections == null || selections.isEmpty()) {
            showError("No Selection", "Please select an element to analyze impact.");
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

        // Compute impact
        Set<EObject> impactedElements = computeImpact(semanticElement, model);
        
        // Show results
        showImpactAnalysis(semanticElement, impactedElements);
    }

    private Set<EObject> computeImpact(EObject element, UnifiedSystemModel model) {
        Set<EObject> impacted = new HashSet<>();
        Set<EObject> visited = new HashSet<>();
        
        computeImpactRecursive(element, model, impacted, visited);
        
        return impacted;
    }

    private void computeImpactRecursive(EObject element, UnifiedSystemModel model, 
                                       Set<EObject> impacted, Set<EObject> visited) {
        if (visited.contains(element)) return;
        visited.add(element);
        
        if (element instanceof SafetyCriticalBlock) {
            analyzeSafetyCriticalBlockImpact((SafetyCriticalBlock) element, model, impacted, visited);
            
        } else if (element instanceof SystemBlock) {
            analyzeSystemBlockImpact((SystemBlock) element, model, impacted, visited);
            
        } else if (element instanceof IntegratedHazard) {
            analyzeHazardImpact((IntegratedHazard) element, model, impacted, visited);
            
        } else if (element instanceof FMEAItem) {
            analyzeFMEAItemImpact((FMEAItem) element, model, impacted, visited);
            
        } else if (element instanceof BlockFailureMode) {
            analyzeFailureModeImpact((BlockFailureMode) element, model, impacted, visited);
            
        } else if (element instanceof BlockConnection) {
            analyzeConnectionImpact((BlockConnection) element, model, impacted, visited);
        }
    }

    private void analyzeSafetyCriticalBlockImpact(SafetyCriticalBlock block, UnifiedSystemModel model,
                                                   Set<EObject> impacted, Set<EObject> visited) {
        // Impact on connected blocks (downstream)
        for (BlockConnection conn : block.getConnectionAsSource()) {
            for (SystemBlock target : conn.getToBlock()) {
                impacted.add(target);
                impacted.add(conn); // Connection itself is impacted
                computeImpactRecursive(target, model, impacted, visited);
            }
        }
        
        // Impact on blocks that connect TO this block (upstream)
        for (BlockConnection conn : block.getConnectionAsTarget()) {
            for (SystemBlock source : conn.getFromBlock()) {
                impacted.add(source);
                impacted.add(conn);
            }
        }
        
        // Impact on failure modes
        for (BlockFailureMode fm : block.getFailureModes()) {
            impacted.add(fm);
        }
        
        // Impact on FMEA items that analyze this block
        for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
            for (FMEAItem item : analysis.getFmeaItems()) {
                if (item.getAnalyzedComponent() == block) {
                    impacted.add(item);
                    impacted.add(analysis);
                }
            }
        }
        
        // Impact on hazards related to this block
        for (IntegratedHazard hazard : model.getGlobalHazards()) {
            if (hazard.getRelatedBlocks().contains(block)) {
                impacted.add(hazard);
            }
        }
    }

    private void analyzeSystemBlockImpact(SystemBlock block, UnifiedSystemModel model,
                                          Set<EObject> impacted, Set<EObject> visited) {
        // Impact on connected blocks
        for (BlockConnection conn : block.getConnectionAsSource()) {
            for (SystemBlock target : conn.getToBlock()) {
                impacted.add(target);
                impacted.add(conn);
                computeImpactRecursive(target, model, impacted, visited);
            }
        }
        
        for (BlockConnection conn : block.getConnectionAsTarget()) {
            for (SystemBlock source : conn.getFromBlock()) {
                impacted.add(source);
                impacted.add(conn);
            }
        }
    }

    private void analyzeHazardImpact(IntegratedHazard hazard, UnifiedSystemModel model,
                                     Set<EObject> impacted, Set<EObject> visited) {
        // Impact on related blocks
        for (SafetyCriticalBlock block : hazard.getRelatedBlocks()) {
            impacted.add(block);
            computeImpactRecursive(block, model, impacted, visited);
        }
        
        // Impact on FMEA items that reference this hazard
        for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
            for (FMEAItem item : analysis.getFmeaItems()) {
                if (item.getRelatedHazards().contains(hazard)) {
                    impacted.add(item);
                    impacted.add(analysis);
                }
            }
        }
    }

    private void analyzeFMEAItemImpact(FMEAItem item, UnifiedSystemModel model,
                                       Set<EObject> impacted, Set<EObject> visited) {
        // Impact on the component being analyzed
        if (item.getAnalyzedComponent() != null) {
            SafetyCriticalBlock component = item.getAnalyzedComponent();
            impacted.add(component);
            computeImpactRecursive(component, model, impacted, visited);
        }
        
        // Impact on the failure mode
        if (item.getFailureMode() != null) {
            BlockFailureMode fm = item.getFailureMode();
            impacted.add(fm);
            
            // Through failure mode to its parent block
            if (fm.getAffectedBlock() != null) {
                impacted.add(fm.getAffectedBlock());
            }
        }
        
        // Impact on related hazards
        for (IntegratedHazard hazard : item.getRelatedHazards()) {
            impacted.add(hazard);
            computeImpactRecursive(hazard, model, impacted, visited);
        }
        
        // Impact on parent FMEA Analysis
        if (item.eContainer() instanceof FMEAAnalysis) {
            impacted.add(item.eContainer());
        }
    }

    private void analyzeFailureModeImpact(BlockFailureMode fm, UnifiedSystemModel model,
                                          Set<EObject> impacted, Set<EObject> visited) {
        // Impact on parent block
        if (fm.getAffectedBlock() != null) {
            SafetyCriticalBlock block = fm.getAffectedBlock();
            impacted.add(block);
            computeImpactRecursive(block, model, impacted, visited);
        }
        
        // Impact on FMEA items that reference this failure mode
        for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
            for (FMEAItem item : analysis.getFmeaItems()) {
                if (item.getFailureMode() == fm) {
                    impacted.add(item);
                    impacted.add(analysis);
                }
            }
        }
    }

    private void analyzeConnectionImpact(BlockConnection conn, UnifiedSystemModel model,
                                         Set<EObject> impacted, Set<EObject> visited) {
        // Impact on source blocks
        for (SystemBlock source : conn.getFromBlock()) {
            impacted.add(source);
            computeImpactRecursive(source, model, impacted, visited);
        }
        
        // Impact on target blocks
        for (SystemBlock target : conn.getToBlock()) {
            impacted.add(target);
            computeImpactRecursive(target, model, impacted, visited);
        }
    }

    private void showImpactAnalysis(EObject source, Set<EObject> impacted) {
        StringBuilder report = new StringBuilder();
        report.append("═══════════════════════════════════════════════════\n");
        report.append("           CHANGE IMPACT ANALYSIS\n");
        report.append("═══════════════════════════════════════════════════\n\n");
        
        String sourceName = getElementName(source);
        String sourceType = source.eClass().getName();
        
        report.append("📍 Source Element:\n");
        report.append("   " + sourceName + " [" + sourceType + "]\n\n");
        
        report.append("📊 Total Impacted Elements: " + impacted.size() + "\n\n");
        
        if (impacted.isEmpty()) {
            report.append("✅ No other elements are directly impacted.\n");
            report.append("   This element can be modified with minimal risk.\n");
        } else {
            // Group by type
            Map<String, List<EObject>> byType = new HashMap<>();
            for (EObject elem : impacted) {
                String type = elem.eClass().getName();
                byType.computeIfAbsent(type, k -> new ArrayList<>()).add(elem);
            }
            
            report.append("⚠️  Impacted Elements by Type:\n");
            report.append("───────────────────────────────────────────────────\n");
            
            // Sort by type name for consistent output
            List<String> sortedTypes = new ArrayList<>(byType.keySet());
            Collections.sort(sortedTypes);
            
            for (String type : sortedTypes) {
                List<EObject> elements = byType.get(type);
                report.append(String.format("\n▶ %s (%d):\n", type, elements.size()));
                
                for (EObject elem : elements) {
                    report.append("  • " + getElementName(elem));
                    
                    // Add additional context
                    if (elem instanceof SafetyCriticalBlock) {
                        SafetyCriticalBlock block = (SafetyCriticalBlock) elem;
                        report.append(" [" + block.getAsilLevel() + "]");
                    } else if (elem instanceof IntegratedHazard) {
                        IntegratedHazard hazard = (IntegratedHazard) elem;
                        report.append(" [" + hazard.getRiskLevel() + "]");
                    } else if (elem instanceof FMEAItem) {
                        FMEAItem item = (FMEAItem) elem;
                        int rpn = item.getSeverity() * item.getOccurrence() * item.getDetection();
                        report.append(" [RPN: " + rpn + "]");
                    }
                    
                    report.append("\n");
                }
            }
            
            report.append("\n───────────────────────────────────────────────────\n");
            report.append("\n⚠️  RECOMMENDATION:\n");
            report.append("   Review all impacted elements before making changes.\n");
            report.append("   Changes may require updates to:\n");
            report.append("   - Safety analysis (hazards, FMEA)\n");
            report.append("   - Dependent components\n");
            report.append("   - System documentation\n");
        }
        
        report.append("\n═══════════════════════════════════════════════════\n");
        
        showInfo("Change Impact Analysis", report.toString());
    }

    private String getElementName(EObject element) {
        if (element instanceof UnifiedElement) {
            String name = ((UnifiedElement) element).getName();
            return name != null ? name : "<unnamed>";
        }
        return element.eClass().getName();
    }

    private EObject getSemanticElement(EObject obj) {
        // Handle DDiagramElement (when right-clicking on diagram elements)
        if (obj instanceof DDiagramElement) {
            DDiagramElement diagramElement = (DDiagramElement) obj;
            EObject target = diagramElement.getTarget();
            if (target != null) {
                return target;
            }
        }
        
        // Handle DSemanticDecorator
        if (obj instanceof DSemanticDecorator) {
            return ((DSemanticDecorator) obj).getTarget();
        }
        
        // Already a semantic element
        return obj;
    }

    private UnifiedSystemModel getUnifiedSystemModel(EObject obj) {
        if (obj instanceof UnifiedSystemModel) {
            return (UnifiedSystemModel) obj;
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