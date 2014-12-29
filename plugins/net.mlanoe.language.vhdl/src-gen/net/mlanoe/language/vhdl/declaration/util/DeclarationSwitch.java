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
package net.mlanoe.language.vhdl.declaration.util;

import net.mlanoe.language.vhdl.MultiNamed;
import net.mlanoe.language.vhdl.Named;
import net.mlanoe.language.vhdl.VhdlObject;
import net.mlanoe.language.vhdl.declaration.*;
import net.mlanoe.language.vhdl.nature.Natured;
import net.mlanoe.language.vhdl.type.Typed;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.mlanoe.language.vhdl.declaration.DeclarationPackage
 * @generated
 */
public class DeclarationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DeclarationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclarationSwitch() {
		if (modelPackage == null) {
			modelPackage = DeclarationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DeclarationPackage.ALIAS_DECLARATION: {
				AliasDeclaration aliasDeclaration = (AliasDeclaration)theEObject;
				T result = caseAliasDeclaration(aliasDeclaration);
				if (result == null) result = caseDeclaration(aliasDeclaration);
				if (result == null) result = caseNamed(aliasDeclaration);
				if (result == null) result = caseVhdlObject(aliasDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.ATTRIBUTE_DECLARATION: {
				AttributeDeclaration attributeDeclaration = (AttributeDeclaration)theEObject;
				T result = caseAttributeDeclaration(attributeDeclaration);
				if (result == null) result = caseDeclaration(attributeDeclaration);
				if (result == null) result = caseNamed(attributeDeclaration);
				if (result == null) result = caseTyped(attributeDeclaration);
				if (result == null) result = caseVhdlObject(attributeDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.ATTRIBUTE_SPECIFICATION: {
				AttributeSpecification attributeSpecification = (AttributeSpecification)theEObject;
				T result = caseAttributeSpecification(attributeSpecification);
				if (result == null) result = caseDeclaration(attributeSpecification);
				if (result == null) result = caseNamed(attributeSpecification);
				if (result == null) result = caseVhdlObject(attributeSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.BRANCH_QUANTITY_DECLARATION: {
				BranchQuantityDeclaration branchQuantityDeclaration = (BranchQuantityDeclaration)theEObject;
				T result = caseBranchQuantityDeclaration(branchQuantityDeclaration);
				if (result == null) result = caseQuantityDeclaration(branchQuantityDeclaration);
				if (result == null) result = caseDeclaration(branchQuantityDeclaration);
				if (result == null) result = caseVhdlObject(branchQuantityDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.FREE_QUANTITY_DECLARATION: {
				FreeQuantityDeclaration freeQuantityDeclaration = (FreeQuantityDeclaration)theEObject;
				T result = caseFreeQuantityDeclaration(freeQuantityDeclaration);
				if (result == null) result = caseQuantityDeclaration(freeQuantityDeclaration);
				if (result == null) result = caseMultiNamed(freeQuantityDeclaration);
				if (result == null) result = caseTyped(freeQuantityDeclaration);
				if (result == null) result = caseDeclaration(freeQuantityDeclaration);
				if (result == null) result = caseVhdlObject(freeQuantityDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.LIMIT_DECLARATION: {
				LimitDeclaration limitDeclaration = (LimitDeclaration)theEObject;
				T result = caseLimitDeclaration(limitDeclaration);
				if (result == null) result = caseDeclaration(limitDeclaration);
				if (result == null) result = caseMultiNamed(limitDeclaration);
				if (result == null) result = caseTyped(limitDeclaration);
				if (result == null) result = caseVhdlObject(limitDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.QUANTITY_DECLARATION: {
				QuantityDeclaration quantityDeclaration = (QuantityDeclaration)theEObject;
				T result = caseQuantityDeclaration(quantityDeclaration);
				if (result == null) result = caseDeclaration(quantityDeclaration);
				if (result == null) result = caseVhdlObject(quantityDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.SOURCE_QUANTITY_DECLARATION: {
				SourceQuantityDeclaration sourceQuantityDeclaration = (SourceQuantityDeclaration)theEObject;
				T result = caseSourceQuantityDeclaration(sourceQuantityDeclaration);
				if (result == null) result = caseQuantityDeclaration(sourceQuantityDeclaration);
				if (result == null) result = caseMultiNamed(sourceQuantityDeclaration);
				if (result == null) result = caseTyped(sourceQuantityDeclaration);
				if (result == null) result = caseDeclaration(sourceQuantityDeclaration);
				if (result == null) result = caseVhdlObject(sourceQuantityDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.SUBNATURE_DECLARATION: {
				SubnatureDeclaration subnatureDeclaration = (SubnatureDeclaration)theEObject;
				T result = caseSubnatureDeclaration(subnatureDeclaration);
				if (result == null) result = caseDeclaration(subnatureDeclaration);
				if (result == null) result = caseNamed(subnatureDeclaration);
				if (result == null) result = caseNatured(subnatureDeclaration);
				if (result == null) result = caseVhdlObject(subnatureDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.SUBPROGRAM_DECLARATION: {
				SubprogramDeclaration subprogramDeclaration = (SubprogramDeclaration)theEObject;
				T result = caseSubprogramDeclaration(subprogramDeclaration);
				if (result == null) result = caseDeclaration(subprogramDeclaration);
				if (result == null) result = caseNamed(subprogramDeclaration);
				if (result == null) result = caseVhdlObject(subprogramDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.PROCEDURE_DECLARATION: {
				ProcedureDeclaration procedureDeclaration = (ProcedureDeclaration)theEObject;
				T result = caseProcedureDeclaration(procedureDeclaration);
				if (result == null) result = caseSubprogramDeclaration(procedureDeclaration);
				if (result == null) result = caseDeclaration(procedureDeclaration);
				if (result == null) result = caseNamed(procedureDeclaration);
				if (result == null) result = caseVhdlObject(procedureDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.FUNCTION_DECLARATION: {
				FunctionDeclaration functionDeclaration = (FunctionDeclaration)theEObject;
				T result = caseFunctionDeclaration(functionDeclaration);
				if (result == null) result = caseSubprogramDeclaration(functionDeclaration);
				if (result == null) result = caseTyped(functionDeclaration);
				if (result == null) result = caseDeclaration(functionDeclaration);
				if (result == null) result = caseNamed(functionDeclaration);
				if (result == null) result = caseVhdlObject(functionDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.SUBPROGRAM_BODY: {
				SubprogramBody subprogramBody = (SubprogramBody)theEObject;
				T result = caseSubprogramBody(subprogramBody);
				if (result == null) result = caseVhdlObject(subprogramBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.SUBTYPE_DECLARATION: {
				SubtypeDeclaration subtypeDeclaration = (SubtypeDeclaration)theEObject;
				T result = caseSubtypeDeclaration(subtypeDeclaration);
				if (result == null) result = caseDeclaration(subtypeDeclaration);
				if (result == null) result = caseNamed(subtypeDeclaration);
				if (result == null) result = caseTyped(subtypeDeclaration);
				if (result == null) result = caseVhdlObject(subtypeDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.CONFIGURATION_SPECIFICATION: {
				ConfigurationSpecification configurationSpecification = (ConfigurationSpecification)theEObject;
				T result = caseConfigurationSpecification(configurationSpecification);
				if (result == null) result = caseDeclaration(configurationSpecification);
				if (result == null) result = caseVhdlObject(configurationSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.DECLARATION: {
				Declaration declaration = (Declaration)theEObject;
				T result = caseDeclaration(declaration);
				if (result == null) result = caseVhdlObject(declaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.DISCONNECTION_SPECIFICATION: {
				DisconnectionSpecification disconnectionSpecification = (DisconnectionSpecification)theEObject;
				T result = caseDisconnectionSpecification(disconnectionSpecification);
				if (result == null) result = caseDeclaration(disconnectionSpecification);
				if (result == null) result = caseTyped(disconnectionSpecification);
				if (result == null) result = caseVhdlObject(disconnectionSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.FILE_DECLARATION: {
				FileDeclaration fileDeclaration = (FileDeclaration)theEObject;
				T result = caseFileDeclaration(fileDeclaration);
				if (result == null) result = caseDeclaration(fileDeclaration);
				if (result == null) result = caseMultiNamed(fileDeclaration);
				if (result == null) result = caseTyped(fileDeclaration);
				if (result == null) result = caseVhdlObject(fileDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.TERMINAL_DECLARATION: {
				TerminalDeclaration terminalDeclaration = (TerminalDeclaration)theEObject;
				T result = caseTerminalDeclaration(terminalDeclaration);
				if (result == null) result = caseDeclaration(terminalDeclaration);
				if (result == null) result = caseMultiNamed(terminalDeclaration);
				if (result == null) result = caseNatured(terminalDeclaration);
				if (result == null) result = caseVhdlObject(terminalDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.TYPE_DECLARATION: {
				TypeDeclaration typeDeclaration = (TypeDeclaration)theEObject;
				T result = caseTypeDeclaration(typeDeclaration);
				if (result == null) result = caseDeclaration(typeDeclaration);
				if (result == null) result = caseNamed(typeDeclaration);
				if (result == null) result = caseVhdlObject(typeDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.CONSTANT_DECLARATION: {
				ConstantDeclaration constantDeclaration = (ConstantDeclaration)theEObject;
				T result = caseConstantDeclaration(constantDeclaration);
				if (result == null) result = caseValueDeclaration(constantDeclaration);
				if (result == null) result = caseDeclaration(constantDeclaration);
				if (result == null) result = caseMultiNamed(constantDeclaration);
				if (result == null) result = caseTyped(constantDeclaration);
				if (result == null) result = caseVhdlObject(constantDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.GROUP_DECLARATION: {
				GroupDeclaration groupDeclaration = (GroupDeclaration)theEObject;
				T result = caseGroupDeclaration(groupDeclaration);
				if (result == null) result = caseDeclaration(groupDeclaration);
				if (result == null) result = caseNamed(groupDeclaration);
				if (result == null) result = caseVhdlObject(groupDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.GROUP_TEMPLATE_DECLARATION: {
				GroupTemplateDeclaration groupTemplateDeclaration = (GroupTemplateDeclaration)theEObject;
				T result = caseGroupTemplateDeclaration(groupTemplateDeclaration);
				if (result == null) result = caseDeclaration(groupTemplateDeclaration);
				if (result == null) result = caseNamed(groupTemplateDeclaration);
				if (result == null) result = caseVhdlObject(groupTemplateDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.NATURE_DECLARATION: {
				NatureDeclaration natureDeclaration = (NatureDeclaration)theEObject;
				T result = caseNatureDeclaration(natureDeclaration);
				if (result == null) result = caseDeclaration(natureDeclaration);
				if (result == null) result = caseNamed(natureDeclaration);
				if (result == null) result = caseVhdlObject(natureDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.SIGNAL_DECLARATION: {
				SignalDeclaration signalDeclaration = (SignalDeclaration)theEObject;
				T result = caseSignalDeclaration(signalDeclaration);
				if (result == null) result = caseValueDeclaration(signalDeclaration);
				if (result == null) result = caseDeclaration(signalDeclaration);
				if (result == null) result = caseMultiNamed(signalDeclaration);
				if (result == null) result = caseTyped(signalDeclaration);
				if (result == null) result = caseVhdlObject(signalDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.USE_CLAUSE_DECLARATION: {
				UseClauseDeclaration useClauseDeclaration = (UseClauseDeclaration)theEObject;
				T result = caseUseClauseDeclaration(useClauseDeclaration);
				if (result == null) result = caseDeclaration(useClauseDeclaration);
				if (result == null) result = caseVhdlObject(useClauseDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.VARIABLE_DECLARATION: {
				VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
				T result = caseVariableDeclaration(variableDeclaration);
				if (result == null) result = caseValueDeclaration(variableDeclaration);
				if (result == null) result = caseDeclaration(variableDeclaration);
				if (result == null) result = caseMultiNamed(variableDeclaration);
				if (result == null) result = caseTyped(variableDeclaration);
				if (result == null) result = caseVhdlObject(variableDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DeclarationPackage.VALUE_DECLARATION: {
				ValueDeclaration valueDeclaration = (ValueDeclaration)theEObject;
				T result = caseValueDeclaration(valueDeclaration);
				if (result == null) result = caseDeclaration(valueDeclaration);
				if (result == null) result = caseMultiNamed(valueDeclaration);
				if (result == null) result = caseTyped(valueDeclaration);
				if (result == null) result = caseVhdlObject(valueDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quantity Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quantity Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuantityDeclaration(QuantityDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Free Quantity Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Free Quantity Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFreeQuantityDeclaration(FreeQuantityDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Branch Quantity Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Branch Quantity Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBranchQuantityDeclaration(BranchQuantityDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source Quantity Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source Quantity Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSourceQuantityDeclaration(SourceQuantityDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Limit Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Limit Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLimitDeclaration(LimitDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subnature Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subnature Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubnatureDeclaration(SubnatureDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subprogram Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subprogram Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubprogramDeclaration(SubprogramDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Procedure Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Procedure Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcedureDeclaration(ProcedureDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionDeclaration(FunctionDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subprogram Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subprogram Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubprogramBody(SubprogramBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subtype Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtype Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtypeDeclaration(SubtypeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alias Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alias Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAliasDeclaration(AliasDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDeclaration(AttributeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeSpecification(AttributeSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationSpecification(ConfigurationSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeclaration(Declaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disconnection Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disconnection Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisconnectionSpecification(DisconnectionSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileDeclaration(FileDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminal Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminal Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminalDeclaration(TerminalDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDeclaration(TypeDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantDeclaration(ConstantDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupDeclaration(GroupDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group Template Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group Template Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGroupTemplateDeclaration(GroupTemplateDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nature Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nature Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNatureDeclaration(NatureDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signal Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signal Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalDeclaration(SignalDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Clause Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Clause Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUseClauseDeclaration(UseClauseDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclaration(VariableDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueDeclaration(ValueDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVhdlObject(VhdlObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamed(Named object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTyped(Typed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Named</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Named</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiNamed(MultiNamed object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Natured</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Natured</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNatured(Natured object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DeclarationSwitch
