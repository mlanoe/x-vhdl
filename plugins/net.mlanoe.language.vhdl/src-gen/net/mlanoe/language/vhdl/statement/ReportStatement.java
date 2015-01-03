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
 * A representation of the model object '<em><b>Report Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.statement.ReportStatement#getReport <em>Report</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.ReportStatement#getSeverity <em>Severity</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getReportStatement()
 * @model
 * @generated
 */
public interface ReportStatement extends Statement {
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
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getReportStatement_Report()
	 * @model containment="true"
	 * @generated
	 */
	Expression getReport();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.ReportStatement#getReport <em>Report</em>}' containment reference.
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
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getReportStatement_Severity()
	 * @model containment="true"
	 * @generated
	 */
	Expression getSeverity();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.ReportStatement#getSeverity <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' containment reference.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(Expression value);

} // ReportStatement
