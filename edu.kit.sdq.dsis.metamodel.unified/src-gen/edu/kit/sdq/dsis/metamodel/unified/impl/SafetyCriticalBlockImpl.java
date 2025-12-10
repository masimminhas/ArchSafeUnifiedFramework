/**
 */
package edu.kit.sdq.dsis.metamodel.unified.impl;

import edu.kit.sdq.dsis.metamodel.unified.BlockFailureMode;
import edu.kit.sdq.dsis.metamodel.unified.SafetyCriticalBlock;
import edu.kit.sdq.dsis.metamodel.unified.SafetyCriticalityLevel;
import edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Safety Critical Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.impl.SafetyCriticalBlockImpl#getSafetyCriticality <em>Safety Criticality</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.impl.SafetyCriticalBlockImpl#getFailureModes <em>Failure Modes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SafetyCriticalBlockImpl extends SystemBlockImpl implements SafetyCriticalBlock {
	/**
	 * The default value of the '{@link #getSafetyCriticality() <em>Safety Criticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafetyCriticality()
	 * @generated
	 * @ordered
	 */
	protected static final SafetyCriticalityLevel SAFETY_CRITICALITY_EDEFAULT = SafetyCriticalityLevel.LOW;

	/**
	 * The cached value of the '{@link #getSafetyCriticality() <em>Safety Criticality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafetyCriticality()
	 * @generated
	 * @ordered
	 */
	protected SafetyCriticalityLevel safetyCriticality = SAFETY_CRITICALITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFailureModes() <em>Failure Modes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureModes()
	 * @generated
	 * @ordered
	 */
	protected EList<BlockFailureMode> failureModes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SafetyCriticalBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnifiedPackage.Literals.SAFETY_CRITICAL_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SafetyCriticalityLevel getSafetyCriticality() {
		return safetyCriticality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSafetyCriticality(SafetyCriticalityLevel newSafetyCriticality) {
		SafetyCriticalityLevel oldSafetyCriticality = safetyCriticality;
		safetyCriticality = newSafetyCriticality == null ? SAFETY_CRITICALITY_EDEFAULT : newSafetyCriticality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UnifiedPackage.SAFETY_CRITICAL_BLOCK__SAFETY_CRITICALITY, oldSafetyCriticality, safetyCriticality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BlockFailureMode> getFailureModes() {
		if (failureModes == null) {
			failureModes = new EObjectContainmentWithInverseEList<BlockFailureMode>(BlockFailureMode.class, this,
					UnifiedPackage.SAFETY_CRITICAL_BLOCK__FAILURE_MODES,
					UnifiedPackage.BLOCK_FAILURE_MODE__AFFECTED_BLOCK);
		}
		return failureModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UnifiedPackage.SAFETY_CRITICAL_BLOCK__FAILURE_MODES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getFailureModes()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UnifiedPackage.SAFETY_CRITICAL_BLOCK__FAILURE_MODES:
			return ((InternalEList<?>) getFailureModes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UnifiedPackage.SAFETY_CRITICAL_BLOCK__SAFETY_CRITICALITY:
			return getSafetyCriticality();
		case UnifiedPackage.SAFETY_CRITICAL_BLOCK__FAILURE_MODES:
			return getFailureModes();
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
		case UnifiedPackage.SAFETY_CRITICAL_BLOCK__SAFETY_CRITICALITY:
			setSafetyCriticality((SafetyCriticalityLevel) newValue);
			return;
		case UnifiedPackage.SAFETY_CRITICAL_BLOCK__FAILURE_MODES:
			getFailureModes().clear();
			getFailureModes().addAll((Collection<? extends BlockFailureMode>) newValue);
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
		case UnifiedPackage.SAFETY_CRITICAL_BLOCK__SAFETY_CRITICALITY:
			setSafetyCriticality(SAFETY_CRITICALITY_EDEFAULT);
			return;
		case UnifiedPackage.SAFETY_CRITICAL_BLOCK__FAILURE_MODES:
			getFailureModes().clear();
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
		case UnifiedPackage.SAFETY_CRITICAL_BLOCK__SAFETY_CRITICALITY:
			return safetyCriticality != SAFETY_CRITICALITY_EDEFAULT;
		case UnifiedPackage.SAFETY_CRITICAL_BLOCK__FAILURE_MODES:
			return failureModes != null && !failureModes.isEmpty();
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
		result.append(" (safetyCriticality: ");
		result.append(safetyCriticality);
		result.append(')');
		return result.toString();
	}

} //SafetyCriticalBlockImpl
