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
package net.mlanoe.language.vhdl.type;

import net.mlanoe.language.vhdl.VhdlPackage;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see net.mlanoe.language.vhdl.type.TypeFactory
 * @model kind="package"
 * @generated
 */
public interface TypePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "type";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mlanoe.net/language/vhdl/type/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "type";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypePackage eINSTANCE = net.mlanoe.language.vhdl.type.impl.TypePackageImpl.init();

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.type.impl.TypeDefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.type.impl.TypeDefinitionImpl
	 * @see net.mlanoe.language.vhdl.type.impl.TypePackageImpl#getTypeDefinition()
	 * @generated
	 */
	int TYPE_DEFINITION = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__ID = VhdlPackage.VHDL_OBJECT__ID;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_FEATURE_COUNT = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.type.impl.AccessTypeDefinitionImpl <em>Access Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.type.impl.AccessTypeDefinitionImpl
	 * @see net.mlanoe.language.vhdl.type.impl.TypePackageImpl#getAccessTypeDefinition()
	 * @generated
	 */
	int ACCESS_TYPE_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_TYPE_DEFINITION__ID = TYPE_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_TYPE_DEFINITION__TYPE = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Access Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_TYPE_DEFINITION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.type.impl.CompositeTypeDefinitionImpl <em>Composite Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.type.impl.CompositeTypeDefinitionImpl
	 * @see net.mlanoe.language.vhdl.type.impl.TypePackageImpl#getCompositeTypeDefinition()
	 * @generated
	 */
	int COMPOSITE_TYPE_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE_DEFINITION__ID = TYPE_DEFINITION__ID;

	/**
	 * The number of structural features of the '<em>Composite Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_TYPE_DEFINITION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.type.impl.RecordTypeDefinitionImpl <em>Record Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.type.impl.RecordTypeDefinitionImpl
	 * @see net.mlanoe.language.vhdl.type.impl.TypePackageImpl#getRecordTypeDefinition()
	 * @generated
	 */
	int RECORD_TYPE_DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE_DEFINITION__ID = COMPOSITE_TYPE_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE_DEFINITION__DECLARATION = COMPOSITE_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Record Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE_DEFINITION_FEATURE_COUNT = COMPOSITE_TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.type.impl.ArrayTypeDefinitionImpl <em>Array Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.type.impl.ArrayTypeDefinitionImpl
	 * @see net.mlanoe.language.vhdl.type.impl.TypePackageImpl#getArrayTypeDefinition()
	 * @generated
	 */
	int ARRAY_TYPE_DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_DEFINITION__ID = COMPOSITE_TYPE_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_DEFINITION__TYPE = COMPOSITE_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_TYPE_DEFINITION_FEATURE_COUNT = COMPOSITE_TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.type.impl.ConstrainedArrayTypeDefinitionImpl <em>Constrained Array Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.type.impl.ConstrainedArrayTypeDefinitionImpl
	 * @see net.mlanoe.language.vhdl.type.impl.TypePackageImpl#getConstrainedArrayTypeDefinition()
	 * @generated
	 */
	int CONSTRAINED_ARRAY_TYPE_DEFINITION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_ARRAY_TYPE_DEFINITION__ID = ARRAY_TYPE_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_ARRAY_TYPE_DEFINITION__TYPE = ARRAY_TYPE_DEFINITION__TYPE;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_ARRAY_TYPE_DEFINITION__CONSTRAINT = ARRAY_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constrained Array Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINED_ARRAY_TYPE_DEFINITION_FEATURE_COUNT = ARRAY_TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.type.impl.UnconstrainedArrayTypeDefinitionImpl <em>Unconstrained Array Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.type.impl.UnconstrainedArrayTypeDefinitionImpl
	 * @see net.mlanoe.language.vhdl.type.impl.TypePackageImpl#getUnconstrainedArrayTypeDefinition()
	 * @generated
	 */
	int UNCONSTRAINED_ARRAY_TYPE_DEFINITION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCONSTRAINED_ARRAY_TYPE_DEFINITION__ID = ARRAY_TYPE_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCONSTRAINED_ARRAY_TYPE_DEFINITION__TYPE = ARRAY_TYPE_DEFINITION__TYPE;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCONSTRAINED_ARRAY_TYPE_DEFINITION__INDEX = ARRAY_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unconstrained Array Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNCONSTRAINED_ARRAY_TYPE_DEFINITION_FEATURE_COUNT = ARRAY_TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.type.impl.EnumerationTypeDefinitionImpl <em>Enumeration Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.type.impl.EnumerationTypeDefinitionImpl
	 * @see net.mlanoe.language.vhdl.type.impl.TypePackageImpl#getEnumerationTypeDefinition()
	 * @generated
	 */
	int ENUMERATION_TYPE_DEFINITION = 7;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.type.impl.FileTypeDefinitionImpl <em>File Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.type.impl.FileTypeDefinitionImpl
	 * @see net.mlanoe.language.vhdl.type.impl.TypePackageImpl#getFileTypeDefinition()
	 * @generated
	 */
	int FILE_TYPE_DEFINITION = 8;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.type.impl.PhysicalTypeDefinitionImpl <em>Physical Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.type.impl.PhysicalTypeDefinitionImpl
	 * @see net.mlanoe.language.vhdl.type.impl.TypePackageImpl#getPhysicalTypeDefinition()
	 * @generated
	 */
	int PHYSICAL_TYPE_DEFINITION = 9;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.type.impl.PhysicalTypeDefinitionSecondaryImpl <em>Physical Type Definition Secondary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.type.impl.PhysicalTypeDefinitionSecondaryImpl
	 * @see net.mlanoe.language.vhdl.type.impl.TypePackageImpl#getPhysicalTypeDefinitionSecondary()
	 * @generated
	 */
	int PHYSICAL_TYPE_DEFINITION_SECONDARY = 10;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.type.impl.RangeTypeDefinitionImpl <em>Range Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.type.impl.RangeTypeDefinitionImpl
	 * @see net.mlanoe.language.vhdl.type.impl.TypePackageImpl#getRangeTypeDefinition()
	 * @generated
	 */
	int RANGE_TYPE_DEFINITION = 11;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.type.impl.RecordTypeElementImpl <em>Record Type Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.type.impl.RecordTypeElementImpl
	 * @see net.mlanoe.language.vhdl.type.impl.TypePackageImpl#getRecordTypeElement()
	 * @generated
	 */
	int RECORD_TYPE_ELEMENT = 12;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.type.Typed <em>Typed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.type.Typed
	 * @see net.mlanoe.language.vhdl.type.impl.TypePackageImpl#getTyped()
	 * @generated
	 */
	int TYPED = 13;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.type.TypeReference <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.type.TypeReference
	 * @see net.mlanoe.language.vhdl.type.impl.TypePackageImpl#getTypeReference()
	 * @generated
	 */
	int TYPE_REFERENCE = 15;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.type.EnumerationLiteral <em>Enumeration Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.type.EnumerationLiteral
	 * @see net.mlanoe.language.vhdl.type.impl.TypePackageImpl#getEnumerationLiteral()
	 * @generated
	 */
	int ENUMERATION_LITERAL = 6;

	/**
	 * The number of structural features of the '<em>Enumeration Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_LITERAL_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE_DEFINITION__ID = TYPE_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE_DEFINITION__LITERAL = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE_DEFINITION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE_DEFINITION__ID = TYPE_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE_DEFINITION__TYPE = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_TYPE_DEFINITION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_TYPE_DEFINITION__ID = TYPE_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_TYPE_DEFINITION__RANGE = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Primary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_TYPE_DEFINITION__PRIMARY = TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Secondary</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_TYPE_DEFINITION__SECONDARY = TYPE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Physical Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_TYPE_DEFINITION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_TYPE_DEFINITION_SECONDARY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_TYPE_DEFINITION_SECONDARY__NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_TYPE_DEFINITION_SECONDARY__OF = 2;

	/**
	 * The number of structural features of the '<em>Physical Type Definition Secondary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_TYPE_DEFINITION_SECONDARY_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE_DEFINITION__ID = TYPE_DEFINITION__ID;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE_DEFINITION__LEFT = TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE_DEFINITION__DIRECTION = TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE_DEFINITION__RIGHT = TYPE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Range Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_TYPE_DEFINITION_FEATURE_COUNT = TYPE_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE_ELEMENT__ID = VhdlPackage.VHDL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE_ELEMENT__NAME = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE_ELEMENT__TYPE = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Record Type Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE_ELEMENT_FEATURE_COUNT = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Typed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_FEATURE_COUNT = 1;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.type.AccessTypeDefinition <em>Access Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Type Definition</em>'.
	 * @see net.mlanoe.language.vhdl.type.AccessTypeDefinition
	 * @generated
	 */
	EClass getAccessTypeDefinition();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.type.CompositeTypeDefinition <em>Composite Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Type Definition</em>'.
	 * @see net.mlanoe.language.vhdl.type.CompositeTypeDefinition
	 * @generated
	 */
	EClass getCompositeTypeDefinition();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.type.RecordTypeDefinition <em>Record Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Type Definition</em>'.
	 * @see net.mlanoe.language.vhdl.type.RecordTypeDefinition
	 * @generated
	 */
	EClass getRecordTypeDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.type.RecordTypeDefinition#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declaration</em>'.
	 * @see net.mlanoe.language.vhdl.type.RecordTypeDefinition#getDeclaration()
	 * @see #getRecordTypeDefinition()
	 * @generated
	 */
	EReference getRecordTypeDefinition_Declaration();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.type.ArrayTypeDefinition <em>Array Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array Type Definition</em>'.
	 * @see net.mlanoe.language.vhdl.type.ArrayTypeDefinition
	 * @generated
	 */
	EClass getArrayTypeDefinition();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.type.ConstrainedArrayTypeDefinition <em>Constrained Array Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constrained Array Type Definition</em>'.
	 * @see net.mlanoe.language.vhdl.type.ConstrainedArrayTypeDefinition
	 * @generated
	 */
	EClass getConstrainedArrayTypeDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.type.ConstrainedArrayTypeDefinition#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint</em>'.
	 * @see net.mlanoe.language.vhdl.type.ConstrainedArrayTypeDefinition#getConstraint()
	 * @see #getConstrainedArrayTypeDefinition()
	 * @generated
	 */
	EReference getConstrainedArrayTypeDefinition_Constraint();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.type.UnconstrainedArrayTypeDefinition <em>Unconstrained Array Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unconstrained Array Type Definition</em>'.
	 * @see net.mlanoe.language.vhdl.type.UnconstrainedArrayTypeDefinition
	 * @generated
	 */
	EClass getUnconstrainedArrayTypeDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.type.UnconstrainedArrayTypeDefinition#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Index</em>'.
	 * @see net.mlanoe.language.vhdl.type.UnconstrainedArrayTypeDefinition#getIndex()
	 * @see #getUnconstrainedArrayTypeDefinition()
	 * @generated
	 */
	EReference getUnconstrainedArrayTypeDefinition_Index();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.type.EnumerationTypeDefinition <em>Enumeration Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Type Definition</em>'.
	 * @see net.mlanoe.language.vhdl.type.EnumerationTypeDefinition
	 * @generated
	 */
	EClass getEnumerationTypeDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.type.EnumerationTypeDefinition#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literal</em>'.
	 * @see net.mlanoe.language.vhdl.type.EnumerationTypeDefinition#getLiteral()
	 * @see #getEnumerationTypeDefinition()
	 * @generated
	 */
	EReference getEnumerationTypeDefinition_Literal();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.type.FileTypeDefinition <em>File Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Type Definition</em>'.
	 * @see net.mlanoe.language.vhdl.type.FileTypeDefinition
	 * @generated
	 */
	EClass getFileTypeDefinition();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.type.PhysicalTypeDefinition <em>Physical Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Type Definition</em>'.
	 * @see net.mlanoe.language.vhdl.type.PhysicalTypeDefinition
	 * @generated
	 */
	EClass getPhysicalTypeDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.type.PhysicalTypeDefinition#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see net.mlanoe.language.vhdl.type.PhysicalTypeDefinition#getRange()
	 * @see #getPhysicalTypeDefinition()
	 * @generated
	 */
	EReference getPhysicalTypeDefinition_Range();

	/**
	 * Returns the meta object for the attribute '{@link net.mlanoe.language.vhdl.type.PhysicalTypeDefinition#getPrimary <em>Primary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primary</em>'.
	 * @see net.mlanoe.language.vhdl.type.PhysicalTypeDefinition#getPrimary()
	 * @see #getPhysicalTypeDefinition()
	 * @generated
	 */
	EAttribute getPhysicalTypeDefinition_Primary();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.type.PhysicalTypeDefinition#getSecondary <em>Secondary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Secondary</em>'.
	 * @see net.mlanoe.language.vhdl.type.PhysicalTypeDefinition#getSecondary()
	 * @see #getPhysicalTypeDefinition()
	 * @generated
	 */
	EReference getPhysicalTypeDefinition_Secondary();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.type.PhysicalTypeDefinitionSecondary <em>Physical Type Definition Secondary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Type Definition Secondary</em>'.
	 * @see net.mlanoe.language.vhdl.type.PhysicalTypeDefinitionSecondary
	 * @generated
	 */
	EClass getPhysicalTypeDefinitionSecondary();

	/**
	 * Returns the meta object for the attribute '{@link net.mlanoe.language.vhdl.type.PhysicalTypeDefinitionSecondary#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.mlanoe.language.vhdl.type.PhysicalTypeDefinitionSecondary#getName()
	 * @see #getPhysicalTypeDefinitionSecondary()
	 * @generated
	 */
	EAttribute getPhysicalTypeDefinitionSecondary_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.mlanoe.language.vhdl.type.PhysicalTypeDefinitionSecondary#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see net.mlanoe.language.vhdl.type.PhysicalTypeDefinitionSecondary#getNumber()
	 * @see #getPhysicalTypeDefinitionSecondary()
	 * @generated
	 */
	EAttribute getPhysicalTypeDefinitionSecondary_Number();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.type.PhysicalTypeDefinitionSecondary#getOf <em>Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Of</em>'.
	 * @see net.mlanoe.language.vhdl.type.PhysicalTypeDefinitionSecondary#getOf()
	 * @see #getPhysicalTypeDefinitionSecondary()
	 * @generated
	 */
	EReference getPhysicalTypeDefinitionSecondary_Of();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.type.RangeTypeDefinition <em>Range Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Type Definition</em>'.
	 * @see net.mlanoe.language.vhdl.type.RangeTypeDefinition
	 * @generated
	 */
	EClass getRangeTypeDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.type.RangeTypeDefinition#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see net.mlanoe.language.vhdl.type.RangeTypeDefinition#getLeft()
	 * @see #getRangeTypeDefinition()
	 * @generated
	 */
	EReference getRangeTypeDefinition_Left();

	/**
	 * Returns the meta object for the attribute '{@link net.mlanoe.language.vhdl.type.RangeTypeDefinition#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see net.mlanoe.language.vhdl.type.RangeTypeDefinition#getDirection()
	 * @see #getRangeTypeDefinition()
	 * @generated
	 */
	EAttribute getRangeTypeDefinition_Direction();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.type.RangeTypeDefinition#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see net.mlanoe.language.vhdl.type.RangeTypeDefinition#getRight()
	 * @see #getRangeTypeDefinition()
	 * @generated
	 */
	EReference getRangeTypeDefinition_Right();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.type.TypeDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see net.mlanoe.language.vhdl.type.TypeDefinition
	 * @generated
	 */
	EClass getTypeDefinition();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.type.RecordTypeElement <em>Record Type Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Type Element</em>'.
	 * @see net.mlanoe.language.vhdl.type.RecordTypeElement
	 * @generated
	 */
	EClass getRecordTypeElement();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.type.Typed <em>Typed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed</em>'.
	 * @see net.mlanoe.language.vhdl.type.Typed
	 * @generated
	 */
	EClass getTyped();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.type.Typed#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see net.mlanoe.language.vhdl.type.Typed#getType()
	 * @see #getTyped()
	 * @generated
	 */
	EReference getTyped_Type();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.type.TypeReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see net.mlanoe.language.vhdl.type.TypeReference
	 * @generated
	 */
	EClass getTypeReference();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.type.EnumerationLiteral <em>Enumeration Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Literal</em>'.
	 * @see net.mlanoe.language.vhdl.type.EnumerationLiteral
	 * @generated
	 */
	EClass getEnumerationLiteral();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypeFactory getTypeFactory();

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
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.type.impl.AccessTypeDefinitionImpl <em>Access Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.type.impl.AccessTypeDefinitionImpl
		 * @see net.mlanoe.language.vhdl.type.impl.TypePackageImpl#getAccessTypeDefinition()
		 * @generated
		 */
		EClass ACCESS_TYPE_DEFINITION = eINSTANCE.getAccessTypeDefinition();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.type.impl.CompositeTypeDefinitionImpl <em>Composite Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.type.impl.CompositeTypeDefinitionImpl
		 * @see net.mlanoe.language.vhdl.type.impl.TypePackageImpl#getCompositeTypeDefinition()
		 * @generated
		 */
		EClass COMPOSITE_TYPE_DEFINITION = eINSTANCE.getCompositeTypeDefinition();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.type.impl.RecordTypeDefinitionImpl <em>Record Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.type.impl.RecordTypeDefinitionImpl
		 * @see net.mlanoe.language.vhdl.type.impl.TypePackageImpl#getRecordTypeDefinition()
		 * @generated
		 */
		EClass RECORD_TYPE_DEFINITION = eINSTANCE.getRecordTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD_TYPE_DEFINITION__DECLARATION = eINSTANCE.getRecordTypeDefinition_Declaration();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.type.impl.ArrayTypeDefinitionImpl <em>Array Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.type.impl.ArrayTypeDefinitionImpl
		 * @see net.mlanoe.language.vhdl.type.impl.TypePackageImpl#getArrayTypeDefinition()
		 * @generated
		 */
		EClass ARRAY_TYPE_DEFINITION = eINSTANCE.getArrayTypeDefinition();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.type.impl.ConstrainedArrayTypeDefinitionImpl <em>Constrained Array Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.type.impl.ConstrainedArrayTypeDefinitionImpl
		 * @see net.mlanoe.language.vhdl.type.impl.TypePackageImpl#getConstrainedArrayTypeDefinition()
		 * @generated
		 */
		EClass CONSTRAINED_ARRAY_TYPE_DEFINITION = eINSTANCE.getConstrainedArrayTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINED_ARRAY_TYPE_DEFINITION__CONSTRAINT = eINSTANCE.getConstrainedArrayTypeDefinition_Constraint();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.type.impl.UnconstrainedArrayTypeDefinitionImpl <em>Unconstrained Array Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.type.impl.UnconstrainedArrayTypeDefinitionImpl
		 * @see net.mlanoe.language.vhdl.type.impl.TypePackageImpl#getUnconstrainedArrayTypeDefinition()
		 * @generated
		 */
		EClass UNCONSTRAINED_ARRAY_TYPE_DEFINITION = eINSTANCE.getUnconstrainedArrayTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNCONSTRAINED_ARRAY_TYPE_DEFINITION__INDEX = eINSTANCE.getUnconstrainedArrayTypeDefinition_Index();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.type.impl.EnumerationTypeDefinitionImpl <em>Enumeration Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.type.impl.EnumerationTypeDefinitionImpl
		 * @see net.mlanoe.language.vhdl.type.impl.TypePackageImpl#getEnumerationTypeDefinition()
		 * @generated
		 */
		EClass ENUMERATION_TYPE_DEFINITION = eINSTANCE.getEnumerationTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_TYPE_DEFINITION__LITERAL = eINSTANCE.getEnumerationTypeDefinition_Literal();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.type.impl.FileTypeDefinitionImpl <em>File Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.type.impl.FileTypeDefinitionImpl
		 * @see net.mlanoe.language.vhdl.type.impl.TypePackageImpl#getFileTypeDefinition()
		 * @generated
		 */
		EClass FILE_TYPE_DEFINITION = eINSTANCE.getFileTypeDefinition();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.type.impl.PhysicalTypeDefinitionImpl <em>Physical Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.type.impl.PhysicalTypeDefinitionImpl
		 * @see net.mlanoe.language.vhdl.type.impl.TypePackageImpl#getPhysicalTypeDefinition()
		 * @generated
		 */
		EClass PHYSICAL_TYPE_DEFINITION = eINSTANCE.getPhysicalTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_TYPE_DEFINITION__RANGE = eINSTANCE.getPhysicalTypeDefinition_Range();

		/**
		 * The meta object literal for the '<em><b>Primary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_TYPE_DEFINITION__PRIMARY = eINSTANCE.getPhysicalTypeDefinition_Primary();

		/**
		 * The meta object literal for the '<em><b>Secondary</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_TYPE_DEFINITION__SECONDARY = eINSTANCE.getPhysicalTypeDefinition_Secondary();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.type.impl.PhysicalTypeDefinitionSecondaryImpl <em>Physical Type Definition Secondary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.type.impl.PhysicalTypeDefinitionSecondaryImpl
		 * @see net.mlanoe.language.vhdl.type.impl.TypePackageImpl#getPhysicalTypeDefinitionSecondary()
		 * @generated
		 */
		EClass PHYSICAL_TYPE_DEFINITION_SECONDARY = eINSTANCE.getPhysicalTypeDefinitionSecondary();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_TYPE_DEFINITION_SECONDARY__NAME = eINSTANCE.getPhysicalTypeDefinitionSecondary_Name();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_TYPE_DEFINITION_SECONDARY__NUMBER = eINSTANCE.getPhysicalTypeDefinitionSecondary_Number();

		/**
		 * The meta object literal for the '<em><b>Of</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_TYPE_DEFINITION_SECONDARY__OF = eINSTANCE.getPhysicalTypeDefinitionSecondary_Of();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.type.impl.RangeTypeDefinitionImpl <em>Range Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.type.impl.RangeTypeDefinitionImpl
		 * @see net.mlanoe.language.vhdl.type.impl.TypePackageImpl#getRangeTypeDefinition()
		 * @generated
		 */
		EClass RANGE_TYPE_DEFINITION = eINSTANCE.getRangeTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_TYPE_DEFINITION__LEFT = eINSTANCE.getRangeTypeDefinition_Left();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_TYPE_DEFINITION__DIRECTION = eINSTANCE.getRangeTypeDefinition_Direction();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_TYPE_DEFINITION__RIGHT = eINSTANCE.getRangeTypeDefinition_Right();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.type.impl.TypeDefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.type.impl.TypeDefinitionImpl
		 * @see net.mlanoe.language.vhdl.type.impl.TypePackageImpl#getTypeDefinition()
		 * @generated
		 */
		EClass TYPE_DEFINITION = eINSTANCE.getTypeDefinition();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.type.impl.RecordTypeElementImpl <em>Record Type Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.type.impl.RecordTypeElementImpl
		 * @see net.mlanoe.language.vhdl.type.impl.TypePackageImpl#getRecordTypeElement()
		 * @generated
		 */
		EClass RECORD_TYPE_ELEMENT = eINSTANCE.getRecordTypeElement();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.type.Typed <em>Typed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.type.Typed
		 * @see net.mlanoe.language.vhdl.type.impl.TypePackageImpl#getTyped()
		 * @generated
		 */
		EClass TYPED = eINSTANCE.getTyped();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPED__TYPE = eINSTANCE.getTyped_Type();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.type.TypeReference <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.type.TypeReference
		 * @see net.mlanoe.language.vhdl.type.impl.TypePackageImpl#getTypeReference()
		 * @generated
		 */
		EClass TYPE_REFERENCE = eINSTANCE.getTypeReference();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.type.EnumerationLiteral <em>Enumeration Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.type.EnumerationLiteral
		 * @see net.mlanoe.language.vhdl.type.impl.TypePackageImpl#getEnumerationLiteral()
		 * @generated
		 */
		EClass ENUMERATION_LITERAL = eINSTANCE.getEnumerationLiteral();

	}

} //TypePackage
