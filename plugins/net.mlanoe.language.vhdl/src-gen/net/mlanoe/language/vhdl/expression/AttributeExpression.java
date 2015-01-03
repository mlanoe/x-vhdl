/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.expression;

import net.mlanoe.language.vhdl.Name;
import net.mlanoe.language.vhdl.Signature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.expression.AttributeExpression#getSignature <em>Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.expression.ExpressionPackage#getAttributeExpression()
 * @model
 * @generated
 */
public interface AttributeExpression extends ValueExpression, Name {
	/**
	 * Returns the value of the '<em><b>Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' containment reference.
	 * @see #setSignature(Signature)
	 * @see net.mlanoe.language.vhdl.expression.ExpressionPackage#getAttributeExpression_Signature()
	 * @model containment="true"
	 * @generated
	 */
	Signature getSignature();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.expression.AttributeExpression#getSignature <em>Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' containment reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(Signature value);

} // AttributeExpression
