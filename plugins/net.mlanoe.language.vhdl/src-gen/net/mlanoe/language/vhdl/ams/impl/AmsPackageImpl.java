/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.ams.impl;

import net.mlanoe.language.vhdl.VhdlPackage;

import net.mlanoe.language.vhdl.ams.AmsFactory;
import net.mlanoe.language.vhdl.ams.AmsPackage;
import net.mlanoe.language.vhdl.ams.Noise;
import net.mlanoe.language.vhdl.ams.QuantityAspect;
import net.mlanoe.language.vhdl.ams.SourceAspect;
import net.mlanoe.language.vhdl.ams.Spectrum;

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

import net.mlanoe.language.vhdl.type.TypePackage;

import net.mlanoe.language.vhdl.type.impl.TypePackageImpl;

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
public class AmsPackageImpl extends EPackageImpl implements AmsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceAspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spectrumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noiseEClass = null;

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
	 * @see net.mlanoe.language.vhdl.ams.AmsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AmsPackageImpl() {
		super(eNS_URI, AmsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AmsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AmsPackage init() {
		if (isInited) return (AmsPackage)EPackage.Registry.INSTANCE.getEPackage(AmsPackage.eNS_URI);

		// Obtain or create and register package
		AmsPackageImpl theAmsPackage = (AmsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AmsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AmsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		VhdlPackageImpl theVhdlPackage = (VhdlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VhdlPackage.eNS_URI) instanceof VhdlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VhdlPackage.eNS_URI) : VhdlPackage.eINSTANCE);
		StatementPackageImpl theStatementPackage = (StatementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatementPackage.eNS_URI) instanceof StatementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatementPackage.eNS_URI) : StatementPackage.eINSTANCE);
		ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) instanceof ExpressionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) : ExpressionPackage.eINSTANCE);
		DeclarationPackageImpl theDeclarationPackage = (DeclarationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeclarationPackage.eNS_URI) instanceof DeclarationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeclarationPackage.eNS_URI) : DeclarationPackage.eINSTANCE);
		TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
		NaturePackageImpl theNaturePackage = (NaturePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NaturePackage.eNS_URI) instanceof NaturePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NaturePackage.eNS_URI) : NaturePackage.eINSTANCE);
		ConfigurationPackageImpl theConfigurationPackage = (ConfigurationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI) instanceof ConfigurationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI) : ConfigurationPackage.eINSTANCE);

		// Create package meta-data objects
		theAmsPackage.createPackageContents();
		theVhdlPackage.createPackageContents();
		theStatementPackage.createPackageContents();
		theExpressionPackage.createPackageContents();
		theDeclarationPackage.createPackageContents();
		theTypePackage.createPackageContents();
		theNaturePackage.createPackageContents();
		theConfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theAmsPackage.initializePackageContents();
		theVhdlPackage.initializePackageContents();
		theStatementPackage.initializePackageContents();
		theExpressionPackage.initializePackageContents();
		theDeclarationPackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theNaturePackage.initializePackageContents();
		theConfigurationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAmsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AmsPackage.eNS_URI, theAmsPackage);
		return theAmsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantityAspect() {
		return quantityAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantityAspect_Tolerance() {
		return (EReference)quantityAspectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuantityAspect_Expression() {
		return (EReference)quantityAspectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceAspect() {
		return sourceAspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpectrum() {
		return spectrumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpectrum_Left() {
		return (EReference)spectrumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpectrum_Right() {
		return (EReference)spectrumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoise() {
		return noiseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoise_Noise() {
		return (EReference)noiseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmsFactory getAmsFactory() {
		return (AmsFactory)getEFactoryInstance();
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
		quantityAspectEClass = createEClass(QUANTITY_ASPECT);
		createEReference(quantityAspectEClass, QUANTITY_ASPECT__TOLERANCE);
		createEReference(quantityAspectEClass, QUANTITY_ASPECT__EXPRESSION);

		sourceAspectEClass = createEClass(SOURCE_ASPECT);

		spectrumEClass = createEClass(SPECTRUM);
		createEReference(spectrumEClass, SPECTRUM__LEFT);
		createEReference(spectrumEClass, SPECTRUM__RIGHT);

		noiseEClass = createEClass(NOISE);
		createEReference(noiseEClass, NOISE__NOISE);
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
		VhdlPackage theVhdlPackage = (VhdlPackage)EPackage.Registry.INSTANCE.getEPackage(VhdlPackage.eNS_URI);
		ExpressionPackage theExpressionPackage = (ExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		quantityAspectEClass.getESuperTypes().add(theVhdlPackage.getVhdlObject());
		quantityAspectEClass.getESuperTypes().add(theVhdlPackage.getMultiNamed());
		sourceAspectEClass.getESuperTypes().add(theVhdlPackage.getVhdlObject());
		spectrumEClass.getESuperTypes().add(this.getSourceAspect());
		noiseEClass.getESuperTypes().add(this.getSourceAspect());

		// Initialize classes and features; add operations and parameters
		initEClass(quantityAspectEClass, QuantityAspect.class, "QuantityAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuantityAspect_Tolerance(), theExpressionPackage.getExpression(), null, "tolerance", null, 0, 1, QuantityAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuantityAspect_Expression(), theExpressionPackage.getExpression(), null, "expression", null, 0, 1, QuantityAspect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceAspectEClass, SourceAspect.class, "SourceAspect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spectrumEClass, Spectrum.class, "Spectrum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpectrum_Left(), theExpressionPackage.getExpression(), null, "left", null, 0, 1, Spectrum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpectrum_Right(), theExpressionPackage.getExpression(), null, "right", null, 0, 1, Spectrum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noiseEClass, Noise.class, "Noise", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNoise_Noise(), theExpressionPackage.getExpression(), null, "noise", null, 0, 1, Noise.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //AmsPackageImpl
