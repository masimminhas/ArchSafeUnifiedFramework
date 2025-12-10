/**
 */
package edu.kit.sdq.dsis.metamodel.unified.impl;

import edu.kit.sdq.dsis.metamodel.unified.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UnifiedFactoryImpl extends EFactoryImpl implements UnifiedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UnifiedFactory init() {
		try {
			UnifiedFactory theUnifiedFactory = (UnifiedFactory) EPackage.Registry.INSTANCE
					.getEFactory(UnifiedPackage.eNS_URI);
			if (theUnifiedFactory != null) {
				return theUnifiedFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UnifiedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnifiedFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case UnifiedPackage.FMEA_ANALYSIS:
			return createFMEAAnalysis();
		case UnifiedPackage.FMEA_ITEM:
			return createFMEAItem();
		case UnifiedPackage.UNIFIED_SYSTEM_MODEL:
			return createUnifiedSystemModel();
		case UnifiedPackage.INTEGRATED_HAZARD:
			return createIntegratedHazard();
		case UnifiedPackage.SAFETY_CRITICAL_BLOCK:
			return createSafetyCriticalBlock();
		case UnifiedPackage.SYSTEM_BLOCK:
			return createSystemBlock();
		case UnifiedPackage.BLOCK_ASSOCIATION:
			return createBlockAssociation();
		case UnifiedPackage.BLOCK_CONNECTION:
			return createBlockConnection();
		case UnifiedPackage.BLOCK_FAILURE_MODE:
			return createBlockFailureMode();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case UnifiedPackage.SAFETY_CRITICALITY_LEVEL:
			return createSafetyCriticalityLevelFromString(eDataType, initialValue);
		case UnifiedPackage.ACTION_STATUS:
			return createActionStatusFromString(eDataType, initialValue);
		case UnifiedPackage.RISK_LEVEL:
			return createRiskLevelFromString(eDataType, initialValue);
		case UnifiedPackage.CONNECTION_TYPE:
			return createConnectionTypeFromString(eDataType, initialValue);
		case UnifiedPackage.ASSOCIATION_TYPE:
			return createAssociationTypeFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case UnifiedPackage.SAFETY_CRITICALITY_LEVEL:
			return convertSafetyCriticalityLevelToString(eDataType, instanceValue);
		case UnifiedPackage.ACTION_STATUS:
			return convertActionStatusToString(eDataType, instanceValue);
		case UnifiedPackage.RISK_LEVEL:
			return convertRiskLevelToString(eDataType, instanceValue);
		case UnifiedPackage.CONNECTION_TYPE:
			return convertConnectionTypeToString(eDataType, instanceValue);
		case UnifiedPackage.ASSOCIATION_TYPE:
			return convertAssociationTypeToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMEAAnalysis createFMEAAnalysis() {
		FMEAAnalysisImpl fmeaAnalysis = new FMEAAnalysisImpl();
		return fmeaAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FMEAItem createFMEAItem() {
		FMEAItemImpl fmeaItem = new FMEAItemImpl();
		return fmeaItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnifiedSystemModel createUnifiedSystemModel() {
		UnifiedSystemModelImpl unifiedSystemModel = new UnifiedSystemModelImpl();
		return unifiedSystemModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegratedHazard createIntegratedHazard() {
		IntegratedHazardImpl integratedHazard = new IntegratedHazardImpl();
		return integratedHazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SafetyCriticalBlock createSafetyCriticalBlock() {
		SafetyCriticalBlockImpl safetyCriticalBlock = new SafetyCriticalBlockImpl();
		return safetyCriticalBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemBlock createSystemBlock() {
		SystemBlockImpl systemBlock = new SystemBlockImpl();
		return systemBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockAssociation createBlockAssociation() {
		BlockAssociationImpl blockAssociation = new BlockAssociationImpl();
		return blockAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockConnection createBlockConnection() {
		BlockConnectionImpl blockConnection = new BlockConnectionImpl();
		return blockConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockFailureMode createBlockFailureMode() {
		BlockFailureModeImpl blockFailureMode = new BlockFailureModeImpl();
		return blockFailureMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyCriticalityLevel createSafetyCriticalityLevelFromString(EDataType eDataType, String initialValue) {
		SafetyCriticalityLevel result = SafetyCriticalityLevel.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSafetyCriticalityLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionStatus createActionStatusFromString(EDataType eDataType, String initialValue) {
		ActionStatus result = ActionStatus.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskLevel createRiskLevelFromString(EDataType eDataType, String initialValue) {
		RiskLevel result = RiskLevel.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRiskLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionType createConnectionTypeFromString(EDataType eDataType, String initialValue) {
		ConnectionType result = ConnectionType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConnectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationType createAssociationTypeFromString(EDataType eDataType, String initialValue) {
		AssociationType result = AssociationType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssociationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnifiedPackage getUnifiedPackage() {
		return (UnifiedPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UnifiedPackage getPackage() {
		return UnifiedPackage.eINSTANCE;
	}

} //UnifiedFactoryImpl
