/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.nature.impl;

import net.mlanoe.language.vhdl.Name;

import net.mlanoe.language.vhdl.nature.NaturePackage;
import net.mlanoe.language.vhdl.nature.ScalarNatureDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scalar Nature Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.nature.impl.ScalarNatureDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.nature.impl.ScalarNatureDefinitionImpl#getAcross <em>Across</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.nature.impl.ScalarNatureDefinitionImpl#getThrough <em>Through</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScalarNatureDefinitionImpl extends NatureDefinitionImpl implements ScalarNatureDefinition {
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
	 * The cached value of the '{@link #getAcross() <em>Across</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcross()
	 * @generated
	 * @ordered
	 */
	protected Name across;

	/**
	 * The cached value of the '{@link #getThrough() <em>Through</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrough()
	 * @generated
	 * @ordered
	 */
	protected Name through;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScalarNatureDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NaturePackage.Literals.SCALAR_NATURE_DEFINITION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NaturePackage.SCALAR_NATURE_DEFINITION__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NaturePackage.SCALAR_NATURE_DEFINITION__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NaturePackage.SCALAR_NATURE_DEFINITION__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NaturePackage.SCALAR_NATURE_DEFINITION__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name getAcross() {
		return across;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAcross(Name newAcross, NotificationChain msgs) {
		Name oldAcross = across;
		across = newAcross;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NaturePackage.SCALAR_NATURE_DEFINITION__ACROSS, oldAcross, newAcross);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcross(Name newAcross) {
		if (newAcross != across) {
			NotificationChain msgs = null;
			if (across != null)
				msgs = ((InternalEObject)across).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NaturePackage.SCALAR_NATURE_DEFINITION__ACROSS, null, msgs);
			if (newAcross != null)
				msgs = ((InternalEObject)newAcross).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NaturePackage.SCALAR_NATURE_DEFINITION__ACROSS, null, msgs);
			msgs = basicSetAcross(newAcross, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NaturePackage.SCALAR_NATURE_DEFINITION__ACROSS, newAcross, newAcross));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name getThrough() {
		return through;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThrough(Name newThrough, NotificationChain msgs) {
		Name oldThrough = through;
		through = newThrough;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NaturePackage.SCALAR_NATURE_DEFINITION__THROUGH, oldThrough, newThrough);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThrough(Name newThrough) {
		if (newThrough != through) {
			NotificationChain msgs = null;
			if (through != null)
				msgs = ((InternalEObject)through).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NaturePackage.SCALAR_NATURE_DEFINITION__THROUGH, null, msgs);
			if (newThrough != null)
				msgs = ((InternalEObject)newThrough).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NaturePackage.SCALAR_NATURE_DEFINITION__THROUGH, null, msgs);
			msgs = basicSetThrough(newThrough, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NaturePackage.SCALAR_NATURE_DEFINITION__THROUGH, newThrough, newThrough));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NaturePackage.SCALAR_NATURE_DEFINITION__NAME:
				return basicSetName(null, msgs);
			case NaturePackage.SCALAR_NATURE_DEFINITION__ACROSS:
				return basicSetAcross(null, msgs);
			case NaturePackage.SCALAR_NATURE_DEFINITION__THROUGH:
				return basicSetThrough(null, msgs);
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
			case NaturePackage.SCALAR_NATURE_DEFINITION__NAME:
				return getName();
			case NaturePackage.SCALAR_NATURE_DEFINITION__ACROSS:
				return getAcross();
			case NaturePackage.SCALAR_NATURE_DEFINITION__THROUGH:
				return getThrough();
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
			case NaturePackage.SCALAR_NATURE_DEFINITION__NAME:
				setName((Name)newValue);
				return;
			case NaturePackage.SCALAR_NATURE_DEFINITION__ACROSS:
				setAcross((Name)newValue);
				return;
			case NaturePackage.SCALAR_NATURE_DEFINITION__THROUGH:
				setThrough((Name)newValue);
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
			case NaturePackage.SCALAR_NATURE_DEFINITION__NAME:
				setName((Name)null);
				return;
			case NaturePackage.SCALAR_NATURE_DEFINITION__ACROSS:
				setAcross((Name)null);
				return;
			case NaturePackage.SCALAR_NATURE_DEFINITION__THROUGH:
				setThrough((Name)null);
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
			case NaturePackage.SCALAR_NATURE_DEFINITION__NAME:
				return name != null;
			case NaturePackage.SCALAR_NATURE_DEFINITION__ACROSS:
				return across != null;
			case NaturePackage.SCALAR_NATURE_DEFINITION__THROUGH:
				return through != null;
		}
		return super.eIsSet(featureID);
	}

} //ScalarNatureDefinitionImpl
