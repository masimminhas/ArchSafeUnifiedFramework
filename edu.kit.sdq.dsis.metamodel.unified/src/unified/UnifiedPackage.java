/**
 */
package unified;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see unified.UnifiedFactory
 * @model kind="package"
 * @generated
 */
public interface UnifiedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "unified";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://edu.kit.sdq.dsis.metamodel/unified";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "unified";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UnifiedPackage eINSTANCE = unified.impl.UnifiedPackageImpl.init();

	/**
	 * The meta object id for the '{@link unified.impl.UnifiedElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unified.impl.UnifiedElementImpl
	 * @see unified.impl.UnifiedPackageImpl#getUnifiedElement()
	 * @generated
	 */
	int UNIFIED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFIED_ELEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFIED_ELEMENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFIED_ELEMENT__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFIED_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFIED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link unified.impl.UnifiedSystemModelImpl <em>System Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unified.impl.UnifiedSystemModelImpl
	 * @see unified.impl.UnifiedPackageImpl#getUnifiedSystemModel()
	 * @generated
	 */
	int UNIFIED_SYSTEM_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Fmea Analysis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFIED_SYSTEM_MODEL__FMEA_ANALYSIS = 0;

	/**
	 * The feature id for the '<em><b>Global Hazards</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFIED_SYSTEM_MODEL__GLOBAL_HAZARDS = 1;

	/**
	 * The feature id for the '<em><b>Root Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFIED_SYSTEM_MODEL__ROOT_BLOCKS = 2;

	/**
	 * The feature id for the '<em><b>System Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFIED_SYSTEM_MODEL__SYSTEM_BLOCKS = 3;

	/**
	 * The feature id for the '<em><b>Block Associations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFIED_SYSTEM_MODEL__BLOCK_ASSOCIATIONS = 4;

	/**
	 * The feature id for the '<em><b>Block Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFIED_SYSTEM_MODEL__BLOCK_CONNECTIONS = 5;

	/**
	 * The feature id for the '<em><b>Analysis Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFIED_SYSTEM_MODEL__ANALYSIS_METADATA = 6;

	/**
	 * The feature id for the '<em><b>Model Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFIED_SYSTEM_MODEL__MODEL_VERSION = 7;

	/**
	 * The feature id for the '<em><b>Last Modified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFIED_SYSTEM_MODEL__LAST_MODIFIED = 8;

	/**
	 * The number of structural features of the '<em>System Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFIED_SYSTEM_MODEL_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>System Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFIED_SYSTEM_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link unified.impl.FMEAAnalysisImpl <em>FMEA Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unified.impl.FMEAAnalysisImpl
	 * @see unified.impl.UnifiedPackageImpl#getFMEAAnalysis()
	 * @generated
	 */
	int FMEA_ANALYSIS = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ANALYSIS__ID = UNIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ANALYSIS__NAME = UNIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ANALYSIS__DESCRIPTION = UNIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Rpn Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ANALYSIS__RPN_THRESHOLD = UNIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fmea Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ANALYSIS__FMEA_ITEMS = UNIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Analysis Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ANALYSIS__ANALYSIS_DATE = UNIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Analysis Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ANALYSIS__ANALYSIS_STATUS = UNIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reviewer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ANALYSIS__REVIEWER = UNIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>FMEA Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ANALYSIS_FEATURE_COUNT = UNIFIED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>FMEA Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ANALYSIS_OPERATION_COUNT = UNIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link unified.impl.FMEAItemImpl <em>FMEA Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unified.impl.FMEAItemImpl
	 * @see unified.impl.UnifiedPackageImpl#getFMEAItem()
	 * @generated
	 */
	int FMEA_ITEM = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ITEM__ID = UNIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ITEM__NAME = UNIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ITEM__DESCRIPTION = UNIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ITEM__SEVERITY = UNIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ITEM__OCCURRENCE = UNIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Detection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ITEM__DETECTION = UNIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Local Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ITEM__LOCAL_EFFECT = UNIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>System Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ITEM__SYSTEM_EFFECT = UNIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Recommended Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ITEM__RECOMMENDED_ACTION = UNIFIED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Action Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ITEM__ACTION_STATUS = UNIFIED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Failure Mode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ITEM__FAILURE_MODE = UNIFIED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Analyzed Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ITEM__ANALYZED_COMPONENT = UNIFIED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Auto Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ITEM__AUTO_GENERATED = UNIFIED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Related Hazards</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ITEM__RELATED_HAZARDS = UNIFIED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Responsible Person</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ITEM__RESPONSIBLE_PERSON = UNIFIED_ELEMENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ITEM__DUE_DATE = UNIFIED_ELEMENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>FMEA Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ITEM_FEATURE_COUNT = UNIFIED_ELEMENT_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>FMEA Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ITEM_OPERATION_COUNT = UNIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link unified.impl.IntegratedHazardImpl <em>Integrated Hazard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unified.impl.IntegratedHazardImpl
	 * @see unified.impl.UnifiedPackageImpl#getIntegratedHazard()
	 * @generated
	 */
	int INTEGRATED_HAZARD = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATED_HAZARD__ID = UNIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATED_HAZARD__NAME = UNIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATED_HAZARD__DESCRIPTION = UNIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Risk Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATED_HAZARD__RISK_LEVEL = UNIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Related Blocks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATED_HAZARD__RELATED_BLOCKS = UNIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mitigation Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATED_HAZARD__MITIGATION_STATUS = UNIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hazard Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATED_HAZARD__HAZARD_CATEGORY = UNIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Severity Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATED_HAZARD__SEVERITY_JUSTIFICATION = UNIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Integrated Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATED_HAZARD_FEATURE_COUNT = UNIFIED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Integrated Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATED_HAZARD_OPERATION_COUNT = UNIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link unified.impl.SystemBlockImpl <em>System Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unified.impl.SystemBlockImpl
	 * @see unified.impl.UnifiedPackageImpl#getSystemBlock()
	 * @generated
	 */
	int SYSTEM_BLOCK = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BLOCK__ID = UNIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BLOCK__NAME = UNIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BLOCK__DESCRIPTION = UNIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sub Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BLOCK__SUB_BLOCKS = UNIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BLOCK__PARENT_BLOCK = UNIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Association As Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BLOCK__ASSOCIATION_AS_SOURCE = UNIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Association As Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BLOCK__ASSOCIATION_AS_TARGET = UNIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connection As Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BLOCK__CONNECTION_AS_SOURCE = UNIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Connection As Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BLOCK__CONNECTION_AS_TARGET = UNIFIED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Block Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BLOCK__BLOCK_TYPE = UNIFIED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>System Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BLOCK_FEATURE_COUNT = UNIFIED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>System Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BLOCK_OPERATION_COUNT = UNIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link unified.impl.SafetyCriticalBlockImpl <em>Safety Critical Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unified.impl.SafetyCriticalBlockImpl
	 * @see unified.impl.UnifiedPackageImpl#getSafetyCriticalBlock()
	 * @generated
	 */
	int SAFETY_CRITICAL_BLOCK = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CRITICAL_BLOCK__ID = SYSTEM_BLOCK__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CRITICAL_BLOCK__NAME = SYSTEM_BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CRITICAL_BLOCK__DESCRIPTION = SYSTEM_BLOCK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Sub Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CRITICAL_BLOCK__SUB_BLOCKS = SYSTEM_BLOCK__SUB_BLOCKS;

	/**
	 * The feature id for the '<em><b>Parent Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CRITICAL_BLOCK__PARENT_BLOCK = SYSTEM_BLOCK__PARENT_BLOCK;

	/**
	 * The feature id for the '<em><b>Association As Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CRITICAL_BLOCK__ASSOCIATION_AS_SOURCE = SYSTEM_BLOCK__ASSOCIATION_AS_SOURCE;

	/**
	 * The feature id for the '<em><b>Association As Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CRITICAL_BLOCK__ASSOCIATION_AS_TARGET = SYSTEM_BLOCK__ASSOCIATION_AS_TARGET;

	/**
	 * The feature id for the '<em><b>Connection As Source</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CRITICAL_BLOCK__CONNECTION_AS_SOURCE = SYSTEM_BLOCK__CONNECTION_AS_SOURCE;

	/**
	 * The feature id for the '<em><b>Connection As Target</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CRITICAL_BLOCK__CONNECTION_AS_TARGET = SYSTEM_BLOCK__CONNECTION_AS_TARGET;

	/**
	 * The feature id for the '<em><b>Block Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CRITICAL_BLOCK__BLOCK_TYPE = SYSTEM_BLOCK__BLOCK_TYPE;

	/**
	 * The feature id for the '<em><b>Safety Criticality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CRITICAL_BLOCK__SAFETY_CRITICALITY = SYSTEM_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Failure Modes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CRITICAL_BLOCK__FAILURE_MODES = SYSTEM_BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Redundancy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CRITICAL_BLOCK__HAS_REDUNDANCY = SYSTEM_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Redundancy Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CRITICAL_BLOCK__REDUNDANCY_TYPE = SYSTEM_BLOCK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Asil Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CRITICAL_BLOCK__ASIL_LEVEL = SYSTEM_BLOCK_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Safety Critical Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CRITICAL_BLOCK_FEATURE_COUNT = SYSTEM_BLOCK_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Safety Critical Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CRITICAL_BLOCK_OPERATION_COUNT = SYSTEM_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link unified.impl.BlockAssociationImpl <em>Block Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unified.impl.BlockAssociationImpl
	 * @see unified.impl.UnifiedPackageImpl#getBlockAssociation()
	 * @generated
	 */
	int BLOCK_ASSOCIATION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ASSOCIATION__ID = UNIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ASSOCIATION__NAME = UNIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ASSOCIATION__DESCRIPTION = UNIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Association Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ASSOCIATION__ASSOCIATION_TYPE = UNIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ASSOCIATION__SOURCE_BLOCK = UNIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ASSOCIATION__TARGET_BLOCK = UNIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Block Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ASSOCIATION_FEATURE_COUNT = UNIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Block Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_ASSOCIATION_OPERATION_COUNT = UNIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link unified.impl.BlockConnectionImpl <em>Block Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unified.impl.BlockConnectionImpl
	 * @see unified.impl.UnifiedPackageImpl#getBlockConnection()
	 * @generated
	 */
	int BLOCK_CONNECTION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_CONNECTION__ID = UNIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_CONNECTION__NAME = UNIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_CONNECTION__DESCRIPTION = UNIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Connection Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_CONNECTION__CONNECTION_TYPE = UNIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_CONNECTION__FROM_BLOCK = UNIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To Block</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_CONNECTION__TO_BLOCK = UNIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Block Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_CONNECTION_FEATURE_COUNT = UNIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Block Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_CONNECTION_OPERATION_COUNT = UNIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link unified.impl.BlockFailureModeImpl <em>Block Failure Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unified.impl.BlockFailureModeImpl
	 * @see unified.impl.UnifiedPackageImpl#getBlockFailureMode()
	 * @generated
	 */
	int BLOCK_FAILURE_MODE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FAILURE_MODE__ID = UNIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FAILURE_MODE__NAME = UNIFIED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FAILURE_MODE__DESCRIPTION = UNIFIED_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Affected Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FAILURE_MODE__AFFECTED_BLOCK = UNIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Failure Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FAILURE_MODE__FAILURE_RATE = UNIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Failure Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FAILURE_MODE__FAILURE_EFFECT = UNIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Block Failure Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FAILURE_MODE_FEATURE_COUNT = UNIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Block Failure Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FAILURE_MODE_OPERATION_COUNT = UNIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link unified.impl.AnalysisMetadataImpl <em>Analysis Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unified.impl.AnalysisMetadataImpl
	 * @see unified.impl.UnifiedPackageImpl#getAnalysisMetadata()
	 * @generated
	 */
	int ANALYSIS_METADATA = 10;

	/**
	 * The feature id for the '<em><b>Last Analysis Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_METADATA__LAST_ANALYSIS_DATE = 0;

	/**
	 * The feature id for the '<em><b>Completeness Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_METADATA__COMPLETENESS_SCORE = 1;

	/**
	 * The feature id for the '<em><b>Consistency Score</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_METADATA__CONSISTENCY_SCORE = 2;

	/**
	 * The feature id for the '<em><b>Hazard Coverage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_METADATA__HAZARD_COVERAGE = 3;

	/**
	 * The feature id for the '<em><b>Fmea Coverage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_METADATA__FMEA_COVERAGE = 4;

	/**
	 * The feature id for the '<em><b>Traceability Density</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_METADATA__TRACEABILITY_DENSITY = 5;

	/**
	 * The feature id for the '<em><b>Cyclomatic Complexity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_METADATA__CYCLOMATIC_COMPLEXITY = 6;

	/**
	 * The number of structural features of the '<em>Analysis Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_METADATA_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Analysis Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANALYSIS_METADATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link unified.SafetyCriticalityLevel <em>Safety Criticality Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unified.SafetyCriticalityLevel
	 * @see unified.impl.UnifiedPackageImpl#getSafetyCriticalityLevel()
	 * @generated
	 */
	int SAFETY_CRITICALITY_LEVEL = 11;

	/**
	 * The meta object id for the '{@link unified.ActionStatus <em>Action Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unified.ActionStatus
	 * @see unified.impl.UnifiedPackageImpl#getActionStatus()
	 * @generated
	 */
	int ACTION_STATUS = 12;

	/**
	 * The meta object id for the '{@link unified.RiskLevel <em>Risk Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unified.RiskLevel
	 * @see unified.impl.UnifiedPackageImpl#getRiskLevel()
	 * @generated
	 */
	int RISK_LEVEL = 13;

	/**
	 * The meta object id for the '{@link unified.ConnectionType <em>Connection Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unified.ConnectionType
	 * @see unified.impl.UnifiedPackageImpl#getConnectionType()
	 * @generated
	 */
	int CONNECTION_TYPE = 14;

	/**
	 * The meta object id for the '{@link unified.AssociationType <em>Association Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unified.AssociationType
	 * @see unified.impl.UnifiedPackageImpl#getAssociationType()
	 * @generated
	 */
	int ASSOCIATION_TYPE = 15;

	/**
	 * The meta object id for the '{@link unified.AnalysisStatus <em>Analysis Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unified.AnalysisStatus
	 * @see unified.impl.UnifiedPackageImpl#getAnalysisStatus()
	 * @generated
	 */
	int ANALYSIS_STATUS = 16;

	/**
	 * The meta object id for the '{@link unified.MitigationStatus <em>Mitigation Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unified.MitigationStatus
	 * @see unified.impl.UnifiedPackageImpl#getMitigationStatus()
	 * @generated
	 */
	int MITIGATION_STATUS = 17;

	/**
	 * The meta object id for the '{@link unified.HazardCategory <em>Hazard Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unified.HazardCategory
	 * @see unified.impl.UnifiedPackageImpl#getHazardCategory()
	 * @generated
	 */
	int HAZARD_CATEGORY = 18;

	/**
	 * The meta object id for the '{@link unified.RedundancyType <em>Redundancy Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unified.RedundancyType
	 * @see unified.impl.UnifiedPackageImpl#getRedundancyType()
	 * @generated
	 */
	int REDUNDANCY_TYPE = 19;

	/**
	 * The meta object id for the '{@link unified.ASILLevel <em>ASIL Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unified.ASILLevel
	 * @see unified.impl.UnifiedPackageImpl#getASILLevel()
	 * @generated
	 */
	int ASIL_LEVEL = 20;

	/**
	 * The meta object id for the '{@link unified.BlockType <em>Block Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unified.BlockType
	 * @see unified.impl.UnifiedPackageImpl#getBlockType()
	 * @generated
	 */
	int BLOCK_TYPE = 21;


	/**
	 * Returns the meta object for class '{@link unified.UnifiedElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see unified.UnifiedElement
	 * @generated
	 */
	EClass getUnifiedElement();

	/**
	 * Returns the meta object for the attribute '{@link unified.UnifiedElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see unified.UnifiedElement#getId()
	 * @see #getUnifiedElement()
	 * @generated
	 */
	EAttribute getUnifiedElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link unified.UnifiedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see unified.UnifiedElement#getName()
	 * @see #getUnifiedElement()
	 * @generated
	 */
	EAttribute getUnifiedElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link unified.UnifiedElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see unified.UnifiedElement#getDescription()
	 * @see #getUnifiedElement()
	 * @generated
	 */
	EAttribute getUnifiedElement_Description();

	/**
	 * Returns the meta object for class '{@link unified.UnifiedSystemModel <em>System Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Model</em>'.
	 * @see unified.UnifiedSystemModel
	 * @generated
	 */
	EClass getUnifiedSystemModel();

	/**
	 * Returns the meta object for the containment reference list '{@link unified.UnifiedSystemModel#getFmeaAnalysis <em>Fmea Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fmea Analysis</em>'.
	 * @see unified.UnifiedSystemModel#getFmeaAnalysis()
	 * @see #getUnifiedSystemModel()
	 * @generated
	 */
	EReference getUnifiedSystemModel_FmeaAnalysis();

	/**
	 * Returns the meta object for the containment reference list '{@link unified.UnifiedSystemModel#getGlobalHazards <em>Global Hazards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Hazards</em>'.
	 * @see unified.UnifiedSystemModel#getGlobalHazards()
	 * @see #getUnifiedSystemModel()
	 * @generated
	 */
	EReference getUnifiedSystemModel_GlobalHazards();

	/**
	 * Returns the meta object for the containment reference list '{@link unified.UnifiedSystemModel#getRootBlocks <em>Root Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Blocks</em>'.
	 * @see unified.UnifiedSystemModel#getRootBlocks()
	 * @see #getUnifiedSystemModel()
	 * @generated
	 */
	EReference getUnifiedSystemModel_RootBlocks();

	/**
	 * Returns the meta object for the containment reference list '{@link unified.UnifiedSystemModel#getSystemBlocks <em>System Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Blocks</em>'.
	 * @see unified.UnifiedSystemModel#getSystemBlocks()
	 * @see #getUnifiedSystemModel()
	 * @generated
	 */
	EReference getUnifiedSystemModel_SystemBlocks();

	/**
	 * Returns the meta object for the containment reference list '{@link unified.UnifiedSystemModel#getBlockAssociations <em>Block Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Block Associations</em>'.
	 * @see unified.UnifiedSystemModel#getBlockAssociations()
	 * @see #getUnifiedSystemModel()
	 * @generated
	 */
	EReference getUnifiedSystemModel_BlockAssociations();

	/**
	 * Returns the meta object for the containment reference list '{@link unified.UnifiedSystemModel#getBlockConnections <em>Block Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Block Connections</em>'.
	 * @see unified.UnifiedSystemModel#getBlockConnections()
	 * @see #getUnifiedSystemModel()
	 * @generated
	 */
	EReference getUnifiedSystemModel_BlockConnections();

	/**
	 * Returns the meta object for the containment reference '{@link unified.UnifiedSystemModel#getAnalysisMetadata <em>Analysis Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Analysis Metadata</em>'.
	 * @see unified.UnifiedSystemModel#getAnalysisMetadata()
	 * @see #getUnifiedSystemModel()
	 * @generated
	 */
	EReference getUnifiedSystemModel_AnalysisMetadata();

	/**
	 * Returns the meta object for the attribute '{@link unified.UnifiedSystemModel#getModelVersion <em>Model Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Version</em>'.
	 * @see unified.UnifiedSystemModel#getModelVersion()
	 * @see #getUnifiedSystemModel()
	 * @generated
	 */
	EAttribute getUnifiedSystemModel_ModelVersion();

	/**
	 * Returns the meta object for the attribute '{@link unified.UnifiedSystemModel#getLastModified <em>Last Modified</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Modified</em>'.
	 * @see unified.UnifiedSystemModel#getLastModified()
	 * @see #getUnifiedSystemModel()
	 * @generated
	 */
	EAttribute getUnifiedSystemModel_LastModified();

	/**
	 * Returns the meta object for class '{@link unified.FMEAAnalysis <em>FMEA Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMEA Analysis</em>'.
	 * @see unified.FMEAAnalysis
	 * @generated
	 */
	EClass getFMEAAnalysis();

	/**
	 * Returns the meta object for the attribute '{@link unified.FMEAAnalysis#getRpnThreshold <em>Rpn Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rpn Threshold</em>'.
	 * @see unified.FMEAAnalysis#getRpnThreshold()
	 * @see #getFMEAAnalysis()
	 * @generated
	 */
	EAttribute getFMEAAnalysis_RpnThreshold();

	/**
	 * Returns the meta object for the containment reference list '{@link unified.FMEAAnalysis#getFmeaItems <em>Fmea Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fmea Items</em>'.
	 * @see unified.FMEAAnalysis#getFmeaItems()
	 * @see #getFMEAAnalysis()
	 * @generated
	 */
	EReference getFMEAAnalysis_FmeaItems();

	/**
	 * Returns the meta object for the attribute '{@link unified.FMEAAnalysis#getAnalysisDate <em>Analysis Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Analysis Date</em>'.
	 * @see unified.FMEAAnalysis#getAnalysisDate()
	 * @see #getFMEAAnalysis()
	 * @generated
	 */
	EAttribute getFMEAAnalysis_AnalysisDate();

	/**
	 * Returns the meta object for the attribute '{@link unified.FMEAAnalysis#getAnalysisStatus <em>Analysis Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Analysis Status</em>'.
	 * @see unified.FMEAAnalysis#getAnalysisStatus()
	 * @see #getFMEAAnalysis()
	 * @generated
	 */
	EAttribute getFMEAAnalysis_AnalysisStatus();

	/**
	 * Returns the meta object for the attribute '{@link unified.FMEAAnalysis#getReviewer <em>Reviewer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reviewer</em>'.
	 * @see unified.FMEAAnalysis#getReviewer()
	 * @see #getFMEAAnalysis()
	 * @generated
	 */
	EAttribute getFMEAAnalysis_Reviewer();

	/**
	 * Returns the meta object for class '{@link unified.FMEAItem <em>FMEA Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMEA Item</em>'.
	 * @see unified.FMEAItem
	 * @generated
	 */
	EClass getFMEAItem();

	/**
	 * Returns the meta object for the attribute '{@link unified.FMEAItem#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see unified.FMEAItem#getSeverity()
	 * @see #getFMEAItem()
	 * @generated
	 */
	EAttribute getFMEAItem_Severity();

	/**
	 * Returns the meta object for the attribute '{@link unified.FMEAItem#getOccurrence <em>Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occurrence</em>'.
	 * @see unified.FMEAItem#getOccurrence()
	 * @see #getFMEAItem()
	 * @generated
	 */
	EAttribute getFMEAItem_Occurrence();

	/**
	 * Returns the meta object for the attribute '{@link unified.FMEAItem#getDetection <em>Detection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detection</em>'.
	 * @see unified.FMEAItem#getDetection()
	 * @see #getFMEAItem()
	 * @generated
	 */
	EAttribute getFMEAItem_Detection();

	/**
	 * Returns the meta object for the attribute '{@link unified.FMEAItem#getLocalEffect <em>Local Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Effect</em>'.
	 * @see unified.FMEAItem#getLocalEffect()
	 * @see #getFMEAItem()
	 * @generated
	 */
	EAttribute getFMEAItem_LocalEffect();

	/**
	 * Returns the meta object for the attribute '{@link unified.FMEAItem#getSystemEffect <em>System Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Effect</em>'.
	 * @see unified.FMEAItem#getSystemEffect()
	 * @see #getFMEAItem()
	 * @generated
	 */
	EAttribute getFMEAItem_SystemEffect();

	/**
	 * Returns the meta object for the attribute '{@link unified.FMEAItem#getRecommendedAction <em>Recommended Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recommended Action</em>'.
	 * @see unified.FMEAItem#getRecommendedAction()
	 * @see #getFMEAItem()
	 * @generated
	 */
	EAttribute getFMEAItem_RecommendedAction();

	/**
	 * Returns the meta object for the attribute '{@link unified.FMEAItem#getActionStatus <em>Action Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Status</em>'.
	 * @see unified.FMEAItem#getActionStatus()
	 * @see #getFMEAItem()
	 * @generated
	 */
	EAttribute getFMEAItem_ActionStatus();

	/**
	 * Returns the meta object for the reference '{@link unified.FMEAItem#getFailureMode <em>Failure Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Failure Mode</em>'.
	 * @see unified.FMEAItem#getFailureMode()
	 * @see #getFMEAItem()
	 * @generated
	 */
	EReference getFMEAItem_FailureMode();

	/**
	 * Returns the meta object for the reference '{@link unified.FMEAItem#getAnalyzedComponent <em>Analyzed Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Analyzed Component</em>'.
	 * @see unified.FMEAItem#getAnalyzedComponent()
	 * @see #getFMEAItem()
	 * @generated
	 */
	EReference getFMEAItem_AnalyzedComponent();

	/**
	 * Returns the meta object for the attribute '{@link unified.FMEAItem#isAutoGenerated <em>Auto Generated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Generated</em>'.
	 * @see unified.FMEAItem#isAutoGenerated()
	 * @see #getFMEAItem()
	 * @generated
	 */
	EAttribute getFMEAItem_AutoGenerated();

	/**
	 * Returns the meta object for the reference list '{@link unified.FMEAItem#getRelatedHazards <em>Related Hazards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Hazards</em>'.
	 * @see unified.FMEAItem#getRelatedHazards()
	 * @see #getFMEAItem()
	 * @generated
	 */
	EReference getFMEAItem_RelatedHazards();

	/**
	 * Returns the meta object for the attribute '{@link unified.FMEAItem#getResponsiblePerson <em>Responsible Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Responsible Person</em>'.
	 * @see unified.FMEAItem#getResponsiblePerson()
	 * @see #getFMEAItem()
	 * @generated
	 */
	EAttribute getFMEAItem_ResponsiblePerson();

	/**
	 * Returns the meta object for the attribute '{@link unified.FMEAItem#getDueDate <em>Due Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Due Date</em>'.
	 * @see unified.FMEAItem#getDueDate()
	 * @see #getFMEAItem()
	 * @generated
	 */
	EAttribute getFMEAItem_DueDate();

	/**
	 * Returns the meta object for class '{@link unified.IntegratedHazard <em>Integrated Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integrated Hazard</em>'.
	 * @see unified.IntegratedHazard
	 * @generated
	 */
	EClass getIntegratedHazard();

	/**
	 * Returns the meta object for the attribute '{@link unified.IntegratedHazard#getRiskLevel <em>Risk Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Risk Level</em>'.
	 * @see unified.IntegratedHazard#getRiskLevel()
	 * @see #getIntegratedHazard()
	 * @generated
	 */
	EAttribute getIntegratedHazard_RiskLevel();

	/**
	 * Returns the meta object for the reference list '{@link unified.IntegratedHazard#getRelatedBlocks <em>Related Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Blocks</em>'.
	 * @see unified.IntegratedHazard#getRelatedBlocks()
	 * @see #getIntegratedHazard()
	 * @generated
	 */
	EReference getIntegratedHazard_RelatedBlocks();

	/**
	 * Returns the meta object for the attribute '{@link unified.IntegratedHazard#getMitigationStatus <em>Mitigation Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mitigation Status</em>'.
	 * @see unified.IntegratedHazard#getMitigationStatus()
	 * @see #getIntegratedHazard()
	 * @generated
	 */
	EAttribute getIntegratedHazard_MitigationStatus();

	/**
	 * Returns the meta object for the attribute '{@link unified.IntegratedHazard#getHazardCategory <em>Hazard Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hazard Category</em>'.
	 * @see unified.IntegratedHazard#getHazardCategory()
	 * @see #getIntegratedHazard()
	 * @generated
	 */
	EAttribute getIntegratedHazard_HazardCategory();

	/**
	 * Returns the meta object for the attribute '{@link unified.IntegratedHazard#getSeverityJustification <em>Severity Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity Justification</em>'.
	 * @see unified.IntegratedHazard#getSeverityJustification()
	 * @see #getIntegratedHazard()
	 * @generated
	 */
	EAttribute getIntegratedHazard_SeverityJustification();

	/**
	 * Returns the meta object for class '{@link unified.SafetyCriticalBlock <em>Safety Critical Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safety Critical Block</em>'.
	 * @see unified.SafetyCriticalBlock
	 * @generated
	 */
	EClass getSafetyCriticalBlock();

	/**
	 * Returns the meta object for the attribute '{@link unified.SafetyCriticalBlock#getSafetyCriticality <em>Safety Criticality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Safety Criticality</em>'.
	 * @see unified.SafetyCriticalBlock#getSafetyCriticality()
	 * @see #getSafetyCriticalBlock()
	 * @generated
	 */
	EAttribute getSafetyCriticalBlock_SafetyCriticality();

	/**
	 * Returns the meta object for the containment reference list '{@link unified.SafetyCriticalBlock#getFailureModes <em>Failure Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Failure Modes</em>'.
	 * @see unified.SafetyCriticalBlock#getFailureModes()
	 * @see #getSafetyCriticalBlock()
	 * @generated
	 */
	EReference getSafetyCriticalBlock_FailureModes();

	/**
	 * Returns the meta object for the attribute '{@link unified.SafetyCriticalBlock#isHasRedundancy <em>Has Redundancy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Redundancy</em>'.
	 * @see unified.SafetyCriticalBlock#isHasRedundancy()
	 * @see #getSafetyCriticalBlock()
	 * @generated
	 */
	EAttribute getSafetyCriticalBlock_HasRedundancy();

	/**
	 * Returns the meta object for the attribute '{@link unified.SafetyCriticalBlock#getRedundancyType <em>Redundancy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Redundancy Type</em>'.
	 * @see unified.SafetyCriticalBlock#getRedundancyType()
	 * @see #getSafetyCriticalBlock()
	 * @generated
	 */
	EAttribute getSafetyCriticalBlock_RedundancyType();

	/**
	 * Returns the meta object for the attribute '{@link unified.SafetyCriticalBlock#getAsilLevel <em>Asil Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asil Level</em>'.
	 * @see unified.SafetyCriticalBlock#getAsilLevel()
	 * @see #getSafetyCriticalBlock()
	 * @generated
	 */
	EAttribute getSafetyCriticalBlock_AsilLevel();

	/**
	 * Returns the meta object for class '{@link unified.SystemBlock <em>System Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Block</em>'.
	 * @see unified.SystemBlock
	 * @generated
	 */
	EClass getSystemBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link unified.SystemBlock#getSubBlocks <em>Sub Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Blocks</em>'.
	 * @see unified.SystemBlock#getSubBlocks()
	 * @see #getSystemBlock()
	 * @generated
	 */
	EReference getSystemBlock_SubBlocks();

	/**
	 * Returns the meta object for the container reference '{@link unified.SystemBlock#getParentBlock <em>Parent Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Block</em>'.
	 * @see unified.SystemBlock#getParentBlock()
	 * @see #getSystemBlock()
	 * @generated
	 */
	EReference getSystemBlock_ParentBlock();

	/**
	 * Returns the meta object for the reference list '{@link unified.SystemBlock#getAssociationAsSource <em>Association As Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Association As Source</em>'.
	 * @see unified.SystemBlock#getAssociationAsSource()
	 * @see #getSystemBlock()
	 * @generated
	 */
	EReference getSystemBlock_AssociationAsSource();

	/**
	 * Returns the meta object for the reference list '{@link unified.SystemBlock#getAssociationAsTarget <em>Association As Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Association As Target</em>'.
	 * @see unified.SystemBlock#getAssociationAsTarget()
	 * @see #getSystemBlock()
	 * @generated
	 */
	EReference getSystemBlock_AssociationAsTarget();

	/**
	 * Returns the meta object for the reference list '{@link unified.SystemBlock#getConnectionAsSource <em>Connection As Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connection As Source</em>'.
	 * @see unified.SystemBlock#getConnectionAsSource()
	 * @see #getSystemBlock()
	 * @generated
	 */
	EReference getSystemBlock_ConnectionAsSource();

	/**
	 * Returns the meta object for the reference list '{@link unified.SystemBlock#getConnectionAsTarget <em>Connection As Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connection As Target</em>'.
	 * @see unified.SystemBlock#getConnectionAsTarget()
	 * @see #getSystemBlock()
	 * @generated
	 */
	EReference getSystemBlock_ConnectionAsTarget();

	/**
	 * Returns the meta object for the attribute '{@link unified.SystemBlock#getBlockType <em>Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Block Type</em>'.
	 * @see unified.SystemBlock#getBlockType()
	 * @see #getSystemBlock()
	 * @generated
	 */
	EAttribute getSystemBlock_BlockType();

	/**
	 * Returns the meta object for class '{@link unified.BlockAssociation <em>Block Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Association</em>'.
	 * @see unified.BlockAssociation
	 * @generated
	 */
	EClass getBlockAssociation();

	/**
	 * Returns the meta object for the attribute '{@link unified.BlockAssociation#getAssociationType <em>Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Association Type</em>'.
	 * @see unified.BlockAssociation#getAssociationType()
	 * @see #getBlockAssociation()
	 * @generated
	 */
	EAttribute getBlockAssociation_AssociationType();

	/**
	 * Returns the meta object for the reference '{@link unified.BlockAssociation#getSourceBlock <em>Source Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Block</em>'.
	 * @see unified.BlockAssociation#getSourceBlock()
	 * @see #getBlockAssociation()
	 * @generated
	 */
	EReference getBlockAssociation_SourceBlock();

	/**
	 * Returns the meta object for the reference '{@link unified.BlockAssociation#getTargetBlock <em>Target Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Block</em>'.
	 * @see unified.BlockAssociation#getTargetBlock()
	 * @see #getBlockAssociation()
	 * @generated
	 */
	EReference getBlockAssociation_TargetBlock();

	/**
	 * Returns the meta object for class '{@link unified.BlockConnection <em>Block Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Connection</em>'.
	 * @see unified.BlockConnection
	 * @generated
	 */
	EClass getBlockConnection();

	/**
	 * Returns the meta object for the attribute '{@link unified.BlockConnection#getConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Type</em>'.
	 * @see unified.BlockConnection#getConnectionType()
	 * @see #getBlockConnection()
	 * @generated
	 */
	EAttribute getBlockConnection_ConnectionType();

	/**
	 * Returns the meta object for the reference list '{@link unified.BlockConnection#getFromBlock <em>From Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Block</em>'.
	 * @see unified.BlockConnection#getFromBlock()
	 * @see #getBlockConnection()
	 * @generated
	 */
	EReference getBlockConnection_FromBlock();

	/**
	 * Returns the meta object for the reference list '{@link unified.BlockConnection#getToBlock <em>To Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To Block</em>'.
	 * @see unified.BlockConnection#getToBlock()
	 * @see #getBlockConnection()
	 * @generated
	 */
	EReference getBlockConnection_ToBlock();

	/**
	 * Returns the meta object for class '{@link unified.BlockFailureMode <em>Block Failure Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Failure Mode</em>'.
	 * @see unified.BlockFailureMode
	 * @generated
	 */
	EClass getBlockFailureMode();

	/**
	 * Returns the meta object for the container reference '{@link unified.BlockFailureMode#getAffectedBlock <em>Affected Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Affected Block</em>'.
	 * @see unified.BlockFailureMode#getAffectedBlock()
	 * @see #getBlockFailureMode()
	 * @generated
	 */
	EReference getBlockFailureMode_AffectedBlock();

	/**
	 * Returns the meta object for the attribute '{@link unified.BlockFailureMode#getFailureRate <em>Failure Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure Rate</em>'.
	 * @see unified.BlockFailureMode#getFailureRate()
	 * @see #getBlockFailureMode()
	 * @generated
	 */
	EAttribute getBlockFailureMode_FailureRate();

	/**
	 * Returns the meta object for the attribute '{@link unified.BlockFailureMode#getFailureEffect <em>Failure Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure Effect</em>'.
	 * @see unified.BlockFailureMode#getFailureEffect()
	 * @see #getBlockFailureMode()
	 * @generated
	 */
	EAttribute getBlockFailureMode_FailureEffect();

	/**
	 * Returns the meta object for class '{@link unified.AnalysisMetadata <em>Analysis Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Analysis Metadata</em>'.
	 * @see unified.AnalysisMetadata
	 * @generated
	 */
	EClass getAnalysisMetadata();

	/**
	 * Returns the meta object for the attribute '{@link unified.AnalysisMetadata#getLastAnalysisDate <em>Last Analysis Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Analysis Date</em>'.
	 * @see unified.AnalysisMetadata#getLastAnalysisDate()
	 * @see #getAnalysisMetadata()
	 * @generated
	 */
	EAttribute getAnalysisMetadata_LastAnalysisDate();

	/**
	 * Returns the meta object for the attribute '{@link unified.AnalysisMetadata#getCompletenessScore <em>Completeness Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completeness Score</em>'.
	 * @see unified.AnalysisMetadata#getCompletenessScore()
	 * @see #getAnalysisMetadata()
	 * @generated
	 */
	EAttribute getAnalysisMetadata_CompletenessScore();

	/**
	 * Returns the meta object for the attribute '{@link unified.AnalysisMetadata#getConsistencyScore <em>Consistency Score</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consistency Score</em>'.
	 * @see unified.AnalysisMetadata#getConsistencyScore()
	 * @see #getAnalysisMetadata()
	 * @generated
	 */
	EAttribute getAnalysisMetadata_ConsistencyScore();

	/**
	 * Returns the meta object for the attribute '{@link unified.AnalysisMetadata#getHazardCoverage <em>Hazard Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hazard Coverage</em>'.
	 * @see unified.AnalysisMetadata#getHazardCoverage()
	 * @see #getAnalysisMetadata()
	 * @generated
	 */
	EAttribute getAnalysisMetadata_HazardCoverage();

	/**
	 * Returns the meta object for the attribute '{@link unified.AnalysisMetadata#getFmeaCoverage <em>Fmea Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fmea Coverage</em>'.
	 * @see unified.AnalysisMetadata#getFmeaCoverage()
	 * @see #getAnalysisMetadata()
	 * @generated
	 */
	EAttribute getAnalysisMetadata_FmeaCoverage();

	/**
	 * Returns the meta object for the attribute '{@link unified.AnalysisMetadata#getTraceabilityDensity <em>Traceability Density</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Traceability Density</em>'.
	 * @see unified.AnalysisMetadata#getTraceabilityDensity()
	 * @see #getAnalysisMetadata()
	 * @generated
	 */
	EAttribute getAnalysisMetadata_TraceabilityDensity();

	/**
	 * Returns the meta object for the attribute '{@link unified.AnalysisMetadata#getCyclomaticComplexity <em>Cyclomatic Complexity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cyclomatic Complexity</em>'.
	 * @see unified.AnalysisMetadata#getCyclomaticComplexity()
	 * @see #getAnalysisMetadata()
	 * @generated
	 */
	EAttribute getAnalysisMetadata_CyclomaticComplexity();

	/**
	 * Returns the meta object for enum '{@link unified.SafetyCriticalityLevel <em>Safety Criticality Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Safety Criticality Level</em>'.
	 * @see unified.SafetyCriticalityLevel
	 * @generated
	 */
	EEnum getSafetyCriticalityLevel();

	/**
	 * Returns the meta object for enum '{@link unified.ActionStatus <em>Action Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Status</em>'.
	 * @see unified.ActionStatus
	 * @generated
	 */
	EEnum getActionStatus();

	/**
	 * Returns the meta object for enum '{@link unified.RiskLevel <em>Risk Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Risk Level</em>'.
	 * @see unified.RiskLevel
	 * @generated
	 */
	EEnum getRiskLevel();

	/**
	 * Returns the meta object for enum '{@link unified.ConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Connection Type</em>'.
	 * @see unified.ConnectionType
	 * @generated
	 */
	EEnum getConnectionType();

	/**
	 * Returns the meta object for enum '{@link unified.AssociationType <em>Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Association Type</em>'.
	 * @see unified.AssociationType
	 * @generated
	 */
	EEnum getAssociationType();

	/**
	 * Returns the meta object for enum '{@link unified.AnalysisStatus <em>Analysis Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Analysis Status</em>'.
	 * @see unified.AnalysisStatus
	 * @generated
	 */
	EEnum getAnalysisStatus();

	/**
	 * Returns the meta object for enum '{@link unified.MitigationStatus <em>Mitigation Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mitigation Status</em>'.
	 * @see unified.MitigationStatus
	 * @generated
	 */
	EEnum getMitigationStatus();

	/**
	 * Returns the meta object for enum '{@link unified.HazardCategory <em>Hazard Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hazard Category</em>'.
	 * @see unified.HazardCategory
	 * @generated
	 */
	EEnum getHazardCategory();

	/**
	 * Returns the meta object for enum '{@link unified.RedundancyType <em>Redundancy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Redundancy Type</em>'.
	 * @see unified.RedundancyType
	 * @generated
	 */
	EEnum getRedundancyType();

	/**
	 * Returns the meta object for enum '{@link unified.ASILLevel <em>ASIL Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ASIL Level</em>'.
	 * @see unified.ASILLevel
	 * @generated
	 */
	EEnum getASILLevel();

	/**
	 * Returns the meta object for enum '{@link unified.BlockType <em>Block Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Block Type</em>'.
	 * @see unified.BlockType
	 * @generated
	 */
	EEnum getBlockType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UnifiedFactory getUnifiedFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link unified.impl.UnifiedElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unified.impl.UnifiedElementImpl
		 * @see unified.impl.UnifiedPackageImpl#getUnifiedElement()
		 * @generated
		 */
		EClass UNIFIED_ELEMENT = eINSTANCE.getUnifiedElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIFIED_ELEMENT__ID = eINSTANCE.getUnifiedElement_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIFIED_ELEMENT__NAME = eINSTANCE.getUnifiedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIFIED_ELEMENT__DESCRIPTION = eINSTANCE.getUnifiedElement_Description();

		/**
		 * The meta object literal for the '{@link unified.impl.UnifiedSystemModelImpl <em>System Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unified.impl.UnifiedSystemModelImpl
		 * @see unified.impl.UnifiedPackageImpl#getUnifiedSystemModel()
		 * @generated
		 */
		EClass UNIFIED_SYSTEM_MODEL = eINSTANCE.getUnifiedSystemModel();

		/**
		 * The meta object literal for the '<em><b>Fmea Analysis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIFIED_SYSTEM_MODEL__FMEA_ANALYSIS = eINSTANCE.getUnifiedSystemModel_FmeaAnalysis();

		/**
		 * The meta object literal for the '<em><b>Global Hazards</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIFIED_SYSTEM_MODEL__GLOBAL_HAZARDS = eINSTANCE.getUnifiedSystemModel_GlobalHazards();

		/**
		 * The meta object literal for the '<em><b>Root Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIFIED_SYSTEM_MODEL__ROOT_BLOCKS = eINSTANCE.getUnifiedSystemModel_RootBlocks();

		/**
		 * The meta object literal for the '<em><b>System Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIFIED_SYSTEM_MODEL__SYSTEM_BLOCKS = eINSTANCE.getUnifiedSystemModel_SystemBlocks();

		/**
		 * The meta object literal for the '<em><b>Block Associations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIFIED_SYSTEM_MODEL__BLOCK_ASSOCIATIONS = eINSTANCE.getUnifiedSystemModel_BlockAssociations();

		/**
		 * The meta object literal for the '<em><b>Block Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIFIED_SYSTEM_MODEL__BLOCK_CONNECTIONS = eINSTANCE.getUnifiedSystemModel_BlockConnections();

		/**
		 * The meta object literal for the '<em><b>Analysis Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIFIED_SYSTEM_MODEL__ANALYSIS_METADATA = eINSTANCE.getUnifiedSystemModel_AnalysisMetadata();

		/**
		 * The meta object literal for the '<em><b>Model Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIFIED_SYSTEM_MODEL__MODEL_VERSION = eINSTANCE.getUnifiedSystemModel_ModelVersion();

		/**
		 * The meta object literal for the '<em><b>Last Modified</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIFIED_SYSTEM_MODEL__LAST_MODIFIED = eINSTANCE.getUnifiedSystemModel_LastModified();

		/**
		 * The meta object literal for the '{@link unified.impl.FMEAAnalysisImpl <em>FMEA Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unified.impl.FMEAAnalysisImpl
		 * @see unified.impl.UnifiedPackageImpl#getFMEAAnalysis()
		 * @generated
		 */
		EClass FMEA_ANALYSIS = eINSTANCE.getFMEAAnalysis();

		/**
		 * The meta object literal for the '<em><b>Rpn Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMEA_ANALYSIS__RPN_THRESHOLD = eINSTANCE.getFMEAAnalysis_RpnThreshold();

		/**
		 * The meta object literal for the '<em><b>Fmea Items</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMEA_ANALYSIS__FMEA_ITEMS = eINSTANCE.getFMEAAnalysis_FmeaItems();

		/**
		 * The meta object literal for the '<em><b>Analysis Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMEA_ANALYSIS__ANALYSIS_DATE = eINSTANCE.getFMEAAnalysis_AnalysisDate();

		/**
		 * The meta object literal for the '<em><b>Analysis Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMEA_ANALYSIS__ANALYSIS_STATUS = eINSTANCE.getFMEAAnalysis_AnalysisStatus();

		/**
		 * The meta object literal for the '<em><b>Reviewer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMEA_ANALYSIS__REVIEWER = eINSTANCE.getFMEAAnalysis_Reviewer();

		/**
		 * The meta object literal for the '{@link unified.impl.FMEAItemImpl <em>FMEA Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unified.impl.FMEAItemImpl
		 * @see unified.impl.UnifiedPackageImpl#getFMEAItem()
		 * @generated
		 */
		EClass FMEA_ITEM = eINSTANCE.getFMEAItem();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMEA_ITEM__SEVERITY = eINSTANCE.getFMEAItem_Severity();

		/**
		 * The meta object literal for the '<em><b>Occurrence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMEA_ITEM__OCCURRENCE = eINSTANCE.getFMEAItem_Occurrence();

		/**
		 * The meta object literal for the '<em><b>Detection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMEA_ITEM__DETECTION = eINSTANCE.getFMEAItem_Detection();

		/**
		 * The meta object literal for the '<em><b>Local Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMEA_ITEM__LOCAL_EFFECT = eINSTANCE.getFMEAItem_LocalEffect();

		/**
		 * The meta object literal for the '<em><b>System Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMEA_ITEM__SYSTEM_EFFECT = eINSTANCE.getFMEAItem_SystemEffect();

		/**
		 * The meta object literal for the '<em><b>Recommended Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMEA_ITEM__RECOMMENDED_ACTION = eINSTANCE.getFMEAItem_RecommendedAction();

		/**
		 * The meta object literal for the '<em><b>Action Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMEA_ITEM__ACTION_STATUS = eINSTANCE.getFMEAItem_ActionStatus();

		/**
		 * The meta object literal for the '<em><b>Failure Mode</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMEA_ITEM__FAILURE_MODE = eINSTANCE.getFMEAItem_FailureMode();

		/**
		 * The meta object literal for the '<em><b>Analyzed Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMEA_ITEM__ANALYZED_COMPONENT = eINSTANCE.getFMEAItem_AnalyzedComponent();

		/**
		 * The meta object literal for the '<em><b>Auto Generated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMEA_ITEM__AUTO_GENERATED = eINSTANCE.getFMEAItem_AutoGenerated();

		/**
		 * The meta object literal for the '<em><b>Related Hazards</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FMEA_ITEM__RELATED_HAZARDS = eINSTANCE.getFMEAItem_RelatedHazards();

		/**
		 * The meta object literal for the '<em><b>Responsible Person</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMEA_ITEM__RESPONSIBLE_PERSON = eINSTANCE.getFMEAItem_ResponsiblePerson();

		/**
		 * The meta object literal for the '<em><b>Due Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FMEA_ITEM__DUE_DATE = eINSTANCE.getFMEAItem_DueDate();

		/**
		 * The meta object literal for the '{@link unified.impl.IntegratedHazardImpl <em>Integrated Hazard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unified.impl.IntegratedHazardImpl
		 * @see unified.impl.UnifiedPackageImpl#getIntegratedHazard()
		 * @generated
		 */
		EClass INTEGRATED_HAZARD = eINSTANCE.getIntegratedHazard();

		/**
		 * The meta object literal for the '<em><b>Risk Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGRATED_HAZARD__RISK_LEVEL = eINSTANCE.getIntegratedHazard_RiskLevel();

		/**
		 * The meta object literal for the '<em><b>Related Blocks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGRATED_HAZARD__RELATED_BLOCKS = eINSTANCE.getIntegratedHazard_RelatedBlocks();

		/**
		 * The meta object literal for the '<em><b>Mitigation Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGRATED_HAZARD__MITIGATION_STATUS = eINSTANCE.getIntegratedHazard_MitigationStatus();

		/**
		 * The meta object literal for the '<em><b>Hazard Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGRATED_HAZARD__HAZARD_CATEGORY = eINSTANCE.getIntegratedHazard_HazardCategory();

		/**
		 * The meta object literal for the '<em><b>Severity Justification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGRATED_HAZARD__SEVERITY_JUSTIFICATION = eINSTANCE.getIntegratedHazard_SeverityJustification();

		/**
		 * The meta object literal for the '{@link unified.impl.SafetyCriticalBlockImpl <em>Safety Critical Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unified.impl.SafetyCriticalBlockImpl
		 * @see unified.impl.UnifiedPackageImpl#getSafetyCriticalBlock()
		 * @generated
		 */
		EClass SAFETY_CRITICAL_BLOCK = eINSTANCE.getSafetyCriticalBlock();

		/**
		 * The meta object literal for the '<em><b>Safety Criticality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_CRITICAL_BLOCK__SAFETY_CRITICALITY = eINSTANCE.getSafetyCriticalBlock_SafetyCriticality();

		/**
		 * The meta object literal for the '<em><b>Failure Modes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAFETY_CRITICAL_BLOCK__FAILURE_MODES = eINSTANCE.getSafetyCriticalBlock_FailureModes();

		/**
		 * The meta object literal for the '<em><b>Has Redundancy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_CRITICAL_BLOCK__HAS_REDUNDANCY = eINSTANCE.getSafetyCriticalBlock_HasRedundancy();

		/**
		 * The meta object literal for the '<em><b>Redundancy Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_CRITICAL_BLOCK__REDUNDANCY_TYPE = eINSTANCE.getSafetyCriticalBlock_RedundancyType();

		/**
		 * The meta object literal for the '<em><b>Asil Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAFETY_CRITICAL_BLOCK__ASIL_LEVEL = eINSTANCE.getSafetyCriticalBlock_AsilLevel();

		/**
		 * The meta object literal for the '{@link unified.impl.SystemBlockImpl <em>System Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unified.impl.SystemBlockImpl
		 * @see unified.impl.UnifiedPackageImpl#getSystemBlock()
		 * @generated
		 */
		EClass SYSTEM_BLOCK = eINSTANCE.getSystemBlock();

		/**
		 * The meta object literal for the '<em><b>Sub Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_BLOCK__SUB_BLOCKS = eINSTANCE.getSystemBlock_SubBlocks();

		/**
		 * The meta object literal for the '<em><b>Parent Block</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_BLOCK__PARENT_BLOCK = eINSTANCE.getSystemBlock_ParentBlock();

		/**
		 * The meta object literal for the '<em><b>Association As Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_BLOCK__ASSOCIATION_AS_SOURCE = eINSTANCE.getSystemBlock_AssociationAsSource();

		/**
		 * The meta object literal for the '<em><b>Association As Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_BLOCK__ASSOCIATION_AS_TARGET = eINSTANCE.getSystemBlock_AssociationAsTarget();

		/**
		 * The meta object literal for the '<em><b>Connection As Source</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_BLOCK__CONNECTION_AS_SOURCE = eINSTANCE.getSystemBlock_ConnectionAsSource();

		/**
		 * The meta object literal for the '<em><b>Connection As Target</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_BLOCK__CONNECTION_AS_TARGET = eINSTANCE.getSystemBlock_ConnectionAsTarget();

		/**
		 * The meta object literal for the '<em><b>Block Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_BLOCK__BLOCK_TYPE = eINSTANCE.getSystemBlock_BlockType();

		/**
		 * The meta object literal for the '{@link unified.impl.BlockAssociationImpl <em>Block Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unified.impl.BlockAssociationImpl
		 * @see unified.impl.UnifiedPackageImpl#getBlockAssociation()
		 * @generated
		 */
		EClass BLOCK_ASSOCIATION = eINSTANCE.getBlockAssociation();

		/**
		 * The meta object literal for the '<em><b>Association Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_ASSOCIATION__ASSOCIATION_TYPE = eINSTANCE.getBlockAssociation_AssociationType();

		/**
		 * The meta object literal for the '<em><b>Source Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_ASSOCIATION__SOURCE_BLOCK = eINSTANCE.getBlockAssociation_SourceBlock();

		/**
		 * The meta object literal for the '<em><b>Target Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_ASSOCIATION__TARGET_BLOCK = eINSTANCE.getBlockAssociation_TargetBlock();

		/**
		 * The meta object literal for the '{@link unified.impl.BlockConnectionImpl <em>Block Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unified.impl.BlockConnectionImpl
		 * @see unified.impl.UnifiedPackageImpl#getBlockConnection()
		 * @generated
		 */
		EClass BLOCK_CONNECTION = eINSTANCE.getBlockConnection();

		/**
		 * The meta object literal for the '<em><b>Connection Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_CONNECTION__CONNECTION_TYPE = eINSTANCE.getBlockConnection_ConnectionType();

		/**
		 * The meta object literal for the '<em><b>From Block</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_CONNECTION__FROM_BLOCK = eINSTANCE.getBlockConnection_FromBlock();

		/**
		 * The meta object literal for the '<em><b>To Block</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_CONNECTION__TO_BLOCK = eINSTANCE.getBlockConnection_ToBlock();

		/**
		 * The meta object literal for the '{@link unified.impl.BlockFailureModeImpl <em>Block Failure Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unified.impl.BlockFailureModeImpl
		 * @see unified.impl.UnifiedPackageImpl#getBlockFailureMode()
		 * @generated
		 */
		EClass BLOCK_FAILURE_MODE = eINSTANCE.getBlockFailureMode();

		/**
		 * The meta object literal for the '<em><b>Affected Block</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_FAILURE_MODE__AFFECTED_BLOCK = eINSTANCE.getBlockFailureMode_AffectedBlock();

		/**
		 * The meta object literal for the '<em><b>Failure Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_FAILURE_MODE__FAILURE_RATE = eINSTANCE.getBlockFailureMode_FailureRate();

		/**
		 * The meta object literal for the '<em><b>Failure Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK_FAILURE_MODE__FAILURE_EFFECT = eINSTANCE.getBlockFailureMode_FailureEffect();

		/**
		 * The meta object literal for the '{@link unified.impl.AnalysisMetadataImpl <em>Analysis Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unified.impl.AnalysisMetadataImpl
		 * @see unified.impl.UnifiedPackageImpl#getAnalysisMetadata()
		 * @generated
		 */
		EClass ANALYSIS_METADATA = eINSTANCE.getAnalysisMetadata();

		/**
		 * The meta object literal for the '<em><b>Last Analysis Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS_METADATA__LAST_ANALYSIS_DATE = eINSTANCE.getAnalysisMetadata_LastAnalysisDate();

		/**
		 * The meta object literal for the '<em><b>Completeness Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS_METADATA__COMPLETENESS_SCORE = eINSTANCE.getAnalysisMetadata_CompletenessScore();

		/**
		 * The meta object literal for the '<em><b>Consistency Score</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS_METADATA__CONSISTENCY_SCORE = eINSTANCE.getAnalysisMetadata_ConsistencyScore();

		/**
		 * The meta object literal for the '<em><b>Hazard Coverage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS_METADATA__HAZARD_COVERAGE = eINSTANCE.getAnalysisMetadata_HazardCoverage();

		/**
		 * The meta object literal for the '<em><b>Fmea Coverage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS_METADATA__FMEA_COVERAGE = eINSTANCE.getAnalysisMetadata_FmeaCoverage();

		/**
		 * The meta object literal for the '<em><b>Traceability Density</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS_METADATA__TRACEABILITY_DENSITY = eINSTANCE.getAnalysisMetadata_TraceabilityDensity();

		/**
		 * The meta object literal for the '<em><b>Cyclomatic Complexity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANALYSIS_METADATA__CYCLOMATIC_COMPLEXITY = eINSTANCE.getAnalysisMetadata_CyclomaticComplexity();

		/**
		 * The meta object literal for the '{@link unified.SafetyCriticalityLevel <em>Safety Criticality Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unified.SafetyCriticalityLevel
		 * @see unified.impl.UnifiedPackageImpl#getSafetyCriticalityLevel()
		 * @generated
		 */
		EEnum SAFETY_CRITICALITY_LEVEL = eINSTANCE.getSafetyCriticalityLevel();

		/**
		 * The meta object literal for the '{@link unified.ActionStatus <em>Action Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unified.ActionStatus
		 * @see unified.impl.UnifiedPackageImpl#getActionStatus()
		 * @generated
		 */
		EEnum ACTION_STATUS = eINSTANCE.getActionStatus();

		/**
		 * The meta object literal for the '{@link unified.RiskLevel <em>Risk Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unified.RiskLevel
		 * @see unified.impl.UnifiedPackageImpl#getRiskLevel()
		 * @generated
		 */
		EEnum RISK_LEVEL = eINSTANCE.getRiskLevel();

		/**
		 * The meta object literal for the '{@link unified.ConnectionType <em>Connection Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unified.ConnectionType
		 * @see unified.impl.UnifiedPackageImpl#getConnectionType()
		 * @generated
		 */
		EEnum CONNECTION_TYPE = eINSTANCE.getConnectionType();

		/**
		 * The meta object literal for the '{@link unified.AssociationType <em>Association Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unified.AssociationType
		 * @see unified.impl.UnifiedPackageImpl#getAssociationType()
		 * @generated
		 */
		EEnum ASSOCIATION_TYPE = eINSTANCE.getAssociationType();

		/**
		 * The meta object literal for the '{@link unified.AnalysisStatus <em>Analysis Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unified.AnalysisStatus
		 * @see unified.impl.UnifiedPackageImpl#getAnalysisStatus()
		 * @generated
		 */
		EEnum ANALYSIS_STATUS = eINSTANCE.getAnalysisStatus();

		/**
		 * The meta object literal for the '{@link unified.MitigationStatus <em>Mitigation Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unified.MitigationStatus
		 * @see unified.impl.UnifiedPackageImpl#getMitigationStatus()
		 * @generated
		 */
		EEnum MITIGATION_STATUS = eINSTANCE.getMitigationStatus();

		/**
		 * The meta object literal for the '{@link unified.HazardCategory <em>Hazard Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unified.HazardCategory
		 * @see unified.impl.UnifiedPackageImpl#getHazardCategory()
		 * @generated
		 */
		EEnum HAZARD_CATEGORY = eINSTANCE.getHazardCategory();

		/**
		 * The meta object literal for the '{@link unified.RedundancyType <em>Redundancy Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unified.RedundancyType
		 * @see unified.impl.UnifiedPackageImpl#getRedundancyType()
		 * @generated
		 */
		EEnum REDUNDANCY_TYPE = eINSTANCE.getRedundancyType();

		/**
		 * The meta object literal for the '{@link unified.ASILLevel <em>ASIL Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unified.ASILLevel
		 * @see unified.impl.UnifiedPackageImpl#getASILLevel()
		 * @generated
		 */
		EEnum ASIL_LEVEL = eINSTANCE.getASILLevel();

		/**
		 * The meta object literal for the '{@link unified.BlockType <em>Block Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unified.BlockType
		 * @see unified.impl.UnifiedPackageImpl#getBlockType()
		 * @generated
		 */
		EEnum BLOCK_TYPE = eINSTANCE.getBlockType();

	}

} //UnifiedPackage
