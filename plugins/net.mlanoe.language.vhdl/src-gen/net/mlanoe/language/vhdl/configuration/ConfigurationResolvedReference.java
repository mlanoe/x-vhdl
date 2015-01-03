/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.configuration;

import net.mlanoe.language.vhdl.VhdlObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resolved Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.configuration.ConfigurationResolvedReference#getConfiguration <em>Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.configuration.ConfigurationPackage#getConfigurationResolvedReference()
 * @model
 * @generated
 */
public interface ConfigurationResolvedReference extends VhdlObject, ConfigurationReference {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' reference.
	 * @see #setConfiguration(Configuration)
	 * @see net.mlanoe.language.vhdl.configuration.ConfigurationPackage#getConfigurationResolvedReference_Configuration()
	 * @model
	 * @generated
	 */
	Configuration getConfiguration();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.configuration.ConfigurationResolvedReference#getConfiguration <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Configuration value);

} // ConfigurationResolvedReference
