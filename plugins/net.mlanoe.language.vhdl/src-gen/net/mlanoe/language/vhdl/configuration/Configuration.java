/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.configuration;

import net.mlanoe.language.vhdl.EntityReference;
import net.mlanoe.language.vhdl.Module;
import net.mlanoe.language.vhdl.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.configuration.Configuration#getOf <em>Of</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.configuration.Configuration#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.configuration.ConfigurationPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends Module, Named {
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
	 * @see net.mlanoe.language.vhdl.configuration.ConfigurationPackage#getConfiguration_Of()
	 * @model containment="true"
	 * @generated
	 */
	EntityReference getOf();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.configuration.Configuration#getOf <em>Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Of</em>' containment reference.
	 * @see #getOf()
	 * @generated
	 */
	void setOf(EntityReference value);

	/**
	 * Returns the value of the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' containment reference.
	 * @see #setBlock(BlockConfiguration)
	 * @see net.mlanoe.language.vhdl.configuration.ConfigurationPackage#getConfiguration_Block()
	 * @model containment="true"
	 * @generated
	 */
	BlockConfiguration getBlock();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.configuration.Configuration#getBlock <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' containment reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(BlockConfiguration value);

} // Configuration
