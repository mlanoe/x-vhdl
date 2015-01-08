/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.expression;

import net.mlanoe.language.vhdl.VhdlPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see net.mlanoe.language.vhdl.expression.ExpressionFactory
 * @model kind="package"
 * @generated
 */
public interface ExpressionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "expression";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mlanoe.net/language/vhdl/expression/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "expression";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionPackage eINSTANCE = net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionImpl
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__ID = VhdlPackage.VHDL_OBJECT__ID;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.impl.BinaryExpressionImpl
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__ID = EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LEFT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.impl.AddingExpressionImpl <em>Adding Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.impl.AddingExpressionImpl
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getAddingExpression()
	 * @generated
	 */
	int ADDING_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDING_EXPRESSION__ID = BINARY_EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDING_EXPRESSION__LEFT = BINARY_EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDING_EXPRESSION__RIGHT = BINARY_EXPRESSION__RIGHT;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDING_EXPRESSION__OPERATOR = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Adding Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDING_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.impl.MultiExpressionImpl <em>Multi Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.impl.MultiExpressionImpl
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getMultiExpression()
	 * @generated
	 */
	int MULTI_EXPRESSION = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_EXPRESSION__ID = EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.impl.AggregateExpressionImpl <em>Aggregate Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.impl.AggregateExpressionImpl
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getAggregateExpression()
	 * @generated
	 */
	int AGGREGATE_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXPRESSION__ID = MULTI_EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXPRESSION__EXPRESSION = MULTI_EXPRESSION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Aggregate Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXPRESSION_FEATURE_COUNT = MULTI_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.impl.AllExpressionImpl <em>All Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.impl.AllExpressionImpl
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getAllExpression()
	 * @generated
	 */
	int ALL_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_EXPRESSION__ID = EXPRESSION__ID;

	/**
	 * The number of structural features of the '<em>All Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.impl.AllocatorExpressionImpl <em>Allocator Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.impl.AllocatorExpressionImpl
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getAllocatorExpression()
	 * @generated
	 */
	int ALLOCATOR_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATOR_EXPRESSION__ID = EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATOR_EXPRESSION__TYPE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Allocator Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOCATOR_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.impl.AssociationExpressionImpl <em>Association Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.impl.AssociationExpressionImpl
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getAssociationExpression()
	 * @generated
	 */
	int ASSOCIATION_EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_EXPRESSION__ID = EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_EXPRESSION__CHOICE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Association Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.impl.ValueExpressionImpl <em>Value Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.impl.ValueExpressionImpl
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getValueExpression()
	 * @generated
	 */
	int VALUE_EXPRESSION = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXPRESSION__ID = EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXPRESSION__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Value Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.impl.AttributeExpressionImpl <em>Attribute Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.impl.AttributeExpressionImpl
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getAttributeExpression()
	 * @generated
	 */
	int ATTRIBUTE_EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_EXPRESSION__ID = VALUE_EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_EXPRESSION__VALUE = VALUE_EXPRESSION__VALUE;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_EXPRESSION__SIGNATURE = VALUE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_EXPRESSION_FEATURE_COUNT = VALUE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.impl.BitStringExpressionImpl <em>Bit String Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.impl.BitStringExpressionImpl
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getBitStringExpression()
	 * @generated
	 */
	int BIT_STRING_EXPRESSION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_STRING_EXPRESSION__ID = VALUE_EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_STRING_EXPRESSION__VALUE = VALUE_EXPRESSION__VALUE;

	/**
	 * The number of structural features of the '<em>Bit String Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_STRING_EXPRESSION_FEATURE_COUNT = VALUE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.impl.IndicationExpressionImpl <em>Indication Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.impl.IndicationExpressionImpl
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getIndicationExpression()
	 * @generated
	 */
	int INDICATION_EXPRESSION = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATION_EXPRESSION__ID = EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATION_EXPRESSION__CONSTRAINT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tolerance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATION_EXPRESSION__TOLERANCE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Across</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATION_EXPRESSION__ACROSS = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Indication Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDICATION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.impl.SubtypeIndicationExpressionImpl <em>Subtype Indication Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.impl.SubtypeIndicationExpressionImpl
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getSubtypeIndicationExpression()
	 * @generated
	 */
	int SUBTYPE_INDICATION_EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTYPE_INDICATION_EXPRESSION__ID = INDICATION_EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTYPE_INDICATION_EXPRESSION__CONSTRAINT = INDICATION_EXPRESSION__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Tolerance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTYPE_INDICATION_EXPRESSION__TOLERANCE = INDICATION_EXPRESSION__TOLERANCE;

	/**
	 * The feature id for the '<em><b>Across</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTYPE_INDICATION_EXPRESSION__ACROSS = INDICATION_EXPRESSION__ACROSS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTYPE_INDICATION_EXPRESSION__NAME = INDICATION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTYPE_INDICATION_EXPRESSION__MARK = INDICATION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Subtype Indication Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTYPE_INDICATION_EXPRESSION_FEATURE_COUNT = INDICATION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.impl.SubnatureIndicationExpressionImpl <em>Subnature Indication Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.impl.SubnatureIndicationExpressionImpl
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getSubnatureIndicationExpression()
	 * @generated
	 */
	int SUBNATURE_INDICATION_EXPRESSION = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNATURE_INDICATION_EXPRESSION__ID = INDICATION_EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNATURE_INDICATION_EXPRESSION__CONSTRAINT = INDICATION_EXPRESSION__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Tolerance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNATURE_INDICATION_EXPRESSION__TOLERANCE = INDICATION_EXPRESSION__TOLERANCE;

	/**
	 * The feature id for the '<em><b>Across</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNATURE_INDICATION_EXPRESSION__ACROSS = INDICATION_EXPRESSION__ACROSS;

	/**
	 * The feature id for the '<em><b>Mark</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNATURE_INDICATION_EXPRESSION__MARK = INDICATION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Subnature Indication Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNATURE_INDICATION_EXPRESSION_FEATURE_COUNT = INDICATION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.impl.LogicalExpressionImpl <em>Logical Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.impl.LogicalExpressionImpl
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getLogicalExpression()
	 * @generated
	 */
	int LOGICAL_EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION__ID = BINARY_EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION__LEFT = BINARY_EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION__RIGHT = BINARY_EXPRESSION__RIGHT;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION__OPERATOR = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Logical Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.impl.NameExpressionImpl <em>Name Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.impl.NameExpressionImpl
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getNameExpression()
	 * @generated
	 */
	int NAME_EXPRESSION = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_EXPRESSION__ID = EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_EXPRESSION__ELEMENT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Name Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.impl.NullExpressionImpl <em>Null Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.impl.NullExpressionImpl
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getNullExpression()
	 * @generated
	 */
	int NULL_EXPRESSION = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION__ID = EXPRESSION__ID;

	/**
	 * The number of structural features of the '<em>Null Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NULL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.impl.MultiplyingExpressionImpl <em>Multiplying Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.impl.MultiplyingExpressionImpl
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getMultiplyingExpression()
	 * @generated
	 */
	int MULTIPLYING_EXPRESSION = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLYING_EXPRESSION__ID = BINARY_EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLYING_EXPRESSION__LEFT = BINARY_EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLYING_EXPRESSION__RIGHT = BINARY_EXPRESSION__RIGHT;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLYING_EXPRESSION__OPERATOR = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiplying Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLYING_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.impl.PowerExpressionImpl <em>Power Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.impl.PowerExpressionImpl
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getPowerExpression()
	 * @generated
	 */
	int POWER_EXPRESSION = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_EXPRESSION__ID = BINARY_EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_EXPRESSION__LEFT = BINARY_EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_EXPRESSION__RIGHT = BINARY_EXPRESSION__RIGHT;

	/**
	 * The number of structural features of the '<em>Power Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POWER_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.impl.RelationalExpressionImpl
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getRelationalExpression()
	 * @generated
	 */
	int RELATIONAL_EXPRESSION = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__ID = BINARY_EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__LEFT = BINARY_EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__RIGHT = BINARY_EXPRESSION__RIGHT;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION__OPERATOR = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Relational Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONAL_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.impl.ShiftExpressionImpl <em>Shift Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.impl.ShiftExpressionImpl
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getShiftExpression()
	 * @generated
	 */
	int SHIFT_EXPRESSION = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPRESSION__ID = BINARY_EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPRESSION__LEFT = BINARY_EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPRESSION__RIGHT = BINARY_EXPRESSION__RIGHT;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPRESSION__OPERATOR = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Shift Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHIFT_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.impl.SignatureExpressionImpl <em>Signature Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.impl.SignatureExpressionImpl
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getSignatureExpression()
	 * @generated
	 */
	int SIGNATURE_EXPRESSION = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_EXPRESSION__ID = EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_EXPRESSION__SIGNATURE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_EXPRESSION__NAME = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Signature Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.impl.SignExpressionImpl <em>Sign Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.impl.SignExpressionImpl
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getSignExpression()
	 * @generated
	 */
	int SIGN_EXPRESSION = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGN_EXPRESSION__ID = EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Sign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGN_EXPRESSION__SIGN = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGN_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sign Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.impl.UnaryExpressionImpl
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__ID = EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OPERATOR = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.impl.OpenExpressionImpl <em>Open Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.impl.OpenExpressionImpl
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getOpenExpression()
	 * @generated
	 */
	int OPEN_EXPRESSION = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_EXPRESSION__ID = EXPRESSION__ID;

	/**
	 * The number of structural features of the '<em>Open Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.impl.OthersExpressionImpl <em>Others Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.impl.OthersExpressionImpl
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getOthersExpression()
	 * @generated
	 */
	int OTHERS_EXPRESSION = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHERS_EXPRESSION__ID = EXPRESSION__ID;

	/**
	 * The number of structural features of the '<em>Others Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHERS_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.impl.RangeExpressionImpl <em>Range Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.impl.RangeExpressionImpl
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getRangeExpression()
	 * @generated
	 */
	int RANGE_EXPRESSION = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_EXPRESSION__ID = BINARY_EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_EXPRESSION__LEFT = BINARY_EXPRESSION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_EXPRESSION__RIGHT = BINARY_EXPRESSION__RIGHT;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_EXPRESSION__DIRECTION = BINARY_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Range Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_EXPRESSION_FEATURE_COUNT = BINARY_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.impl.StringExpressionImpl <em>String Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.impl.StringExpressionImpl
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getStringExpression()
	 * @generated
	 */
	int STRING_EXPRESSION = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION__ID = VALUE_EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION__VALUE = VALUE_EXPRESSION__VALUE;

	/**
	 * The number of structural features of the '<em>String Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION_FEATURE_COUNT = VALUE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.impl.CharacterExpressionImpl <em>Character Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.impl.CharacterExpressionImpl
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getCharacterExpression()
	 * @generated
	 */
	int CHARACTER_EXPRESSION = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_EXPRESSION__ID = VALUE_EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_EXPRESSION__VALUE = VALUE_EXPRESSION__VALUE;

	/**
	 * The number of structural features of the '<em>Character Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_EXPRESSION_FEATURE_COUNT = VALUE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.impl.IdentifierExpressionImpl <em>Identifier Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.impl.IdentifierExpressionImpl
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getIdentifierExpression()
	 * @generated
	 */
	int IDENTIFIER_EXPRESSION = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_EXPRESSION__ID = VALUE_EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_EXPRESSION__VALUE = VALUE_EXPRESSION__VALUE;

	/**
	 * The number of structural features of the '<em>Identifier Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_EXPRESSION_FEATURE_COUNT = VALUE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.impl.UnitValueExpressionImpl <em>Unit Value Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.impl.UnitValueExpressionImpl
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getUnitValueExpression()
	 * @generated
	 */
	int UNIT_VALUE_EXPRESSION = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_VALUE_EXPRESSION__ID = VALUE_EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_VALUE_EXPRESSION__VALUE = VALUE_EXPRESSION__VALUE;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_VALUE_EXPRESSION__UNIT = VALUE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unit Value Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_VALUE_EXPRESSION_FEATURE_COUNT = VALUE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.impl.UnaffectedExpressionImpl <em>Unaffected Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.impl.UnaffectedExpressionImpl
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getUnaffectedExpression()
	 * @generated
	 */
	int UNAFFECTED_EXPRESSION = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNAFFECTED_EXPRESSION__ID = EXPRESSION__ID;

	/**
	 * The number of structural features of the '<em>Unaffected Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNAFFECTED_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.impl.WaveformExpressionImpl <em>Waveform Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.impl.WaveformExpressionImpl
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getWaveformExpression()
	 * @generated
	 */
	int WAVEFORM_EXPRESSION = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAVEFORM_EXPRESSION__ID = EXPRESSION__ID;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAVEFORM_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>After</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAVEFORM_EXPRESSION__AFTER = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Waveform Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAVEFORM_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.UnaryOperator <em>Unary Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.UnaryOperator
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getUnaryOperator()
	 * @generated
	 */
	int UNARY_OPERATOR = 33;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.MultiplyingOperator <em>Multiplying Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.MultiplyingOperator
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getMultiplyingOperator()
	 * @generated
	 */
	int MULTIPLYING_OPERATOR = 34;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.ShiftOperator <em>Shift Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.ShiftOperator
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getShiftOperator()
	 * @generated
	 */
	int SHIFT_OPERATOR = 35;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.RelationalOperator <em>Relational Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.RelationalOperator
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getRelationalOperator()
	 * @generated
	 */
	int RELATIONAL_OPERATOR = 36;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.LogicalOperator <em>Logical Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.LogicalOperator
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getLogicalOperator()
	 * @generated
	 */
	int LOGICAL_OPERATOR = 37;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.AddingOperator <em>Adding Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.AddingOperator
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getAddingOperator()
	 * @generated
	 */
	int ADDING_OPERATOR = 38;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.Sign <em>Sign</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.Sign
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getSign()
	 * @generated
	 */
	int SIGN = 39;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.expression.RangeDirection <em>Range Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.expression.RangeDirection
	 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getRangeDirection()
	 * @generated
	 */
	int RANGE_DIRECTION = 40;


	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.expression.AddingExpression <em>Adding Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adding Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.AddingExpression
	 * @generated
	 */
	EClass getAddingExpression();

	/**
	 * Returns the meta object for the attribute '{@link net.mlanoe.language.vhdl.expression.AddingExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see net.mlanoe.language.vhdl.expression.AddingExpression#getOperator()
	 * @see #getAddingExpression()
	 * @generated
	 */
	EAttribute getAddingExpression_Operator();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.expression.AggregateExpression <em>Aggregate Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.AggregateExpression
	 * @generated
	 */
	EClass getAggregateExpression();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.expression.AllExpression <em>All Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>All Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.AllExpression
	 * @generated
	 */
	EClass getAllExpression();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.expression.AllocatorExpression <em>Allocator Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allocator Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.AllocatorExpression
	 * @generated
	 */
	EClass getAllocatorExpression();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.expression.AssociationExpression <em>Association Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.AssociationExpression
	 * @generated
	 */
	EClass getAssociationExpression();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.expression.AssociationExpression#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Choice</em>'.
	 * @see net.mlanoe.language.vhdl.expression.AssociationExpression#getChoice()
	 * @see #getAssociationExpression()
	 * @generated
	 */
	EReference getAssociationExpression_Choice();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.expression.AssociationExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.AssociationExpression#getExpression()
	 * @see #getAssociationExpression()
	 * @generated
	 */
	EReference getAssociationExpression_Expression();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.expression.AttributeExpression <em>Attribute Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.AttributeExpression
	 * @generated
	 */
	EClass getAttributeExpression();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.expression.AttributeExpression#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signature</em>'.
	 * @see net.mlanoe.language.vhdl.expression.AttributeExpression#getSignature()
	 * @see #getAttributeExpression()
	 * @generated
	 */
	EReference getAttributeExpression_Signature();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.expression.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.expression.BinaryExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see net.mlanoe.language.vhdl.expression.BinaryExpression#getLeft()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.expression.BinaryExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see net.mlanoe.language.vhdl.expression.BinaryExpression#getRight()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Right();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.expression.BitStringExpression <em>Bit String Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit String Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.BitStringExpression
	 * @generated
	 */
	EClass getBitStringExpression();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.expression.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.expression.IndicationExpression <em>Indication Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indication Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.IndicationExpression
	 * @generated
	 */
	EClass getIndicationExpression();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.expression.IndicationExpression#getConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraint</em>'.
	 * @see net.mlanoe.language.vhdl.expression.IndicationExpression#getConstraint()
	 * @see #getIndicationExpression()
	 * @generated
	 */
	EReference getIndicationExpression_Constraint();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.expression.IndicationExpression#getTolerance <em>Tolerance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tolerance</em>'.
	 * @see net.mlanoe.language.vhdl.expression.IndicationExpression#getTolerance()
	 * @see #getIndicationExpression()
	 * @generated
	 */
	EReference getIndicationExpression_Tolerance();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.expression.IndicationExpression#getAcross <em>Across</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Across</em>'.
	 * @see net.mlanoe.language.vhdl.expression.IndicationExpression#getAcross()
	 * @see #getIndicationExpression()
	 * @generated
	 */
	EReference getIndicationExpression_Across();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.expression.SubtypeIndicationExpression <em>Subtype Indication Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtype Indication Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.SubtypeIndicationExpression
	 * @generated
	 */
	EClass getSubtypeIndicationExpression();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.expression.SubtypeIndicationExpression#getMark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mark</em>'.
	 * @see net.mlanoe.language.vhdl.expression.SubtypeIndicationExpression#getMark()
	 * @see #getSubtypeIndicationExpression()
	 * @generated
	 */
	EReference getSubtypeIndicationExpression_Mark();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.expression.SubnatureIndicationExpression <em>Subnature Indication Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subnature Indication Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.SubnatureIndicationExpression
	 * @generated
	 */
	EClass getSubnatureIndicationExpression();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.expression.SubnatureIndicationExpression#getMark <em>Mark</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mark</em>'.
	 * @see net.mlanoe.language.vhdl.expression.SubnatureIndicationExpression#getMark()
	 * @see #getSubnatureIndicationExpression()
	 * @generated
	 */
	EReference getSubnatureIndicationExpression_Mark();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.expression.LogicalExpression <em>Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.LogicalExpression
	 * @generated
	 */
	EClass getLogicalExpression();

	/**
	 * Returns the meta object for the attribute '{@link net.mlanoe.language.vhdl.expression.LogicalExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see net.mlanoe.language.vhdl.expression.LogicalExpression#getOperator()
	 * @see #getLogicalExpression()
	 * @generated
	 */
	EAttribute getLogicalExpression_Operator();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.expression.NameExpression <em>Name Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.NameExpression
	 * @generated
	 */
	EClass getNameExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.expression.NameExpression#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element</em>'.
	 * @see net.mlanoe.language.vhdl.expression.NameExpression#getElement()
	 * @see #getNameExpression()
	 * @generated
	 */
	EReference getNameExpression_Element();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.expression.NullExpression <em>Null Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.NullExpression
	 * @generated
	 */
	EClass getNullExpression();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.expression.MultiplyingExpression <em>Multiplying Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplying Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.MultiplyingExpression
	 * @generated
	 */
	EClass getMultiplyingExpression();

	/**
	 * Returns the meta object for the attribute '{@link net.mlanoe.language.vhdl.expression.MultiplyingExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see net.mlanoe.language.vhdl.expression.MultiplyingExpression#getOperator()
	 * @see #getMultiplyingExpression()
	 * @generated
	 */
	EAttribute getMultiplyingExpression_Operator();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.expression.PowerExpression <em>Power Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Power Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.PowerExpression
	 * @generated
	 */
	EClass getPowerExpression();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.expression.RelationalExpression <em>Relational Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relational Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.RelationalExpression
	 * @generated
	 */
	EClass getRelationalExpression();

	/**
	 * Returns the meta object for the attribute '{@link net.mlanoe.language.vhdl.expression.RelationalExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see net.mlanoe.language.vhdl.expression.RelationalExpression#getOperator()
	 * @see #getRelationalExpression()
	 * @generated
	 */
	EAttribute getRelationalExpression_Operator();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.expression.ShiftExpression <em>Shift Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shift Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.ShiftExpression
	 * @generated
	 */
	EClass getShiftExpression();

	/**
	 * Returns the meta object for the attribute '{@link net.mlanoe.language.vhdl.expression.ShiftExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see net.mlanoe.language.vhdl.expression.ShiftExpression#getOperator()
	 * @see #getShiftExpression()
	 * @generated
	 */
	EAttribute getShiftExpression_Operator();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.expression.SignatureExpression <em>Signature Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.SignatureExpression
	 * @generated
	 */
	EClass getSignatureExpression();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.expression.SignatureExpression#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Signature</em>'.
	 * @see net.mlanoe.language.vhdl.expression.SignatureExpression#getSignature()
	 * @see #getSignatureExpression()
	 * @generated
	 */
	EReference getSignatureExpression_Signature();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.expression.SignatureExpression#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see net.mlanoe.language.vhdl.expression.SignatureExpression#getName()
	 * @see #getSignatureExpression()
	 * @generated
	 */
	EReference getSignatureExpression_Name();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.expression.SignExpression <em>Sign Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sign Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.SignExpression
	 * @generated
	 */
	EClass getSignExpression();

	/**
	 * Returns the meta object for the attribute '{@link net.mlanoe.language.vhdl.expression.SignExpression#getSign <em>Sign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sign</em>'.
	 * @see net.mlanoe.language.vhdl.expression.SignExpression#getSign()
	 * @see #getSignExpression()
	 * @generated
	 */
	EAttribute getSignExpression_Sign();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.expression.SignExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.SignExpression#getExpression()
	 * @see #getSignExpression()
	 * @generated
	 */
	EReference getSignExpression_Expression();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.expression.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the attribute '{@link net.mlanoe.language.vhdl.expression.UnaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see net.mlanoe.language.vhdl.expression.UnaryExpression#getOperator()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EAttribute getUnaryExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.expression.UnaryExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.UnaryExpression#getExpression()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Expression();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.expression.OpenExpression <em>Open Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.OpenExpression
	 * @generated
	 */
	EClass getOpenExpression();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.expression.OthersExpression <em>Others Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Others Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.OthersExpression
	 * @generated
	 */
	EClass getOthersExpression();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.expression.RangeExpression <em>Range Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.RangeExpression
	 * @generated
	 */
	EClass getRangeExpression();

	/**
	 * Returns the meta object for the attribute '{@link net.mlanoe.language.vhdl.expression.RangeExpression#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see net.mlanoe.language.vhdl.expression.RangeExpression#getDirection()
	 * @see #getRangeExpression()
	 * @generated
	 */
	EAttribute getRangeExpression_Direction();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.expression.StringExpression <em>String Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.StringExpression
	 * @generated
	 */
	EClass getStringExpression();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.expression.CharacterExpression <em>Character Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.CharacterExpression
	 * @generated
	 */
	EClass getCharacterExpression();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.expression.IdentifierExpression <em>Identifier Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.IdentifierExpression
	 * @generated
	 */
	EClass getIdentifierExpression();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.expression.UnitValueExpression <em>Unit Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Value Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.UnitValueExpression
	 * @generated
	 */
	EClass getUnitValueExpression();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.expression.UnitValueExpression#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit</em>'.
	 * @see net.mlanoe.language.vhdl.expression.UnitValueExpression#getUnit()
	 * @see #getUnitValueExpression()
	 * @generated
	 */
	EReference getUnitValueExpression_Unit();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.expression.UnaffectedExpression <em>Unaffected Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unaffected Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.UnaffectedExpression
	 * @generated
	 */
	EClass getUnaffectedExpression();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.expression.ValueExpression <em>Value Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.ValueExpression
	 * @generated
	 */
	EClass getValueExpression();

	/**
	 * Returns the meta object for the attribute '{@link net.mlanoe.language.vhdl.expression.ValueExpression#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.mlanoe.language.vhdl.expression.ValueExpression#getValue()
	 * @see #getValueExpression()
	 * @generated
	 */
	EAttribute getValueExpression_Value();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.expression.WaveformExpression <em>Waveform Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Waveform Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.WaveformExpression
	 * @generated
	 */
	EClass getWaveformExpression();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.expression.WaveformExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.WaveformExpression#getExpression()
	 * @see #getWaveformExpression()
	 * @generated
	 */
	EReference getWaveformExpression_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.expression.WaveformExpression#getAfter <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>After</em>'.
	 * @see net.mlanoe.language.vhdl.expression.WaveformExpression#getAfter()
	 * @see #getWaveformExpression()
	 * @generated
	 */
	EReference getWaveformExpression_After();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.expression.MultiExpression <em>Multi Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.MultiExpression
	 * @generated
	 */
	EClass getMultiExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.expression.MultiExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression</em>'.
	 * @see net.mlanoe.language.vhdl.expression.MultiExpression#getExpression()
	 * @see #getMultiExpression()
	 * @generated
	 */
	EReference getMultiExpression_Expression();

	/**
	 * Returns the meta object for enum '{@link net.mlanoe.language.vhdl.expression.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unary Operator</em>'.
	 * @see net.mlanoe.language.vhdl.expression.UnaryOperator
	 * @generated
	 */
	EEnum getUnaryOperator();

	/**
	 * Returns the meta object for enum '{@link net.mlanoe.language.vhdl.expression.MultiplyingOperator <em>Multiplying Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiplying Operator</em>'.
	 * @see net.mlanoe.language.vhdl.expression.MultiplyingOperator
	 * @generated
	 */
	EEnum getMultiplyingOperator();

	/**
	 * Returns the meta object for enum '{@link net.mlanoe.language.vhdl.expression.ShiftOperator <em>Shift Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Shift Operator</em>'.
	 * @see net.mlanoe.language.vhdl.expression.ShiftOperator
	 * @generated
	 */
	EEnum getShiftOperator();

	/**
	 * Returns the meta object for enum '{@link net.mlanoe.language.vhdl.expression.RelationalOperator <em>Relational Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Relational Operator</em>'.
	 * @see net.mlanoe.language.vhdl.expression.RelationalOperator
	 * @generated
	 */
	EEnum getRelationalOperator();

	/**
	 * Returns the meta object for enum '{@link net.mlanoe.language.vhdl.expression.LogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logical Operator</em>'.
	 * @see net.mlanoe.language.vhdl.expression.LogicalOperator
	 * @generated
	 */
	EEnum getLogicalOperator();

	/**
	 * Returns the meta object for enum '{@link net.mlanoe.language.vhdl.expression.AddingOperator <em>Adding Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Adding Operator</em>'.
	 * @see net.mlanoe.language.vhdl.expression.AddingOperator
	 * @generated
	 */
	EEnum getAddingOperator();

	/**
	 * Returns the meta object for enum '{@link net.mlanoe.language.vhdl.expression.Sign <em>Sign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sign</em>'.
	 * @see net.mlanoe.language.vhdl.expression.Sign
	 * @generated
	 */
	EEnum getSign();

	/**
	 * Returns the meta object for enum '{@link net.mlanoe.language.vhdl.expression.RangeDirection <em>Range Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Range Direction</em>'.
	 * @see net.mlanoe.language.vhdl.expression.RangeDirection
	 * @generated
	 */
	EEnum getRangeDirection();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExpressionFactory getExpressionFactory();

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
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.impl.AddingExpressionImpl <em>Adding Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.impl.AddingExpressionImpl
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getAddingExpression()
		 * @generated
		 */
		EClass ADDING_EXPRESSION = eINSTANCE.getAddingExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDING_EXPRESSION__OPERATOR = eINSTANCE.getAddingExpression_Operator();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.impl.AggregateExpressionImpl <em>Aggregate Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.impl.AggregateExpressionImpl
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getAggregateExpression()
		 * @generated
		 */
		EClass AGGREGATE_EXPRESSION = eINSTANCE.getAggregateExpression();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.impl.AllExpressionImpl <em>All Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.impl.AllExpressionImpl
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getAllExpression()
		 * @generated
		 */
		EClass ALL_EXPRESSION = eINSTANCE.getAllExpression();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.impl.AllocatorExpressionImpl <em>Allocator Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.impl.AllocatorExpressionImpl
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getAllocatorExpression()
		 * @generated
		 */
		EClass ALLOCATOR_EXPRESSION = eINSTANCE.getAllocatorExpression();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.impl.AssociationExpressionImpl <em>Association Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.impl.AssociationExpressionImpl
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getAssociationExpression()
		 * @generated
		 */
		EClass ASSOCIATION_EXPRESSION = eINSTANCE.getAssociationExpression();

		/**
		 * The meta object literal for the '<em><b>Choice</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_EXPRESSION__CHOICE = eINSTANCE.getAssociationExpression_Choice();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_EXPRESSION__EXPRESSION = eINSTANCE.getAssociationExpression_Expression();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.impl.AttributeExpressionImpl <em>Attribute Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.impl.AttributeExpressionImpl
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getAttributeExpression()
		 * @generated
		 */
		EClass ATTRIBUTE_EXPRESSION = eINSTANCE.getAttributeExpression();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_EXPRESSION__SIGNATURE = eINSTANCE.getAttributeExpression_Signature();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.impl.BinaryExpressionImpl
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__LEFT = eINSTANCE.getBinaryExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__RIGHT = eINSTANCE.getBinaryExpression_Right();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.impl.BitStringExpressionImpl <em>Bit String Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.impl.BitStringExpressionImpl
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getBitStringExpression()
		 * @generated
		 */
		EClass BIT_STRING_EXPRESSION = eINSTANCE.getBitStringExpression();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionImpl
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.impl.IndicationExpressionImpl <em>Indication Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.impl.IndicationExpressionImpl
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getIndicationExpression()
		 * @generated
		 */
		EClass INDICATION_EXPRESSION = eINSTANCE.getIndicationExpression();

		/**
		 * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDICATION_EXPRESSION__CONSTRAINT = eINSTANCE.getIndicationExpression_Constraint();

		/**
		 * The meta object literal for the '<em><b>Tolerance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDICATION_EXPRESSION__TOLERANCE = eINSTANCE.getIndicationExpression_Tolerance();

		/**
		 * The meta object literal for the '<em><b>Across</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDICATION_EXPRESSION__ACROSS = eINSTANCE.getIndicationExpression_Across();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.impl.SubtypeIndicationExpressionImpl <em>Subtype Indication Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.impl.SubtypeIndicationExpressionImpl
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getSubtypeIndicationExpression()
		 * @generated
		 */
		EClass SUBTYPE_INDICATION_EXPRESSION = eINSTANCE.getSubtypeIndicationExpression();

		/**
		 * The meta object literal for the '<em><b>Mark</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTYPE_INDICATION_EXPRESSION__MARK = eINSTANCE.getSubtypeIndicationExpression_Mark();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.impl.SubnatureIndicationExpressionImpl <em>Subnature Indication Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.impl.SubnatureIndicationExpressionImpl
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getSubnatureIndicationExpression()
		 * @generated
		 */
		EClass SUBNATURE_INDICATION_EXPRESSION = eINSTANCE.getSubnatureIndicationExpression();

		/**
		 * The meta object literal for the '<em><b>Mark</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBNATURE_INDICATION_EXPRESSION__MARK = eINSTANCE.getSubnatureIndicationExpression_Mark();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.impl.LogicalExpressionImpl <em>Logical Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.impl.LogicalExpressionImpl
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getLogicalExpression()
		 * @generated
		 */
		EClass LOGICAL_EXPRESSION = eINSTANCE.getLogicalExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_EXPRESSION__OPERATOR = eINSTANCE.getLogicalExpression_Operator();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.impl.NameExpressionImpl <em>Name Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.impl.NameExpressionImpl
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getNameExpression()
		 * @generated
		 */
		EClass NAME_EXPRESSION = eINSTANCE.getNameExpression();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_EXPRESSION__ELEMENT = eINSTANCE.getNameExpression_Element();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.impl.NullExpressionImpl <em>Null Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.impl.NullExpressionImpl
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getNullExpression()
		 * @generated
		 */
		EClass NULL_EXPRESSION = eINSTANCE.getNullExpression();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.impl.MultiplyingExpressionImpl <em>Multiplying Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.impl.MultiplyingExpressionImpl
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getMultiplyingExpression()
		 * @generated
		 */
		EClass MULTIPLYING_EXPRESSION = eINSTANCE.getMultiplyingExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLYING_EXPRESSION__OPERATOR = eINSTANCE.getMultiplyingExpression_Operator();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.impl.PowerExpressionImpl <em>Power Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.impl.PowerExpressionImpl
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getPowerExpression()
		 * @generated
		 */
		EClass POWER_EXPRESSION = eINSTANCE.getPowerExpression();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.impl.RelationalExpressionImpl <em>Relational Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.impl.RelationalExpressionImpl
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getRelationalExpression()
		 * @generated
		 */
		EClass RELATIONAL_EXPRESSION = eINSTANCE.getRelationalExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONAL_EXPRESSION__OPERATOR = eINSTANCE.getRelationalExpression_Operator();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.impl.ShiftExpressionImpl <em>Shift Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.impl.ShiftExpressionImpl
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getShiftExpression()
		 * @generated
		 */
		EClass SHIFT_EXPRESSION = eINSTANCE.getShiftExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHIFT_EXPRESSION__OPERATOR = eINSTANCE.getShiftExpression_Operator();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.impl.SignatureExpressionImpl <em>Signature Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.impl.SignatureExpressionImpl
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getSignatureExpression()
		 * @generated
		 */
		EClass SIGNATURE_EXPRESSION = eINSTANCE.getSignatureExpression();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE_EXPRESSION__SIGNATURE = eINSTANCE.getSignatureExpression_Signature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE_EXPRESSION__NAME = eINSTANCE.getSignatureExpression_Name();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.impl.SignExpressionImpl <em>Sign Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.impl.SignExpressionImpl
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getSignExpression()
		 * @generated
		 */
		EClass SIGN_EXPRESSION = eINSTANCE.getSignExpression();

		/**
		 * The meta object literal for the '<em><b>Sign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGN_EXPRESSION__SIGN = eINSTANCE.getSignExpression_Sign();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGN_EXPRESSION__EXPRESSION = eINSTANCE.getSignExpression_Expression();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.impl.UnaryExpressionImpl
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getUnaryExpression()
		 * @generated
		 */
		EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_EXPRESSION__OPERATOR = eINSTANCE.getUnaryExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXPRESSION__EXPRESSION = eINSTANCE.getUnaryExpression_Expression();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.impl.OpenExpressionImpl <em>Open Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.impl.OpenExpressionImpl
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getOpenExpression()
		 * @generated
		 */
		EClass OPEN_EXPRESSION = eINSTANCE.getOpenExpression();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.impl.OthersExpressionImpl <em>Others Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.impl.OthersExpressionImpl
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getOthersExpression()
		 * @generated
		 */
		EClass OTHERS_EXPRESSION = eINSTANCE.getOthersExpression();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.impl.RangeExpressionImpl <em>Range Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.impl.RangeExpressionImpl
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getRangeExpression()
		 * @generated
		 */
		EClass RANGE_EXPRESSION = eINSTANCE.getRangeExpression();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_EXPRESSION__DIRECTION = eINSTANCE.getRangeExpression_Direction();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.impl.StringExpressionImpl <em>String Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.impl.StringExpressionImpl
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getStringExpression()
		 * @generated
		 */
		EClass STRING_EXPRESSION = eINSTANCE.getStringExpression();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.impl.CharacterExpressionImpl <em>Character Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.impl.CharacterExpressionImpl
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getCharacterExpression()
		 * @generated
		 */
		EClass CHARACTER_EXPRESSION = eINSTANCE.getCharacterExpression();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.impl.IdentifierExpressionImpl <em>Identifier Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.impl.IdentifierExpressionImpl
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getIdentifierExpression()
		 * @generated
		 */
		EClass IDENTIFIER_EXPRESSION = eINSTANCE.getIdentifierExpression();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.impl.UnitValueExpressionImpl <em>Unit Value Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.impl.UnitValueExpressionImpl
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getUnitValueExpression()
		 * @generated
		 */
		EClass UNIT_VALUE_EXPRESSION = eINSTANCE.getUnitValueExpression();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_VALUE_EXPRESSION__UNIT = eINSTANCE.getUnitValueExpression_Unit();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.impl.UnaffectedExpressionImpl <em>Unaffected Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.impl.UnaffectedExpressionImpl
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getUnaffectedExpression()
		 * @generated
		 */
		EClass UNAFFECTED_EXPRESSION = eINSTANCE.getUnaffectedExpression();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.impl.ValueExpressionImpl <em>Value Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.impl.ValueExpressionImpl
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getValueExpression()
		 * @generated
		 */
		EClass VALUE_EXPRESSION = eINSTANCE.getValueExpression();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_EXPRESSION__VALUE = eINSTANCE.getValueExpression_Value();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.impl.WaveformExpressionImpl <em>Waveform Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.impl.WaveformExpressionImpl
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getWaveformExpression()
		 * @generated
		 */
		EClass WAVEFORM_EXPRESSION = eINSTANCE.getWaveformExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAVEFORM_EXPRESSION__EXPRESSION = eINSTANCE.getWaveformExpression_Expression();

		/**
		 * The meta object literal for the '<em><b>After</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WAVEFORM_EXPRESSION__AFTER = eINSTANCE.getWaveformExpression_After();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.impl.MultiExpressionImpl <em>Multi Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.impl.MultiExpressionImpl
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getMultiExpression()
		 * @generated
		 */
		EClass MULTI_EXPRESSION = eINSTANCE.getMultiExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_EXPRESSION__EXPRESSION = eINSTANCE.getMultiExpression_Expression();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.UnaryOperator <em>Unary Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.UnaryOperator
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getUnaryOperator()
		 * @generated
		 */
		EEnum UNARY_OPERATOR = eINSTANCE.getUnaryOperator();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.MultiplyingOperator <em>Multiplying Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.MultiplyingOperator
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getMultiplyingOperator()
		 * @generated
		 */
		EEnum MULTIPLYING_OPERATOR = eINSTANCE.getMultiplyingOperator();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.ShiftOperator <em>Shift Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.ShiftOperator
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getShiftOperator()
		 * @generated
		 */
		EEnum SHIFT_OPERATOR = eINSTANCE.getShiftOperator();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.RelationalOperator <em>Relational Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.RelationalOperator
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getRelationalOperator()
		 * @generated
		 */
		EEnum RELATIONAL_OPERATOR = eINSTANCE.getRelationalOperator();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.LogicalOperator <em>Logical Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.LogicalOperator
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getLogicalOperator()
		 * @generated
		 */
		EEnum LOGICAL_OPERATOR = eINSTANCE.getLogicalOperator();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.AddingOperator <em>Adding Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.AddingOperator
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getAddingOperator()
		 * @generated
		 */
		EEnum ADDING_OPERATOR = eINSTANCE.getAddingOperator();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.Sign <em>Sign</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.Sign
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getSign()
		 * @generated
		 */
		EEnum SIGN = eINSTANCE.getSign();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.expression.RangeDirection <em>Range Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.expression.RangeDirection
		 * @see net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl#getRangeDirection()
		 * @generated
		 */
		EEnum RANGE_DIRECTION = eINSTANCE.getRangeDirection();

	}

} //ExpressionPackage
