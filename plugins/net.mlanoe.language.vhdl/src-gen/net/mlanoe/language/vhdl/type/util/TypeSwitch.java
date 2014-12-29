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
package net.mlanoe.language.vhdl.type.util;

import net.mlanoe.language.vhdl.MultiNamed;
import net.mlanoe.language.vhdl.VhdlObject;

import net.mlanoe.language.vhdl.type.*;

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
 * @see net.mlanoe.language.vhdl.type.TypePackage
 * @generated
 */
public class TypeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TypePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeSwitch() {
		if (modelPackage == null) {
			modelPackage = TypePackage.eINSTANCE;
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
			case TypePackage.ACCESS_TYPE_DEFINITION: {
				AccessTypeDefinition accessTypeDefinition = (AccessTypeDefinition)theEObject;
				T result = caseAccessTypeDefinition(accessTypeDefinition);
				if (result == null) result = caseTypeDefinition(accessTypeDefinition);
				if (result == null) result = caseTyped(accessTypeDefinition);
				if (result == null) result = caseVhdlObject(accessTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypePackage.COMPOSITE_TYPE_DEFINITION: {
				CompositeTypeDefinition compositeTypeDefinition = (CompositeTypeDefinition)theEObject;
				T result = caseCompositeTypeDefinition(compositeTypeDefinition);
				if (result == null) result = caseTypeDefinition(compositeTypeDefinition);
				if (result == null) result = caseVhdlObject(compositeTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypePackage.RECORD_TYPE_DEFINITION: {
				RecordTypeDefinition recordTypeDefinition = (RecordTypeDefinition)theEObject;
				T result = caseRecordTypeDefinition(recordTypeDefinition);
				if (result == null) result = caseCompositeTypeDefinition(recordTypeDefinition);
				if (result == null) result = caseTypeDefinition(recordTypeDefinition);
				if (result == null) result = caseVhdlObject(recordTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypePackage.ARRAY_TYPE_DEFINITION: {
				ArrayTypeDefinition arrayTypeDefinition = (ArrayTypeDefinition)theEObject;
				T result = caseArrayTypeDefinition(arrayTypeDefinition);
				if (result == null) result = caseCompositeTypeDefinition(arrayTypeDefinition);
				if (result == null) result = caseTyped(arrayTypeDefinition);
				if (result == null) result = caseTypeDefinition(arrayTypeDefinition);
				if (result == null) result = caseVhdlObject(arrayTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypePackage.CONSTRAINED_ARRAY_TYPE_DEFINITION: {
				ConstrainedArrayTypeDefinition constrainedArrayTypeDefinition = (ConstrainedArrayTypeDefinition)theEObject;
				T result = caseConstrainedArrayTypeDefinition(constrainedArrayTypeDefinition);
				if (result == null) result = caseArrayTypeDefinition(constrainedArrayTypeDefinition);
				if (result == null) result = caseCompositeTypeDefinition(constrainedArrayTypeDefinition);
				if (result == null) result = caseTyped(constrainedArrayTypeDefinition);
				if (result == null) result = caseTypeDefinition(constrainedArrayTypeDefinition);
				if (result == null) result = caseVhdlObject(constrainedArrayTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypePackage.UNCONSTRAINED_ARRAY_TYPE_DEFINITION: {
				UnconstrainedArrayTypeDefinition unconstrainedArrayTypeDefinition = (UnconstrainedArrayTypeDefinition)theEObject;
				T result = caseUnconstrainedArrayTypeDefinition(unconstrainedArrayTypeDefinition);
				if (result == null) result = caseArrayTypeDefinition(unconstrainedArrayTypeDefinition);
				if (result == null) result = caseCompositeTypeDefinition(unconstrainedArrayTypeDefinition);
				if (result == null) result = caseTyped(unconstrainedArrayTypeDefinition);
				if (result == null) result = caseTypeDefinition(unconstrainedArrayTypeDefinition);
				if (result == null) result = caseVhdlObject(unconstrainedArrayTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypePackage.ENUMERATION_LITERAL: {
				EnumerationLiteral enumerationLiteral = (EnumerationLiteral)theEObject;
				T result = caseEnumerationLiteral(enumerationLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypePackage.ENUMERATION_TYPE_DEFINITION: {
				EnumerationTypeDefinition enumerationTypeDefinition = (EnumerationTypeDefinition)theEObject;
				T result = caseEnumerationTypeDefinition(enumerationTypeDefinition);
				if (result == null) result = caseTypeDefinition(enumerationTypeDefinition);
				if (result == null) result = caseVhdlObject(enumerationTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypePackage.FILE_TYPE_DEFINITION: {
				FileTypeDefinition fileTypeDefinition = (FileTypeDefinition)theEObject;
				T result = caseFileTypeDefinition(fileTypeDefinition);
				if (result == null) result = caseTypeDefinition(fileTypeDefinition);
				if (result == null) result = caseTyped(fileTypeDefinition);
				if (result == null) result = caseVhdlObject(fileTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypePackage.PHYSICAL_TYPE_DEFINITION: {
				PhysicalTypeDefinition physicalTypeDefinition = (PhysicalTypeDefinition)theEObject;
				T result = casePhysicalTypeDefinition(physicalTypeDefinition);
				if (result == null) result = caseTypeDefinition(physicalTypeDefinition);
				if (result == null) result = caseVhdlObject(physicalTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypePackage.PHYSICAL_TYPE_DEFINITION_SECONDARY: {
				PhysicalTypeDefinitionSecondary physicalTypeDefinitionSecondary = (PhysicalTypeDefinitionSecondary)theEObject;
				T result = casePhysicalTypeDefinitionSecondary(physicalTypeDefinitionSecondary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypePackage.RANGE_TYPE_DEFINITION: {
				RangeTypeDefinition rangeTypeDefinition = (RangeTypeDefinition)theEObject;
				T result = caseRangeTypeDefinition(rangeTypeDefinition);
				if (result == null) result = caseTypeDefinition(rangeTypeDefinition);
				if (result == null) result = caseVhdlObject(rangeTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypePackage.RECORD_TYPE_ELEMENT: {
				RecordTypeElement recordTypeElement = (RecordTypeElement)theEObject;
				T result = caseRecordTypeElement(recordTypeElement);
				if (result == null) result = caseVhdlObject(recordTypeElement);
				if (result == null) result = caseMultiNamed(recordTypeElement);
				if (result == null) result = caseTyped(recordTypeElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypePackage.TYPED: {
				Typed typed = (Typed)theEObject;
				T result = caseTyped(typed);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypePackage.TYPE_DEFINITION: {
				TypeDefinition typeDefinition = (TypeDefinition)theEObject;
				T result = caseTypeDefinition(typeDefinition);
				if (result == null) result = caseVhdlObject(typeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TypePackage.TYPE_REFERENCE: {
				TypeReference typeReference = (TypeReference)theEObject;
				T result = caseTypeReference(typeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessTypeDefinition(AccessTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeTypeDefinition(CompositeTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecordTypeDefinition(RecordTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayTypeDefinition(ArrayTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constrained Array Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constrained Array Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstrainedArrayTypeDefinition(ConstrainedArrayTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unconstrained Array Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unconstrained Array Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnconstrainedArrayTypeDefinition(UnconstrainedArrayTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationTypeDefinition(EnumerationTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileTypeDefinition(FileTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalTypeDefinition(PhysicalTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Type Definition Secondary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Type Definition Secondary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysicalTypeDefinitionSecondary(PhysicalTypeDefinitionSecondary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeTypeDefinition(RangeTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDefinition(TypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record Type Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record Type Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecordTypeElement(RecordTypeElement object) {
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

} //TypeSwitch
