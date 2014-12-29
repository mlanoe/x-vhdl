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
package net.mlanoe.language.vhdl.declaration.impl;

import net.mlanoe.language.vhdl.ComponentReference;
import net.mlanoe.language.vhdl.EntityReference;
import net.mlanoe.language.vhdl.GenericMaps;
import net.mlanoe.language.vhdl.MultiName;
import net.mlanoe.language.vhdl.PortMaps;
import net.mlanoe.language.vhdl.configuration.ConfigurationReference;
import net.mlanoe.language.vhdl.declaration.ConfigurationSpecification;
import net.mlanoe.language.vhdl.declaration.DeclarationPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.impl.ConfigurationSpecificationImpl#getList <em>List</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.impl.ConfigurationSpecificationImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.impl.ConfigurationSpecificationImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.impl.ConfigurationSpecificationImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.impl.ConfigurationSpecificationImpl#getGenericMap <em>Generic Map</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.impl.ConfigurationSpecificationImpl#getPortMap <em>Port Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigurationSpecificationImpl extends DeclarationImpl implements ConfigurationSpecification {
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
	protected ComponentReference component;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected EntityReference entity;

	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationReference configuration;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeclarationPackage.Literals.CONFIGURATION_SPECIFICATION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationPackage.CONFIGURATION_SPECIFICATION__LIST, oldList, newList);
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
				msgs = ((InternalEObject)list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.CONFIGURATION_SPECIFICATION__LIST, null, msgs);
			if (newList != null)
				msgs = ((InternalEObject)newList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.CONFIGURATION_SPECIFICATION__LIST, null, msgs);
			msgs = basicSetList(newList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.CONFIGURATION_SPECIFICATION__LIST, newList, newList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentReference getComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponent(ComponentReference newComponent, NotificationChain msgs) {
		ComponentReference oldComponent = component;
		component = newComponent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationPackage.CONFIGURATION_SPECIFICATION__COMPONENT, oldComponent, newComponent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(ComponentReference newComponent) {
		if (newComponent != component) {
			NotificationChain msgs = null;
			if (component != null)
				msgs = ((InternalEObject)component).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.CONFIGURATION_SPECIFICATION__COMPONENT, null, msgs);
			if (newComponent != null)
				msgs = ((InternalEObject)newComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.CONFIGURATION_SPECIFICATION__COMPONENT, null, msgs);
			msgs = basicSetComponent(newComponent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.CONFIGURATION_SPECIFICATION__COMPONENT, newComponent, newComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityReference getEntity() {
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntity(EntityReference newEntity, NotificationChain msgs) {
		EntityReference oldEntity = entity;
		entity = newEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationPackage.CONFIGURATION_SPECIFICATION__ENTITY, oldEntity, newEntity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntity(EntityReference newEntity) {
		if (newEntity != entity) {
			NotificationChain msgs = null;
			if (entity != null)
				msgs = ((InternalEObject)entity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.CONFIGURATION_SPECIFICATION__ENTITY, null, msgs);
			if (newEntity != null)
				msgs = ((InternalEObject)newEntity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.CONFIGURATION_SPECIFICATION__ENTITY, null, msgs);
			msgs = basicSetEntity(newEntity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.CONFIGURATION_SPECIFICATION__ENTITY, newEntity, newEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationReference getConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfiguration(ConfigurationReference newConfiguration, NotificationChain msgs) {
		ConfigurationReference oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationPackage.CONFIGURATION_SPECIFICATION__CONFIGURATION, oldConfiguration, newConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(ConfigurationReference newConfiguration) {
		if (newConfiguration != configuration) {
			NotificationChain msgs = null;
			if (configuration != null)
				msgs = ((InternalEObject)configuration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.CONFIGURATION_SPECIFICATION__CONFIGURATION, null, msgs);
			if (newConfiguration != null)
				msgs = ((InternalEObject)newConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.CONFIGURATION_SPECIFICATION__CONFIGURATION, null, msgs);
			msgs = basicSetConfiguration(newConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.CONFIGURATION_SPECIFICATION__CONFIGURATION, newConfiguration, newConfiguration));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationPackage.CONFIGURATION_SPECIFICATION__GENERIC_MAP, oldGenericMap, newGenericMap);
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
				msgs = ((InternalEObject)genericMap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.CONFIGURATION_SPECIFICATION__GENERIC_MAP, null, msgs);
			if (newGenericMap != null)
				msgs = ((InternalEObject)newGenericMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.CONFIGURATION_SPECIFICATION__GENERIC_MAP, null, msgs);
			msgs = basicSetGenericMap(newGenericMap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.CONFIGURATION_SPECIFICATION__GENERIC_MAP, newGenericMap, newGenericMap));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationPackage.CONFIGURATION_SPECIFICATION__PORT_MAP, oldPortMap, newPortMap);
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
				msgs = ((InternalEObject)portMap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.CONFIGURATION_SPECIFICATION__PORT_MAP, null, msgs);
			if (newPortMap != null)
				msgs = ((InternalEObject)newPortMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.CONFIGURATION_SPECIFICATION__PORT_MAP, null, msgs);
			msgs = basicSetPortMap(newPortMap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.CONFIGURATION_SPECIFICATION__PORT_MAP, newPortMap, newPortMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeclarationPackage.CONFIGURATION_SPECIFICATION__LIST:
				return basicSetList(null, msgs);
			case DeclarationPackage.CONFIGURATION_SPECIFICATION__COMPONENT:
				return basicSetComponent(null, msgs);
			case DeclarationPackage.CONFIGURATION_SPECIFICATION__ENTITY:
				return basicSetEntity(null, msgs);
			case DeclarationPackage.CONFIGURATION_SPECIFICATION__CONFIGURATION:
				return basicSetConfiguration(null, msgs);
			case DeclarationPackage.CONFIGURATION_SPECIFICATION__GENERIC_MAP:
				return basicSetGenericMap(null, msgs);
			case DeclarationPackage.CONFIGURATION_SPECIFICATION__PORT_MAP:
				return basicSetPortMap(null, msgs);
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
			case DeclarationPackage.CONFIGURATION_SPECIFICATION__LIST:
				return getList();
			case DeclarationPackage.CONFIGURATION_SPECIFICATION__COMPONENT:
				return getComponent();
			case DeclarationPackage.CONFIGURATION_SPECIFICATION__ENTITY:
				return getEntity();
			case DeclarationPackage.CONFIGURATION_SPECIFICATION__CONFIGURATION:
				return getConfiguration();
			case DeclarationPackage.CONFIGURATION_SPECIFICATION__GENERIC_MAP:
				return getGenericMap();
			case DeclarationPackage.CONFIGURATION_SPECIFICATION__PORT_MAP:
				return getPortMap();
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
			case DeclarationPackage.CONFIGURATION_SPECIFICATION__LIST:
				setList((MultiName)newValue);
				return;
			case DeclarationPackage.CONFIGURATION_SPECIFICATION__COMPONENT:
				setComponent((ComponentReference)newValue);
				return;
			case DeclarationPackage.CONFIGURATION_SPECIFICATION__ENTITY:
				setEntity((EntityReference)newValue);
				return;
			case DeclarationPackage.CONFIGURATION_SPECIFICATION__CONFIGURATION:
				setConfiguration((ConfigurationReference)newValue);
				return;
			case DeclarationPackage.CONFIGURATION_SPECIFICATION__GENERIC_MAP:
				setGenericMap((GenericMaps)newValue);
				return;
			case DeclarationPackage.CONFIGURATION_SPECIFICATION__PORT_MAP:
				setPortMap((PortMaps)newValue);
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
			case DeclarationPackage.CONFIGURATION_SPECIFICATION__LIST:
				setList((MultiName)null);
				return;
			case DeclarationPackage.CONFIGURATION_SPECIFICATION__COMPONENT:
				setComponent((ComponentReference)null);
				return;
			case DeclarationPackage.CONFIGURATION_SPECIFICATION__ENTITY:
				setEntity((EntityReference)null);
				return;
			case DeclarationPackage.CONFIGURATION_SPECIFICATION__CONFIGURATION:
				setConfiguration((ConfigurationReference)null);
				return;
			case DeclarationPackage.CONFIGURATION_SPECIFICATION__GENERIC_MAP:
				setGenericMap((GenericMaps)null);
				return;
			case DeclarationPackage.CONFIGURATION_SPECIFICATION__PORT_MAP:
				setPortMap((PortMaps)null);
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
			case DeclarationPackage.CONFIGURATION_SPECIFICATION__LIST:
				return list != null;
			case DeclarationPackage.CONFIGURATION_SPECIFICATION__COMPONENT:
				return component != null;
			case DeclarationPackage.CONFIGURATION_SPECIFICATION__ENTITY:
				return entity != null;
			case DeclarationPackage.CONFIGURATION_SPECIFICATION__CONFIGURATION:
				return configuration != null;
			case DeclarationPackage.CONFIGURATION_SPECIFICATION__GENERIC_MAP:
				return genericMap != null;
			case DeclarationPackage.CONFIGURATION_SPECIFICATION__PORT_MAP:
				return portMap != null;
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationSpecificationImpl
