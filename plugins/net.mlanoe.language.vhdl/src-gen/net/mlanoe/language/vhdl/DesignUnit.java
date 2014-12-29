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
package net.mlanoe.language.vhdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Design Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.DesignUnit#getLibrary <em>Library</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.DesignUnit#getUse <em>Use</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.DesignUnit#getModule <em>Module</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.VhdlPackage#getDesignUnit()
 * @model
 * @generated
 */
public interface DesignUnit extends VhdlObject {
	/**
	 * Returns the value of the '<em><b>Library</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Library</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Library</em>' attribute list.
	 * @see net.mlanoe.language.vhdl.VhdlPackage#getDesignUnit_Library()
	 * @model
	 * @generated
	 */
	EList<String> getLibrary();

	/**
	 * Returns the value of the '<em><b>Use</b></em>' containment reference list.
	 * The list contents are of type {@link net.mlanoe.language.vhdl.Name}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' containment reference list.
	 * @see net.mlanoe.language.vhdl.VhdlPackage#getDesignUnit_Use()
	 * @model containment="true"
	 * @generated
	 */
	EList<Name> getUse();

	/**
	 * Returns the value of the '<em><b>Module</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' containment reference.
	 * @see #setModule(Module)
	 * @see net.mlanoe.language.vhdl.VhdlPackage#getDesignUnit_Module()
	 * @model containment="true"
	 * @generated
	 */
	Module getModule();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.DesignUnit#getModule <em>Module</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' containment reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(Module value);

} // DesignUnit
