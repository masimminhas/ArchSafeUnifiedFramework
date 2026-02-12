/**
 */
package unified;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Stores computed analysis metrics and metadata
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unified.AnalysisMetadata#getLastAnalysisDate <em>Last Analysis Date</em>}</li>
 *   <li>{@link unified.AnalysisMetadata#getCompletenessScore <em>Completeness Score</em>}</li>
 *   <li>{@link unified.AnalysisMetadata#getConsistencyScore <em>Consistency Score</em>}</li>
 *   <li>{@link unified.AnalysisMetadata#getHazardCoverage <em>Hazard Coverage</em>}</li>
 *   <li>{@link unified.AnalysisMetadata#getFmeaCoverage <em>Fmea Coverage</em>}</li>
 *   <li>{@link unified.AnalysisMetadata#getTraceabilityDensity <em>Traceability Density</em>}</li>
 *   <li>{@link unified.AnalysisMetadata#getCyclomaticComplexity <em>Cyclomatic Complexity</em>}</li>
 * </ul>
 *
 * @see unified.UnifiedPackage#getAnalysisMetadata()
 * @model
 * @generated
 */
public interface AnalysisMetadata extends EObject {
	/**
	 * Returns the value of the '<em><b>Last Analysis Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Analysis Date</em>' attribute.
	 * @see #setLastAnalysisDate(Date)
	 * @see unified.UnifiedPackage#getAnalysisMetadata_LastAnalysisDate()
	 * @model
	 * @generated
	 */
	Date getLastAnalysisDate();

	/**
	 * Sets the value of the '{@link unified.AnalysisMetadata#getLastAnalysisDate <em>Last Analysis Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Analysis Date</em>' attribute.
	 * @see #getLastAnalysisDate()
	 * @generated
	 */
	void setLastAnalysisDate(Date value);

	/**
	 * Returns the value of the '<em><b>Completeness Score</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completeness Score</em>' attribute.
	 * @see #setCompletenessScore(int)
	 * @see unified.UnifiedPackage#getAnalysisMetadata_CompletenessScore()
	 * @model default="0"
	 * @generated
	 */
	int getCompletenessScore();

	/**
	 * Sets the value of the '{@link unified.AnalysisMetadata#getCompletenessScore <em>Completeness Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completeness Score</em>' attribute.
	 * @see #getCompletenessScore()
	 * @generated
	 */
	void setCompletenessScore(int value);

	/**
	 * Returns the value of the '<em><b>Consistency Score</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consistency Score</em>' attribute.
	 * @see #setConsistencyScore(int)
	 * @see unified.UnifiedPackage#getAnalysisMetadata_ConsistencyScore()
	 * @model default="0"
	 * @generated
	 */
	int getConsistencyScore();

	/**
	 * Sets the value of the '{@link unified.AnalysisMetadata#getConsistencyScore <em>Consistency Score</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consistency Score</em>' attribute.
	 * @see #getConsistencyScore()
	 * @generated
	 */
	void setConsistencyScore(int value);

	/**
	 * Returns the value of the '<em><b>Hazard Coverage</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazard Coverage</em>' attribute.
	 * @see #setHazardCoverage(double)
	 * @see unified.UnifiedPackage#getAnalysisMetadata_HazardCoverage()
	 * @model default="0.0"
	 * @generated
	 */
	double getHazardCoverage();

	/**
	 * Sets the value of the '{@link unified.AnalysisMetadata#getHazardCoverage <em>Hazard Coverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hazard Coverage</em>' attribute.
	 * @see #getHazardCoverage()
	 * @generated
	 */
	void setHazardCoverage(double value);

	/**
	 * Returns the value of the '<em><b>Fmea Coverage</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fmea Coverage</em>' attribute.
	 * @see #setFmeaCoverage(double)
	 * @see unified.UnifiedPackage#getAnalysisMetadata_FmeaCoverage()
	 * @model default="0.0"
	 * @generated
	 */
	double getFmeaCoverage();

	/**
	 * Sets the value of the '{@link unified.AnalysisMetadata#getFmeaCoverage <em>Fmea Coverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fmea Coverage</em>' attribute.
	 * @see #getFmeaCoverage()
	 * @generated
	 */
	void setFmeaCoverage(double value);

	/**
	 * Returns the value of the '<em><b>Traceability Density</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Traceability Density</em>' attribute.
	 * @see #setTraceabilityDensity(double)
	 * @see unified.UnifiedPackage#getAnalysisMetadata_TraceabilityDensity()
	 * @model default="0.0"
	 * @generated
	 */
	double getTraceabilityDensity();

	/**
	 * Sets the value of the '{@link unified.AnalysisMetadata#getTraceabilityDensity <em>Traceability Density</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traceability Density</em>' attribute.
	 * @see #getTraceabilityDensity()
	 * @generated
	 */
	void setTraceabilityDensity(double value);

	/**
	 * Returns the value of the '<em><b>Cyclomatic Complexity</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cyclomatic Complexity</em>' attribute.
	 * @see #setCyclomaticComplexity(int)
	 * @see unified.UnifiedPackage#getAnalysisMetadata_CyclomaticComplexity()
	 * @model default="0"
	 * @generated
	 */
	int getCyclomaticComplexity();

	/**
	 * Sets the value of the '{@link unified.AnalysisMetadata#getCyclomaticComplexity <em>Cyclomatic Complexity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cyclomatic Complexity</em>' attribute.
	 * @see #getCyclomaticComplexity()
	 * @generated
	 */
	void setCyclomaticComplexity(int value);

} // AnalysisMetadata
