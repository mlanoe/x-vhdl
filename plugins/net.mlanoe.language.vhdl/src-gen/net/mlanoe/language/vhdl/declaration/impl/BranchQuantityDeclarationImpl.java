/**
 * Copyright (c) 2014 mlanoe
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.declaration.impl;

import net.mlanoe.language.vhdl.Name;
import net.mlanoe.language.vhdl.ams.QuantityAspect;
import net.mlanoe.language.vhdl.declaration.BranchQuantityDeclaration;
import net.mlanoe.language.vhdl.declaration.DeclarationPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branch Quantity Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.impl.BranchQuantityDeclarationImpl#getAcross <em>Across</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.impl.BranchQuantityDeclarationImpl#getThrough <em>Through</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.impl.BranchQuantityDeclarationImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.impl.BranchQuantityDeclarationImpl#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BranchQuantityDeclarationImpl extends QuantityDeclarationImpl implements BranchQuantityDeclaration {
	/**
	 * The cached value of the '{@link #getAcross() <em>Across</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcross()
	 * @generated
	 * @ordered
	 */
	protected QuantityAspect across;

	/**
	 * The cached value of the '{@link #getThrough() <em>Through</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrough()
	 * @generated
	 * @ordered
	 */
	protected QuantityAspect through;

	/**
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected Name left;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected Name right;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchQuantityDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeclarationPackage.Literals.BRANCH_QUANTITY_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityAspect getAcross() {
		return across;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAcross(QuantityAspect newAcross, NotificationChain msgs) {
		QuantityAspect oldAcross = across;
		across = newAcross;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationPackage.BRANCH_QUANTITY_DECLARATION__ACROSS, oldAcross, newAcross);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcross(QuantityAspect newAcross) {
		if (newAcross != across) {
			NotificationChain msgs = null;
			if (across != null)
				msgs = ((InternalEObject)across).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.BRANCH_QUANTITY_DECLARATION__ACROSS, null, msgs);
			if (newAcross != null)
				msgs = ((InternalEObject)newAcross).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.BRANCH_QUANTITY_DECLARATION__ACROSS, null, msgs);
			msgs = basicSetAcross(newAcross, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.BRANCH_QUANTITY_DECLARATION__ACROSS, newAcross, newAcross));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuantityAspect getThrough() {
		return through;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThrough(QuantityAspect newThrough, NotificationChain msgs) {
		QuantityAspect oldThrough = through;
		through = newThrough;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationPackage.BRANCH_QUANTITY_DECLARATION__THROUGH, oldThrough, newThrough);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThrough(QuantityAspect newThrough) {
		if (newThrough != through) {
			NotificationChain msgs = null;
			if (through != null)
				msgs = ((InternalEObject)through).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.BRANCH_QUANTITY_DECLARATION__THROUGH, null, msgs);
			if (newThrough != null)
				msgs = ((InternalEObject)newThrough).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.BRANCH_QUANTITY_DECLARATION__THROUGH, null, msgs);
			msgs = basicSetThrough(newThrough, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.BRANCH_QUANTITY_DECLARATION__THROUGH, newThrough, newThrough));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name getLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeft(Name newLeft, NotificationChain msgs) {
		Name oldLeft = left;
		left = newLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationPackage.BRANCH_QUANTITY_DECLARATION__LEFT, oldLeft, newLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(Name newLeft) {
		if (newLeft != left) {
			NotificationChain msgs = null;
			if (left != null)
				msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.BRANCH_QUANTITY_DECLARATION__LEFT, null, msgs);
			if (newLeft != null)
				msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.BRANCH_QUANTITY_DECLARATION__LEFT, null, msgs);
			msgs = basicSetLeft(newLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.BRANCH_QUANTITY_DECLARATION__LEFT, newLeft, newLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Name getRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRight(Name newRight, NotificationChain msgs) {
		Name oldRight = right;
		right = newRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeclarationPackage.BRANCH_QUANTITY_DECLARATION__RIGHT, oldRight, newRight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(Name newRight) {
		if (newRight != right) {
			NotificationChain msgs = null;
			if (right != null)
				msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.BRANCH_QUANTITY_DECLARATION__RIGHT, null, msgs);
			if (newRight != null)
				msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeclarationPackage.BRANCH_QUANTITY_DECLARATION__RIGHT, null, msgs);
			msgs = basicSetRight(newRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DeclarationPackage.BRANCH_QUANTITY_DECLARATION__RIGHT, newRight, newRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DeclarationPackage.BRANCH_QUANTITY_DECLARATION__ACROSS:
				return basicSetAcross(null, msgs);
			case DeclarationPackage.BRANCH_QUANTITY_DECLARATION__THROUGH:
				return basicSetThrough(null, msgs);
			case DeclarationPackage.BRANCH_QUANTITY_DECLARATION__LEFT:
				return basicSetLeft(null, msgs);
			case DeclarationPackage.BRANCH_QUANTITY_DECLARATION__RIGHT:
				return basicSetRight(null, msgs);
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
			case DeclarationPackage.BRANCH_QUANTITY_DECLARATION__ACROSS:
				return getAcross();
			case DeclarationPackage.BRANCH_QUANTITY_DECLARATION__THROUGH:
				return getThrough();
			case DeclarationPackage.BRANCH_QUANTITY_DECLARATION__LEFT:
				return getLeft();
			case DeclarationPackage.BRANCH_QUANTITY_DECLARATION__RIGHT:
				return getRight();
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
			case DeclarationPackage.BRANCH_QUANTITY_DECLARATION__ACROSS:
				setAcross((QuantityAspect)newValue);
				return;
			case DeclarationPackage.BRANCH_QUANTITY_DECLARATION__THROUGH:
				setThrough((QuantityAspect)newValue);
				return;
			case DeclarationPackage.BRANCH_QUANTITY_DECLARATION__LEFT:
				setLeft((Name)newValue);
				return;
			case DeclarationPackage.BRANCH_QUANTITY_DECLARATION__RIGHT:
				setRight((Name)newValue);
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
			case DeclarationPackage.BRANCH_QUANTITY_DECLARATION__ACROSS:
				setAcross((QuantityAspect)null);
				return;
			case DeclarationPackage.BRANCH_QUANTITY_DECLARATION__THROUGH:
				setThrough((QuantityAspect)null);
				return;
			case DeclarationPackage.BRANCH_QUANTITY_DECLARATION__LEFT:
				setLeft((Name)null);
				return;
			case DeclarationPackage.BRANCH_QUANTITY_DECLARATION__RIGHT:
				setRight((Name)null);
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
			case DeclarationPackage.BRANCH_QUANTITY_DECLARATION__ACROSS:
				return across != null;
			case DeclarationPackage.BRANCH_QUANTITY_DECLARATION__THROUGH:
				return through != null;
			case DeclarationPackage.BRANCH_QUANTITY_DECLARATION__LEFT:
				return left != null;
			case DeclarationPackage.BRANCH_QUANTITY_DECLARATION__RIGHT:
				return right != null;
		}
		return super.eIsSet(featureID);
	}

} //BranchQuantityDeclarationImpl
