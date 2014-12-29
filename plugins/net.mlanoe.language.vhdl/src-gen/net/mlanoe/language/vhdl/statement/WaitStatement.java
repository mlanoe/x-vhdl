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
package net.mlanoe.language.vhdl.statement;

import net.mlanoe.language.vhdl.MultiName;
import net.mlanoe.language.vhdl.expression.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wait Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.statement.WaitStatement#getSensitivity <em>Sensitivity</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.WaitStatement#getUntil <em>Until</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.WaitStatement#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getWaitStatement()
 * @model
 * @generated
 */
public interface WaitStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Sensitivity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensitivity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensitivity</em>' containment reference.
	 * @see #setSensitivity(MultiName)
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getWaitStatement_Sensitivity()
	 * @model containment="true"
	 * @generated
	 */
	MultiName getSensitivity();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.WaitStatement#getSensitivity <em>Sensitivity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensitivity</em>' containment reference.
	 * @see #getSensitivity()
	 * @generated
	 */
	void setSensitivity(MultiName value);

	/**
	 * Returns the value of the '<em><b>Until</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Until</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Until</em>' containment reference.
	 * @see #setUntil(Expression)
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getWaitStatement_Until()
	 * @model containment="true"
	 * @generated
	 */
	Expression getUntil();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.WaitStatement#getUntil <em>Until</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Until</em>' containment reference.
	 * @see #getUntil()
	 * @generated
	 */
	void setUntil(Expression value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' containment reference.
	 * @see #setTime(Expression)
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getWaitStatement_Time()
	 * @model containment="true"
	 * @generated
	 */
	Expression getTime();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.WaitStatement#getTime <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' containment reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Expression value);

} // WaitStatement
