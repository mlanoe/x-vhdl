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
package net.mlanoe.language.vhdl.expression.impl;

import net.mlanoe.language.vhdl.VhdlPackage;
import net.mlanoe.language.vhdl.ams.AmsPackage;
import net.mlanoe.language.vhdl.ams.impl.AmsPackageImpl;
import net.mlanoe.language.vhdl.configuration.ConfigurationPackage;
import net.mlanoe.language.vhdl.configuration.impl.ConfigurationPackageImpl;
import net.mlanoe.language.vhdl.declaration.DeclarationPackage;
import net.mlanoe.language.vhdl.declaration.impl.DeclarationPackageImpl;
import net.mlanoe.language.vhdl.expression.AddingExpression;
import net.mlanoe.language.vhdl.expression.AddingOperator;
import net.mlanoe.language.vhdl.expression.AggregateExpression;
import net.mlanoe.language.vhdl.expression.AllExpression;
import net.mlanoe.language.vhdl.expression.AllocatorExpression;
import net.mlanoe.language.vhdl.expression.AssociationExpression;
import net.mlanoe.language.vhdl.expression.AttributeExpression;
import net.mlanoe.language.vhdl.expression.BinaryExpression;
import net.mlanoe.language.vhdl.expression.BitStringExpression;
import net.mlanoe.language.vhdl.expression.CharacterExpression;
import net.mlanoe.language.vhdl.expression.Expression;
import net.mlanoe.language.vhdl.expression.ExpressionFactory;
import net.mlanoe.language.vhdl.expression.ExpressionPackage;
import net.mlanoe.language.vhdl.expression.IdentifierExpression;
import net.mlanoe.language.vhdl.expression.IndicationExpression;
import net.mlanoe.language.vhdl.expression.LogicalExpression;
import net.mlanoe.language.vhdl.expression.LogicalOperator;
import net.mlanoe.language.vhdl.expression.MultiExpression;
import net.mlanoe.language.vhdl.expression.MultiplyingExpression;
import net.mlanoe.language.vhdl.expression.MultiplyingOperator;
import net.mlanoe.language.vhdl.expression.NameExpression;
import net.mlanoe.language.vhdl.expression.NullExpression;
import net.mlanoe.language.vhdl.expression.OpenExpression;
import net.mlanoe.language.vhdl.expression.OthersExpression;
import net.mlanoe.language.vhdl.expression.PowerExpression;
import net.mlanoe.language.vhdl.expression.RangeDirection;
import net.mlanoe.language.vhdl.expression.RangeExpression;
import net.mlanoe.language.vhdl.expression.RelationalExpression;
import net.mlanoe.language.vhdl.expression.RelationalOperator;
import net.mlanoe.language.vhdl.expression.ShiftExpression;
import net.mlanoe.language.vhdl.expression.ShiftOperator;
import net.mlanoe.language.vhdl.expression.Sign;
import net.mlanoe.language.vhdl.expression.SignExpression;
import net.mlanoe.language.vhdl.expression.SignatureExpression;
import net.mlanoe.language.vhdl.expression.StringExpression;
import net.mlanoe.language.vhdl.expression.SubnatureIndicationExpression;
import net.mlanoe.language.vhdl.expression.SubtypeIndicationExpression;
import net.mlanoe.language.vhdl.expression.UnaryExpression;
import net.mlanoe.language.vhdl.expression.UnaryOperator;
import net.mlanoe.language.vhdl.expression.UnitValueExpression;
import net.mlanoe.language.vhdl.expression.ValueExpression;
import net.mlanoe.language.vhdl.expression.WaveformExpression;
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
public class ExpressionPackageImpl extends EPackageImpl implements ExpressionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addingExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregateExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocatorExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitStringExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass indicationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nullExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waveformExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subtypeIndicationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subnatureIndicationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplyingExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass powerExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shiftExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatureExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass openExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass othersExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifierExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitValueExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unaryOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multiplyingOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum shiftOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationalOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logicalOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum addingOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum signEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rangeDirectionEEnum = null;

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
	 * @see net.mlanoe.language.vhdl.expression.ExpressionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExpressionPackageImpl() {
		super(eNS_URI, ExpressionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExpressionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExpressionPackage init() {
		if (isInited) return (ExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);

		// Obtain or create and register package
		ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExpressionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExpressionPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		VhdlPackageImpl theVhdlPackage = (VhdlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VhdlPackage.eNS_URI) instanceof VhdlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VhdlPackage.eNS_URI) : VhdlPackage.eINSTANCE);
		StatementPackageImpl theStatementPackage = (StatementPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatementPackage.eNS_URI) instanceof StatementPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatementPackage.eNS_URI) : StatementPackage.eINSTANCE);
		DeclarationPackageImpl theDeclarationPackage = (DeclarationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DeclarationPackage.eNS_URI) instanceof DeclarationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DeclarationPackage.eNS_URI) : DeclarationPackage.eINSTANCE);
		TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
		NaturePackageImpl theNaturePackage = (NaturePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NaturePackage.eNS_URI) instanceof NaturePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NaturePackage.eNS_URI) : NaturePackage.eINSTANCE);
		AmsPackageImpl theAmsPackage = (AmsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AmsPackage.eNS_URI) instanceof AmsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AmsPackage.eNS_URI) : AmsPackage.eINSTANCE);
		ConfigurationPackageImpl theConfigurationPackage = (ConfigurationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI) instanceof ConfigurationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConfigurationPackage.eNS_URI) : ConfigurationPackage.eINSTANCE);

		// Create package meta-data objects
		theExpressionPackage.createPackageContents();
		theVhdlPackage.createPackageContents();
		theStatementPackage.createPackageContents();
		theDeclarationPackage.createPackageContents();
		theTypePackage.createPackageContents();
		theNaturePackage.createPackageContents();
		theAmsPackage.createPackageContents();
		theConfigurationPackage.createPackageContents();

		// Initialize created meta-data
		theExpressionPackage.initializePackageContents();
		theVhdlPackage.initializePackageContents();
		theStatementPackage.initializePackageContents();
		theDeclarationPackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theNaturePackage.initializePackageContents();
		theAmsPackage.initializePackageContents();
		theConfigurationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExpressionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExpressionPackage.eNS_URI, theExpressionPackage);
		return theExpressionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddingExpression() {
		return addingExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddingExpression_Operator() {
		return (EAttribute)addingExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregateExpression() {
		return aggregateExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllExpression() {
		return allExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAllocatorExpression() {
		return allocatorExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationExpression() {
		return associationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationExpression_Choice() {
		return (EReference)associationExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociationExpression_Expression() {
		return (EReference)associationExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeExpression() {
		return attributeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeExpression_Signature() {
		return (EReference)attributeExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryExpression() {
		return binaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_Left() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryExpression_Right() {
		return (EReference)binaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitStringExpression() {
		return bitStringExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndicationExpression() {
		return indicationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndicationExpression_Constraint() {
		return (EReference)indicationExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndicationExpression_Tolerance() {
		return (EReference)indicationExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndicationExpression_Across() {
		return (EReference)indicationExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNullExpression() {
		return nullExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWaveformExpression() {
		return waveformExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWaveformExpression_Expression() {
		return (EReference)waveformExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWaveformExpression_After() {
		return (EReference)waveformExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiExpression() {
		return multiExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiExpression_Expression() {
		return (EReference)multiExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubtypeIndicationExpression() {
		return subtypeIndicationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubtypeIndicationExpression_Mark() {
		return (EReference)subtypeIndicationExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubnatureIndicationExpression() {
		return subnatureIndicationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubnatureIndicationExpression_Mark() {
		return (EReference)subnatureIndicationExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameExpression() {
		return nameExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNameExpression_Element() {
		return (EReference)nameExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalExpression() {
		return logicalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLogicalExpression_Operator() {
		return (EAttribute)logicalExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplyingExpression() {
		return multiplyingExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplyingExpression_Operator() {
		return (EAttribute)multiplyingExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPowerExpression() {
		return powerExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationalExpression() {
		return relationalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelationalExpression_Operator() {
		return (EAttribute)relationalExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShiftExpression() {
		return shiftExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShiftExpression_Operator() {
		return (EAttribute)shiftExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignatureExpression() {
		return signatureExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignatureExpression_Signature() {
		return (EReference)signatureExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignatureExpression_Name() {
		return (EReference)signatureExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignExpression() {
		return signExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSignExpression_Sign() {
		return (EAttribute)signExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignExpression_Expression() {
		return (EReference)signExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryExpression() {
		return unaryExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnaryExpression_Operator() {
		return (EAttribute)unaryExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryExpression_Expression() {
		return (EReference)unaryExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpenExpression() {
		return openExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOthersExpression() {
		return othersExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeExpression() {
		return rangeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeExpression_Direction() {
		return (EAttribute)rangeExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringExpression() {
		return stringExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacterExpression() {
		return characterExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifierExpression() {
		return identifierExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitValueExpression() {
		return unitValueExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitValueExpression_Unit() {
		return (EReference)unitValueExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueExpression() {
		return valueExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueExpression_Value() {
		return (EAttribute)valueExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnaryOperator() {
		return unaryOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMultiplyingOperator() {
		return multiplyingOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getShiftOperator() {
		return shiftOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelationalOperator() {
		return relationalOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogicalOperator() {
		return logicalOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAddingOperator() {
		return addingOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSign() {
		return signEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRangeDirection() {
		return rangeDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionFactory getExpressionFactory() {
		return (ExpressionFactory)getEFactoryInstance();
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
		addingExpressionEClass = createEClass(ADDING_EXPRESSION);
		createEAttribute(addingExpressionEClass, ADDING_EXPRESSION__OPERATOR);

		aggregateExpressionEClass = createEClass(AGGREGATE_EXPRESSION);

		allExpressionEClass = createEClass(ALL_EXPRESSION);

		allocatorExpressionEClass = createEClass(ALLOCATOR_EXPRESSION);

		associationExpressionEClass = createEClass(ASSOCIATION_EXPRESSION);
		createEReference(associationExpressionEClass, ASSOCIATION_EXPRESSION__CHOICE);
		createEReference(associationExpressionEClass, ASSOCIATION_EXPRESSION__EXPRESSION);

		attributeExpressionEClass = createEClass(ATTRIBUTE_EXPRESSION);
		createEReference(attributeExpressionEClass, ATTRIBUTE_EXPRESSION__SIGNATURE);

		binaryExpressionEClass = createEClass(BINARY_EXPRESSION);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__LEFT);
		createEReference(binaryExpressionEClass, BINARY_EXPRESSION__RIGHT);

		bitStringExpressionEClass = createEClass(BIT_STRING_EXPRESSION);

		expressionEClass = createEClass(EXPRESSION);

		indicationExpressionEClass = createEClass(INDICATION_EXPRESSION);
		createEReference(indicationExpressionEClass, INDICATION_EXPRESSION__CONSTRAINT);
		createEReference(indicationExpressionEClass, INDICATION_EXPRESSION__TOLERANCE);
		createEReference(indicationExpressionEClass, INDICATION_EXPRESSION__ACROSS);

		subtypeIndicationExpressionEClass = createEClass(SUBTYPE_INDICATION_EXPRESSION);
		createEReference(subtypeIndicationExpressionEClass, SUBTYPE_INDICATION_EXPRESSION__MARK);

		subnatureIndicationExpressionEClass = createEClass(SUBNATURE_INDICATION_EXPRESSION);
		createEReference(subnatureIndicationExpressionEClass, SUBNATURE_INDICATION_EXPRESSION__MARK);

		logicalExpressionEClass = createEClass(LOGICAL_EXPRESSION);
		createEAttribute(logicalExpressionEClass, LOGICAL_EXPRESSION__OPERATOR);

		nameExpressionEClass = createEClass(NAME_EXPRESSION);
		createEReference(nameExpressionEClass, NAME_EXPRESSION__ELEMENT);

		nullExpressionEClass = createEClass(NULL_EXPRESSION);

		multiplyingExpressionEClass = createEClass(MULTIPLYING_EXPRESSION);
		createEAttribute(multiplyingExpressionEClass, MULTIPLYING_EXPRESSION__OPERATOR);

		powerExpressionEClass = createEClass(POWER_EXPRESSION);

		relationalExpressionEClass = createEClass(RELATIONAL_EXPRESSION);
		createEAttribute(relationalExpressionEClass, RELATIONAL_EXPRESSION__OPERATOR);

		shiftExpressionEClass = createEClass(SHIFT_EXPRESSION);
		createEAttribute(shiftExpressionEClass, SHIFT_EXPRESSION__OPERATOR);

		signatureExpressionEClass = createEClass(SIGNATURE_EXPRESSION);
		createEReference(signatureExpressionEClass, SIGNATURE_EXPRESSION__SIGNATURE);
		createEReference(signatureExpressionEClass, SIGNATURE_EXPRESSION__NAME);

		signExpressionEClass = createEClass(SIGN_EXPRESSION);
		createEAttribute(signExpressionEClass, SIGN_EXPRESSION__SIGN);
		createEReference(signExpressionEClass, SIGN_EXPRESSION__EXPRESSION);

		unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
		createEAttribute(unaryExpressionEClass, UNARY_EXPRESSION__OPERATOR);
		createEReference(unaryExpressionEClass, UNARY_EXPRESSION__EXPRESSION);

		openExpressionEClass = createEClass(OPEN_EXPRESSION);

		othersExpressionEClass = createEClass(OTHERS_EXPRESSION);

		rangeExpressionEClass = createEClass(RANGE_EXPRESSION);
		createEAttribute(rangeExpressionEClass, RANGE_EXPRESSION__DIRECTION);

		stringExpressionEClass = createEClass(STRING_EXPRESSION);

		characterExpressionEClass = createEClass(CHARACTER_EXPRESSION);

		identifierExpressionEClass = createEClass(IDENTIFIER_EXPRESSION);

		unitValueExpressionEClass = createEClass(UNIT_VALUE_EXPRESSION);
		createEReference(unitValueExpressionEClass, UNIT_VALUE_EXPRESSION__UNIT);

		valueExpressionEClass = createEClass(VALUE_EXPRESSION);
		createEAttribute(valueExpressionEClass, VALUE_EXPRESSION__VALUE);

		waveformExpressionEClass = createEClass(WAVEFORM_EXPRESSION);
		createEReference(waveformExpressionEClass, WAVEFORM_EXPRESSION__EXPRESSION);
		createEReference(waveformExpressionEClass, WAVEFORM_EXPRESSION__AFTER);

		multiExpressionEClass = createEClass(MULTI_EXPRESSION);
		createEReference(multiExpressionEClass, MULTI_EXPRESSION__EXPRESSION);

		// Create enums
		unaryOperatorEEnum = createEEnum(UNARY_OPERATOR);
		multiplyingOperatorEEnum = createEEnum(MULTIPLYING_OPERATOR);
		shiftOperatorEEnum = createEEnum(SHIFT_OPERATOR);
		relationalOperatorEEnum = createEEnum(RELATIONAL_OPERATOR);
		logicalOperatorEEnum = createEEnum(LOGICAL_OPERATOR);
		addingOperatorEEnum = createEEnum(ADDING_OPERATOR);
		signEEnum = createEEnum(SIGN);
		rangeDirectionEEnum = createEEnum(RANGE_DIRECTION);
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
		NaturePackage theNaturePackage = (NaturePackage)EPackage.Registry.INSTANCE.getEPackage(NaturePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		addingExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		aggregateExpressionEClass.getESuperTypes().add(this.getMultiExpression());
		aggregateExpressionEClass.getESuperTypes().add(theVhdlPackage.getName_());
		allExpressionEClass.getESuperTypes().add(this.getExpression());
		allExpressionEClass.getESuperTypes().add(theVhdlPackage.getName_());
		allocatorExpressionEClass.getESuperTypes().add(this.getExpression());
		allocatorExpressionEClass.getESuperTypes().add(theTypePackage.getTyped());
		associationExpressionEClass.getESuperTypes().add(this.getExpression());
		attributeExpressionEClass.getESuperTypes().add(this.getValueExpression());
		attributeExpressionEClass.getESuperTypes().add(theVhdlPackage.getName_());
		binaryExpressionEClass.getESuperTypes().add(this.getExpression());
		bitStringExpressionEClass.getESuperTypes().add(this.getValueExpression());
		expressionEClass.getESuperTypes().add(theVhdlPackage.getVhdlObject());
		indicationExpressionEClass.getESuperTypes().add(this.getExpression());
		subtypeIndicationExpressionEClass.getESuperTypes().add(this.getIndicationExpression());
		subtypeIndicationExpressionEClass.getESuperTypes().add(theTypePackage.getTypeReference());
		subtypeIndicationExpressionEClass.getESuperTypes().add(theVhdlPackage.getNamed());
		subnatureIndicationExpressionEClass.getESuperTypes().add(this.getIndicationExpression());
		subnatureIndicationExpressionEClass.getESuperTypes().add(theNaturePackage.getNatureReference());
		logicalExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		nameExpressionEClass.getESuperTypes().add(this.getExpression());
		nameExpressionEClass.getESuperTypes().add(theVhdlPackage.getName_());
		nullExpressionEClass.getESuperTypes().add(this.getExpression());
		multiplyingExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		powerExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		relationalExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		shiftExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		signatureExpressionEClass.getESuperTypes().add(this.getExpression());
		signatureExpressionEClass.getESuperTypes().add(theVhdlPackage.getName_());
		signExpressionEClass.getESuperTypes().add(this.getExpression());
		unaryExpressionEClass.getESuperTypes().add(this.getExpression());
		openExpressionEClass.getESuperTypes().add(this.getExpression());
		othersExpressionEClass.getESuperTypes().add(this.getExpression());
		othersExpressionEClass.getESuperTypes().add(theVhdlPackage.getName_());
		rangeExpressionEClass.getESuperTypes().add(this.getBinaryExpression());
		rangeExpressionEClass.getESuperTypes().add(theVhdlPackage.getName_());
		stringExpressionEClass.getESuperTypes().add(this.getValueExpression());
		stringExpressionEClass.getESuperTypes().add(theVhdlPackage.getName_());
		characterExpressionEClass.getESuperTypes().add(this.getValueExpression());
		characterExpressionEClass.getESuperTypes().add(theVhdlPackage.getName_());
		characterExpressionEClass.getESuperTypes().add(theTypePackage.getEnumerationLiteral());
		identifierExpressionEClass.getESuperTypes().add(this.getValueExpression());
		identifierExpressionEClass.getESuperTypes().add(theVhdlPackage.getName_());
		identifierExpressionEClass.getESuperTypes().add(theTypePackage.getEnumerationLiteral());
		unitValueExpressionEClass.getESuperTypes().add(this.getValueExpression());
		valueExpressionEClass.getESuperTypes().add(this.getExpression());
		waveformExpressionEClass.getESuperTypes().add(this.getExpression());
		multiExpressionEClass.getESuperTypes().add(this.getExpression());

		// Initialize classes and features; add operations and parameters
		initEClass(addingExpressionEClass, AddingExpression.class, "AddingExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddingExpression_Operator(), this.getAddingOperator(), "operator", null, 0, 1, AddingExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregateExpressionEClass, AggregateExpression.class, "AggregateExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(allExpressionEClass, AllExpression.class, "AllExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(allocatorExpressionEClass, AllocatorExpression.class, "AllocatorExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(associationExpressionEClass, AssociationExpression.class, "AssociationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociationExpression_Choice(), this.getExpression(), null, "choice", null, 0, 1, AssociationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociationExpression_Expression(), this.getExpression(), null, "expression", null, 0, 1, AssociationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeExpressionEClass, AttributeExpression.class, "AttributeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeExpression_Signature(), theVhdlPackage.getSignature(), null, "signature", null, 0, 1, AttributeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryExpressionEClass, BinaryExpression.class, "BinaryExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryExpression_Left(), this.getExpression(), null, "left", null, 0, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryExpression_Right(), this.getExpression(), null, "right", null, 0, 1, BinaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bitStringExpressionEClass, BitStringExpression.class, "BitStringExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(indicationExpressionEClass, IndicationExpression.class, "IndicationExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndicationExpression_Constraint(), this.getExpression(), null, "constraint", null, 0, 1, IndicationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndicationExpression_Tolerance(), this.getExpression(), null, "tolerance", null, 0, 1, IndicationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndicationExpression_Across(), this.getExpression(), null, "across", null, 0, 1, IndicationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subtypeIndicationExpressionEClass, SubtypeIndicationExpression.class, "SubtypeIndicationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubtypeIndicationExpression_Mark(), theTypePackage.getTypeReference(), null, "mark", null, 0, 1, SubtypeIndicationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subnatureIndicationExpressionEClass, SubnatureIndicationExpression.class, "SubnatureIndicationExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubnatureIndicationExpression_Mark(), theNaturePackage.getNatureReference(), null, "mark", null, 0, 1, SubnatureIndicationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicalExpressionEClass, LogicalExpression.class, "LogicalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLogicalExpression_Operator(), this.getLogicalOperator(), "operator", null, 0, 1, LogicalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameExpressionEClass, NameExpression.class, "NameExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNameExpression_Element(), theVhdlPackage.getName_(), null, "element", null, 0, -1, NameExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nullExpressionEClass, NullExpression.class, "NullExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiplyingExpressionEClass, MultiplyingExpression.class, "MultiplyingExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiplyingExpression_Operator(), this.getMultiplyingOperator(), "operator", null, 0, 1, MultiplyingExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(powerExpressionEClass, PowerExpression.class, "PowerExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(relationalExpressionEClass, RelationalExpression.class, "RelationalExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelationalExpression_Operator(), this.getRelationalOperator(), "operator", null, 0, 1, RelationalExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shiftExpressionEClass, ShiftExpression.class, "ShiftExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShiftExpression_Operator(), this.getShiftOperator(), "operator", null, 0, 1, ShiftExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signatureExpressionEClass, SignatureExpression.class, "SignatureExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignatureExpression_Signature(), theVhdlPackage.getSignature(), null, "signature", null, 0, 1, SignatureExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignatureExpression_Name(), theVhdlPackage.getName_(), null, "name", null, 0, 1, SignatureExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signExpressionEClass, SignExpression.class, "SignExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignExpression_Sign(), this.getSign(), "sign", null, 0, 1, SignExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignExpression_Expression(), this.getExpression(), null, "expression", null, 0, 1, SignExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unaryExpressionEClass, UnaryExpression.class, "UnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnaryExpression_Operator(), this.getUnaryOperator(), "operator", null, 0, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnaryExpression_Expression(), this.getExpression(), null, "expression", null, 0, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(openExpressionEClass, OpenExpression.class, "OpenExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(othersExpressionEClass, OthersExpression.class, "OthersExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rangeExpressionEClass, RangeExpression.class, "RangeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRangeExpression_Direction(), this.getRangeDirection(), "direction", null, 0, 1, RangeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringExpressionEClass, StringExpression.class, "StringExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(characterExpressionEClass, CharacterExpression.class, "CharacterExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(identifierExpressionEClass, IdentifierExpression.class, "IdentifierExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unitValueExpressionEClass, UnitValueExpression.class, "UnitValueExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnitValueExpression_Unit(), theVhdlPackage.getName_(), null, "unit", null, 0, 1, UnitValueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueExpressionEClass, ValueExpression.class, "ValueExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValueExpression_Value(), ecorePackage.getEString(), "value", null, 0, 1, ValueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(waveformExpressionEClass, WaveformExpression.class, "WaveformExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWaveformExpression_Expression(), this.getExpression(), null, "expression", null, 0, 1, WaveformExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWaveformExpression_After(), this.getExpression(), null, "after", null, 0, 1, WaveformExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiExpressionEClass, MultiExpression.class, "MultiExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiExpression_Expression(), this.getExpression(), null, "expression", null, 0, -1, MultiExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(unaryOperatorEEnum, UnaryOperator.class, "UnaryOperator");
		addEEnumLiteral(unaryOperatorEEnum, UnaryOperator.ABS);
		addEEnumLiteral(unaryOperatorEEnum, UnaryOperator.NOT);

		initEEnum(multiplyingOperatorEEnum, MultiplyingOperator.class, "MultiplyingOperator");
		addEEnumLiteral(multiplyingOperatorEEnum, MultiplyingOperator.MUL);
		addEEnumLiteral(multiplyingOperatorEEnum, MultiplyingOperator.DIV);
		addEEnumLiteral(multiplyingOperatorEEnum, MultiplyingOperator.MOD);
		addEEnumLiteral(multiplyingOperatorEEnum, MultiplyingOperator.REM);

		initEEnum(shiftOperatorEEnum, ShiftOperator.class, "ShiftOperator");
		addEEnumLiteral(shiftOperatorEEnum, ShiftOperator.SLL);
		addEEnumLiteral(shiftOperatorEEnum, ShiftOperator.SRL);
		addEEnumLiteral(shiftOperatorEEnum, ShiftOperator.SLA);
		addEEnumLiteral(shiftOperatorEEnum, ShiftOperator.SRA);
		addEEnumLiteral(shiftOperatorEEnum, ShiftOperator.ROL);
		addEEnumLiteral(shiftOperatorEEnum, ShiftOperator.ROR);

		initEEnum(relationalOperatorEEnum, RelationalOperator.class, "RelationalOperator");
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.EQ);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.NEQ);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.LOWERTHAN);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.LE);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.GREATERTHAN);
		addEEnumLiteral(relationalOperatorEEnum, RelationalOperator.GE);

		initEEnum(logicalOperatorEEnum, LogicalOperator.class, "LogicalOperator");
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.AND);
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.OR);
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.NAND);
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.NOR);
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.XOR);
		addEEnumLiteral(logicalOperatorEEnum, LogicalOperator.XNOR);

		initEEnum(addingOperatorEEnum, AddingOperator.class, "AddingOperator");
		addEEnumLiteral(addingOperatorEEnum, AddingOperator.PLUS);
		addEEnumLiteral(addingOperatorEEnum, AddingOperator.MINUS);
		addEEnumLiteral(addingOperatorEEnum, AddingOperator.AMPERSAND);

		initEEnum(signEEnum, Sign.class, "Sign");
		addEEnumLiteral(signEEnum, Sign.PLUS);
		addEEnumLiteral(signEEnum, Sign.MINUS);

		initEEnum(rangeDirectionEEnum, RangeDirection.class, "RangeDirection");
		addEEnumLiteral(rangeDirectionEEnum, RangeDirection.TO);
		addEEnumLiteral(rangeDirectionEEnum, RangeDirection.DOWNTO);
	}

} //ExpressionPackageImpl
