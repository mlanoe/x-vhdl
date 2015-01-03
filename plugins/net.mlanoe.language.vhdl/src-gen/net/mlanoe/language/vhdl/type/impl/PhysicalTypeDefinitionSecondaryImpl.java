/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.type.impl;

import net.mlanoe.language.vhdl.Name;

import net.mlanoe.language.vhdl.type.PhysicalTypeDefinitionSecondary;
import net.mlanoe.language.vhdl.type.TypePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Type Definition Secondary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.type.impl.PhysicalTypeDefinitionSecondaryImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.type.impl.PhysicalTypeDefinitionSecondaryImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.type.impl.PhysicalTypeDefinitionSecondaryImpl#getOf <em>Of</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalTypeDefinitionSecondaryImpl extends MinimalEObjectImpl.Container implements PhysicalTypeDefinitionSecondary {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected String number = NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOf() <em>Of</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOf()
	 * @generated
	 * @ordered
	 */
	protected Name of;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalTypeDefinitionSecondaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypePackage.Literals.PHYSICAL_TYPE_DEFINITION_SECONDARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.PHYSICAL_TYPE_DEFINITION_SECONDARY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(String newNumber) {
		String oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.PHYSICAL_TYPE_DEFINITION_SECONDARY__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name getOf() {
		return of;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOf(Name newOf, NotificationChain msgs) {
		Name oldOf = of;
		of = newOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypePackage.PHYSICAL_TYPE_DEFINITION_SECONDARY__OF, oldOf, newOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOf(Name newOf) {
		if (newOf != of) {
			NotificationChain msgs = null;
			if (of != null)
				msgs = ((InternalEObject)of).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypePackage.PHYSICAL_TYPE_DEFINITION_SECONDARY__OF, null, msgs);
			if (newOf != null)
				msgs = ((InternalEObject)newOf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypePackage.PHYSICAL_TYPE_DEFINITION_SECONDARY__OF, null, msgs);
			msgs = basicSetOf(newOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.PHYSICAL_TYPE_DEFINITION_SECONDARY__OF, newOf, newOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TypePackage.PHYSICAL_TYPE_DEFINITION_SECONDARY__OF:
				return basicSetOf(null, msgs);
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
			case TypePackage.PHYSICAL_TYPE_DEFINITION_SECONDARY__NAME:
				return getName();
			case TypePackage.PHYSICAL_TYPE_DEFINITION_SECONDARY__NUMBER:
				return getNumber();
			case TypePackage.PHYSICAL_TYPE_DEFINITION_SECONDARY__OF:
				return getOf();
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
			case TypePackage.PHYSICAL_TYPE_DEFINITION_SECONDARY__NAME:
				setName((String)newValue);
				return;
			case TypePackage.PHYSICAL_TYPE_DEFINITION_SECONDARY__NUMBER:
				setNumber((String)newValue);
				return;
			case TypePackage.PHYSICAL_TYPE_DEFINITION_SECONDARY__OF:
				setOf((Name)newValue);
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
			case TypePackage.PHYSICAL_TYPE_DEFINITION_SECONDARY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TypePackage.PHYSICAL_TYPE_DEFINITION_SECONDARY__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case TypePackage.PHYSICAL_TYPE_DEFINITION_SECONDARY__OF:
				setOf((Name)null);
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
			case TypePackage.PHYSICAL_TYPE_DEFINITION_SECONDARY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TypePackage.PHYSICAL_TYPE_DEFINITION_SECONDARY__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case TypePackage.PHYSICAL_TYPE_DEFINITION_SECONDARY__OF:
				return of != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", number: ");
		result.append(number);
		result.append(')');
		return result.toString();
	}

} //PhysicalTypeDefinitionSecondaryImpl
