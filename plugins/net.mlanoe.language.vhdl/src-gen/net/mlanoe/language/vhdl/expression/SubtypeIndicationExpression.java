/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.expression;

import net.mlanoe.language.vhdl.Named;

import net.mlanoe.language.vhdl.type.TypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subtype Indication Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.expression.SubtypeIndicationExpression#getMark <em>Mark</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.expression.ExpressionPackage#getSubtypeIndicationExpression()
 * @model
 * @generated
 */
public interface SubtypeIndicationExpression extends IndicationExpression, TypeReference, Named {
	/**
	 * Returns the value of the '<em><b>Mark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mark</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mark</em>' containment reference.
	 * @see #setMark(TypeReference)
	 * @see net.mlanoe.language.vhdl.expression.ExpressionPackage#getSubtypeIndicationExpression_Mark()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getMark();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.expression.SubtypeIndicationExpression#getMark <em>Mark</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mark</em>' containment reference.
	 * @see #getMark()
	 * @generated
	 */
	void setMark(TypeReference value);

} // SubtypeIndicationExpression
