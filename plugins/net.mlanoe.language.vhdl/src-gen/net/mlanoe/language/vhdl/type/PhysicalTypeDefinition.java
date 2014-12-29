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
package net.mlanoe.language.vhdl.type;

import net.mlanoe.language.vhdl.expression.Expression;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.type.PhysicalTypeDefinition#getRange <em>Range</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.type.PhysicalTypeDefinition#getPrimary <em>Primary</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.type.PhysicalTypeDefinition#getSecondary <em>Secondary</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.type.TypePackage#getPhysicalTypeDefinition()
 * @model
 * @generated
 */
public interface PhysicalTypeDefinition extends TypeDefinition {
	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(Expression)
	 * @see net.mlanoe.language.vhdl.type.TypePackage#getPhysicalTypeDefinition_Range()
	 * @model containment="true"
	 * @generated
	 */
	Expression getRange();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.type.PhysicalTypeDefinition#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(Expression value);

	/**
	 * Returns the value of the '<em><b>Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary</em>' attribute.
	 * @see #setPrimary(String)
	 * @see net.mlanoe.language.vhdl.type.TypePackage#getPhysicalTypeDefinition_Primary()
	 * @model
	 * @generated
	 */
	String getPrimary();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.type.PhysicalTypeDefinition#getPrimary <em>Primary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary</em>' attribute.
	 * @see #getPrimary()
	 * @generated
	 */
	void setPrimary(String value);

	/**
	 * Returns the value of the '<em><b>Secondary</b></em>' containment reference list.
	 * The list contents are of type {@link net.mlanoe.language.vhdl.type.PhysicalTypeDefinitionSecondary}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secondary</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondary</em>' containment reference list.
	 * @see net.mlanoe.language.vhdl.type.TypePackage#getPhysicalTypeDefinition_Secondary()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhysicalTypeDefinitionSecondary> getSecondary();

} // PhysicalTypeDefinition
