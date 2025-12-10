/**
 */
package edu.kit.sdq.dsis.metamodel.unified.impl;

import edu.kit.sdq.dsis.metamodel.unified.FMEAAnalysis;
import edu.kit.sdq.dsis.metamodel.unified.FMEAItem;
import edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FMEA Analysis</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.impl.FMEAAnalysisImpl#getRpnThreshold <em>Rpn Threshold</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.impl.FMEAAnalysisImpl#getFmeaItems <em>Fmea Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FMEAAnalysisImpl extends UnifiedElementImpl implements FMEAAnalysis {
	/**
	 * The default value of the '{@link #getRpnThreshold() <em>Rpn Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRpnThreshold()
	 * @generated
	 * @ordered
	 */
	protected static final int RPN_THRESHOLD_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRpnThreshold() <em>Rpn Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRpnThreshold()
	 * @generated
	 * @ordered
	 */
	protected int rpnThreshold = RPN_THRESHOLD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFmeaItems() <em>Fmea Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFmeaItems()
	 * @generated
	 * @ordered
	 */
	protected EList<FMEAItem> fmeaItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FMEAAnalysisImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnifiedPackage.Literals.FMEA_ANALYSIS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRpnThreshold() {
		return rpnThreshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRpnThreshold(int newRpnThreshold) {
		int oldRpnThreshold = rpnThreshold;
		rpnThreshold = newRpnThreshold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedPackage.FMEA_ANALYSIS__RPN_THRESHOLD,
					oldRpnThreshold, rpnThreshold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FMEAItem> getFmeaItems() {
		if (fmeaItems == null) {
			fmeaItems = new EObjectContainmentEList<FMEAItem>(FMEAItem.class, this,
					UnifiedPackage.FMEA_ANALYSIS__FMEA_ITEMS);
		}
		return fmeaItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UnifiedPackage.FMEA_ANALYSIS__FMEA_ITEMS:
			return ((InternalEList<?>) getFmeaItems()).basicRemove(otherEnd, msgs);
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
		case UnifiedPackage.FMEA_ANALYSIS__RPN_THRESHOLD:
			return getRpnThreshold();
		case UnifiedPackage.FMEA_ANALYSIS__FMEA_ITEMS:
			return getFmeaItems();
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
		case UnifiedPackage.FMEA_ANALYSIS__RPN_THRESHOLD:
			setRpnThreshold((Integer) newValue);
			return;
		case UnifiedPackage.FMEA_ANALYSIS__FMEA_ITEMS:
			getFmeaItems().clear();
			getFmeaItems().addAll((Collection<? extends FMEAItem>) newValue);
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
		case UnifiedPackage.FMEA_ANALYSIS__RPN_THRESHOLD:
			setRpnThreshold(RPN_THRESHOLD_EDEFAULT);
			return;
		case UnifiedPackage.FMEA_ANALYSIS__FMEA_ITEMS:
			getFmeaItems().clear();
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
		case UnifiedPackage.FMEA_ANALYSIS__RPN_THRESHOLD:
			return rpnThreshold != RPN_THRESHOLD_EDEFAULT;
		case UnifiedPackage.FMEA_ANALYSIS__FMEA_ITEMS:
			return fmeaItems != null && !fmeaItems.isEmpty();
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
		result.append(" (rpnThreshold: ");
		result.append(rpnThreshold);
		result.append(')');
		return result.toString();
	}

} //FMEAAnalysisImpl
