/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.declaration;

import net.mlanoe.language.vhdl.MultiName;
import net.mlanoe.language.vhdl.Name;
import net.mlanoe.language.vhdl.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.GroupDeclaration#getIs <em>Is</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.GroupDeclaration#getMember <em>Member</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getGroupDeclaration()
 * @model
 * @generated
 */
public interface GroupDeclaration extends Declaration, Named {
	/**
	 * Returns the value of the '<em><b>Is</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is</em>' containment reference.
	 * @see #setIs(Name)
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getGroupDeclaration_Is()
	 * @model containment="true"
	 * @generated
	 */
	Name getIs();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.declaration.GroupDeclaration#getIs <em>Is</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is</em>' containment reference.
	 * @see #getIs()
	 * @generated
	 */
	void setIs(Name value);

	/**
	 * Returns the value of the '<em><b>Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Member</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' containment reference.
	 * @see #setMember(MultiName)
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getGroupDeclaration_Member()
	 * @model containment="true"
	 * @generated
	 */
	MultiName getMember();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.declaration.GroupDeclaration#getMember <em>Member</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member</em>' containment reference.
	 * @see #getMember()
	 * @generated
	 */
	void setMember(MultiName value);

} // GroupDeclaration
