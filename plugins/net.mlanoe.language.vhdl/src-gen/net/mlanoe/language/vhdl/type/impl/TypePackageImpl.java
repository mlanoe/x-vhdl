/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.type.impl;

import net.mlanoe.language.vhdl.VhdlPackage;

import net.mlanoe.language.vhdl.ams.AmsPackage;

import net.mlanoe.language.vhdl.ams.impl.AmsPackageImpl;

import net.mlanoe.language.vhdl.configuration.ConfigurationPackage;

import net.mlanoe.language.vhdl.configuration.impl.ConfigurationPackageImpl;

import net.mlanoe.language.vhdl.declaration.DeclarationPackage;

import net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl;

import net.mlanoe.language.vhdl.expression.ExpressionPackage;

import net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl;

import net.mlanoe.language.vhdl.impl.VhdlPackageImpl;

import net.mlanoe.language.vhdl.nature.NaturePackage;

import net.mlanoe.language.vhdl.nature.impl.NaturePackageImpl;

import net.mlanoe.language.vhdl.statement.StatementPackage;

import net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl;

import net.mlanoe.language.vhdl.type.AccessTypeDefinition;
import net.mlanoe.language.vhdl.type.ArrayTypeDefinition;
import net.mlanoe.language.vhdl.type.CompositeTypeDefinition;
import net.mlanoe.language.vhdl.type.ConstrainedArrayTypeDefinition;
import net.mlanoe.language.vhdl.type.EnumerationLiteral;
import net.mlanoe.language.vhdl.type.EnumerationTypeDefinition;
import net.mlanoe.language.vhdl.type.FileTypeDefinition;
import net.mlanoe.language.vhdl.type.PhysicalTypeDefinition;
import net.mlanoe.language.vhdl.type.PhysicalTypeDefinitionSecondary;
import net.mlanoe.language.vhdl.type.RangeTypeDefinition;
import net.mlanoe.language.vhdl.type.RecordTypeDefinition;
import net.mlanoe.language.vhdl.type.RecordTypeElement;
import net.mlanoe.language.vhdl.type.TypeDefinition;
import net.mlanoe.language.vhdl.type.TypeFactory;
import net.mlanoe.language.vhdl.type.TypePackage;
import net.mlanoe.language.vhdl.type.TypeReference;
import net.mlanoe.language.vhdl.type.Typed;
import net.mlanoe.language.vhdl.type.UnconstrainedArrayTypeDefinition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypePackageImpl extends EPackageImpl implements TypePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constrainedArrayTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unconstrainedArrayTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physicalTypeDefinitionSecondaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recordTypeElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeReferenceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.mlanoe.language.vhdl.type.TypePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TypePackageImpl() {
		super(eNS_URI, TypeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TypePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TypePackage init() {
		if (isInited) return (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);

		// Obtain or create and register package
		TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TypePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		VhdlPackageImpl theVhdlPackage = (VhdlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VhdlPackage.eNS_URI) instanceof VhdlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VhdlPackage.eNS_URI) : VhdlPackage.eINSTANCE);
		StatementPackageImpl theStatementPackage = (StatementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatementPackage.eNS_URI) instanceof StatementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatementPackage.eNS_URI) : StatementPackage.eINSTANCE);
		ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) instanceof ExpressionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) : ExpressionPackage.eINSTANCE);
		DeclarationPackageImpl theDeclarationPackage = (DeclarationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeclarationPackage.eNS_URI) instanceof DeclarationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeclarationPackage.eNS_URI) : DeclarationPackage.eINSTANCE);
		NaturePackageImpl theNaturePackage = (NaturePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NaturePackage.eNS_URI) instanceof NaturePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NaturePackage.eNS_URI) : NaturePackage.eINSTANCE);
		AmsPackageImpl theAmsPackage = (AmsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AmsPackage.eNS_URI) instanceof AmsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AmsPackage.eNS_URI) : AmsPackage.eINSTANCE);
		ConfigurationPackageImpl theConfigurationPackage = (ConfigurationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI) instanceof ConfigurationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI) : ConfigurationPackage.eINSTANCE);

		// Create package meta-data objects
		theTypePackage.createPackageContents();
		theVhdlPackage.createPackageContents();
		theStatementPackage.createPackageContents();
		theExpressionPackage.createPackageContents();
		theDeclarationPackage.createPackageContents();
		theNaturePackage.createPackageContents();
		theAmsPackage.createPackageContents();
		theConfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theTypePackage.initializePackageContents();
		theVhdlPackage.initializePackageContents();
		theStatementPackage.initializePackageContents();
		theExpressionPackage.initializePackageContents();
		theDeclarationPackage.initializePackageContents();
		theNaturePackage.initializePackageContents();
		theAmsPackage.initializePackageContents();
		theConfigurationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTypePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TypePackage.eNS_URI, theTypePackage);
		return theTypePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessTypeDefinition() {
		return accessTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeTypeDefinition() {
		return compositeTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecordTypeDefinition() {
		return recordTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecordTypeDefinition_Declaration() {
		return (EReference)recordTypeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayTypeDefinition() {
		return arrayTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstrainedArrayTypeDefinition() {
		return constrainedArrayTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstrainedArrayTypeDefinition_Constraint() {
		return (EReference)constrainedArrayTypeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnconstrainedArrayTypeDefinition() {
		return unconstrainedArrayTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnconstrainedArrayTypeDefinition_Index() {
		return (EReference)unconstrainedArrayTypeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationLiteral() {
		return enumerationLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationTypeDefinition() {
		return enumerationTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationTypeDefinition_Literal() {
		return (EReference)enumerationTypeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileTypeDefinition() {
		return fileTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalTypeDefinition() {
		return physicalTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalTypeDefinition_Range() {
		return (EReference)physicalTypeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalTypeDefinition_Primary() {
		return (EAttribute)physicalTypeDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalTypeDefinition_Secondary() {
		return (EReference)physicalTypeDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhysicalTypeDefinitionSecondary() {
		return physicalTypeDefinitionSecondaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalTypeDefinitionSecondary_Name() {
		return (EAttribute)physicalTypeDefinitionSecondaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhysicalTypeDefinitionSecondary_Number() {
		return (EAttribute)physicalTypeDefinitionSecondaryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhysicalTypeDefinitionSecondary_Of() {
		return (EReference)physicalTypeDefinitionSecondaryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeTypeDefinition() {
		return rangeTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeTypeDefinition_Left() {
		return (EReference)rangeTypeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeTypeDefinition_Direction() {
		return (EAttribute)rangeTypeDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangeTypeDefinition_Right() {
		return (EReference)rangeTypeDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRecordTypeElement() {
		return recordTypeElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTyped() {
		return typedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTyped_Type() {
		return (EReference)typedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDefinition() {
		return typeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeReference() {
		return typeReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeFactory getTypeFactory() {
		return (TypeFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		accessTypeDefinitionEClass = createEClass(ACCESS_TYPE_DEFINITION);

		compositeTypeDefinitionEClass = createEClass(COMPOSITE_TYPE_DEFINITION);

		recordTypeDefinitionEClass = createEClass(RECORD_TYPE_DEFINITION);
		createEReference(recordTypeDefinitionEClass, RECORD_TYPE_DEFINITION__DECLARATION);

		arrayTypeDefinitionEClass = createEClass(ARRAY_TYPE_DEFINITION);

		constrainedArrayTypeDefinitionEClass = createEClass(CONSTRAINED_ARRAY_TYPE_DEFINITION);
		createEReference(constrainedArrayTypeDefinitionEClass, CONSTRAINED_ARRAY_TYPE_DEFINITION__CONSTRAINT);

		unconstrainedArrayTypeDefinitionEClass = createEClass(UNCONSTRAINED_ARRAY_TYPE_DEFINITION);
		createEReference(unconstrainedArrayTypeDefinitionEClass, UNCONSTRAINED_ARRAY_TYPE_DEFINITION__INDEX);

		enumerationLiteralEClass = createEClass(ENUMERATION_LITERAL);

		enumerationTypeDefinitionEClass = createEClass(ENUMERATION_TYPE_DEFINITION);
		createEReference(enumerationTypeDefinitionEClass, ENUMERATION_TYPE_DEFINITION__LITERAL);

		fileTypeDefinitionEClass = createEClass(FILE_TYPE_DEFINITION);

		physicalTypeDefinitionEClass = createEClass(PHYSICAL_TYPE_DEFINITION);
		createEReference(physicalTypeDefinitionEClass, PHYSICAL_TYPE_DEFINITION__RANGE);
		createEAttribute(physicalTypeDefinitionEClass, PHYSICAL_TYPE_DEFINITION__PRIMARY);
		createEReference(physicalTypeDefinitionEClass, PHYSICAL_TYPE_DEFINITION__SECONDARY);

		physicalTypeDefinitionSecondaryEClass = createEClass(PHYSICAL_TYPE_DEFINITION_SECONDARY);
		createEAttribute(physicalTypeDefinitionSecondaryEClass, PHYSICAL_TYPE_DEFINITION_SECONDARY__NAME);
		createEAttribute(physicalTypeDefinitionSecondaryEClass, PHYSICAL_TYPE_DEFINITION_SECONDARY__NUMBER);
		createEReference(physicalTypeDefinitionSecondaryEClass, PHYSICAL_TYPE_DEFINITION_SECONDARY__OF);

		rangeTypeDefinitionEClass = createEClass(RANGE_TYPE_DEFINITION);
		createEReference(rangeTypeDefinitionEClass, RANGE_TYPE_DEFINITION__LEFT);
		createEAttribute(rangeTypeDefinitionEClass, RANGE_TYPE_DEFINITION__DIRECTION);
		createEReference(rangeTypeDefinitionEClass, RANGE_TYPE_DEFINITION__RIGHT);

		recordTypeElementEClass = createEClass(RECORD_TYPE_ELEMENT);

		typedEClass = createEClass(TYPED);
		createEReference(typedEClass, TYPED__TYPE);

		typeDefinitionEClass = createEClass(TYPE_DEFINITION);

		typeReferenceEClass = createEClass(TYPE_REFERENCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ExpressionPackage theExpressionPackage = (ExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);
		VhdlPackage theVhdlPackage = (VhdlPackage)EPackage.Registry.INSTANCE.getEPackage(VhdlPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		accessTypeDefinitionEClass.getESuperTypes().add(this.getTypeDefinition());
		accessTypeDefinitionEClass.getESuperTypes().add(this.getTyped());
		compositeTypeDefinitionEClass.getESuperTypes().add(this.getTypeDefinition());
		recordTypeDefinitionEClass.getESuperTypes().add(this.getCompositeTypeDefinition());
		arrayTypeDefinitionEClass.getESuperTypes().add(this.getCompositeTypeDefinition());
		arrayTypeDefinitionEClass.getESuperTypes().add(this.getTyped());
		constrainedArrayTypeDefinitionEClass.getESuperTypes().add(this.getArrayTypeDefinition());
		unconstrainedArrayTypeDefinitionEClass.getESuperTypes().add(this.getArrayTypeDefinition());
		enumerationTypeDefinitionEClass.getESuperTypes().add(this.getTypeDefinition());
		fileTypeDefinitionEClass.getESuperTypes().add(this.getTypeDefinition());
		fileTypeDefinitionEClass.getESuperTypes().add(this.getTyped());
		physicalTypeDefinitionEClass.getESuperTypes().add(this.getTypeDefinition());
		rangeTypeDefinitionEClass.getESuperTypes().add(this.getTypeDefinition());
		recordTypeElementEClass.getESuperTypes().add(theVhdlPackage.getVhdlObject());
		recordTypeElementEClass.getESuperTypes().add(theVhdlPackage.getMultiNamed());
		recordTypeElementEClass.getESuperTypes().add(this.getTyped());
		typeDefinitionEClass.getESuperTypes().add(theVhdlPackage.getVhdlObject());

		// Initialize classes and features; add operations and parameters
		initEClass(accessTypeDefinitionEClass, AccessTypeDefinition.class, "AccessTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeTypeDefinitionEClass, CompositeTypeDefinition.class, "CompositeTypeDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(recordTypeDefinitionEClass, RecordTypeDefinition.class, "RecordTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecordTypeDefinition_Declaration(), this.getRecordTypeElement(), null, "declaration", null, 0, -1, RecordTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayTypeDefinitionEClass, ArrayTypeDefinition.class, "ArrayTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constrainedArrayTypeDefinitionEClass, ConstrainedArrayTypeDefinition.class, "ConstrainedArrayTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstrainedArrayTypeDefinition_Constraint(), theExpressionPackage.getExpression(), null, "constraint", null, 0, 1, ConstrainedArrayTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unconstrainedArrayTypeDefinitionEClass, UnconstrainedArrayTypeDefinition.class, "UnconstrainedArrayTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnconstrainedArrayTypeDefinition_Index(), this.getTypeReference(), null, "index", null, 0, -1, UnconstrainedArrayTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationLiteralEClass, EnumerationLiteral.class, "EnumerationLiteral", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumerationTypeDefinitionEClass, EnumerationTypeDefinition.class, "EnumerationTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationTypeDefinition_Literal(), this.getEnumerationLiteral(), null, "literal", null, 0, -1, EnumerationTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileTypeDefinitionEClass, FileTypeDefinition.class, "FileTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(physicalTypeDefinitionEClass, PhysicalTypeDefinition.class, "PhysicalTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhysicalTypeDefinition_Range(), theExpressionPackage.getExpression(), null, "range", null, 0, 1, PhysicalTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalTypeDefinition_Primary(), ecorePackage.getEString(), "primary", null, 0, 1, PhysicalTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalTypeDefinition_Secondary(), this.getPhysicalTypeDefinitionSecondary(), null, "secondary", null, 0, -1, PhysicalTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physicalTypeDefinitionSecondaryEClass, PhysicalTypeDefinitionSecondary.class, "PhysicalTypeDefinitionSecondary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhysicalTypeDefinitionSecondary_Name(), ecorePackage.getEString(), "name", null, 0, 1, PhysicalTypeDefinitionSecondary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhysicalTypeDefinitionSecondary_Number(), ecorePackage.getEString(), "number", null, 0, 1, PhysicalTypeDefinitionSecondary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysicalTypeDefinitionSecondary_Of(), theVhdlPackage.getName_(), null, "of", null, 0, 1, PhysicalTypeDefinitionSecondary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rangeTypeDefinitionEClass, RangeTypeDefinition.class, "RangeTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRangeTypeDefinition_Left(), theExpressionPackage.getExpression(), null, "left", null, 0, 1, RangeTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRangeTypeDefinition_Direction(), theExpressionPackage.getRangeDirection(), "direction", null, 0, 1, RangeTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRangeTypeDefinition_Right(), theExpressionPackage.getExpression(), null, "right", null, 0, 1, RangeTypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recordTypeElementEClass, RecordTypeElement.class, "RecordTypeElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typedEClass, Typed.class, "Typed", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTyped_Type(), this.getTypeReference(), null, "type", null, 0, 1, Typed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDefinitionEClass, TypeDefinition.class, "TypeDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeReferenceEClass, TypeReference.class, "TypeReference", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //TypePackageImpl
