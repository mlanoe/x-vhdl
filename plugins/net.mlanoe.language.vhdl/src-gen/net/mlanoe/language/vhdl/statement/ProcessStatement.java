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

import net.mlanoe.language.vhdl.MultiName;
import net.mlanoe.language.vhdl.declaration.Declaration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.statement.ProcessStatement#isPostponed <em>Postponed</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.ProcessStatement#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.ProcessStatement#getStatement <em>Statement</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.ProcessStatement#getSensitivity <em>Sensitivity</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getProcessStatement()
 * @model
 * @generated
 */
public interface ProcessStatement extends Statement {
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
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getProcessStatement_Postponed()
	 * @model
	 * @generated
	 */
	boolean isPostponed();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.ProcessStatement#isPostponed <em>Postponed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postponed</em>' attribute.
	 * @see #isPostponed()
	 * @generated
	 */
	void setPostponed(boolean value);

	/**
	 * Returns the value of the '<em><b>Sensitivity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sensitivity</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensitivity</em>' containment reference.
	 * @see #setSensitivity(MultiName)
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getProcessStatement_Sensitivity()
	 * @model containment="true"
	 * @generated
	 */
	MultiName getSensitivity();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.ProcessStatement#getSensitivity <em>Sensitivity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sensitivity</em>' containment reference.
	 * @see #getSensitivity()
	 * @generated
	 */
	void setSensitivity(MultiName value);

	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' containment reference list.
	 * The list contents are of type {@link net.mlanoe.language.vhdl.declaration.Declaration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' containment reference list.
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getProcessStatement_Declaration()
	 * @model containment="true"
	 * @generated
	 */
	EList<Declaration> getDeclaration();

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
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getProcessStatement_Statement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatement();

} // ProcessStatement
