/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.nature.util;

import net.mlanoe.language.vhdl.MultiNamed;
import net.mlanoe.language.vhdl.VhdlObject;

import net.mlanoe.language.vhdl.nature.*;

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
 * @see net.mlanoe.language.vhdl.nature.NaturePackage
 * @generated
 */
public class NatureSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NaturePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NatureSwitch() {
		if (modelPackage == null) {
			modelPackage = NaturePackage.eINSTANCE;
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
			case NaturePackage.ARRAY_NATURE_DEFINITION: {
				ArrayNatureDefinition arrayNatureDefinition = (ArrayNatureDefinition)theEObject;
				T result = caseArrayNatureDefinition(arrayNatureDefinition);
				if (result == null) result = caseCompositeNatureDefinition(arrayNatureDefinition);
				if (result == null) result = caseNatured(arrayNatureDefinition);
				if (result == null) result = caseNatureDefinition(arrayNatureDefinition);
				if (result == null) result = caseVhdlObject(arrayNatureDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NaturePackage.COMPOSITE_NATURE_DEFINITION: {
				CompositeNatureDefinition compositeNatureDefinition = (CompositeNatureDefinition)theEObject;
				T result = caseCompositeNatureDefinition(compositeNatureDefinition);
				if (result == null) result = caseNatureDefinition(compositeNatureDefinition);
				if (result == null) result = caseVhdlObject(compositeNatureDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NaturePackage.CONSTRAINED_ARRAY_NATURE_DEFINITION: {
				ConstrainedArrayNatureDefinition constrainedArrayNatureDefinition = (ConstrainedArrayNatureDefinition)theEObject;
				T result = caseConstrainedArrayNatureDefinition(constrainedArrayNatureDefinition);
				if (result == null) result = caseArrayNatureDefinition(constrainedArrayNatureDefinition);
				if (result == null) result = caseCompositeNatureDefinition(constrainedArrayNatureDefinition);
				if (result == null) result = caseNatured(constrainedArrayNatureDefinition);
				if (result == null) result = caseNatureDefinition(constrainedArrayNatureDefinition);
				if (result == null) result = caseVhdlObject(constrainedArrayNatureDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NaturePackage.NATURE_DEFINITION: {
				NatureDefinition natureDefinition = (NatureDefinition)theEObject;
				T result = caseNatureDefinition(natureDefinition);
				if (result == null) result = caseVhdlObject(natureDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NaturePackage.RECORD_NATURE_DEFINITION: {
				RecordNatureDefinition recordNatureDefinition = (RecordNatureDefinition)theEObject;
				T result = caseRecordNatureDefinition(recordNatureDefinition);
				if (result == null) result = caseCompositeNatureDefinition(recordNatureDefinition);
				if (result == null) result = caseNatureDefinition(recordNatureDefinition);
				if (result == null) result = caseVhdlObject(recordNatureDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NaturePackage.RECORD_NATURE_ELEMENT: {
				RecordNatureElement recordNatureElement = (RecordNatureElement)theEObject;
				T result = caseRecordNatureElement(recordNatureElement);
				if (result == null) result = caseVhdlObject(recordNatureElement);
				if (result == null) result = caseMultiNamed(recordNatureElement);
				if (result == null) result = caseNatured(recordNatureElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NaturePackage.SCALAR_NATURE_DEFINITION: {
				ScalarNatureDefinition scalarNatureDefinition = (ScalarNatureDefinition)theEObject;
				T result = caseScalarNatureDefinition(scalarNatureDefinition);
				if (result == null) result = caseNatureDefinition(scalarNatureDefinition);
				if (result == null) result = caseVhdlObject(scalarNatureDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NaturePackage.UNCONSTRAINED_ARRAY_NATURE_DEFINITION: {
				UnconstrainedArrayNatureDefinition unconstrainedArrayNatureDefinition = (UnconstrainedArrayNatureDefinition)theEObject;
				T result = caseUnconstrainedArrayNatureDefinition(unconstrainedArrayNatureDefinition);
				if (result == null) result = caseArrayNatureDefinition(unconstrainedArrayNatureDefinition);
				if (result == null) result = caseCompositeNatureDefinition(unconstrainedArrayNatureDefinition);
				if (result == null) result = caseNatured(unconstrainedArrayNatureDefinition);
				if (result == null) result = caseNatureDefinition(unconstrainedArrayNatureDefinition);
				if (result == null) result = caseVhdlObject(unconstrainedArrayNatureDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NaturePackage.NATURE_REFERENCE: {
				NatureReference natureReference = (NatureReference)theEObject;
				T result = caseNatureReference(natureReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NaturePackage.NATURED: {
				Natured natured = (Natured)theEObject;
				T result = caseNatured(natured);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Nature Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Nature Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayNatureDefinition(ArrayNatureDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Nature Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Nature Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeNatureDefinition(CompositeNatureDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constrained Array Nature Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constrained Array Nature Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstrainedArrayNatureDefinition(ConstrainedArrayNatureDefinition object) {
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
	public T caseNatureDefinition(NatureDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record Nature Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record Nature Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecordNatureDefinition(RecordNatureDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Record Nature Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Record Nature Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecordNatureElement(RecordNatureElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scalar Nature Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scalar Nature Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalarNatureDefinition(ScalarNatureDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unconstrained Array Nature Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unconstrained Array Nature Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnconstrainedArrayNatureDefinition(UnconstrainedArrayNatureDefinition object) {
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

} //NatureSwitch
