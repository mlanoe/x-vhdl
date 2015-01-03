/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.declaration;

import net.mlanoe.language.vhdl.Named;

import net.mlanoe.language.vhdl.nature.NatureDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nature Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.NatureDeclaration#getIs <em>Is</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getNatureDeclaration()
 * @model
 * @generated
 */
public interface NatureDeclaration extends Declaration, Named {
	/**
	 * Returns the value of the '<em><b>Is</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is</em>' containment reference.
	 * @see #setIs(NatureDefinition)
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getNatureDeclaration_Is()
	 * @model containment="true"
	 * @generated
	 */
	NatureDefinition getIs();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.declaration.NatureDeclaration#getIs <em>Is</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is</em>' containment reference.
	 * @see #getIs()
	 * @generated
	 */
	void setIs(NatureDefinition value);

} // NatureDeclaration
