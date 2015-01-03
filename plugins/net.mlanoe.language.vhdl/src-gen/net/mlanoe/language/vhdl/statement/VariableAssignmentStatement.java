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
 * A representation of the model object '<em><b>Variable Assignment Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.statement.VariableAssignmentStatement#getTarget <em>Target</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.VariableAssignmentStatement#getInitial <em>Initial</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getVariableAssignmentStatement()
 * @model
 * @generated
 */
public interface VariableAssignmentStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Expression)
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getVariableAssignmentStatement_Target()
	 * @model containment="true"
	 * @generated
	 */
	Expression getTarget();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.VariableAssignmentStatement#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Expression value);

	/**
	 * Returns the value of the '<em><b>Initial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' containment reference.
	 * @see #setInitial(Expression)
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getVariableAssignmentStatement_Initial()
	 * @model containment="true"
	 * @generated
	 */
	Expression getInitial();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.VariableAssignmentStatement#getInitial <em>Initial</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' containment reference.
	 * @see #getInitial()
	 * @generated
	 */
	void setInitial(Expression value);

} // VariableAssignmentStatement
