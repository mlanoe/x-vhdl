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
import net.mlanoe.language.vhdl.PortMaps;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instantiation Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.statement.InstantiationStatement#getGenericMap <em>Generic Map</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.InstantiationStatement#getPortMap <em>Port Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getInstantiationStatement()
 * @model
 * @generated
 */
public interface InstantiationStatement extends Statement {
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
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getInstantiationStatement_GenericMap()
	 * @model containment="true"
	 * @generated
	 */
	GenericMaps getGenericMap();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.InstantiationStatement#getGenericMap <em>Generic Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Map</em>' containment reference.
	 * @see #getGenericMap()
	 * @generated
	 */
	void setGenericMap(GenericMaps value);

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
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getInstantiationStatement_PortMap()
	 * @model containment="true"
	 * @generated
	 */
	PortMaps getPortMap();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.InstantiationStatement#getPortMap <em>Port Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Map</em>' containment reference.
	 * @see #getPortMap()
	 * @generated
	 */
	void setPortMap(PortMaps value);

} // InstantiationStatement
