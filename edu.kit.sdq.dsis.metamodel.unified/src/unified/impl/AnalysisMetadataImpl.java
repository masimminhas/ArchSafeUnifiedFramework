/**
 */
package unified.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import unified.AnalysisMetadata;
import unified.UnifiedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analysis Metadata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link unified.impl.AnalysisMetadataImpl#getLastAnalysisDate <em>Last Analysis Date</em>}</li>
 *   <li>{@link unified.impl.AnalysisMetadataImpl#getCompletenessScore <em>Completeness Score</em>}</li>
 *   <li>{@link unified.impl.AnalysisMetadataImpl#getConsistencyScore <em>Consistency Score</em>}</li>
 *   <li>{@link unified.impl.AnalysisMetadataImpl#getHazardCoverage <em>Hazard Coverage</em>}</li>
 *   <li>{@link unified.impl.AnalysisMetadataImpl#getFmeaCoverage <em>Fmea Coverage</em>}</li>
 *   <li>{@link unified.impl.AnalysisMetadataImpl#getTraceabilityDensity <em>Traceability Density</em>}</li>
 *   <li>{@link unified.impl.AnalysisMetadataImpl#getCyclomaticComplexity <em>Cyclomatic Complexity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalysisMetadataImpl extends MinimalEObjectImpl.Container implements AnalysisMetadata {
	/**
	 * The default value of the '{@link #getLastAnalysisDate() <em>Last Analysis Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastAnalysisDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_ANALYSIS_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastAnalysisDate() <em>Last Analysis Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastAnalysisDate()
	 * @generated
	 * @ordered
	 */
	protected Date lastAnalysisDate = LAST_ANALYSIS_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompletenessScore() <em>Completeness Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletenessScore()
	 * @generated
	 * @ordered
	 */
	protected static final int COMPLETENESS_SCORE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCompletenessScore() <em>Completeness Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletenessScore()
	 * @generated
	 * @ordered
	 */
	protected int completenessScore = COMPLETENESS_SCORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsistencyScore() <em>Consistency Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistencyScore()
	 * @generated
	 * @ordered
	 */
	protected static final int CONSISTENCY_SCORE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getConsistencyScore() <em>Consistency Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistencyScore()
	 * @generated
	 * @ordered
	 */
	protected int consistencyScore = CONSISTENCY_SCORE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHazardCoverage() <em>Hazard Coverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardCoverage()
	 * @generated
	 * @ordered
	 */
	protected static final double HAZARD_COVERAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHazardCoverage() <em>Hazard Coverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazardCoverage()
	 * @generated
	 * @ordered
	 */
	protected double hazardCoverage = HAZARD_COVERAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFmeaCoverage() <em>Fmea Coverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFmeaCoverage()
	 * @generated
	 * @ordered
	 */
	protected static final double FMEA_COVERAGE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFmeaCoverage() <em>Fmea Coverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFmeaCoverage()
	 * @generated
	 * @ordered
	 */
	protected double fmeaCoverage = FMEA_COVERAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTraceabilityDensity() <em>Traceability Density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceabilityDensity()
	 * @generated
	 * @ordered
	 */
	protected static final double TRACEABILITY_DENSITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTraceabilityDensity() <em>Traceability Density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceabilityDensity()
	 * @generated
	 * @ordered
	 */
	protected double traceabilityDensity = TRACEABILITY_DENSITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCyclomaticComplexity() <em>Cyclomatic Complexity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCyclomaticComplexity()
	 * @generated
	 * @ordered
	 */
	protected static final int CYCLOMATIC_COMPLEXITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCyclomaticComplexity() <em>Cyclomatic Complexity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCyclomaticComplexity()
	 * @generated
	 * @ordered
	 */
	protected int cyclomaticComplexity = CYCLOMATIC_COMPLEXITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnalysisMetadataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnifiedPackage.Literals.ANALYSIS_METADATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastAnalysisDate() {
		return lastAnalysisDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastAnalysisDate(Date newLastAnalysisDate) {
		Date oldLastAnalysisDate = lastAnalysisDate;
		lastAnalysisDate = newLastAnalysisDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedPackage.ANALYSIS_METADATA__LAST_ANALYSIS_DATE, oldLastAnalysisDate, lastAnalysisDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCompletenessScore() {
		return completenessScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletenessScore(int newCompletenessScore) {
		int oldCompletenessScore = completenessScore;
		completenessScore = newCompletenessScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedPackage.ANALYSIS_METADATA__COMPLETENESS_SCORE, oldCompletenessScore, completenessScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getConsistencyScore() {
		return consistencyScore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsistencyScore(int newConsistencyScore) {
		int oldConsistencyScore = consistencyScore;
		consistencyScore = newConsistencyScore;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedPackage.ANALYSIS_METADATA__CONSISTENCY_SCORE, oldConsistencyScore, consistencyScore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHazardCoverage() {
		return hazardCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHazardCoverage(double newHazardCoverage) {
		double oldHazardCoverage = hazardCoverage;
		hazardCoverage = newHazardCoverage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedPackage.ANALYSIS_METADATA__HAZARD_COVERAGE, oldHazardCoverage, hazardCoverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getFmeaCoverage() {
		return fmeaCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFmeaCoverage(double newFmeaCoverage) {
		double oldFmeaCoverage = fmeaCoverage;
		fmeaCoverage = newFmeaCoverage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedPackage.ANALYSIS_METADATA__FMEA_COVERAGE, oldFmeaCoverage, fmeaCoverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTraceabilityDensity() {
		return traceabilityDensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceabilityDensity(double newTraceabilityDensity) {
		double oldTraceabilityDensity = traceabilityDensity;
		traceabilityDensity = newTraceabilityDensity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedPackage.ANALYSIS_METADATA__TRACEABILITY_DENSITY, oldTraceabilityDensity, traceabilityDensity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCyclomaticComplexity() {
		return cyclomaticComplexity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCyclomaticComplexity(int newCyclomaticComplexity) {
		int oldCyclomaticComplexity = cyclomaticComplexity;
		cyclomaticComplexity = newCyclomaticComplexity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedPackage.ANALYSIS_METADATA__CYCLOMATIC_COMPLEXITY, oldCyclomaticComplexity, cyclomaticComplexity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UnifiedPackage.ANALYSIS_METADATA__LAST_ANALYSIS_DATE:
				return getLastAnalysisDate();
			case UnifiedPackage.ANALYSIS_METADATA__COMPLETENESS_SCORE:
				return getCompletenessScore();
			case UnifiedPackage.ANALYSIS_METADATA__CONSISTENCY_SCORE:
				return getConsistencyScore();
			case UnifiedPackage.ANALYSIS_METADATA__HAZARD_COVERAGE:
				return getHazardCoverage();
			case UnifiedPackage.ANALYSIS_METADATA__FMEA_COVERAGE:
				return getFmeaCoverage();
			case UnifiedPackage.ANALYSIS_METADATA__TRACEABILITY_DENSITY:
				return getTraceabilityDensity();
			case UnifiedPackage.ANALYSIS_METADATA__CYCLOMATIC_COMPLEXITY:
				return getCyclomaticComplexity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UnifiedPackage.ANALYSIS_METADATA__LAST_ANALYSIS_DATE:
				setLastAnalysisDate((Date)newValue);
				return;
			case UnifiedPackage.ANALYSIS_METADATA__COMPLETENESS_SCORE:
				setCompletenessScore((Integer)newValue);
				return;
			case UnifiedPackage.ANALYSIS_METADATA__CONSISTENCY_SCORE:
				setConsistencyScore((Integer)newValue);
				return;
			case UnifiedPackage.ANALYSIS_METADATA__HAZARD_COVERAGE:
				setHazardCoverage((Double)newValue);
				return;
			case UnifiedPackage.ANALYSIS_METADATA__FMEA_COVERAGE:
				setFmeaCoverage((Double)newValue);
				return;
			case UnifiedPackage.ANALYSIS_METADATA__TRACEABILITY_DENSITY:
				setTraceabilityDensity((Double)newValue);
				return;
			case UnifiedPackage.ANALYSIS_METADATA__CYCLOMATIC_COMPLEXITY:
				setCyclomaticComplexity((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UnifiedPackage.ANALYSIS_METADATA__LAST_ANALYSIS_DATE:
				setLastAnalysisDate(LAST_ANALYSIS_DATE_EDEFAULT);
				return;
			case UnifiedPackage.ANALYSIS_METADATA__COMPLETENESS_SCORE:
				setCompletenessScore(COMPLETENESS_SCORE_EDEFAULT);
				return;
			case UnifiedPackage.ANALYSIS_METADATA__CONSISTENCY_SCORE:
				setConsistencyScore(CONSISTENCY_SCORE_EDEFAULT);
				return;
			case UnifiedPackage.ANALYSIS_METADATA__HAZARD_COVERAGE:
				setHazardCoverage(HAZARD_COVERAGE_EDEFAULT);
				return;
			case UnifiedPackage.ANALYSIS_METADATA__FMEA_COVERAGE:
				setFmeaCoverage(FMEA_COVERAGE_EDEFAULT);
				return;
			case UnifiedPackage.ANALYSIS_METADATA__TRACEABILITY_DENSITY:
				setTraceabilityDensity(TRACEABILITY_DENSITY_EDEFAULT);
				return;
			case UnifiedPackage.ANALYSIS_METADATA__CYCLOMATIC_COMPLEXITY:
				setCyclomaticComplexity(CYCLOMATIC_COMPLEXITY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UnifiedPackage.ANALYSIS_METADATA__LAST_ANALYSIS_DATE:
				return LAST_ANALYSIS_DATE_EDEFAULT == null ? lastAnalysisDate != null : !LAST_ANALYSIS_DATE_EDEFAULT.equals(lastAnalysisDate);
			case UnifiedPackage.ANALYSIS_METADATA__COMPLETENESS_SCORE:
				return completenessScore != COMPLETENESS_SCORE_EDEFAULT;
			case UnifiedPackage.ANALYSIS_METADATA__CONSISTENCY_SCORE:
				return consistencyScore != CONSISTENCY_SCORE_EDEFAULT;
			case UnifiedPackage.ANALYSIS_METADATA__HAZARD_COVERAGE:
				return hazardCoverage != HAZARD_COVERAGE_EDEFAULT;
			case UnifiedPackage.ANALYSIS_METADATA__FMEA_COVERAGE:
				return fmeaCoverage != FMEA_COVERAGE_EDEFAULT;
			case UnifiedPackage.ANALYSIS_METADATA__TRACEABILITY_DENSITY:
				return traceabilityDensity != TRACEABILITY_DENSITY_EDEFAULT;
			case UnifiedPackage.ANALYSIS_METADATA__CYCLOMATIC_COMPLEXITY:
				return cyclomaticComplexity != CYCLOMATIC_COMPLEXITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (lastAnalysisDate: ");
		result.append(lastAnalysisDate);
		result.append(", completenessScore: ");
		result.append(completenessScore);
		result.append(", consistencyScore: ");
		result.append(consistencyScore);
		result.append(", hazardCoverage: ");
		result.append(hazardCoverage);
		result.append(", fmeaCoverage: ");
		result.append(fmeaCoverage);
		result.append(", traceabilityDensity: ");
		result.append(traceabilityDensity);
		result.append(", cyclomaticComplexity: ");
		result.append(cyclomaticComplexity);
		result.append(')');
		return result.toString();
	}

} //AnalysisMetadataImpl
