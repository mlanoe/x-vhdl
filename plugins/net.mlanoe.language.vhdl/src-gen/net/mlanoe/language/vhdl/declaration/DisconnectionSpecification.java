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
package net.mlanoe.language.vhdl.declaration;

import net.mlanoe.language.vhdl.MultiName;
import net.mlanoe.language.vhdl.expression.Expression;
import net.mlanoe.language.vhdl.type.Typed;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disconnection Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.DisconnectionSpecification#getDisconnect <em>Disconnect</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.DisconnectionSpecification#getAfter <em>After</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getDisconnectionSpecification()
 * @model
 * @generated
 */
public interface DisconnectionSpecification extends Declaration, Typed {
	/**
	 * Returns the value of the '<em><b>Disconnect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disconnect</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disconnect</em>' containment reference.
	 * @see #setDisconnect(MultiName)
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getDisconnectionSpecification_Disconnect()
	 * @model containment="true"
	 * @generated
	 */
	MultiName getDisconnect();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.declaration.DisconnectionSpecification#getDisconnect <em>Disconnect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disconnect</em>' containment reference.
	 * @see #getDisconnect()
	 * @generated
	 */
	void setDisconnect(MultiName value);

	/**
	 * Returns the value of the '<em><b>After</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>After</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>After</em>' containment reference.
	 * @see #setAfter(Expression)
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getDisconnectionSpecification_After()
	 * @model containment="true"
	 * @generated
	 */
	Expression getAfter();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.declaration.DisconnectionSpecification#getAfter <em>After</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>After</em>' containment reference.
	 * @see #getAfter()
	 * @generated
	 */
	void setAfter(Expression value);

} // DisconnectionSpecification
