/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.statement;

import net.mlanoe.language.vhdl.expression.Expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.statement.CaseStatement#getCase <em>Case</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.CaseStatement#getWhen <em>When</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getCaseStatement()
 * @model
 * @generated
 */
public interface CaseStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Case</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case</em>' containment reference.
	 * @see #setCase(Expression)
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getCaseStatement_Case()
	 * @model containment="true"
	 * @generated
	 */
	Expression getCase();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.CaseStatement#getCase <em>Case</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case</em>' containment reference.
	 * @see #getCase()
	 * @generated
	 */
	void setCase(Expression value);

	/**
	 * Returns the value of the '<em><b>When</b></em>' containment reference list.
	 * The list contents are of type {@link net.mlanoe.language.vhdl.statement.CaseAlternative}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>When</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' containment reference list.
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getCaseStatement_When()
	 * @model containment="true"
	 * @generated
	 */
	EList<CaseAlternative> getWhen();

} // CaseStatement
