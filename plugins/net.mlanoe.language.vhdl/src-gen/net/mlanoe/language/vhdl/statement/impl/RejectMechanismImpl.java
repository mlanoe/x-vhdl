/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.statement.impl;

import net.mlanoe.language.vhdl.expression.Expression;

import net.mlanoe.language.vhdl.statement.RejectMechanism;
import net.mlanoe.language.vhdl.statement.StatementPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reject Mechanism</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.statement.impl.RejectMechanismImpl#getReject <em>Reject</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RejectMechanismImpl extends DelayMechanismImpl implements RejectMechanism {
	/**
	 * The cached value of the '{@link #getReject() <em>Reject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReject()
	 * @generated
	 * @ordered
	 */
	protected Expression reject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RejectMechanismImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatementPackage.Literals.REJECT_MECHANISM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getReject() {
		return reject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReject(Expression newReject, NotificationChain msgs) {
		Expression oldReject = reject;
		reject = newReject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatementPackage.REJECT_MECHANISM__REJECT, oldReject, newReject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReject(Expression newReject) {
		if (newReject != reject) {
			NotificationChain msgs = null;
			if (reject != null)
				msgs = ((InternalEObject)reject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StatementPackage.REJECT_MECHANISM__REJECT, null, msgs);
			if (newReject != null)
				msgs = ((InternalEObject)newReject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - StatementPackage.REJECT_MECHANISM__REJECT, null, msgs);
			msgs = basicSetReject(newReject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatementPackage.REJECT_MECHANISM__REJECT, newReject, newReject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatementPackage.REJECT_MECHANISM__REJECT:
				return basicSetReject(null, msgs);
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
			case StatementPackage.REJECT_MECHANISM__REJECT:
				return getReject();
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
			case StatementPackage.REJECT_MECHANISM__REJECT:
				setReject((Expression)newValue);
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
			case StatementPackage.REJECT_MECHANISM__REJECT:
				setReject((Expression)null);
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
			case StatementPackage.REJECT_MECHANISM__REJECT:
				return reject != null;
		}
		return super.eIsSet(featureID);
	}

} //RejectMechanismImpl
