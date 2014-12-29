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
package net.mlanoe.language.vhdl.nature;

import net.mlanoe.language.vhdl.Name;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scalar Nature Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.nature.ScalarNatureDefinition#getName <em>Name</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.nature.ScalarNatureDefinition#getAcross <em>Across</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.nature.ScalarNatureDefinition#getThrough <em>Through</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.nature.NaturePackage#getScalarNatureDefinition()
 * @model
 * @generated
 */
public interface ScalarNatureDefinition extends NatureDefinition {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(Name)
	 * @see net.mlanoe.language.vhdl.nature.NaturePackage#getScalarNatureDefinition_Name()
	 * @model containment="true"
	 * @generated
	 */
	Name getName();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.nature.ScalarNatureDefinition#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Name value);

	/**
	 * Returns the value of the '<em><b>Across</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Across</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Across</em>' containment reference.
	 * @see #setAcross(Name)
	 * @see net.mlanoe.language.vhdl.nature.NaturePackage#getScalarNatureDefinition_Across()
	 * @model containment="true"
	 * @generated
	 */
	Name getAcross();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.nature.ScalarNatureDefinition#getAcross <em>Across</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Across</em>' containment reference.
	 * @see #getAcross()
	 * @generated
	 */
	void setAcross(Name value);

	/**
	 * Returns the value of the '<em><b>Through</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Through</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Through</em>' containment reference.
	 * @see #setThrough(Name)
	 * @see net.mlanoe.language.vhdl.nature.NaturePackage#getScalarNatureDefinition_Through()
	 * @model containment="true"
	 * @generated
	 */
	Name getThrough();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.nature.ScalarNatureDefinition#getThrough <em>Through</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Through</em>' containment reference.
	 * @see #getThrough()
	 * @generated
	 */
	void setThrough(Name value);

} // ScalarNatureDefinition
