/**
 */
package edu.kit.sdq.dsis.metamodel.unified.impl;

import edu.kit.sdq.dsis.metamodel.unified.BlockFailureMode;
import edu.kit.sdq.dsis.metamodel.unified.SafetyCriticalBlock;
import edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Failure Mode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.impl.BlockFailureModeImpl#getAffectedBlock <em>Affected Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BlockFailureModeImpl extends UnifiedElementImpl implements BlockFailureMode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockFailureModeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnifiedPackage.Literals.BLOCK_FAILURE_MODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SafetyCriticalBlock getAffectedBlock() {
		if (eContainerFeatureID() != UnifiedPackage.BLOCK_FAILURE_MODE__AFFECTED_BLOCK)
			return null;
		return (SafetyCriticalBlock) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAffectedBlock(SafetyCriticalBlock newAffectedBlock, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newAffectedBlock, UnifiedPackage.BLOCK_FAILURE_MODE__AFFECTED_BLOCK,
				msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAffectedBlock(SafetyCriticalBlock newAffectedBlock) {
		if (newAffectedBlock != eInternalContainer()
				|| (eContainerFeatureID() != UnifiedPackage.BLOCK_FAILURE_MODE__AFFECTED_BLOCK
						&& newAffectedBlock != null)) {
			if (EcoreUtil.isAncestor(this, newAffectedBlock))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAffectedBlock != null)
				msgs = ((InternalEObject) newAffectedBlock).eInverseAdd(this,
						UnifiedPackage.SAFETY_CRITICAL_BLOCK__FAILURE_MODES, SafetyCriticalBlock.class, msgs);
			msgs = basicSetAffectedBlock(newAffectedBlock, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedPackage.BLOCK_FAILURE_MODE__AFFECTED_BLOCK,
					newAffectedBlock, newAffectedBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UnifiedPackage.BLOCK_FAILURE_MODE__AFFECTED_BLOCK:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetAffectedBlock((SafetyCriticalBlock) otherEnd, msgs);
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
		case UnifiedPackage.BLOCK_FAILURE_MODE__AFFECTED_BLOCK:
			return basicSetAffectedBlock(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case UnifiedPackage.BLOCK_FAILURE_MODE__AFFECTED_BLOCK:
			return eInternalContainer().eInverseRemove(this, UnifiedPackage.SAFETY_CRITICAL_BLOCK__FAILURE_MODES,
					SafetyCriticalBlock.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UnifiedPackage.BLOCK_FAILURE_MODE__AFFECTED_BLOCK:
			return getAffectedBlock();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case UnifiedPackage.BLOCK_FAILURE_MODE__AFFECTED_BLOCK:
			setAffectedBlock((SafetyCriticalBlock) newValue);
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
		case UnifiedPackage.BLOCK_FAILURE_MODE__AFFECTED_BLOCK:
			setAffectedBlock((SafetyCriticalBlock) null);
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
		case UnifiedPackage.BLOCK_FAILURE_MODE__AFFECTED_BLOCK:
			return getAffectedBlock() != null;
		}
		return super.eIsSet(featureID);
	}

} //BlockFailureModeImpl
