/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.expression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sign Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.expression.SignExpression#getSign <em>Sign</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.expression.SignExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.expression.ExpressionPackage#getSignExpression()
 * @model
 * @generated
 */
public interface SignExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Sign</b></em>' attribute.
	 * The literals are from the enumeration {@link net.mlanoe.language.vhdl.expression.Sign}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sign</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sign</em>' attribute.
	 * @see net.mlanoe.language.vhdl.expression.Sign
	 * @see #setSign(Sign)
	 * @see net.mlanoe.language.vhdl.expression.ExpressionPackage#getSignExpression_Sign()
	 * @model
	 * @generated
	 */
	Sign getSign();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.expression.SignExpression#getSign <em>Sign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sign</em>' attribute.
	 * @see net.mlanoe.language.vhdl.expression.Sign
	 * @see #getSign()
	 * @generated
	 */
	void setSign(Sign value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see net.mlanoe.language.vhdl.expression.ExpressionPackage#getSignExpression_Expression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.expression.SignExpression#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

} // SignExpression
