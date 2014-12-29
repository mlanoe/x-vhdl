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
package net.mlanoe.language.vhdl.configuration;

import net.mlanoe.language.vhdl.Name;
import net.mlanoe.language.vhdl.Named;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.configuration.BlockConfiguration#getUse <em>Use</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.configuration.BlockConfiguration#getItem <em>Item</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.configuration.ConfigurationPackage#getBlockConfiguration()
 * @model
 * @generated
 */
public interface BlockConfiguration extends ConfigurationItem, Named {
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
	 * @see net.mlanoe.language.vhdl.configuration.ConfigurationPackage#getBlockConfiguration_Use()
	 * @model containment="true"
	 * @generated
	 */
	EList<Name> getUse();

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link net.mlanoe.language.vhdl.configuration.ConfigurationItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see net.mlanoe.language.vhdl.configuration.ConfigurationPackage#getBlockConfiguration_Item()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigurationItem> getItem();

} // BlockConfiguration
