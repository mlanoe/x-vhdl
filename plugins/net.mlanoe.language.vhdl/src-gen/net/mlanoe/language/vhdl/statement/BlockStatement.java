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

import net.mlanoe.language.vhdl.GenericMaps;
import net.mlanoe.language.vhdl.Generics;
import net.mlanoe.language.vhdl.PortMaps;
import net.mlanoe.language.vhdl.Ports;

import net.mlanoe.language.vhdl.declaration.Declaration;

import net.mlanoe.language.vhdl.expression.Expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.statement.BlockStatement#getGuard <em>Guard</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.BlockStatement#getGeneric <em>Generic</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.BlockStatement#getGenericMap <em>Generic Map</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.BlockStatement#getPort <em>Port</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.BlockStatement#getPortMap <em>Port Map</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.BlockStatement#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.BlockStatement#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getBlockStatement()
 * @model
 * @generated
 */
public interface BlockStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(Expression)
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getBlockStatement_Guard()
	 * @model containment="true"
	 * @generated
	 */
	Expression getGuard();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.BlockStatement#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(Expression value);

	/**
	 * Returns the value of the '<em><b>Generic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic</em>' containment reference.
	 * @see #setGeneric(Generics)
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getBlockStatement_Generic()
	 * @model containment="true"
	 * @generated
	 */
	Generics getGeneric();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.BlockStatement#getGeneric <em>Generic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic</em>' containment reference.
	 * @see #getGeneric()
	 * @generated
	 */
	void setGeneric(Generics value);

	/**
	 * Returns the value of the '<em><b>Generic Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Map</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Map</em>' containment reference.
	 * @see #setGenericMap(GenericMaps)
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getBlockStatement_GenericMap()
	 * @model containment="true"
	 * @generated
	 */
	GenericMaps getGenericMap();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.BlockStatement#getGenericMap <em>Generic Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Map</em>' containment reference.
	 * @see #getGenericMap()
	 * @generated
	 */
	void setGenericMap(GenericMaps value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' containment reference.
	 * @see #setPort(Ports)
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getBlockStatement_Port()
	 * @model containment="true"
	 * @generated
	 */
	Ports getPort();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.BlockStatement#getPort <em>Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' containment reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Ports value);

	/**
	 * Returns the value of the '<em><b>Port Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Map</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Map</em>' containment reference.
	 * @see #setPortMap(PortMaps)
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getBlockStatement_PortMap()
	 * @model containment="true"
	 * @generated
	 */
	PortMaps getPortMap();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.BlockStatement#getPortMap <em>Port Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Map</em>' containment reference.
	 * @see #getPortMap()
	 * @generated
	 */
	void setPortMap(PortMaps value);

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
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getBlockStatement_Declaration()
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
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getBlockStatement_Statement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatement();

} // BlockStatement
