/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.expression;

import net.mlanoe.language.vhdl.Name;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Range Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.expression.RangeExpression#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.expression.ExpressionPackage#getRangeExpression()
 * @model
 * @generated
 */
public interface RangeExpression extends BinaryExpression, Name {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link net.mlanoe.language.vhdl.expression.RangeDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see net.mlanoe.language.vhdl.expression.RangeDirection
	 * @see #setDirection(RangeDirection)
	 * @see net.mlanoe.language.vhdl.expression.ExpressionPackage#getRangeExpression_Direction()
	 * @model
	 * @generated
	 */
	RangeDirection getDirection();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.expression.RangeExpression#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see net.mlanoe.language.vhdl.expression.RangeDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(RangeDirection value);

} // RangeExpression
