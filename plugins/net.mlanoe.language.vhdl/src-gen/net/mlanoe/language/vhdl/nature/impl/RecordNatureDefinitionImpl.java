/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.nature.impl;

import java.util.Collection;

import net.mlanoe.language.vhdl.nature.NaturePackage;
import net.mlanoe.language.vhdl.nature.RecordNatureDefinition;
import net.mlanoe.language.vhdl.nature.RecordNatureElement;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Record Nature Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.nature.impl.RecordNatureDefinitionImpl#getRecord <em>Record</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecordNatureDefinitionImpl extends CompositeNatureDefinitionImpl implements RecordNatureDefinition {
	/**
	 * The cached value of the '{@link #getRecord() <em>Record</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecord()
	 * @generated
	 * @ordered
	 */
	protected EList<RecordNatureElement> record;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RecordNatureDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NaturePackage.Literals.RECORD_NATURE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RecordNatureElement> getRecord() {
		if (record == null) {
			record = new EObjectContainmentEList<RecordNatureElement>(RecordNatureElement.class, this, NaturePackage.RECORD_NATURE_DEFINITION__RECORD);
		}
		return record;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case NaturePackage.RECORD_NATURE_DEFINITION__RECORD:
				return ((InternalEList<?>)getRecord()).basicRemove(otherEnd, msgs);
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
			case NaturePackage.RECORD_NATURE_DEFINITION__RECORD:
				return getRecord();
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
			case NaturePackage.RECORD_NATURE_DEFINITION__RECORD:
				getRecord().clear();
				getRecord().addAll((Collection<? extends RecordNatureElement>)newValue);
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
			case NaturePackage.RECORD_NATURE_DEFINITION__RECORD:
				getRecord().clear();
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
			case NaturePackage.RECORD_NATURE_DEFINITION__RECORD:
				return record != null && !record.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RecordNatureDefinitionImpl
