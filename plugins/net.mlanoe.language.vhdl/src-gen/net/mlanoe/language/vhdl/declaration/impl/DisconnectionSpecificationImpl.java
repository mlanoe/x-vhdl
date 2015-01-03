/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.declaration.impl;

import net.mlanoe.language.vhdl.MultiName;

import net.mlanoe.language.vhdl.declaration.DeclarationPackage;
import net.mlanoe.language.vhdl.declaration.DisconnectionSpecification;

import net.mlanoe.language.vhdl.expression.Expression;

import net.mlanoe.language.vhdl.type.TypePackage;
import net.mlanoe.language.vhdl.type.TypeReference;
import net.mlanoe.language.vhdl.type.Typed;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disconnection Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.impl.DisconnectionSpecificationImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.impl.DisconnectionSpecificationImpl#getDisconnect <em>Disconnect</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.impl.DisconnectionSpecificationImpl#getAfter <em>After</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DisconnectionSpecificationImpl extends DeclarationImpl implements DisconnectionSpecification {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TypeReference type;

	/**
	 * The cached value of the '{@link #getDisconnect() <em>Disconnect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisconnect()
	 * @generated
	 * @ordered
	 */
	protected MultiName disconnect;

	/**
	 * The cached value of the '{@link #getAfter() <em>After</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAfter()
	 * @generated
	 * @ordered
	 */
	protected Expression after;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisconnectionSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeclarationPackage.Literals.DISCONNECTION_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReference getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(TypeReference newType, NotificationChain msgs) {
		TypeReference oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationPackage.DISCONNECTION_SPECIFICATION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TypeReference newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.DISCONNECTION_SPECIFICATION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.DISCONNECTION_SPECIFICATION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.DISCONNECTION_SPECIFICATION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiName getDisconnect() {
		return disconnect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisconnect(MultiName newDisconnect, NotificationChain msgs) {
		MultiName oldDisconnect = disconnect;
		disconnect = newDisconnect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationPackage.DISCONNECTION_SPECIFICATION__DISCONNECT, oldDisconnect, newDisconnect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisconnect(MultiName newDisconnect) {
		if (newDisconnect != disconnect) {
			NotificationChain msgs = null;
			if (disconnect != null)
				msgs = ((InternalEObject)disconnect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.DISCONNECTION_SPECIFICATION__DISCONNECT, null, msgs);
			if (newDisconnect != null)
				msgs = ((InternalEObject)newDisconnect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.DISCONNECTION_SPECIFICATION__DISCONNECT, null, msgs);
			msgs = basicSetDisconnect(newDisconnect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.DISCONNECTION_SPECIFICATION__DISCONNECT, newDisconnect, newDisconnect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getAfter() {
		return after;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAfter(Expression newAfter, NotificationChain msgs) {
		Expression oldAfter = after;
		after = newAfter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationPackage.DISCONNECTION_SPECIFICATION__AFTER, oldAfter, newAfter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfter(Expression newAfter) {
		if (newAfter != after) {
			NotificationChain msgs = null;
			if (after != null)
				msgs = ((InternalEObject)after).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.DISCONNECTION_SPECIFICATION__AFTER, null, msgs);
			if (newAfter != null)
				msgs = ((InternalEObject)newAfter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.DISCONNECTION_SPECIFICATION__AFTER, null, msgs);
			msgs = basicSetAfter(newAfter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.DISCONNECTION_SPECIFICATION__AFTER, newAfter, newAfter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeclarationPackage.DISCONNECTION_SPECIFICATION__TYPE:
				return basicSetType(null, msgs);
			case DeclarationPackage.DISCONNECTION_SPECIFICATION__DISCONNECT:
				return basicSetDisconnect(null, msgs);
			case DeclarationPackage.DISCONNECTION_SPECIFICATION__AFTER:
				return basicSetAfter(null, msgs);
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
			case DeclarationPackage.DISCONNECTION_SPECIFICATION__TYPE:
				return getType();
			case DeclarationPackage.DISCONNECTION_SPECIFICATION__DISCONNECT:
				return getDisconnect();
			case DeclarationPackage.DISCONNECTION_SPECIFICATION__AFTER:
				return getAfter();
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
			case DeclarationPackage.DISCONNECTION_SPECIFICATION__TYPE:
				setType((TypeReference)newValue);
				return;
			case DeclarationPackage.DISCONNECTION_SPECIFICATION__DISCONNECT:
				setDisconnect((MultiName)newValue);
				return;
			case DeclarationPackage.DISCONNECTION_SPECIFICATION__AFTER:
				setAfter((Expression)newValue);
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
			case DeclarationPackage.DISCONNECTION_SPECIFICATION__TYPE:
				setType((TypeReference)null);
				return;
			case DeclarationPackage.DISCONNECTION_SPECIFICATION__DISCONNECT:
				setDisconnect((MultiName)null);
				return;
			case DeclarationPackage.DISCONNECTION_SPECIFICATION__AFTER:
				setAfter((Expression)null);
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
			case DeclarationPackage.DISCONNECTION_SPECIFICATION__TYPE:
				return type != null;
			case DeclarationPackage.DISCONNECTION_SPECIFICATION__DISCONNECT:
				return disconnect != null;
			case DeclarationPackage.DISCONNECTION_SPECIFICATION__AFTER:
				return after != null;
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
		if (baseClass == Typed.class) {
			switch (derivedFeatureID) {
				case DeclarationPackage.DISCONNECTION_SPECIFICATION__TYPE: return TypePackage.TYPED__TYPE;
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
		if (baseClass == Typed.class) {
			switch (baseFeatureID) {
				case TypePackage.TYPED__TYPE: return DeclarationPackage.DISCONNECTION_SPECIFICATION__TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DisconnectionSpecificationImpl
