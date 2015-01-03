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
 * A representation of the model object '<em><b>Next Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.statement.NextStatement#getNext <em>Next</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.NextStatement#getWhen <em>When</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getNextStatement()
 * @model
 * @generated
 */
public interface NextStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' attribute.
	 * @see #setNext(String)
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getNextStatement_Next()
	 * @model
	 * @generated
	 */
	String getNext();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.NextStatement#getNext <em>Next</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' attribute.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(String value);

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
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getNextStatement_When()
	 * @model containment="true"
	 * @generated
	 */
	Expression getWhen();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.NextStatement#getWhen <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' containment reference.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(Expression value);

} // NextStatement
