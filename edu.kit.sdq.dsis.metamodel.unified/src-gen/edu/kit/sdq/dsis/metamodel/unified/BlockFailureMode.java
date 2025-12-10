/**
 */
package edu.kit.sdq.dsis.metamodel.unified;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Failure Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specific failure scenarios attached directly to system components with detectability and severity metrics
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.BlockFailureMode#getAffectedBlock <em>Affected Block</em>}</li>
 * </ul>
 *
 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getBlockFailureMode()
 * @model
 * @generated
 */
public interface BlockFailureMode extends UnifiedElement {
	/**
	 * Returns the value of the '<em><b>Affected Block</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.sdq.dsis.metamodel.unified.SafetyCriticalBlock#getFailureModes <em>Failure Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Affected Block</em>' container reference.
	 * @see #setAffectedBlock(SafetyCriticalBlock)
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getBlockFailureMode_AffectedBlock()
	 * @see edu.kit.sdq.dsis.metamodel.unified.SafetyCriticalBlock#getFailureModes
	 * @model opposite="failureModes" transient="false"
	 * @generated
	 */
	SafetyCriticalBlock getAffectedBlock();

	/**
	 * Sets the value of the '{@link edu.kit.sdq.dsis.metamodel.unified.BlockFailureMode#getAffectedBlock <em>Affected Block</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affected Block</em>' container reference.
	 * @see #getAffectedBlock()
	 * @generated
	 */
	void setAffectedBlock(SafetyCriticalBlock value);

} // BlockFailureMode
