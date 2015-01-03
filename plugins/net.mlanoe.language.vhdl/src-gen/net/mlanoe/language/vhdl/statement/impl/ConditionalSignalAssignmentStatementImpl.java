/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.statement.impl;

import java.util.Collection;

import net.mlanoe.language.vhdl.statement.ConditionalSignalAssignmentStatement;
import net.mlanoe.language.vhdl.statement.ConditionalWaveform;
import net.mlanoe.language.vhdl.statement.StatementPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Signal Assignment Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.ConditionalSignalAssignmentStatementImpl#getWaveform <em>Waveform</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalSignalAssignmentStatementImpl extends SignalAssignmentStatementImpl implements ConditionalSignalAssignmentStatement {
	/**
	 * The cached value of the '{@link #getWaveform() <em>Waveform</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWaveform()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionalWaveform> waveform;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalSignalAssignmentStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementPackage.Literals.CONDITIONAL_SIGNAL_ASSIGNMENT_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionalWaveform> getWaveform() {
		if (waveform == null) {
			waveform = new EObjectContainmentEList<ConditionalWaveform>(ConditionalWaveform.class, this, StatementPackage.CONDITIONAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM);
		}
		return waveform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementPackage.CONDITIONAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM:
				return ((InternalEList<?>)getWaveform()).basicRemove(otherEnd, msgs);
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
			case StatementPackage.CONDITIONAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM:
				return getWaveform();
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
			case StatementPackage.CONDITIONAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM:
				getWaveform().clear();
				getWaveform().addAll((Collection<? extends ConditionalWaveform>)newValue);
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
			case StatementPackage.CONDITIONAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM:
				getWaveform().clear();
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
			case StatementPackage.CONDITIONAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM:
				return waveform != null && !waveform.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConditionalSignalAssignmentStatementImpl
