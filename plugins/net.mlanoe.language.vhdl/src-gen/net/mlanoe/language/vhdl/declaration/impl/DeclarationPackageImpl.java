/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.declaration.impl;

import net.mlanoe.language.vhdl.VhdlPackage;

import net.mlanoe.language.vhdl.ams.AmsPackage;

import net.mlanoe.language.vhdl.ams.impl.AmsPackageImpl;

import net.mlanoe.language.vhdl.configuration.ConfigurationPackage;

import net.mlanoe.language.vhdl.configuration.impl.ConfigurationPackageImpl;

import net.mlanoe.language.vhdl.declaration.AliasDeclaration;
import net.mlanoe.language.vhdl.declaration.AttributeDeclaration;
import net.mlanoe.language.vhdl.declaration.AttributeSpecification;
import net.mlanoe.language.vhdl.declaration.BranchQuantityDeclaration;
import net.mlanoe.language.vhdl.declaration.ConfigurationSpecification;
import net.mlanoe.language.vhdl.declaration.ConstantDeclaration;
import net.mlanoe.language.vhdl.declaration.Declaration;
import net.mlanoe.language.vhdl.declaration.DeclarationFactory;
import net.mlanoe.language.vhdl.declaration.DeclarationPackage;
import net.mlanoe.language.vhdl.declaration.DisconnectionSpecification;
import net.mlanoe.language.vhdl.declaration.EntityClass;
import net.mlanoe.language.vhdl.declaration.FileDeclaration;
import net.mlanoe.language.vhdl.declaration.FreeQuantityDeclaration;
import net.mlanoe.language.vhdl.declaration.FunctionDeclaration;
import net.mlanoe.language.vhdl.declaration.GroupDeclaration;
import net.mlanoe.language.vhdl.declaration.GroupTemplateDeclaration;
import net.mlanoe.language.vhdl.declaration.LimitDeclaration;
import net.mlanoe.language.vhdl.declaration.Mode;
import net.mlanoe.language.vhdl.declaration.NatureDeclaration;
import net.mlanoe.language.vhdl.declaration.ProcedureDeclaration;
import net.mlanoe.language.vhdl.declaration.Purity;
import net.mlanoe.language.vhdl.declaration.QuantityDeclaration;
import net.mlanoe.language.vhdl.declaration.SignalDeclaration;
import net.mlanoe.language.vhdl.declaration.SignalKind;
import net.mlanoe.language.vhdl.declaration.SourceQuantityDeclaration;
import net.mlanoe.language.vhdl.declaration.SubnatureDeclaration;
import net.mlanoe.language.vhdl.declaration.SubprogramBody;
import net.mlanoe.language.vhdl.declaration.SubprogramDeclaration;
import net.mlanoe.language.vhdl.declaration.SubtypeDeclaration;
import net.mlanoe.language.vhdl.declaration.TerminalDeclaration;
import net.mlanoe.language.vhdl.declaration.TypeDeclaration;
import net.mlanoe.language.vhdl.declaration.UseClauseDeclaration;
import net.mlanoe.language.vhdl.declaration.ValueDeclaration;
import net.mlanoe.language.vhdl.declaration.VariableDeclaration;

import net.mlanoe.language.vhdl.expression.ExpressionPackage;

import net.mlanoe.language.vhdl.expression.impl.ExpressionPackageImpl;

import net.mlanoe.language.vhdl.impl.VhdlPackageImpl;

import net.mlanoe.language.vhdl.nature.NaturePackage;

import net.mlanoe.language.vhdl.nature.impl.NaturePackageImpl;

import net.mlanoe.language.vhdl.statement.StatementPackage;

import net.mlanoe.language.vhdl.statement.impl.StatementPackageImpl;

import net.mlanoe.language.vhdl.type.TypePackage;

import net.mlanoe.language.vhdl.type.impl.TypePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeclarationPackageImpl extends EPackageImpl implements DeclarationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aliasDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass branchQuantityDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freeQuantityDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass limitDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quantityDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceQuantityDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subnatureDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procedureDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subprogramBodyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subtypeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass declarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disconnectionSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminalDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupTemplateDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass natureDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useClauseDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum signalKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum entityClassEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum purityEEnum = null;

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
	 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DeclarationPackageImpl() {
		super(eNS_URI, DeclarationFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DeclarationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DeclarationPackage init() {
		if (isInited) return (DeclarationPackage)EPackage.Registry.INSTANCE.getEPackage(DeclarationPackage.eNS_URI);

		// Obtain or create and register package
		DeclarationPackageImpl theDeclarationPackage = (DeclarationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DeclarationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DeclarationPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		VhdlPackageImpl theVhdlPackage = (VhdlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VhdlPackage.eNS_URI) instanceof VhdlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VhdlPackage.eNS_URI) : VhdlPackage.eINSTANCE);
		StatementPackageImpl theStatementPackage = (StatementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatementPackage.eNS_URI) instanceof StatementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatementPackage.eNS_URI) : StatementPackage.eINSTANCE);
		ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) instanceof ExpressionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) : ExpressionPackage.eINSTANCE);
		TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
		NaturePackageImpl theNaturePackage = (NaturePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NaturePackage.eNS_URI) instanceof NaturePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NaturePackage.eNS_URI) : NaturePackage.eINSTANCE);
		AmsPackageImpl theAmsPackage = (AmsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AmsPackage.eNS_URI) instanceof AmsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AmsPackage.eNS_URI) : AmsPackage.eINSTANCE);
		ConfigurationPackageImpl theConfigurationPackage = (ConfigurationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI) instanceof ConfigurationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI) : ConfigurationPackage.eINSTANCE);

		// Create package meta-data objects
		theDeclarationPackage.createPackageContents();
		theVhdlPackage.createPackageContents();
		theStatementPackage.createPackageContents();
		theExpressionPackage.createPackageContents();
		theTypePackage.createPackageContents();
		theNaturePackage.createPackageContents();
		theAmsPackage.createPackageContents();
		theConfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theDeclarationPackage.initializePackageContents();
		theVhdlPackage.initializePackageContents();
		theStatementPackage.initializePackageContents();
		theExpressionPackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theNaturePackage.initializePackageContents();
		theAmsPackage.initializePackageContents();
		theConfigurationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDeclarationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DeclarationPackage.eNS_URI, theDeclarationPackage);
		return theDeclarationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAliasDeclaration() {
		return aliasDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasDeclaration_Alias() {
		return (EReference)aliasDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasDeclaration_Is() {
		return (EReference)aliasDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDeclaration() {
		return attributeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeSpecification() {
		return attributeSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeSpecification_Entity() {
		return (EReference)attributeSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeSpecification_Class() {
		return (EAttribute)attributeSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeSpecification_Is() {
		return (EReference)attributeSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBranchQuantityDeclaration() {
		return branchQuantityDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBranchQuantityDeclaration_Across() {
		return (EReference)branchQuantityDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBranchQuantityDeclaration_Through() {
		return (EReference)branchQuantityDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBranchQuantityDeclaration_Left() {
		return (EReference)branchQuantityDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBranchQuantityDeclaration_Right() {
		return (EReference)branchQuantityDeclarationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFreeQuantityDeclaration() {
		return freeQuantityDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFreeQuantityDeclaration_Quantity() {
		return (EReference)freeQuantityDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLimitDeclaration() {
		return limitDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLimitDeclaration_Value() {
		return (EReference)limitDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuantityDeclaration() {
		return quantityDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSourceQuantityDeclaration() {
		return sourceQuantityDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSourceQuantityDeclaration_Source() {
		return (EReference)sourceQuantityDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubnatureDeclaration() {
		return subnatureDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubprogramDeclaration() {
		return subprogramDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubprogramDeclaration_Parameter() {
		return (EReference)subprogramDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubprogramDeclaration_Body() {
		return (EReference)subprogramDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcedureDeclaration() {
		return procedureDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionDeclaration() {
		return functionDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionDeclaration_Purity() {
		return (EAttribute)functionDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubprogramBody() {
		return subprogramBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubprogramBody_Declaration() {
		return (EReference)subprogramBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubprogramBody_Statement() {
		return (EReference)subprogramBodyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubtypeDeclaration() {
		return subtypeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigurationSpecification() {
		return configurationSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationSpecification_List() {
		return (EReference)configurationSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationSpecification_Component() {
		return (EReference)configurationSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationSpecification_Entity() {
		return (EReference)configurationSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationSpecification_Configuration() {
		return (EReference)configurationSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationSpecification_GenericMap() {
		return (EReference)configurationSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigurationSpecification_PortMap() {
		return (EReference)configurationSpecificationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeclaration() {
		return declarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisconnectionSpecification() {
		return disconnectionSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisconnectionSpecification_Disconnect() {
		return (EReference)disconnectionSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDisconnectionSpecification_After() {
		return (EReference)disconnectionSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileDeclaration() {
		return fileDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileDeclaration_Open() {
		return (EReference)fileDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileDeclaration_Is() {
		return (EReference)fileDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminalDeclaration() {
		return terminalDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDeclaration() {
		return typeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDeclaration_Is() {
		return (EReference)typeDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantDeclaration() {
		return constantDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupDeclaration() {
		return groupDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupDeclaration_Is() {
		return (EReference)groupDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupDeclaration_Member() {
		return (EReference)groupDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupTemplateDeclaration() {
		return groupTemplateDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroupTemplateDeclaration_Entry() {
		return (EAttribute)groupTemplateDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNatureDeclaration() {
		return natureDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNatureDeclaration_Is() {
		return (EReference)natureDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalDeclaration() {
		return signalDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignalDeclaration_Kind() {
		return (EAttribute)signalDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignalDeclaration_Mode() {
		return (EAttribute)signalDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUseClauseDeclaration() {
		return useClauseDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseClauseDeclaration_Use() {
		return (EReference)useClauseDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableDeclaration() {
		return variableDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableDeclaration_Shared() {
		return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableDeclaration_Mode() {
		return (EAttribute)variableDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueDeclaration() {
		return valueDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueDeclaration_Initial() {
		return (EReference)valueDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSignalKind() {
		return signalKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMode() {
		return modeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEntityClass() {
		return entityClassEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPurity() {
		return purityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationFactory getDeclarationFactory() {
		return (DeclarationFactory)getEFactoryInstance();
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
		aliasDeclarationEClass = createEClass(ALIAS_DECLARATION);
		createEReference(aliasDeclarationEClass, ALIAS_DECLARATION__ALIAS);
		createEReference(aliasDeclarationEClass, ALIAS_DECLARATION__IS);

		attributeDeclarationEClass = createEClass(ATTRIBUTE_DECLARATION);

		attributeSpecificationEClass = createEClass(ATTRIBUTE_SPECIFICATION);
		createEReference(attributeSpecificationEClass, ATTRIBUTE_SPECIFICATION__ENTITY);
		createEAttribute(attributeSpecificationEClass, ATTRIBUTE_SPECIFICATION__CLASS);
		createEReference(attributeSpecificationEClass, ATTRIBUTE_SPECIFICATION__IS);

		branchQuantityDeclarationEClass = createEClass(BRANCH_QUANTITY_DECLARATION);
		createEReference(branchQuantityDeclarationEClass, BRANCH_QUANTITY_DECLARATION__ACROSS);
		createEReference(branchQuantityDeclarationEClass, BRANCH_QUANTITY_DECLARATION__THROUGH);
		createEReference(branchQuantityDeclarationEClass, BRANCH_QUANTITY_DECLARATION__LEFT);
		createEReference(branchQuantityDeclarationEClass, BRANCH_QUANTITY_DECLARATION__RIGHT);

		freeQuantityDeclarationEClass = createEClass(FREE_QUANTITY_DECLARATION);
		createEReference(freeQuantityDeclarationEClass, FREE_QUANTITY_DECLARATION__QUANTITY);

		limitDeclarationEClass = createEClass(LIMIT_DECLARATION);
		createEReference(limitDeclarationEClass, LIMIT_DECLARATION__VALUE);

		quantityDeclarationEClass = createEClass(QUANTITY_DECLARATION);

		sourceQuantityDeclarationEClass = createEClass(SOURCE_QUANTITY_DECLARATION);
		createEReference(sourceQuantityDeclarationEClass, SOURCE_QUANTITY_DECLARATION__SOURCE);

		subnatureDeclarationEClass = createEClass(SUBNATURE_DECLARATION);

		subprogramDeclarationEClass = createEClass(SUBPROGRAM_DECLARATION);
		createEReference(subprogramDeclarationEClass, SUBPROGRAM_DECLARATION__PARAMETER);
		createEReference(subprogramDeclarationEClass, SUBPROGRAM_DECLARATION__BODY);

		procedureDeclarationEClass = createEClass(PROCEDURE_DECLARATION);

		functionDeclarationEClass = createEClass(FUNCTION_DECLARATION);
		createEAttribute(functionDeclarationEClass, FUNCTION_DECLARATION__PURITY);

		subprogramBodyEClass = createEClass(SUBPROGRAM_BODY);
		createEReference(subprogramBodyEClass, SUBPROGRAM_BODY__DECLARATION);
		createEReference(subprogramBodyEClass, SUBPROGRAM_BODY__STATEMENT);

		subtypeDeclarationEClass = createEClass(SUBTYPE_DECLARATION);

		configurationSpecificationEClass = createEClass(CONFIGURATION_SPECIFICATION);
		createEReference(configurationSpecificationEClass, CONFIGURATION_SPECIFICATION__LIST);
		createEReference(configurationSpecificationEClass, CONFIGURATION_SPECIFICATION__COMPONENT);
		createEReference(configurationSpecificationEClass, CONFIGURATION_SPECIFICATION__ENTITY);
		createEReference(configurationSpecificationEClass, CONFIGURATION_SPECIFICATION__CONFIGURATION);
		createEReference(configurationSpecificationEClass, CONFIGURATION_SPECIFICATION__GENERIC_MAP);
		createEReference(configurationSpecificationEClass, CONFIGURATION_SPECIFICATION__PORT_MAP);

		declarationEClass = createEClass(DECLARATION);

		disconnectionSpecificationEClass = createEClass(DISCONNECTION_SPECIFICATION);
		createEReference(disconnectionSpecificationEClass, DISCONNECTION_SPECIFICATION__DISCONNECT);
		createEReference(disconnectionSpecificationEClass, DISCONNECTION_SPECIFICATION__AFTER);

		fileDeclarationEClass = createEClass(FILE_DECLARATION);
		createEReference(fileDeclarationEClass, FILE_DECLARATION__OPEN);
		createEReference(fileDeclarationEClass, FILE_DECLARATION__IS);

		terminalDeclarationEClass = createEClass(TERMINAL_DECLARATION);

		typeDeclarationEClass = createEClass(TYPE_DECLARATION);
		createEReference(typeDeclarationEClass, TYPE_DECLARATION__IS);

		constantDeclarationEClass = createEClass(CONSTANT_DECLARATION);

		groupDeclarationEClass = createEClass(GROUP_DECLARATION);
		createEReference(groupDeclarationEClass, GROUP_DECLARATION__IS);
		createEReference(groupDeclarationEClass, GROUP_DECLARATION__MEMBER);

		groupTemplateDeclarationEClass = createEClass(GROUP_TEMPLATE_DECLARATION);
		createEAttribute(groupTemplateDeclarationEClass, GROUP_TEMPLATE_DECLARATION__ENTRY);

		natureDeclarationEClass = createEClass(NATURE_DECLARATION);
		createEReference(natureDeclarationEClass, NATURE_DECLARATION__IS);

		signalDeclarationEClass = createEClass(SIGNAL_DECLARATION);
		createEAttribute(signalDeclarationEClass, SIGNAL_DECLARATION__KIND);
		createEAttribute(signalDeclarationEClass, SIGNAL_DECLARATION__MODE);

		useClauseDeclarationEClass = createEClass(USE_CLAUSE_DECLARATION);
		createEReference(useClauseDeclarationEClass, USE_CLAUSE_DECLARATION__USE);

		variableDeclarationEClass = createEClass(VARIABLE_DECLARATION);
		createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__SHARED);
		createEAttribute(variableDeclarationEClass, VARIABLE_DECLARATION__MODE);

		valueDeclarationEClass = createEClass(VALUE_DECLARATION);
		createEReference(valueDeclarationEClass, VALUE_DECLARATION__INITIAL);

		// Create enums
		signalKindEEnum = createEEnum(SIGNAL_KIND);
		modeEEnum = createEEnum(MODE);
		entityClassEEnum = createEEnum(ENTITY_CLASS);
		purityEEnum = createEEnum(PURITY);
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
		TypePackage theTypePackage = (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);
		ExpressionPackage theExpressionPackage = (ExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);
		AmsPackage theAmsPackage = (AmsPackage)EPackage.Registry.INSTANCE.getEPackage(AmsPackage.eNS_URI);
		NaturePackage theNaturePackage = (NaturePackage)EPackage.Registry.INSTANCE.getEPackage(NaturePackage.eNS_URI);
		StatementPackage theStatementPackage = (StatementPackage)EPackage.Registry.INSTANCE.getEPackage(StatementPackage.eNS_URI);
		ConfigurationPackage theConfigurationPackage = (ConfigurationPackage)EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		aliasDeclarationEClass.getESuperTypes().add(this.getDeclaration());
		aliasDeclarationEClass.getESuperTypes().add(theVhdlPackage.getNamed());
		attributeDeclarationEClass.getESuperTypes().add(this.getDeclaration());
		attributeDeclarationEClass.getESuperTypes().add(theVhdlPackage.getNamed());
		attributeDeclarationEClass.getESuperTypes().add(theTypePackage.getTyped());
		attributeSpecificationEClass.getESuperTypes().add(this.getDeclaration());
		attributeSpecificationEClass.getESuperTypes().add(theVhdlPackage.getNamed());
		branchQuantityDeclarationEClass.getESuperTypes().add(this.getQuantityDeclaration());
		freeQuantityDeclarationEClass.getESuperTypes().add(this.getQuantityDeclaration());
		freeQuantityDeclarationEClass.getESuperTypes().add(theVhdlPackage.getMultiNamed());
		freeQuantityDeclarationEClass.getESuperTypes().add(theTypePackage.getTyped());
		limitDeclarationEClass.getESuperTypes().add(this.getDeclaration());
		limitDeclarationEClass.getESuperTypes().add(theVhdlPackage.getMultiNamed());
		limitDeclarationEClass.getESuperTypes().add(theTypePackage.getTyped());
		quantityDeclarationEClass.getESuperTypes().add(this.getDeclaration());
		sourceQuantityDeclarationEClass.getESuperTypes().add(this.getQuantityDeclaration());
		sourceQuantityDeclarationEClass.getESuperTypes().add(theVhdlPackage.getMultiNamed());
		sourceQuantityDeclarationEClass.getESuperTypes().add(theTypePackage.getTyped());
		subnatureDeclarationEClass.getESuperTypes().add(this.getDeclaration());
		subnatureDeclarationEClass.getESuperTypes().add(theVhdlPackage.getNamed());
		subnatureDeclarationEClass.getESuperTypes().add(theNaturePackage.getNatured());
		subprogramDeclarationEClass.getESuperTypes().add(this.getDeclaration());
		subprogramDeclarationEClass.getESuperTypes().add(theVhdlPackage.getNamed());
		procedureDeclarationEClass.getESuperTypes().add(this.getSubprogramDeclaration());
		functionDeclarationEClass.getESuperTypes().add(this.getSubprogramDeclaration());
		functionDeclarationEClass.getESuperTypes().add(theTypePackage.getTyped());
		subprogramBodyEClass.getESuperTypes().add(theVhdlPackage.getVhdlObject());
		subtypeDeclarationEClass.getESuperTypes().add(this.getDeclaration());
		subtypeDeclarationEClass.getESuperTypes().add(theVhdlPackage.getNamed());
		subtypeDeclarationEClass.getESuperTypes().add(theTypePackage.getTyped());
		configurationSpecificationEClass.getESuperTypes().add(this.getDeclaration());
		declarationEClass.getESuperTypes().add(theVhdlPackage.getVhdlObject());
		disconnectionSpecificationEClass.getESuperTypes().add(this.getDeclaration());
		disconnectionSpecificationEClass.getESuperTypes().add(theTypePackage.getTyped());
		fileDeclarationEClass.getESuperTypes().add(this.getDeclaration());
		fileDeclarationEClass.getESuperTypes().add(theVhdlPackage.getMultiNamed());
		fileDeclarationEClass.getESuperTypes().add(theTypePackage.getTyped());
		terminalDeclarationEClass.getESuperTypes().add(this.getDeclaration());
		terminalDeclarationEClass.getESuperTypes().add(theVhdlPackage.getMultiNamed());
		terminalDeclarationEClass.getESuperTypes().add(theNaturePackage.getNatured());
		typeDeclarationEClass.getESuperTypes().add(this.getDeclaration());
		typeDeclarationEClass.getESuperTypes().add(theVhdlPackage.getNamed());
		constantDeclarationEClass.getESuperTypes().add(this.getValueDeclaration());
		groupDeclarationEClass.getESuperTypes().add(this.getDeclaration());
		groupDeclarationEClass.getESuperTypes().add(theVhdlPackage.getNamed());
		groupTemplateDeclarationEClass.getESuperTypes().add(this.getDeclaration());
		groupTemplateDeclarationEClass.getESuperTypes().add(theVhdlPackage.getNamed());
		natureDeclarationEClass.getESuperTypes().add(this.getDeclaration());
		natureDeclarationEClass.getESuperTypes().add(theVhdlPackage.getNamed());
		signalDeclarationEClass.getESuperTypes().add(this.getValueDeclaration());
		useClauseDeclarationEClass.getESuperTypes().add(this.getDeclaration());
		variableDeclarationEClass.getESuperTypes().add(this.getValueDeclaration());
		valueDeclarationEClass.getESuperTypes().add(this.getDeclaration());
		valueDeclarationEClass.getESuperTypes().add(theVhdlPackage.getMultiNamed());
		valueDeclarationEClass.getESuperTypes().add(theTypePackage.getTyped());

		// Initialize classes and features; add operations and parameters
		initEClass(aliasDeclarationEClass, AliasDeclaration.class, "AliasDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAliasDeclaration_Alias(), theTypePackage.getTypeReference(), null, "alias", null, 0, 1, AliasDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAliasDeclaration_Is(), theVhdlPackage.getName_(), null, "is", null, 0, 1, AliasDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeDeclarationEClass, AttributeDeclaration.class, "AttributeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeSpecificationEClass, AttributeSpecification.class, "AttributeSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeSpecification_Entity(), theVhdlPackage.getMultiName(), null, "entity", null, 0, 1, AttributeSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeSpecification_Class(), this.getEntityClass(), "class", null, 0, 1, AttributeSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAttributeSpecification_Is(), theExpressionPackage.getExpression(), null, "is", null, 0, 1, AttributeSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(branchQuantityDeclarationEClass, BranchQuantityDeclaration.class, "BranchQuantityDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBranchQuantityDeclaration_Across(), theAmsPackage.getQuantityAspect(), null, "across", null, 0, 1, BranchQuantityDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBranchQuantityDeclaration_Through(), theAmsPackage.getQuantityAspect(), null, "through", null, 0, 1, BranchQuantityDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBranchQuantityDeclaration_Left(), theVhdlPackage.getName_(), null, "left", null, 0, 1, BranchQuantityDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBranchQuantityDeclaration_Right(), theVhdlPackage.getName_(), null, "right", null, 0, 1, BranchQuantityDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(freeQuantityDeclarationEClass, FreeQuantityDeclaration.class, "FreeQuantityDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFreeQuantityDeclaration_Quantity(), theExpressionPackage.getExpression(), null, "quantity", null, 0, 1, FreeQuantityDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(limitDeclarationEClass, LimitDeclaration.class, "LimitDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLimitDeclaration_Value(), theExpressionPackage.getExpression(), null, "value", null, 0, 1, LimitDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quantityDeclarationEClass, QuantityDeclaration.class, "QuantityDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sourceQuantityDeclarationEClass, SourceQuantityDeclaration.class, "SourceQuantityDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSourceQuantityDeclaration_Source(), theAmsPackage.getSourceAspect(), null, "source", null, 0, 1, SourceQuantityDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subnatureDeclarationEClass, SubnatureDeclaration.class, "SubnatureDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subprogramDeclarationEClass, SubprogramDeclaration.class, "SubprogramDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubprogramDeclaration_Parameter(), this.getDeclaration(), null, "parameter", null, 0, -1, SubprogramDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubprogramDeclaration_Body(), this.getSubprogramBody(), null, "body", null, 0, 1, SubprogramDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(procedureDeclarationEClass, ProcedureDeclaration.class, "ProcedureDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionDeclarationEClass, FunctionDeclaration.class, "FunctionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionDeclaration_Purity(), this.getPurity(), "purity", null, 0, 1, FunctionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subprogramBodyEClass, SubprogramBody.class, "SubprogramBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubprogramBody_Declaration(), this.getDeclaration(), null, "declaration", null, 0, -1, SubprogramBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubprogramBody_Statement(), theStatementPackage.getStatement(), null, "statement", null, 0, -1, SubprogramBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subtypeDeclarationEClass, SubtypeDeclaration.class, "SubtypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(configurationSpecificationEClass, ConfigurationSpecification.class, "ConfigurationSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigurationSpecification_List(), theVhdlPackage.getMultiName(), null, "list", null, 0, 1, ConfigurationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationSpecification_Component(), theVhdlPackage.getComponentReference(), null, "component", null, 0, 1, ConfigurationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationSpecification_Entity(), theVhdlPackage.getEntityReference(), null, "entity", null, 0, 1, ConfigurationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationSpecification_Configuration(), theConfigurationPackage.getConfigurationReference(), null, "configuration", null, 0, 1, ConfigurationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationSpecification_GenericMap(), theVhdlPackage.getGenericMaps(), null, "genericMap", null, 0, 1, ConfigurationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigurationSpecification_PortMap(), theVhdlPackage.getPortMaps(), null, "portMap", null, 0, 1, ConfigurationSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(declarationEClass, Declaration.class, "Declaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(disconnectionSpecificationEClass, DisconnectionSpecification.class, "DisconnectionSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDisconnectionSpecification_Disconnect(), theVhdlPackage.getMultiName(), null, "disconnect", null, 0, 1, DisconnectionSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDisconnectionSpecification_After(), theExpressionPackage.getExpression(), null, "after", null, 0, 1, DisconnectionSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileDeclarationEClass, FileDeclaration.class, "FileDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFileDeclaration_Open(), theExpressionPackage.getExpression(), null, "open", null, 0, 1, FileDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFileDeclaration_Is(), theExpressionPackage.getExpression(), null, "is", null, 0, 1, FileDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(terminalDeclarationEClass, TerminalDeclaration.class, "TerminalDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeDeclarationEClass, TypeDeclaration.class, "TypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeDeclaration_Is(), theTypePackage.getTypeDefinition(), null, "is", null, 0, 1, TypeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantDeclarationEClass, ConstantDeclaration.class, "ConstantDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(groupDeclarationEClass, GroupDeclaration.class, "GroupDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroupDeclaration_Is(), theVhdlPackage.getName_(), null, "is", null, 0, 1, GroupDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroupDeclaration_Member(), theVhdlPackage.getMultiName(), null, "member", null, 0, 1, GroupDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupTemplateDeclarationEClass, GroupTemplateDeclaration.class, "GroupTemplateDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroupTemplateDeclaration_Entry(), this.getEntityClass(), "entry", null, 0, -1, GroupTemplateDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(natureDeclarationEClass, NatureDeclaration.class, "NatureDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNatureDeclaration_Is(), theNaturePackage.getNatureDefinition(), null, "is", null, 0, 1, NatureDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalDeclarationEClass, SignalDeclaration.class, "SignalDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignalDeclaration_Kind(), this.getSignalKind(), "kind", null, 0, 1, SignalDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignalDeclaration_Mode(), this.getMode(), "mode", null, 0, 1, SignalDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(useClauseDeclarationEClass, UseClauseDeclaration.class, "UseClauseDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUseClauseDeclaration_Use(), theVhdlPackage.getMultiName(), null, "use", null, 0, 1, UseClauseDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableDeclarationEClass, VariableDeclaration.class, "VariableDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableDeclaration_Shared(), ecorePackage.getEBoolean(), "shared", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableDeclaration_Mode(), this.getMode(), "mode", null, 0, 1, VariableDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueDeclarationEClass, ValueDeclaration.class, "ValueDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueDeclaration_Initial(), theExpressionPackage.getExpression(), null, "initial", null, 0, 1, ValueDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(signalKindEEnum, SignalKind.class, "SignalKind");
		addEEnumLiteral(signalKindEEnum, SignalKind.REGISTER);
		addEEnumLiteral(signalKindEEnum, SignalKind.BUS);

		initEEnum(modeEEnum, Mode.class, "Mode");
		addEEnumLiteral(modeEEnum, Mode.IN);
		addEEnumLiteral(modeEEnum, Mode.OUT);
		addEEnumLiteral(modeEEnum, Mode.INOUT);
		addEEnumLiteral(modeEEnum, Mode.BUFFER);
		addEEnumLiteral(modeEEnum, Mode.LINKAGE);

		initEEnum(entityClassEEnum, EntityClass.class, "EntityClass");
		addEEnumLiteral(entityClassEEnum, EntityClass.ENTITY);
		addEEnumLiteral(entityClassEEnum, EntityClass.ARCHITECTURE);
		addEEnumLiteral(entityClassEEnum, EntityClass.CONFIGURATION);
		addEEnumLiteral(entityClassEEnum, EntityClass.PROCEDURE);
		addEEnumLiteral(entityClassEEnum, EntityClass.FUNCTION);
		addEEnumLiteral(entityClassEEnum, EntityClass.PACKAGE);
		addEEnumLiteral(entityClassEEnum, EntityClass.TYPE);
		addEEnumLiteral(entityClassEEnum, EntityClass.SUBTYPE);
		addEEnumLiteral(entityClassEEnum, EntityClass.CONSTANT);
		addEEnumLiteral(entityClassEEnum, EntityClass.SIGNAL);
		addEEnumLiteral(entityClassEEnum, EntityClass.VARIABLE);
		addEEnumLiteral(entityClassEEnum, EntityClass.COMPONENT);
		addEEnumLiteral(entityClassEEnum, EntityClass.LABEL);
		addEEnumLiteral(entityClassEEnum, EntityClass.LITERAL);
		addEEnumLiteral(entityClassEEnum, EntityClass.UNITS);
		addEEnumLiteral(entityClassEEnum, EntityClass.GROUP);
		addEEnumLiteral(entityClassEEnum, EntityClass.FILE);
		addEEnumLiteral(entityClassEEnum, EntityClass.NATURE);
		addEEnumLiteral(entityClassEEnum, EntityClass.SUBNATURE);
		addEEnumLiteral(entityClassEEnum, EntityClass.QUANTITY);
		addEEnumLiteral(entityClassEEnum, EntityClass.TERMINAL);

		initEEnum(purityEEnum, Purity.class, "Purity");
		addEEnumLiteral(purityEEnum, Purity.IMPURE);
		addEEnumLiteral(purityEEnum, Purity.PURE);
	}

} //DeclarationPackageImpl
