/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.declaration.util;

import net.mlanoe.language.vhdl.MultiNamed;
import net.mlanoe.language.vhdl.Named;
import net.mlanoe.language.vhdl.VhdlObject;

import net.mlanoe.language.vhdl.declaration.*;

import net.mlanoe.language.vhdl.nature.Natured;

import net.mlanoe.language.vhdl.type.Typed;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage
 * @generated
 */
public class DeclarationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DeclarationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DeclarationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeclarationSwitch<Adapter> modelSwitch =
		new DeclarationSwitch<Adapter>() {
			@Override
			public Adapter caseAliasDeclaration(AliasDeclaration object) {
				return createAliasDeclarationAdapter();
			}
			@Override
			public Adapter caseAttributeDeclaration(AttributeDeclaration object) {
				return createAttributeDeclarationAdapter();
			}
			@Override
			public Adapter caseAttributeSpecification(AttributeSpecification object) {
				return createAttributeSpecificationAdapter();
			}
			@Override
			public Adapter caseBranchQuantityDeclaration(BranchQuantityDeclaration object) {
				return createBranchQuantityDeclarationAdapter();
			}
			@Override
			public Adapter caseFreeQuantityDeclaration(FreeQuantityDeclaration object) {
				return createFreeQuantityDeclarationAdapter();
			}
			@Override
			public Adapter caseLimitDeclaration(LimitDeclaration object) {
				return createLimitDeclarationAdapter();
			}
			@Override
			public Adapter caseQuantityDeclaration(QuantityDeclaration object) {
				return createQuantityDeclarationAdapter();
			}
			@Override
			public Adapter caseSourceQuantityDeclaration(SourceQuantityDeclaration object) {
				return createSourceQuantityDeclarationAdapter();
			}
			@Override
			public Adapter caseSubnatureDeclaration(SubnatureDeclaration object) {
				return createSubnatureDeclarationAdapter();
			}
			@Override
			public Adapter caseSubprogramDeclaration(SubprogramDeclaration object) {
				return createSubprogramDeclarationAdapter();
			}
			@Override
			public Adapter caseProcedureDeclaration(ProcedureDeclaration object) {
				return createProcedureDeclarationAdapter();
			}
			@Override
			public Adapter caseFunctionDeclaration(FunctionDeclaration object) {
				return createFunctionDeclarationAdapter();
			}
			@Override
			public Adapter caseSubprogramBody(SubprogramBody object) {
				return createSubprogramBodyAdapter();
			}
			@Override
			public Adapter caseSubtypeDeclaration(SubtypeDeclaration object) {
				return createSubtypeDeclarationAdapter();
			}
			@Override
			public Adapter caseConfigurationSpecification(ConfigurationSpecification object) {
				return createConfigurationSpecificationAdapter();
			}
			@Override
			public Adapter caseDeclaration(Declaration object) {
				return createDeclarationAdapter();
			}
			@Override
			public Adapter caseDisconnectionSpecification(DisconnectionSpecification object) {
				return createDisconnectionSpecificationAdapter();
			}
			@Override
			public Adapter caseFileDeclaration(FileDeclaration object) {
				return createFileDeclarationAdapter();
			}
			@Override
			public Adapter caseTerminalDeclaration(TerminalDeclaration object) {
				return createTerminalDeclarationAdapter();
			}
			@Override
			public Adapter caseTypeDeclaration(TypeDeclaration object) {
				return createTypeDeclarationAdapter();
			}
			@Override
			public Adapter caseConstantDeclaration(ConstantDeclaration object) {
				return createConstantDeclarationAdapter();
			}
			@Override
			public Adapter caseGroupDeclaration(GroupDeclaration object) {
				return createGroupDeclarationAdapter();
			}
			@Override
			public Adapter caseGroupTemplateDeclaration(GroupTemplateDeclaration object) {
				return createGroupTemplateDeclarationAdapter();
			}
			@Override
			public Adapter caseNatureDeclaration(NatureDeclaration object) {
				return createNatureDeclarationAdapter();
			}
			@Override
			public Adapter caseSignalDeclaration(SignalDeclaration object) {
				return createSignalDeclarationAdapter();
			}
			@Override
			public Adapter caseUseClauseDeclaration(UseClauseDeclaration object) {
				return createUseClauseDeclarationAdapter();
			}
			@Override
			public Adapter caseVariableDeclaration(VariableDeclaration object) {
				return createVariableDeclarationAdapter();
			}
			@Override
			public Adapter caseValueDeclaration(ValueDeclaration object) {
				return createValueDeclarationAdapter();
			}
			@Override
			public Adapter caseVhdlObject(VhdlObject object) {
				return createVhdlObjectAdapter();
			}
			@Override
			public Adapter caseNamed(Named object) {
				return createNamedAdapter();
			}
			@Override
			public Adapter caseTyped(Typed object) {
				return createTypedAdapter();
			}
			@Override
			public Adapter caseMultiNamed(MultiNamed object) {
				return createMultiNamedAdapter();
			}
			@Override
			public Adapter caseNatured(Natured object) {
				return createNaturedAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.declaration.AliasDeclaration <em>Alias Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.declaration.AliasDeclaration
	 * @generated
	 */
	public Adapter createAliasDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.declaration.AttributeDeclaration <em>Attribute Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.declaration.AttributeDeclaration
	 * @generated
	 */
	public Adapter createAttributeDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.declaration.AttributeSpecification <em>Attribute Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.declaration.AttributeSpecification
	 * @generated
	 */
	public Adapter createAttributeSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.declaration.BranchQuantityDeclaration <em>Branch Quantity Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.declaration.BranchQuantityDeclaration
	 * @generated
	 */
	public Adapter createBranchQuantityDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.declaration.FreeQuantityDeclaration <em>Free Quantity Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.declaration.FreeQuantityDeclaration
	 * @generated
	 */
	public Adapter createFreeQuantityDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.declaration.LimitDeclaration <em>Limit Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.declaration.LimitDeclaration
	 * @generated
	 */
	public Adapter createLimitDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.declaration.QuantityDeclaration <em>Quantity Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.declaration.QuantityDeclaration
	 * @generated
	 */
	public Adapter createQuantityDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.declaration.SourceQuantityDeclaration <em>Source Quantity Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.declaration.SourceQuantityDeclaration
	 * @generated
	 */
	public Adapter createSourceQuantityDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.declaration.SubnatureDeclaration <em>Subnature Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.declaration.SubnatureDeclaration
	 * @generated
	 */
	public Adapter createSubnatureDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.declaration.SubprogramDeclaration <em>Subprogram Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.declaration.SubprogramDeclaration
	 * @generated
	 */
	public Adapter createSubprogramDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.declaration.ProcedureDeclaration <em>Procedure Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.declaration.ProcedureDeclaration
	 * @generated
	 */
	public Adapter createProcedureDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.declaration.FunctionDeclaration <em>Function Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.declaration.FunctionDeclaration
	 * @generated
	 */
	public Adapter createFunctionDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.declaration.SubprogramBody <em>Subprogram Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.declaration.SubprogramBody
	 * @generated
	 */
	public Adapter createSubprogramBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.declaration.SubtypeDeclaration <em>Subtype Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.declaration.SubtypeDeclaration
	 * @generated
	 */
	public Adapter createSubtypeDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.declaration.ConfigurationSpecification <em>Configuration Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.declaration.ConfigurationSpecification
	 * @generated
	 */
	public Adapter createConfigurationSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.declaration.Declaration <em>Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.declaration.Declaration
	 * @generated
	 */
	public Adapter createDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.declaration.DisconnectionSpecification <em>Disconnection Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.declaration.DisconnectionSpecification
	 * @generated
	 */
	public Adapter createDisconnectionSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.declaration.FileDeclaration <em>File Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.declaration.FileDeclaration
	 * @generated
	 */
	public Adapter createFileDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.declaration.TerminalDeclaration <em>Terminal Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.declaration.TerminalDeclaration
	 * @generated
	 */
	public Adapter createTerminalDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.declaration.TypeDeclaration <em>Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.declaration.TypeDeclaration
	 * @generated
	 */
	public Adapter createTypeDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.declaration.ConstantDeclaration <em>Constant Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.declaration.ConstantDeclaration
	 * @generated
	 */
	public Adapter createConstantDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.declaration.GroupDeclaration <em>Group Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.declaration.GroupDeclaration
	 * @generated
	 */
	public Adapter createGroupDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.declaration.GroupTemplateDeclaration <em>Group Template Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.declaration.GroupTemplateDeclaration
	 * @generated
	 */
	public Adapter createGroupTemplateDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.declaration.NatureDeclaration <em>Nature Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.declaration.NatureDeclaration
	 * @generated
	 */
	public Adapter createNatureDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.declaration.SignalDeclaration <em>Signal Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.declaration.SignalDeclaration
	 * @generated
	 */
	public Adapter createSignalDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.declaration.UseClauseDeclaration <em>Use Clause Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.declaration.UseClauseDeclaration
	 * @generated
	 */
	public Adapter createUseClauseDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.declaration.VariableDeclaration <em>Variable Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.declaration.VariableDeclaration
	 * @generated
	 */
	public Adapter createVariableDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.declaration.ValueDeclaration <em>Value Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.declaration.ValueDeclaration
	 * @generated
	 */
	public Adapter createValueDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.VhdlObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.VhdlObject
	 * @generated
	 */
	public Adapter createVhdlObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.Named
	 * @generated
	 */
	public Adapter createNamedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.type.Typed <em>Typed</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.type.Typed
	 * @generated
	 */
	public Adapter createTypedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.MultiNamed <em>Multi Named</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.MultiNamed
	 * @generated
	 */
	public Adapter createMultiNamedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mlanoe.language.vhdl.nature.Natured <em>Natured</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mlanoe.language.vhdl.nature.Natured
	 * @generated
	 */
	public Adapter createNaturedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DeclarationAdapterFactory
