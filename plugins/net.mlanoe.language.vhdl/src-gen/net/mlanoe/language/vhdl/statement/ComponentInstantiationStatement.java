/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.statement;

import net.mlanoe.language.vhdl.ComponentReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Instantiation Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.statement.ComponentInstantiationStatement#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getComponentInstantiationStatement()
 * @model
 * @generated
 */
public interface ComponentInstantiationStatement extends InstantiationStatement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(ComponentReference)
	 * @see net.mlanoe.language.vhdl.statement.StatementPackage#getComponentInstantiationStatement_Name()
	 * @model containment="true"
	 * @generated
	 */
	ComponentReference getName();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.statement.ComponentInstantiationStatement#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(ComponentReference value);

} // ComponentInstantiationStatement
