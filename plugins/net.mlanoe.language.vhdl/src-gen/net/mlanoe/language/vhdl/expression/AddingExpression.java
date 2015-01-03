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
 * A representation of the model object '<em><b>Adding Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.expression.AddingExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.expression.ExpressionPackage#getAddingExpression()
 * @model
 * @generated
 */
public interface AddingExpression extends BinaryExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link net.mlanoe.language.vhdl.expression.AddingOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see net.mlanoe.language.vhdl.expression.AddingOperator
	 * @see #setOperator(AddingOperator)
	 * @see net.mlanoe.language.vhdl.expression.ExpressionPackage#getAddingExpression_Operator()
	 * @model
	 * @generated
	 */
	AddingOperator getOperator();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.expression.AddingExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see net.mlanoe.language.vhdl.expression.AddingOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(AddingOperator value);

} // AddingExpression
