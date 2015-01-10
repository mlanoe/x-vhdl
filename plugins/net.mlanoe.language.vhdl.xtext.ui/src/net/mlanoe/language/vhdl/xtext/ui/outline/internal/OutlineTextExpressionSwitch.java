/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.xtext.ui.outline.internal;

import net.mlanoe.language.vhdl.Name;
import net.mlanoe.language.vhdl.expression.AddingExpression;
import net.mlanoe.language.vhdl.expression.AggregateExpression;
import net.mlanoe.language.vhdl.expression.AllExpression;
import net.mlanoe.language.vhdl.expression.AllocatorExpression;
import net.mlanoe.language.vhdl.expression.AssociationExpression;
import net.mlanoe.language.vhdl.expression.CharacterExpression;
import net.mlanoe.language.vhdl.expression.ConditionalWaveformExpression;
import net.mlanoe.language.vhdl.expression.Expression;
import net.mlanoe.language.vhdl.expression.IdentifierExpression;
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
import net.mlanoe.language.vhdl.expression.StringExpression;
import net.mlanoe.language.vhdl.expression.SubnatureIndicationExpression;
import net.mlanoe.language.vhdl.expression.SubtypeIndicationExpression;
import net.mlanoe.language.vhdl.expression.UnaffectedExpression;
import net.mlanoe.language.vhdl.expression.UnaryExpression;
import net.mlanoe.language.vhdl.expression.UnitValueExpression;
import net.mlanoe.language.vhdl.expression.ValueExpression;
import net.mlanoe.language.vhdl.expression.WaveformExpression;
import net.mlanoe.language.vhdl.expression.util.ExpressionSwitch;
import net.mlanoe.language.vhdl.xtext.ui.outline.OutlineTextGenerator;

/**
 * Outline text for classes declared into the 'expression' package.
 * 
 * @author <a href="mailto:mickael.lanoe@laposte.net">Mickael LANOE</a>
 *
 */
public class OutlineTextExpressionSwitch extends ExpressionSwitch<String> {

	@Override
	public String caseUnaffectedExpression(UnaffectedExpression object) {
		return "unaffected";
	}

	@Override
	public String caseAddingExpression(AddingExpression object) {
		StringBuilder builder = new StringBuilder();
		builder.append(OutlineTextGenerator.getOutline(object.getLeft()));
		switch (object.getOperator()) {
		case AMPERSAND:
			builder.append(" & ");
			break;
		case MINUS:
			builder.append(" - ");
			break;
		case PLUS:
			builder.append(" + ");
			break;
		}
		builder.append(OutlineTextGenerator.getOutline(object.getRight()));
		return builder.toString();
	}

	@Override
	public String caseAggregateExpression(AggregateExpression object) {
		StringBuilder builder = new StringBuilder();
		for (Expression expression : object.getExpression()) {
			if (builder.length() != 0) {
				builder.append(", ");
			}
			builder.append(OutlineTextGenerator.getOutline(expression));
		}
		return "(" + builder.toString() + ")";
	}

	@Override
	public String caseAllExpression(AllExpression object) {
		return "all";
	}

	@Override
	public String caseAllocatorExpression(AllocatorExpression object) {
		return "new " + OutlineTextGenerator.getOutline(object.getType());
	}

	@Override
	public String caseAssociationExpression(AssociationExpression object) {
		StringBuilder builder = new StringBuilder();
		builder.append(OutlineTextGenerator.getOutline(object.getChoice()));
		builder.append(" => ");
		builder.append(OutlineTextGenerator.getOutline(object.getExpression()));
		return builder.toString();
	}

	@Override
	public String caseConditionalWaveformExpression(
			ConditionalWaveformExpression object) {
		StringBuilder builder = new StringBuilder();
		builder.append(OutlineTextGenerator.getOutline(object.getExpression()));
		builder.append(" when ");
		builder.append(OutlineTextGenerator.getOutline(object.getChoice()));
		return builder.toString();
	}

	@Override
	public String caseWaveformExpression(WaveformExpression object) {
		return "waveform";
	}

	@Override
	public String caseSubtypeIndicationExpression(
			SubtypeIndicationExpression object) {
		StringBuilder builder = new StringBuilder();

		if (object.getName() != null) {
			builder.append(OutlineTextGenerator.getOutline(object.getName()));
			builder.append(" ");
		}

		builder.append(OutlineTextGenerator.getOutline(object.getMark()));
		return builder.toString();
	}

	@Override
	public String caseSubnatureIndicationExpression(
			SubnatureIndicationExpression object) {
		return OutlineTextGenerator.getOutline(object.getMark());
	}

	@Override
	public String caseLogicalExpression(LogicalExpression object) {
		StringBuilder builder = new StringBuilder();
		builder.append(OutlineTextGenerator.getOutline(object.getLeft()));
		switch (object.getOperator()) {
		case AND:
			builder.append(" and ");
			break;
		case NAND:
			builder.append(" nand ");
			break;
		case NOR:
			builder.append(" nor ");
			break;
		case OR:
			builder.append(" or ");
			break;
		case XNOR:
			builder.append(" xnor ");
			break;
		case XOR:
			builder.append(" xor ");
			break;
		}

		builder.append(OutlineTextGenerator.getOutline(object.getRight()));
		return builder.toString();
	}

	@Override
	public String caseMultiplyingExpression(MultiplyingExpression object) {
		StringBuilder builder = new StringBuilder();
		builder.append(OutlineTextGenerator.getOutline(object.getLeft()));
		switch (object.getOperator()) {
		case DIV:
			builder.append(" / ");
			break;
		case MOD:
			builder.append(" mod ");
			break;
		case MUL:
			builder.append(" * ");
			break;
		case REM:
			builder.append(" rem ");
			break;
		}

		builder.append(OutlineTextGenerator.getOutline(object.getRight()));
		return builder.toString();
	}

	@Override
	public String casePowerExpression(PowerExpression object) {
		StringBuilder builder = new StringBuilder();
		builder.append(OutlineTextGenerator.getOutline(object.getLeft()));
		builder.append(" ** ");
		builder.append(OutlineTextGenerator.getOutline(object.getRight()));
		return builder.toString();
	}

	@Override
	public String caseRelationalExpression(RelationalExpression object) {
		StringBuilder builder = new StringBuilder();
		builder.append(OutlineTextGenerator.getOutline(object.getLeft()));
		switch (object.getOperator()) {
		case EQ:
			builder.append(" = ");
			break;
		case GE:
			builder.append(" >= ");
			break;
		case GREATERTHAN:
			builder.append(" > ");
			break;
		case LE:
			builder.append(" <= ");
			break;
		case LOWERTHAN:
			builder.append(" < ");
			break;
		case NEQ:
			builder.append(" <> ");
			break;
		}

		builder.append(OutlineTextGenerator.getOutline(object.getRight()));
		return builder.toString();
	}

	@Override
	public String caseShiftExpression(ShiftExpression object) {
		StringBuilder builder = new StringBuilder();
		builder.append(OutlineTextGenerator.getOutline(object.getLeft()));
		switch (object.getOperator()) {
		case ROL:
			builder.append(" rol ");
			break;
		case ROR:
			builder.append(" ror ");
			break;
		case SLA:
			builder.append(" sla ");
			break;
		case SLL:
			builder.append(" sll ");
			break;
		case SRA:
			builder.append(" sra ");
			break;
		case SRL:
			builder.append(" srl ");
			break;
		}

		builder.append(OutlineTextGenerator.getOutline(object.getRight()));
		return builder.toString();
	}

	@Override
	public String caseSignatureExpression(SignatureExpression object) {
		return OutlineTextGenerator.getOutline(object.getName());
	}

	@Override
	public String caseSignExpression(SignExpression object) {
		StringBuilder builder = new StringBuilder();
		switch (object.getSign()) {
		case MINUS:
			builder.append("-");
			break;
		case PLUS:
			builder.append("+");
			break;
		}
		builder.append(OutlineTextGenerator.getOutline(object.getExpression()));
		return builder.toString();
	}

	@Override
	public String caseUnaryExpression(UnaryExpression object) {
		StringBuilder builder = new StringBuilder();
		switch (object.getOperator()) {
		case ABS:
			builder.append("abs ");
			break;
		case NOT:
			builder.append("not ");
			break;
		}
		builder.append(OutlineTextGenerator.getOutline(object.getExpression()));
		return builder.toString();
	}

	@Override
	public String caseRangeExpression(RangeExpression object) {
		StringBuilder builder = new StringBuilder();
		builder.append(OutlineTextGenerator.getOutline(object.getLeft()));
		switch (object.getDirection()) {
		case DOWNTO:
			builder.append(" downto ");
			break;
		case TO:
			builder.append(" to ");
			break;
		}
		builder.append(OutlineTextGenerator.getOutline(object.getRight()));

		return builder.toString();
	}

	@Override
	public String caseNullExpression(NullExpression object) {
		return "null";
	}

	@Override
	public String caseNameExpression(NameExpression object) {
		StringBuilder builder = new StringBuilder();
		for (Name name : object.getElement()) {
			if (builder.length() != 0) {
				if (name instanceof IdentifierExpression
						|| name instanceof CharacterExpression
						|| name instanceof StringExpression
						|| name instanceof AllExpression) {
					builder.append(".");
				}
			}

			if (name instanceof RangeExpression) {
				builder.append("(");
			}

			builder.append(OutlineTextGenerator.getOutline(name));

			if (name instanceof RangeExpression) {
				builder.append(")");
			}
		}
		return builder.toString();
	}

	@Override
	public String caseOpenExpression(OpenExpression object) {
		return "open";
	}

	@Override
	public String caseOthersExpression(OthersExpression object) {
		return "others";
	}

	@Override
	public String caseUnitValueExpression(UnitValueExpression object) {
		return object.getValue()
				+ OutlineTextGenerator.getOutline(object.getUnit());
	}

	@Override
	public String caseValueExpression(ValueExpression object) {
		return object.getValue();
	}

}
