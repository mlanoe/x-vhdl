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

import net.mlanoe.language.vhdl.MultiName;
import net.mlanoe.language.vhdl.Named;
import net.mlanoe.language.vhdl.expression.Expression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.AttributeSpecification#getEntity <em>Entity</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.AttributeSpecification#getClass_ <em>Class</em>}</li>
 *   <li>{@link net.mlanoe.language.vhdl.declaration.AttributeSpecification#getIs <em>Is</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getAttributeSpecification()
 * @model
 * @generated
 */
public interface AttributeSpecification extends Declaration, Named {
	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference.
	 * @see #setEntity(MultiName)
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getAttributeSpecification_Entity()
	 * @model containment="true"
	 * @generated
	 */
	MultiName getEntity();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.declaration.AttributeSpecification#getEntity <em>Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' containment reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(MultiName value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * The literals are from the enumeration {@link net.mlanoe.language.vhdl.declaration.EntityClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see net.mlanoe.language.vhdl.declaration.EntityClass
	 * @see #setClass(EntityClass)
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getAttributeSpecification_Class()
	 * @model
	 * @generated
	 */
	EntityClass getClass_();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.declaration.AttributeSpecification#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see net.mlanoe.language.vhdl.declaration.EntityClass
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(EntityClass value);

	/**
	 * Returns the value of the '<em><b>Is</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is</em>' containment reference.
	 * @see #setIs(Expression)
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#getAttributeSpecification_Is()
	 * @model containment="true"
	 * @generated
	 */
	Expression getIs();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.declaration.AttributeSpecification#getIs <em>Is</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is</em>' containment reference.
	 * @see #getIs()
	 * @generated
	 */
	void setIs(Expression value);

} // AttributeSpecification
