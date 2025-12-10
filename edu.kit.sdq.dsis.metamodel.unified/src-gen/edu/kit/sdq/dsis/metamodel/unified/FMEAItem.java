/**
 */
package edu.kit.sdq.dsis.metamodel.unified;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FMEA Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getSeverity <em>Severity</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getOccurrence <em>Occurrence</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getDetection <em>Detection</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getLocalEffect <em>Local Effect</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getSystemEffect <em>System Effect</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getRecommendedAction <em>Recommended Action</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getActionStatus <em>Action Status</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getFailureMode <em>Failure Mode</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getAnalyzedComponent <em>Analyzed Component</em>}</li>
 * </ul>
 *
 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getFMEAItem()
 * @model
 * @generated
 */
public interface FMEAItem extends UnifiedElement {
	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see #setSeverity(int)
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getFMEAItem_Severity()
	 * @model
	 * @generated
	 */
	int getSeverity();

	/**
	 * Sets the value of the '{@link edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(int value);

	/**
	 * Returns the value of the '<em><b>Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence</em>' attribute.
	 * @see #setOccurrence(int)
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getFMEAItem_Occurrence()
	 * @model
	 * @generated
	 */
	int getOccurrence();

	/**
	 * Sets the value of the '{@link edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getOccurrence <em>Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence</em>' attribute.
	 * @see #getOccurrence()
	 * @generated
	 */
	void setOccurrence(int value);

	/**
	 * Returns the value of the '<em><b>Detection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Detection</em>' attribute.
	 * @see #setDetection(int)
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getFMEAItem_Detection()
	 * @model
	 * @generated
	 */
	int getDetection();

	/**
	 * Sets the value of the '{@link edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getDetection <em>Detection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detection</em>' attribute.
	 * @see #getDetection()
	 * @generated
	 */
	void setDetection(int value);

	/**
	 * Returns the value of the '<em><b>Local Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Effect</em>' attribute.
	 * @see #setLocalEffect(String)
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getFMEAItem_LocalEffect()
	 * @model
	 * @generated
	 */
	String getLocalEffect();

	/**
	 * Sets the value of the '{@link edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getLocalEffect <em>Local Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Effect</em>' attribute.
	 * @see #getLocalEffect()
	 * @generated
	 */
	void setLocalEffect(String value);

	/**
	 * Returns the value of the '<em><b>System Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Effect</em>' attribute.
	 * @see #setSystemEffect(String)
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getFMEAItem_SystemEffect()
	 * @model
	 * @generated
	 */
	String getSystemEffect();

	/**
	 * Sets the value of the '{@link edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getSystemEffect <em>System Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Effect</em>' attribute.
	 * @see #getSystemEffect()
	 * @generated
	 */
	void setSystemEffect(String value);

	/**
	 * Returns the value of the '<em><b>Recommended Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recommended Action</em>' attribute.
	 * @see #setRecommendedAction(String)
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getFMEAItem_RecommendedAction()
	 * @model
	 * @generated
	 */
	String getRecommendedAction();

	/**
	 * Sets the value of the '{@link edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getRecommendedAction <em>Recommended Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recommended Action</em>' attribute.
	 * @see #getRecommendedAction()
	 * @generated
	 */
	void setRecommendedAction(String value);

	/**
	 * Returns the value of the '<em><b>Action Status</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.kit.sdq.dsis.metamodel.unified.ActionStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Status</em>' attribute.
	 * @see edu.kit.sdq.dsis.metamodel.unified.ActionStatus
	 * @see #setActionStatus(ActionStatus)
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getFMEAItem_ActionStatus()
	 * @model
	 * @generated
	 */
	ActionStatus getActionStatus();

	/**
	 * Sets the value of the '{@link edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getActionStatus <em>Action Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Status</em>' attribute.
	 * @see edu.kit.sdq.dsis.metamodel.unified.ActionStatus
	 * @see #getActionStatus()
	 * @generated
	 */
	void setActionStatus(ActionStatus value);

	/**
	 * Returns the value of the '<em><b>Failure Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Mode</em>' reference.
	 * @see #setFailureMode(BlockFailureMode)
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getFMEAItem_FailureMode()
	 * @model
	 * @generated
	 */
	BlockFailureMode getFailureMode();

	/**
	 * Sets the value of the '{@link edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getFailureMode <em>Failure Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Mode</em>' reference.
	 * @see #getFailureMode()
	 * @generated
	 */
	void setFailureMode(BlockFailureMode value);

	/**
	 * Returns the value of the '<em><b>Analyzed Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analyzed Component</em>' reference.
	 * @see #setAnalyzedComponent(SafetyCriticalBlock)
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getFMEAItem_AnalyzedComponent()
	 * @model required="true"
	 * @generated
	 */
	SafetyCriticalBlock getAnalyzedComponent();

	/**
	 * Sets the value of the '{@link edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getAnalyzedComponent <em>Analyzed Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analyzed Component</em>' reference.
	 * @see #getAnalyzedComponent()
	 * @generated
	 */
	void setAnalyzedComponent(SafetyCriticalBlock value);

} // FMEAItem
