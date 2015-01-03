/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.nature;

import net.mlanoe.language.vhdl.type.TypeReference;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unconstrained Array Nature Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.nature.UnconstrainedArrayNatureDefinition#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.nature.NaturePackage#getUnconstrainedArrayNatureDefinition()
 * @model
 * @generated
 */
public interface UnconstrainedArrayNatureDefinition extends ArrayNatureDefinition {
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
	 * @see net.mlanoe.language.vhdl.nature.NaturePackage#getUnconstrainedArrayNatureDefinition_Index()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeReference> getIndex();

} // UnconstrainedArrayNatureDefinition
