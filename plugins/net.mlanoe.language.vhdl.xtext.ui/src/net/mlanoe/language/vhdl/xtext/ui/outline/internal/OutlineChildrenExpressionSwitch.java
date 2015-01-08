/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.xtext.ui.outline.internal;

import java.util.Collections;

import net.mlanoe.language.vhdl.expression.AddingExpression;
import net.mlanoe.language.vhdl.expression.AggregateExpression;
import net.mlanoe.language.vhdl.expression.AllExpression;
import net.mlanoe.language.vhdl.expression.AllocatorExpression;
import net.mlanoe.language.vhdl.expression.AssociationExpression;
import net.mlanoe.language.vhdl.expression.LogicalExpression;
import net.mlanoe.language.vhdl.expression.MultiplyingExpression;
import net.mlanoe.language.vhdl.expression.NameExpression;
import net.mlanoe.language.vhdl.expression.NullExpression;
import net.mlanoe.language.vhdl.expression.OpenExpression;
import net.mlanoe.language.vhdl.expression.OthersExpression;
import net.mlanoe.language.vhdl.expression.PowerExpression;
import net.mlanoe.language.vhdl.expression.RangeExpression;
import net.mlanoe.language.vhdl.expression.RelationalExpression;
import net.mlanoe.language.vhdl.expression.ShiftExpression;
import net.mlanoe.language.vhdl.expression.SignExpression;
import net.mlanoe.language.vhdl.expression.SignatureExpression;
import net.mlanoe.language.vhdl.expression.SubnatureIndicationExpression;
import net.mlanoe.language.vhdl.expression.SubtypeIndicationExpression;
import net.mlanoe.language.vhdl.expression.UnaffectedExpression;
import net.mlanoe.language.vhdl.expression.UnaryExpression;
import net.mlanoe.language.vhdl.expression.UnitValueExpression;
import net.mlanoe.language.vhdl.expression.ValueExpression;
import net.mlanoe.language.vhdl.expression.WaveformExpression;
import net.mlanoe.language.vhdl.expression.util.ExpressionSwitch;

import org.eclipse.emf.ecore.EObject;

/**
 * Outline children for classes declared into the 'expression' package.
 * 
 * @author <a href="mailto:mickael.lanoe@laposte.net">Mickael LANOE</a>
 *
 */
public class OutlineChildrenExpressionSwitch extends
		ExpressionSwitch<Iterable<? extends EObject>> {

	@Override
	public Iterable<? extends EObject> caseUnaffectedExpression(
			UnaffectedExpression object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseAddingExpression(
			AddingExpression object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseAggregateExpression(
			AggregateExpression object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseAllExpression(AllExpression object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseAllocatorExpression(
			AllocatorExpression object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseAssociationExpression(
			AssociationExpression object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseWaveformExpression(
			WaveformExpression object) {
		return object.eContents();
	}

	@Override
	public Iterable<? extends EObject> caseSubtypeIndicationExpression(
			SubtypeIndicationExpression object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseSubnatureIndicationExpression(
			SubnatureIndicationExpression object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseLogicalExpression(
			LogicalExpression object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseMultiplyingExpression(
			MultiplyingExpression object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> casePowerExpression(
			PowerExpression object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseRelationalExpression(
			RelationalExpression object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseShiftExpression(
			ShiftExpression object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseSignatureExpression(
			SignatureExpression object) {
		return Collections.singletonList(object.getSignature());
	}

	@Override
	public Iterable<? extends EObject> caseSignExpression(SignExpression object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseUnaryExpression(
			UnaryExpression object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseRangeExpression(
			RangeExpression object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseNullExpression(NullExpression object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseNameExpression(NameExpression object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseOpenExpression(OpenExpression object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseOthersExpression(
			OthersExpression object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseUnitValueExpression(
			UnitValueExpression object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseValueExpression(
			ValueExpression object) {
		return Collections.emptyList();
	}

}
