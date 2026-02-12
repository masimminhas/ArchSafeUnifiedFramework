package edu.kit.sdq.dsis.unified.design.services;

import java.util.*;
import java.util.stream.Collectors;
import org.eclipse.emf.ecore.EObject;

import unified.*;

/**
 * Complete analysis services for Unified Safety-Architecture Tool.
 * All methods are called from Sirius .odesign validation rules and tool actions.
 * 
 * @version 2.0 - Complete FSE Submission Version
 */
public class AdvancedAnalysisServices {
    
    // ========================================
    // VALIDATION SERVICES (Called from .odesign)
    // ========================================
    
    /**
     * VALIDATION RULE: Check if safety-critical block has associated hazards.
     * Usage in .odesign: auditExpression="service:hasAssociatedHazards"
     * Target: SafetyCriticalBlock
     */
    public boolean hasAssociatedHazards(SafetyCriticalBlock block) {
        UnifiedSystemModel model = getModel(block);
        if (model == null) return true; // Skip if model not accessible
        
        for (IntegratedHazard hazard : model.getGlobalHazards()) {
            if (hazard.getRelatedBlocks().contains(block)) {
                return true;
            }
        }
        return false;
    }
 // Add these methods to AdvancedAnalysisServices.java class

    /**
     * Compute FMEA coverage as a direct double value (for AQL expressions).
     * Returns value between 0.0 and 1.0
     */
    public double computeFMEACoverage(UnifiedSystemModel model) {
        ModelMetrics metrics = computeModelMetrics(model);
        return metrics.getFmeaCoverage();
    }

    /**
     * Compute hazard coverage as a direct double value (for AQL expressions).
     * Returns value between 0.0 and 1.0
     */
    public double computeHazardCoverage(UnifiedSystemModel model) {
        ModelMetrics metrics = computeModelMetrics(model);
        return metrics.getHazardCoverage();
    }

    /**
     * Compute cyclomatic complexity as an integer (fixing duplicate method issue).
     */
    public int computeCyclomaticComplexity11(UnifiedSystemModel model) {
        // McCabe's cyclomatic complexity: M = E - N + 2P
        int edges = model.getBlockConnections().size();
        int nodes = model.getSystemBlocks().size() + model.getRootBlocks().size();
        int components = countConnectedComponents(model);
        
        if (nodes == 0) return 0;
        return edges - nodes + 2 * components;
    }

    /**
     * Compute average block degree as a double (fixing duplicate method issue).
     */
    public double computeAverageBlockDegree11(UnifiedSystemModel model) {
        int totalBlocks = model.getSystemBlocks().size() + model.getRootBlocks().size();
        if (totalBlocks == 0) return 0.0;
        
        int totalDegree = 0;
        for (BlockConnection conn : model.getBlockConnections()) {
            totalDegree += conn.getFromBlock().size() + conn.getToBlock().size();
        }
        
        return (double) totalDegree / totalBlocks;
    }

    /**
     * Multiply double by integer (for percentage calculations in AQL).
     */
    public double mult(double value, int multiplier) {
        return value * multiplier;
    }

    /**
     * Round a double value to nearest integer.
     */
    public int round(double value) {
        return (int) Math.round(value);
    }
 // ========================================
 // METRICS LABEL GENERATION SERVICES
 // ========================================

 /**
  * Generate label for cyclomatic complexity metric.
  */
 public String computeCyclomaticComplexity(UnifiedSystemModel model) {
     int complexity = computeCyclomaticComplexity11(model);
     return "🔄 Cyclomatic Complexity: " + complexity;
 }

 /**
  * Generate label for average block degree metric.
  */
 public String computeAverageBlockDegree(UnifiedSystemModel model) {
     double degree = computeAverageBlockDegree11(model);
     return String.format("📊 Avg Block Degree: %.1f", degree);
 }

 /**
  * Generate label for hazard coverage metric.
  */
 public String getHazardCoverageLabel(UnifiedSystemModel model) {
     ModelMetrics metrics = computeModelMetrics(model);
     double coverage = metrics.getHazardCoverage() * 100;
     return String.format("🛡️ Hazard Coverage: %.0f%%", coverage);
 }

 /**
  * Check if hazard coverage is low (below 50%).
  */
 public boolean isHazardCoverageLow(UnifiedSystemModel model) {
     ModelMetrics metrics = computeModelMetrics(model);
     return metrics.getHazardCoverage() < 0.5;
 }

 /**
  * Generate label for total FMEA items.
  */
 public String getTotalFMEAItemsLabel(UnifiedSystemModel model) {
     int count = countTotalFMEAItems(model);
     return "📋 Total FMEA Items: " + count;
 }

 /**
  * Generate label for FMEA coverage metric.
  */
 public String getFMEACoverageLabel(UnifiedSystemModel model) {
     ModelMetrics metrics = computeModelMetrics(model);
     double coverage = metrics.getFmeaCoverage() * 100;
     return String.format("✓ FMEA Coverage: %.0f%%", coverage);
 }

 /**
  * Check if FMEA coverage is low (below 80%).
  */
 public boolean isFMEACoverageLow(UnifiedSystemModel model) {
     ModelMetrics metrics = computeModelMetrics(model);
     return metrics.getFmeaCoverage() < 0.8;
 }

 /**
  * Generate label for average RPN metric.
  */
 public String getAverageRPNLabel(UnifiedSystemModel model) {
     ModelMetrics metrics = computeModelMetrics(model);
     double rpn = metrics.getAverageRPN();
     return String.format("📈 Average RPN: %.0f", rpn);
 }

 /**
  * Check if average RPN is high (above 100).
  */
 public boolean isAverageRPNHigh(UnifiedSystemModel model) {
     ModelMetrics metrics = computeModelMetrics(model);
     return metrics.getAverageRPN() > 100;
 }

 /**
  * Generate label for high risk items count.
  */
 public String getHighRiskItemsLabel(UnifiedSystemModel model) {
     ModelMetrics metrics = computeModelMetrics(model);
     int count = metrics.getHighRiskItems();
     return "⚠️ High-Risk Items: " + count;
 }

 /**
  * Generate label for auto-generated percentage.
  */
 public String getAutoGeneratedPercentageLabel(UnifiedSystemModel model) {
     ModelMetrics metrics = computeModelMetrics(model);
     double percentage = metrics.getAutoGeneratedPercentage();
     return String.format("🤖 Auto-Generated: %.0f%%", percentage);
 }

 /**
  * Generate label for traceability density.
  */
 public String getTraceabilityDensityLabel(UnifiedSystemModel model) {
     ModelMetrics metrics = computeModelMetrics(model);
     double density = metrics.getTraceabilityDensity() * 100;
     return String.format("🔗 Traceability Density: %.0f%%", density);
 }

 /**
  * Check if traceability density is low (below 30%).
  */
 public boolean isTraceabilityDensityLow(UnifiedSystemModel model) {
     ModelMetrics metrics = computeModelMetrics(model);
     return metrics.getTraceabilityDensity() < 0.3;
 }

 /**
  * Generate label for traceability links count.
  */
 public String getTraceabilityLinksLabel(UnifiedSystemModel model) {
     ModelMetrics metrics = computeModelMetrics(model);
     int links = metrics.getTraceabilityLinks();
     return "🔗 Traceability Links: " + links;
 }

 /**
  * Generate label for completeness score.
  */
 public String getCompletenessScoreLabel(UnifiedSystemModel model) {
     ModelMetrics metrics = computeModelMetrics(model);
     int score = metrics.getCompletenessScore();
     return "✅ Completeness Score: " + score + "/100";
 }

 /**
  * Check if completeness score is low (below 50).
  */
 public boolean isCompletenessScoreLow(UnifiedSystemModel model) {
     ModelMetrics metrics = computeModelMetrics(model);
     return metrics.getCompletenessScore() < 50;
 }

 /**
  * Generate label for consistency score.
  */
 public String getConsistencyScoreLabel(UnifiedSystemModel model) {
     ModelMetrics metrics = computeModelMetrics(model);
     int score = metrics.getConsistencyScore();
     return "🎯 Consistency Score: " + score + "/100";
 }

 /**
  * Check if consistency score is low (below 70).
  */
 public boolean isConsistencyScoreLow(UnifiedSystemModel model) {
     ModelMetrics metrics = computeModelMetrics(model);
     return metrics.getConsistencyScore() < 70;
 }
    
    /**
     * VALIDATION RULE: Check if high-criticality block has FMEA analysis.
     * Usage in .odesign: auditExpression="service:requiresFMEAValidation"
     * Target: SafetyCriticalBlock
     */
    public boolean requiresFMEAValidation(SafetyCriticalBlock block) {
        // Only HIGH and CRITICAL blocks require FMEA
        if (block.getSafetyCriticality() != SafetyCriticalityLevel.HIGH && 
            block.getSafetyCriticality() != SafetyCriticalityLevel.CRITICAL) {
            return true; 
        }
        
        UnifiedSystemModel model = getModel(block);
        if (model == null) return true;
        
        // Check if any FMEA item analyzes this block
        for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
            for (FMEAItem item : analysis.getFmeaItems()) {
                if (item.getAnalyzedComponent() == block) {
                    return true; // Found FMEA for this block
                }
            }
        }
        return false; // No FMEA found
    }
    
    /**
     * VALIDATION RULE: Check if FMEA item with high RPN has mitigation.
     * Usage in .odesign: auditExpression="service:checkHighRPNMitigation"
     * Target: FMEAItem
     */
    public boolean checkHighRPNMitigation(FMEAItem item) {
        int rpn = item.getSeverity() * item.getOccurrence() * item.getDetection();
        
        // Get threshold from parent analysis
        FMEAAnalysis analysis = (FMEAAnalysis) item.eContainer();
        if (analysis == null) return true;
        
        // If RPN exceeds threshold, must have action in progress or completed
        if (rpn > analysis.getRpnThreshold()) {
            ActionStatus status = item.getActionStatus();
            return status != ActionStatus.OPEN && status != null;
        }
        
        return true; // RPN below threshold, no action required
    }
    
    /**
     * VALIDATION RULE: Check if critical hazard has mitigation.
     * Usage in .odesign: auditExpression="service:criticalHazardHasMitigation"
     * Target: IntegratedHazard
     */
    public boolean criticalHazardHasMitigation(IntegratedHazard hazard) {
        // Only CRITICAL_RISK and CATASTROPHIC require mitigation
        if (hazard.getRiskLevel() != RiskLevel.CRITICAL_RISK && 
            hazard.getRiskLevel() != RiskLevel.CATASTROPHIC) {
            return true;
        }
        
        // Check mitigation status
        MitigationStatus status = hazard.getMitigationStatus();
        if (status == MitigationStatus.NOT_MITIGATED) {
            return false;
        }
        
        // Also verify hazard is linked to blocks (mitigation measures)
        return !hazard.getRelatedBlocks().isEmpty();
    }
    
    /**
     * VALIDATION RULE: Check for circular dependencies in architecture.
     * Usage in .odesign: auditExpression="service:checkCircularDependency"
     * Target: SystemBlock
     */
    public boolean checkCircularDependency(SystemBlock block) {
        UnifiedSystemModel model = getModel(block);
        if (model == null) return true;
        
        Set<SystemBlock> visited = new HashSet<>();
        Set<SystemBlock> recursionStack = new HashSet<>();
        
        return !hasCycle(block, visited, recursionStack, model);
    }
    
    public boolean hasCycle(SystemBlock current, Set<SystemBlock> visited, 
                            Set<SystemBlock> recursionStack, UnifiedSystemModel model) {
        visited.add(current);
        recursionStack.add(current);
        
        // Check all outgoing connections
        for (BlockConnection conn : model.getBlockConnections()) {
            if (conn.getFromBlock().contains(current)) {
                for (SystemBlock target : conn.getToBlock()) {
                    if (!visited.contains(target)) {
                        if (hasCycle(target, visited, recursionStack, model)) {
                            return true;
                        }
                    } else if (recursionStack.contains(target)) {
                        return true; // Cycle detected
                    }
                }
            }
        }
        
        recursionStack.remove(current);
        return false;
    }
    
    /**
     * VALIDATION RULE: Check if model has sufficient traceability.
     * Usage in .odesign: auditExpression="service:checkTraceabilityCompleteness"
     * Target: UnifiedSystemModel
     */
    public boolean checkTraceabilityCompleteness(UnifiedSystemModel model) {
        double density = computeTraceabilityDensity(model);
        return density >= 0.3; // At least 30% traceability coverage
    }
    
    /**
     * VALIDATION RULE: Check if failure mode has proper description.
     * Usage in .odesign: auditExpression="service:hasProperDescription"
     * Target: BlockFailureMode
     */
    public boolean hasProperDescription(BlockFailureMode failureMode) {
        String name = failureMode.getName();
        return name != null && name.trim().length() >= 5;
    }
    
    /**
     * VALIDATION RULE: Check if FMEA item has complete data.
     * Usage in .odesign: auditExpression="service:isFMEAItemComplete"
     * Target: FMEAItem
     */
    public boolean isFMEAItemComplete(FMEAItem item) {
        return item.getSeverity() > 0 && 
               item.getSeverity() <= 10 &&
               item.getOccurrence() > 0 && 
               item.getOccurrence() <= 10 &&
               item.getDetection() > 0 && 
               item.getDetection() <= 10;
    }
    
    /**
     * VALIDATION RULE: Check if high-criticality block has redundancy.
     * Usage in .odesign: auditExpression="service:highCriticalityHasRedundancy"
     * Target: SafetyCriticalBlock
     */
    public boolean highCriticalityHasRedundancy(SafetyCriticalBlock block) {
        // Only CRITICAL level requires redundancy
        if (block.getSafetyCriticality() != SafetyCriticalityLevel.CRITICAL) {
            return true;
        }
        
        return block.isHasRedundancy();
    }
    
    /**
     * VALIDATION RULE: Check if ASIL D block has adequate FMEA coverage.
     * Usage in .odesign: auditExpression="service:asilDHasFMEACoverage"
     * Target: SafetyCriticalBlock
     */
    public boolean asilDHasFMEACoverage(SafetyCriticalBlock block) {
        if (block.getAsilLevel() != ASILLevel.ASIL_D) {
            return true; // Only check ASIL D
        }
        
        UnifiedSystemModel model = getModel(block);
        if (model == null) return true;
        
        // ASIL D requires FMEA for all failure modes
        int failureModeCount = block.getFailureModes().size();
        if (failureModeCount == 0) return false; // ASIL D must have failure modes
        
        int coveredModes = 0;
        for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
            for (FMEAItem item : analysis.getFmeaItems()) {
                if (item.getAnalyzedComponent() == block && 
                    item.getFailureMode() != null) {
                    coveredModes++;
                }
            }
        }
        
        // At least 80% of failure modes must have FMEA items
        return (double) coveredModes / failureModeCount >= 0.8;
    }
    
    /**
     * VALIDATION RULE: Check if block name is unique.
     * Usage in .odesign: auditExpression="service:hasUniqueName"
     * Target: SystemBlock
     */
    public boolean hasUniqueName(SystemBlock block) {
        UnifiedSystemModel model = getModel(block);
        if (model == null || block.getName() == null) return true;
        
        // Count blocks with same name
        long count = 0;
        for (SystemBlock b : model.getSystemBlocks()) {
            if (block.getName().equals(b.getName())) count++;
        }
        for (SafetyCriticalBlock b : model.getRootBlocks()) {
            if (block.getName().equals(b.getName())) count++;
        }
        
        return count <= 1; // Only this block should have this name
    }
    
    /**
     * Helper: Check if element has validation errors (for dynamic styling).
     * Usage in .odesign: labelExpression or color computation
     */
    public boolean hasValidationErrors(EObject element) {
        if (element instanceof SafetyCriticalBlock) {
            SafetyCriticalBlock block = (SafetyCriticalBlock) element;
            return !hasAssociatedHazards(block) || !requiresFMEAValidation(block);
        } else if (element instanceof IntegratedHazard) {
            IntegratedHazard hazard = (IntegratedHazard) element;
            return !criticalHazardHasMitigation(hazard);
        } else if (element instanceof FMEAItem) {
            FMEAItem item = (FMEAItem) element;
            return !isFMEAItemComplete(item) || !checkHighRPNMitigation(item);
        }
        return false;
    }
    
    // ========================================
    // FMEA GENERATION SERVICES
    // ========================================
    
    /**
     * Auto-generate FMEA items from safety models.
     * Called from tool action: GenerateFMEAAction
     */
    public List<FMEAItem> generateFMEAItems(UnifiedSystemModel model) {
        List<FMEAItem> generatedItems = new ArrayList<>();
        
        for (SafetyCriticalBlock block : model.getRootBlocks()) {
            
            // Generate FMEA items for each failure mode
            if (block.getFailureModes().isEmpty()) {
                // Create placeholder if no failure modes defined
                FMEAItem item = createPlaceholderFMEAItem(block);
                generatedItems.add(item);
            } else {
                for (BlockFailureMode failureMode : block.getFailureModes()) {
                    // Find related hazards
                    List<IntegratedHazard> relatedHazards = findHazardsForBlock(block, model);
                    
                    if (relatedHazards.isEmpty()) {
                        // Create item without hazard link
                        FMEAItem item = createFMEAItem(block, failureMode, null, model);
                        generatedItems.add(item);
                    } else {
                        // Create item for each related hazard
                        for (IntegratedHazard hazard : relatedHazards) {
                            FMEAItem item = createFMEAItem(block, failureMode, hazard, model);
                            generatedItems.add(item);
                        }
                    }
                }
            }
        }
        
        return generatedItems;
    }
    
    public FMEAItem createFMEAItem(SafetyCriticalBlock block, BlockFailureMode failureMode, 
                                    IntegratedHazard hazard, UnifiedSystemModel model) {
        FMEAItem item = UnifiedFactory.eINSTANCE.createFMEAItem();
        
        // Set name
        String name = "FMEA_" + block.getName();
        if (failureMode != null) name += "_" + failureMode.getName();
        item.setName(name);
        
        // Link to component and failure mode
        item.setAnalyzedComponent(block);
        item.setFailureMode(failureMode);
        
        // Link to hazard if provided
        if (hazard != null) {
            item.getRelatedHazards().add(hazard);
        }
        
        // Estimate severity from hazard or criticality
        if (hazard != null) {
            item.setSeverity(estimateSeverityFromRisk(hazard.getRiskLevel()));
        } else {
            item.setSeverity(estimateSeverityFromCriticality(block.getSafetyCriticality()));
        }
        
        // Estimate occurrence from block criticality and ASIL
        item.setOccurrence(estimateOccurrence(block));
        
        // Default detection value (user should refine)
        item.setDetection(5);
        
        // Set effects from failure mode if available
        if (failureMode != null && failureMode.getFailureEffect() != null) {
            item.setLocalEffect(failureMode.getFailureEffect());
        }
        
        // Set status and generation flag
        item.setActionStatus(ActionStatus.OPEN);
        item.setAutoGenerated(true);
        
        return item;
    }
    
    public FMEAItem createPlaceholderFMEAItem(SafetyCriticalBlock block) {
        FMEAItem item = UnifiedFactory.eINSTANCE.createFMEAItem();
        item.setName("FMEA_" + block.getName() + "_UnspecifiedFailure");
        item.setAnalyzedComponent(block);
        item.setSeverity(estimateSeverityFromCriticality(block.getSafetyCriticality()));
        item.setOccurrence(5);
        item.setDetection(5);
        item.setActionStatus(ActionStatus.OPEN);
        item.setAutoGenerated(true);
        item.setLocalEffect("Unspecified failure - please define failure modes");
        return item;
    }
    
    public int estimateSeverityFromRisk(RiskLevel risk) {
        if (risk == null) return 5;
        switch (risk) {
            case CATASTROPHIC: return 10;
            case CRITICAL_RISK: return 8;
            case MARGINAL: return 5;
            case NEGLIGIBLE: return 2;
            default: return 5;
        }
    }
    
    public int estimateSeverityFromCriticality(SafetyCriticalityLevel criticality) {
        if (criticality == null) return 5;
        switch (criticality) {
            case CRITICAL: return 9;
            case HIGH: return 7;
            case MEDIUM: return 5;
            case LOW: return 3;
            default: return 5;
        }
    }
    
    public int estimateOccurrence(SafetyCriticalBlock block) {
        // Consider both criticality and ASIL level
        int base = 5;
        
        if (block.getSafetyCriticality() == SafetyCriticalityLevel.HIGH) {
            base = 7;
        } else if (block.getSafetyCriticality() == SafetyCriticalityLevel.CRITICAL) {
            base = 8;
        }
        
        // Adjust for ASIL level (higher ASIL = stricter requirements, lower occurrence)
        if (block.getAsilLevel() == ASILLevel.ASIL_D) {
            base = Math.max(1, base - 2);
        } else if (block.getAsilLevel() == ASILLevel.ASIL_C) {
            base = Math.max(2, base - 1);
        }
        
        return base;
    }
    
    public List<IntegratedHazard> findHazardsForBlock(SafetyCriticalBlock block, UnifiedSystemModel model) {
        return model.getGlobalHazards().stream()
            .filter(hazard -> hazard.getRelatedBlocks().contains(block))
            .collect(Collectors.toList());
    }
    
    // ========================================
    // IMPACT ANALYSIS SERVICES
    // ========================================
    
    /**
     * Analyze impact of changes to a block.
     * Called from tool action: ImpactAnalysisAction
     */
    public ImpactReport analyzeBlockImpact(SystemBlock block) {
        UnifiedSystemModel model = getModel(block);
        if (model == null) return new ImpactReport(block);
        
        ImpactReport report = new ImpactReport(block);
        
        // Find affected connections
        for (BlockConnection conn : model.getBlockConnections()) {
            if (conn.getFromBlock().contains(block) || conn.getToBlock().contains(block)) {
                report.addAffectedConnection(conn);
            }
        }
        
        // Find affected associations
        for (BlockAssociation assoc : model.getBlockAssociations()) {
            if (assoc.getSourceBlock() == block || assoc.getTargetBlock() == block) {
                report.addAffectedAssociation(assoc);
            }
        }
        
        // Find affected hazards (if safety-critical)
        if (block instanceof SafetyCriticalBlock) {
            SafetyCriticalBlock safeBlock = (SafetyCriticalBlock) block;
            for (IntegratedHazard hazard : model.getGlobalHazards()) {
                if (hazard.getRelatedBlocks().contains(safeBlock)) {
                    report.addAffectedHazard(hazard);
                }
            }
        }
        
        // Find affected FMEA items
        for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
            for (FMEAItem item : analysis.getFmeaItems()) {
                if (item.getAnalyzedComponent() == block) {
                    report.addAffectedFMEAItem(item);
                }
            }
        }
        
        // Compute propagation depth
        Set<SystemBlock> visited = new HashSet<>();
        int depth = computePropagationDepth(block, model, visited, 0);
        report.setPropagationDepth(depth);
        
        // Compute impact score
        report.setImpactScore(computeImpactScore(report));
        
        return report;
    }
    
    public int computePropagationDepth(SystemBlock block, UnifiedSystemModel model, 
                                       Set<SystemBlock> visited, int currentDepth) {
        if (visited.contains(block)) return currentDepth;
        visited.add(block);
        
        int maxDepth = currentDepth;
        
        for (BlockConnection conn : model.getBlockConnections()) {
            if (conn.getFromBlock().contains(block)) {
                for (SystemBlock target : conn.getToBlock()) {
                    int childDepth = computePropagationDepth(target, model, visited, currentDepth + 1);
                    maxDepth = Math.max(maxDepth, childDepth);
                }
            }
        }
        
        return maxDepth;
    }
    
    public int computeImpactScore(ImpactReport report) {
        int score = 0;
        
        // Connections impact (10 points each)
        score += report.getAffectedConnections().size() * 10;
        
        // Associations impact (5 points each)
        score += report.getAffectedAssociations().size() * 5;
        
        // Hazards impact (20 points each - safety critical)
        score += report.getAffectedHazards().size() * 20;
        
        // FMEA impact (15 points each)
        score += report.getAffectedFMEAItems().size() * 15;
        
        // Propagation depth (5 points per level)
        score += report.getPropagationDepth() * 5;
        
        return Math.min(score, 100); // Cap at 100
    }
    
    // ========================================
    // METRICS CALCULATION SERVICES
    // ========================================
    
    /**
     * Compute comprehensive model metrics.
     * Called from tool action: MetricsAction
     */
    public ModelMetrics computeModelMetrics(UnifiedSystemModel model) {
        ModelMetrics metrics = new ModelMetrics();
        
        // Basic counts
        int totalBlocks = model.getSystemBlocks().size() + model.getRootBlocks().size();
        metrics.setTotalBlocks(totalBlocks);
        metrics.setTotalConnections(model.getBlockConnections().size());
        metrics.setTotalHazards(model.getGlobalHazards().size());
        metrics.setTotalFMEAItems(countTotalFMEAItems(model));
        
        // Complexity metrics
        metrics.setCyclomaticComplexity(computeCyclomaticComplexity11(model));
        metrics.setAverageBlockDegree(computeAverageBlockDegree11(model));
        
        // Safety coverage metrics
        int criticalBlocks = model.getRootBlocks().size();
        if (criticalBlocks > 0) {
            int blocksWithHazards = countBlocksWithHazards(model);
            metrics.setHazardCoverage((double) blocksWithHazards / criticalBlocks);
            
            int blocksWithFMEA = countBlocksWithFMEA(model);
            metrics.setFmeaCoverage((double) blocksWithFMEA / criticalBlocks);
        } else {
            metrics.setHazardCoverage(0.0);
            metrics.setFmeaCoverage(0.0);
        }
        
        // Traceability metrics
        metrics.setTraceabilityDensity(computeTraceabilityDensity(model));
        metrics.setTraceabilityLinks(countTraceabilityLinks(model));
        
        // FMEA metrics
        metrics.setAverageRPN(computeAverageRPN(model));
        metrics.setHighRiskItems(countHighRiskItems(model));
        metrics.setAutoGeneratedPercentage(computeAutoGeneratedPercentage(model));
        
        // Completeness score (0-100)
        metrics.setCompletenessScore(computeCompletenessScore(model));
        
        // Consistency score
        metrics.setConsistencyScore(computeConsistencyScore(model));
        
        return metrics;
    }
    
    public int countTotalFMEAItems(UnifiedSystemModel model) {
        int count = 0;
        for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
            count += analysis.getFmeaItems().size();
        }
        return count;
    }
    
    public int computeCyclomaticComplexity1(UnifiedSystemModel model) {
        // McCabe's cyclomatic complexity: M = E - N + 2P
        int edges = model.getBlockConnections().size();
        int nodes = model.getSystemBlocks().size() + model.getRootBlocks().size();
        int components = countConnectedComponents(model);
        
        if (nodes == 0) return 0;
        return edges - nodes + 2 * components;
    }
    
    public int countConnectedComponents(UnifiedSystemModel model) {
        Set<SystemBlock> visited = new HashSet<>();
        int components = 0;
        
        List<SystemBlock> allBlocks = new ArrayList<>();
        allBlocks.addAll(model.getSystemBlocks());
        allBlocks.addAll(model.getRootBlocks());
        
        for (SystemBlock block : allBlocks) {
            if (!visited.contains(block)) {
                dfs(block, visited, model);
                components++;
            }
        }
        
        return components;
    }
    
    public void dfs(SystemBlock block, Set<SystemBlock> visited, UnifiedSystemModel model) {
        visited.add(block);
        
        for (BlockConnection conn : model.getBlockConnections()) {
            if (conn.getFromBlock().contains(block)) {
                for (SystemBlock target : conn.getToBlock()) {
                    if (!visited.contains(target)) {
                        dfs(target, visited, model);
                    }
                }
            }
            if (conn.getToBlock().contains(block)) {
                for (SystemBlock source : conn.getFromBlock()) {
                    if (!visited.contains(source)) {
                        dfs(source, visited, model);
                    }
                }
            }
        }
    }
    
    public double computeAverageBlockDegree1(UnifiedSystemModel model) {
        int totalBlocks = model.getSystemBlocks().size() + model.getRootBlocks().size();
        if (totalBlocks == 0) return 0.0;
        
        int totalDegree = 0;
        for (BlockConnection conn : model.getBlockConnections()) {
            totalDegree += conn.getFromBlock().size() + conn.getToBlock().size();
        }
        
        return (double) totalDegree / totalBlocks;
    }
    
    public int countBlocksWithHazards(UnifiedSystemModel model) {
        Set<SafetyCriticalBlock> blocksWithHazards = new HashSet<>();
        
        for (IntegratedHazard hazard : model.getGlobalHazards()) {
            blocksWithHazards.addAll(hazard.getRelatedBlocks());
        }
        
        return blocksWithHazards.size();
    }
    
    public int countBlocksWithFMEA(UnifiedSystemModel model) {
        Set<SystemBlock> blocksWithFMEA = new HashSet<>();
        
        for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
            for (FMEAItem item : analysis.getFmeaItems()) {
                if (item.getAnalyzedComponent() != null) {
                    blocksWithFMEA.add(item.getAnalyzedComponent());
                }
            }
        }
        
        return blocksWithFMEA.size();
    }
    
    public double computeTraceabilityDensity(UnifiedSystemModel model) {
        int totalBlocks = model.getSystemBlocks().size() + model.getRootBlocks().size();
        int totalAnalysisElements = model.getGlobalHazards().size();
        
        for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
            totalAnalysisElements += analysis.getFmeaItems().size();
        }
        
        if (totalBlocks == 0 || totalAnalysisElements == 0) return 0.0;
        
        int totalPossibleLinks = totalBlocks * totalAnalysisElements;
        int actualLinks = countTraceabilityLinks(model);
        
        return (double) actualLinks / totalPossibleLinks;
    }
    
    public int countTraceabilityLinks(UnifiedSystemModel model) {
        int links = 0;
        
        // Hazard to block links
        for (IntegratedHazard hazard : model.getGlobalHazards()) {
            links += hazard.getRelatedBlocks().size();
        }
        
        // FMEA to component links
        for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
            for (FMEAItem item : analysis.getFmeaItems()) {
                if (item.getAnalyzedComponent() != null) links++;
                if (item.getFailureMode() != null) links++;
                links += item.getRelatedHazards().size();
            }
        }
        
        return links;
    }
    
    public double computeAverageRPN(UnifiedSystemModel model) {
        int totalRPN = 0;
        int itemCount = 0;
        
        for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
            for (FMEAItem item : analysis.getFmeaItems()) {
                totalRPN += item.getSeverity() * item.getOccurrence() * item.getDetection();
                itemCount++;
            }
        }
        
        return itemCount > 0 ? (double) totalRPN / itemCount : 0.0;
    }
    
    public int countHighRiskItems(UnifiedSystemModel model) {
        int count = 0;
        
        for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
            int threshold = analysis.getRpnThreshold();
            for (FMEAItem item : analysis.getFmeaItems()) {
                int rpn = item.getSeverity() * item.getOccurrence() * item.getDetection();
                if (rpn > threshold) count++;
            }
        }
        
        return count;
    }
    
    public double computeAutoGeneratedPercentage(UnifiedSystemModel model) {
        int total = 0;
        int autoGen = 0;
        
        for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
            for (FMEAItem item : analysis.getFmeaItems()) {
                total++;
                if (item.isAutoGenerated()) autoGen++;
            }
        }
        
        return total > 0 ? (double) autoGen / total * 100.0 : 0.0;
    }
    
    public int computeCompletenessScore(UnifiedSystemModel model) {
        int score = 0;
        // Architecture completeness (25 points)
        if (model.getSystemBlocks().size() > 0) score += 10;
        if (model.getBlockConnections().size() > 0) score += 15;
        
        // Safety completeness (25 points)
        if (model.getGlobalHazards().size() > 0) score += 10;
        int blocksWithFailureModes = 0;
        for (SafetyCriticalBlock block : model.getRootBlocks()) {
            if (!block.getFailureModes().isEmpty()) blocksWithFailureModes++;
        }
        if (blocksWithFailureModes > 0) score += 15;
        
        // FMEA completeness (25 points)
        if (model.getFmeaAnalysis().size() > 0) score += 10;
        int completeFMEAItems = 0;
        for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
            for (FMEAItem item : analysis.getFmeaItems()) {
                if (isFMEAItemComplete(item)) {
                    completeFMEAItems++;
                }
            }
        }
        if (completeFMEAItems > 0) score += 15;
        
        // Traceability completeness (25 points)
        double traceability = computeTraceabilityDensity(model);
        score += (int) (traceability * 25);
        return score;
    }
    
    public int computeConsistencyScore(UnifiedSystemModel model) {
        int violations = 0;
        int totalChecks = 0;
        
        // Check all safety-critical blocks
        for (SafetyCriticalBlock block : model.getRootBlocks()) {
            totalChecks++;
            if (!hasAssociatedHazards(block)) violations++;
            
            totalChecks++;
            if (!requiresFMEAValidation(block)) violations++;
            
            if (block.getSafetyCriticality() == SafetyCriticalityLevel.CRITICAL) {
                totalChecks++;
                if (!highCriticalityHasRedundancy(block)) violations++;
            }
        }
        
        // Check all hazards
        for (IntegratedHazard hazard : model.getGlobalHazards()) {
            totalChecks++;
            if (!criticalHazardHasMitigation(hazard)) violations++;
        }
        
        // Check all FMEA items
        for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
            for (FMEAItem item : analysis.getFmeaItems()) {
                totalChecks++;
                if (!isFMEAItemComplete(item)) violations++;
                
                totalChecks++;
                if (!checkHighRPNMitigation(item)) violations++;
            }
        }
        
        if (totalChecks == 0) return 100;
        
        int score = 100 - (int)((double) violations / totalChecks * 100);
        return Math.max(0, score);
    }
    
    // ========================================
    // PATTERN DETECTION SERVICES
    // ========================================
    
    /**
     * Detect safety patterns in the model.
     * Called from tool action or analysis
     */
    public List<DetectedPattern> detectSafetyPatterns(UnifiedSystemModel model) {
        List<DetectedPattern> patterns = new ArrayList<>();
        
        patterns.addAll(detectRedundancyPatterns(model));
        patterns.addAll(detectMonitorPatterns(model));
        patterns.addAll(detectFailSafePatterns(model));
        
        return patterns;
    }
    
    public List<DetectedPattern> detectRedundancyPatterns(UnifiedSystemModel model) {
        List<DetectedPattern> patterns = new ArrayList<>();
        
        for (SafetyCriticalBlock block : model.getRootBlocks()) {
            if (block.isHasRedundancy() && 
                block.getRedundancyType() != RedundancyType.NONE) {
                patterns.add(new DetectedPattern(
                    "Redundancy Pattern",
                    block,
                    "Block uses " + block.getRedundancyType() + " redundancy"
                ));
            }
        }
        
        return patterns;
    }
    
    public List<DetectedPattern> detectMonitorPatterns(UnifiedSystemModel model) {
        List<DetectedPattern> patterns = new ArrayList<>();
        
        // Look for monitoring blocks connected to safety-critical blocks
        for (SafetyCriticalBlock criticalBlock : model.getRootBlocks()) {
            for (BlockConnection conn : model.getBlockConnections()) {
                if (conn.getToBlock().contains(criticalBlock)) {
                    for (SystemBlock source : conn.getFromBlock()) {
                        if (source.getBlockType() == BlockType.SENSOR) {
                            patterns.add(new DetectedPattern(
                                "Monitor Pattern",
                                criticalBlock,
                                "Monitored by sensor: " + source.getName()
                            ));
                        }
                    }
                }
            }
        }
        
        return patterns;
    }
    
    public List<DetectedPattern> detectFailSafePatterns(UnifiedSystemModel model) {
        List<DetectedPattern> patterns = new ArrayList<>();
        
        // Look for fail-safe mechanisms (blocks with high redundancy + low ASIL)
        for (SafetyCriticalBlock block : model.getRootBlocks()) {
            if (block.isHasRedundancy() && 
                block.getAsilLevel() != null &&
                block.getAsilLevel() != ASILLevel.QM) {
                
                // Check if has safe state (mitigation for hazards)
                List<IntegratedHazard> hazards = findHazardsForBlock(block, model);
                boolean allMitigated = hazards.stream()
                    .allMatch(h -> h.getMitigationStatus() != MitigationStatus.NOT_MITIGATED);
                
                if (allMitigated) {
                    patterns.add(new DetectedPattern(
                        "Fail-Safe Pattern",
                        block,
                        "Block has redundancy and all hazards are mitigated"
                    ));
                }
            }
        }
        
        return patterns;
    }
    
    // ========================================
    // RECOMMENDATION SERVICES
    // ========================================
    
    /**
     * Generate recommendations for model improvement.
     * Called from tool action or analysis
     */
    public List<Recommendation> generateRecommendations(UnifiedSystemModel model) {
        List<Recommendation> recommendations = new ArrayList<>();
        
        // Check for missing redundancy
        for (SafetyCriticalBlock block : model.getRootBlocks()) {
            if (block.getSafetyCriticality() == SafetyCriticalityLevel.CRITICAL && 
                !block.isHasRedundancy()) {
                recommendations.add(new Recommendation(
                    "Add Redundancy",
                    RecommendationType.SAFETY_IMPROVEMENT,
                    block,
                    "Critical block '" + block.getName() + "' should have redundancy"
                ));
            }
        }
        
        // Check for high RPN without mitigation
        for (FMEAAnalysis analysis : model.getFmeaAnalysis()) {
            for (FMEAItem item : analysis.getFmeaItems()) {
                int rpn = item.getSeverity() * item.getOccurrence() * item.getDetection();
                if (rpn > 100 && item.getActionStatus() == ActionStatus.OPEN) {
                    recommendations.add(new Recommendation(
                        "Mitigate High RPN",
                        RecommendationType.RISK_MITIGATION,
                        item,
                        "High RPN (" + rpn + ") requires mitigation action"
                    ));
                }
            }
        }
        
        // Check for unmitigated critical hazards
        for (IntegratedHazard hazard : model.getGlobalHazards()) {
            if (hazard.getRiskLevel() == RiskLevel.CRITICAL_RISK && 
                hazard.getMitigationStatus() == MitigationStatus.NOT_MITIGATED) {
                recommendations.add(new Recommendation(
                    "Mitigate Critical Hazard",
                    RecommendationType.HAZARD_MITIGATION,
                    hazard,
                    "Critical hazard '" + hazard.getName() + "' requires mitigation"
                ));
            }
        }
        
        // Check for missing FMEA coverage
        for (SafetyCriticalBlock block : model.getRootBlocks()) {
            if (!requiresFMEAValidation(block)) {
                recommendations.add(new Recommendation(
                    "Add FMEA Analysis",
                    RecommendationType.COMPLETENESS,
                    block,
                    "High-criticality block missing FMEA analysis"
                ));
            }
        }
        
        return recommendations;
    }
    public static class ModelMetrics {
        public int totalBlocks;
        private int totalConnections;
        private int totalHazards;
        private int totalFMEAItems;
        private int cyclomaticComplexity;
        private double averageBlockDegree;
        private double hazardCoverage;
        private double fmeaCoverage;
        private double traceabilityDensity;
        private int traceabilityLinks;
        private double averageRPN;
        private int highRiskItems;
        private double autoGeneratedPercentage;
        private int completenessScore;
        private int consistencyScore;
        
        // Getters and setters
        public int getTotalBlocks() { return totalBlocks; }
        public void setTotalBlocks(int totalBlocks) { this.totalBlocks = totalBlocks; }
        
        public int getTotalConnections() { return totalConnections; }
        public void setTotalConnections(int totalConnections) { this.totalConnections = totalConnections; }
        
        public int getTotalHazards() { return totalHazards; }
        public void setTotalHazards(int totalHazards) { this.totalHazards = totalHazards; }
        
        public int getTotalFMEAItems() { return totalFMEAItems; }
        public void setTotalFMEAItems(int totalFMEAItems) { this.totalFMEAItems = totalFMEAItems; }
        
        public int getCyclomaticComplexity() { return cyclomaticComplexity; }
        public void setCyclomaticComplexity(int i) { 
            this.cyclomaticComplexity = i; 
        }
        
        public double getAverageBlockDegree() { return averageBlockDegree; }
        public void setAverageBlockDegree(double d) { 
            this.averageBlockDegree = d; 
        }
        
        public double getHazardCoverage() { return hazardCoverage; }
        public void setHazardCoverage(double hazardCoverage) { this.hazardCoverage = hazardCoverage; }
        
        public double getFmeaCoverage() { return fmeaCoverage; }
        public void setFmeaCoverage(double fmeaCoverage) { this.fmeaCoverage = fmeaCoverage; }
        
        public double getTraceabilityDensity() { return traceabilityDensity; }
        public void setTraceabilityDensity(double traceabilityDensity) { 
            this.traceabilityDensity = traceabilityDensity; 
        }
        
        public int getTraceabilityLinks() { return traceabilityLinks; }
        public void setTraceabilityLinks(int traceabilityLinks) { 
            this.traceabilityLinks = traceabilityLinks; 
        }
        
        public double getAverageRPN() { return averageRPN; }
        public void setAverageRPN(double averageRPN) { this.averageRPN = averageRPN; }
        
        public int getHighRiskItems() { return highRiskItems; }
        public void setHighRiskItems(int highRiskItems) { this.highRiskItems = highRiskItems; }
        
        public double getAutoGeneratedPercentage() { return autoGeneratedPercentage; }
        public void setAutoGeneratedPercentage(double autoGeneratedPercentage) { 
            this.autoGeneratedPercentage = autoGeneratedPercentage; 
        }
        
        public int getCompletenessScore() { return completenessScore; }
        public void setCompletenessScore(int completenessScore) { 
            this.completenessScore = completenessScore; 
        }
        
        public int getConsistencyScore() { return consistencyScore; }
        public void setConsistencyScore(int consistencyScore) { 
            this.consistencyScore = consistencyScore; 
        }
    }
    // ========================================
    // HELPER METHODS
    // ========================================
    
    public UnifiedSystemModel getModel(EObject element) {
        EObject current = element;
        while (current != null && !(current instanceof UnifiedSystemModel)) {
            current = current.eContainer();
        }
        return (UnifiedSystemModel) current;
    }
    
    // ========================================
    // INNER CLASSES FOR REPORTS
    // ========================================
    
    public static class ImpactReport {
        private final SystemBlock changedBlock;
        private final List<BlockConnection> affectedConnections = new ArrayList<>();
        private final List<BlockAssociation> affectedAssociations = new ArrayList<>();
        private final List<IntegratedHazard> affectedHazards = new ArrayList<>();
        private final List<FMEAItem> affectedFMEAItems = new ArrayList<>();
        private int propagationDepth;
        private int impactScore;
        
        public ImpactReport(SystemBlock block) {
            this.changedBlock = block;
        }
        
        public void addAffectedConnection(BlockConnection conn) {
            affectedConnections.add(conn);
        }
        
        public void addAffectedAssociation(BlockAssociation assoc) {
            affectedAssociations.add(assoc);
        }
        
        public void addAffectedHazard(IntegratedHazard hazard) {
            affectedHazards.add(hazard);
        }
        
        public void addAffectedFMEAItem(FMEAItem item) {
            affectedFMEAItems.add(item);
        }
        
        public void setPropagationDepth(int depth) { this.propagationDepth = depth; }
        public void setImpactScore(int score) { this.impactScore = score; }
        
        public SystemBlock getChangedBlock() { return changedBlock; }
        public List<BlockConnection> getAffectedConnections() { return affectedConnections; }
        public List<BlockAssociation> getAffectedAssociations() { return affectedAssociations; }
        public List<IntegratedHazard> getAffectedHazards() { return affectedHazards; }
        public List<FMEAItem> getAffectedFMEAItems() { return affectedFMEAItems; }
        public int getPropagationDepth() { return propagationDepth; }
        public int getImpactScore() { return impactScore; }
    }
    
  
    
    public static class DetectedPattern {
        private final String patternType;
        private final EObject element;
        private final String description;
        
        public DetectedPattern(String patternType, EObject element, String description) {
            this.patternType = patternType;
            this.element = element;
            this.description = description;
        }
        
        public String getPatternType() { return patternType; }
        public EObject getElement() { return element; }
        public String getDescription() { return description; }
    }
    
    public static class Recommendation {
        private final String title;
        private final RecommendationType type;
        private final EObject element;
        private final String description;
        
        public Recommendation(String title, RecommendationType type, 
                            EObject element, String description) {
            this.title = title;
            this.type = type;
            this.element = element;
            this.description = description;
        }
        
        public String getTitle() { return title; }
        public RecommendationType getType() { return type; }
        public EObject getElement() { return element; }
        public String getDescription() { return description; }
    }
    
    public enum RecommendationType {
        SAFETY_IMPROVEMENT,
        RISK_MITIGATION,
        HAZARD_MITIGATION,
        COMPLETENESS,
        CONSISTENCY,
        PERFORMANCE
    }
}