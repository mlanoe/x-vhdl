/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl;

import net.mlanoe.language.vhdl.declaration.Declaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.Component#getGeneric <em>Generic</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.Component#getPort <em>Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.VhdlPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends Declaration, Named {
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
	 * @see net.mlanoe.language.vhdl.VhdlPackage#getComponent_Generic()
	 * @model containment="true"
	 * @generated
	 */
	Generics getGeneric();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.Component#getGeneric <em>Generic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic</em>' containment reference.
	 * @see #getGeneric()
	 * @generated
	 */
	void setGeneric(Generics value);

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
	 * @see net.mlanoe.language.vhdl.VhdlPackage#getComponent_Port()
	 * @model containment="true"
	 * @generated
	 */
	Ports getPort();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.Component#getPort <em>Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' containment reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Ports value);

} // Component
