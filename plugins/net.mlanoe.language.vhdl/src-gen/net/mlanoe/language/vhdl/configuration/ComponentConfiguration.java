/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.configuration;

import net.mlanoe.language.vhdl.GenericMaps;
import net.mlanoe.language.vhdl.MultiName;
import net.mlanoe.language.vhdl.Name;
import net.mlanoe.language.vhdl.PortMaps;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.configuration.ComponentConfiguration#getList <em>List</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.configuration.ComponentConfiguration#getComponent <em>Component</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.configuration.ComponentConfiguration#getEntity <em>Entity</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.configuration.ComponentConfiguration#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.configuration.ComponentConfiguration#getGenericMap <em>Generic Map</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.configuration.ComponentConfiguration#getPortMap <em>Port Map</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.configuration.ComponentConfiguration#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.configuration.ConfigurationPackage#getComponentConfiguration()
 * @model
 * @generated
 */
public interface ComponentConfiguration extends ConfigurationItem {
	/**
	 * Returns the value of the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List</em>' containment reference.
	 * @see #setList(MultiName)
	 * @see net.mlanoe.language.vhdl.configuration.ConfigurationPackage#getComponentConfiguration_List()
	 * @model containment="true"
	 * @generated
	 */
	MultiName getList();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.configuration.ComponentConfiguration#getList <em>List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List</em>' containment reference.
	 * @see #getList()
	 * @generated
	 */
	void setList(MultiName value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference.
	 * @see #setComponent(Name)
	 * @see net.mlanoe.language.vhdl.configuration.ConfigurationPackage#getComponentConfiguration_Component()
	 * @model containment="true"
	 * @generated
	 */
	Name getComponent();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.configuration.ComponentConfiguration#getComponent <em>Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' containment reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Name value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference.
	 * @see #setEntity(Name)
	 * @see net.mlanoe.language.vhdl.configuration.ConfigurationPackage#getComponentConfiguration_Entity()
	 * @model containment="true"
	 * @generated
	 */
	Name getEntity();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.configuration.ComponentConfiguration#getEntity <em>Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' containment reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Name value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(Name)
	 * @see net.mlanoe.language.vhdl.configuration.ConfigurationPackage#getComponentConfiguration_Configuration()
	 * @model containment="true"
	 * @generated
	 */
	Name getConfiguration();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.configuration.ComponentConfiguration#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Name value);

	/**
	 * Returns the value of the '<em><b>Generic Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Map</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Map</em>' containment reference.
	 * @see #setGenericMap(GenericMaps)
	 * @see net.mlanoe.language.vhdl.configuration.ConfigurationPackage#getComponentConfiguration_GenericMap()
	 * @model containment="true"
	 * @generated
	 */
	GenericMaps getGenericMap();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.configuration.ComponentConfiguration#getGenericMap <em>Generic Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Map</em>' containment reference.
	 * @see #getGenericMap()
	 * @generated
	 */
	void setGenericMap(GenericMaps value);

	/**
	 * Returns the value of the '<em><b>Port Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Map</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Map</em>' containment reference.
	 * @see #setPortMap(PortMaps)
	 * @see net.mlanoe.language.vhdl.configuration.ConfigurationPackage#getComponentConfiguration_PortMap()
	 * @model containment="true"
	 * @generated
	 */
	PortMaps getPortMap();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.configuration.ComponentConfiguration#getPortMap <em>Port Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Map</em>' containment reference.
	 * @see #getPortMap()
	 * @generated
	 */
	void setPortMap(PortMaps value);

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
	 * @see net.mlanoe.language.vhdl.configuration.ConfigurationPackage#getComponentConfiguration_Block()
	 * @model containment="true"
	 * @generated
	 */
	BlockConfiguration getBlock();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.configuration.ComponentConfiguration#getBlock <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' containment reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(BlockConfiguration value);

} // ComponentConfiguration
