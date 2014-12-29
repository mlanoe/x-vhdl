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
 * A representation of the model object '<em><b>Signal Assignment Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.statement.SignalAssignmentStatement#isPostponed <em>Postponed</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.SignalAssignmentStatement#isGuarded <em>Guarded</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.SignalAssignmentStatement#getTarget <em>Target</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.SignalAssignmentStatement#getDelay <em>Delay</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getSignalAssignmentStatement()
 * @model abstract="true"
 * @generated
 */
public interface SignalAssignmentStatement extends Statement {
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
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getSignalAssignmentStatement_Postponed()
	 * @model
	 * @generated
	 */
	boolean isPostponed();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.SignalAssignmentStatement#isPostponed <em>Postponed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postponed</em>' attribute.
	 * @see #isPostponed()
	 * @generated
	 */
	void setPostponed(boolean value);

	/**
	 * Returns the value of the '<em><b>Guarded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guarded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guarded</em>' attribute.
	 * @see #setGuarded(boolean)
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getSignalAssignmentStatement_Guarded()
	 * @model
	 * @generated
	 */
	boolean isGuarded();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.SignalAssignmentStatement#isGuarded <em>Guarded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guarded</em>' attribute.
	 * @see #isGuarded()
	 * @generated
	 */
	void setGuarded(boolean value);

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
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getSignalAssignmentStatement_Target()
	 * @model containment="true"
	 * @generated
	 */
	Expression getTarget();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.SignalAssignmentStatement#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Expression value);

	/**
	 * Returns the value of the '<em><b>Delay</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay</em>' containment reference.
	 * @see #setDelay(DelayMechanism)
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getSignalAssignmentStatement_Delay()
	 * @model containment="true"
	 * @generated
	 */
	DelayMechanism getDelay();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.SignalAssignmentStatement#getDelay <em>Delay</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' containment reference.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(DelayMechanism value);

} // SignalAssignmentStatement
