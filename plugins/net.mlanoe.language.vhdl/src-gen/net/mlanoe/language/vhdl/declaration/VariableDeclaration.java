/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.declaration;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.VariableDeclaration#isShared <em>Shared</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.VariableDeclaration#getMode <em>Mode</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getVariableDeclaration()
 * @model
 * @generated
 */
public interface VariableDeclaration extends ValueDeclaration {
	/**
	 * Returns the value of the '<em><b>Shared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shared</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared</em>' attribute.
	 * @see #setShared(boolean)
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getVariableDeclaration_Shared()
	 * @model
	 * @generated
	 */
	boolean isShared();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.declaration.VariableDeclaration#isShared <em>Shared</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shared</em>' attribute.
	 * @see #isShared()
	 * @generated
	 */
	void setShared(boolean value);

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
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getVariableDeclaration_Mode()
	 * @model
	 * @generated
	 */
	Mode getMode();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.declaration.VariableDeclaration#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see net.mlanoe.language.vhdl.declaration.Mode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(Mode value);

} // VariableDeclaration
