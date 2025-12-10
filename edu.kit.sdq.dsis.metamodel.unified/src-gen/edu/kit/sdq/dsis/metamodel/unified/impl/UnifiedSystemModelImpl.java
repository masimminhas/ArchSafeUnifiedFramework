/**
 */
package edu.kit.sdq.dsis.metamodel.unified.impl;

import edu.kit.sdq.dsis.metamodel.unified.BlockAssociation;
import edu.kit.sdq.dsis.metamodel.unified.BlockConnection;
import edu.kit.sdq.dsis.metamodel.unified.FMEAAnalysis;
import edu.kit.sdq.dsis.metamodel.unified.IntegratedHazard;
import edu.kit.sdq.dsis.metamodel.unified.SafetyCriticalBlock;
import edu.kit.sdq.dsis.metamodel.unified.SystemBlock;
import edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage;
import edu.kit.sdq.dsis.metamodel.unified.UnifiedSystemModel;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedSystemModelImpl#getFmeaAnalysis <em>Fmea Analysis</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedSystemModelImpl#getGlobalHazards <em>Global Hazards</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedSystemModelImpl#getRootBlocks <em>Root Blocks</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedSystemModelImpl#getSystemBlocks <em>System Blocks</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedSystemModelImpl#getBlockAssociations <em>Block Associations</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.impl.UnifiedSystemModelImpl#getBlockConnections <em>Block Connections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnifiedSystemModelImpl extends MinimalEObjectImpl.Container implements UnifiedSystemModel {
	/**
	 * The cached value of the '{@link #getFmeaAnalysis() <em>Fmea Analysis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFmeaAnalysis()
	 * @generated
	 * @ordered
	 */
	protected EList<FMEAAnalysis> fmeaAnalysis;

	/**
	 * The cached value of the '{@link #getGlobalHazards() <em>Global Hazards</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalHazards()
	 * @generated
	 * @ordered
	 */
	protected EList<IntegratedHazard> globalHazards;

	/**
	 * The cached value of the '{@link #getRootBlocks() <em>Root Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<SafetyCriticalBlock> rootBlocks;

	/**
	 * The cached value of the '{@link #getSystemBlocks() <em>System Blocks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemBlocks()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemBlock> systemBlocks;

	/**
	 * The cached value of the '{@link #getBlockAssociations() <em>Block Associations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockAssociations()
	 * @generated
	 * @ordered
	 */
	protected EList<BlockAssociation> blockAssociations;

	/**
	 * The cached value of the '{@link #getBlockConnections() <em>Block Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<BlockConnection> blockConnections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnifiedSystemModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnifiedPackage.Literals.UNIFIED_SYSTEM_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FMEAAnalysis> getFmeaAnalysis() {
		if (fmeaAnalysis == null) {
			fmeaAnalysis = new EObjectContainmentEList<FMEAAnalysis>(FMEAAnalysis.class, this,
					UnifiedPackage.UNIFIED_SYSTEM_MODEL__FMEA_ANALYSIS);
		}
		return fmeaAnalysis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IntegratedHazard> getGlobalHazards() {
		if (globalHazards == null) {
			globalHazards = new EObjectContainmentEList<IntegratedHazard>(IntegratedHazard.class, this,
					UnifiedPackage.UNIFIED_SYSTEM_MODEL__GLOBAL_HAZARDS);
		}
		return globalHazards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SafetyCriticalBlock> getRootBlocks() {
		if (rootBlocks == null) {
			rootBlocks = new EObjectContainmentEList<SafetyCriticalBlock>(SafetyCriticalBlock.class, this,
					UnifiedPackage.UNIFIED_SYSTEM_MODEL__ROOT_BLOCKS);
		}
		return rootBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemBlock> getSystemBlocks() {
		if (systemBlocks == null) {
			systemBlocks = new EObjectContainmentEList<SystemBlock>(SystemBlock.class, this,
					UnifiedPackage.UNIFIED_SYSTEM_MODEL__SYSTEM_BLOCKS);
		}
		return systemBlocks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BlockAssociation> getBlockAssociations() {
		if (blockAssociations == null) {
			blockAssociations = new EObjectContainmentEList<BlockAssociation>(BlockAssociation.class, this,
					UnifiedPackage.UNIFIED_SYSTEM_MODEL__BLOCK_ASSOCIATIONS);
		}
		return blockAssociations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BlockConnection> getBlockConnections() {
		if (blockConnections == null) {
			blockConnections = new EObjectContainmentEList<BlockConnection>(BlockConnection.class, this,
					UnifiedPackage.UNIFIED_SYSTEM_MODEL__BLOCK_CONNECTIONS);
		}
		return blockConnections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case UnifiedPackage.UNIFIED_SYSTEM_MODEL__FMEA_ANALYSIS:
			return ((InternalEList<?>) getFmeaAnalysis()).basicRemove(otherEnd, msgs);
		case UnifiedPackage.UNIFIED_SYSTEM_MODEL__GLOBAL_HAZARDS:
			return ((InternalEList<?>) getGlobalHazards()).basicRemove(otherEnd, msgs);
		case UnifiedPackage.UNIFIED_SYSTEM_MODEL__ROOT_BLOCKS:
			return ((InternalEList<?>) getRootBlocks()).basicRemove(otherEnd, msgs);
		case UnifiedPackage.UNIFIED_SYSTEM_MODEL__SYSTEM_BLOCKS:
			return ((InternalEList<?>) getSystemBlocks()).basicRemove(otherEnd, msgs);
		case UnifiedPackage.UNIFIED_SYSTEM_MODEL__BLOCK_ASSOCIATIONS:
			return ((InternalEList<?>) getBlockAssociations()).basicRemove(otherEnd, msgs);
		case UnifiedPackage.UNIFIED_SYSTEM_MODEL__BLOCK_CONNECTIONS:
			return ((InternalEList<?>) getBlockConnections()).basicRemove(otherEnd, msgs);
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
		case UnifiedPackage.UNIFIED_SYSTEM_MODEL__FMEA_ANALYSIS:
			return getFmeaAnalysis();
		case UnifiedPackage.UNIFIED_SYSTEM_MODEL__GLOBAL_HAZARDS:
			return getGlobalHazards();
		case UnifiedPackage.UNIFIED_SYSTEM_MODEL__ROOT_BLOCKS:
			return getRootBlocks();
		case UnifiedPackage.UNIFIED_SYSTEM_MODEL__SYSTEM_BLOCKS:
			return getSystemBlocks();
		case UnifiedPackage.UNIFIED_SYSTEM_MODEL__BLOCK_ASSOCIATIONS:
			return getBlockAssociations();
		case UnifiedPackage.UNIFIED_SYSTEM_MODEL__BLOCK_CONNECTIONS:
			return getBlockConnections();
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
		case UnifiedPackage.UNIFIED_SYSTEM_MODEL__FMEA_ANALYSIS:
			getFmeaAnalysis().clear();
			getFmeaAnalysis().addAll((Collection<? extends FMEAAnalysis>) newValue);
			return;
		case UnifiedPackage.UNIFIED_SYSTEM_MODEL__GLOBAL_HAZARDS:
			getGlobalHazards().clear();
			getGlobalHazards().addAll((Collection<? extends IntegratedHazard>) newValue);
			return;
		case UnifiedPackage.UNIFIED_SYSTEM_MODEL__ROOT_BLOCKS:
			getRootBlocks().clear();
			getRootBlocks().addAll((Collection<? extends SafetyCriticalBlock>) newValue);
			return;
		case UnifiedPackage.UNIFIED_SYSTEM_MODEL__SYSTEM_BLOCKS:
			getSystemBlocks().clear();
			getSystemBlocks().addAll((Collection<? extends SystemBlock>) newValue);
			return;
		case UnifiedPackage.UNIFIED_SYSTEM_MODEL__BLOCK_ASSOCIATIONS:
			getBlockAssociations().clear();
			getBlockAssociations().addAll((Collection<? extends BlockAssociation>) newValue);
			return;
		case UnifiedPackage.UNIFIED_SYSTEM_MODEL__BLOCK_CONNECTIONS:
			getBlockConnections().clear();
			getBlockConnections().addAll((Collection<? extends BlockConnection>) newValue);
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
		case UnifiedPackage.UNIFIED_SYSTEM_MODEL__FMEA_ANALYSIS:
			getFmeaAnalysis().clear();
			return;
		case UnifiedPackage.UNIFIED_SYSTEM_MODEL__GLOBAL_HAZARDS:
			getGlobalHazards().clear();
			return;
		case UnifiedPackage.UNIFIED_SYSTEM_MODEL__ROOT_BLOCKS:
			getRootBlocks().clear();
			return;
		case UnifiedPackage.UNIFIED_SYSTEM_MODEL__SYSTEM_BLOCKS:
			getSystemBlocks().clear();
			return;
		case UnifiedPackage.UNIFIED_SYSTEM_MODEL__BLOCK_ASSOCIATIONS:
			getBlockAssociations().clear();
			return;
		case UnifiedPackage.UNIFIED_SYSTEM_MODEL__BLOCK_CONNECTIONS:
			getBlockConnections().clear();
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
		case UnifiedPackage.UNIFIED_SYSTEM_MODEL__FMEA_ANALYSIS:
			return fmeaAnalysis != null && !fmeaAnalysis.isEmpty();
		case UnifiedPackage.UNIFIED_SYSTEM_MODEL__GLOBAL_HAZARDS:
			return globalHazards != null && !globalHazards.isEmpty();
		case UnifiedPackage.UNIFIED_SYSTEM_MODEL__ROOT_BLOCKS:
			return rootBlocks != null && !rootBlocks.isEmpty();
		case UnifiedPackage.UNIFIED_SYSTEM_MODEL__SYSTEM_BLOCKS:
			return systemBlocks != null && !systemBlocks.isEmpty();
		case UnifiedPackage.UNIFIED_SYSTEM_MODEL__BLOCK_ASSOCIATIONS:
			return blockAssociations != null && !blockAssociations.isEmpty();
		case UnifiedPackage.UNIFIED_SYSTEM_MODEL__BLOCK_CONNECTIONS:
			return blockConnections != null && !blockConnections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UnifiedSystemModelImpl
