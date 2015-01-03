/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.mlanoe.language.vhdl.VhdlPackage
 * @generated
 */
public interface VhdlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VhdlFactory eINSTANCE = net.mlanoe.language.vhdl.impl.VhdlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Architecture</em>'.
	 * @generated
	 */
	Architecture createArchitecture();

	/**
	 * Returns a new object of class '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component</em>'.
	 * @generated
	 */
	Component createComponent();

	/**
	 * Returns a new object of class '<em>Design Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Design Unit</em>'.
	 * @generated
	 */
	DesignUnit createDesignUnit();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	Entity createEntity();

	/**
	 * Returns a new object of class '<em>Generic Maps</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Maps</em>'.
	 * @generated
	 */
	GenericMaps createGenericMaps();

	/**
	 * Returns a new object of class '<em>Generics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generics</em>'.
	 * @generated
	 */
	Generics createGenerics();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package</em>'.
	 * @generated
	 */
	Package createPackage();

	/**
	 * Returns a new object of class '<em>Package Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Body</em>'.
	 * @generated
	 */
	PackageBody createPackageBody();

	/**
	 * Returns a new object of class '<em>Ports</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ports</em>'.
	 * @generated
	 */
	Ports createPorts();

	/**
	 * Returns a new object of class '<em>Port Maps</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Maps</em>'.
	 * @generated
	 */
	PortMaps createPortMaps();

	/**
	 * Returns a new object of class '<em>Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signature</em>'.
	 * @generated
	 */
	Signature createSignature();

	/**
	 * Returns a new object of class '<em>Multi Named</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Named</em>'.
	 * @generated
	 */
	MultiNamed createMultiNamed();

	/**
	 * Returns a new object of class '<em>Name List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Name List</em>'.
	 * @generated
	 */
	NameList createNameList();

	/**
	 * Returns a new object of class '<em>Entity Resolved Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Resolved Reference</em>'.
	 * @generated
	 */
	EntityResolvedReference createEntityResolvedReference();

	/**
	 * Returns a new object of class '<em>Package Resolved Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Resolved Reference</em>'.
	 * @generated
	 */
	PackageResolvedReference createPackageResolvedReference();

	/**
	 * Returns a new object of class '<em>Component Resolved Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Resolved Reference</em>'.
	 * @generated
	 */
	ComponentResolvedReference createComponentResolvedReference();

	/**
	 * Returns a new object of class '<em>Call Resolved Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Resolved Reference</em>'.
	 * @generated
	 */
	CallResolvedReference createCallResolvedReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VhdlPackage getVhdlPackage();

} //VhdlFactory
