/**
 */
package edu.kit.sdq.dsis.metamodel.unified.impl;

import edu.kit.sdq.dsis.metamodel.unified.ActionStatus;
import edu.kit.sdq.dsis.metamodel.unified.AssociationType;
import edu.kit.sdq.dsis.metamodel.unified.BlockAssociation;
import edu.kit.sdq.dsis.metamodel.unified.BlockConnection;
import edu.kit.sdq.dsis.metamodel.unified.BlockFailureMode;
import edu.kit.sdq.dsis.metamodel.unified.ConnectionType;
import edu.kit.sdq.dsis.metamodel.unified.FMEAAnalysis;
import edu.kit.sdq.dsis.metamodel.unified.FMEAItem;
import edu.kit.sdq.dsis.metamodel.unified.IntegratedHazard;
import edu.kit.sdq.dsis.metamodel.unified.RiskLevel;
import edu.kit.sdq.dsis.metamodel.unified.SafetyCriticalBlock;
import edu.kit.sdq.dsis.metamodel.unified.SafetyCriticalityLevel;
import edu.kit.sdq.dsis.metamodel.unified.SystemBlock;
import edu.kit.sdq.dsis.metamodel.unified.UnifiedElement;
import edu.kit.sdq.dsis.metamodel.unified.UnifiedFactory;
import edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage;
import edu.kit.sdq.dsis.metamodel.unified.UnifiedSystemModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnifiedPackageImpl extends EPackageImpl implements UnifiedPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unifiedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmeaAnalysisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fmeaItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unifiedSystemModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integratedHazardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass safetyCriticalBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockFailureModeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum safetyCriticalityLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum riskLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum connectionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum associationTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UnifiedPackageImpl() {
		super(eNS_URI, UnifiedFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link UnifiedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UnifiedPackage init() {
		if (isInited)
			return (UnifiedPackage) EPackage.Registry.INSTANCE.getEPackage(UnifiedPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUnifiedPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UnifiedPackageImpl theUnifiedPackage = registeredUnifiedPackage instanceof UnifiedPackageImpl
				? (UnifiedPackageImpl) registeredUnifiedPackage
				: new UnifiedPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theUnifiedPackage.createPackageContents();

		// Initialize created meta-data
		theUnifiedPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUnifiedPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UnifiedPackage.eNS_URI, theUnifiedPackage);
		return theUnifiedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnifiedElement() {
		return unifiedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnifiedElement_Id() {
		return (EAttribute) unifiedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnifiedElement_Name() {
		return (EAttribute) unifiedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMEAAnalysis() {
		return fmeaAnalysisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFMEAAnalysis_RpnThreshold() {
		return (EAttribute) fmeaAnalysisEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMEAAnalysis_FmeaItems() {
		return (EReference) fmeaAnalysisEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFMEAItem() {
		return fmeaItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFMEAItem_Severity() {
		return (EAttribute) fmeaItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFMEAItem_Occurrence() {
		return (EAttribute) fmeaItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFMEAItem_Detection() {
		return (EAttribute) fmeaItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFMEAItem_LocalEffect() {
		return (EAttribute) fmeaItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFMEAItem_SystemEffect() {
		return (EAttribute) fmeaItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFMEAItem_RecommendedAction() {
		return (EAttribute) fmeaItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFMEAItem_ActionStatus() {
		return (EAttribute) fmeaItemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMEAItem_FailureMode() {
		return (EReference) fmeaItemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFMEAItem_AnalyzedComponent() {
		return (EReference) fmeaItemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnifiedSystemModel() {
		return unifiedSystemModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnifiedSystemModel_FmeaAnalysis() {
		return (EReference) unifiedSystemModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnifiedSystemModel_GlobalHazards() {
		return (EReference) unifiedSystemModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnifiedSystemModel_RootBlocks() {
		return (EReference) unifiedSystemModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnifiedSystemModel_SystemBlocks() {
		return (EReference) unifiedSystemModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnifiedSystemModel_BlockAssociations() {
		return (EReference) unifiedSystemModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnifiedSystemModel_BlockConnections() {
		return (EReference) unifiedSystemModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntegratedHazard() {
		return integratedHazardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegratedHazard_RiskLevel() {
		return (EAttribute) integratedHazardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIntegratedHazard_RelatedBlocks() {
		return (EReference) integratedHazardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSafetyCriticalBlock() {
		return safetyCriticalBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSafetyCriticalBlock_SafetyCriticality() {
		return (EAttribute) safetyCriticalBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSafetyCriticalBlock_FailureModes() {
		return (EReference) safetyCriticalBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemBlock() {
		return systemBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemBlock_SubBlocks() {
		return (EReference) systemBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemBlock_ParentBlock() {
		return (EReference) systemBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemBlock_AssociationAsSource() {
		return (EReference) systemBlockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemBlock_AssociationAsTarget() {
		return (EReference) systemBlockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemBlock_ConnectionAsSource() {
		return (EReference) systemBlockEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemBlock_ConnectionAsTarget() {
		return (EReference) systemBlockEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlockAssociation() {
		return blockAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBlockAssociation_AssociationType() {
		return (EAttribute) blockAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlockAssociation_SourceBlock() {
		return (EReference) blockAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlockAssociation_TargetBlock() {
		return (EReference) blockAssociationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlockConnection() {
		return blockConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBlockConnection_ConnectionType() {
		return (EAttribute) blockConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlockConnection_FromBlock() {
		return (EReference) blockConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlockConnection_ToBlock() {
		return (EReference) blockConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlockFailureMode() {
		return blockFailureModeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlockFailureMode_AffectedBlock() {
		return (EReference) blockFailureModeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSafetyCriticalityLevel() {
		return safetyCriticalityLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getActionStatus() {
		return actionStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRiskLevel() {
		return riskLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConnectionType() {
		return connectionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAssociationType() {
		return associationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnifiedFactory getUnifiedFactory() {
		return (UnifiedFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		unifiedElementEClass = createEClass(UNIFIED_ELEMENT);
		createEAttribute(unifiedElementEClass, UNIFIED_ELEMENT__ID);
		createEAttribute(unifiedElementEClass, UNIFIED_ELEMENT__NAME);

		fmeaAnalysisEClass = createEClass(FMEA_ANALYSIS);
		createEAttribute(fmeaAnalysisEClass, FMEA_ANALYSIS__RPN_THRESHOLD);
		createEReference(fmeaAnalysisEClass, FMEA_ANALYSIS__FMEA_ITEMS);

		fmeaItemEClass = createEClass(FMEA_ITEM);
		createEAttribute(fmeaItemEClass, FMEA_ITEM__SEVERITY);
		createEAttribute(fmeaItemEClass, FMEA_ITEM__OCCURRENCE);
		createEAttribute(fmeaItemEClass, FMEA_ITEM__DETECTION);
		createEAttribute(fmeaItemEClass, FMEA_ITEM__LOCAL_EFFECT);
		createEAttribute(fmeaItemEClass, FMEA_ITEM__SYSTEM_EFFECT);
		createEAttribute(fmeaItemEClass, FMEA_ITEM__RECOMMENDED_ACTION);
		createEAttribute(fmeaItemEClass, FMEA_ITEM__ACTION_STATUS);
		createEReference(fmeaItemEClass, FMEA_ITEM__FAILURE_MODE);
		createEReference(fmeaItemEClass, FMEA_ITEM__ANALYZED_COMPONENT);

		unifiedSystemModelEClass = createEClass(UNIFIED_SYSTEM_MODEL);
		createEReference(unifiedSystemModelEClass, UNIFIED_SYSTEM_MODEL__FMEA_ANALYSIS);
		createEReference(unifiedSystemModelEClass, UNIFIED_SYSTEM_MODEL__GLOBAL_HAZARDS);
		createEReference(unifiedSystemModelEClass, UNIFIED_SYSTEM_MODEL__ROOT_BLOCKS);
		createEReference(unifiedSystemModelEClass, UNIFIED_SYSTEM_MODEL__SYSTEM_BLOCKS);
		createEReference(unifiedSystemModelEClass, UNIFIED_SYSTEM_MODEL__BLOCK_ASSOCIATIONS);
		createEReference(unifiedSystemModelEClass, UNIFIED_SYSTEM_MODEL__BLOCK_CONNECTIONS);

		integratedHazardEClass = createEClass(INTEGRATED_HAZARD);
		createEAttribute(integratedHazardEClass, INTEGRATED_HAZARD__RISK_LEVEL);
		createEReference(integratedHazardEClass, INTEGRATED_HAZARD__RELATED_BLOCKS);

		safetyCriticalBlockEClass = createEClass(SAFETY_CRITICAL_BLOCK);
		createEAttribute(safetyCriticalBlockEClass, SAFETY_CRITICAL_BLOCK__SAFETY_CRITICALITY);
		createEReference(safetyCriticalBlockEClass, SAFETY_CRITICAL_BLOCK__FAILURE_MODES);

		systemBlockEClass = createEClass(SYSTEM_BLOCK);
		createEReference(systemBlockEClass, SYSTEM_BLOCK__SUB_BLOCKS);
		createEReference(systemBlockEClass, SYSTEM_BLOCK__PARENT_BLOCK);
		createEReference(systemBlockEClass, SYSTEM_BLOCK__ASSOCIATION_AS_SOURCE);
		createEReference(systemBlockEClass, SYSTEM_BLOCK__ASSOCIATION_AS_TARGET);
		createEReference(systemBlockEClass, SYSTEM_BLOCK__CONNECTION_AS_SOURCE);
		createEReference(systemBlockEClass, SYSTEM_BLOCK__CONNECTION_AS_TARGET);

		blockAssociationEClass = createEClass(BLOCK_ASSOCIATION);
		createEAttribute(blockAssociationEClass, BLOCK_ASSOCIATION__ASSOCIATION_TYPE);
		createEReference(blockAssociationEClass, BLOCK_ASSOCIATION__SOURCE_BLOCK);
		createEReference(blockAssociationEClass, BLOCK_ASSOCIATION__TARGET_BLOCK);

		blockConnectionEClass = createEClass(BLOCK_CONNECTION);
		createEAttribute(blockConnectionEClass, BLOCK_CONNECTION__CONNECTION_TYPE);
		createEReference(blockConnectionEClass, BLOCK_CONNECTION__FROM_BLOCK);
		createEReference(blockConnectionEClass, BLOCK_CONNECTION__TO_BLOCK);

		blockFailureModeEClass = createEClass(BLOCK_FAILURE_MODE);
		createEReference(blockFailureModeEClass, BLOCK_FAILURE_MODE__AFFECTED_BLOCK);

		// Create enums
		safetyCriticalityLevelEEnum = createEEnum(SAFETY_CRITICALITY_LEVEL);
		actionStatusEEnum = createEEnum(ACTION_STATUS);
		riskLevelEEnum = createEEnum(RISK_LEVEL);
		connectionTypeEEnum = createEEnum(CONNECTION_TYPE);
		associationTypeEEnum = createEEnum(ASSOCIATION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		fmeaAnalysisEClass.getESuperTypes().add(this.getUnifiedElement());
		fmeaItemEClass.getESuperTypes().add(this.getUnifiedElement());
		integratedHazardEClass.getESuperTypes().add(this.getUnifiedElement());
		safetyCriticalBlockEClass.getESuperTypes().add(this.getSystemBlock());
		systemBlockEClass.getESuperTypes().add(this.getUnifiedElement());
		blockAssociationEClass.getESuperTypes().add(this.getUnifiedElement());
		blockConnectionEClass.getESuperTypes().add(this.getUnifiedElement());
		blockFailureModeEClass.getESuperTypes().add(this.getUnifiedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(unifiedElementEClass, UnifiedElement.class, "UnifiedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnifiedElement_Id(), ecorePackage.getEString(), "id", null, 0, 1, UnifiedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnifiedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, UnifiedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmeaAnalysisEClass, FMEAAnalysis.class, "FMEAAnalysis", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFMEAAnalysis_RpnThreshold(), ecorePackage.getEInt(), "rpnThreshold", null, 0, 1,
				FMEAAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getFMEAAnalysis_FmeaItems(), this.getFMEAItem(), null, "fmeaItems", null, 0, -1,
				FMEAAnalysis.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fmeaItemEClass, FMEAItem.class, "FMEAItem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFMEAItem_Severity(), ecorePackage.getEInt(), "severity", null, 0, 1, FMEAItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFMEAItem_Occurrence(), ecorePackage.getEInt(), "occurrence", null, 0, 1, FMEAItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFMEAItem_Detection(), ecorePackage.getEInt(), "detection", null, 0, 1, FMEAItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFMEAItem_LocalEffect(), ecorePackage.getEString(), "localEffect", null, 0, 1, FMEAItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFMEAItem_SystemEffect(), ecorePackage.getEString(), "systemEffect", null, 0, 1,
				FMEAItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFMEAItem_RecommendedAction(), ecorePackage.getEString(), "recommendedAction", null, 0, 1,
				FMEAItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFMEAItem_ActionStatus(), this.getActionStatus(), "actionStatus", null, 0, 1, FMEAItem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMEAItem_FailureMode(), this.getBlockFailureMode(), null, "failureMode", null, 0, 1,
				FMEAItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFMEAItem_AnalyzedComponent(), this.getSafetyCriticalBlock(), null, "analyzedComponent", null,
				1, 1, FMEAItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unifiedSystemModelEClass, UnifiedSystemModel.class, "UnifiedSystemModel", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnifiedSystemModel_FmeaAnalysis(), this.getFMEAAnalysis(), null, "fmeaAnalysis", null, 0, -1,
				UnifiedSystemModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnifiedSystemModel_GlobalHazards(), this.getIntegratedHazard(), null, "globalHazards", null,
				0, -1, UnifiedSystemModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnifiedSystemModel_RootBlocks(), this.getSafetyCriticalBlock(), null, "rootBlocks", null, 0,
				-1, UnifiedSystemModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnifiedSystemModel_SystemBlocks(), this.getSystemBlock(), null, "systemBlocks", null, 0, -1,
				UnifiedSystemModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnifiedSystemModel_BlockAssociations(), this.getBlockAssociation(), null, "blockAssociations",
				null, 0, -1, UnifiedSystemModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnifiedSystemModel_BlockConnections(), this.getBlockConnection(), null, "blockConnections",
				null, 0, -1, UnifiedSystemModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integratedHazardEClass, IntegratedHazard.class, "IntegratedHazard", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegratedHazard_RiskLevel(), this.getRiskLevel(), "riskLevel", null, 0, 1,
				IntegratedHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getIntegratedHazard_RelatedBlocks(), this.getSafetyCriticalBlock(), null, "relatedBlocks", null,
				0, -1, IntegratedHazard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(safetyCriticalBlockEClass, SafetyCriticalBlock.class, "SafetyCriticalBlock", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSafetyCriticalBlock_SafetyCriticality(), this.getSafetyCriticalityLevel(),
				"safetyCriticality", null, 0, 1, SafetyCriticalBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSafetyCriticalBlock_FailureModes(), this.getBlockFailureMode(),
				this.getBlockFailureMode_AffectedBlock(), "failureModes", null, 0, -1, SafetyCriticalBlock.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemBlockEClass, SystemBlock.class, "SystemBlock", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemBlock_SubBlocks(), this.getSystemBlock(), this.getSystemBlock_ParentBlock(),
				"subBlocks", null, 0, -1, SystemBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemBlock_ParentBlock(), this.getSystemBlock(), this.getSystemBlock_SubBlocks(),
				"parentBlock", null, 0, 1, SystemBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemBlock_AssociationAsSource(), this.getBlockAssociation(),
				this.getBlockAssociation_SourceBlock(), "associationAsSource", null, 0, -1, SystemBlock.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemBlock_AssociationAsTarget(), this.getBlockAssociation(),
				this.getBlockAssociation_TargetBlock(), "associationAsTarget", null, 0, -1, SystemBlock.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemBlock_ConnectionAsSource(), this.getBlockConnection(),
				this.getBlockConnection_FromBlock(), "connectionAsSource", null, 0, -1, SystemBlock.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemBlock_ConnectionAsTarget(), this.getBlockConnection(),
				this.getBlockConnection_ToBlock(), "connectionAsTarget", null, 0, -1, SystemBlock.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(blockAssociationEClass, BlockAssociation.class, "BlockAssociation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlockAssociation_AssociationType(), this.getAssociationType(), "associationType", null, 0, 1,
				BlockAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getBlockAssociation_SourceBlock(), this.getSystemBlock(),
				this.getSystemBlock_AssociationAsSource(), "sourceBlock", null, 1, 1, BlockAssociation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlockAssociation_TargetBlock(), this.getSystemBlock(),
				this.getSystemBlock_AssociationAsTarget(), "targetBlock", null, 1, 1, BlockAssociation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockConnectionEClass, BlockConnection.class, "BlockConnection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlockConnection_ConnectionType(), this.getConnectionType(), "connectionType", null, 0, 1,
				BlockConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getBlockConnection_FromBlock(), this.getSystemBlock(), this.getSystemBlock_ConnectionAsSource(),
				"fromBlock", null, 1, -1, BlockConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlockConnection_ToBlock(), this.getSystemBlock(), this.getSystemBlock_ConnectionAsTarget(),
				"toBlock", null, 1, -1, BlockConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockFailureModeEClass, BlockFailureMode.class, "BlockFailureMode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlockFailureMode_AffectedBlock(), this.getSafetyCriticalBlock(),
				this.getSafetyCriticalBlock_FailureModes(), "affectedBlock", null, 0, 1, BlockFailureMode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(safetyCriticalityLevelEEnum, SafetyCriticalityLevel.class, "SafetyCriticalityLevel");
		addEEnumLiteral(safetyCriticalityLevelEEnum, SafetyCriticalityLevel.LOW);
		addEEnumLiteral(safetyCriticalityLevelEEnum, SafetyCriticalityLevel.MEDIUM);
		addEEnumLiteral(safetyCriticalityLevelEEnum, SafetyCriticalityLevel.HIGH);
		addEEnumLiteral(safetyCriticalityLevelEEnum, SafetyCriticalityLevel.CRITICAL);

		initEEnum(actionStatusEEnum, ActionStatus.class, "ActionStatus");
		addEEnumLiteral(actionStatusEEnum, ActionStatus.OPEN);
		addEEnumLiteral(actionStatusEEnum, ActionStatus.IN_PROGRESS);
		addEEnumLiteral(actionStatusEEnum, ActionStatus.COMPLETED);
		addEEnumLiteral(actionStatusEEnum, ActionStatus.VERIFIED);

		initEEnum(riskLevelEEnum, RiskLevel.class, "RiskLevel");
		addEEnumLiteral(riskLevelEEnum, RiskLevel.NEGLIGIBLE);
		addEEnumLiteral(riskLevelEEnum, RiskLevel.MARGINAL);
		addEEnumLiteral(riskLevelEEnum, RiskLevel.CRITICAL_RISK);
		addEEnumLiteral(riskLevelEEnum, RiskLevel.CATASTROPHIC);

		initEEnum(connectionTypeEEnum, ConnectionType.class, "ConnectionType");
		addEEnumLiteral(connectionTypeEEnum, ConnectionType.DATA_FLOW);
		addEEnumLiteral(connectionTypeEEnum, ConnectionType.CONTROL_FLOW);
		addEEnumLiteral(connectionTypeEEnum, ConnectionType.POWER_FLOW);
		addEEnumLiteral(connectionTypeEEnum, ConnectionType.SIGNAL_FLOW);
		addEEnumLiteral(connectionTypeEEnum, ConnectionType.MECHANICAL);

		initEEnum(associationTypeEEnum, AssociationType.class, "AssociationType");
		addEEnumLiteral(associationTypeEEnum, AssociationType.DEPENDENCY);
		addEEnumLiteral(associationTypeEEnum, AssociationType.AGGREGATION);
		addEEnumLiteral(associationTypeEEnum, AssociationType.COMPOSITION);
		addEEnumLiteral(associationTypeEEnum, AssociationType.ASSOCIATION);
		addEEnumLiteral(associationTypeEEnum, AssociationType.REALIZATION);

		// Create resource
		createResource(eNS_URI);
	}

} //UnifiedPackageImpl
