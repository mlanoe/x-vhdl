/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.statement.impl;

import net.mlanoe.language.vhdl.expression.Expression;
import net.mlanoe.language.vhdl.statement.SequentialSignalAssignmentStatement;
import net.mlanoe.language.vhdl.statement.StatementPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Sequential Signal Assignment Statement</b></em>'. <!-- end-user-doc
 * -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link net.mlanoe.language.vhdl.statement.impl.SequentialSignalAssignmentStatementImpl#getWaveform
 * <em>Waveform</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequentialSignalAssignmentStatementImpl extends
		SignalAssignmentStatementImpl implements
		SequentialSignalAssignmentStatement {
	/**
	 * The cached value of the '{@link #getWaveform() <em>Waveform</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getWaveform()
	 * @generated
	 * @ordered
	 */
	protected Expression waveform;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SequentialSignalAssignmentStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementPackage.Literals.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getWaveform() {
		return waveform;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWaveform(Expression newWaveform,
			NotificationChain msgs) {
		Expression oldWaveform = waveform;
		waveform = newWaveform;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM, oldWaveform, newWaveform);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWaveform(Expression newWaveform) {
		if (newWaveform != waveform) {
			NotificationChain msgs = null;
			if (waveform != null)
				msgs = ((InternalEObject)waveform).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM, null, msgs);
			if (newWaveform != null)
				msgs = ((InternalEObject)newWaveform).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM, null, msgs);
			msgs = basicSetWaveform(newWaveform, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM, newWaveform, newWaveform));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementPackage.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM:
				return basicSetWaveform(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatementPackage.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM:
				return getWaveform();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatementPackage.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM:
				setWaveform((Expression)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StatementPackage.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM:
				setWaveform((Expression)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StatementPackage.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT__WAVEFORM:
				return waveform != null;
		}
		return super.eIsSet(featureID);
	}

} // SequentialSignalAssignmentStatementImpl
