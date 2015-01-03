/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.type;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.mlanoe.language.vhdl.type.TypePackage
 * @generated
 */
public interface TypeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypeFactory eINSTANCE = net.mlanoe.language.vhdl.type.impl.TypeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Access Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Access Type Definition</em>'.
	 * @generated
	 */
	AccessTypeDefinition createAccessTypeDefinition();

	/**
	 * Returns a new object of class '<em>Record Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Record Type Definition</em>'.
	 * @generated
	 */
	RecordTypeDefinition createRecordTypeDefinition();

	/**
	 * Returns a new object of class '<em>Array Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Type Definition</em>'.
	 * @generated
	 */
	ArrayTypeDefinition createArrayTypeDefinition();

	/**
	 * Returns a new object of class '<em>Constrained Array Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constrained Array Type Definition</em>'.
	 * @generated
	 */
	ConstrainedArrayTypeDefinition createConstrainedArrayTypeDefinition();

	/**
	 * Returns a new object of class '<em>Unconstrained Array Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unconstrained Array Type Definition</em>'.
	 * @generated
	 */
	UnconstrainedArrayTypeDefinition createUnconstrainedArrayTypeDefinition();

	/**
	 * Returns a new object of class '<em>Enumeration Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enumeration Type Definition</em>'.
	 * @generated
	 */
	EnumerationTypeDefinition createEnumerationTypeDefinition();

	/**
	 * Returns a new object of class '<em>File Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Type Definition</em>'.
	 * @generated
	 */
	FileTypeDefinition createFileTypeDefinition();

	/**
	 * Returns a new object of class '<em>Physical Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Type Definition</em>'.
	 * @generated
	 */
	PhysicalTypeDefinition createPhysicalTypeDefinition();

	/**
	 * Returns a new object of class '<em>Physical Type Definition Secondary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Type Definition Secondary</em>'.
	 * @generated
	 */
	PhysicalTypeDefinitionSecondary createPhysicalTypeDefinitionSecondary();

	/**
	 * Returns a new object of class '<em>Range Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Range Type Definition</em>'.
	 * @generated
	 */
	RangeTypeDefinition createRangeTypeDefinition();

	/**
	 * Returns a new object of class '<em>Record Type Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Record Type Element</em>'.
	 * @generated
	 */
	RecordTypeElement createRecordTypeElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TypePackage getTypePackage();

} //TypeFactory
