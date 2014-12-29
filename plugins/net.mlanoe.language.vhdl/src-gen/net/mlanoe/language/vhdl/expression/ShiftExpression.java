/**
 * Copyright (c) 2014 mlanoe
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.expression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shift Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.expression.ShiftExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.expression.ExpressionPackage#getShiftExpression()
 * @model
 * @generated
 */
public interface ShiftExpression extends BinaryExpression {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link net.mlanoe.language.vhdl.expression.ShiftOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see net.mlanoe.language.vhdl.expression.ShiftOperator
	 * @see #setOperator(ShiftOperator)
	 * @see net.mlanoe.language.vhdl.expression.ExpressionPackage#getShiftExpression_Operator()
	 * @model
	 * @generated
	 */
	ShiftOperator getOperator();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.expression.ShiftExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see net.mlanoe.language.vhdl.expression.ShiftOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ShiftOperator value);

} // ShiftExpression
