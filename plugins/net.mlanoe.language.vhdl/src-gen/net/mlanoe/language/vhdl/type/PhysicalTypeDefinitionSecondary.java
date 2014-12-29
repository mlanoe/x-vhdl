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
package net.mlanoe.language.vhdl.type;

import net.mlanoe.language.vhdl.Name;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Type Definition Secondary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.type.PhysicalTypeDefinitionSecondary#getName <em>Name</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.type.PhysicalTypeDefinitionSecondary#getNumber <em>Number</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.type.PhysicalTypeDefinitionSecondary#getOf <em>Of</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.type.TypePackage#getPhysicalTypeDefinitionSecondary()
 * @model
 * @generated
 */
public interface PhysicalTypeDefinitionSecondary extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.mlanoe.language.vhdl.type.TypePackage#getPhysicalTypeDefinitionSecondary_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.type.PhysicalTypeDefinitionSecondary#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @see net.mlanoe.language.vhdl.type.TypePackage#getPhysicalTypeDefinitionSecondary_Number()
	 * @model
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.type.PhysicalTypeDefinitionSecondary#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Of</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Of</em>' containment reference.
	 * @see #setOf(Name)
	 * @see net.mlanoe.language.vhdl.type.TypePackage#getPhysicalTypeDefinitionSecondary_Of()
	 * @model containment="true"
	 * @generated
	 */
	Name getOf();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.type.PhysicalTypeDefinitionSecondary#getOf <em>Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Of</em>' containment reference.
	 * @see #getOf()
	 * @generated
	 */
	void setOf(Name value);

} // PhysicalTypeDefinitionSecondary
