/**
 */
package edu.kit.sdq.dsis.metamodel.unified;

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
 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedFactory
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
	UnifiedPackage eINSTANCE = edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedElementImpl
	 * @see edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedPackageImpl#getUnifiedElement()
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
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFIED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFIED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.sdq.dsis.metamodel.unified.impl.FMEAAnalysisImpl <em>FMEA Analysis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.sdq.dsis.metamodel.unified.impl.FMEAAnalysisImpl
	 * @see edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedPackageImpl#getFMEAAnalysis()
	 * @generated
	 */
	int FMEA_ANALYSIS = 1;

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
	 * The number of structural features of the '<em>FMEA Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ANALYSIS_FEATURE_COUNT = UNIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>FMEA Analysis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ANALYSIS_OPERATION_COUNT = UNIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.sdq.dsis.metamodel.unified.impl.FMEAItemImpl <em>FMEA Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.sdq.dsis.metamodel.unified.impl.FMEAItemImpl
	 * @see edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedPackageImpl#getFMEAItem()
	 * @generated
	 */
	int FMEA_ITEM = 2;

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
	 * The number of structural features of the '<em>FMEA Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ITEM_FEATURE_COUNT = UNIFIED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>FMEA Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMEA_ITEM_OPERATION_COUNT = UNIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedSystemModelImpl <em>System Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedSystemModelImpl
	 * @see edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedPackageImpl#getUnifiedSystemModel()
	 * @generated
	 */
	int UNIFIED_SYSTEM_MODEL = 3;

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
	 * The number of structural features of the '<em>System Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFIED_SYSTEM_MODEL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>System Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIFIED_SYSTEM_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.sdq.dsis.metamodel.unified.impl.IntegratedHazardImpl <em>Integrated Hazard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.sdq.dsis.metamodel.unified.impl.IntegratedHazardImpl
	 * @see edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedPackageImpl#getIntegratedHazard()
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
	 * The number of structural features of the '<em>Integrated Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATED_HAZARD_FEATURE_COUNT = UNIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Integrated Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGRATED_HAZARD_OPERATION_COUNT = UNIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.sdq.dsis.metamodel.unified.impl.SystemBlockImpl <em>System Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.sdq.dsis.metamodel.unified.impl.SystemBlockImpl
	 * @see edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedPackageImpl#getSystemBlock()
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
	 * The number of structural features of the '<em>System Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BLOCK_FEATURE_COUNT = UNIFIED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>System Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_BLOCK_OPERATION_COUNT = UNIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.sdq.dsis.metamodel.unified.impl.SafetyCriticalBlockImpl <em>Safety Critical Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.sdq.dsis.metamodel.unified.impl.SafetyCriticalBlockImpl
	 * @see edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedPackageImpl#getSafetyCriticalBlock()
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
	 * The number of structural features of the '<em>Safety Critical Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CRITICAL_BLOCK_FEATURE_COUNT = SYSTEM_BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Safety Critical Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAFETY_CRITICAL_BLOCK_OPERATION_COUNT = SYSTEM_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.sdq.dsis.metamodel.unified.impl.BlockAssociationImpl <em>Block Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.sdq.dsis.metamodel.unified.impl.BlockAssociationImpl
	 * @see edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedPackageImpl#getBlockAssociation()
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
	 * The meta object id for the '{@link edu.kit.sdq.dsis.metamodel.unified.impl.BlockConnectionImpl <em>Block Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.sdq.dsis.metamodel.unified.impl.BlockConnectionImpl
	 * @see edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedPackageImpl#getBlockConnection()
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
	 * The meta object id for the '{@link edu.kit.sdq.dsis.metamodel.unified.impl.BlockFailureModeImpl <em>Block Failure Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.sdq.dsis.metamodel.unified.impl.BlockFailureModeImpl
	 * @see edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedPackageImpl#getBlockFailureMode()
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
	 * The feature id for the '<em><b>Affected Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FAILURE_MODE__AFFECTED_BLOCK = UNIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Block Failure Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FAILURE_MODE_FEATURE_COUNT = UNIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Block Failure Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FAILURE_MODE_OPERATION_COUNT = UNIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.sdq.dsis.metamodel.unified.SafetyCriticalityLevel <em>Safety Criticality Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.sdq.dsis.metamodel.unified.SafetyCriticalityLevel
	 * @see edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedPackageImpl#getSafetyCriticalityLevel()
	 * @generated
	 */
	int SAFETY_CRITICALITY_LEVEL = 10;

	/**
	 * The meta object id for the '{@link edu.kit.sdq.dsis.metamodel.unified.ActionStatus <em>Action Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.sdq.dsis.metamodel.unified.ActionStatus
	 * @see edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedPackageImpl#getActionStatus()
	 * @generated
	 */
	int ACTION_STATUS = 11;

	/**
	 * The meta object id for the '{@link edu.kit.sdq.dsis.metamodel.unified.RiskLevel <em>Risk Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.sdq.dsis.metamodel.unified.RiskLevel
	 * @see edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedPackageImpl#getRiskLevel()
	 * @generated
	 */
	int RISK_LEVEL = 12;

	/**
	 * The meta object id for the '{@link edu.kit.sdq.dsis.metamodel.unified.ConnectionType <em>Connection Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.sdq.dsis.metamodel.unified.ConnectionType
	 * @see edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedPackageImpl#getConnectionType()
	 * @generated
	 */
	int CONNECTION_TYPE = 13;

	/**
	 * The meta object id for the '{@link edu.kit.sdq.dsis.metamodel.unified.AssociationType <em>Association Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.sdq.dsis.metamodel.unified.AssociationType
	 * @see edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedPackageImpl#getAssociationType()
	 * @generated
	 */
	int ASSOCIATION_TYPE = 14;

	/**
	 * Returns the meta object for class '{@link edu.kit.sdq.dsis.metamodel.unified.UnifiedElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedElement
	 * @generated
	 */
	EClass getUnifiedElement();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.sdq.dsis.metamodel.unified.UnifiedElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedElement#getId()
	 * @see #getUnifiedElement()
	 * @generated
	 */
	EAttribute getUnifiedElement_Id();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.sdq.dsis.metamodel.unified.UnifiedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedElement#getName()
	 * @see #getUnifiedElement()
	 * @generated
	 */
	EAttribute getUnifiedElement_Name();

	/**
	 * Returns the meta object for class '{@link edu.kit.sdq.dsis.metamodel.unified.FMEAAnalysis <em>FMEA Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMEA Analysis</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.FMEAAnalysis
	 * @generated
	 */
	EClass getFMEAAnalysis();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.sdq.dsis.metamodel.unified.FMEAAnalysis#getRpnThreshold <em>Rpn Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rpn Threshold</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.FMEAAnalysis#getRpnThreshold()
	 * @see #getFMEAAnalysis()
	 * @generated
	 */
	EAttribute getFMEAAnalysis_RpnThreshold();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.sdq.dsis.metamodel.unified.FMEAAnalysis#getFmeaItems <em>Fmea Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fmea Items</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.FMEAAnalysis#getFmeaItems()
	 * @see #getFMEAAnalysis()
	 * @generated
	 */
	EReference getFMEAAnalysis_FmeaItems();

	/**
	 * Returns the meta object for class '{@link edu.kit.sdq.dsis.metamodel.unified.FMEAItem <em>FMEA Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMEA Item</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.FMEAItem
	 * @generated
	 */
	EClass getFMEAItem();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getSeverity()
	 * @see #getFMEAItem()
	 * @generated
	 */
	EAttribute getFMEAItem_Severity();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getOccurrence <em>Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occurrence</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getOccurrence()
	 * @see #getFMEAItem()
	 * @generated
	 */
	EAttribute getFMEAItem_Occurrence();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getDetection <em>Detection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detection</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getDetection()
	 * @see #getFMEAItem()
	 * @generated
	 */
	EAttribute getFMEAItem_Detection();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getLocalEffect <em>Local Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Effect</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getLocalEffect()
	 * @see #getFMEAItem()
	 * @generated
	 */
	EAttribute getFMEAItem_LocalEffect();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getSystemEffect <em>System Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>System Effect</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getSystemEffect()
	 * @see #getFMEAItem()
	 * @generated
	 */
	EAttribute getFMEAItem_SystemEffect();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getRecommendedAction <em>Recommended Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recommended Action</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getRecommendedAction()
	 * @see #getFMEAItem()
	 * @generated
	 */
	EAttribute getFMEAItem_RecommendedAction();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getActionStatus <em>Action Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Status</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getActionStatus()
	 * @see #getFMEAItem()
	 * @generated
	 */
	EAttribute getFMEAItem_ActionStatus();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getFailureMode <em>Failure Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Failure Mode</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getFailureMode()
	 * @see #getFMEAItem()
	 * @generated
	 */
	EReference getFMEAItem_FailureMode();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getAnalyzedComponent <em>Analyzed Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Analyzed Component</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.FMEAItem#getAnalyzedComponent()
	 * @see #getFMEAItem()
	 * @generated
	 */
	EReference getFMEAItem_AnalyzedComponent();

	/**
	 * Returns the meta object for class '{@link edu.kit.sdq.dsis.metamodel.unified.UnifiedSystemModel <em>System Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Model</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedSystemModel
	 * @generated
	 */
	EClass getUnifiedSystemModel();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.sdq.dsis.metamodel.unified.UnifiedSystemModel#getFmeaAnalysis <em>Fmea Analysis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fmea Analysis</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedSystemModel#getFmeaAnalysis()
	 * @see #getUnifiedSystemModel()
	 * @generated
	 */
	EReference getUnifiedSystemModel_FmeaAnalysis();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.sdq.dsis.metamodel.unified.UnifiedSystemModel#getGlobalHazards <em>Global Hazards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Hazards</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedSystemModel#getGlobalHazards()
	 * @see #getUnifiedSystemModel()
	 * @generated
	 */
	EReference getUnifiedSystemModel_GlobalHazards();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.sdq.dsis.metamodel.unified.UnifiedSystemModel#getRootBlocks <em>Root Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Root Blocks</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedSystemModel#getRootBlocks()
	 * @see #getUnifiedSystemModel()
	 * @generated
	 */
	EReference getUnifiedSystemModel_RootBlocks();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.sdq.dsis.metamodel.unified.UnifiedSystemModel#getSystemBlocks <em>System Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>System Blocks</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedSystemModel#getSystemBlocks()
	 * @see #getUnifiedSystemModel()
	 * @generated
	 */
	EReference getUnifiedSystemModel_SystemBlocks();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.sdq.dsis.metamodel.unified.UnifiedSystemModel#getBlockAssociations <em>Block Associations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Block Associations</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedSystemModel#getBlockAssociations()
	 * @see #getUnifiedSystemModel()
	 * @generated
	 */
	EReference getUnifiedSystemModel_BlockAssociations();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.sdq.dsis.metamodel.unified.UnifiedSystemModel#getBlockConnections <em>Block Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Block Connections</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedSystemModel#getBlockConnections()
	 * @see #getUnifiedSystemModel()
	 * @generated
	 */
	EReference getUnifiedSystemModel_BlockConnections();

	/**
	 * Returns the meta object for class '{@link edu.kit.sdq.dsis.metamodel.unified.IntegratedHazard <em>Integrated Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integrated Hazard</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.IntegratedHazard
	 * @generated
	 */
	EClass getIntegratedHazard();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.sdq.dsis.metamodel.unified.IntegratedHazard#getRiskLevel <em>Risk Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Risk Level</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.IntegratedHazard#getRiskLevel()
	 * @see #getIntegratedHazard()
	 * @generated
	 */
	EAttribute getIntegratedHazard_RiskLevel();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.sdq.dsis.metamodel.unified.IntegratedHazard#getRelatedBlocks <em>Related Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Related Blocks</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.IntegratedHazard#getRelatedBlocks()
	 * @see #getIntegratedHazard()
	 * @generated
	 */
	EReference getIntegratedHazard_RelatedBlocks();

	/**
	 * Returns the meta object for class '{@link edu.kit.sdq.dsis.metamodel.unified.SafetyCriticalBlock <em>Safety Critical Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Safety Critical Block</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.SafetyCriticalBlock
	 * @generated
	 */
	EClass getSafetyCriticalBlock();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.sdq.dsis.metamodel.unified.SafetyCriticalBlock#getSafetyCriticality <em>Safety Criticality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Safety Criticality</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.SafetyCriticalBlock#getSafetyCriticality()
	 * @see #getSafetyCriticalBlock()
	 * @generated
	 */
	EAttribute getSafetyCriticalBlock_SafetyCriticality();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.sdq.dsis.metamodel.unified.SafetyCriticalBlock#getFailureModes <em>Failure Modes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Failure Modes</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.SafetyCriticalBlock#getFailureModes()
	 * @see #getSafetyCriticalBlock()
	 * @generated
	 */
	EReference getSafetyCriticalBlock_FailureModes();

	/**
	 * Returns the meta object for class '{@link edu.kit.sdq.dsis.metamodel.unified.SystemBlock <em>System Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Block</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.SystemBlock
	 * @generated
	 */
	EClass getSystemBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.sdq.dsis.metamodel.unified.SystemBlock#getSubBlocks <em>Sub Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Blocks</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.SystemBlock#getSubBlocks()
	 * @see #getSystemBlock()
	 * @generated
	 */
	EReference getSystemBlock_SubBlocks();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.sdq.dsis.metamodel.unified.SystemBlock#getParentBlock <em>Parent Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Block</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.SystemBlock#getParentBlock()
	 * @see #getSystemBlock()
	 * @generated
	 */
	EReference getSystemBlock_ParentBlock();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.sdq.dsis.metamodel.unified.SystemBlock#getAssociationAsSource <em>Association As Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Association As Source</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.SystemBlock#getAssociationAsSource()
	 * @see #getSystemBlock()
	 * @generated
	 */
	EReference getSystemBlock_AssociationAsSource();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.sdq.dsis.metamodel.unified.SystemBlock#getAssociationAsTarget <em>Association As Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Association As Target</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.SystemBlock#getAssociationAsTarget()
	 * @see #getSystemBlock()
	 * @generated
	 */
	EReference getSystemBlock_AssociationAsTarget();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.sdq.dsis.metamodel.unified.SystemBlock#getConnectionAsSource <em>Connection As Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connection As Source</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.SystemBlock#getConnectionAsSource()
	 * @see #getSystemBlock()
	 * @generated
	 */
	EReference getSystemBlock_ConnectionAsSource();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.sdq.dsis.metamodel.unified.SystemBlock#getConnectionAsTarget <em>Connection As Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connection As Target</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.SystemBlock#getConnectionAsTarget()
	 * @see #getSystemBlock()
	 * @generated
	 */
	EReference getSystemBlock_ConnectionAsTarget();

	/**
	 * Returns the meta object for class '{@link edu.kit.sdq.dsis.metamodel.unified.BlockAssociation <em>Block Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Association</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.BlockAssociation
	 * @generated
	 */
	EClass getBlockAssociation();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.sdq.dsis.metamodel.unified.BlockAssociation#getAssociationType <em>Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Association Type</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.BlockAssociation#getAssociationType()
	 * @see #getBlockAssociation()
	 * @generated
	 */
	EAttribute getBlockAssociation_AssociationType();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.sdq.dsis.metamodel.unified.BlockAssociation#getSourceBlock <em>Source Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Block</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.BlockAssociation#getSourceBlock()
	 * @see #getBlockAssociation()
	 * @generated
	 */
	EReference getBlockAssociation_SourceBlock();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.sdq.dsis.metamodel.unified.BlockAssociation#getTargetBlock <em>Target Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Block</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.BlockAssociation#getTargetBlock()
	 * @see #getBlockAssociation()
	 * @generated
	 */
	EReference getBlockAssociation_TargetBlock();

	/**
	 * Returns the meta object for class '{@link edu.kit.sdq.dsis.metamodel.unified.BlockConnection <em>Block Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Connection</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.BlockConnection
	 * @generated
	 */
	EClass getBlockConnection();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.sdq.dsis.metamodel.unified.BlockConnection#getConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Type</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.BlockConnection#getConnectionType()
	 * @see #getBlockConnection()
	 * @generated
	 */
	EAttribute getBlockConnection_ConnectionType();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.sdq.dsis.metamodel.unified.BlockConnection#getFromBlock <em>From Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Block</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.BlockConnection#getFromBlock()
	 * @see #getBlockConnection()
	 * @generated
	 */
	EReference getBlockConnection_FromBlock();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.sdq.dsis.metamodel.unified.BlockConnection#getToBlock <em>To Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To Block</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.BlockConnection#getToBlock()
	 * @see #getBlockConnection()
	 * @generated
	 */
	EReference getBlockConnection_ToBlock();

	/**
	 * Returns the meta object for class '{@link edu.kit.sdq.dsis.metamodel.unified.BlockFailureMode <em>Block Failure Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Failure Mode</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.BlockFailureMode
	 * @generated
	 */
	EClass getBlockFailureMode();

	/**
	 * Returns the meta object for the container reference '{@link edu.kit.sdq.dsis.metamodel.unified.BlockFailureMode#getAffectedBlock <em>Affected Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Affected Block</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.BlockFailureMode#getAffectedBlock()
	 * @see #getBlockFailureMode()
	 * @generated
	 */
	EReference getBlockFailureMode_AffectedBlock();

	/**
	 * Returns the meta object for enum '{@link edu.kit.sdq.dsis.metamodel.unified.SafetyCriticalityLevel <em>Safety Criticality Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Safety Criticality Level</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.SafetyCriticalityLevel
	 * @generated
	 */
	EEnum getSafetyCriticalityLevel();

	/**
	 * Returns the meta object for enum '{@link edu.kit.sdq.dsis.metamodel.unified.ActionStatus <em>Action Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Status</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.ActionStatus
	 * @generated
	 */
	EEnum getActionStatus();

	/**
	 * Returns the meta object for enum '{@link edu.kit.sdq.dsis.metamodel.unified.RiskLevel <em>Risk Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Risk Level</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.RiskLevel
	 * @generated
	 */
	EEnum getRiskLevel();

	/**
	 * Returns the meta object for enum '{@link edu.kit.sdq.dsis.metamodel.unified.ConnectionType <em>Connection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Connection Type</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.ConnectionType
	 * @generated
	 */
	EEnum getConnectionType();

	/**
	 * Returns the meta object for enum '{@link edu.kit.sdq.dsis.metamodel.unified.AssociationType <em>Association Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Association Type</em>'.
	 * @see edu.kit.sdq.dsis.metamodel.unified.AssociationType
	 * @generated
	 */
	EEnum getAssociationType();

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
		 * The meta object literal for the '{@link edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedElementImpl
		 * @see edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedPackageImpl#getUnifiedElement()
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
		 * The meta object literal for the '{@link edu.kit.sdq.dsis.metamodel.unified.impl.FMEAAnalysisImpl <em>FMEA Analysis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.sdq.dsis.metamodel.unified.impl.FMEAAnalysisImpl
		 * @see edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedPackageImpl#getFMEAAnalysis()
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
		 * The meta object literal for the '{@link edu.kit.sdq.dsis.metamodel.unified.impl.FMEAItemImpl <em>FMEA Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.sdq.dsis.metamodel.unified.impl.FMEAItemImpl
		 * @see edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedPackageImpl#getFMEAItem()
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
		 * The meta object literal for the '{@link edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedSystemModelImpl <em>System Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedSystemModelImpl
		 * @see edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedPackageImpl#getUnifiedSystemModel()
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
		 * The meta object literal for the '{@link edu.kit.sdq.dsis.metamodel.unified.impl.IntegratedHazardImpl <em>Integrated Hazard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.sdq.dsis.metamodel.unified.impl.IntegratedHazardImpl
		 * @see edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedPackageImpl#getIntegratedHazard()
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
		 * The meta object literal for the '{@link edu.kit.sdq.dsis.metamodel.unified.impl.SafetyCriticalBlockImpl <em>Safety Critical Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.sdq.dsis.metamodel.unified.impl.SafetyCriticalBlockImpl
		 * @see edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedPackageImpl#getSafetyCriticalBlock()
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
		 * The meta object literal for the '{@link edu.kit.sdq.dsis.metamodel.unified.impl.SystemBlockImpl <em>System Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.sdq.dsis.metamodel.unified.impl.SystemBlockImpl
		 * @see edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedPackageImpl#getSystemBlock()
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
		 * The meta object literal for the '{@link edu.kit.sdq.dsis.metamodel.unified.impl.BlockAssociationImpl <em>Block Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.sdq.dsis.metamodel.unified.impl.BlockAssociationImpl
		 * @see edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedPackageImpl#getBlockAssociation()
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
		 * The meta object literal for the '{@link edu.kit.sdq.dsis.metamodel.unified.impl.BlockConnectionImpl <em>Block Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.sdq.dsis.metamodel.unified.impl.BlockConnectionImpl
		 * @see edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedPackageImpl#getBlockConnection()
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
		 * The meta object literal for the '{@link edu.kit.sdq.dsis.metamodel.unified.impl.BlockFailureModeImpl <em>Block Failure Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.sdq.dsis.metamodel.unified.impl.BlockFailureModeImpl
		 * @see edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedPackageImpl#getBlockFailureMode()
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
		 * The meta object literal for the '{@link edu.kit.sdq.dsis.metamodel.unified.SafetyCriticalityLevel <em>Safety Criticality Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.sdq.dsis.metamodel.unified.SafetyCriticalityLevel
		 * @see edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedPackageImpl#getSafetyCriticalityLevel()
		 * @generated
		 */
		EEnum SAFETY_CRITICALITY_LEVEL = eINSTANCE.getSafetyCriticalityLevel();

		/**
		 * The meta object literal for the '{@link edu.kit.sdq.dsis.metamodel.unified.ActionStatus <em>Action Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.sdq.dsis.metamodel.unified.ActionStatus
		 * @see edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedPackageImpl#getActionStatus()
		 * @generated
		 */
		EEnum ACTION_STATUS = eINSTANCE.getActionStatus();

		/**
		 * The meta object literal for the '{@link edu.kit.sdq.dsis.metamodel.unified.RiskLevel <em>Risk Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.sdq.dsis.metamodel.unified.RiskLevel
		 * @see edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedPackageImpl#getRiskLevel()
		 * @generated
		 */
		EEnum RISK_LEVEL = eINSTANCE.getRiskLevel();

		/**
		 * The meta object literal for the '{@link edu.kit.sdq.dsis.metamodel.unified.ConnectionType <em>Connection Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.sdq.dsis.metamodel.unified.ConnectionType
		 * @see edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedPackageImpl#getConnectionType()
		 * @generated
		 */
		EEnum CONNECTION_TYPE = eINSTANCE.getConnectionType();

		/**
		 * The meta object literal for the '{@link edu.kit.sdq.dsis.metamodel.unified.AssociationType <em>Association Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.sdq.dsis.metamodel.unified.AssociationType
		 * @see edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedPackageImpl#getAssociationType()
		 * @generated
		 */
		EEnum ASSOCIATION_TYPE = eINSTANCE.getAssociationType();

	}

} //UnifiedPackage
