/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.expression.provider;

import java.util.ArrayList;
import java.util.Collection;

import net.mlanoe.language.vhdl.expression.util.ExpressionAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpressionItemProviderAdapterFactory extends ExpressionAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.expression.AddingExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddingExpressionItemProvider addingExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.expression.AddingExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAddingExpressionAdapter() {
		if (addingExpressionItemProvider == null) {
			addingExpressionItemProvider = new AddingExpressionItemProvider(this);
		}

		return addingExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.expression.AggregateExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AggregateExpressionItemProvider aggregateExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.expression.AggregateExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAggregateExpressionAdapter() {
		if (aggregateExpressionItemProvider == null) {
			aggregateExpressionItemProvider = new AggregateExpressionItemProvider(this);
		}

		return aggregateExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.expression.AllExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllExpressionItemProvider allExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.expression.AllExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAllExpressionAdapter() {
		if (allExpressionItemProvider == null) {
			allExpressionItemProvider = new AllExpressionItemProvider(this);
		}

		return allExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.expression.AllocatorExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocatorExpressionItemProvider allocatorExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.expression.AllocatorExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAllocatorExpressionAdapter() {
		if (allocatorExpressionItemProvider == null) {
			allocatorExpressionItemProvider = new AllocatorExpressionItemProvider(this);
		}

		return allocatorExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.expression.AssociationExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationExpressionItemProvider associationExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.expression.AssociationExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAssociationExpressionAdapter() {
		if (associationExpressionItemProvider == null) {
			associationExpressionItemProvider = new AssociationExpressionItemProvider(this);
		}

		return associationExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.expression.AttributeExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeExpressionItemProvider attributeExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.expression.AttributeExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeExpressionAdapter() {
		if (attributeExpressionItemProvider == null) {
			attributeExpressionItemProvider = new AttributeExpressionItemProvider(this);
		}

		return attributeExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.expression.BitStringExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BitStringExpressionItemProvider bitStringExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.expression.BitStringExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBitStringExpressionAdapter() {
		if (bitStringExpressionItemProvider == null) {
			bitStringExpressionItemProvider = new BitStringExpressionItemProvider(this);
		}

		return bitStringExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.expression.SubtypeIndicationExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubtypeIndicationExpressionItemProvider subtypeIndicationExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.expression.SubtypeIndicationExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubtypeIndicationExpressionAdapter() {
		if (subtypeIndicationExpressionItemProvider == null) {
			subtypeIndicationExpressionItemProvider = new SubtypeIndicationExpressionItemProvider(this);
		}

		return subtypeIndicationExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.expression.SubnatureIndicationExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubnatureIndicationExpressionItemProvider subnatureIndicationExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.expression.SubnatureIndicationExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubnatureIndicationExpressionAdapter() {
		if (subnatureIndicationExpressionItemProvider == null) {
			subnatureIndicationExpressionItemProvider = new SubnatureIndicationExpressionItemProvider(this);
		}

		return subnatureIndicationExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.expression.LogicalExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogicalExpressionItemProvider logicalExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.expression.LogicalExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLogicalExpressionAdapter() {
		if (logicalExpressionItemProvider == null) {
			logicalExpressionItemProvider = new LogicalExpressionItemProvider(this);
		}

		return logicalExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.expression.NameExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NameExpressionItemProvider nameExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.expression.NameExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNameExpressionAdapter() {
		if (nameExpressionItemProvider == null) {
			nameExpressionItemProvider = new NameExpressionItemProvider(this);
		}

		return nameExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.expression.NullExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NullExpressionItemProvider nullExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.expression.NullExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNullExpressionAdapter() {
		if (nullExpressionItemProvider == null) {
			nullExpressionItemProvider = new NullExpressionItemProvider(this);
		}

		return nullExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.expression.MultiplyingExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplyingExpressionItemProvider multiplyingExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.expression.MultiplyingExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMultiplyingExpressionAdapter() {
		if (multiplyingExpressionItemProvider == null) {
			multiplyingExpressionItemProvider = new MultiplyingExpressionItemProvider(this);
		}

		return multiplyingExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.expression.PowerExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerExpressionItemProvider powerExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.expression.PowerExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPowerExpressionAdapter() {
		if (powerExpressionItemProvider == null) {
			powerExpressionItemProvider = new PowerExpressionItemProvider(this);
		}

		return powerExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.expression.RelationalExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationalExpressionItemProvider relationalExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.expression.RelationalExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRelationalExpressionAdapter() {
		if (relationalExpressionItemProvider == null) {
			relationalExpressionItemProvider = new RelationalExpressionItemProvider(this);
		}

		return relationalExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.expression.ShiftExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShiftExpressionItemProvider shiftExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.expression.ShiftExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createShiftExpressionAdapter() {
		if (shiftExpressionItemProvider == null) {
			shiftExpressionItemProvider = new ShiftExpressionItemProvider(this);
		}

		return shiftExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.expression.SignatureExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignatureExpressionItemProvider signatureExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.expression.SignatureExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSignatureExpressionAdapter() {
		if (signatureExpressionItemProvider == null) {
			signatureExpressionItemProvider = new SignatureExpressionItemProvider(this);
		}

		return signatureExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.expression.SignExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignExpressionItemProvider signExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.expression.SignExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSignExpressionAdapter() {
		if (signExpressionItemProvider == null) {
			signExpressionItemProvider = new SignExpressionItemProvider(this);
		}

		return signExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.expression.UnaryExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaryExpressionItemProvider unaryExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.expression.UnaryExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnaryExpressionAdapter() {
		if (unaryExpressionItemProvider == null) {
			unaryExpressionItemProvider = new UnaryExpressionItemProvider(this);
		}

		return unaryExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.expression.OpenExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenExpressionItemProvider openExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.expression.OpenExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOpenExpressionAdapter() {
		if (openExpressionItemProvider == null) {
			openExpressionItemProvider = new OpenExpressionItemProvider(this);
		}

		return openExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.expression.OthersExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OthersExpressionItemProvider othersExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.expression.OthersExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOthersExpressionAdapter() {
		if (othersExpressionItemProvider == null) {
			othersExpressionItemProvider = new OthersExpressionItemProvider(this);
		}

		return othersExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.expression.RangeExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RangeExpressionItemProvider rangeExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.expression.RangeExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRangeExpressionAdapter() {
		if (rangeExpressionItemProvider == null) {
			rangeExpressionItemProvider = new RangeExpressionItemProvider(this);
		}

		return rangeExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.expression.StringExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringExpressionItemProvider stringExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.expression.StringExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStringExpressionAdapter() {
		if (stringExpressionItemProvider == null) {
			stringExpressionItemProvider = new StringExpressionItemProvider(this);
		}

		return stringExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.expression.CharacterExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharacterExpressionItemProvider characterExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.expression.CharacterExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCharacterExpressionAdapter() {
		if (characterExpressionItemProvider == null) {
			characterExpressionItemProvider = new CharacterExpressionItemProvider(this);
		}

		return characterExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.expression.IdentifierExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifierExpressionItemProvider identifierExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.expression.IdentifierExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIdentifierExpressionAdapter() {
		if (identifierExpressionItemProvider == null) {
			identifierExpressionItemProvider = new IdentifierExpressionItemProvider(this);
		}

		return identifierExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.expression.UnitValueExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnitValueExpressionItemProvider unitValueExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.expression.UnitValueExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnitValueExpressionAdapter() {
		if (unitValueExpressionItemProvider == null) {
			unitValueExpressionItemProvider = new UnitValueExpressionItemProvider(this);
		}

		return unitValueExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.expression.UnaffectedExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnaffectedExpressionItemProvider unaffectedExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.expression.UnaffectedExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUnaffectedExpressionAdapter() {
		if (unaffectedExpressionItemProvider == null) {
			unaffectedExpressionItemProvider = new UnaffectedExpressionItemProvider(this);
		}

		return unaffectedExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.expression.ValueExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueExpressionItemProvider valueExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.expression.ValueExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createValueExpressionAdapter() {
		if (valueExpressionItemProvider == null) {
			valueExpressionItemProvider = new ValueExpressionItemProvider(this);
		}

		return valueExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.expression.WaveformExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WaveformExpressionItemProvider waveformExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.expression.WaveformExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWaveformExpressionAdapter() {
		if (waveformExpressionItemProvider == null) {
			waveformExpressionItemProvider = new WaveformExpressionItemProvider(this);
		}

		return waveformExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.expression.MultiExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiExpressionItemProvider multiExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.expression.MultiExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMultiExpressionAdapter() {
		if (multiExpressionItemProvider == null) {
			multiExpressionItemProvider = new MultiExpressionItemProvider(this);
		}

		return multiExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.expression.ConditionalWaveformExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalWaveformExpressionItemProvider conditionalWaveformExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.expression.ConditionalWaveformExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConditionalWaveformExpressionAdapter() {
		if (conditionalWaveformExpressionItemProvider == null) {
			conditionalWaveformExpressionItemProvider = new ConditionalWaveformExpressionItemProvider(this);
		}

		return conditionalWaveformExpressionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link net.mlanoe.language.vhdl.expression.TypeQualificationExpression} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeQualificationExpressionItemProvider typeQualificationExpressionItemProvider;

	/**
	 * This creates an adapter for a {@link net.mlanoe.language.vhdl.expression.TypeQualificationExpression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTypeQualificationExpressionAdapter() {
		if (typeQualificationExpressionItemProvider == null) {
			typeQualificationExpressionItemProvider = new TypeQualificationExpressionItemProvider(this);
		}

		return typeQualificationExpressionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (addingExpressionItemProvider != null) addingExpressionItemProvider.dispose();
		if (aggregateExpressionItemProvider != null) aggregateExpressionItemProvider.dispose();
		if (allExpressionItemProvider != null) allExpressionItemProvider.dispose();
		if (allocatorExpressionItemProvider != null) allocatorExpressionItemProvider.dispose();
		if (associationExpressionItemProvider != null) associationExpressionItemProvider.dispose();
		if (attributeExpressionItemProvider != null) attributeExpressionItemProvider.dispose();
		if (bitStringExpressionItemProvider != null) bitStringExpressionItemProvider.dispose();
		if (subtypeIndicationExpressionItemProvider != null) subtypeIndicationExpressionItemProvider.dispose();
		if (subnatureIndicationExpressionItemProvider != null) subnatureIndicationExpressionItemProvider.dispose();
		if (logicalExpressionItemProvider != null) logicalExpressionItemProvider.dispose();
		if (nameExpressionItemProvider != null) nameExpressionItemProvider.dispose();
		if (nullExpressionItemProvider != null) nullExpressionItemProvider.dispose();
		if (multiplyingExpressionItemProvider != null) multiplyingExpressionItemProvider.dispose();
		if (powerExpressionItemProvider != null) powerExpressionItemProvider.dispose();
		if (relationalExpressionItemProvider != null) relationalExpressionItemProvider.dispose();
		if (shiftExpressionItemProvider != null) shiftExpressionItemProvider.dispose();
		if (signatureExpressionItemProvider != null) signatureExpressionItemProvider.dispose();
		if (signExpressionItemProvider != null) signExpressionItemProvider.dispose();
		if (unaryExpressionItemProvider != null) unaryExpressionItemProvider.dispose();
		if (openExpressionItemProvider != null) openExpressionItemProvider.dispose();
		if (othersExpressionItemProvider != null) othersExpressionItemProvider.dispose();
		if (rangeExpressionItemProvider != null) rangeExpressionItemProvider.dispose();
		if (stringExpressionItemProvider != null) stringExpressionItemProvider.dispose();
		if (characterExpressionItemProvider != null) characterExpressionItemProvider.dispose();
		if (identifierExpressionItemProvider != null) identifierExpressionItemProvider.dispose();
		if (unitValueExpressionItemProvider != null) unitValueExpressionItemProvider.dispose();
		if (unaffectedExpressionItemProvider != null) unaffectedExpressionItemProvider.dispose();
		if (valueExpressionItemProvider != null) valueExpressionItemProvider.dispose();
		if (waveformExpressionItemProvider != null) waveformExpressionItemProvider.dispose();
		if (multiExpressionItemProvider != null) multiExpressionItemProvider.dispose();
		if (conditionalWaveformExpressionItemProvider != null) conditionalWaveformExpressionItemProvider.dispose();
		if (typeQualificationExpressionItemProvider != null) typeQualificationExpressionItemProvider.dispose();
	}

}
