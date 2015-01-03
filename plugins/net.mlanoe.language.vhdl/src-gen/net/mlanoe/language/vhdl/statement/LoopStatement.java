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
 * A representation of the model object '<em><b>Loop Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.statement.LoopStatement#getIteration <em>Iteration</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.LoopStatement#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getLoopStatement()
 * @model
 * @generated
 */
public interface LoopStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Iteration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iteration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iteration</em>' containment reference.
	 * @see #setIteration(IterationScheme)
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getLoopStatement_Iteration()
	 * @model containment="true"
	 * @generated
	 */
	IterationScheme getIteration();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.LoopStatement#getIteration <em>Iteration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iteration</em>' containment reference.
	 * @see #getIteration()
	 * @generated
	 */
	void setIteration(IterationScheme value);

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
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getLoopStatement_Statement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatement();

} // LoopStatement
