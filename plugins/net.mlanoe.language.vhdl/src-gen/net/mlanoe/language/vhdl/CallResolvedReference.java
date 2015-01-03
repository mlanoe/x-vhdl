/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl;

import net.mlanoe.language.vhdl.declaration.SubprogramDeclaration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Resolved Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.CallResolvedReference#getCall <em>Call</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.VhdlPackage#getCallResolvedReference()
 * @model
 * @generated
 */
public interface CallResolvedReference extends CallReference {
	/**
	 * Returns the value of the '<em><b>Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call</em>' reference.
	 * @see #setCall(SubprogramDeclaration)
	 * @see net.mlanoe.language.vhdl.VhdlPackage#getCallResolvedReference_Call()
	 * @model
	 * @generated
	 */
	SubprogramDeclaration getCall();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.CallResolvedReference#getCall <em>Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call</em>' reference.
	 * @see #getCall()
	 * @generated
	 */
	void setCall(SubprogramDeclaration value);

} // CallResolvedReference
