/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.configuration;

import net.mlanoe.language.vhdl.VhdlPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.mlanoe.language.vhdl.configuration.ConfigurationFactory
 * @model kind="package"
 * @generated
 */
public interface ConfigurationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "configuration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mlanoe.net/language/vhdl/configuration/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "configuration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConfigurationPackage eINSTANCE = net.mlanoe.language.vhdl.configuration.impl.ConfigurationPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.configuration.impl.ConfigurationItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.configuration.impl.ConfigurationItemImpl
	 * @see net.mlanoe.language.vhdl.configuration.impl.ConfigurationPackageImpl#getConfigurationItem()
	 * @generated
	 */
	int CONFIGURATION_ITEM = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM__ID = VhdlPackage.VHDL_OBJECT__ID;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_ITEM_FEATURE_COUNT = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.configuration.impl.BlockConfigurationImpl <em>Block Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.configuration.impl.BlockConfigurationImpl
	 * @see net.mlanoe.language.vhdl.configuration.impl.ConfigurationPackageImpl#getBlockConfiguration()
	 * @generated
	 */
	int BLOCK_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_CONFIGURATION__ID = CONFIGURATION_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_CONFIGURATION__NAME = CONFIGURATION_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_CONFIGURATION__USE = CONFIGURATION_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_CONFIGURATION__ITEM = CONFIGURATION_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Block Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_CONFIGURATION_FEATURE_COUNT = CONFIGURATION_ITEM_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.configuration.impl.ComponentConfigurationImpl <em>Component Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.configuration.impl.ComponentConfigurationImpl
	 * @see net.mlanoe.language.vhdl.configuration.impl.ConfigurationPackageImpl#getComponentConfiguration()
	 * @generated
	 */
	int COMPONENT_CONFIGURATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__ID = CONFIGURATION_ITEM__ID;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__LIST = CONFIGURATION_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__COMPONENT = CONFIGURATION_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__ENTITY = CONFIGURATION_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__CONFIGURATION = CONFIGURATION_ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Generic Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__GENERIC_MAP = CONFIGURATION_ITEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Port Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__PORT_MAP = CONFIGURATION_ITEM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION__BLOCK = CONFIGURATION_ITEM_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Component Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_CONFIGURATION_FEATURE_COUNT = CONFIGURATION_ITEM_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.configuration.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.configuration.impl.ConfigurationImpl
	 * @see net.mlanoe.language.vhdl.configuration.impl.ConfigurationPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__ID = VhdlPackage.MODULE__ID;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__DECLARATION = VhdlPackage.MODULE__DECLARATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__NAME = VhdlPackage.MODULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__OF = VhdlPackage.MODULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Block</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__BLOCK = VhdlPackage.MODULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = VhdlPackage.MODULE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.configuration.ConfigurationReference <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.configuration.ConfigurationReference
	 * @see net.mlanoe.language.vhdl.configuration.impl.ConfigurationPackageImpl#getConfigurationReference()
	 * @generated
	 */
	int CONFIGURATION_REFERENCE = 4;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.configuration.impl.ConfigurationResolvedReferenceImpl <em>Resolved Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.configuration.impl.ConfigurationResolvedReferenceImpl
	 * @see net.mlanoe.language.vhdl.configuration.impl.ConfigurationPackageImpl#getConfigurationResolvedReference()
	 * @generated
	 */
	int CONFIGURATION_RESOLVED_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_RESOLVED_REFERENCE__ID = VhdlPackage.VHDL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_RESOLVED_REFERENCE__CONFIGURATION = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Resolved Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_RESOLVED_REFERENCE_FEATURE_COUNT = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.configuration.BlockConfiguration <em>Block Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Configuration</em>'.
	 * @see net.mlanoe.language.vhdl.configuration.BlockConfiguration
	 * @generated
	 */
	EClass getBlockConfiguration();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.configuration.BlockConfiguration#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Use</em>'.
	 * @see net.mlanoe.language.vhdl.configuration.BlockConfiguration#getUse()
	 * @see #getBlockConfiguration()
	 * @generated
	 */
	EReference getBlockConfiguration_Use();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.configuration.BlockConfiguration#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see net.mlanoe.language.vhdl.configuration.BlockConfiguration#getItem()
	 * @see #getBlockConfiguration()
	 * @generated
	 */
	EReference getBlockConfiguration_Item();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.configuration.ComponentConfiguration <em>Component Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Configuration</em>'.
	 * @see net.mlanoe.language.vhdl.configuration.ComponentConfiguration
	 * @generated
	 */
	EClass getComponentConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.configuration.ComponentConfiguration#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List</em>'.
	 * @see net.mlanoe.language.vhdl.configuration.ComponentConfiguration#getList()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EReference getComponentConfiguration_List();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.configuration.ComponentConfiguration#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component</em>'.
	 * @see net.mlanoe.language.vhdl.configuration.ComponentConfiguration#getComponent()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EReference getComponentConfiguration_Component();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.configuration.ComponentConfiguration#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity</em>'.
	 * @see net.mlanoe.language.vhdl.configuration.ComponentConfiguration#getEntity()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EReference getComponentConfiguration_Entity();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.configuration.ComponentConfiguration#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see net.mlanoe.language.vhdl.configuration.ComponentConfiguration#getConfiguration()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EReference getComponentConfiguration_Configuration();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.configuration.ComponentConfiguration#getGenericMap <em>Generic Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Map</em>'.
	 * @see net.mlanoe.language.vhdl.configuration.ComponentConfiguration#getGenericMap()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EReference getComponentConfiguration_GenericMap();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.configuration.ComponentConfiguration#getPortMap <em>Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Port Map</em>'.
	 * @see net.mlanoe.language.vhdl.configuration.ComponentConfiguration#getPortMap()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EReference getComponentConfiguration_PortMap();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.configuration.ComponentConfiguration#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see net.mlanoe.language.vhdl.configuration.ComponentConfiguration#getBlock()
	 * @see #getComponentConfiguration()
	 * @generated
	 */
	EReference getComponentConfiguration_Block();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.configuration.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see net.mlanoe.language.vhdl.configuration.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.configuration.Configuration#getOf <em>Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Of</em>'.
	 * @see net.mlanoe.language.vhdl.configuration.Configuration#getOf()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Of();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.configuration.Configuration#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Block</em>'.
	 * @see net.mlanoe.language.vhdl.configuration.Configuration#getBlock()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Block();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.configuration.ConfigurationItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see net.mlanoe.language.vhdl.configuration.ConfigurationItem
	 * @generated
	 */
	EClass getConfigurationItem();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.configuration.ConfigurationReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see net.mlanoe.language.vhdl.configuration.ConfigurationReference
	 * @generated
	 */
	EClass getConfigurationReference();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.configuration.ConfigurationResolvedReference <em>Resolved Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolved Reference</em>'.
	 * @see net.mlanoe.language.vhdl.configuration.ConfigurationResolvedReference
	 * @generated
	 */
	EClass getConfigurationResolvedReference();

	/**
	 * Returns the meta object for the reference '{@link net.mlanoe.language.vhdl.configuration.ConfigurationResolvedReference#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configuration</em>'.
	 * @see net.mlanoe.language.vhdl.configuration.ConfigurationResolvedReference#getConfiguration()
	 * @see #getConfigurationResolvedReference()
	 * @generated
	 */
	EReference getConfigurationResolvedReference_Configuration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConfigurationFactory getConfigurationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.configuration.impl.BlockConfigurationImpl <em>Block Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.configuration.impl.BlockConfigurationImpl
		 * @see net.mlanoe.language.vhdl.configuration.impl.ConfigurationPackageImpl#getBlockConfiguration()
		 * @generated
		 */
		EClass BLOCK_CONFIGURATION = eINSTANCE.getBlockConfiguration();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_CONFIGURATION__USE = eINSTANCE.getBlockConfiguration_Use();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_CONFIGURATION__ITEM = eINSTANCE.getBlockConfiguration_Item();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.configuration.impl.ComponentConfigurationImpl <em>Component Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.configuration.impl.ComponentConfigurationImpl
		 * @see net.mlanoe.language.vhdl.configuration.impl.ConfigurationPackageImpl#getComponentConfiguration()
		 * @generated
		 */
		EClass COMPONENT_CONFIGURATION = eINSTANCE.getComponentConfiguration();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_CONFIGURATION__LIST = eINSTANCE.getComponentConfiguration_List();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_CONFIGURATION__COMPONENT = eINSTANCE.getComponentConfiguration_Component();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_CONFIGURATION__ENTITY = eINSTANCE.getComponentConfiguration_Entity();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_CONFIGURATION__CONFIGURATION = eINSTANCE.getComponentConfiguration_Configuration();

		/**
		 * The meta object literal for the '<em><b>Generic Map</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_CONFIGURATION__GENERIC_MAP = eINSTANCE.getComponentConfiguration_GenericMap();

		/**
		 * The meta object literal for the '<em><b>Port Map</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_CONFIGURATION__PORT_MAP = eINSTANCE.getComponentConfiguration_PortMap();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_CONFIGURATION__BLOCK = eINSTANCE.getComponentConfiguration_Block();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.configuration.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.configuration.impl.ConfigurationImpl
		 * @see net.mlanoe.language.vhdl.configuration.impl.ConfigurationPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Of</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__OF = eINSTANCE.getConfiguration_Of();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__BLOCK = eINSTANCE.getConfiguration_Block();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.configuration.impl.ConfigurationItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.configuration.impl.ConfigurationItemImpl
		 * @see net.mlanoe.language.vhdl.configuration.impl.ConfigurationPackageImpl#getConfigurationItem()
		 * @generated
		 */
		EClass CONFIGURATION_ITEM = eINSTANCE.getConfigurationItem();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.configuration.ConfigurationReference <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.configuration.ConfigurationReference
		 * @see net.mlanoe.language.vhdl.configuration.impl.ConfigurationPackageImpl#getConfigurationReference()
		 * @generated
		 */
		EClass CONFIGURATION_REFERENCE = eINSTANCE.getConfigurationReference();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.configuration.impl.ConfigurationResolvedReferenceImpl <em>Resolved Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.configuration.impl.ConfigurationResolvedReferenceImpl
		 * @see net.mlanoe.language.vhdl.configuration.impl.ConfigurationPackageImpl#getConfigurationResolvedReference()
		 * @generated
		 */
		EClass CONFIGURATION_RESOLVED_REFERENCE = eINSTANCE.getConfigurationResolvedReference();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_RESOLVED_REFERENCE__CONFIGURATION = eINSTANCE.getConfigurationResolvedReference_Configuration();

	}

} //ConfigurationPackage
