/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.nature.impl;

import net.mlanoe.language.vhdl.MultiName;
import net.mlanoe.language.vhdl.MultiNamed;
import net.mlanoe.language.vhdl.VhdlPackage;

import net.mlanoe.language.vhdl.impl.VhdlObjectImpl;

import net.mlanoe.language.vhdl.nature.NaturePackage;
import net.mlanoe.language.vhdl.nature.NatureReference;
import net.mlanoe.language.vhdl.nature.Natured;
import net.mlanoe.language.vhdl.nature.RecordNatureElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record Nature Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.nature.impl.RecordNatureElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.nature.impl.RecordNatureElementImpl#getNature <em>Nature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecordNatureElementImpl extends VhdlObjectImpl implements RecordNatureElement {
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
	 * The cached value of the '{@link #getNature() <em>Nature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
	protected NatureReference nature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordNatureElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NaturePackage.Literals.RECORD_NATURE_ELEMENT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NaturePackage.RECORD_NATURE_ELEMENT__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NaturePackage.RECORD_NATURE_ELEMENT__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NaturePackage.RECORD_NATURE_ELEMENT__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NaturePackage.RECORD_NATURE_ELEMENT__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NatureReference getNature() {
		return nature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNature(NatureReference newNature, NotificationChain msgs) {
		NatureReference oldNature = nature;
		nature = newNature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NaturePackage.RECORD_NATURE_ELEMENT__NATURE, oldNature, newNature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNature(NatureReference newNature) {
		if (newNature != nature) {
			NotificationChain msgs = null;
			if (nature != null)
				msgs = ((InternalEObject)nature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NaturePackage.RECORD_NATURE_ELEMENT__NATURE, null, msgs);
			if (newNature != null)
				msgs = ((InternalEObject)newNature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NaturePackage.RECORD_NATURE_ELEMENT__NATURE, null, msgs);
			msgs = basicSetNature(newNature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NaturePackage.RECORD_NATURE_ELEMENT__NATURE, newNature, newNature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NaturePackage.RECORD_NATURE_ELEMENT__NAME:
				return basicSetName(null, msgs);
			case NaturePackage.RECORD_NATURE_ELEMENT__NATURE:
				return basicSetNature(null, msgs);
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
			case NaturePackage.RECORD_NATURE_ELEMENT__NAME:
				return getName();
			case NaturePackage.RECORD_NATURE_ELEMENT__NATURE:
				return getNature();
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
			case NaturePackage.RECORD_NATURE_ELEMENT__NAME:
				setName((MultiName)newValue);
				return;
			case NaturePackage.RECORD_NATURE_ELEMENT__NATURE:
				setNature((NatureReference)newValue);
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
			case NaturePackage.RECORD_NATURE_ELEMENT__NAME:
				setName((MultiName)null);
				return;
			case NaturePackage.RECORD_NATURE_ELEMENT__NATURE:
				setNature((NatureReference)null);
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
			case NaturePackage.RECORD_NATURE_ELEMENT__NAME:
				return name != null;
			case NaturePackage.RECORD_NATURE_ELEMENT__NATURE:
				return nature != null;
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
				case NaturePackage.RECORD_NATURE_ELEMENT__NAME: return VhdlPackage.MULTI_NAMED__NAME;
				default: return -1;
			}
		}
		if (baseClass == Natured.class) {
			switch (derivedFeatureID) {
				case NaturePackage.RECORD_NATURE_ELEMENT__NATURE: return NaturePackage.NATURED__NATURE;
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
				case VhdlPackage.MULTI_NAMED__NAME: return NaturePackage.RECORD_NATURE_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == Natured.class) {
			switch (baseFeatureID) {
				case NaturePackage.NATURED__NATURE: return NaturePackage.RECORD_NATURE_ELEMENT__NATURE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //RecordNatureElementImpl
