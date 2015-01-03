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
 * A representation of the model object '<em><b>Unit Value Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.expression.UnitValueExpression#getUnit <em>Unit</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.expression.ExpressionPackage#getUnitValueExpression()
 * @model
 * @generated
 */
public interface UnitValueExpression extends ValueExpression {
	/**
	 * Returns the value of the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' containment reference.
	 * @see #setUnit(Name)
	 * @see net.mlanoe.language.vhdl.expression.ExpressionPackage#getUnitValueExpression_Unit()
	 * @model containment="true"
	 * @generated
	 */
	Name getUnit();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.expression.UnitValueExpression#getUnit <em>Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' containment reference.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(Name value);

} // UnitValueExpression
