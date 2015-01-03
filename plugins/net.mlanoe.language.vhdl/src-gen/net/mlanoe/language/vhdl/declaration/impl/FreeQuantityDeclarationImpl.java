/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.declaration.impl;

import net.mlanoe.language.vhdl.MultiName;
import net.mlanoe.language.vhdl.MultiNamed;
import net.mlanoe.language.vhdl.VhdlPackage;

import net.mlanoe.language.vhdl.declaration.DeclarationPackage;
import net.mlanoe.language.vhdl.declaration.FreeQuantityDeclaration;

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
 * An implementation of the model object '<em><b>Free Quantity Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.impl.FreeQuantityDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.impl.FreeQuantityDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.impl.FreeQuantityDeclarationImpl#getQuantity <em>Quantity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FreeQuantityDeclarationImpl extends QuantityDeclarationImpl implements FreeQuantityDeclaration {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected MultiName name;

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
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected Expression quantity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FreeQuantityDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeclarationPackage.Literals.FREE_QUANTITY_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiName getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(MultiName newName, NotificationChain msgs) {
		MultiName oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationPackage.FREE_QUANTITY_DECLARATION__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(MultiName newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.FREE_QUANTITY_DECLARATION__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.FREE_QUANTITY_DECLARATION__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.FREE_QUANTITY_DECLARATION__NAME, newName, newName));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationPackage.FREE_QUANTITY_DECLARATION__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.FREE_QUANTITY_DECLARATION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.FREE_QUANTITY_DECLARATION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.FREE_QUANTITY_DECLARATION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQuantity(Expression newQuantity, NotificationChain msgs) {
		Expression oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationPackage.FREE_QUANTITY_DECLARATION__QUANTITY, oldQuantity, newQuantity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(Expression newQuantity) {
		if (newQuantity != quantity) {
			NotificationChain msgs = null;
			if (quantity != null)
				msgs = ((InternalEObject)quantity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.FREE_QUANTITY_DECLARATION__QUANTITY, null, msgs);
			if (newQuantity != null)
				msgs = ((InternalEObject)newQuantity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.FREE_QUANTITY_DECLARATION__QUANTITY, null, msgs);
			msgs = basicSetQuantity(newQuantity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.FREE_QUANTITY_DECLARATION__QUANTITY, newQuantity, newQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeclarationPackage.FREE_QUANTITY_DECLARATION__NAME:
				return basicSetName(null, msgs);
			case DeclarationPackage.FREE_QUANTITY_DECLARATION__TYPE:
				return basicSetType(null, msgs);
			case DeclarationPackage.FREE_QUANTITY_DECLARATION__QUANTITY:
				return basicSetQuantity(null, msgs);
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
			case DeclarationPackage.FREE_QUANTITY_DECLARATION__NAME:
				return getName();
			case DeclarationPackage.FREE_QUANTITY_DECLARATION__TYPE:
				return getType();
			case DeclarationPackage.FREE_QUANTITY_DECLARATION__QUANTITY:
				return getQuantity();
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
			case DeclarationPackage.FREE_QUANTITY_DECLARATION__NAME:
				setName((MultiName)newValue);
				return;
			case DeclarationPackage.FREE_QUANTITY_DECLARATION__TYPE:
				setType((TypeReference)newValue);
				return;
			case DeclarationPackage.FREE_QUANTITY_DECLARATION__QUANTITY:
				setQuantity((Expression)newValue);
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
			case DeclarationPackage.FREE_QUANTITY_DECLARATION__NAME:
				setName((MultiName)null);
				return;
			case DeclarationPackage.FREE_QUANTITY_DECLARATION__TYPE:
				setType((TypeReference)null);
				return;
			case DeclarationPackage.FREE_QUANTITY_DECLARATION__QUANTITY:
				setQuantity((Expression)null);
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
			case DeclarationPackage.FREE_QUANTITY_DECLARATION__NAME:
				return name != null;
			case DeclarationPackage.FREE_QUANTITY_DECLARATION__TYPE:
				return type != null;
			case DeclarationPackage.FREE_QUANTITY_DECLARATION__QUANTITY:
				return quantity != null;
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
		if (baseClass == MultiNamed.class) {
			switch (derivedFeatureID) {
				case DeclarationPackage.FREE_QUANTITY_DECLARATION__NAME: return VhdlPackage.MULTI_NAMED__NAME;
				default: return -1;
			}
		}
		if (baseClass == Typed.class) {
			switch (derivedFeatureID) {
				case DeclarationPackage.FREE_QUANTITY_DECLARATION__TYPE: return TypePackage.TYPED__TYPE;
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
		if (baseClass == MultiNamed.class) {
			switch (baseFeatureID) {
				case VhdlPackage.MULTI_NAMED__NAME: return DeclarationPackage.FREE_QUANTITY_DECLARATION__NAME;
				default: return -1;
			}
		}
		if (baseClass == Typed.class) {
			switch (baseFeatureID) {
				case TypePackage.TYPED__TYPE: return DeclarationPackage.FREE_QUANTITY_DECLARATION__TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FreeQuantityDeclarationImpl
