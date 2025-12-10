/**
 */
package edu.kit.sdq.dsis.metamodel.unified;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Safety Critical Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * System components that require safety analysis with embedded failure modes and criticality levels
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.SafetyCriticalBlock#getSafetyCriticality <em>Safety Criticality</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.SafetyCriticalBlock#getFailureModes <em>Failure Modes</em>}</li>
 * </ul>
 *
 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getSafetyCriticalBlock()
 * @model
 * @generated
 */
public interface SafetyCriticalBlock extends SystemBlock {
	/**
	 * Returns the value of the '<em><b>Safety Criticality</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.kit.sdq.dsis.metamodel.unified.SafetyCriticalityLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safety Criticality</em>' attribute.
	 * @see edu.kit.sdq.dsis.metamodel.unified.SafetyCriticalityLevel
	 * @see #setSafetyCriticality(SafetyCriticalityLevel)
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getSafetyCriticalBlock_SafetyCriticality()
	 * @model
	 * @generated
	 */
	SafetyCriticalityLevel getSafetyCriticality();

	/**
	 * Sets the value of the '{@link edu.kit.sdq.dsis.metamodel.unified.SafetyCriticalBlock#getSafetyCriticality <em>Safety Criticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Safety Criticality</em>' attribute.
	 * @see edu.kit.sdq.dsis.metamodel.unified.SafetyCriticalityLevel
	 * @see #getSafetyCriticality()
	 * @generated
	 */
	void setSafetyCriticality(SafetyCriticalityLevel value);

	/**
	 * Returns the value of the '<em><b>Failure Modes</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.sdq.dsis.metamodel.unified.BlockFailureMode}.
	 * It is bidirectional and its opposite is '{@link edu.kit.sdq.dsis.metamodel.unified.BlockFailureMode#getAffectedBlock <em>Affected Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Modes</em>' containment reference list.
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getSafetyCriticalBlock_FailureModes()
	 * @see edu.kit.sdq.dsis.metamodel.unified.BlockFailureMode#getAffectedBlock
	 * @model opposite="affectedBlock" containment="true"
	 * @generated
	 */
	EList<BlockFailureMode> getFailureModes();

} // SafetyCriticalBlock
