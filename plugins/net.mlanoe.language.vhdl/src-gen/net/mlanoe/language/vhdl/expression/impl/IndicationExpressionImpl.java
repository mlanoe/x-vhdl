/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.expression.impl;

import net.mlanoe.language.vhdl.expression.Expression;
import net.mlanoe.language.vhdl.expression.ExpressionPackage;
import net.mlanoe.language.vhdl.expression.IndicationExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Indication Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.expression.impl.IndicationExpressionImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.expression.impl.IndicationExpressionImpl#getTolerance <em>Tolerance</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.expression.impl.IndicationExpressionImpl#getAcross <em>Across</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class IndicationExpressionImpl extends ExpressionImpl implements IndicationExpression {
	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected Expression constraint;

	/**
	 * The cached value of the '{@link #getTolerance() <em>Tolerance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTolerance()
	 * @generated
	 * @ordered
	 */
	protected Expression tolerance;

	/**
	 * The cached value of the '{@link #getAcross() <em>Across</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcross()
	 * @generated
	 * @ordered
	 */
	protected Expression across;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndicationExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExpressionPackage.Literals.INDICATION_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getConstraint() {
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraint(Expression newConstraint, NotificationChain msgs) {
		Expression oldConstraint = constraint;
		constraint = newConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.INDICATION_EXPRESSION__CONSTRAINT, oldConstraint, newConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(Expression newConstraint) {
		if (newConstraint != constraint) {
			NotificationChain msgs = null;
			if (constraint != null)
				msgs = ((InternalEObject)constraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.INDICATION_EXPRESSION__CONSTRAINT, null, msgs);
			if (newConstraint != null)
				msgs = ((InternalEObject)newConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.INDICATION_EXPRESSION__CONSTRAINT, null, msgs);
			msgs = basicSetConstraint(newConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.INDICATION_EXPRESSION__CONSTRAINT, newConstraint, newConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getTolerance() {
		return tolerance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTolerance(Expression newTolerance, NotificationChain msgs) {
		Expression oldTolerance = tolerance;
		tolerance = newTolerance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.INDICATION_EXPRESSION__TOLERANCE, oldTolerance, newTolerance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTolerance(Expression newTolerance) {
		if (newTolerance != tolerance) {
			NotificationChain msgs = null;
			if (tolerance != null)
				msgs = ((InternalEObject)tolerance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.INDICATION_EXPRESSION__TOLERANCE, null, msgs);
			if (newTolerance != null)
				msgs = ((InternalEObject)newTolerance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.INDICATION_EXPRESSION__TOLERANCE, null, msgs);
			msgs = basicSetTolerance(newTolerance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.INDICATION_EXPRESSION__TOLERANCE, newTolerance, newTolerance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getAcross() {
		return across;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAcross(Expression newAcross, NotificationChain msgs) {
		Expression oldAcross = across;
		across = newAcross;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.INDICATION_EXPRESSION__ACROSS, oldAcross, newAcross);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcross(Expression newAcross) {
		if (newAcross != across) {
			NotificationChain msgs = null;
			if (across != null)
				msgs = ((InternalEObject)across).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.INDICATION_EXPRESSION__ACROSS, null, msgs);
			if (newAcross != null)
				msgs = ((InternalEObject)newAcross).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.INDICATION_EXPRESSION__ACROSS, null, msgs);
			msgs = basicSetAcross(newAcross, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.INDICATION_EXPRESSION__ACROSS, newAcross, newAcross));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExpressionPackage.INDICATION_EXPRESSION__CONSTRAINT:
				return basicSetConstraint(null, msgs);
			case ExpressionPackage.INDICATION_EXPRESSION__TOLERANCE:
				return basicSetTolerance(null, msgs);
			case ExpressionPackage.INDICATION_EXPRESSION__ACROSS:
				return basicSetAcross(null, msgs);
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
			case ExpressionPackage.INDICATION_EXPRESSION__CONSTRAINT:
				return getConstraint();
			case ExpressionPackage.INDICATION_EXPRESSION__TOLERANCE:
				return getTolerance();
			case ExpressionPackage.INDICATION_EXPRESSION__ACROSS:
				return getAcross();
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
			case ExpressionPackage.INDICATION_EXPRESSION__CONSTRAINT:
				setConstraint((Expression)newValue);
				return;
			case ExpressionPackage.INDICATION_EXPRESSION__TOLERANCE:
				setTolerance((Expression)newValue);
				return;
			case ExpressionPackage.INDICATION_EXPRESSION__ACROSS:
				setAcross((Expression)newValue);
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
			case ExpressionPackage.INDICATION_EXPRESSION__CONSTRAINT:
				setConstraint((Expression)null);
				return;
			case ExpressionPackage.INDICATION_EXPRESSION__TOLERANCE:
				setTolerance((Expression)null);
				return;
			case ExpressionPackage.INDICATION_EXPRESSION__ACROSS:
				setAcross((Expression)null);
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
			case ExpressionPackage.INDICATION_EXPRESSION__CONSTRAINT:
				return constraint != null;
			case ExpressionPackage.INDICATION_EXPRESSION__TOLERANCE:
				return tolerance != null;
			case ExpressionPackage.INDICATION_EXPRESSION__ACROSS:
				return across != null;
		}
		return super.eIsSet(featureID);
	}

} //IndicationExpressionImpl
