/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl;

import net.mlanoe.language.vhdl.expression.Expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Maps</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.GenericMaps#getGeneric <em>Generic</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.VhdlPackage#getGenericMaps()
 * @model
 * @generated
 */
public interface GenericMaps extends VhdlObject {
	/**
	 * Returns the value of the '<em><b>Generic</b></em>' containment reference list.
	 * The list contents are of type {@link net.mlanoe.language.vhdl.expression.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic</em>' containment reference list.
	 * @see net.mlanoe.language.vhdl.VhdlPackage#getGenericMaps_Generic()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getGeneric();

} // GenericMaps
