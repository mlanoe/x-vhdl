/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.expression.util;

import net.mlanoe.language.vhdl.CallReference;
import net.mlanoe.language.vhdl.ComponentReference;
import net.mlanoe.language.vhdl.EntityReference;
import net.mlanoe.language.vhdl.MultiName;
import net.mlanoe.language.vhdl.Name;
import net.mlanoe.language.vhdl.Named;
import net.mlanoe.language.vhdl.PackageReference;
import net.mlanoe.language.vhdl.VhdlObject;

import net.mlanoe.language.vhdl.configuration.ConfigurationReference;

import net.mlanoe.language.vhdl.expression.*;

import net.mlanoe.language.vhdl.nature.NatureReference;

import net.mlanoe.language.vhdl.type.EnumerationLiteral;
import net.mlanoe.language.vhdl.type.TypeReference;
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
 * @see net.mlanoe.language.vhdl.expression.ExpressionPackage
 * @generated
 */
public class ExpressionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExpressionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionSwitch() {
		if (modelPackage == null) {
			modelPackage = ExpressionPackage.eINSTANCE;
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
			case ExpressionPackage.ADDING_EXPRESSION: {
				AddingExpression addingExpression = (AddingExpression)theEObject;
				T result = caseAddingExpression(addingExpression);
				if (result == null) result = caseBinaryExpression(addingExpression);
				if (result == null) result = caseExpression(addingExpression);
				if (result == null) result = caseVhdlObject(addingExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.AGGREGATE_EXPRESSION: {
				AggregateExpression aggregateExpression = (AggregateExpression)theEObject;
				T result = caseAggregateExpression(aggregateExpression);
				if (result == null) result = caseMultiExpression(aggregateExpression);
				if (result == null) result = caseName(aggregateExpression);
				if (result == null) result = caseExpression(aggregateExpression);
				if (result == null) result = caseMultiName(aggregateExpression);
				if (result == null) result = caseTypeReference(aggregateExpression);
				if (result == null) result = caseNatureReference(aggregateExpression);
				if (result == null) result = caseEntityReference(aggregateExpression);
				if (result == null) result = casePackageReference(aggregateExpression);
				if (result == null) result = caseComponentReference(aggregateExpression);
				if (result == null) result = caseConfigurationReference(aggregateExpression);
				if (result == null) result = caseCallReference(aggregateExpression);
				if (result == null) result = caseVhdlObject(aggregateExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.ALL_EXPRESSION: {
				AllExpression allExpression = (AllExpression)theEObject;
				T result = caseAllExpression(allExpression);
				if (result == null) result = caseExpression(allExpression);
				if (result == null) result = caseName(allExpression);
				if (result == null) result = caseVhdlObject(allExpression);
				if (result == null) result = caseMultiName(allExpression);
				if (result == null) result = caseTypeReference(allExpression);
				if (result == null) result = caseNatureReference(allExpression);
				if (result == null) result = caseEntityReference(allExpression);
				if (result == null) result = casePackageReference(allExpression);
				if (result == null) result = caseComponentReference(allExpression);
				if (result == null) result = caseConfigurationReference(allExpression);
				if (result == null) result = caseCallReference(allExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.ALLOCATOR_EXPRESSION: {
				AllocatorExpression allocatorExpression = (AllocatorExpression)theEObject;
				T result = caseAllocatorExpression(allocatorExpression);
				if (result == null) result = caseExpression(allocatorExpression);
				if (result == null) result = caseTyped(allocatorExpression);
				if (result == null) result = caseVhdlObject(allocatorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.ASSOCIATION_EXPRESSION: {
				AssociationExpression associationExpression = (AssociationExpression)theEObject;
				T result = caseAssociationExpression(associationExpression);
				if (result == null) result = caseExpression(associationExpression);
				if (result == null) result = caseVhdlObject(associationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.ATTRIBUTE_EXPRESSION: {
				AttributeExpression attributeExpression = (AttributeExpression)theEObject;
				T result = caseAttributeExpression(attributeExpression);
				if (result == null) result = caseValueExpression(attributeExpression);
				if (result == null) result = caseName(attributeExpression);
				if (result == null) result = caseExpression(attributeExpression);
				if (result == null) result = caseMultiName(attributeExpression);
				if (result == null) result = caseTypeReference(attributeExpression);
				if (result == null) result = caseNatureReference(attributeExpression);
				if (result == null) result = caseEntityReference(attributeExpression);
				if (result == null) result = casePackageReference(attributeExpression);
				if (result == null) result = caseComponentReference(attributeExpression);
				if (result == null) result = caseConfigurationReference(attributeExpression);
				if (result == null) result = caseCallReference(attributeExpression);
				if (result == null) result = caseVhdlObject(attributeExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.BINARY_EXPRESSION: {
				BinaryExpression binaryExpression = (BinaryExpression)theEObject;
				T result = caseBinaryExpression(binaryExpression);
				if (result == null) result = caseExpression(binaryExpression);
				if (result == null) result = caseVhdlObject(binaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.BIT_STRING_EXPRESSION: {
				BitStringExpression bitStringExpression = (BitStringExpression)theEObject;
				T result = caseBitStringExpression(bitStringExpression);
				if (result == null) result = caseValueExpression(bitStringExpression);
				if (result == null) result = caseExpression(bitStringExpression);
				if (result == null) result = caseVhdlObject(bitStringExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = caseVhdlObject(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.INDICATION_EXPRESSION: {
				IndicationExpression indicationExpression = (IndicationExpression)theEObject;
				T result = caseIndicationExpression(indicationExpression);
				if (result == null) result = caseExpression(indicationExpression);
				if (result == null) result = caseVhdlObject(indicationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.SUBTYPE_INDICATION_EXPRESSION: {
				SubtypeIndicationExpression subtypeIndicationExpression = (SubtypeIndicationExpression)theEObject;
				T result = caseSubtypeIndicationExpression(subtypeIndicationExpression);
				if (result == null) result = caseIndicationExpression(subtypeIndicationExpression);
				if (result == null) result = caseTypeReference(subtypeIndicationExpression);
				if (result == null) result = caseNamed(subtypeIndicationExpression);
				if (result == null) result = caseExpression(subtypeIndicationExpression);
				if (result == null) result = caseVhdlObject(subtypeIndicationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.SUBNATURE_INDICATION_EXPRESSION: {
				SubnatureIndicationExpression subnatureIndicationExpression = (SubnatureIndicationExpression)theEObject;
				T result = caseSubnatureIndicationExpression(subnatureIndicationExpression);
				if (result == null) result = caseIndicationExpression(subnatureIndicationExpression);
				if (result == null) result = caseNatureReference(subnatureIndicationExpression);
				if (result == null) result = caseExpression(subnatureIndicationExpression);
				if (result == null) result = caseVhdlObject(subnatureIndicationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.LOGICAL_EXPRESSION: {
				LogicalExpression logicalExpression = (LogicalExpression)theEObject;
				T result = caseLogicalExpression(logicalExpression);
				if (result == null) result = caseBinaryExpression(logicalExpression);
				if (result == null) result = caseExpression(logicalExpression);
				if (result == null) result = caseVhdlObject(logicalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.NAME_EXPRESSION: {
				NameExpression nameExpression = (NameExpression)theEObject;
				T result = caseNameExpression(nameExpression);
				if (result == null) result = caseExpression(nameExpression);
				if (result == null) result = caseName(nameExpression);
				if (result == null) result = caseVhdlObject(nameExpression);
				if (result == null) result = caseMultiName(nameExpression);
				if (result == null) result = caseTypeReference(nameExpression);
				if (result == null) result = caseNatureReference(nameExpression);
				if (result == null) result = caseEntityReference(nameExpression);
				if (result == null) result = casePackageReference(nameExpression);
				if (result == null) result = caseComponentReference(nameExpression);
				if (result == null) result = caseConfigurationReference(nameExpression);
				if (result == null) result = caseCallReference(nameExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.NULL_EXPRESSION: {
				NullExpression nullExpression = (NullExpression)theEObject;
				T result = caseNullExpression(nullExpression);
				if (result == null) result = caseExpression(nullExpression);
				if (result == null) result = caseVhdlObject(nullExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.MULTIPLYING_EXPRESSION: {
				MultiplyingExpression multiplyingExpression = (MultiplyingExpression)theEObject;
				T result = caseMultiplyingExpression(multiplyingExpression);
				if (result == null) result = caseBinaryExpression(multiplyingExpression);
				if (result == null) result = caseExpression(multiplyingExpression);
				if (result == null) result = caseVhdlObject(multiplyingExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.POWER_EXPRESSION: {
				PowerExpression powerExpression = (PowerExpression)theEObject;
				T result = casePowerExpression(powerExpression);
				if (result == null) result = caseBinaryExpression(powerExpression);
				if (result == null) result = caseExpression(powerExpression);
				if (result == null) result = caseVhdlObject(powerExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.RELATIONAL_EXPRESSION: {
				RelationalExpression relationalExpression = (RelationalExpression)theEObject;
				T result = caseRelationalExpression(relationalExpression);
				if (result == null) result = caseBinaryExpression(relationalExpression);
				if (result == null) result = caseExpression(relationalExpression);
				if (result == null) result = caseVhdlObject(relationalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.SHIFT_EXPRESSION: {
				ShiftExpression shiftExpression = (ShiftExpression)theEObject;
				T result = caseShiftExpression(shiftExpression);
				if (result == null) result = caseBinaryExpression(shiftExpression);
				if (result == null) result = caseExpression(shiftExpression);
				if (result == null) result = caseVhdlObject(shiftExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.SIGNATURE_EXPRESSION: {
				SignatureExpression signatureExpression = (SignatureExpression)theEObject;
				T result = caseSignatureExpression(signatureExpression);
				if (result == null) result = caseExpression(signatureExpression);
				if (result == null) result = caseName(signatureExpression);
				if (result == null) result = caseVhdlObject(signatureExpression);
				if (result == null) result = caseMultiName(signatureExpression);
				if (result == null) result = caseTypeReference(signatureExpression);
				if (result == null) result = caseNatureReference(signatureExpression);
				if (result == null) result = caseEntityReference(signatureExpression);
				if (result == null) result = casePackageReference(signatureExpression);
				if (result == null) result = caseComponentReference(signatureExpression);
				if (result == null) result = caseConfigurationReference(signatureExpression);
				if (result == null) result = caseCallReference(signatureExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.SIGN_EXPRESSION: {
				SignExpression signExpression = (SignExpression)theEObject;
				T result = caseSignExpression(signExpression);
				if (result == null) result = caseExpression(signExpression);
				if (result == null) result = caseVhdlObject(signExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.UNARY_EXPRESSION: {
				UnaryExpression unaryExpression = (UnaryExpression)theEObject;
				T result = caseUnaryExpression(unaryExpression);
				if (result == null) result = caseExpression(unaryExpression);
				if (result == null) result = caseVhdlObject(unaryExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.OPEN_EXPRESSION: {
				OpenExpression openExpression = (OpenExpression)theEObject;
				T result = caseOpenExpression(openExpression);
				if (result == null) result = caseExpression(openExpression);
				if (result == null) result = caseVhdlObject(openExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.OTHERS_EXPRESSION: {
				OthersExpression othersExpression = (OthersExpression)theEObject;
				T result = caseOthersExpression(othersExpression);
				if (result == null) result = caseExpression(othersExpression);
				if (result == null) result = caseName(othersExpression);
				if (result == null) result = caseVhdlObject(othersExpression);
				if (result == null) result = caseMultiName(othersExpression);
				if (result == null) result = caseTypeReference(othersExpression);
				if (result == null) result = caseNatureReference(othersExpression);
				if (result == null) result = caseEntityReference(othersExpression);
				if (result == null) result = casePackageReference(othersExpression);
				if (result == null) result = caseComponentReference(othersExpression);
				if (result == null) result = caseConfigurationReference(othersExpression);
				if (result == null) result = caseCallReference(othersExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.RANGE_EXPRESSION: {
				RangeExpression rangeExpression = (RangeExpression)theEObject;
				T result = caseRangeExpression(rangeExpression);
				if (result == null) result = caseBinaryExpression(rangeExpression);
				if (result == null) result = caseName(rangeExpression);
				if (result == null) result = caseExpression(rangeExpression);
				if (result == null) result = caseMultiName(rangeExpression);
				if (result == null) result = caseTypeReference(rangeExpression);
				if (result == null) result = caseNatureReference(rangeExpression);
				if (result == null) result = caseEntityReference(rangeExpression);
				if (result == null) result = casePackageReference(rangeExpression);
				if (result == null) result = caseComponentReference(rangeExpression);
				if (result == null) result = caseConfigurationReference(rangeExpression);
				if (result == null) result = caseCallReference(rangeExpression);
				if (result == null) result = caseVhdlObject(rangeExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.STRING_EXPRESSION: {
				StringExpression stringExpression = (StringExpression)theEObject;
				T result = caseStringExpression(stringExpression);
				if (result == null) result = caseValueExpression(stringExpression);
				if (result == null) result = caseName(stringExpression);
				if (result == null) result = caseExpression(stringExpression);
				if (result == null) result = caseMultiName(stringExpression);
				if (result == null) result = caseTypeReference(stringExpression);
				if (result == null) result = caseNatureReference(stringExpression);
				if (result == null) result = caseEntityReference(stringExpression);
				if (result == null) result = casePackageReference(stringExpression);
				if (result == null) result = caseComponentReference(stringExpression);
				if (result == null) result = caseConfigurationReference(stringExpression);
				if (result == null) result = caseCallReference(stringExpression);
				if (result == null) result = caseVhdlObject(stringExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.CHARACTER_EXPRESSION: {
				CharacterExpression characterExpression = (CharacterExpression)theEObject;
				T result = caseCharacterExpression(characterExpression);
				if (result == null) result = caseValueExpression(characterExpression);
				if (result == null) result = caseName(characterExpression);
				if (result == null) result = caseEnumerationLiteral(characterExpression);
				if (result == null) result = caseExpression(characterExpression);
				if (result == null) result = caseMultiName(characterExpression);
				if (result == null) result = caseTypeReference(characterExpression);
				if (result == null) result = caseNatureReference(characterExpression);
				if (result == null) result = caseEntityReference(characterExpression);
				if (result == null) result = casePackageReference(characterExpression);
				if (result == null) result = caseComponentReference(characterExpression);
				if (result == null) result = caseConfigurationReference(characterExpression);
				if (result == null) result = caseCallReference(characterExpression);
				if (result == null) result = caseVhdlObject(characterExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.IDENTIFIER_EXPRESSION: {
				IdentifierExpression identifierExpression = (IdentifierExpression)theEObject;
				T result = caseIdentifierExpression(identifierExpression);
				if (result == null) result = caseValueExpression(identifierExpression);
				if (result == null) result = caseName(identifierExpression);
				if (result == null) result = caseEnumerationLiteral(identifierExpression);
				if (result == null) result = caseExpression(identifierExpression);
				if (result == null) result = caseMultiName(identifierExpression);
				if (result == null) result = caseTypeReference(identifierExpression);
				if (result == null) result = caseNatureReference(identifierExpression);
				if (result == null) result = caseEntityReference(identifierExpression);
				if (result == null) result = casePackageReference(identifierExpression);
				if (result == null) result = caseComponentReference(identifierExpression);
				if (result == null) result = caseConfigurationReference(identifierExpression);
				if (result == null) result = caseCallReference(identifierExpression);
				if (result == null) result = caseVhdlObject(identifierExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.UNIT_VALUE_EXPRESSION: {
				UnitValueExpression unitValueExpression = (UnitValueExpression)theEObject;
				T result = caseUnitValueExpression(unitValueExpression);
				if (result == null) result = caseValueExpression(unitValueExpression);
				if (result == null) result = caseExpression(unitValueExpression);
				if (result == null) result = caseVhdlObject(unitValueExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.UNAFFECTED_EXPRESSION: {
				UnaffectedExpression unaffectedExpression = (UnaffectedExpression)theEObject;
				T result = caseUnaffectedExpression(unaffectedExpression);
				if (result == null) result = caseExpression(unaffectedExpression);
				if (result == null) result = caseVhdlObject(unaffectedExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.VALUE_EXPRESSION: {
				ValueExpression valueExpression = (ValueExpression)theEObject;
				T result = caseValueExpression(valueExpression);
				if (result == null) result = caseExpression(valueExpression);
				if (result == null) result = caseVhdlObject(valueExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.WAVEFORM_EXPRESSION: {
				WaveformExpression waveformExpression = (WaveformExpression)theEObject;
				T result = caseWaveformExpression(waveformExpression);
				if (result == null) result = caseExpression(waveformExpression);
				if (result == null) result = caseVhdlObject(waveformExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.MULTI_EXPRESSION: {
				MultiExpression multiExpression = (MultiExpression)theEObject;
				T result = caseMultiExpression(multiExpression);
				if (result == null) result = caseExpression(multiExpression);
				if (result == null) result = caseVhdlObject(multiExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adding Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adding Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddingExpression(AddingExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregate Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregate Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregateExpression(AggregateExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>All Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>All Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllExpression(AllExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Allocator Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Allocator Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAllocatorExpression(AllocatorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociationExpression(AssociationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeExpression(AttributeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryExpression(BinaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bit String Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bit String Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBitStringExpression(BitStringExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Indication Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Indication Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndicationExpression(IndicationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subtype Indication Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtype Indication Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtypeIndicationExpression(SubtypeIndicationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subnature Indication Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subnature Indication Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubnatureIndicationExpression(SubnatureIndicationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalExpression(LogicalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameExpression(NameExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNullExpression(NullExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplying Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplying Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplyingExpression(MultiplyingExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Power Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Power Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePowerExpression(PowerExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relational Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relational Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationalExpression(RelationalExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shift Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shift Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShiftExpression(ShiftExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signature Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signature Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignatureExpression(SignatureExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sign Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sign Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignExpression(SignExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaryExpression(UnaryExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenExpression(OpenExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Others Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Others Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOthersExpression(OthersExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeExpression(RangeExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringExpression(StringExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharacterExpression(CharacterExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifierExpression(IdentifierExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unit Value Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unit Value Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitValueExpression(UnitValueExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unaffected Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unaffected Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnaffectedExpression(UnaffectedExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueExpression(ValueExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Waveform Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Waveform Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWaveformExpression(WaveformExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiExpression(MultiExpression object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Multi Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiName(MultiName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeReference(TypeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNatureReference(NatureReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntityReference(EntityReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageReference(PackageReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentReference(ComponentReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationReference(ConfigurationReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallReference(CallReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseName(Name object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationLiteral(EnumerationLiteral object) {
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

} //ExpressionSwitch
