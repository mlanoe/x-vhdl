/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.declaration;

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
 * @see net.mlanoe.language.vhdl.declaration.DeclarationFactory
 * @model kind="package"
 * @generated
 */
public interface DeclarationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "declaration";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mlanoe.net/language/vhdl/declaration/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "declaration";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DeclarationPackage eINSTANCE = net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.declaration.impl.DeclarationImpl <em>Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationImpl
	 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getDeclaration()
	 * @generated
	 */
	int DECLARATION = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION__ID = VhdlPackage.VHDL_OBJECT__ID;

	/**
	 * The number of structural features of the '<em>Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECLARATION_FEATURE_COUNT = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.declaration.impl.AliasDeclarationImpl <em>Alias Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.declaration.impl.AliasDeclarationImpl
	 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getAliasDeclaration()
	 * @generated
	 */
	int ALIAS_DECLARATION = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_DECLARATION__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_DECLARATION__NAME = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_DECLARATION__ALIAS = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_DECLARATION__IS = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Alias Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.declaration.impl.AttributeDeclarationImpl <em>Attribute Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.declaration.impl.AttributeDeclarationImpl
	 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getAttributeDeclaration()
	 * @generated
	 */
	int ATTRIBUTE_DECLARATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DECLARATION__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DECLARATION__NAME = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DECLARATION__TYPE = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.declaration.impl.AttributeSpecificationImpl <em>Attribute Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.declaration.impl.AttributeSpecificationImpl
	 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getAttributeSpecification()
	 * @generated
	 */
	int ATTRIBUTE_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SPECIFICATION__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SPECIFICATION__NAME = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SPECIFICATION__ENTITY = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SPECIFICATION__CLASS = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SPECIFICATION__IS = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Attribute Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SPECIFICATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.declaration.impl.QuantityDeclarationImpl <em>Quantity Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.declaration.impl.QuantityDeclarationImpl
	 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getQuantityDeclaration()
	 * @generated
	 */
	int QUANTITY_DECLARATION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_DECLARATION__ID = DECLARATION__ID;

	/**
	 * The number of structural features of the '<em>Quantity Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.declaration.impl.BranchQuantityDeclarationImpl <em>Branch Quantity Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.declaration.impl.BranchQuantityDeclarationImpl
	 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getBranchQuantityDeclaration()
	 * @generated
	 */
	int BRANCH_QUANTITY_DECLARATION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_QUANTITY_DECLARATION__ID = QUANTITY_DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Across</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_QUANTITY_DECLARATION__ACROSS = QUANTITY_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Through</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_QUANTITY_DECLARATION__THROUGH = QUANTITY_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_QUANTITY_DECLARATION__LEFT = QUANTITY_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_QUANTITY_DECLARATION__RIGHT = QUANTITY_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Branch Quantity Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_QUANTITY_DECLARATION_FEATURE_COUNT = QUANTITY_DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.declaration.impl.FreeQuantityDeclarationImpl <em>Free Quantity Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.declaration.impl.FreeQuantityDeclarationImpl
	 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getFreeQuantityDeclaration()
	 * @generated
	 */
	int FREE_QUANTITY_DECLARATION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_QUANTITY_DECLARATION__ID = QUANTITY_DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_QUANTITY_DECLARATION__NAME = QUANTITY_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_QUANTITY_DECLARATION__TYPE = QUANTITY_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_QUANTITY_DECLARATION__QUANTITY = QUANTITY_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Free Quantity Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FREE_QUANTITY_DECLARATION_FEATURE_COUNT = QUANTITY_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.declaration.impl.LimitDeclarationImpl <em>Limit Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.declaration.impl.LimitDeclarationImpl
	 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getLimitDeclaration()
	 * @generated
	 */
	int LIMIT_DECLARATION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_DECLARATION__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_DECLARATION__NAME = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_DECLARATION__TYPE = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_DECLARATION__VALUE = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Limit Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIMIT_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.declaration.impl.SourceQuantityDeclarationImpl <em>Source Quantity Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.declaration.impl.SourceQuantityDeclarationImpl
	 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getSourceQuantityDeclaration()
	 * @generated
	 */
	int SOURCE_QUANTITY_DECLARATION = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_QUANTITY_DECLARATION__ID = QUANTITY_DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_QUANTITY_DECLARATION__NAME = QUANTITY_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_QUANTITY_DECLARATION__TYPE = QUANTITY_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_QUANTITY_DECLARATION__SOURCE = QUANTITY_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Source Quantity Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_QUANTITY_DECLARATION_FEATURE_COUNT = QUANTITY_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.declaration.impl.SubnatureDeclarationImpl <em>Subnature Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.declaration.impl.SubnatureDeclarationImpl
	 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getSubnatureDeclaration()
	 * @generated
	 */
	int SUBNATURE_DECLARATION = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNATURE_DECLARATION__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNATURE_DECLARATION__NAME = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNATURE_DECLARATION__NATURE = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Subnature Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBNATURE_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.declaration.impl.SubprogramDeclarationImpl <em>Subprogram Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.declaration.impl.SubprogramDeclarationImpl
	 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getSubprogramDeclaration()
	 * @generated
	 */
	int SUBPROGRAM_DECLARATION = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_DECLARATION__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_DECLARATION__NAME = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_DECLARATION__PARAMETER = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_DECLARATION__BODY = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Subprogram Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.declaration.impl.ProcedureDeclarationImpl <em>Procedure Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.declaration.impl.ProcedureDeclarationImpl
	 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getProcedureDeclaration()
	 * @generated
	 */
	int PROCEDURE_DECLARATION = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DECLARATION__ID = SUBPROGRAM_DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DECLARATION__NAME = SUBPROGRAM_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DECLARATION__PARAMETER = SUBPROGRAM_DECLARATION__PARAMETER;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DECLARATION__BODY = SUBPROGRAM_DECLARATION__BODY;

	/**
	 * The number of structural features of the '<em>Procedure Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCEDURE_DECLARATION_FEATURE_COUNT = SUBPROGRAM_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.declaration.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.declaration.impl.FunctionDeclarationImpl
	 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getFunctionDeclaration()
	 * @generated
	 */
	int FUNCTION_DECLARATION = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__ID = SUBPROGRAM_DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__NAME = SUBPROGRAM_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__PARAMETER = SUBPROGRAM_DECLARATION__PARAMETER;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__BODY = SUBPROGRAM_DECLARATION__BODY;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__TYPE = SUBPROGRAM_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Purity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__PURITY = SUBPROGRAM_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION_FEATURE_COUNT = SUBPROGRAM_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.declaration.impl.SubprogramBodyImpl <em>Subprogram Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.declaration.impl.SubprogramBodyImpl
	 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getSubprogramBody()
	 * @generated
	 */
	int SUBPROGRAM_BODY = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_BODY__ID = VhdlPackage.VHDL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Declaration</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_BODY__DECLARATION = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_BODY__STATEMENT = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Subprogram Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBPROGRAM_BODY_FEATURE_COUNT = VhdlPackage.VHDL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.declaration.impl.SubtypeDeclarationImpl <em>Subtype Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.declaration.impl.SubtypeDeclarationImpl
	 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getSubtypeDeclaration()
	 * @generated
	 */
	int SUBTYPE_DECLARATION = 13;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTYPE_DECLARATION__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTYPE_DECLARATION__NAME = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTYPE_DECLARATION__TYPE = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Subtype Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTYPE_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.declaration.impl.ConfigurationSpecificationImpl <em>Configuration Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.declaration.impl.ConfigurationSpecificationImpl
	 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getConfigurationSpecification()
	 * @generated
	 */
	int CONFIGURATION_SPECIFICATION = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SPECIFICATION__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SPECIFICATION__LIST = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SPECIFICATION__COMPONENT = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SPECIFICATION__ENTITY = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SPECIFICATION__CONFIGURATION = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Generic Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SPECIFICATION__GENERIC_MAP = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Port Map</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SPECIFICATION__PORT_MAP = DECLARATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Configuration Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_SPECIFICATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.declaration.impl.DisconnectionSpecificationImpl <em>Disconnection Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.declaration.impl.DisconnectionSpecificationImpl
	 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getDisconnectionSpecification()
	 * @generated
	 */
	int DISCONNECTION_SPECIFICATION = 16;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTION_SPECIFICATION__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTION_SPECIFICATION__TYPE = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Disconnect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTION_SPECIFICATION__DISCONNECT = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>After</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTION_SPECIFICATION__AFTER = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Disconnection Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCONNECTION_SPECIFICATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.declaration.impl.FileDeclarationImpl <em>File Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.declaration.impl.FileDeclarationImpl
	 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getFileDeclaration()
	 * @generated
	 */
	int FILE_DECLARATION = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DECLARATION__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DECLARATION__NAME = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DECLARATION__TYPE = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Open</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DECLARATION__OPEN = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DECLARATION__IS = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>File Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.declaration.impl.TerminalDeclarationImpl <em>Terminal Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.declaration.impl.TerminalDeclarationImpl
	 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getTerminalDeclaration()
	 * @generated
	 */
	int TERMINAL_DECLARATION = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_DECLARATION__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_DECLARATION__NAME = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_DECLARATION__NATURE = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Terminal Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINAL_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.declaration.impl.TypeDeclarationImpl <em>Type Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.declaration.impl.TypeDeclarationImpl
	 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getTypeDeclaration()
	 * @generated
	 */
	int TYPE_DECLARATION = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__NAME = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__IS = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.declaration.impl.ValueDeclarationImpl <em>Value Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.declaration.impl.ValueDeclarationImpl
	 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getValueDeclaration()
	 * @generated
	 */
	int VALUE_DECLARATION = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DECLARATION__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DECLARATION__NAME = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DECLARATION__TYPE = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DECLARATION__INITIAL = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Value Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.declaration.impl.ConstantDeclarationImpl <em>Constant Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.declaration.impl.ConstantDeclarationImpl
	 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getConstantDeclaration()
	 * @generated
	 */
	int CONSTANT_DECLARATION = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DECLARATION__ID = VALUE_DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DECLARATION__NAME = VALUE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DECLARATION__TYPE = VALUE_DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DECLARATION__INITIAL = VALUE_DECLARATION__INITIAL;

	/**
	 * The number of structural features of the '<em>Constant Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DECLARATION_FEATURE_COUNT = VALUE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.declaration.impl.GroupDeclarationImpl <em>Group Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.declaration.impl.GroupDeclarationImpl
	 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getGroupDeclaration()
	 * @generated
	 */
	int GROUP_DECLARATION = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_DECLARATION__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_DECLARATION__NAME = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_DECLARATION__IS = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Member</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_DECLARATION__MEMBER = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Group Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.declaration.impl.GroupTemplateDeclarationImpl <em>Group Template Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.declaration.impl.GroupTemplateDeclarationImpl
	 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getGroupTemplateDeclaration()
	 * @generated
	 */
	int GROUP_TEMPLATE_DECLARATION = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TEMPLATE_DECLARATION__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TEMPLATE_DECLARATION__NAME = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TEMPLATE_DECLARATION__ENTRY = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Group Template Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GROUP_TEMPLATE_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.declaration.impl.NatureDeclarationImpl <em>Nature Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.declaration.impl.NatureDeclarationImpl
	 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getNatureDeclaration()
	 * @generated
	 */
	int NATURE_DECLARATION = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE_DECLARATION__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE_DECLARATION__NAME = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE_DECLARATION__IS = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Nature Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATURE_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.declaration.impl.SignalDeclarationImpl <em>Signal Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.declaration.impl.SignalDeclarationImpl
	 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getSignalDeclaration()
	 * @generated
	 */
	int SIGNAL_DECLARATION = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_DECLARATION__ID = VALUE_DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_DECLARATION__NAME = VALUE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_DECLARATION__TYPE = VALUE_DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_DECLARATION__INITIAL = VALUE_DECLARATION__INITIAL;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_DECLARATION__KIND = VALUE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_DECLARATION__MODE = VALUE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Signal Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_DECLARATION_FEATURE_COUNT = VALUE_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.declaration.impl.UseClauseDeclarationImpl <em>Use Clause Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.declaration.impl.UseClauseDeclarationImpl
	 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getUseClauseDeclaration()
	 * @generated
	 */
	int USE_CLAUSE_DECLARATION = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CLAUSE_DECLARATION__ID = DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CLAUSE_DECLARATION__USE = DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Use Clause Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USE_CLAUSE_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.declaration.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.declaration.impl.VariableDeclarationImpl
	 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getVariableDeclaration()
	 * @generated
	 */
	int VARIABLE_DECLARATION = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__ID = VALUE_DECLARATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__NAME = VALUE_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__TYPE = VALUE_DECLARATION__TYPE;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__INITIAL = VALUE_DECLARATION__INITIAL;

	/**
	 * The feature id for the '<em><b>Shared</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__SHARED = VALUE_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION__MODE = VALUE_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_DECLARATION_FEATURE_COUNT = VALUE_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.declaration.SignalKind <em>Signal Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.declaration.SignalKind
	 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getSignalKind()
	 * @generated
	 */
	int SIGNAL_KIND = 28;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.declaration.Mode <em>Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.declaration.Mode
	 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getMode()
	 * @generated
	 */
	int MODE = 29;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.declaration.EntityClass <em>Entity Class</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.declaration.EntityClass
	 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getEntityClass()
	 * @generated
	 */
	int ENTITY_CLASS = 30;

	/**
	 * The meta object id for the '{@link net.mlanoe.language.vhdl.declaration.Purity <em>Purity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mlanoe.language.vhdl.declaration.Purity
	 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getPurity()
	 * @generated
	 */
	int PURITY = 31;


	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.declaration.AliasDeclaration <em>Alias Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alias Declaration</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.AliasDeclaration
	 * @generated
	 */
	EClass getAliasDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.declaration.AliasDeclaration#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alias</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.AliasDeclaration#getAlias()
	 * @see #getAliasDeclaration()
	 * @generated
	 */
	EReference getAliasDeclaration_Alias();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.declaration.AliasDeclaration#getIs <em>Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.AliasDeclaration#getIs()
	 * @see #getAliasDeclaration()
	 * @generated
	 */
	EReference getAliasDeclaration_Is();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.declaration.AttributeDeclaration <em>Attribute Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Declaration</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.AttributeDeclaration
	 * @generated
	 */
	EClass getAttributeDeclaration();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.declaration.AttributeSpecification <em>Attribute Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Specification</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.AttributeSpecification
	 * @generated
	 */
	EClass getAttributeSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.declaration.AttributeSpecification#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.AttributeSpecification#getEntity()
	 * @see #getAttributeSpecification()
	 * @generated
	 */
	EReference getAttributeSpecification_Entity();

	/**
	 * Returns the meta object for the attribute '{@link net.mlanoe.language.vhdl.declaration.AttributeSpecification#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.AttributeSpecification#getClass_()
	 * @see #getAttributeSpecification()
	 * @generated
	 */
	EAttribute getAttributeSpecification_Class();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.declaration.AttributeSpecification#getIs <em>Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.AttributeSpecification#getIs()
	 * @see #getAttributeSpecification()
	 * @generated
	 */
	EReference getAttributeSpecification_Is();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.declaration.BranchQuantityDeclaration <em>Branch Quantity Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch Quantity Declaration</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.BranchQuantityDeclaration
	 * @generated
	 */
	EClass getBranchQuantityDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.declaration.BranchQuantityDeclaration#getAcross <em>Across</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Across</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.BranchQuantityDeclaration#getAcross()
	 * @see #getBranchQuantityDeclaration()
	 * @generated
	 */
	EReference getBranchQuantityDeclaration_Across();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.declaration.BranchQuantityDeclaration#getThrough <em>Through</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Through</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.BranchQuantityDeclaration#getThrough()
	 * @see #getBranchQuantityDeclaration()
	 * @generated
	 */
	EReference getBranchQuantityDeclaration_Through();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.declaration.BranchQuantityDeclaration#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.BranchQuantityDeclaration#getLeft()
	 * @see #getBranchQuantityDeclaration()
	 * @generated
	 */
	EReference getBranchQuantityDeclaration_Left();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.declaration.BranchQuantityDeclaration#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.BranchQuantityDeclaration#getRight()
	 * @see #getBranchQuantityDeclaration()
	 * @generated
	 */
	EReference getBranchQuantityDeclaration_Right();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.declaration.FreeQuantityDeclaration <em>Free Quantity Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Free Quantity Declaration</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.FreeQuantityDeclaration
	 * @generated
	 */
	EClass getFreeQuantityDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.declaration.FreeQuantityDeclaration#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Quantity</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.FreeQuantityDeclaration#getQuantity()
	 * @see #getFreeQuantityDeclaration()
	 * @generated
	 */
	EReference getFreeQuantityDeclaration_Quantity();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.declaration.LimitDeclaration <em>Limit Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Limit Declaration</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.LimitDeclaration
	 * @generated
	 */
	EClass getLimitDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.declaration.LimitDeclaration#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.LimitDeclaration#getValue()
	 * @see #getLimitDeclaration()
	 * @generated
	 */
	EReference getLimitDeclaration_Value();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.declaration.QuantityDeclaration <em>Quantity Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity Declaration</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.QuantityDeclaration
	 * @generated
	 */
	EClass getQuantityDeclaration();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.declaration.SourceQuantityDeclaration <em>Source Quantity Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Quantity Declaration</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.SourceQuantityDeclaration
	 * @generated
	 */
	EClass getSourceQuantityDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.declaration.SourceQuantityDeclaration#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.SourceQuantityDeclaration#getSource()
	 * @see #getSourceQuantityDeclaration()
	 * @generated
	 */
	EReference getSourceQuantityDeclaration_Source();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.declaration.SubnatureDeclaration <em>Subnature Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subnature Declaration</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.SubnatureDeclaration
	 * @generated
	 */
	EClass getSubnatureDeclaration();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.declaration.SubprogramDeclaration <em>Subprogram Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subprogram Declaration</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.SubprogramDeclaration
	 * @generated
	 */
	EClass getSubprogramDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.declaration.SubprogramDeclaration#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.SubprogramDeclaration#getParameter()
	 * @see #getSubprogramDeclaration()
	 * @generated
	 */
	EReference getSubprogramDeclaration_Parameter();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.declaration.SubprogramDeclaration#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.SubprogramDeclaration#getBody()
	 * @see #getSubprogramDeclaration()
	 * @generated
	 */
	EReference getSubprogramDeclaration_Body();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.declaration.ProcedureDeclaration <em>Procedure Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Procedure Declaration</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.ProcedureDeclaration
	 * @generated
	 */
	EClass getProcedureDeclaration();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.declaration.FunctionDeclaration <em>Function Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Declaration</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.FunctionDeclaration
	 * @generated
	 */
	EClass getFunctionDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link net.mlanoe.language.vhdl.declaration.FunctionDeclaration#getPurity <em>Purity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purity</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.FunctionDeclaration#getPurity()
	 * @see #getFunctionDeclaration()
	 * @generated
	 */
	EAttribute getFunctionDeclaration_Purity();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.declaration.SubprogramBody <em>Subprogram Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subprogram Body</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.SubprogramBody
	 * @generated
	 */
	EClass getSubprogramBody();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.declaration.SubprogramBody#getDeclaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declaration</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.SubprogramBody#getDeclaration()
	 * @see #getSubprogramBody()
	 * @generated
	 */
	EReference getSubprogramBody_Declaration();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mlanoe.language.vhdl.declaration.SubprogramBody#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statement</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.SubprogramBody#getStatement()
	 * @see #getSubprogramBody()
	 * @generated
	 */
	EReference getSubprogramBody_Statement();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.declaration.SubtypeDeclaration <em>Subtype Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtype Declaration</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.SubtypeDeclaration
	 * @generated
	 */
	EClass getSubtypeDeclaration();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.declaration.ConfigurationSpecification <em>Configuration Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration Specification</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.ConfigurationSpecification
	 * @generated
	 */
	EClass getConfigurationSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.declaration.ConfigurationSpecification#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.ConfigurationSpecification#getList()
	 * @see #getConfigurationSpecification()
	 * @generated
	 */
	EReference getConfigurationSpecification_List();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.declaration.ConfigurationSpecification#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Component</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.ConfigurationSpecification#getComponent()
	 * @see #getConfigurationSpecification()
	 * @generated
	 */
	EReference getConfigurationSpecification_Component();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.declaration.ConfigurationSpecification#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entity</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.ConfigurationSpecification#getEntity()
	 * @see #getConfigurationSpecification()
	 * @generated
	 */
	EReference getConfigurationSpecification_Entity();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.declaration.ConfigurationSpecification#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Configuration</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.ConfigurationSpecification#getConfiguration()
	 * @see #getConfigurationSpecification()
	 * @generated
	 */
	EReference getConfigurationSpecification_Configuration();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.declaration.ConfigurationSpecification#getGenericMap <em>Generic Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Generic Map</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.ConfigurationSpecification#getGenericMap()
	 * @see #getConfigurationSpecification()
	 * @generated
	 */
	EReference getConfigurationSpecification_GenericMap();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.declaration.ConfigurationSpecification#getPortMap <em>Port Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Port Map</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.ConfigurationSpecification#getPortMap()
	 * @see #getConfigurationSpecification()
	 * @generated
	 */
	EReference getConfigurationSpecification_PortMap();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.declaration.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Declaration</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.Declaration
	 * @generated
	 */
	EClass getDeclaration();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.declaration.DisconnectionSpecification <em>Disconnection Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Disconnection Specification</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.DisconnectionSpecification
	 * @generated
	 */
	EClass getDisconnectionSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.declaration.DisconnectionSpecification#getDisconnect <em>Disconnect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Disconnect</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.DisconnectionSpecification#getDisconnect()
	 * @see #getDisconnectionSpecification()
	 * @generated
	 */
	EReference getDisconnectionSpecification_Disconnect();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.declaration.DisconnectionSpecification#getAfter <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>After</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.DisconnectionSpecification#getAfter()
	 * @see #getDisconnectionSpecification()
	 * @generated
	 */
	EReference getDisconnectionSpecification_After();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.declaration.FileDeclaration <em>File Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Declaration</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.FileDeclaration
	 * @generated
	 */
	EClass getFileDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.declaration.FileDeclaration#getOpen <em>Open</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Open</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.FileDeclaration#getOpen()
	 * @see #getFileDeclaration()
	 * @generated
	 */
	EReference getFileDeclaration_Open();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.declaration.FileDeclaration#getIs <em>Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.FileDeclaration#getIs()
	 * @see #getFileDeclaration()
	 * @generated
	 */
	EReference getFileDeclaration_Is();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.declaration.TerminalDeclaration <em>Terminal Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminal Declaration</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.TerminalDeclaration
	 * @generated
	 */
	EClass getTerminalDeclaration();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.declaration.TypeDeclaration <em>Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Declaration</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.TypeDeclaration
	 * @generated
	 */
	EClass getTypeDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.declaration.TypeDeclaration#getIs <em>Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.TypeDeclaration#getIs()
	 * @see #getTypeDeclaration()
	 * @generated
	 */
	EReference getTypeDeclaration_Is();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.declaration.ConstantDeclaration <em>Constant Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Declaration</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.ConstantDeclaration
	 * @generated
	 */
	EClass getConstantDeclaration();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.declaration.GroupDeclaration <em>Group Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Declaration</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.GroupDeclaration
	 * @generated
	 */
	EClass getGroupDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.declaration.GroupDeclaration#getIs <em>Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.GroupDeclaration#getIs()
	 * @see #getGroupDeclaration()
	 * @generated
	 */
	EReference getGroupDeclaration_Is();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.declaration.GroupDeclaration#getMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Member</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.GroupDeclaration#getMember()
	 * @see #getGroupDeclaration()
	 * @generated
	 */
	EReference getGroupDeclaration_Member();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.declaration.GroupTemplateDeclaration <em>Group Template Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Group Template Declaration</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.GroupTemplateDeclaration
	 * @generated
	 */
	EClass getGroupTemplateDeclaration();

	/**
	 * Returns the meta object for the attribute list '{@link net.mlanoe.language.vhdl.declaration.GroupTemplateDeclaration#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Entry</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.GroupTemplateDeclaration#getEntry()
	 * @see #getGroupTemplateDeclaration()
	 * @generated
	 */
	EAttribute getGroupTemplateDeclaration_Entry();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.declaration.NatureDeclaration <em>Nature Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nature Declaration</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.NatureDeclaration
	 * @generated
	 */
	EClass getNatureDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.declaration.NatureDeclaration#getIs <em>Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Is</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.NatureDeclaration#getIs()
	 * @see #getNatureDeclaration()
	 * @generated
	 */
	EReference getNatureDeclaration_Is();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.declaration.SignalDeclaration <em>Signal Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal Declaration</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.SignalDeclaration
	 * @generated
	 */
	EClass getSignalDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link net.mlanoe.language.vhdl.declaration.SignalDeclaration#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.SignalDeclaration#getKind()
	 * @see #getSignalDeclaration()
	 * @generated
	 */
	EAttribute getSignalDeclaration_Kind();

	/**
	 * Returns the meta object for the attribute '{@link net.mlanoe.language.vhdl.declaration.SignalDeclaration#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.SignalDeclaration#getMode()
	 * @see #getSignalDeclaration()
	 * @generated
	 */
	EAttribute getSignalDeclaration_Mode();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.declaration.UseClauseDeclaration <em>Use Clause Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Use Clause Declaration</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.UseClauseDeclaration
	 * @generated
	 */
	EClass getUseClauseDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.declaration.UseClauseDeclaration#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Use</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.UseClauseDeclaration#getUse()
	 * @see #getUseClauseDeclaration()
	 * @generated
	 */
	EReference getUseClauseDeclaration_Use();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.declaration.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Declaration</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.VariableDeclaration
	 * @generated
	 */
	EClass getVariableDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link net.mlanoe.language.vhdl.declaration.VariableDeclaration#isShared <em>Shared</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shared</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.VariableDeclaration#isShared()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EAttribute getVariableDeclaration_Shared();

	/**
	 * Returns the meta object for the attribute '{@link net.mlanoe.language.vhdl.declaration.VariableDeclaration#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.VariableDeclaration#getMode()
	 * @see #getVariableDeclaration()
	 * @generated
	 */
	EAttribute getVariableDeclaration_Mode();

	/**
	 * Returns the meta object for class '{@link net.mlanoe.language.vhdl.declaration.ValueDeclaration <em>Value Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Declaration</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.ValueDeclaration
	 * @generated
	 */
	EClass getValueDeclaration();

	/**
	 * Returns the meta object for the containment reference '{@link net.mlanoe.language.vhdl.declaration.ValueDeclaration#getInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.ValueDeclaration#getInitial()
	 * @see #getValueDeclaration()
	 * @generated
	 */
	EReference getValueDeclaration_Initial();

	/**
	 * Returns the meta object for enum '{@link net.mlanoe.language.vhdl.declaration.SignalKind <em>Signal Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Signal Kind</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.SignalKind
	 * @generated
	 */
	EEnum getSignalKind();

	/**
	 * Returns the meta object for enum '{@link net.mlanoe.language.vhdl.declaration.Mode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mode</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.Mode
	 * @generated
	 */
	EEnum getMode();

	/**
	 * Returns the meta object for enum '{@link net.mlanoe.language.vhdl.declaration.EntityClass <em>Entity Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Entity Class</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.EntityClass
	 * @generated
	 */
	EEnum getEntityClass();

	/**
	 * Returns the meta object for enum '{@link net.mlanoe.language.vhdl.declaration.Purity <em>Purity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Purity</em>'.
	 * @see net.mlanoe.language.vhdl.declaration.Purity
	 * @generated
	 */
	EEnum getPurity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DeclarationFactory getDeclarationFactory();

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
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.declaration.impl.AliasDeclarationImpl <em>Alias Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.declaration.impl.AliasDeclarationImpl
		 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getAliasDeclaration()
		 * @generated
		 */
		EClass ALIAS_DECLARATION = eINSTANCE.getAliasDeclaration();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALIAS_DECLARATION__ALIAS = eINSTANCE.getAliasDeclaration_Alias();

		/**
		 * The meta object literal for the '<em><b>Is</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALIAS_DECLARATION__IS = eINSTANCE.getAliasDeclaration_Is();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.declaration.impl.AttributeDeclarationImpl <em>Attribute Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.declaration.impl.AttributeDeclarationImpl
		 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getAttributeDeclaration()
		 * @generated
		 */
		EClass ATTRIBUTE_DECLARATION = eINSTANCE.getAttributeDeclaration();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.declaration.impl.AttributeSpecificationImpl <em>Attribute Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.declaration.impl.AttributeSpecificationImpl
		 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getAttributeSpecification()
		 * @generated
		 */
		EClass ATTRIBUTE_SPECIFICATION = eINSTANCE.getAttributeSpecification();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_SPECIFICATION__ENTITY = eINSTANCE.getAttributeSpecification_Entity();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_SPECIFICATION__CLASS = eINSTANCE.getAttributeSpecification_Class();

		/**
		 * The meta object literal for the '<em><b>Is</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_SPECIFICATION__IS = eINSTANCE.getAttributeSpecification_Is();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.declaration.impl.BranchQuantityDeclarationImpl <em>Branch Quantity Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.declaration.impl.BranchQuantityDeclarationImpl
		 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getBranchQuantityDeclaration()
		 * @generated
		 */
		EClass BRANCH_QUANTITY_DECLARATION = eINSTANCE.getBranchQuantityDeclaration();

		/**
		 * The meta object literal for the '<em><b>Across</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH_QUANTITY_DECLARATION__ACROSS = eINSTANCE.getBranchQuantityDeclaration_Across();

		/**
		 * The meta object literal for the '<em><b>Through</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH_QUANTITY_DECLARATION__THROUGH = eINSTANCE.getBranchQuantityDeclaration_Through();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH_QUANTITY_DECLARATION__LEFT = eINSTANCE.getBranchQuantityDeclaration_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH_QUANTITY_DECLARATION__RIGHT = eINSTANCE.getBranchQuantityDeclaration_Right();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.declaration.impl.FreeQuantityDeclarationImpl <em>Free Quantity Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.declaration.impl.FreeQuantityDeclarationImpl
		 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getFreeQuantityDeclaration()
		 * @generated
		 */
		EClass FREE_QUANTITY_DECLARATION = eINSTANCE.getFreeQuantityDeclaration();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FREE_QUANTITY_DECLARATION__QUANTITY = eINSTANCE.getFreeQuantityDeclaration_Quantity();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.declaration.impl.LimitDeclarationImpl <em>Limit Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.declaration.impl.LimitDeclarationImpl
		 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getLimitDeclaration()
		 * @generated
		 */
		EClass LIMIT_DECLARATION = eINSTANCE.getLimitDeclaration();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIMIT_DECLARATION__VALUE = eINSTANCE.getLimitDeclaration_Value();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.declaration.impl.QuantityDeclarationImpl <em>Quantity Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.declaration.impl.QuantityDeclarationImpl
		 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getQuantityDeclaration()
		 * @generated
		 */
		EClass QUANTITY_DECLARATION = eINSTANCE.getQuantityDeclaration();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.declaration.impl.SourceQuantityDeclarationImpl <em>Source Quantity Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.declaration.impl.SourceQuantityDeclarationImpl
		 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getSourceQuantityDeclaration()
		 * @generated
		 */
		EClass SOURCE_QUANTITY_DECLARATION = eINSTANCE.getSourceQuantityDeclaration();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE_QUANTITY_DECLARATION__SOURCE = eINSTANCE.getSourceQuantityDeclaration_Source();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.declaration.impl.SubnatureDeclarationImpl <em>Subnature Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.declaration.impl.SubnatureDeclarationImpl
		 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getSubnatureDeclaration()
		 * @generated
		 */
		EClass SUBNATURE_DECLARATION = eINSTANCE.getSubnatureDeclaration();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.declaration.impl.SubprogramDeclarationImpl <em>Subprogram Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.declaration.impl.SubprogramDeclarationImpl
		 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getSubprogramDeclaration()
		 * @generated
		 */
		EClass SUBPROGRAM_DECLARATION = eINSTANCE.getSubprogramDeclaration();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPROGRAM_DECLARATION__PARAMETER = eINSTANCE.getSubprogramDeclaration_Parameter();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPROGRAM_DECLARATION__BODY = eINSTANCE.getSubprogramDeclaration_Body();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.declaration.impl.ProcedureDeclarationImpl <em>Procedure Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.declaration.impl.ProcedureDeclarationImpl
		 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getProcedureDeclaration()
		 * @generated
		 */
		EClass PROCEDURE_DECLARATION = eINSTANCE.getProcedureDeclaration();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.declaration.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.declaration.impl.FunctionDeclarationImpl
		 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getFunctionDeclaration()
		 * @generated
		 */
		EClass FUNCTION_DECLARATION = eINSTANCE.getFunctionDeclaration();

		/**
		 * The meta object literal for the '<em><b>Purity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_DECLARATION__PURITY = eINSTANCE.getFunctionDeclaration_Purity();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.declaration.impl.SubprogramBodyImpl <em>Subprogram Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.declaration.impl.SubprogramBodyImpl
		 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getSubprogramBody()
		 * @generated
		 */
		EClass SUBPROGRAM_BODY = eINSTANCE.getSubprogramBody();

		/**
		 * The meta object literal for the '<em><b>Declaration</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPROGRAM_BODY__DECLARATION = eINSTANCE.getSubprogramBody_Declaration();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBPROGRAM_BODY__STATEMENT = eINSTANCE.getSubprogramBody_Statement();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.declaration.impl.SubtypeDeclarationImpl <em>Subtype Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.declaration.impl.SubtypeDeclarationImpl
		 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getSubtypeDeclaration()
		 * @generated
		 */
		EClass SUBTYPE_DECLARATION = eINSTANCE.getSubtypeDeclaration();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.declaration.impl.ConfigurationSpecificationImpl <em>Configuration Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.declaration.impl.ConfigurationSpecificationImpl
		 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getConfigurationSpecification()
		 * @generated
		 */
		EClass CONFIGURATION_SPECIFICATION = eINSTANCE.getConfigurationSpecification();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_SPECIFICATION__LIST = eINSTANCE.getConfigurationSpecification_List();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_SPECIFICATION__COMPONENT = eINSTANCE.getConfigurationSpecification_Component();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_SPECIFICATION__ENTITY = eINSTANCE.getConfigurationSpecification_Entity();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_SPECIFICATION__CONFIGURATION = eINSTANCE.getConfigurationSpecification_Configuration();

		/**
		 * The meta object literal for the '<em><b>Generic Map</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_SPECIFICATION__GENERIC_MAP = eINSTANCE.getConfigurationSpecification_GenericMap();

		/**
		 * The meta object literal for the '<em><b>Port Map</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION_SPECIFICATION__PORT_MAP = eINSTANCE.getConfigurationSpecification_PortMap();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.declaration.impl.DeclarationImpl <em>Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationImpl
		 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getDeclaration()
		 * @generated
		 */
		EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.declaration.impl.DisconnectionSpecificationImpl <em>Disconnection Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.declaration.impl.DisconnectionSpecificationImpl
		 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getDisconnectionSpecification()
		 * @generated
		 */
		EClass DISCONNECTION_SPECIFICATION = eINSTANCE.getDisconnectionSpecification();

		/**
		 * The meta object literal for the '<em><b>Disconnect</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCONNECTION_SPECIFICATION__DISCONNECT = eINSTANCE.getDisconnectionSpecification_Disconnect();

		/**
		 * The meta object literal for the '<em><b>After</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCONNECTION_SPECIFICATION__AFTER = eINSTANCE.getDisconnectionSpecification_After();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.declaration.impl.FileDeclarationImpl <em>File Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.declaration.impl.FileDeclarationImpl
		 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getFileDeclaration()
		 * @generated
		 */
		EClass FILE_DECLARATION = eINSTANCE.getFileDeclaration();

		/**
		 * The meta object literal for the '<em><b>Open</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_DECLARATION__OPEN = eINSTANCE.getFileDeclaration_Open();

		/**
		 * The meta object literal for the '<em><b>Is</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_DECLARATION__IS = eINSTANCE.getFileDeclaration_Is();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.declaration.impl.TerminalDeclarationImpl <em>Terminal Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.declaration.impl.TerminalDeclarationImpl
		 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getTerminalDeclaration()
		 * @generated
		 */
		EClass TERMINAL_DECLARATION = eINSTANCE.getTerminalDeclaration();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.declaration.impl.TypeDeclarationImpl <em>Type Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.declaration.impl.TypeDeclarationImpl
		 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getTypeDeclaration()
		 * @generated
		 */
		EClass TYPE_DECLARATION = eINSTANCE.getTypeDeclaration();

		/**
		 * The meta object literal for the '<em><b>Is</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DECLARATION__IS = eINSTANCE.getTypeDeclaration_Is();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.declaration.impl.ConstantDeclarationImpl <em>Constant Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.declaration.impl.ConstantDeclarationImpl
		 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getConstantDeclaration()
		 * @generated
		 */
		EClass CONSTANT_DECLARATION = eINSTANCE.getConstantDeclaration();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.declaration.impl.GroupDeclarationImpl <em>Group Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.declaration.impl.GroupDeclarationImpl
		 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getGroupDeclaration()
		 * @generated
		 */
		EClass GROUP_DECLARATION = eINSTANCE.getGroupDeclaration();

		/**
		 * The meta object literal for the '<em><b>Is</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_DECLARATION__IS = eINSTANCE.getGroupDeclaration_Is();

		/**
		 * The meta object literal for the '<em><b>Member</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GROUP_DECLARATION__MEMBER = eINSTANCE.getGroupDeclaration_Member();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.declaration.impl.GroupTemplateDeclarationImpl <em>Group Template Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.declaration.impl.GroupTemplateDeclarationImpl
		 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getGroupTemplateDeclaration()
		 * @generated
		 */
		EClass GROUP_TEMPLATE_DECLARATION = eINSTANCE.getGroupTemplateDeclaration();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GROUP_TEMPLATE_DECLARATION__ENTRY = eINSTANCE.getGroupTemplateDeclaration_Entry();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.declaration.impl.NatureDeclarationImpl <em>Nature Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.declaration.impl.NatureDeclarationImpl
		 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getNatureDeclaration()
		 * @generated
		 */
		EClass NATURE_DECLARATION = eINSTANCE.getNatureDeclaration();

		/**
		 * The meta object literal for the '<em><b>Is</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NATURE_DECLARATION__IS = eINSTANCE.getNatureDeclaration_Is();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.declaration.impl.SignalDeclarationImpl <em>Signal Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.declaration.impl.SignalDeclarationImpl
		 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getSignalDeclaration()
		 * @generated
		 */
		EClass SIGNAL_DECLARATION = eINSTANCE.getSignalDeclaration();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_DECLARATION__KIND = eINSTANCE.getSignalDeclaration_Kind();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNAL_DECLARATION__MODE = eINSTANCE.getSignalDeclaration_Mode();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.declaration.impl.UseClauseDeclarationImpl <em>Use Clause Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.declaration.impl.UseClauseDeclarationImpl
		 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getUseClauseDeclaration()
		 * @generated
		 */
		EClass USE_CLAUSE_DECLARATION = eINSTANCE.getUseClauseDeclaration();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USE_CLAUSE_DECLARATION__USE = eINSTANCE.getUseClauseDeclaration_Use();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.declaration.impl.VariableDeclarationImpl <em>Variable Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.declaration.impl.VariableDeclarationImpl
		 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getVariableDeclaration()
		 * @generated
		 */
		EClass VARIABLE_DECLARATION = eINSTANCE.getVariableDeclaration();

		/**
		 * The meta object literal for the '<em><b>Shared</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECLARATION__SHARED = eINSTANCE.getVariableDeclaration_Shared();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_DECLARATION__MODE = eINSTANCE.getVariableDeclaration_Mode();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.declaration.impl.ValueDeclarationImpl <em>Value Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.declaration.impl.ValueDeclarationImpl
		 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getValueDeclaration()
		 * @generated
		 */
		EClass VALUE_DECLARATION = eINSTANCE.getValueDeclaration();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_DECLARATION__INITIAL = eINSTANCE.getValueDeclaration_Initial();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.declaration.SignalKind <em>Signal Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.declaration.SignalKind
		 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getSignalKind()
		 * @generated
		 */
		EEnum SIGNAL_KIND = eINSTANCE.getSignalKind();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.declaration.Mode <em>Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.declaration.Mode
		 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getMode()
		 * @generated
		 */
		EEnum MODE = eINSTANCE.getMode();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.declaration.EntityClass <em>Entity Class</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.declaration.EntityClass
		 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getEntityClass()
		 * @generated
		 */
		EEnum ENTITY_CLASS = eINSTANCE.getEntityClass();

		/**
		 * The meta object literal for the '{@link net.mlanoe.language.vhdl.declaration.Purity <em>Purity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mlanoe.language.vhdl.declaration.Purity
		 * @see net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl#getPurity()
		 * @generated
		 */
		EEnum PURITY = eINSTANCE.getPurity();

	}

} //DeclarationPackage
