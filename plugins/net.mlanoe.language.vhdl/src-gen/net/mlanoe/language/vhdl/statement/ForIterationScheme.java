/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.statement;

import net.mlanoe.language.vhdl.expression.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Iteration Scheme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.statement.ForIterationScheme#getVariable <em>Variable</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.ForIterationScheme#getIn <em>In</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getForIterationScheme()
 * @model
 * @generated
 */
public interface ForIterationScheme extends IterationScheme {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' attribute.
	 * @see #setVariable(String)
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getForIterationScheme_Variable()
	 * @model
	 * @generated
	 */
	String getVariable();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.ForIterationScheme#getVariable <em>Variable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' attribute.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(String value);

	/**
	 * Returns the value of the '<em><b>In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' containment reference.
	 * @see #setIn(Expression)
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getForIterationScheme_In()
	 * @model containment="true"
	 * @generated
	 */
	Expression getIn();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.ForIterationScheme#getIn <em>In</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' containment reference.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(Expression value);

} // ForIterationScheme
