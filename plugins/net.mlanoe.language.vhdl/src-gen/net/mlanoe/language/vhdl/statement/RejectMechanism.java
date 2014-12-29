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
 * A representation of the model object '<em><b>Reject Mechanism</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.statement.RejectMechanism#getReject <em>Reject</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getRejectMechanism()
 * @model
 * @generated
 */
public interface RejectMechanism extends DelayMechanism {
	/**
	 * Returns the value of the '<em><b>Reject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reject</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reject</em>' containment reference.
	 * @see #setReject(Expression)
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getRejectMechanism_Reject()
	 * @model containment="true"
	 * @generated
	 */
	Expression getReject();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.RejectMechanism#getReject <em>Reject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reject</em>' containment reference.
	 * @see #getReject()
	 * @generated
	 */
	void setReject(Expression value);

} // RejectMechanism
