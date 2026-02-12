/**
 */
package unified;

import java.util.Date;

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
 *   <li>{@link unified.UnifiedSystemModel#getFmeaAnalysis <em>Fmea Analysis</em>}</li>
 *   <li>{@link unified.UnifiedSystemModel#getGlobalHazards <em>Global Hazards</em>}</li>
 *   <li>{@link unified.UnifiedSystemModel#getRootBlocks <em>Root Blocks</em>}</li>
 *   <li>{@link unified.UnifiedSystemModel#getSystemBlocks <em>System Blocks</em>}</li>
 *   <li>{@link unified.UnifiedSystemModel#getBlockAssociations <em>Block Associations</em>}</li>
 *   <li>{@link unified.UnifiedSystemModel#getBlockConnections <em>Block Connections</em>}</li>
 *   <li>{@link unified.UnifiedSystemModel#getAnalysisMetadata <em>Analysis Metadata</em>}</li>
 *   <li>{@link unified.UnifiedSystemModel#getModelVersion <em>Model Version</em>}</li>
 *   <li>{@link unified.UnifiedSystemModel#getLastModified <em>Last Modified</em>}</li>
 * </ul>
 *
 * @see unified.UnifiedPackage#getUnifiedSystemModel()
 * @model
 * @generated
 */
public interface UnifiedSystemModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Fmea Analysis</b></em>' containment reference list.
	 * The list contents are of type {@link unified.FMEAAnalysis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fmea Analysis</em>' containment reference list.
	 * @see unified.UnifiedPackage#getUnifiedSystemModel_FmeaAnalysis()
	 * @model containment="true"
	 * @generated
	 */
	EList<FMEAAnalysis> getFmeaAnalysis();

	/**
	 * Returns the value of the '<em><b>Global Hazards</b></em>' containment reference list.
	 * The list contents are of type {@link unified.IntegratedHazard}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Hazards</em>' containment reference list.
	 * @see unified.UnifiedPackage#getUnifiedSystemModel_GlobalHazards()
	 * @model containment="true"
	 * @generated
	 */
	EList<IntegratedHazard> getGlobalHazards();

	/**
	 * Returns the value of the '<em><b>Root Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link unified.SafetyCriticalBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Blocks</em>' containment reference list.
	 * @see unified.UnifiedPackage#getUnifiedSystemModel_RootBlocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<SafetyCriticalBlock> getRootBlocks();

	/**
	 * Returns the value of the '<em><b>System Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link unified.SystemBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Blocks</em>' containment reference list.
	 * @see unified.UnifiedPackage#getUnifiedSystemModel_SystemBlocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemBlock> getSystemBlocks();

	/**
	 * Returns the value of the '<em><b>Block Associations</b></em>' containment reference list.
	 * The list contents are of type {@link unified.BlockAssociation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Associations</em>' containment reference list.
	 * @see unified.UnifiedPackage#getUnifiedSystemModel_BlockAssociations()
	 * @model containment="true"
	 * @generated
	 */
	EList<BlockAssociation> getBlockAssociations();

	/**
	 * Returns the value of the '<em><b>Block Connections</b></em>' containment reference list.
	 * The list contents are of type {@link unified.BlockConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Connections</em>' containment reference list.
	 * @see unified.UnifiedPackage#getUnifiedSystemModel_BlockConnections()
	 * @model containment="true"
	 * @generated
	 */
	EList<BlockConnection> getBlockConnections();

	/**
	 * Returns the value of the '<em><b>Analysis Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Analysis Metadata</em>' containment reference.
	 * @see #setAnalysisMetadata(AnalysisMetadata)
	 * @see unified.UnifiedPackage#getUnifiedSystemModel_AnalysisMetadata()
	 * @model containment="true"
	 * @generated
	 */
	AnalysisMetadata getAnalysisMetadata();

	/**
	 * Sets the value of the '{@link unified.UnifiedSystemModel#getAnalysisMetadata <em>Analysis Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Analysis Metadata</em>' containment reference.
	 * @see #getAnalysisMetadata()
	 * @generated
	 */
	void setAnalysisMetadata(AnalysisMetadata value);

	/**
	 * Returns the value of the '<em><b>Model Version</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Version</em>' attribute.
	 * @see #setModelVersion(String)
	 * @see unified.UnifiedPackage#getUnifiedSystemModel_ModelVersion()
	 * @model default="1.0"
	 * @generated
	 */
	String getModelVersion();

	/**
	 * Sets the value of the '{@link unified.UnifiedSystemModel#getModelVersion <em>Model Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Version</em>' attribute.
	 * @see #getModelVersion()
	 * @generated
	 */
	void setModelVersion(String value);

	/**
	 * Returns the value of the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Modified</em>' attribute.
	 * @see #setLastModified(Date)
	 * @see unified.UnifiedPackage#getUnifiedSystemModel_LastModified()
	 * @model
	 * @generated
	 */
	Date getLastModified();

	/**
	 * Sets the value of the '{@link unified.UnifiedSystemModel#getLastModified <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Modified</em>' attribute.
	 * @see #getLastModified()
	 * @generated
	 */
	void setLastModified(Date value);

} // UnifiedSystemModel
