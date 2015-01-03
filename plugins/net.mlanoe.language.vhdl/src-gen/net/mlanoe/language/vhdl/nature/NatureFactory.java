/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.nature;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.mlanoe.language.vhdl.nature.NaturePackage
 * @generated
 */
public interface NatureFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NatureFactory eINSTANCE = net.mlanoe.language.vhdl.nature.impl.NatureFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Array Nature Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array Nature Definition</em>'.
	 * @generated
	 */
	ArrayNatureDefinition createArrayNatureDefinition();

	/**
	 * Returns a new object of class '<em>Composite Nature Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Nature Definition</em>'.
	 * @generated
	 */
	CompositeNatureDefinition createCompositeNatureDefinition();

	/**
	 * Returns a new object of class '<em>Constrained Array Nature Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constrained Array Nature Definition</em>'.
	 * @generated
	 */
	ConstrainedArrayNatureDefinition createConstrainedArrayNatureDefinition();

	/**
	 * Returns a new object of class '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definition</em>'.
	 * @generated
	 */
	NatureDefinition createNatureDefinition();

	/**
	 * Returns a new object of class '<em>Record Nature Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Record Nature Definition</em>'.
	 * @generated
	 */
	RecordNatureDefinition createRecordNatureDefinition();

	/**
	 * Returns a new object of class '<em>Record Nature Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Record Nature Element</em>'.
	 * @generated
	 */
	RecordNatureElement createRecordNatureElement();

	/**
	 * Returns a new object of class '<em>Scalar Nature Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scalar Nature Definition</em>'.
	 * @generated
	 */
	ScalarNatureDefinition createScalarNatureDefinition();

	/**
	 * Returns a new object of class '<em>Unconstrained Array Nature Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unconstrained Array Nature Definition</em>'.
	 * @generated
	 */
	UnconstrainedArrayNatureDefinition createUnconstrainedArrayNatureDefinition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NaturePackage getNaturePackage();

} //NatureFactory
