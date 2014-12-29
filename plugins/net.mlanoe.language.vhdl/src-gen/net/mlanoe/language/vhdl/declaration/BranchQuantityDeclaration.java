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
package net.mlanoe.language.vhdl.declaration;

import net.mlanoe.language.vhdl.Name;
import net.mlanoe.language.vhdl.ams.QuantityAspect;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Branch Quantity Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.BranchQuantityDeclaration#getAcross <em>Across</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.BranchQuantityDeclaration#getThrough <em>Through</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.BranchQuantityDeclaration#getLeft <em>Left</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.BranchQuantityDeclaration#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getBranchQuantityDeclaration()
 * @model
 * @generated
 */
public interface BranchQuantityDeclaration extends QuantityDeclaration {
	/**
	 * Returns the value of the '<em><b>Across</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Across</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Across</em>' containment reference.
	 * @see #setAcross(QuantityAspect)
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getBranchQuantityDeclaration_Across()
	 * @model containment="true"
	 * @generated
	 */
	QuantityAspect getAcross();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.declaration.BranchQuantityDeclaration#getAcross <em>Across</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Across</em>' containment reference.
	 * @see #getAcross()
	 * @generated
	 */
	void setAcross(QuantityAspect value);

	/**
	 * Returns the value of the '<em><b>Through</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Through</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Through</em>' containment reference.
	 * @see #setThrough(QuantityAspect)
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getBranchQuantityDeclaration_Through()
	 * @model containment="true"
	 * @generated
	 */
	QuantityAspect getThrough();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.declaration.BranchQuantityDeclaration#getThrough <em>Through</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Through</em>' containment reference.
	 * @see #getThrough()
	 * @generated
	 */
	void setThrough(QuantityAspect value);

	/**
	 * Returns the value of the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' containment reference.
	 * @see #setLeft(Name)
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getBranchQuantityDeclaration_Left()
	 * @model containment="true"
	 * @generated
	 */
	Name getLeft();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.declaration.BranchQuantityDeclaration#getLeft <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' containment reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Name value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' containment reference.
	 * @see #setRight(Name)
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getBranchQuantityDeclaration_Right()
	 * @model containment="true"
	 * @generated
	 */
	Name getRight();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.declaration.BranchQuantityDeclaration#getRight <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' containment reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Name value);

} // BranchQuantityDeclaration
