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
package net.mlanoe.language.vhdl.statement.impl;

import net.mlanoe.language.vhdl.GenericMaps;
import net.mlanoe.language.vhdl.PortMaps;

import net.mlanoe.language.vhdl.statement.InstantiationStatement;
import net.mlanoe.language.vhdl.statement.StatementPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instantiation Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.InstantiationStatementImpl#getGenericMap <em>Generic Map</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.InstantiationStatementImpl#getPortMap <em>Port Map</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstantiationStatementImpl extends StatementImpl implements InstantiationStatement {
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
	protected InstantiationStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementPackage.Literals.INSTANTIATION_STATEMENT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.INSTANTIATION_STATEMENT__GENERIC_MAP, oldGenericMap, newGenericMap);
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
				msgs = ((InternalEObject)genericMap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.INSTANTIATION_STATEMENT__GENERIC_MAP, null, msgs);
			if (newGenericMap != null)
				msgs = ((InternalEObject)newGenericMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.INSTANTIATION_STATEMENT__GENERIC_MAP, null, msgs);
			msgs = basicSetGenericMap(newGenericMap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.INSTANTIATION_STATEMENT__GENERIC_MAP, newGenericMap, newGenericMap));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.INSTANTIATION_STATEMENT__PORT_MAP, oldPortMap, newPortMap);
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
				msgs = ((InternalEObject)portMap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.INSTANTIATION_STATEMENT__PORT_MAP, null, msgs);
			if (newPortMap != null)
				msgs = ((InternalEObject)newPortMap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.INSTANTIATION_STATEMENT__PORT_MAP, null, msgs);
			msgs = basicSetPortMap(newPortMap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.INSTANTIATION_STATEMENT__PORT_MAP, newPortMap, newPortMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementPackage.INSTANTIATION_STATEMENT__GENERIC_MAP:
				return basicSetGenericMap(null, msgs);
			case StatementPackage.INSTANTIATION_STATEMENT__PORT_MAP:
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
			case StatementPackage.INSTANTIATION_STATEMENT__GENERIC_MAP:
				return getGenericMap();
			case StatementPackage.INSTANTIATION_STATEMENT__PORT_MAP:
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
			case StatementPackage.INSTANTIATION_STATEMENT__GENERIC_MAP:
				setGenericMap((GenericMaps)newValue);
				return;
			case StatementPackage.INSTANTIATION_STATEMENT__PORT_MAP:
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
			case StatementPackage.INSTANTIATION_STATEMENT__GENERIC_MAP:
				setGenericMap((GenericMaps)null);
				return;
			case StatementPackage.INSTANTIATION_STATEMENT__PORT_MAP:
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
			case StatementPackage.INSTANTIATION_STATEMENT__GENERIC_MAP:
				return genericMap != null;
			case StatementPackage.INSTANTIATION_STATEMENT__PORT_MAP:
				return portMap != null;
		}
		return super.eIsSet(featureID);
	}

} //InstantiationStatementImpl
