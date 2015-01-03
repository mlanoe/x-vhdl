/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.type.EnumerationTypeDefinition#getLiteral <em>Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.type.TypePackage#getEnumerationTypeDefinition()
 * @model
 * @generated
 */
public interface EnumerationTypeDefinition extends TypeDefinition {
	/**
	 * Returns the value of the '<em><b>Literal</b></em>' containment reference list.
	 * The list contents are of type {@link net.mlanoe.language.vhdl.type.EnumerationLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Literal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal</em>' containment reference list.
	 * @see net.mlanoe.language.vhdl.type.TypePackage#getEnumerationTypeDefinition_Literal()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumerationLiteral> getLiteral();

} // EnumerationTypeDefinition
