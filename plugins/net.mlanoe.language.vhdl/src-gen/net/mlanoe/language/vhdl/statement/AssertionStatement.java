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

import net.mlanoe.language.vhdl.expression.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assertion Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.statement.AssertionStatement#getCondition <em>Condition</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.AssertionStatement#getReport <em>Report</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.AssertionStatement#getSeverity <em>Severity</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.AssertionStatement#isPostponed <em>Postponed</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getAssertionStatement()
 * @model
 * @generated
 */
public interface AssertionStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Expression)
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getAssertionStatement_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.AssertionStatement#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

	/**
	 * Returns the value of the '<em><b>Report</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Report</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report</em>' containment reference.
	 * @see #setReport(Expression)
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getAssertionStatement_Report()
	 * @model containment="true"
	 * @generated
	 */
	Expression getReport();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.AssertionStatement#getReport <em>Report</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report</em>' containment reference.
	 * @see #getReport()
	 * @generated
	 */
	void setReport(Expression value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' containment reference.
	 * @see #setSeverity(Expression)
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getAssertionStatement_Severity()
	 * @model containment="true"
	 * @generated
	 */
	Expression getSeverity();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.AssertionStatement#getSeverity <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' containment reference.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(Expression value);

	/**
	 * Returns the value of the '<em><b>Postponed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postponed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postponed</em>' attribute.
	 * @see #setPostponed(boolean)
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getAssertionStatement_Postponed()
	 * @model
	 * @generated
	 */
	boolean isPostponed();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.AssertionStatement#isPostponed <em>Postponed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postponed</em>' attribute.
	 * @see #isPostponed()
	 * @generated
	 */
	void setPostponed(boolean value);

} // AssertionStatement
