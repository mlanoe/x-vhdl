/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.xtext.ui.outline.internal;

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

/**
 * Outline "isLeaf" for classes declared into the 'expression' package.
 * 
 * @author <a href="mailto:mickael.lanoe@laposte.net">Mickael LANOE</a>
 *
 */
public class OutlineIsLeafExpressionSwitch extends ExpressionSwitch<Boolean> {

	@Override
	public Boolean caseUnaffectedExpression(UnaffectedExpression object) {
		return true;
	}

	@Override
	public Boolean caseAddingExpression(AddingExpression object) {
		return true;
	}

	@Override
	public Boolean caseAggregateExpression(AggregateExpression object) {
		return true;
	}

	@Override
	public Boolean caseAllExpression(AllExpression object) {
		return true;
	}

	@Override
	public Boolean caseAllocatorExpression(AllocatorExpression object) {
		return true;
	}

	@Override
	public Boolean caseAssociationExpression(AssociationExpression object) {
		return true;
	}

	@Override
	public Boolean caseWaveformExpression(WaveformExpression object) {
		return object.eContents().isEmpty();
	}

	@Override
	public Boolean caseSubtypeIndicationExpression(
			SubtypeIndicationExpression object) {
		return true;
	}

	@Override
	public Boolean caseSubnatureIndicationExpression(
			SubnatureIndicationExpression object) {
		return true;
	}

	@Override
	public Boolean caseLogicalExpression(LogicalExpression object) {
		return true;
	}

	@Override
	public Boolean caseMultiplyingExpression(MultiplyingExpression object) {
		return true;
	}

	@Override
	public Boolean casePowerExpression(PowerExpression object) {
		return true;
	}

	@Override
	public Boolean caseRelationalExpression(RelationalExpression object) {
		return true;
	}

	@Override
	public Boolean caseShiftExpression(ShiftExpression object) {
		return true;
	}

	@Override
	public Boolean caseSignatureExpression(SignatureExpression object) {
		return object.getSignature() == null;
	}

	@Override
	public Boolean caseSignExpression(SignExpression object) {
		return true;
	}

	@Override
	public Boolean caseUnaryExpression(UnaryExpression object) {
		return true;
	}

	@Override
	public Boolean caseRangeExpression(RangeExpression object) {
		return true;
	}

	@Override
	public Boolean caseNullExpression(NullExpression object) {
		return true;
	}

	@Override
	public Boolean caseNameExpression(NameExpression object) {
		return true;
	}

	@Override
	public Boolean caseOpenExpression(OpenExpression object) {
		return true;
	}

	@Override
	public Boolean caseOthersExpression(OthersExpression object) {
		return true;
	}

	@Override
	public Boolean caseUnitValueExpression(UnitValueExpression object) {
		return true;
	}

	@Override
	public Boolean caseValueExpression(ValueExpression object) {
		return true;
	}

}
