/**
 */
package edu.kit.sdq.dsis.metamodel.unified;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.BlockConnection#getConnectionType <em>Connection Type</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.BlockConnection#getFromBlock <em>From Block</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.BlockConnection#getToBlock <em>To Block</em>}</li>
 * </ul>
 *
 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getBlockConnection()
 * @model
 * @generated
 */
public interface BlockConnection extends UnifiedElement {
	/**
	 * Returns the value of the '<em><b>Connection Type</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.kit.sdq.dsis.metamodel.unified.ConnectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Type</em>' attribute.
	 * @see edu.kit.sdq.dsis.metamodel.unified.ConnectionType
	 * @see #setConnectionType(ConnectionType)
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getBlockConnection_ConnectionType()
	 * @model
	 * @generated
	 */
	ConnectionType getConnectionType();

	/**
	 * Sets the value of the '{@link edu.kit.sdq.dsis.metamodel.unified.BlockConnection#getConnectionType <em>Connection Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Type</em>' attribute.
	 * @see edu.kit.sdq.dsis.metamodel.unified.ConnectionType
	 * @see #getConnectionType()
	 * @generated
	 */
	void setConnectionType(ConnectionType value);

	/**
	 * Returns the value of the '<em><b>From Block</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.sdq.dsis.metamodel.unified.SystemBlock}.
	 * It is bidirectional and its opposite is '{@link edu.kit.sdq.dsis.metamodel.unified.SystemBlock#getConnectionAsSource <em>Connection As Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Block</em>' reference list.
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getBlockConnection_FromBlock()
	 * @see edu.kit.sdq.dsis.metamodel.unified.SystemBlock#getConnectionAsSource
	 * @model opposite="connectionAsSource" required="true"
	 * @generated
	 */
	EList<SystemBlock> getFromBlock();

	/**
	 * Returns the value of the '<em><b>To Block</b></em>' reference list.
	 * The list contents are of type {@link edu.kit.sdq.dsis.metamodel.unified.SystemBlock}.
	 * It is bidirectional and its opposite is '{@link edu.kit.sdq.dsis.metamodel.unified.SystemBlock#getConnectionAsTarget <em>Connection As Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Block</em>' reference list.
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getBlockConnection_ToBlock()
	 * @see edu.kit.sdq.dsis.metamodel.unified.SystemBlock#getConnectionAsTarget
	 * @model opposite="connectionAsTarget" required="true"
	 * @generated
	 */
	EList<SystemBlock> getToBlock();

} // BlockConnection
