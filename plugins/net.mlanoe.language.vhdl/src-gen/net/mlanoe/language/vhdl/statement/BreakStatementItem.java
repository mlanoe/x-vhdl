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

import net.mlanoe.language.vhdl.Name;
import net.mlanoe.language.vhdl.VhdlObject;
import net.mlanoe.language.vhdl.expression.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Break Statement Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.statement.BreakStatementItem#getName <em>Name</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.BreakStatementItem#getUse <em>Use</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.BreakStatementItem#getArrow <em>Arrow</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getBreakStatementItem()
 * @model
 * @generated
 */
public interface BreakStatementItem extends VhdlObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(Name)
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getBreakStatementItem_Name()
	 * @model containment="true"
	 * @generated
	 */
	Name getName();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.BreakStatementItem#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Name value);

	/**
	 * Returns the value of the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' containment reference.
	 * @see #setUse(Name)
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getBreakStatementItem_Use()
	 * @model containment="true"
	 * @generated
	 */
	Name getUse();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.BreakStatementItem#getUse <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' containment reference.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(Name value);

	/**
	 * Returns the value of the '<em><b>Arrow</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrow</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrow</em>' containment reference.
	 * @see #setArrow(Expression)
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getBreakStatementItem_Arrow()
	 * @model containment="true"
	 * @generated
	 */
	Expression getArrow();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.BreakStatementItem#getArrow <em>Arrow</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrow</em>' containment reference.
	 * @see #getArrow()
	 * @generated
	 */
	void setArrow(Expression value);

} // BreakStatementItem
