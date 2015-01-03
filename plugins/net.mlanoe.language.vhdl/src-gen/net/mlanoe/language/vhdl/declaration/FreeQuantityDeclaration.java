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
 * A representation of the model object '<em><b>Free Quantity Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.FreeQuantityDeclaration#getQuantity <em>Quantity</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getFreeQuantityDeclaration()
 * @model
 * @generated
 */
public interface FreeQuantityDeclaration extends QuantityDeclaration, MultiNamed, Typed {
	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Expression)
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getFreeQuantityDeclaration_Quantity()
	 * @model containment="true"
	 * @generated
	 */
	Expression getQuantity();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.declaration.FreeQuantityDeclaration#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Expression value);

} // FreeQuantityDeclaration
