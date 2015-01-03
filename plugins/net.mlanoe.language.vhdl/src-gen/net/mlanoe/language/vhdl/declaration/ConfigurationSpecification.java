/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.declaration;

import net.mlanoe.language.vhdl.ComponentReference;
import net.mlanoe.language.vhdl.EntityReference;
import net.mlanoe.language.vhdl.GenericMaps;
import net.mlanoe.language.vhdl.MultiName;
import net.mlanoe.language.vhdl.PortMaps;

import net.mlanoe.language.vhdl.configuration.ConfigurationReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.ConfigurationSpecification#getList <em>List</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.ConfigurationSpecification#getComponent <em>Component</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.ConfigurationSpecification#getEntity <em>Entity</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.ConfigurationSpecification#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.ConfigurationSpecification#getGenericMap <em>Generic Map</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.ConfigurationSpecification#getPortMap <em>Port Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getConfigurationSpecification()
 * @model
 * @generated
 */
public interface ConfigurationSpecification extends Declaration {
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
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getConfigurationSpecification_List()
	 * @model containment="true"
	 * @generated
	 */
	MultiName getList();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.declaration.ConfigurationSpecification#getList <em>List</em>}' containment reference.
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
	 * @see #setComponent(ComponentReference)
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getConfigurationSpecification_Component()
	 * @model containment="true"
	 * @generated
	 */
	ComponentReference getComponent();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.declaration.ConfigurationSpecification#getComponent <em>Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' containment reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(ComponentReference value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference.
	 * @see #setEntity(EntityReference)
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getConfigurationSpecification_Entity()
	 * @model containment="true"
	 * @generated
	 */
	EntityReference getEntity();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.declaration.ConfigurationSpecification#getEntity <em>Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' containment reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(EntityReference value);

	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' containment reference.
	 * @see #setConfiguration(ConfigurationReference)
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getConfigurationSpecification_Configuration()
	 * @model containment="true"
	 * @generated
	 */
	ConfigurationReference getConfiguration();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.declaration.ConfigurationSpecification#getConfiguration <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' containment reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(ConfigurationReference value);

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
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getConfigurationSpecification_GenericMap()
	 * @model containment="true"
	 * @generated
	 */
	GenericMaps getGenericMap();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.declaration.ConfigurationSpecification#getGenericMap <em>Generic Map</em>}' containment reference.
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
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getConfigurationSpecification_PortMap()
	 * @model containment="true"
	 * @generated
	 */
	PortMaps getPortMap();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.declaration.ConfigurationSpecification#getPortMap <em>Port Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Map</em>' containment reference.
	 * @see #getPortMap()
	 * @generated
	 */
	void setPortMap(PortMaps value);

} // ConfigurationSpecification
