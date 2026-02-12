package edu.kit.sdq.dsis.unified.design.actions;

import java.util.*;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.sirius.business.api.action.AbstractExternalJavaAction;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.swt.widgets.Display;

import unified.SafetyCriticalBlock;
import unified.UnifiedSystemModel;
import unified.BlockConnection;
import unified.BlockFailureMode;
import unified.FMEAAnalysis;
import unified.IntegratedHazard;
import unified.FMEAItem;
import unified.SystemBlock;
import unified.UnifiedElement;

public class HighlightTraceChainAction extends AbstractExternalJavaAction {
    
    @Override
    public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
        if (selections == null || selections.isEmpty()) {
            showError("No Selection", "Please select an element to highlight its trace chain.");
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

        // Prompt user for trace direction
        int traceDirection = promptTraceDirection();
        if (traceDirection == -1) {
            return; // User cancelled
        }

        // Compute trace chain
        Set<EObject> traceChain = computeTraceChain(semanticElement, model, traceDirection);
        
        if (traceChain.isEmpty()) {
            showInfo("No Traces", "No trace links found for the selected element.");
            return;
        }

        // Show summary
        showTraceChainSummary(semanticElement, traceChain, traceDirection);
    }

    private int promptTraceDirection() {
        final int[] result = new int[1];
        Display.getDefault().syncExec(() -> {
            MessageDialog dialog = new MessageDialog(
                Display.getDefault().getActiveShell(),
                "Select Trace Direction",
                null,
                "Choose which trace links to highlight:",
                MessageDialog.QUESTION,
                new String[] { 
                    "Forward (Dependencies)", 
                    "Backward (Dependents)", 
                    "Both (Complete Chain)",
                    "Cancel" 
                },
                0
            );
            result[0] = dialog.open();
        });
        
        if (result[0] == 3) return -1; // Cancel
        return result[0]; // 0=forward, 1=backward, 2=both
    }

    private Set<EObject> computeTraceChain(EObject element, UnifiedSystemModel model, int direction) {
        Set<EObject> chain = new HashSet<>();
        Set<EObject> visited = new HashSet<>();
        
        if (direction == 0 || direction == 2) {
            // Forward traces
            computeForwardTraces(element, model, chain, visited);
        }
        
        if (direction == 1 || direction == 2) {
            // Backward traces
            visited.clear(); // Reset visited for backward pass
            computeBackwardTraces(element, model, chain, visited);
        }
        
        return chain;
    }

    private void computeForwardTraces(EObject element, UnifiedSystemModel model, 
                                     Set<EObject> chain, Set<EObject> visited) {
        if (visited.contains(element)) return;
        visited.add(element);
        
        if (element instanceof IntegratedHazard) {
            IntegratedHazard hazard = (IntegratedHazard) element;
            for (SafetyCriticalBlock block : hazard.getRelatedBlocks()) {
                chain.add(block);
                computeForwardTraces(block, model, chain, visited);
            }
            
        } else if (element instanceof SafetyCriticalBlock) {
            SafetyCriticalBlock block = (SafetyCriticalBlock) element;
            for (BlockFailureMode fm : block.getFailureModes()) {
                chain.add(fm);
                computeForwardTraces(fm, model, chain, visited);
            }
            for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
                for (FMEAItem item : analysis.getFmeaItems()) {
                    if (item.getAnalyzedComponent() == block) {
                        chain.add(item);
                        computeForwardTraces(item, model, chain, visited);
                    }
                }
            }
            for (BlockConnection conn : block.getConnectionAsSource()) {
                for (SystemBlock target : conn.getToBlock()) {
                    chain.add(target);
                    chain.add(conn);
                }
            }
            
        } else if (element instanceof BlockFailureMode) {
            BlockFailureMode fm = (BlockFailureMode) element;
            for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
                for (FMEAItem item : analysis.getFmeaItems()) {
                    if (item.getFailureMode() == fm) {
                        chain.add(item);
                        computeForwardTraces(item, model, chain, visited);
                    }
                }
            }
            
        } else if (element instanceof FMEAItem) {
            FMEAItem item = (FMEAItem) element;
            if (item.getAnalyzedComponent() != null) {
                chain.add(item.getAnalyzedComponent());
            }
            if (item.getFailureMode() != null) {
                chain.add(item.getFailureMode());
            }
            for (IntegratedHazard hazard : item.getRelatedHazards()) {
                chain.add(hazard);
            }
        }
    }

    private void computeBackwardTraces(EObject element, UnifiedSystemModel model, 
                                      Set<EObject> chain, Set<EObject> visited) {
        if (visited.contains(element)) return;
        visited.add(element);
        
        if (element instanceof SafetyCriticalBlock) {
            SafetyCriticalBlock block = (SafetyCriticalBlock) element;
            for (IntegratedHazard hazard : model.getGlobalHazards()) {
                if (hazard.getRelatedBlocks().contains(block)) {
                    chain.add(hazard);
                    computeBackwardTraces(hazard, model, chain, visited);
                }
            }
            for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
                for (FMEAItem item : analysis.getFmeaItems()) {
                    if (item.getAnalyzedComponent() == block) {
                        chain.add(item);
                        computeBackwardTraces(item, model, chain, visited);
                    }
                }
            }
            for (BlockConnection conn : block.getConnectionAsTarget()) {
                for (SystemBlock source : conn.getFromBlock()) {
                    chain.add(source);
                    chain.add(conn);
                }
            }
            
        } else if (element instanceof BlockFailureMode) {
            BlockFailureMode fm = (BlockFailureMode) element;
            if (fm.getAffectedBlock() != null) {
                chain.add(fm.getAffectedBlock());
                computeBackwardTraces(fm.getAffectedBlock(), model, chain, visited);
            }
            for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
                for (FMEAItem item : analysis.getFmeaItems()) {
                    if (item.getFailureMode() == fm) {
                        chain.add(item);
                        computeBackwardTraces(item, model, chain, visited);
                    }
                }
            }
            
        } else if (element instanceof FMEAItem) {
            FMEAItem item = (FMEAItem) element;
            if (item.getAnalyzedComponent() != null) {
                chain.add(item.getAnalyzedComponent());
                computeBackwardTraces(item.getAnalyzedComponent(), model, chain, visited);
            }
            if (item.getFailureMode() != null) {
                chain.add(item.getFailureMode());
                computeBackwardTraces(item.getFailureMode(), model, chain, visited);
            }
            for (IntegratedHazard hazard : item.getRelatedHazards()) {
                chain.add(hazard);
                computeBackwardTraces(hazard, model, chain, visited);
            }
            
        } else if (element instanceof IntegratedHazard) {
            IntegratedHazard hazard = (IntegratedHazard) element;
            for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
                for (FMEAItem item : analysis.getFmeaItems()) {
                    if (item.getRelatedHazards().contains(hazard)) {
                        chain.add(item);
                        computeBackwardTraces(item, model, chain, visited);
                    }
                }
            }
        }
    }

    private void showTraceChainSummary(EObject source, Set<EObject> chain, int direction) {
        StringBuilder summary = new StringBuilder();
        summary.append("═══════════════════════════════════════════════════\n");
        summary.append("           TRACE CHAIN ANALYSIS\n");
        summary.append("═══════════════════════════════════════════════════\n\n");
        
        String sourceName = getElementName(source);
        String sourceType = source.eClass().getName();
        summary.append("📍 Source Element:\n");
        summary.append("   " + sourceName + "[" + sourceType + "]\n\n");
        String directionStr = direction == 0 ? "Forward (Dependencies)" :
            direction == 1 ? "Backward (Dependents)" : "Complete Chain";
summary.append("🔗 Trace Direction: " + directionStr + "\n");
summary.append("📊 Total Elements in Chain: " + chain.size() + "\n\n");

// Group by type
Map<String, List<EObject>> byType = chain.stream()
.collect(Collectors.groupingBy(e -> e.eClass().getName()));

summary.append("📦 Elements by Type:\n");
summary.append("───────────────────────────────────────────────────\n");

List<String> sortedTypes = new ArrayList<>(byType.keySet());
Collections.sort(sortedTypes);

for (String type : sortedTypes) {
List<EObject> elements = byType.get(type);
summary.append(String.format("\n▶ %s (%d):\n", type, elements.size()));
for (EObject elem : elements) {
summary.append("  • " + getElementName(elem));

// Add context info
if (elem instanceof SafetyCriticalBlock) {
   SafetyCriticalBlock block = (SafetyCriticalBlock) elem;
   summary.append(" [" + block.getAsilLevel() + "]");
} else if (elem instanceof IntegratedHazard) {
   IntegratedHazard hazard = (IntegratedHazard) elem;
   summary.append(" [" + hazard.getRiskLevel() + "]");
} else if (elem instanceof FMEAItem) {
   FMEAItem item = (FMEAItem) elem;
   int rpn = item.getSeverity() * item.getOccurrence() * item.getDetection();
   summary.append(" [RPN: " + rpn + "]");
}
summary.append("\n");
}
}

summary.append("\n═══════════════════════════════════════════════════\n");

showInfo("Trace Chain Summary", summary.toString());
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
DDiagramElement diagramElement = (DDiagramElement) obj;
EObject target = diagramElement.getTarget();
if (target != null) {
return target;
}
}

if (obj instanceof DSemanticDecorator) {
return ((DSemanticDecorator) obj).getTarget();
}

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
