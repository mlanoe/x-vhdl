/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.declaration;

import net.mlanoe.language.vhdl.MultiName;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Clause Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.UseClauseDeclaration#getUse <em>Use</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getUseClauseDeclaration()
 * @model
 * @generated
 */
public interface UseClauseDeclaration extends Declaration {
	/**
	 * Returns the value of the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' containment reference.
	 * @see #setUse(MultiName)
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getUseClauseDeclaration_Use()
	 * @model containment="true"
	 * @generated
	 */
	MultiName getUse();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.declaration.UseClauseDeclaration#getUse <em>Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' containment reference.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(MultiName value);

} // UseClauseDeclaration
