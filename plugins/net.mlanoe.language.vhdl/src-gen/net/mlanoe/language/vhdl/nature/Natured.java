/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.nature;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Natured</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.nature.Natured#getNature <em>Nature</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.nature.NaturePackage#getNatured()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Natured extends EObject {
	/**
	 * Returns the value of the '<em><b>Nature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature</em>' containment reference.
	 * @see #setNature(NatureReference)
	 * @see net.mlanoe.language.vhdl.nature.NaturePackage#getNatured_Nature()
	 * @model containment="true"
	 * @generated
	 */
	NatureReference getNature();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.nature.Natured#getNature <em>Nature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature</em>' containment reference.
	 * @see #getNature()
	 * @generated
	 */
	void setNature(NatureReference value);

} // Natured
