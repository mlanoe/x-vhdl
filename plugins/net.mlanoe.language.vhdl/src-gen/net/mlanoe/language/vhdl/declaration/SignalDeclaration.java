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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.SignalDeclaration#getKind <em>Kind</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.SignalDeclaration#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getSignalDeclaration()
 * @model
 * @generated
 */
public interface SignalDeclaration extends ValueDeclaration {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link net.mlanoe.language.vhdl.declaration.SignalKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see net.mlanoe.language.vhdl.declaration.SignalKind
	 * @see #setKind(SignalKind)
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getSignalDeclaration_Kind()
	 * @model
	 * @generated
	 */
	SignalKind getKind();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.declaration.SignalDeclaration#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see net.mlanoe.language.vhdl.declaration.SignalKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(SignalKind value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link net.mlanoe.language.vhdl.declaration.Mode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see net.mlanoe.language.vhdl.declaration.Mode
	 * @see #setMode(Mode)
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getSignalDeclaration_Mode()
	 * @model
	 * @generated
	 */
	Mode getMode();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.declaration.SignalDeclaration#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see net.mlanoe.language.vhdl.declaration.Mode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(Mode value);

} // SignalDeclaration
