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
 * A representation of the model object '<em><b>Exit Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.statement.ExitStatement#getExit <em>Exit</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.ExitStatement#getWhen <em>When</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getExitStatement()
 * @model
 * @generated
 */
public interface ExitStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Exit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit</em>' attribute.
	 * @see #setExit(String)
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getExitStatement_Exit()
	 * @model
	 * @generated
	 */
	String getExit();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.ExitStatement#getExit <em>Exit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit</em>' attribute.
	 * @see #getExit()
	 * @generated
	 */
	void setExit(String value);

	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' containment reference.
	 * @see #setWhen(Expression)
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getExitStatement_When()
	 * @model containment="true"
	 * @generated
	 */
	Expression getWhen();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.ExitStatement#getWhen <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' containment reference.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(Expression value);

} // ExitStatement
