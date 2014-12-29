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

import net.mlanoe.language.vhdl.CallReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Procedure Call Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.statement.ProcedureCallStatement#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.ProcedureCallStatement#isPostponed <em>Postponed</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getProcedureCallStatement()
 * @model
 * @generated
 */
public interface ProcedureCallStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Procedure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure</em>' containment reference.
	 * @see #setProcedure(CallReference)
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getProcedureCallStatement_Procedure()
	 * @model containment="true"
	 * @generated
	 */
	CallReference getProcedure();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.ProcedureCallStatement#getProcedure <em>Procedure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procedure</em>' containment reference.
	 * @see #getProcedure()
	 * @generated
	 */
	void setProcedure(CallReference value);

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
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getProcedureCallStatement_Postponed()
	 * @model
	 * @generated
	 */
	boolean isPostponed();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.ProcedureCallStatement#isPostponed <em>Postponed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postponed</em>' attribute.
	 * @see #isPostponed()
	 * @generated
	 */
	void setPostponed(boolean value);

} // ProcedureCallStatement
