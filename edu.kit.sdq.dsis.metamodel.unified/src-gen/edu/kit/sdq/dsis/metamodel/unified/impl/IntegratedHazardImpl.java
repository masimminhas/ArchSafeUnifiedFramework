/**
 */
package edu.kit.sdq.dsis.metamodel.unified.impl;

import edu.kit.sdq.dsis.metamodel.unified.IntegratedHazard;
import edu.kit.sdq.dsis.metamodel.unified.RiskLevel;
import edu.kit.sdq.dsis.metamodel.unified.SafetyCriticalBlock;
import edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integrated Hazard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.impl.IntegratedHazardImpl#getRiskLevel <em>Risk Level</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.impl.IntegratedHazardImpl#getRelatedBlocks <em>Related Blocks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegratedHazardImpl extends UnifiedElementImpl implements IntegratedHazard {
	/**
	 * The default value of the '{@link #getRiskLevel() <em>Risk Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskLevel()
	 * @generated
	 * @ordered
	 */
	protected static final RiskLevel RISK_LEVEL_EDEFAULT = RiskLevel.NEGLIGIBLE;

	/**
	 * The cached value of the '{@link #getRiskLevel() <em>Risk Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskLevel()
	 * @generated
	 * @ordered
	 */
	protected RiskLevel riskLevel = RISK_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelatedBlocks() <em>Related Blocks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<SafetyCriticalBlock> relatedBlocks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegratedHazardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnifiedPackage.Literals.INTEGRATED_HAZARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskLevel getRiskLevel() {
		return riskLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRiskLevel(RiskLevel newRiskLevel) {
		RiskLevel oldRiskLevel = riskLevel;
		riskLevel = newRiskLevel == null ? RISK_LEVEL_EDEFAULT : newRiskLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedPackage.INTEGRATED_HAZARD__RISK_LEVEL,
					oldRiskLevel, riskLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SafetyCriticalBlock> getRelatedBlocks() {
		if (relatedBlocks == null) {
			relatedBlocks = new EObjectResolvingEList<SafetyCriticalBlock>(SafetyCriticalBlock.class, this,
					UnifiedPackage.INTEGRATED_HAZARD__RELATED_BLOCKS);
		}
		return relatedBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UnifiedPackage.INTEGRATED_HAZARD__RISK_LEVEL:
			return getRiskLevel();
		case UnifiedPackage.INTEGRATED_HAZARD__RELATED_BLOCKS:
			return getRelatedBlocks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case UnifiedPackage.INTEGRATED_HAZARD__RISK_LEVEL:
			setRiskLevel((RiskLevel) newValue);
			return;
		case UnifiedPackage.INTEGRATED_HAZARD__RELATED_BLOCKS:
			getRelatedBlocks().clear();
			getRelatedBlocks().addAll((Collection<? extends SafetyCriticalBlock>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case UnifiedPackage.INTEGRATED_HAZARD__RISK_LEVEL:
			setRiskLevel(RISK_LEVEL_EDEFAULT);
			return;
		case UnifiedPackage.INTEGRATED_HAZARD__RELATED_BLOCKS:
			getRelatedBlocks().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case UnifiedPackage.INTEGRATED_HAZARD__RISK_LEVEL:
			return riskLevel != RISK_LEVEL_EDEFAULT;
		case UnifiedPackage.INTEGRATED_HAZARD__RELATED_BLOCKS:
			return relatedBlocks != null && !relatedBlocks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (riskLevel: ");
		result.append(riskLevel);
		result.append(')');
		return result.toString();
	}

} //IntegratedHazardImpl
