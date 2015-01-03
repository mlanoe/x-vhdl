/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.configuration.impl;

import net.mlanoe.language.vhdl.GenericMaps;
import net.mlanoe.language.vhdl.MultiName;
import net.mlanoe.language.vhdl.Name;
import net.mlanoe.language.vhdl.PortMaps;

import net.mlanoe.language.vhdl.configuration.BlockConfiguration;
import net.mlanoe.language.vhdl.configuration.ComponentConfiguration;
import net.mlanoe.language.vhdl.configuration.ConfigurationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.configuration.impl.ComponentConfigurationImpl#getList <em>List</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.configuration.impl.ComponentConfigurationImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.configuration.impl.ComponentConfigurationImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.configuration.impl.ComponentConfigurationImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.configuration.impl.ComponentConfigurationImpl#getGenericMap <em>Generic Map</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.configuration.impl.ComponentConfigurationImpl#getPortMap <em>Port Map</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.configuration.impl.ComponentConfigurationImpl#getBlock <em>Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentConfigurationImpl extends ConfigurationItemImpl implements ComponentConfiguration {
	/**
	 * The cached value of the '{@link #getList() <em>List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getList()
	 * @generated
	 * @ordered
	 */
	protected MultiName list;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected Name component;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected Name entity;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected Name configuration;

	/**
	 * The cached value of the '{@link #getGenericMap() <em>Generic Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericMap()
	 * @generated
	 * @ordered
	 */
	protected GenericMaps genericMap;

	/**
	 * The cached value of the '{@link #getPortMap() <em>Port Map</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortMap()
	 * @generated
	 * @ordered
	 */
	protected PortMaps portMap;

	/**
	 * The cached value of the '{@link #getBlock() <em>Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlock()
	 * @generated
	 * @ordered
	 */
	protected BlockConfiguration block;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.COMPONENT_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiName getList() {
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetList(MultiName newList, NotificationChain msgs) {
		MultiName oldList = list;
		list = newList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.COMPONENT_CONFIGURATION__LIST, oldList, newList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setList(MultiName newList) {
		if (newList != list) {
			NotificationChain msgs = null;
			if (list != null)
				msgs = ((InternalEObject)list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.COMPONENT_CONFIGURATION__LIST, null, msgs);
			if (newList != null)
				msgs = ((InternalEObject)newList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.COMPONENT_CONFIGURATION__LIST, null, msgs);
			msgs = basicSetList(newList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.COMPONENT_CONFIGURATION__LIST, newList, newList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name getComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponent(Name newComponent, NotificationChain msgs) {
		Name oldComponent = component;
		component = newComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.COMPONENT_CONFIGURATION__COMPONENT, oldComponent, newComponent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(Name newComponent) {
		if (newComponent != component) {
			NotificationChain msgs = null;
			if (component != null)
				msgs = ((InternalEObject)component).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.COMPONENT_CONFIGURATION__COMPONENT, null, msgs);
			if (newComponent != null)
				msgs = ((InternalEObject)newComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.COMPONENT_CONFIGURATION__COMPONENT, null, msgs);
			msgs = basicSetComponent(newComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.COMPONENT_CONFIGURATION__COMPONENT, newComponent, newComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name getEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntity(Name newEntity, NotificationChain msgs) {
		Name oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.COMPONENT_CONFIGURATION__ENTITY, oldEntity, newEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(Name newEntity) {
		if (newEntity != entity) {
			NotificationChain msgs = null;
			if (entity != null)
				msgs = ((InternalEObject)entity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.COMPONENT_CONFIGURATION__ENTITY, null, msgs);
			if (newEntity != null)
				msgs = ((InternalEObject)newEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.COMPONENT_CONFIGURATION__ENTITY, null, msgs);
			msgs = basicSetEntity(newEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.COMPONENT_CONFIGURATION__ENTITY, newEntity, newEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name getConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(Name newConfiguration, NotificationChain msgs) {
		Name oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.COMPONENT_CONFIGURATION__CONFIGURATION, oldConfiguration, newConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(Name newConfiguration) {
		if (newConfiguration != configuration) {
			NotificationChain msgs = null;
			if (configuration != null)
				msgs = ((InternalEObject)configuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.COMPONENT_CONFIGURATION__CONFIGURATION, null, msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.COMPONENT_CONFIGURATION__CONFIGURATION, null, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.COMPONENT_CONFIGURATION__CONFIGURATION, newConfiguration, newConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericMaps getGenericMap() {
		return genericMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenericMap(GenericMaps newGenericMap, NotificationChain msgs) {
		GenericMaps oldGenericMap = genericMap;
		genericMap = newGenericMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.COMPONENT_CONFIGURATION__GENERIC_MAP, oldGenericMap, newGenericMap);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenericMap(GenericMaps newGenericMap) {
		if (newGenericMap != genericMap) {
			NotificationChain msgs = null;
			if (genericMap != null)
				msgs = ((InternalEObject)genericMap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.COMPONENT_CONFIGURATION__GENERIC_MAP, null, msgs);
			if (newGenericMap != null)
				msgs = ((InternalEObject)newGenericMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.COMPONENT_CONFIGURATION__GENERIC_MAP, null, msgs);
			msgs = basicSetGenericMap(newGenericMap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.COMPONENT_CONFIGURATION__GENERIC_MAP, newGenericMap, newGenericMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortMaps getPortMap() {
		return portMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortMap(PortMaps newPortMap, NotificationChain msgs) {
		PortMaps oldPortMap = portMap;
		portMap = newPortMap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.COMPONENT_CONFIGURATION__PORT_MAP, oldPortMap, newPortMap);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortMap(PortMaps newPortMap) {
		if (newPortMap != portMap) {
			NotificationChain msgs = null;
			if (portMap != null)
				msgs = ((InternalEObject)portMap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.COMPONENT_CONFIGURATION__PORT_MAP, null, msgs);
			if (newPortMap != null)
				msgs = ((InternalEObject)newPortMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.COMPONENT_CONFIGURATION__PORT_MAP, null, msgs);
			msgs = basicSetPortMap(newPortMap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.COMPONENT_CONFIGURATION__PORT_MAP, newPortMap, newPortMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockConfiguration getBlock() {
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlock(BlockConfiguration newBlock, NotificationChain msgs) {
		BlockConfiguration oldBlock = block;
		block = newBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.COMPONENT_CONFIGURATION__BLOCK, oldBlock, newBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlock(BlockConfiguration newBlock) {
		if (newBlock != block) {
			NotificationChain msgs = null;
			if (block != null)
				msgs = ((InternalEObject)block).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.COMPONENT_CONFIGURATION__BLOCK, null, msgs);
			if (newBlock != null)
				msgs = ((InternalEObject)newBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.COMPONENT_CONFIGURATION__BLOCK, null, msgs);
			msgs = basicSetBlock(newBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.COMPONENT_CONFIGURATION__BLOCK, newBlock, newBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationPackage.COMPONENT_CONFIGURATION__LIST:
				return basicSetList(null, msgs);
			case ConfigurationPackage.COMPONENT_CONFIGURATION__COMPONENT:
				return basicSetComponent(null, msgs);
			case ConfigurationPackage.COMPONENT_CONFIGURATION__ENTITY:
				return basicSetEntity(null, msgs);
			case ConfigurationPackage.COMPONENT_CONFIGURATION__CONFIGURATION:
				return basicSetConfiguration(null, msgs);
			case ConfigurationPackage.COMPONENT_CONFIGURATION__GENERIC_MAP:
				return basicSetGenericMap(null, msgs);
			case ConfigurationPackage.COMPONENT_CONFIGURATION__PORT_MAP:
				return basicSetPortMap(null, msgs);
			case ConfigurationPackage.COMPONENT_CONFIGURATION__BLOCK:
				return basicSetBlock(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationPackage.COMPONENT_CONFIGURATION__LIST:
				return getList();
			case ConfigurationPackage.COMPONENT_CONFIGURATION__COMPONENT:
				return getComponent();
			case ConfigurationPackage.COMPONENT_CONFIGURATION__ENTITY:
				return getEntity();
			case ConfigurationPackage.COMPONENT_CONFIGURATION__CONFIGURATION:
				return getConfiguration();
			case ConfigurationPackage.COMPONENT_CONFIGURATION__GENERIC_MAP:
				return getGenericMap();
			case ConfigurationPackage.COMPONENT_CONFIGURATION__PORT_MAP:
				return getPortMap();
			case ConfigurationPackage.COMPONENT_CONFIGURATION__BLOCK:
				return getBlock();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfigurationPackage.COMPONENT_CONFIGURATION__LIST:
				setList((MultiName)newValue);
				return;
			case ConfigurationPackage.COMPONENT_CONFIGURATION__COMPONENT:
				setComponent((Name)newValue);
				return;
			case ConfigurationPackage.COMPONENT_CONFIGURATION__ENTITY:
				setEntity((Name)newValue);
				return;
			case ConfigurationPackage.COMPONENT_CONFIGURATION__CONFIGURATION:
				setConfiguration((Name)newValue);
				return;
			case ConfigurationPackage.COMPONENT_CONFIGURATION__GENERIC_MAP:
				setGenericMap((GenericMaps)newValue);
				return;
			case ConfigurationPackage.COMPONENT_CONFIGURATION__PORT_MAP:
				setPortMap((PortMaps)newValue);
				return;
			case ConfigurationPackage.COMPONENT_CONFIGURATION__BLOCK:
				setBlock((BlockConfiguration)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConfigurationPackage.COMPONENT_CONFIGURATION__LIST:
				setList((MultiName)null);
				return;
			case ConfigurationPackage.COMPONENT_CONFIGURATION__COMPONENT:
				setComponent((Name)null);
				return;
			case ConfigurationPackage.COMPONENT_CONFIGURATION__ENTITY:
				setEntity((Name)null);
				return;
			case ConfigurationPackage.COMPONENT_CONFIGURATION__CONFIGURATION:
				setConfiguration((Name)null);
				return;
			case ConfigurationPackage.COMPONENT_CONFIGURATION__GENERIC_MAP:
				setGenericMap((GenericMaps)null);
				return;
			case ConfigurationPackage.COMPONENT_CONFIGURATION__PORT_MAP:
				setPortMap((PortMaps)null);
				return;
			case ConfigurationPackage.COMPONENT_CONFIGURATION__BLOCK:
				setBlock((BlockConfiguration)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConfigurationPackage.COMPONENT_CONFIGURATION__LIST:
				return list != null;
			case ConfigurationPackage.COMPONENT_CONFIGURATION__COMPONENT:
				return component != null;
			case ConfigurationPackage.COMPONENT_CONFIGURATION__ENTITY:
				return entity != null;
			case ConfigurationPackage.COMPONENT_CONFIGURATION__CONFIGURATION:
				return configuration != null;
			case ConfigurationPackage.COMPONENT_CONFIGURATION__GENERIC_MAP:
				return genericMap != null;
			case ConfigurationPackage.COMPONENT_CONFIGURATION__PORT_MAP:
				return portMap != null;
			case ConfigurationPackage.COMPONENT_CONFIGURATION__BLOCK:
				return block != null;
		}
		return super.eIsSet(featureID);
	}

} //ComponentConfigurationImpl
