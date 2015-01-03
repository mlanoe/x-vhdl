/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.type.impl;

import net.mlanoe.language.vhdl.type.*;

import org.eclipse.emf.ecore.EClass;
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
public class TypeFactoryImpl extends EFactoryImpl implements TypeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeFactory init() {
		try {
			TypeFactory theTypeFactory = (TypeFactory)EPackage.Registry.INSTANCE.getEFactory(TypePackage.eNS_URI);
			if (theTypeFactory != null) {
				return theTypeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TypeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeFactoryImpl() {
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
			case TypePackage.ACCESS_TYPE_DEFINITION: return createAccessTypeDefinition();
			case TypePackage.RECORD_TYPE_DEFINITION: return createRecordTypeDefinition();
			case TypePackage.ARRAY_TYPE_DEFINITION: return createArrayTypeDefinition();
			case TypePackage.CONSTRAINED_ARRAY_TYPE_DEFINITION: return createConstrainedArrayTypeDefinition();
			case TypePackage.UNCONSTRAINED_ARRAY_TYPE_DEFINITION: return createUnconstrainedArrayTypeDefinition();
			case TypePackage.ENUMERATION_TYPE_DEFINITION: return createEnumerationTypeDefinition();
			case TypePackage.FILE_TYPE_DEFINITION: return createFileTypeDefinition();
			case TypePackage.PHYSICAL_TYPE_DEFINITION: return createPhysicalTypeDefinition();
			case TypePackage.PHYSICAL_TYPE_DEFINITION_SECONDARY: return createPhysicalTypeDefinitionSecondary();
			case TypePackage.RANGE_TYPE_DEFINITION: return createRangeTypeDefinition();
			case TypePackage.RECORD_TYPE_ELEMENT: return createRecordTypeElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessTypeDefinition createAccessTypeDefinition() {
		AccessTypeDefinitionImpl accessTypeDefinition = new AccessTypeDefinitionImpl();
		return accessTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordTypeDefinition createRecordTypeDefinition() {
		RecordTypeDefinitionImpl recordTypeDefinition = new RecordTypeDefinitionImpl();
		return recordTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayTypeDefinition createArrayTypeDefinition() {
		ArrayTypeDefinitionImpl arrayTypeDefinition = new ArrayTypeDefinitionImpl();
		return arrayTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstrainedArrayTypeDefinition createConstrainedArrayTypeDefinition() {
		ConstrainedArrayTypeDefinitionImpl constrainedArrayTypeDefinition = new ConstrainedArrayTypeDefinitionImpl();
		return constrainedArrayTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnconstrainedArrayTypeDefinition createUnconstrainedArrayTypeDefinition() {
		UnconstrainedArrayTypeDefinitionImpl unconstrainedArrayTypeDefinition = new UnconstrainedArrayTypeDefinitionImpl();
		return unconstrainedArrayTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationTypeDefinition createEnumerationTypeDefinition() {
		EnumerationTypeDefinitionImpl enumerationTypeDefinition = new EnumerationTypeDefinitionImpl();
		return enumerationTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileTypeDefinition createFileTypeDefinition() {
		FileTypeDefinitionImpl fileTypeDefinition = new FileTypeDefinitionImpl();
		return fileTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalTypeDefinition createPhysicalTypeDefinition() {
		PhysicalTypeDefinitionImpl physicalTypeDefinition = new PhysicalTypeDefinitionImpl();
		return physicalTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalTypeDefinitionSecondary createPhysicalTypeDefinitionSecondary() {
		PhysicalTypeDefinitionSecondaryImpl physicalTypeDefinitionSecondary = new PhysicalTypeDefinitionSecondaryImpl();
		return physicalTypeDefinitionSecondary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeTypeDefinition createRangeTypeDefinition() {
		RangeTypeDefinitionImpl rangeTypeDefinition = new RangeTypeDefinitionImpl();
		return rangeTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordTypeElement createRecordTypeElement() {
		RecordTypeElementImpl recordTypeElement = new RecordTypeElementImpl();
		return recordTypeElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePackage getTypePackage() {
		return (TypePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TypePackage getPackage() {
		return TypePackage.eINSTANCE;
	}

} //TypeFactoryImpl
