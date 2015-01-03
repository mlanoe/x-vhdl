/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.impl;

import java.util.Collection;

import net.mlanoe.language.vhdl.Entity;
import net.mlanoe.language.vhdl.Generics;
import net.mlanoe.language.vhdl.Name;
import net.mlanoe.language.vhdl.Named;
import net.mlanoe.language.vhdl.Ports;
import net.mlanoe.language.vhdl.VhdlPackage;

import net.mlanoe.language.vhdl.statement.Statement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.impl.EntityImpl#getGeneric <em>Generic</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.impl.EntityImpl#getPort <em>Port</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.impl.EntityImpl#getStatement <em>Statement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntityImpl extends ModuleImpl implements Entity {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected Name name;

	/**
	 * The cached value of the '{@link #getGeneric() <em>Generic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneric()
	 * @generated
	 * @ordered
	 */
	protected Generics generic;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected Ports port;

	/**
	 * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> statement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VhdlPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(Name newName, NotificationChain msgs) {
		Name oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VhdlPackage.ENTITY__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(Name newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VhdlPackage.ENTITY__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VhdlPackage.ENTITY__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VhdlPackage.ENTITY__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generics getGeneric() {
		return generic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneric(Generics newGeneric, NotificationChain msgs) {
		Generics oldGeneric = generic;
		generic = newGeneric;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VhdlPackage.ENTITY__GENERIC, oldGeneric, newGeneric);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneric(Generics newGeneric) {
		if (newGeneric != generic) {
			NotificationChain msgs = null;
			if (generic != null)
				msgs = ((InternalEObject)generic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VhdlPackage.ENTITY__GENERIC, null, msgs);
			if (newGeneric != null)
				msgs = ((InternalEObject)newGeneric).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VhdlPackage.ENTITY__GENERIC, null, msgs);
			msgs = basicSetGeneric(newGeneric, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VhdlPackage.ENTITY__GENERIC, newGeneric, newGeneric));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ports getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPort(Ports newPort, NotificationChain msgs) {
		Ports oldPort = port;
		port = newPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VhdlPackage.ENTITY__PORT, oldPort, newPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(Ports newPort) {
		if (newPort != port) {
			NotificationChain msgs = null;
			if (port != null)
				msgs = ((InternalEObject)port).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VhdlPackage.ENTITY__PORT, null, msgs);
			if (newPort != null)
				msgs = ((InternalEObject)newPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VhdlPackage.ENTITY__PORT, null, msgs);
			msgs = basicSetPort(newPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VhdlPackage.ENTITY__PORT, newPort, newPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getStatement() {
		if (statement == null) {
			statement = new EObjectContainmentEList<Statement>(Statement.class, this, VhdlPackage.ENTITY__STATEMENT);
		}
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VhdlPackage.ENTITY__NAME:
				return basicSetName(null, msgs);
			case VhdlPackage.ENTITY__GENERIC:
				return basicSetGeneric(null, msgs);
			case VhdlPackage.ENTITY__PORT:
				return basicSetPort(null, msgs);
			case VhdlPackage.ENTITY__STATEMENT:
				return ((InternalEList<?>)getStatement()).basicRemove(otherEnd, msgs);
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
			case VhdlPackage.ENTITY__NAME:
				return getName();
			case VhdlPackage.ENTITY__GENERIC:
				return getGeneric();
			case VhdlPackage.ENTITY__PORT:
				return getPort();
			case VhdlPackage.ENTITY__STATEMENT:
				return getStatement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VhdlPackage.ENTITY__NAME:
				setName((Name)newValue);
				return;
			case VhdlPackage.ENTITY__GENERIC:
				setGeneric((Generics)newValue);
				return;
			case VhdlPackage.ENTITY__PORT:
				setPort((Ports)newValue);
				return;
			case VhdlPackage.ENTITY__STATEMENT:
				getStatement().clear();
				getStatement().addAll((Collection<? extends Statement>)newValue);
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
			case VhdlPackage.ENTITY__NAME:
				setName((Name)null);
				return;
			case VhdlPackage.ENTITY__GENERIC:
				setGeneric((Generics)null);
				return;
			case VhdlPackage.ENTITY__PORT:
				setPort((Ports)null);
				return;
			case VhdlPackage.ENTITY__STATEMENT:
				getStatement().clear();
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
			case VhdlPackage.ENTITY__NAME:
				return name != null;
			case VhdlPackage.ENTITY__GENERIC:
				return generic != null;
			case VhdlPackage.ENTITY__PORT:
				return port != null;
			case VhdlPackage.ENTITY__STATEMENT:
				return statement != null && !statement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Named.class) {
			switch (derivedFeatureID) {
				case VhdlPackage.ENTITY__NAME: return VhdlPackage.NAMED__NAME;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Named.class) {
			switch (baseFeatureID) {
				case VhdlPackage.NAMED__NAME: return VhdlPackage.ENTITY__NAME;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EntityImpl
