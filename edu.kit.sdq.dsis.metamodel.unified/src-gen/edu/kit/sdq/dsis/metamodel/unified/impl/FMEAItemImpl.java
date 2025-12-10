/**
 */
package edu.kit.sdq.dsis.metamodel.unified.impl;

import edu.kit.sdq.dsis.metamodel.unified.ActionStatus;
import edu.kit.sdq.dsis.metamodel.unified.BlockFailureMode;
import edu.kit.sdq.dsis.metamodel.unified.FMEAItem;
import edu.kit.sdq.dsis.metamodel.unified.SafetyCriticalBlock;
import edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FMEA Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.impl.FMEAItemImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.impl.FMEAItemImpl#getOccurrence <em>Occurrence</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.impl.FMEAItemImpl#getDetection <em>Detection</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.impl.FMEAItemImpl#getLocalEffect <em>Local Effect</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.impl.FMEAItemImpl#getSystemEffect <em>System Effect</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.impl.FMEAItemImpl#getRecommendedAction <em>Recommended Action</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.impl.FMEAItemImpl#getActionStatus <em>Action Status</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.impl.FMEAItemImpl#getFailureMode <em>Failure Mode</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.impl.FMEAItemImpl#getAnalyzedComponent <em>Analyzed Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FMEAItemImpl extends UnifiedElementImpl implements FMEAItem {
	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final int SEVERITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected int severity = SEVERITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOccurrence() <em>Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrence()
	 * @generated
	 * @ordered
	 */
	protected static final int OCCURRENCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOccurrence() <em>Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrence()
	 * @generated
	 * @ordered
	 */
	protected int occurrence = OCCURRENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDetection() <em>Detection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetection()
	 * @generated
	 * @ordered
	 */
	protected static final int DETECTION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDetection() <em>Detection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetection()
	 * @generated
	 * @ordered
	 */
	protected int detection = DETECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalEffect() <em>Local Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalEffect()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_EFFECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalEffect() <em>Local Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalEffect()
	 * @generated
	 * @ordered
	 */
	protected String localEffect = LOCAL_EFFECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemEffect() <em>System Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemEffect()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_EFFECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemEffect() <em>System Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemEffect()
	 * @generated
	 * @ordered
	 */
	protected String systemEffect = SYSTEM_EFFECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecommendedAction() <em>Recommended Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendedAction()
	 * @generated
	 * @ordered
	 */
	protected static final String RECOMMENDED_ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecommendedAction() <em>Recommended Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecommendedAction()
	 * @generated
	 * @ordered
	 */
	protected String recommendedAction = RECOMMENDED_ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionStatus() <em>Action Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ActionStatus ACTION_STATUS_EDEFAULT = ActionStatus.OPEN;

	/**
	 * The cached value of the '{@link #getActionStatus() <em>Action Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatus()
	 * @generated
	 * @ordered
	 */
	protected ActionStatus actionStatus = ACTION_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFailureMode() <em>Failure Mode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureMode()
	 * @generated
	 * @ordered
	 */
	protected BlockFailureMode failureMode;

	/**
	 * The cached value of the '{@link #getAnalyzedComponent() <em>Analyzed Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnalyzedComponent()
	 * @generated
	 * @ordered
	 */
	protected SafetyCriticalBlock analyzedComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FMEAItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnifiedPackage.Literals.FMEA_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeverity(int newSeverity) {
		int oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedPackage.FMEA_ITEM__SEVERITY, oldSeverity,
					severity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOccurrence() {
		return occurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOccurrence(int newOccurrence) {
		int oldOccurrence = occurrence;
		occurrence = newOccurrence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedPackage.FMEA_ITEM__OCCURRENCE, oldOccurrence,
					occurrence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDetection() {
		return detection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDetection(int newDetection) {
		int oldDetection = detection;
		detection = newDetection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedPackage.FMEA_ITEM__DETECTION, oldDetection,
					detection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalEffect() {
		return localEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalEffect(String newLocalEffect) {
		String oldLocalEffect = localEffect;
		localEffect = newLocalEffect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedPackage.FMEA_ITEM__LOCAL_EFFECT,
					oldLocalEffect, localEffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemEffect() {
		return systemEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemEffect(String newSystemEffect) {
		String oldSystemEffect = systemEffect;
		systemEffect = newSystemEffect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedPackage.FMEA_ITEM__SYSTEM_EFFECT,
					oldSystemEffect, systemEffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRecommendedAction() {
		return recommendedAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecommendedAction(String newRecommendedAction) {
		String oldRecommendedAction = recommendedAction;
		recommendedAction = newRecommendedAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedPackage.FMEA_ITEM__RECOMMENDED_ACTION,
					oldRecommendedAction, recommendedAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionStatus getActionStatus() {
		return actionStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActionStatus(ActionStatus newActionStatus) {
		ActionStatus oldActionStatus = actionStatus;
		actionStatus = newActionStatus == null ? ACTION_STATUS_EDEFAULT : newActionStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedPackage.FMEA_ITEM__ACTION_STATUS,
					oldActionStatus, actionStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockFailureMode getFailureMode() {
		if (failureMode != null && failureMode.eIsProxy()) {
			InternalEObject oldFailureMode = (InternalEObject) failureMode;
			failureMode = (BlockFailureMode) eResolveProxy(oldFailureMode);
			if (failureMode != oldFailureMode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UnifiedPackage.FMEA_ITEM__FAILURE_MODE,
							oldFailureMode, failureMode));
			}
		}
		return failureMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockFailureMode basicGetFailureMode() {
		return failureMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFailureMode(BlockFailureMode newFailureMode) {
		BlockFailureMode oldFailureMode = failureMode;
		failureMode = newFailureMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedPackage.FMEA_ITEM__FAILURE_MODE,
					oldFailureMode, failureMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SafetyCriticalBlock getAnalyzedComponent() {
		if (analyzedComponent != null && analyzedComponent.eIsProxy()) {
			InternalEObject oldAnalyzedComponent = (InternalEObject) analyzedComponent;
			analyzedComponent = (SafetyCriticalBlock) eResolveProxy(oldAnalyzedComponent);
			if (analyzedComponent != oldAnalyzedComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UnifiedPackage.FMEA_ITEM__ANALYZED_COMPONENT, oldAnalyzedComponent, analyzedComponent));
			}
		}
		return analyzedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SafetyCriticalBlock basicGetAnalyzedComponent() {
		return analyzedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnalyzedComponent(SafetyCriticalBlock newAnalyzedComponent) {
		SafetyCriticalBlock oldAnalyzedComponent = analyzedComponent;
		analyzedComponent = newAnalyzedComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnifiedPackage.FMEA_ITEM__ANALYZED_COMPONENT,
					oldAnalyzedComponent, analyzedComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case UnifiedPackage.FMEA_ITEM__SEVERITY:
			return getSeverity();
		case UnifiedPackage.FMEA_ITEM__OCCURRENCE:
			return getOccurrence();
		case UnifiedPackage.FMEA_ITEM__DETECTION:
			return getDetection();
		case UnifiedPackage.FMEA_ITEM__LOCAL_EFFECT:
			return getLocalEffect();
		case UnifiedPackage.FMEA_ITEM__SYSTEM_EFFECT:
			return getSystemEffect();
		case UnifiedPackage.FMEA_ITEM__RECOMMENDED_ACTION:
			return getRecommendedAction();
		case UnifiedPackage.FMEA_ITEM__ACTION_STATUS:
			return getActionStatus();
		case UnifiedPackage.FMEA_ITEM__FAILURE_MODE:
			if (resolve)
				return getFailureMode();
			return basicGetFailureMode();
		case UnifiedPackage.FMEA_ITEM__ANALYZED_COMPONENT:
			if (resolve)
				return getAnalyzedComponent();
			return basicGetAnalyzedComponent();
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
		case UnifiedPackage.FMEA_ITEM__SEVERITY:
			setSeverity((Integer) newValue);
			return;
		case UnifiedPackage.FMEA_ITEM__OCCURRENCE:
			setOccurrence((Integer) newValue);
			return;
		case UnifiedPackage.FMEA_ITEM__DETECTION:
			setDetection((Integer) newValue);
			return;
		case UnifiedPackage.FMEA_ITEM__LOCAL_EFFECT:
			setLocalEffect((String) newValue);
			return;
		case UnifiedPackage.FMEA_ITEM__SYSTEM_EFFECT:
			setSystemEffect((String) newValue);
			return;
		case UnifiedPackage.FMEA_ITEM__RECOMMENDED_ACTION:
			setRecommendedAction((String) newValue);
			return;
		case UnifiedPackage.FMEA_ITEM__ACTION_STATUS:
			setActionStatus((ActionStatus) newValue);
			return;
		case UnifiedPackage.FMEA_ITEM__FAILURE_MODE:
			setFailureMode((BlockFailureMode) newValue);
			return;
		case UnifiedPackage.FMEA_ITEM__ANALYZED_COMPONENT:
			setAnalyzedComponent((SafetyCriticalBlock) newValue);
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
		case UnifiedPackage.FMEA_ITEM__SEVERITY:
			setSeverity(SEVERITY_EDEFAULT);
			return;
		case UnifiedPackage.FMEA_ITEM__OCCURRENCE:
			setOccurrence(OCCURRENCE_EDEFAULT);
			return;
		case UnifiedPackage.FMEA_ITEM__DETECTION:
			setDetection(DETECTION_EDEFAULT);
			return;
		case UnifiedPackage.FMEA_ITEM__LOCAL_EFFECT:
			setLocalEffect(LOCAL_EFFECT_EDEFAULT);
			return;
		case UnifiedPackage.FMEA_ITEM__SYSTEM_EFFECT:
			setSystemEffect(SYSTEM_EFFECT_EDEFAULT);
			return;
		case UnifiedPackage.FMEA_ITEM__RECOMMENDED_ACTION:
			setRecommendedAction(RECOMMENDED_ACTION_EDEFAULT);
			return;
		case UnifiedPackage.FMEA_ITEM__ACTION_STATUS:
			setActionStatus(ACTION_STATUS_EDEFAULT);
			return;
		case UnifiedPackage.FMEA_ITEM__FAILURE_MODE:
			setFailureMode((BlockFailureMode) null);
			return;
		case UnifiedPackage.FMEA_ITEM__ANALYZED_COMPONENT:
			setAnalyzedComponent((SafetyCriticalBlock) null);
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
		case UnifiedPackage.FMEA_ITEM__SEVERITY:
			return severity != SEVERITY_EDEFAULT;
		case UnifiedPackage.FMEA_ITEM__OCCURRENCE:
			return occurrence != OCCURRENCE_EDEFAULT;
		case UnifiedPackage.FMEA_ITEM__DETECTION:
			return detection != DETECTION_EDEFAULT;
		case UnifiedPackage.FMEA_ITEM__LOCAL_EFFECT:
			return LOCAL_EFFECT_EDEFAULT == null ? localEffect != null : !LOCAL_EFFECT_EDEFAULT.equals(localEffect);
		case UnifiedPackage.FMEA_ITEM__SYSTEM_EFFECT:
			return SYSTEM_EFFECT_EDEFAULT == null ? systemEffect != null : !SYSTEM_EFFECT_EDEFAULT.equals(systemEffect);
		case UnifiedPackage.FMEA_ITEM__RECOMMENDED_ACTION:
			return RECOMMENDED_ACTION_EDEFAULT == null ? recommendedAction != null
					: !RECOMMENDED_ACTION_EDEFAULT.equals(recommendedAction);
		case UnifiedPackage.FMEA_ITEM__ACTION_STATUS:
			return actionStatus != ACTION_STATUS_EDEFAULT;
		case UnifiedPackage.FMEA_ITEM__FAILURE_MODE:
			return failureMode != null;
		case UnifiedPackage.FMEA_ITEM__ANALYZED_COMPONENT:
			return analyzedComponent != null;
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
		result.append(" (severity: ");
		result.append(severity);
		result.append(", occurrence: ");
		result.append(occurrence);
		result.append(", detection: ");
		result.append(detection);
		result.append(", localEffect: ");
		result.append(localEffect);
		result.append(", systemEffect: ");
		result.append(systemEffect);
		result.append(", recommendedAction: ");
		result.append(recommendedAction);
		result.append(", actionStatus: ");
		result.append(actionStatus);
		result.append(')');
		return result.toString();
	}

} //FMEAItemImpl
