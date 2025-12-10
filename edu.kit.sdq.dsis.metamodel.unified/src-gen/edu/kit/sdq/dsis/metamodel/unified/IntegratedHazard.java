/**
 */
package edu.kit.sdq.dsis.metamodel.unified;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integrated Hazard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * System-level dangers that span multiple components with risk level quantification
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.IntegratedHazard#getRiskLevel <em>Risk Level</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.IntegratedHazard#getRelatedBlocks <em>Related Blocks</em>}</li>
 * </ul>
 *
 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getIntegratedHazard()
 * @model
 * @generated
 */
public interface IntegratedHazard extends UnifiedElement {
	/**
	 * Returns the value of the '<em><b>Risk Level</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.kit.sdq.dsis.metamodel.unified.RiskLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risk Level</em>' attribute.
	 * @see edu.kit.sdq.dsis.metamodel.unified.RiskLevel
	 * @see #setRiskLevel(RiskLevel)
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getIntegratedHazard_RiskLevel()
	 * @model
	 * @generated
	 */
	RiskLevel getRiskLevel();

	/**
	 * Sets the value of the '{@link edu.kit.sdq.dsis.metamodel.unified.IntegratedHazard#getRiskLevel <em>Risk Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Level</em>' attribute.
	 * @see edu.kit.sdq.dsis.metamodel.unified.RiskLevel
	 * @see #getRiskLevel()
	 * @generated
	 */
	void setRiskLevel(RiskLevel value);

	/**
	 * Returns the value of the '<em><b>Related Blocks</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.sdq.dsis.metamodel.unified.SafetyCriticalBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related Blocks</em>' reference list.
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getIntegratedHazard_RelatedBlocks()
	 * @model
	 * @generated
	 */
	EList<SafetyCriticalBlock> getRelatedBlocks();

} // IntegratedHazard
