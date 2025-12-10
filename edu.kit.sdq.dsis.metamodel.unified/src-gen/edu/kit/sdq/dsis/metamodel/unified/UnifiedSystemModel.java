/**
 */
package edu.kit.sdq.dsis.metamodel.unified;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.UnifiedSystemModel#getFmeaAnalysis <em>Fmea Analysis</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.UnifiedSystemModel#getGlobalHazards <em>Global Hazards</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.UnifiedSystemModel#getRootBlocks <em>Root Blocks</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.UnifiedSystemModel#getSystemBlocks <em>System Blocks</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.UnifiedSystemModel#getBlockAssociations <em>Block Associations</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.UnifiedSystemModel#getBlockConnections <em>Block Connections</em>}</li>
 * </ul>
 *
 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getUnifiedSystemModel()
 * @model
 * @generated
 */
public interface UnifiedSystemModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Fmea Analysis</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.sdq.dsis.metamodel.unified.FMEAAnalysis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fmea Analysis</em>' containment reference list.
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getUnifiedSystemModel_FmeaAnalysis()
	 * @model containment="true"
	 * @generated
	 */
	EList<FMEAAnalysis> getFmeaAnalysis();

	/**
	 * Returns the value of the '<em><b>Global Hazards</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.sdq.dsis.metamodel.unified.IntegratedHazard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Hazards</em>' containment reference list.
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getUnifiedSystemModel_GlobalHazards()
	 * @model containment="true"
	 * @generated
	 */
	EList<IntegratedHazard> getGlobalHazards();

	/**
	 * Returns the value of the '<em><b>Root Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.sdq.dsis.metamodel.unified.SafetyCriticalBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Blocks</em>' containment reference list.
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getUnifiedSystemModel_RootBlocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<SafetyCriticalBlock> getRootBlocks();

	/**
	 * Returns the value of the '<em><b>System Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.sdq.dsis.metamodel.unified.SystemBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Blocks</em>' containment reference list.
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getUnifiedSystemModel_SystemBlocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemBlock> getSystemBlocks();

	/**
	 * Returns the value of the '<em><b>Block Associations</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.sdq.dsis.metamodel.unified.BlockAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Associations</em>' containment reference list.
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getUnifiedSystemModel_BlockAssociations()
	 * @model containment="true"
	 * @generated
	 */
	EList<BlockAssociation> getBlockAssociations();

	/**
	 * Returns the value of the '<em><b>Block Connections</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.sdq.dsis.metamodel.unified.BlockConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Connections</em>' containment reference list.
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getUnifiedSystemModel_BlockConnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<BlockConnection> getBlockConnections();

} // UnifiedSystemModel
