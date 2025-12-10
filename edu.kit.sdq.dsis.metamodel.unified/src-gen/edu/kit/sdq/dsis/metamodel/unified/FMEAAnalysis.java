/**
 */
package edu.kit.sdq.dsis.metamodel.unified;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FMEA Analysis</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.FMEAAnalysis#getRpnThreshold <em>Rpn Threshold</em>}</li>
 *   <li>{@link edu.kit.sdq.dsis.metamodel.unified.FMEAAnalysis#getFmeaItems <em>Fmea Items</em>}</li>
 * </ul>
 *
 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getFMEAAnalysis()
 * @model
 * @generated
 */
public interface FMEAAnalysis extends UnifiedElement {
	/**
	 * Returns the value of the '<em><b>Rpn Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rpn Threshold</em>' attribute.
	 * @see #setRpnThreshold(int)
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getFMEAAnalysis_RpnThreshold()
	 * @model
	 * @generated
	 */
	int getRpnThreshold();

	/**
	 * Sets the value of the '{@link edu.kit.sdq.dsis.metamodel.unified.FMEAAnalysis#getRpnThreshold <em>Rpn Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rpn Threshold</em>' attribute.
	 * @see #getRpnThreshold()
	 * @generated
	 */
	void setRpnThreshold(int value);

	/**
	 * Returns the value of the '<em><b>Fmea Items</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.sdq.dsis.metamodel.unified.FMEAItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fmea Items</em>' containment reference list.
	 * @see edu.kit.sdq.dsis.metamodel.unified.UnifiedPackage#getFMEAAnalysis_FmeaItems()
	 * @model containment="true"
	 * @generated
	 */
	EList<FMEAItem> getFmeaItems();

} // FMEAAnalysis
