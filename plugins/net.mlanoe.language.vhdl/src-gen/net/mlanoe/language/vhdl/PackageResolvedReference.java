/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Resolved Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mlanoe.language.vhdl.PackageResolvedReference#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mlanoe.language.vhdl.VhdlPackage#getPackageResolvedReference()
 * @model
 * @generated
 */
public interface PackageResolvedReference extends VhdlObject, PackageReference {
	/**
	 * Returns the value of the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' reference.
	 * @see #setPackage(net.mlanoe.language.vhdl.Package)
	 * @see net.mlanoe.language.vhdl.VhdlPackage#getPackageResolvedReference_Package()
	 * @model
	 * @generated
	 */
	net.mlanoe.language.vhdl.Package getPackage();

	/**
	 * Sets the value of the '{@link net.mlanoe.language.vhdl.PackageResolvedReference#getPackage <em>Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(net.mlanoe.language.vhdl.Package value);

} // PackageResolvedReference
