/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Resolved Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.ComponentResolvedReference#getComponent <em>Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.VhdlPackage#getComponentResolvedReference()
 * @model
 * @generated
 */
public interface ComponentResolvedReference extends VhdlObject, ComponentReference {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(Component)
	 * @see net.mlanoe.language.vhdl.VhdlPackage#getComponentResolvedReference_Component()
	 * @model
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.ComponentResolvedReference#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

} // ComponentResolvedReference
