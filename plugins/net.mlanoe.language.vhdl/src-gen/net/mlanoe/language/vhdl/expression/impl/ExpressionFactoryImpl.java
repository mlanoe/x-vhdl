/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.expression.impl;

import net.mlanoe.language.vhdl.expression.*;

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
public class ExpressionFactoryImpl extends EFactoryImpl implements ExpressionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExpressionFactory init() {
		try {
			ExpressionFactory theExpressionFactory = (ExpressionFactory)EPackage.Registry.INSTANCE.getEFactory(ExpressionPackage.eNS_URI);
			if (theExpressionFactory != null) {
				return theExpressionFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExpressionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionFactoryImpl() {
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
			case ExpressionPackage.ADDING_EXPRESSION: return createAddingExpression();
			case ExpressionPackage.AGGREGATE_EXPRESSION: return createAggregateExpression();
			case ExpressionPackage.ALL_EXPRESSION: return createAllExpression();
			case ExpressionPackage.ALLOCATOR_EXPRESSION: return createAllocatorExpression();
			case ExpressionPackage.ASSOCIATION_EXPRESSION: return createAssociationExpression();
			case ExpressionPackage.ATTRIBUTE_EXPRESSION: return createAttributeExpression();
			case ExpressionPackage.BIT_STRING_EXPRESSION: return createBitStringExpression();
			case ExpressionPackage.SUBTYPE_INDICATION_EXPRESSION: return createSubtypeIndicationExpression();
			case ExpressionPackage.SUBNATURE_INDICATION_EXPRESSION: return createSubnatureIndicationExpression();
			case ExpressionPackage.LOGICAL_EXPRESSION: return createLogicalExpression();
			case ExpressionPackage.NAME_EXPRESSION: return createNameExpression();
			case ExpressionPackage.NULL_EXPRESSION: return createNullExpression();
			case ExpressionPackage.MULTIPLYING_EXPRESSION: return createMultiplyingExpression();
			case ExpressionPackage.POWER_EXPRESSION: return createPowerExpression();
			case ExpressionPackage.RELATIONAL_EXPRESSION: return createRelationalExpression();
			case ExpressionPackage.SHIFT_EXPRESSION: return createShiftExpression();
			case ExpressionPackage.SIGN_EXPRESSION: return createSignExpression();
			case ExpressionPackage.UNARY_EXPRESSION: return createUnaryExpression();
			case ExpressionPackage.OPEN_EXPRESSION: return createOpenExpression();
			case ExpressionPackage.OTHERS_EXPRESSION: return createOthersExpression();
			case ExpressionPackage.RANGE_EXPRESSION: return createRangeExpression();
			case ExpressionPackage.STRING_EXPRESSION: return createStringExpression();
			case ExpressionPackage.CHARACTER_EXPRESSION: return createCharacterExpression();
			case ExpressionPackage.IDENTIFIER_EXPRESSION: return createIdentifierExpression();
			case ExpressionPackage.UNIT_VALUE_EXPRESSION: return createUnitValueExpression();
			case ExpressionPackage.VALUE_EXPRESSION: return createValueExpression();
			case ExpressionPackage.WAVEFORM_EXPRESSION: return createWaveformExpression();
			case ExpressionPackage.MULTI_EXPRESSION: return createMultiExpression();
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
			case ExpressionPackage.UNARY_OPERATOR:
				return createUnaryOperatorFromString(eDataType, initialValue);
			case ExpressionPackage.MULTIPLYING_OPERATOR:
				return createMultiplyingOperatorFromString(eDataType, initialValue);
			case ExpressionPackage.SHIFT_OPERATOR:
				return createShiftOperatorFromString(eDataType, initialValue);
			case ExpressionPackage.RELATIONAL_OPERATOR:
				return createRelationalOperatorFromString(eDataType, initialValue);
			case ExpressionPackage.LOGICAL_OPERATOR:
				return createLogicalOperatorFromString(eDataType, initialValue);
			case ExpressionPackage.ADDING_OPERATOR:
				return createAddingOperatorFromString(eDataType, initialValue);
			case ExpressionPackage.SIGN:
				return createSignFromString(eDataType, initialValue);
			case ExpressionPackage.RANGE_DIRECTION:
				return createRangeDirectionFromString(eDataType, initialValue);
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
			case ExpressionPackage.UNARY_OPERATOR:
				return convertUnaryOperatorToString(eDataType, instanceValue);
			case ExpressionPackage.MULTIPLYING_OPERATOR:
				return convertMultiplyingOperatorToString(eDataType, instanceValue);
			case ExpressionPackage.SHIFT_OPERATOR:
				return convertShiftOperatorToString(eDataType, instanceValue);
			case ExpressionPackage.RELATIONAL_OPERATOR:
				return convertRelationalOperatorToString(eDataType, instanceValue);
			case ExpressionPackage.LOGICAL_OPERATOR:
				return convertLogicalOperatorToString(eDataType, instanceValue);
			case ExpressionPackage.ADDING_OPERATOR:
				return convertAddingOperatorToString(eDataType, instanceValue);
			case ExpressionPackage.SIGN:
				return convertSignToString(eDataType, instanceValue);
			case ExpressionPackage.RANGE_DIRECTION:
				return convertRangeDirectionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddingExpression createAddingExpression() {
		AddingExpressionImpl addingExpression = new AddingExpressionImpl();
		return addingExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregateExpression createAggregateExpression() {
		AggregateExpressionImpl aggregateExpression = new AggregateExpressionImpl();
		return aggregateExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllExpression createAllExpression() {
		AllExpressionImpl allExpression = new AllExpressionImpl();
		return allExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocatorExpression createAllocatorExpression() {
		AllocatorExpressionImpl allocatorExpression = new AllocatorExpressionImpl();
		return allocatorExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationExpression createAssociationExpression() {
		AssociationExpressionImpl associationExpression = new AssociationExpressionImpl();
		return associationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeExpression createAttributeExpression() {
		AttributeExpressionImpl attributeExpression = new AttributeExpressionImpl();
		return attributeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitStringExpression createBitStringExpression() {
		BitStringExpressionImpl bitStringExpression = new BitStringExpressionImpl();
		return bitStringExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubtypeIndicationExpression createSubtypeIndicationExpression() {
		SubtypeIndicationExpressionImpl subtypeIndicationExpression = new SubtypeIndicationExpressionImpl();
		return subtypeIndicationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubnatureIndicationExpression createSubnatureIndicationExpression() {
		SubnatureIndicationExpressionImpl subnatureIndicationExpression = new SubnatureIndicationExpressionImpl();
		return subnatureIndicationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalExpression createLogicalExpression() {
		LogicalExpressionImpl logicalExpression = new LogicalExpressionImpl();
		return logicalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameExpression createNameExpression() {
		NameExpressionImpl nameExpression = new NameExpressionImpl();
		return nameExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullExpression createNullExpression() {
		NullExpressionImpl nullExpression = new NullExpressionImpl();
		return nullExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplyingExpression createMultiplyingExpression() {
		MultiplyingExpressionImpl multiplyingExpression = new MultiplyingExpressionImpl();
		return multiplyingExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerExpression createPowerExpression() {
		PowerExpressionImpl powerExpression = new PowerExpressionImpl();
		return powerExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalExpression createRelationalExpression() {
		RelationalExpressionImpl relationalExpression = new RelationalExpressionImpl();
		return relationalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShiftExpression createShiftExpression() {
		ShiftExpressionImpl shiftExpression = new ShiftExpressionImpl();
		return shiftExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignExpression createSignExpression() {
		SignExpressionImpl signExpression = new SignExpressionImpl();
		return signExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryExpression createUnaryExpression() {
		UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
		return unaryExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenExpression createOpenExpression() {
		OpenExpressionImpl openExpression = new OpenExpressionImpl();
		return openExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OthersExpression createOthersExpression() {
		OthersExpressionImpl othersExpression = new OthersExpressionImpl();
		return othersExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeExpression createRangeExpression() {
		RangeExpressionImpl rangeExpression = new RangeExpressionImpl();
		return rangeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression createStringExpression() {
		StringExpressionImpl stringExpression = new StringExpressionImpl();
		return stringExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CharacterExpression createCharacterExpression() {
		CharacterExpressionImpl characterExpression = new CharacterExpressionImpl();
		return characterExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierExpression createIdentifierExpression() {
		IdentifierExpressionImpl identifierExpression = new IdentifierExpressionImpl();
		return identifierExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitValueExpression createUnitValueExpression() {
		UnitValueExpressionImpl unitValueExpression = new UnitValueExpressionImpl();
		return unitValueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueExpression createValueExpression() {
		ValueExpressionImpl valueExpression = new ValueExpressionImpl();
		return valueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WaveformExpression createWaveformExpression() {
		WaveformExpressionImpl waveformExpression = new WaveformExpressionImpl();
		return waveformExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiExpression createMultiExpression() {
		MultiExpressionImpl multiExpression = new MultiExpressionImpl();
		return multiExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryOperator createUnaryOperatorFromString(EDataType eDataType, String initialValue) {
		UnaryOperator result = UnaryOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnaryOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplyingOperator createMultiplyingOperatorFromString(EDataType eDataType, String initialValue) {
		MultiplyingOperator result = MultiplyingOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiplyingOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShiftOperator createShiftOperatorFromString(EDataType eDataType, String initialValue) {
		ShiftOperator result = ShiftOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShiftOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationalOperator createRelationalOperatorFromString(EDataType eDataType, String initialValue) {
		RelationalOperator result = RelationalOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationalOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOperator createLogicalOperatorFromString(EDataType eDataType, String initialValue) {
		LogicalOperator result = LogicalOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicalOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddingOperator createAddingOperatorFromString(EDataType eDataType, String initialValue) {
		AddingOperator result = AddingOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddingOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sign createSignFromString(EDataType eDataType, String initialValue) {
		Sign result = Sign.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSignToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeDirection createRangeDirectionFromString(EDataType eDataType, String initialValue) {
		RangeDirection result = RangeDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRangeDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionPackage getExpressionPackage() {
		return (ExpressionPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExpressionPackage getPackage() {
		return ExpressionPackage.eINSTANCE;
	}

} //ExpressionFactoryImpl
