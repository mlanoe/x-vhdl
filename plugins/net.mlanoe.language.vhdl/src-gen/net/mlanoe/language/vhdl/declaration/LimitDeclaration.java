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
 * A representation of the model object '<em><b>Limit Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.LimitDeclaration#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getLimitDeclaration()
 * @model
 * @generated
 */
public interface LimitDeclaration extends Declaration, MultiNamed, Typed {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Expression)
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getLimitDeclaration_Value()
	 * @model containment="true"
	 * @generated
	 */
	Expression getValue();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.declaration.LimitDeclaration#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Expression value);

} // LimitDeclaration
