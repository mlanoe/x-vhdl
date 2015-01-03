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
 * A representation of the model object '<em><b>Architecture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.Architecture#getOf <em>Of</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.Architecture#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.VhdlPackage#getArchitecture()
 * @model
 * @generated
 */
public interface Architecture extends Module, Named {
	/**
	 * Returns the value of the '<em><b>Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Of</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Of</em>' containment reference.
	 * @see #setOf(EntityReference)
	 * @see net.mlanoe.language.vhdl.VhdlPackage#getArchitecture_Of()
	 * @model containment="true"
	 * @generated
	 */
	EntityReference getOf();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.Architecture#getOf <em>Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Of</em>' containment reference.
	 * @see #getOf()
	 * @generated
	 */
	void setOf(EntityReference value);

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
	 * @see net.mlanoe.language.vhdl.VhdlPackage#getArchitecture_Statement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatement();

} // Architecture
