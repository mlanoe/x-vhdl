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
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Break Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.statement.BreakStatement#getBreak <em>Break</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.BreakStatement#getWhen <em>When</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.BreakStatement#getSensitivity <em>Sensitivity</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getBreakStatement()
 * @model
 * @generated
 */
public interface BreakStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Break</b></em>' containment reference list.
	 * The list contents are of type {@link net.mlanoe.language.vhdl.statement.BreakStatementItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Break</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Break</em>' containment reference list.
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getBreakStatement_Break()
	 * @model containment="true"
	 * @generated
	 */
	EList<BreakStatementItem> getBreak();

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
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getBreakStatement_When()
	 * @model containment="true"
	 * @generated
	 */
	Expression getWhen();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.BreakStatement#getWhen <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' containment reference.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(Expression value);

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
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getBreakStatement_Sensitivity()
	 * @model containment="true"
	 * @generated
	 */
	MultiName getSensitivity();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.BreakStatement#getSensitivity <em>Sensitivity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensitivity</em>' containment reference.
	 * @see #getSensitivity()
	 * @generated
	 */
	void setSensitivity(MultiName value);

} // BreakStatement
