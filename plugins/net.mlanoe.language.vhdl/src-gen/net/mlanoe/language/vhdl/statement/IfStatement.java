/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.statement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.statement.IfStatement#getTest <em>Test</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.IfStatement#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getIfStatement()
 * @model
 * @generated
 */
public interface IfStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Test</b></em>' containment reference list.
	 * The list contents are of type {@link net.mlanoe.language.vhdl.statement.IfStatementTest}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test</em>' containment reference list.
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getIfStatement_Test()
	 * @model containment="true"
	 * @generated
	 */
	EList<IfStatementTest> getTest();

	/**
	 * Returns the value of the '<em><b>Statement</b></em>' containment reference list.
	 * The list contents are of type {@link net.mlanoe.language.vhdl.statement.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' containment reference list.
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getIfStatement_Statement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatement();

} // IfStatement
