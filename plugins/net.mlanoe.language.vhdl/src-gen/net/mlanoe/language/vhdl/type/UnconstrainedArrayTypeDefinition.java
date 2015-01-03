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
 * A representation of the model object '<em><b>Unconstrained Array Type Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.type.UnconstrainedArrayTypeDefinition#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.type.TypePackage#getUnconstrainedArrayTypeDefinition()
 * @model
 * @generated
 */
public interface UnconstrainedArrayTypeDefinition extends ArrayTypeDefinition {
	/**
	 * Returns the value of the '<em><b>Index</b></em>' containment reference list.
	 * The list contents are of type {@link net.mlanoe.language.vhdl.type.TypeReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' containment reference list.
	 * @see net.mlanoe.language.vhdl.type.TypePackage#getUnconstrainedArrayTypeDefinition_Index()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeReference> getIndex();

} // UnconstrainedArrayTypeDefinition
