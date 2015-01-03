/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.Model#getDesign <em>Design</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.VhdlPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends VhdlObject {
	/**
	 * Returns the value of the '<em><b>Design</b></em>' containment reference list.
	 * The list contents are of type {@link net.mlanoe.language.vhdl.DesignUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design</em>' containment reference list.
	 * @see net.mlanoe.language.vhdl.VhdlPackage#getModel_Design()
	 * @model containment="true"
	 * @generated
	 */
	EList<DesignUnit> getDesign();

} // Model
