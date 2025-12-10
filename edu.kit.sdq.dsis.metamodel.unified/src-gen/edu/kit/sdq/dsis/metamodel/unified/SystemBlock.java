/**
 */
package edu.kit.sdq.dsis.metamodel.unified;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Regular system components without mandatory safety annotations for non-critical parts
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.SystemBlock#getSubBlocks <em>Sub Blocks</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.SystemBlock#getParentBlock <em>Parent Block</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.SystemBlock#getAssociationAsSource <em>Association As Source</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.SystemBlock#getAssociationAsTarget <em>Association As Target</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.SystemBlock#getConnectionAsSource <em>Connection As Source</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.SystemBlock#getConnectionAsTarget <em>Connection As Target</em>}</li>
 * </ul>
 *
 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getSystemBlock()
 * @model
 * @generated
 */
public interface SystemBlock extends UnifiedElement {
	/**
	 * Returns the value of the '<em><b>Sub Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.sdq.dsis.metamodel.unified.SystemBlock}.
	 * It is bidirectional and its opposite is '{@link edu.kit.sdq.dsis.metamodel.unified.SystemBlock#getParentBlock <em>Parent Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Blocks</em>' containment reference list.
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getSystemBlock_SubBlocks()
	 * @see edu.kit.sdq.dsis.metamodel.unified.SystemBlock#getParentBlock
	 * @model opposite="parentBlock" containment="true"
	 * @generated
	 */
	EList<SystemBlock> getSubBlocks();

	/**
	 * Returns the value of the '<em><b>Parent Block</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link edu.kit.sdq.dsis.metamodel.unified.SystemBlock#getSubBlocks <em>Sub Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Block</em>' container reference.
	 * @see #setParentBlock(SystemBlock)
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getSystemBlock_ParentBlock()
	 * @see edu.kit.sdq.dsis.metamodel.unified.SystemBlock#getSubBlocks
	 * @model opposite="subBlocks" transient="false"
	 * @generated
	 */
	SystemBlock getParentBlock();

	/**
	 * Sets the value of the '{@link edu.kit.sdq.dsis.metamodel.unified.SystemBlock#getParentBlock <em>Parent Block</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Block</em>' container reference.
	 * @see #getParentBlock()
	 * @generated
	 */
	void setParentBlock(SystemBlock value);

	/**
	 * Returns the value of the '<em><b>Association As Source</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.sdq.dsis.metamodel.unified.BlockAssociation}.
	 * It is bidirectional and its opposite is '{@link edu.kit.sdq.dsis.metamodel.unified.BlockAssociation#getSourceBlock <em>Source Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association As Source</em>' reference list.
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getSystemBlock_AssociationAsSource()
	 * @see edu.kit.sdq.dsis.metamodel.unified.BlockAssociation#getSourceBlock
	 * @model opposite="sourceBlock"
	 * @generated
	 */
	EList<BlockAssociation> getAssociationAsSource();

	/**
	 * Returns the value of the '<em><b>Association As Target</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.sdq.dsis.metamodel.unified.BlockAssociation}.
	 * It is bidirectional and its opposite is '{@link edu.kit.sdq.dsis.metamodel.unified.BlockAssociation#getTargetBlock <em>Target Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association As Target</em>' reference list.
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getSystemBlock_AssociationAsTarget()
	 * @see edu.kit.sdq.dsis.metamodel.unified.BlockAssociation#getTargetBlock
	 * @model opposite="targetBlock"
	 * @generated
	 */
	EList<BlockAssociation> getAssociationAsTarget();

	/**
	 * Returns the value of the '<em><b>Connection As Source</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.sdq.dsis.metamodel.unified.BlockConnection}.
	 * It is bidirectional and its opposite is '{@link edu.kit.sdq.dsis.metamodel.unified.BlockConnection#getFromBlock <em>From Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection As Source</em>' reference list.
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getSystemBlock_ConnectionAsSource()
	 * @see edu.kit.sdq.dsis.metamodel.unified.BlockConnection#getFromBlock
	 * @model opposite="fromBlock"
	 * @generated
	 */
	EList<BlockConnection> getConnectionAsSource();

	/**
	 * Returns the value of the '<em><b>Connection As Target</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.sdq.dsis.metamodel.unified.BlockConnection}.
	 * It is bidirectional and its opposite is '{@link edu.kit.sdq.dsis.metamodel.unified.BlockConnection#getToBlock <em>To Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection As Target</em>' reference list.
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getSystemBlock_ConnectionAsTarget()
	 * @see edu.kit.sdq.dsis.metamodel.unified.BlockConnection#getToBlock
	 * @model opposite="toBlock"
	 * @generated
	 */
	EList<BlockConnection> getConnectionAsTarget();

} // SystemBlock
