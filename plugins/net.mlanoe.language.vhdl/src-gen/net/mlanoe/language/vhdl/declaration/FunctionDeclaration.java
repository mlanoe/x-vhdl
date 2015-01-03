/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.declaration;

import net.mlanoe.language.vhdl.type.Typed;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.FunctionDeclaration#getPurity <em>Purity</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getFunctionDeclaration()
 * @model
 * @generated
 */
public interface FunctionDeclaration extends SubprogramDeclaration, Typed {
	/**
	 * Returns the value of the '<em><b>Purity</b></em>' attribute.
	 * The literals are from the enumeration {@link net.mlanoe.language.vhdl.declaration.Purity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Purity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Purity</em>' attribute.
	 * @see net.mlanoe.language.vhdl.declaration.Purity
	 * @see #setPurity(Purity)
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getFunctionDeclaration_Purity()
	 * @model
	 * @generated
	 */
	Purity getPurity();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.declaration.FunctionDeclaration#getPurity <em>Purity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purity</em>' attribute.
	 * @see net.mlanoe.language.vhdl.declaration.Purity
	 * @see #getPurity()
	 * @generated
	 */
	void setPurity(Purity value);

} // FunctionDeclaration
