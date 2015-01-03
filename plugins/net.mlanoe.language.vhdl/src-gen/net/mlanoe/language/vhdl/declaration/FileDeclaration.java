/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.declaration;

import net.mlanoe.language.vhdl.MultiNamed;

import net.mlanoe.language.vhdl.expression.Expression;

import net.mlanoe.language.vhdl.type.Typed;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.FileDeclaration#getOpen <em>Open</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.FileDeclaration#getIs <em>Is</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getFileDeclaration()
 * @model
 * @generated
 */
public interface FileDeclaration extends Declaration, MultiNamed, Typed {
	/**
	 * Returns the value of the '<em><b>Open</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Open</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Open</em>' containment reference.
	 * @see #setOpen(Expression)
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getFileDeclaration_Open()
	 * @model containment="true"
	 * @generated
	 */
	Expression getOpen();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.declaration.FileDeclaration#getOpen <em>Open</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Open</em>' containment reference.
	 * @see #getOpen()
	 * @generated
	 */
	void setOpen(Expression value);

	/**
	 * Returns the value of the '<em><b>Is</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is</em>' containment reference.
	 * @see #setIs(Expression)
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getFileDeclaration_Is()
	 * @model containment="true"
	 * @generated
	 */
	Expression getIs();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.declaration.FileDeclaration#getIs <em>Is</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is</em>' containment reference.
	 * @see #getIs()
	 * @generated
	 */
	void setIs(Expression value);

} // FileDeclaration
