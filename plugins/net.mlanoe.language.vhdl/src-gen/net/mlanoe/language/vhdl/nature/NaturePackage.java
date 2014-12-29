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
package net.mlanoe.language.vhdl.nature;

import net.mlanoe.language.vhdl.VhdlPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.mlanoe.language.vhdl.nature.NatureFactory
 * @model kind="package"
 * @generated
 */
public interface NaturePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "nature";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mlanoe.net/language/vhdl/nature/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nature";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NaturePackage eINSTANCE = net.mlanoe.language.vhdl.nature.impl.NaturePackageImpl.init();

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.nature.impl.NatureDefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.nature.impl.NatureDefinitionImpl
	 * @see net.mlanoe.language.vhdl.nature.impl.NaturePackageImpl#getNatureDefinition()
	 * @generated
	 */
	int NATURE_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE_DEFINITION__ID = VhdlPackage.VHDL_OBJECT__ID;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE_DEFINITION_FEATURE_COUNT = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.nature.impl.CompositeNatureDefinitionImpl <em>Composite Nature Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.nature.impl.CompositeNatureDefinitionImpl
	 * @see net.mlanoe.language.vhdl.nature.impl.NaturePackageImpl#getCompositeNatureDefinition()
	 * @generated
	 */
	int COMPOSITE_NATURE_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NATURE_DEFINITION__ID = NATURE_DEFINITION__ID;

	/**
	 * The number of structural features of the '<em>Composite Nature Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_NATURE_DEFINITION_FEATURE_COUNT = NATURE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.nature.impl.ArrayNatureDefinitionImpl <em>Array Nature Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.nature.impl.ArrayNatureDefinitionImpl
	 * @see net.mlanoe.language.vhdl.nature.impl.NaturePackageImpl#getArrayNatureDefinition()
	 * @generated
	 */
	int ARRAY_NATURE_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_NATURE_DEFINITION__ID = COMPOSITE_NATURE_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_NATURE_DEFINITION__NATURE = COMPOSITE_NATURE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Nature Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_NATURE_DEFINITION_FEATURE_COUNT = COMPOSITE_NATURE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.nature.impl.ConstrainedArrayNatureDefinitionImpl <em>Constrained Array Nature Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.nature.impl.ConstrainedArrayNatureDefinitionImpl
	 * @see net.mlanoe.language.vhdl.nature.impl.NaturePackageImpl#getConstrainedArrayNatureDefinition()
	 * @generated
	 */
	int CONSTRAINED_ARRAY_NATURE_DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_ARRAY_NATURE_DEFINITION__ID = ARRAY_NATURE_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_ARRAY_NATURE_DEFINITION__NATURE = ARRAY_NATURE_DEFINITION__NATURE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_ARRAY_NATURE_DEFINITION__CONSTRAINT = ARRAY_NATURE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constrained Array Nature Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_ARRAY_NATURE_DEFINITION_FEATURE_COUNT = ARRAY_NATURE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.nature.impl.RecordNatureDefinitionImpl <em>Record Nature Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.nature.impl.RecordNatureDefinitionImpl
	 * @see net.mlanoe.language.vhdl.nature.impl.NaturePackageImpl#getRecordNatureDefinition()
	 * @generated
	 */
	int RECORD_NATURE_DEFINITION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_NATURE_DEFINITION__ID = COMPOSITE_NATURE_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Record</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_NATURE_DEFINITION__RECORD = COMPOSITE_NATURE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Record Nature Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_NATURE_DEFINITION_FEATURE_COUNT = COMPOSITE_NATURE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.nature.impl.RecordNatureElementImpl <em>Record Nature Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.nature.impl.RecordNatureElementImpl
	 * @see net.mlanoe.language.vhdl.nature.impl.NaturePackageImpl#getRecordNatureElement()
	 * @generated
	 */
	int RECORD_NATURE_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_NATURE_ELEMENT__ID = VhdlPackage.VHDL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_NATURE_ELEMENT__NAME = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_NATURE_ELEMENT__NATURE = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Record Nature Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_NATURE_ELEMENT_FEATURE_COUNT = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.nature.impl.ScalarNatureDefinitionImpl <em>Scalar Nature Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.nature.impl.ScalarNatureDefinitionImpl
	 * @see net.mlanoe.language.vhdl.nature.impl.NaturePackageImpl#getScalarNatureDefinition()
	 * @generated
	 */
	int SCALAR_NATURE_DEFINITION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_NATURE_DEFINITION__ID = NATURE_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_NATURE_DEFINITION__NAME = NATURE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Across</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_NATURE_DEFINITION__ACROSS = NATURE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Through</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_NATURE_DEFINITION__THROUGH = NATURE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Scalar Nature Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_NATURE_DEFINITION_FEATURE_COUNT = NATURE_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.nature.impl.UnconstrainedArrayNatureDefinitionImpl <em>Unconstrained Array Nature Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.nature.impl.UnconstrainedArrayNatureDefinitionImpl
	 * @see net.mlanoe.language.vhdl.nature.impl.NaturePackageImpl#getUnconstrainedArrayNatureDefinition()
	 * @generated
	 */
	int UNCONSTRAINED_ARRAY_NATURE_DEFINITION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCONSTRAINED_ARRAY_NATURE_DEFINITION__ID = ARRAY_NATURE_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCONSTRAINED_ARRAY_NATURE_DEFINITION__NATURE = ARRAY_NATURE_DEFINITION__NATURE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCONSTRAINED_ARRAY_NATURE_DEFINITION__INDEX = ARRAY_NATURE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unconstrained Array Nature Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCONSTRAINED_ARRAY_NATURE_DEFINITION_FEATURE_COUNT = ARRAY_NATURE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.nature.NatureReference <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.nature.NatureReference
	 * @see net.mlanoe.language.vhdl.nature.impl.NaturePackageImpl#getNatureReference()
	 * @generated
	 */
	int NATURE_REFERENCE = 8;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE_REFERENCE_FEATURE_COUNT = 0;


	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.nature.Natured <em>Natured</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.nature.Natured
	 * @see net.mlanoe.language.vhdl.nature.impl.NaturePackageImpl#getNatured()
	 * @generated
	 */
	int NATURED = 9;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURED__NATURE = 0;

	/**
	 * The number of structural features of the '<em>Natured</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURED_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.nature.ArrayNatureDefinition <em>Array Nature Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Nature Definition</em>'.
	 * @see net.mlanoe.language.vhdl.nature.ArrayNatureDefinition
	 * @generated
	 */
	EClass getArrayNatureDefinition();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.nature.CompositeNatureDefinition <em>Composite Nature Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Nature Definition</em>'.
	 * @see net.mlanoe.language.vhdl.nature.CompositeNatureDefinition
	 * @generated
	 */
	EClass getCompositeNatureDefinition();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.nature.ConstrainedArrayNatureDefinition <em>Constrained Array Nature Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constrained Array Nature Definition</em>'.
	 * @see net.mlanoe.language.vhdl.nature.ConstrainedArrayNatureDefinition
	 * @generated
	 */
	EClass getConstrainedArrayNatureDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.nature.ConstrainedArrayNatureDefinition#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint</em>'.
	 * @see net.mlanoe.language.vhdl.nature.ConstrainedArrayNatureDefinition#getConstraint()
	 * @see #getConstrainedArrayNatureDefinition()
	 * @generated
	 */
	EReference getConstrainedArrayNatureDefinition_Constraint();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.nature.NatureDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see net.mlanoe.language.vhdl.nature.NatureDefinition
	 * @generated
	 */
	EClass getNatureDefinition();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.nature.RecordNatureDefinition <em>Record Nature Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Nature Definition</em>'.
	 * @see net.mlanoe.language.vhdl.nature.RecordNatureDefinition
	 * @generated
	 */
	EClass getRecordNatureDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.nature.RecordNatureDefinition#getRecord <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Record</em>'.
	 * @see net.mlanoe.language.vhdl.nature.RecordNatureDefinition#getRecord()
	 * @see #getRecordNatureDefinition()
	 * @generated
	 */
	EReference getRecordNatureDefinition_Record();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.nature.RecordNatureElement <em>Record Nature Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Nature Element</em>'.
	 * @see net.mlanoe.language.vhdl.nature.RecordNatureElement
	 * @generated
	 */
	EClass getRecordNatureElement();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.nature.ScalarNatureDefinition <em>Scalar Nature Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scalar Nature Definition</em>'.
	 * @see net.mlanoe.language.vhdl.nature.ScalarNatureDefinition
	 * @generated
	 */
	EClass getScalarNatureDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.nature.ScalarNatureDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see net.mlanoe.language.vhdl.nature.ScalarNatureDefinition#getName()
	 * @see #getScalarNatureDefinition()
	 * @generated
	 */
	EReference getScalarNatureDefinition_Name();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.nature.ScalarNatureDefinition#getAcross <em>Across</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Across</em>'.
	 * @see net.mlanoe.language.vhdl.nature.ScalarNatureDefinition#getAcross()
	 * @see #getScalarNatureDefinition()
	 * @generated
	 */
	EReference getScalarNatureDefinition_Across();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.nature.ScalarNatureDefinition#getThrough <em>Through</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Through</em>'.
	 * @see net.mlanoe.language.vhdl.nature.ScalarNatureDefinition#getThrough()
	 * @see #getScalarNatureDefinition()
	 * @generated
	 */
	EReference getScalarNatureDefinition_Through();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.nature.UnconstrainedArrayNatureDefinition <em>Unconstrained Array Nature Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unconstrained Array Nature Definition</em>'.
	 * @see net.mlanoe.language.vhdl.nature.UnconstrainedArrayNatureDefinition
	 * @generated
	 */
	EClass getUnconstrainedArrayNatureDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.nature.UnconstrainedArrayNatureDefinition#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Index</em>'.
	 * @see net.mlanoe.language.vhdl.nature.UnconstrainedArrayNatureDefinition#getIndex()
	 * @see #getUnconstrainedArrayNatureDefinition()
	 * @generated
	 */
	EReference getUnconstrainedArrayNatureDefinition_Index();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.nature.NatureReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see net.mlanoe.language.vhdl.nature.NatureReference
	 * @generated
	 */
	EClass getNatureReference();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.nature.Natured <em>Natured</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Natured</em>'.
	 * @see net.mlanoe.language.vhdl.nature.Natured
	 * @generated
	 */
	EClass getNatured();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.nature.Natured#getNature <em>Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Nature</em>'.
	 * @see net.mlanoe.language.vhdl.nature.Natured#getNature()
	 * @see #getNatured()
	 * @generated
	 */
	EReference getNatured_Nature();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NatureFactory getNatureFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.nature.impl.ArrayNatureDefinitionImpl <em>Array Nature Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.nature.impl.ArrayNatureDefinitionImpl
		 * @see net.mlanoe.language.vhdl.nature.impl.NaturePackageImpl#getArrayNatureDefinition()
		 * @generated
		 */
		EClass ARRAY_NATURE_DEFINITION = eINSTANCE.getArrayNatureDefinition();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.nature.impl.CompositeNatureDefinitionImpl <em>Composite Nature Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.nature.impl.CompositeNatureDefinitionImpl
		 * @see net.mlanoe.language.vhdl.nature.impl.NaturePackageImpl#getCompositeNatureDefinition()
		 * @generated
		 */
		EClass COMPOSITE_NATURE_DEFINITION = eINSTANCE.getCompositeNatureDefinition();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.nature.impl.ConstrainedArrayNatureDefinitionImpl <em>Constrained Array Nature Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.nature.impl.ConstrainedArrayNatureDefinitionImpl
		 * @see net.mlanoe.language.vhdl.nature.impl.NaturePackageImpl#getConstrainedArrayNatureDefinition()
		 * @generated
		 */
		EClass CONSTRAINED_ARRAY_NATURE_DEFINITION = eINSTANCE.getConstrainedArrayNatureDefinition();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINED_ARRAY_NATURE_DEFINITION__CONSTRAINT = eINSTANCE.getConstrainedArrayNatureDefinition_Constraint();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.nature.impl.NatureDefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.nature.impl.NatureDefinitionImpl
		 * @see net.mlanoe.language.vhdl.nature.impl.NaturePackageImpl#getNatureDefinition()
		 * @generated
		 */
		EClass NATURE_DEFINITION = eINSTANCE.getNatureDefinition();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.nature.impl.RecordNatureDefinitionImpl <em>Record Nature Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.nature.impl.RecordNatureDefinitionImpl
		 * @see net.mlanoe.language.vhdl.nature.impl.NaturePackageImpl#getRecordNatureDefinition()
		 * @generated
		 */
		EClass RECORD_NATURE_DEFINITION = eINSTANCE.getRecordNatureDefinition();

		/**
		 * The meta object literal for the '<em><b>Record</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD_NATURE_DEFINITION__RECORD = eINSTANCE.getRecordNatureDefinition_Record();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.nature.impl.RecordNatureElementImpl <em>Record Nature Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.nature.impl.RecordNatureElementImpl
		 * @see net.mlanoe.language.vhdl.nature.impl.NaturePackageImpl#getRecordNatureElement()
		 * @generated
		 */
		EClass RECORD_NATURE_ELEMENT = eINSTANCE.getRecordNatureElement();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.nature.impl.ScalarNatureDefinitionImpl <em>Scalar Nature Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.nature.impl.ScalarNatureDefinitionImpl
		 * @see net.mlanoe.language.vhdl.nature.impl.NaturePackageImpl#getScalarNatureDefinition()
		 * @generated
		 */
		EClass SCALAR_NATURE_DEFINITION = eINSTANCE.getScalarNatureDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALAR_NATURE_DEFINITION__NAME = eINSTANCE.getScalarNatureDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Across</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALAR_NATURE_DEFINITION__ACROSS = eINSTANCE.getScalarNatureDefinition_Across();

		/**
		 * The meta object literal for the '<em><b>Through</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALAR_NATURE_DEFINITION__THROUGH = eINSTANCE.getScalarNatureDefinition_Through();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.nature.impl.UnconstrainedArrayNatureDefinitionImpl <em>Unconstrained Array Nature Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.nature.impl.UnconstrainedArrayNatureDefinitionImpl
		 * @see net.mlanoe.language.vhdl.nature.impl.NaturePackageImpl#getUnconstrainedArrayNatureDefinition()
		 * @generated
		 */
		EClass UNCONSTRAINED_ARRAY_NATURE_DEFINITION = eINSTANCE.getUnconstrainedArrayNatureDefinition();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNCONSTRAINED_ARRAY_NATURE_DEFINITION__INDEX = eINSTANCE.getUnconstrainedArrayNatureDefinition_Index();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.nature.NatureReference <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.nature.NatureReference
		 * @see net.mlanoe.language.vhdl.nature.impl.NaturePackageImpl#getNatureReference()
		 * @generated
		 */
		EClass NATURE_REFERENCE = eINSTANCE.getNatureReference();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.nature.Natured <em>Natured</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.nature.Natured
		 * @see net.mlanoe.language.vhdl.nature.impl.NaturePackageImpl#getNatured()
		 * @generated
		 */
		EClass NATURED = eINSTANCE.getNatured();

		/**
		 * The meta object literal for the '<em><b>Nature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NATURED__NATURE = eINSTANCE.getNatured_Nature();

	}

} //NaturePackage
