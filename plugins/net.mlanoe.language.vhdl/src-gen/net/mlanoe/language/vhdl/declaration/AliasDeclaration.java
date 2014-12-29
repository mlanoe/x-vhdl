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

import net.mlanoe.language.vhdl.Name;
import net.mlanoe.language.vhdl.Named;
import net.mlanoe.language.vhdl.type.TypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alias Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.AliasDeclaration#getAlias <em>Alias</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.AliasDeclaration#getIs <em>Is</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getAliasDeclaration()
 * @model
 * @generated
 */
public interface AliasDeclaration extends Declaration, Named {
	/**
	 * Returns the value of the '<em><b>Alias</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' containment reference.
	 * @see #setAlias(TypeReference)
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getAliasDeclaration_Alias()
	 * @model containment="true"
	 * @generated
	 */
	TypeReference getAlias();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.declaration.AliasDeclaration#getAlias <em>Alias</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' containment reference.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(TypeReference value);

	/**
	 * Returns the value of the '<em><b>Is</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is</em>' containment reference.
	 * @see #setIs(Name)
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getAliasDeclaration_Is()
	 * @model containment="true"
	 * @generated
	 */
	Name getIs();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.declaration.AliasDeclaration#getIs <em>Is</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is</em>' containment reference.
	 * @see #getIs()
	 * @generated
	 */
	void setIs(Name value);

} // AliasDeclaration
