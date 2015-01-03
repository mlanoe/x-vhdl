/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.declaration;

import net.mlanoe.language.vhdl.Named;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subprogram Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.SubprogramDeclaration#getParameter <em>Parameter</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.SubprogramDeclaration#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getSubprogramDeclaration()
 * @model abstract="true"
 * @generated
 */
public interface SubprogramDeclaration extends Declaration, Named {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link net.mlanoe.language.vhdl.declaration.Declaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getSubprogramDeclaration_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Declaration> getParameter();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(SubprogramBody)
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getSubprogramDeclaration_Body()
	 * @model containment="true"
	 * @generated
	 */
	SubprogramBody getBody();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.declaration.SubprogramDeclaration#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(SubprogramBody value);

} // SubprogramDeclaration
