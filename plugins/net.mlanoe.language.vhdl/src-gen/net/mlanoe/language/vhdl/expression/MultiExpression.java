/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.expression.MultiExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.expression.ExpressionPackage#getMultiExpression()
 * @model
 * @generated
 */
public interface MultiExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
	 * The list contents are of type {@link net.mlanoe.language.vhdl.expression.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference list.
	 * @see net.mlanoe.language.vhdl.expression.ExpressionPackage#getMultiExpression_Expression()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getExpression();

} // MultiExpression
