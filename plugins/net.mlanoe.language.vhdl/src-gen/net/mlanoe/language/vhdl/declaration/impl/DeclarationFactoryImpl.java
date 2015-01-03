/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.declaration.impl;

import net.mlanoe.language.vhdl.declaration.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DeclarationFactoryImpl extends EFactoryImpl implements DeclarationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DeclarationFactory init() {
		try {
			DeclarationFactory theDeclarationFactory = (DeclarationFactory)EPackage.Registry.INSTANCE.getEFactory(DeclarationPackage.eNS_URI);
			if (theDeclarationFactory != null) {
				return theDeclarationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DeclarationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DeclarationPackage.ALIAS_DECLARATION: return createAliasDeclaration();
			case DeclarationPackage.ATTRIBUTE_DECLARATION: return createAttributeDeclaration();
			case DeclarationPackage.ATTRIBUTE_SPECIFICATION: return createAttributeSpecification();
			case DeclarationPackage.BRANCH_QUANTITY_DECLARATION: return createBranchQuantityDeclaration();
			case DeclarationPackage.FREE_QUANTITY_DECLARATION: return createFreeQuantityDeclaration();
			case DeclarationPackage.LIMIT_DECLARATION: return createLimitDeclaration();
			case DeclarationPackage.SOURCE_QUANTITY_DECLARATION: return createSourceQuantityDeclaration();
			case DeclarationPackage.SUBNATURE_DECLARATION: return createSubnatureDeclaration();
			case DeclarationPackage.PROCEDURE_DECLARATION: return createProcedureDeclaration();
			case DeclarationPackage.FUNCTION_DECLARATION: return createFunctionDeclaration();
			case DeclarationPackage.SUBPROGRAM_BODY: return createSubprogramBody();
			case DeclarationPackage.SUBTYPE_DECLARATION: return createSubtypeDeclaration();
			case DeclarationPackage.CONFIGURATION_SPECIFICATION: return createConfigurationSpecification();
			case DeclarationPackage.DISCONNECTION_SPECIFICATION: return createDisconnectionSpecification();
			case DeclarationPackage.FILE_DECLARATION: return createFileDeclaration();
			case DeclarationPackage.TERMINAL_DECLARATION: return createTerminalDeclaration();
			case DeclarationPackage.TYPE_DECLARATION: return createTypeDeclaration();
			case DeclarationPackage.CONSTANT_DECLARATION: return createConstantDeclaration();
			case DeclarationPackage.GROUP_DECLARATION: return createGroupDeclaration();
			case DeclarationPackage.GROUP_TEMPLATE_DECLARATION: return createGroupTemplateDeclaration();
			case DeclarationPackage.NATURE_DECLARATION: return createNatureDeclaration();
			case DeclarationPackage.SIGNAL_DECLARATION: return createSignalDeclaration();
			case DeclarationPackage.USE_CLAUSE_DECLARATION: return createUseClauseDeclaration();
			case DeclarationPackage.VARIABLE_DECLARATION: return createVariableDeclaration();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case DeclarationPackage.SIGNAL_KIND:
				return createSignalKindFromString(eDataType, initialValue);
			case DeclarationPackage.MODE:
				return createModeFromString(eDataType, initialValue);
			case DeclarationPackage.ENTITY_CLASS:
				return createEntityClassFromString(eDataType, initialValue);
			case DeclarationPackage.PURITY:
				return createPurityFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case DeclarationPackage.SIGNAL_KIND:
				return convertSignalKindToString(eDataType, instanceValue);
			case DeclarationPackage.MODE:
				return convertModeToString(eDataType, instanceValue);
			case DeclarationPackage.ENTITY_CLASS:
				return convertEntityClassToString(eDataType, instanceValue);
			case DeclarationPackage.PURITY:
				return convertPurityToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasDeclaration createAliasDeclaration() {
		AliasDeclarationImpl aliasDeclaration = new AliasDeclarationImpl();
		return aliasDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDeclaration createAttributeDeclaration() {
		AttributeDeclarationImpl attributeDeclaration = new AttributeDeclarationImpl();
		return attributeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeSpecification createAttributeSpecification() {
		AttributeSpecificationImpl attributeSpecification = new AttributeSpecificationImpl();
		return attributeSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BranchQuantityDeclaration createBranchQuantityDeclaration() {
		BranchQuantityDeclarationImpl branchQuantityDeclaration = new BranchQuantityDeclarationImpl();
		return branchQuantityDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FreeQuantityDeclaration createFreeQuantityDeclaration() {
		FreeQuantityDeclarationImpl freeQuantityDeclaration = new FreeQuantityDeclarationImpl();
		return freeQuantityDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LimitDeclaration createLimitDeclaration() {
		LimitDeclarationImpl limitDeclaration = new LimitDeclarationImpl();
		return limitDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceQuantityDeclaration createSourceQuantityDeclaration() {
		SourceQuantityDeclarationImpl sourceQuantityDeclaration = new SourceQuantityDeclarationImpl();
		return sourceQuantityDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubnatureDeclaration createSubnatureDeclaration() {
		SubnatureDeclarationImpl subnatureDeclaration = new SubnatureDeclarationImpl();
		return subnatureDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcedureDeclaration createProcedureDeclaration() {
		ProcedureDeclarationImpl procedureDeclaration = new ProcedureDeclarationImpl();
		return procedureDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionDeclaration createFunctionDeclaration() {
		FunctionDeclarationImpl functionDeclaration = new FunctionDeclarationImpl();
		return functionDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubprogramBody createSubprogramBody() {
		SubprogramBodyImpl subprogramBody = new SubprogramBodyImpl();
		return subprogramBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubtypeDeclaration createSubtypeDeclaration() {
		SubtypeDeclarationImpl subtypeDeclaration = new SubtypeDeclarationImpl();
		return subtypeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationSpecification createConfigurationSpecification() {
		ConfigurationSpecificationImpl configurationSpecification = new ConfigurationSpecificationImpl();
		return configurationSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisconnectionSpecification createDisconnectionSpecification() {
		DisconnectionSpecificationImpl disconnectionSpecification = new DisconnectionSpecificationImpl();
		return disconnectionSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileDeclaration createFileDeclaration() {
		FileDeclarationImpl fileDeclaration = new FileDeclarationImpl();
		return fileDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminalDeclaration createTerminalDeclaration() {
		TerminalDeclarationImpl terminalDeclaration = new TerminalDeclarationImpl();
		return terminalDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDeclaration createTypeDeclaration() {
		TypeDeclarationImpl typeDeclaration = new TypeDeclarationImpl();
		return typeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantDeclaration createConstantDeclaration() {
		ConstantDeclarationImpl constantDeclaration = new ConstantDeclarationImpl();
		return constantDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupDeclaration createGroupDeclaration() {
		GroupDeclarationImpl groupDeclaration = new GroupDeclarationImpl();
		return groupDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupTemplateDeclaration createGroupTemplateDeclaration() {
		GroupTemplateDeclarationImpl groupTemplateDeclaration = new GroupTemplateDeclarationImpl();
		return groupTemplateDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NatureDeclaration createNatureDeclaration() {
		NatureDeclarationImpl natureDeclaration = new NatureDeclarationImpl();
		return natureDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalDeclaration createSignalDeclaration() {
		SignalDeclarationImpl signalDeclaration = new SignalDeclarationImpl();
		return signalDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseClauseDeclaration createUseClauseDeclaration() {
		UseClauseDeclarationImpl useClauseDeclaration = new UseClauseDeclarationImpl();
		return useClauseDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableDeclaration createVariableDeclaration() {
		VariableDeclarationImpl variableDeclaration = new VariableDeclarationImpl();
		return variableDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalKind createSignalKindFromString(EDataType eDataType, String initialValue) {
		SignalKind result = SignalKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignalKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mode createModeFromString(EDataType eDataType, String initialValue) {
		Mode result = Mode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityClass createEntityClassFromString(EDataType eDataType, String initialValue) {
		EntityClass result = EntityClass.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEntityClassToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Purity createPurityFromString(EDataType eDataType, String initialValue) {
		Purity result = Purity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPurityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationPackage getDeclarationPackage() {
		return (DeclarationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DeclarationPackage getPackage() {
		return DeclarationPackage.eINSTANCE;
	}

} //DeclarationFactoryImpl
