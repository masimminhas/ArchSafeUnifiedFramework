package edu.kit.sdq.dsis.unified.services;

import unified.AnalysisMetadata;
import unified.FMEAAnalysis;
import unified.FMEAItem;
import unified.FunctionalSafetyRequirement;
import unified.IntegratedHazard;
import unified.SafetyGoal;
import unified.SafetyMechanism;
import unified.TechnicalSafetyRequirement;
import unified.UnifiedSystemModel;

import java.util.List;
import java.util.stream.Collectors;

public class MetricsService {

    // ── HTI: Hazard Traceability Index ─────────────────────────────────────
    // HTI = hazards that have a relatedHazard reference from a SafetyGoal / total hazards
    public double computeHTI(UnifiedSystemModel model) {
        List<IntegratedHazard> allHazards = model.getGlobalHazards();
        if (allHazards.isEmpty()) return 0.0;

        List<IntegratedHazard> coveredHazards = model.getSafetyGoals().stream()
            .filter(sg -> sg.getRelatedHazard() != null)
            .map(SafetyGoal::getRelatedHazard)
            .distinct()
            .collect(Collectors.toList());

        return (double) coveredHazards.size() / allHazards.size();
    }

    // ── RAR: Requirement Allocation Ratio ──────────────────────────────────
    // RAR = TechnicalSafetyRequirements with non-empty realizedBy / total TSRs
    public double computeRAR(UnifiedSystemModel model) {
        List<TechnicalSafetyRequirement> allTSR = model.getTechnicalRequirements();
        if (allTSR.isEmpty()) return 0.0;

        long allocated = allTSR.stream()
            .filter(tsr -> !tsr.getRealizedBy().isEmpty())
            .count();

        return (double) allocated / allTSR.size();
    }

    // ── FLC: FMEA Linkage Completeness ─────────────────────────────────────
    // FLC = FMEAItems with non-null failureMode reference / total FMEAItems
    public double computeFLC(UnifiedSystemModel model) {
        List<FMEAItem> allItems = model.getFmeaAnalysis().stream()
            .flatMap(fmea -> fmea.getFmeaItems().stream())
            .collect(Collectors.toList());
        if (allItems.isEmpty()) return 0.0;

        long linked = allItems.stream()
            .filter(item -> item.getFailureMode() != null)
            .count();

        return (double) linked / allItems.size();
    }

    // ── MVR: Mechanism Verification Rate ───────────────────────────────────
    // MVR = SafetyMechanisms with non-empty validatedBy / total mechanisms
    public double computeMVR(UnifiedSystemModel model) {
        List<SafetyMechanism> allMechanisms = model.getSafetyMechanisms();
        if (allMechanisms.isEmpty()) return 0.0;

        long verified = allMechanisms.stream()
            .filter(sm -> !sm.getValidatedBy().isEmpty())
            .count();

        return (double) verified / allMechanisms.size();
    }

    // ── TDS: Traceability Density Score ────────────────────────────────────
    // Counts actual cross-layer reference edges across 4 layers:
    // Layer 1→2: SafetyGoal.relatedHazard
    // Layer 2→3: SafetyGoal.allocatedTo (→ FunctionalSafetyRequirement)
    // Layer 3→4: FunctionalSafetyRequirement.refinedTo (→ TechnicalSafetyRequirement)
    // Layer 4→5: TechnicalSafetyRequirement.realizedBy (→ SafetyCriticalBlock)
    // Layer 5→6: TechnicalSafetyRequirement.verifiedBy (→ FMEAItem)
    // Layer 6→7: FMEAItem.validatesMechanisms (→ SafetyMechanism)
    // Theoretical max = N_elements × (N_layers - 1)
    public double computeTDS(UnifiedSystemModel model) {
        int actualLinks = 0;
        int theoreticalMax = 0;

        // Count actual links
        for (SafetyGoal sg : model.getSafetyGoals()) {
            if (sg.getRelatedHazard() != null) actualLinks++;
            actualLinks += sg.getAllocatedTo().size();
            theoreticalMax += 2; // one for hazard link, one for FSR allocation
        }
        for (FunctionalSafetyRequirement fsr : model.getFunctionalRequirements()) {
            actualLinks += fsr.getRefinedTo().size();
            actualLinks += fsr.getImplementedBy().size();
            theoreticalMax += 2;
        }
        for (TechnicalSafetyRequirement tsr : model.getTechnicalRequirements()) {
            actualLinks += tsr.getRealizedBy().size();
            actualLinks += tsr.getVerifiedBy().size();
            theoreticalMax += 2;
        }
        for (FMEAAnalysis fmea : model.getFmeaAnalysis()) {
            for (FMEAItem item : fmea.getFmeaItems()) {
                actualLinks += item.getValidatesMechanisms().size();
                theoreticalMax += 1;
            }
        }

        if (theoreticalMax == 0) return 0.0;
        return Math.min(1.0, (double) actualLinks / theoreticalMax);
    }

    // ── MCR: Metamodel Coverage Ratio (structural, not runtime) ───────────
    // Checks presence of all 9 required concept types in the model instance
    public double computeMCR(UnifiedSystemModel model) {
        int present = 0;
        int required = 9; // adjust to match your required concept list

        if (!model.getGlobalHazards().isEmpty())           present++;
        if (!model.getSafetyGoals().isEmpty())             present++;
        if (!model.getFunctionalRequirements().isEmpty())  present++;
        if (!model.getTechnicalRequirements().isEmpty())   present++;
        if (!model.getSafetyMechanisms().isEmpty())        present++;
        if (!model.getFmeaAnalysis().isEmpty())            present++;
        if (!model.getRootBlocks().isEmpty())              present++;
        if (!model.getSystemBlocks().isEmpty())            present++;
        if (model.getAnalysisMetadata() != null)           present++;

        return (double) present / required;
    }

    // ── Formatted display helpers (for table label expressions) ──────────
    public String htiLabel(UnifiedSystemModel model) {
        double v = computeHTI(model);
        return String.format("HTI = %.2f  (%s)", v, v >= 1.0 ? "✓ PASS" : "⚠ FAIL");
    }
    public String rarLabel(UnifiedSystemModel model) {
        double v = computeRAR(model);
        return String.format("RAR = %.2f  (%s)", v, v >= 0.95 ? "✓ PASS" : "⚠ FAIL");
    }
    public String flcLabel(UnifiedSystemModel model) {
        double v = computeFLC(model);
        return String.format("FLC = %.2f  (%s)", v, v >= 1.0 ? "✓ PASS" : "⚠ FAIL");
    }
    public String mvrLabel(UnifiedSystemModel model) {
        double v = computeMVR(model);
        return String.format("MVR = %.2f  (%s)", v, v >= 0.85 ? "✓ PASS" : "⚠ FAIL");
    }
    public String tdsLabel(UnifiedSystemModel model) {
        double v = computeTDS(model);
        return String.format("TDS = %.2f  (%s)", v, v >= 0.80 ? "✓ PASS" : "~ MONITOR");
    }
    public String mcrLabel(UnifiedSystemModel model) {
        double v = computeMCR(model);
        return String.format("MCR = %.2f  (%s)", v, v >= 0.90 ? "✓ PASS" : "⚠ FAIL");
    }

    // ── Write-back: update AnalysisMetadata on demand ──────────────────────
    // Called from a Sirius tool button: "Refresh Metrics"
    public UnifiedSystemModel refreshAllMetrics(UnifiedSystemModel model) {
        AnalysisMetadata meta = model.getAnalysisMetadata();
        if (meta != null) {
            meta.setTraceabilityDensity(computeTDS(model));
            meta.setHazardCoverage(computeHTI(model));
            meta.setFmeaCoverage(computeFLC(model));
            // completeness = average of MCR, RAR, MVR
            double completeness = (computeMCR(model) + computeRAR(model) + computeMVR(model)) / 3.0;
            meta.setCompletenessScore((int)(completeness * 100));
        }
        return model;
    }
}