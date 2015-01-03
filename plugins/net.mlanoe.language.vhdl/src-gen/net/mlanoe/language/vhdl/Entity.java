/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl;

import net.mlanoe.language.vhdl.statement.Statement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.Entity#getGeneric <em>Generic</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.Entity#getPort <em>Port</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.Entity#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.VhdlPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends Module, Named {
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
	 * @see net.mlanoe.language.vhdl.VhdlPackage#getEntity_Generic()
	 * @model containment="true"
	 * @generated
	 */
	Generics getGeneric();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.Entity#getGeneric <em>Generic</em>}' containment reference.
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
	 * @see net.mlanoe.language.vhdl.VhdlPackage#getEntity_Port()
	 * @model containment="true"
	 * @generated
	 */
	Ports getPort();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.Entity#getPort <em>Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' containment reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Ports value);

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
	 * @see net.mlanoe.language.vhdl.VhdlPackage#getEntity_Statement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatement();

} // Entity
