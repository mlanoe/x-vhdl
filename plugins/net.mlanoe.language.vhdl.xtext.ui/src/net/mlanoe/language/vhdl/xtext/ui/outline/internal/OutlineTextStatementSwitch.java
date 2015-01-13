/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.xtext.ui.outline.internal;

import net.mlanoe.language.vhdl.expression.ConditionalWaveformExpression;
import net.mlanoe.language.vhdl.expression.Expression;
import net.mlanoe.language.vhdl.statement.AssertionStatement;
import net.mlanoe.language.vhdl.statement.BlockStatement;
import net.mlanoe.language.vhdl.statement.BreakStatement;
import net.mlanoe.language.vhdl.statement.BreakStatementItem;
import net.mlanoe.language.vhdl.statement.CaseAlternative;
import net.mlanoe.language.vhdl.statement.CaseStatement;
import net.mlanoe.language.vhdl.statement.ComponentInstantiationStatement;
import net.mlanoe.language.vhdl.statement.ConditionalSignalAssignmentStatement;
import net.mlanoe.language.vhdl.statement.ConfigurationInstantiationStatement;
import net.mlanoe.language.vhdl.statement.DelayMechanism;
import net.mlanoe.language.vhdl.statement.EntityInstantiationStatement;
import net.mlanoe.language.vhdl.statement.ExitStatement;
import net.mlanoe.language.vhdl.statement.ExpressionStatement;
import net.mlanoe.language.vhdl.statement.ForGenerationScheme;
import net.mlanoe.language.vhdl.statement.ForIterationScheme;
import net.mlanoe.language.vhdl.statement.GenerateStatement;
import net.mlanoe.language.vhdl.statement.IfGenerationScheme;
import net.mlanoe.language.vhdl.statement.IfStatement;
import net.mlanoe.language.vhdl.statement.IfStatementTest;
import net.mlanoe.language.vhdl.statement.LoopStatement;
import net.mlanoe.language.vhdl.statement.NextStatement;
import net.mlanoe.language.vhdl.statement.ProcedureCallStatement;
import net.mlanoe.language.vhdl.statement.ProcessStatement;
import net.mlanoe.language.vhdl.statement.RejectMechanism;
import net.mlanoe.language.vhdl.statement.ReportStatement;
import net.mlanoe.language.vhdl.statement.ReturnStatement;
import net.mlanoe.language.vhdl.statement.SelectedSignalAssignmentStatement;
import net.mlanoe.language.vhdl.statement.SequentialSignalAssignmentStatement;
import net.mlanoe.language.vhdl.statement.SimpleSimultaneousStatement;
import net.mlanoe.language.vhdl.statement.SimultaneousCaseStatement;
import net.mlanoe.language.vhdl.statement.SimultaneousIfStatement;
import net.mlanoe.language.vhdl.statement.SimultaneousProceduralStatement;
import net.mlanoe.language.vhdl.statement.TransportMechanism;
import net.mlanoe.language.vhdl.statement.VariableAssignmentStatement;
import net.mlanoe.language.vhdl.statement.WaitStatement;
import net.mlanoe.language.vhdl.statement.WhileIterationScheme;
import net.mlanoe.language.vhdl.statement.util.StatementSwitch;
import net.mlanoe.language.vhdl.xtext.ui.outline.OutlineTextGenerator;

/**
 * Outline text for classes declared into the 'statement' package.
 * 
 * @author <a href="mailto:mickael.lanoe@laposte.net">Mickael LANOE</a>
 *
 */
public class OutlineTextStatementSwitch extends StatementSwitch<Object> {

	@Override
	public String caseWaitStatement(WaitStatement object) {
		StringBuilder builder = new StringBuilder();
		if (object.getLabel() != null) {
			builder.append(object.getLabel());
			builder.append(" : ");
		}
		builder.append("wait ");
		return builder.toString();
	}

	@Override
	public String caseReportStatement(ReportStatement object) {
		StringBuilder builder = new StringBuilder();
		if (object.getLabel() != null) {
			builder.append(object.getLabel());
			builder.append(" : ");
		}
		builder.append("report ");
		builder.append(OutlineTextGenerator.getText(object.getReport()));
		return builder.toString();
	}

	@Override
	public String caseReturnStatement(ReturnStatement object) {
		StringBuilder builder = new StringBuilder();
		if (object.getLabel() != null) {
			builder.append(object.getLabel());
			builder.append(" : ");
		}
		builder.append("return ");
		builder.append(OutlineTextGenerator.getText(object.getExpression()));
		return builder.toString();
	}

	@Override
	public String caseSequentialSignalAssignmentStatement(
			SequentialSignalAssignmentStatement object) {
		StringBuilder builder = new StringBuilder();
		if (object.getLabel() != null) {
			builder.append(object.getLabel());
			builder.append(" : ");
		}
		builder.append(OutlineTextGenerator.getText(object.getTarget()));
		builder.append(" <= ");
		builder.append(OutlineTextGenerator.getText(object.getWaveform()));

		return builder.toString();
	}

	@Override
	public String caseConditionalSignalAssignmentStatement(
			ConditionalSignalAssignmentStatement object) {
		StringBuilder builder = new StringBuilder();
		if (object.getLabel() != null) {
			builder.append(object.getLabel());
			builder.append(" : ");
		}
		builder.append(OutlineTextGenerator.getText(object.getTarget()));
		builder.append(" <= ");

		boolean first = true;
		for (Expression waveform : object.getWaveform()) {
			if (!first) {
				if (waveform instanceof ConditionalWaveformExpression) {
					builder.append(", ");
				} else {
					builder.append(" else ");
				}
			}
			first = false;
			builder.append(OutlineTextGenerator.getText(waveform));
		}
		return builder.toString();
	}

	@Override
	public String caseSelectedSignalAssignmentStatement(
			SelectedSignalAssignmentStatement object) {
		StringBuilder builder = new StringBuilder();
		if (object.getLabel() != null) {
			builder.append(object.getLabel());
			builder.append(" : ");
		}
		builder.append(OutlineTextGenerator.getText(object.getTarget()));
		builder.append(" <= ");

		boolean first = true;
		for (Expression waveform : object.getWaveform()) {
			if (!first) {
				builder.append(", ");
			}
			first = false;
			builder.append(OutlineTextGenerator.getText(waveform));
		}

		return builder.toString();
	}

	@Override
	public String caseVariableAssignmentStatement(
			VariableAssignmentStatement object) {
		StringBuilder builder = new StringBuilder();
		if (object.getLabel() != null) {
			builder.append(object.getLabel());
			builder.append(" : ");
		}
		builder.append(OutlineTextGenerator.getText(object.getTarget()));
		builder.append(" := ");
		builder.append(OutlineTextGenerator.getText(object.getInitial()));
		return builder.toString();
	}

	@Override
	public String caseSimultaneousCaseStatement(SimultaneousCaseStatement object) {
		if (object.getLabel() != null) {
			return object.getLabel();
		}

		return "case";
	}

	@Override
	public String caseCaseStatement(CaseStatement object) {
		if (object.getLabel() != null) {
			return object.getLabel();
		}

		return "case";
	}

	@Override
	public String caseCaseAlternative(CaseAlternative object) {
		return "when " + OutlineTextGenerator.getText(object.getChoice());
	}

	@Override
	public String caseSimultaneousIfStatement(SimultaneousIfStatement object) {
		if (object.getLabel() != null) {
			return object.getLabel();
		}

		return "if";
	}

	@Override
	public String caseIfStatement(IfStatement object) {
		if (object.getLabel() != null) {
			return object.getLabel();
		}

		return "if";
	}

	@Override
	public Object caseIfStatementTest(IfStatementTest object) {
		return OutlineTextGenerator.getText(object.getCondition());
	}

	@Override
	public String caseProcedureCallStatement(ProcedureCallStatement object) {
		StringBuilder builder = new StringBuilder();

		if (object.getLabel() != null) {
			builder.append(object.getLabel());
			builder.append(" : ");
		}

		builder.append(OutlineTextGenerator.getText(object.getProcedure()));
		return builder.toString();
	}

	@Override
	public String caseSimultaneousProceduralStatement(
			SimultaneousProceduralStatement object) {
		if (object.getLabel() != null) {
			return object.getLabel();
		}

		return "procedure";
	}

	@Override
	public Object caseProcessStatement(ProcessStatement object) {
		if (object.getLabel() != null) {
			StringBuilder builder = new StringBuilder();
			builder.append(object.getLabel());

			if (object.getSensitivity() != null) {
				builder.append("(");
				builder.append(OutlineTextGenerator.getText(object
						.getSensitivity()));
				builder.append(")");
			}

			return OutlineTextGenerator.getText(builder, "process");
		} else {
			StringBuilder builder = new StringBuilder();
			builder.append("process");

			if (object.getSensitivity() != null) {
				builder.append("(");
				builder.append(OutlineTextGenerator.getText(object
						.getSensitivity()));
				builder.append(")");
			}

			return builder.toString();
		}
	}

	@Override
	public String caseAssertionStatement(AssertionStatement object) {
		if (object.getLabel() != null) {
			return object.getLabel();
		}

		return "assert";
	}

	@Override
	public String caseBlockStatement(BlockStatement object) {
		if (object.getLabel() != null) {
			return object.getLabel();
		}

		return "block";
	}

	@Override
	public String caseBreakStatement(BreakStatement object) {
		if (object.getLabel() != null) {
			return object.getLabel();
		}

		return "break";
	}

	@Override
	public Object caseBreakStatementItem(BreakStatementItem object) {
		return OutlineTextGenerator.getText(object.getName());
	}

	@Override
	public Object caseComponentInstantiationStatement(
			ComponentInstantiationStatement object) {
		if (object.getLabel() != null) {
			return OutlineTextGenerator.getText(object.getLabel(),
					object.getName());
		} else {
			return OutlineTextGenerator.getText(object.getName());
		}
	}

	@Override
	public Object caseEntityInstantiationStatement(
			EntityInstantiationStatement object) {
		if (object.getLabel() != null) {
			return OutlineTextGenerator.getText(object.getLabel(),
					object.getName());
		} else {
			return OutlineTextGenerator.getText(object.getName());
		}
	}

	@Override
	public Object caseConfigurationInstantiationStatement(
			ConfigurationInstantiationStatement object) {
		if (object.getLabel() != null) {
			return OutlineTextGenerator.getText(object.getLabel(),
					object.getName());
		} else {
			return OutlineTextGenerator.getText(object.getName());
		}
	}

	@Override
	public String caseSimpleSimultaneousStatement(
			SimpleSimultaneousStatement object) {
		StringBuilder builder = new StringBuilder();
		if (object.getLabel() != null) {
			builder.append(object.getLabel());
			builder.append(" : ");
		}

		builder.append("simultaneous");
		return builder.toString();
	}

	@Override
	public String caseExitStatement(ExitStatement object) {
		StringBuilder builder = new StringBuilder();
		if (object.getLabel() != null) {
			builder.append(object.getLabel());
			builder.append(" : ");
		}

		builder.append(OutlineTextGenerator.getText(object.getExit()));
		return builder.toString();
	}

	@Override
	public String caseGenerateStatement(GenerateStatement object) {
		StringBuilder builder = new StringBuilder();
		if (object.getLabel() != null) {
			builder.append(object.getLabel());
			builder.append(" : ");
		}

		builder.append(OutlineTextGenerator.getText(object.getScheme()));
		return builder.toString();
	}

	@Override
	public String caseLoopStatement(LoopStatement object) {
		StringBuilder builder = new StringBuilder();
		if (object.getLabel() != null) {
			builder.append(object.getLabel());
			builder.append(" : ");
		}

		builder.append(OutlineTextGenerator.getText(object.getIteration()));
		return builder.toString();
	}

	@Override
	public String caseNextStatement(NextStatement object) {
		StringBuilder builder = new StringBuilder();
		if (object.getLabel() != null) {
			builder.append(object.getLabel());
			builder.append(" : ");
		}

		builder.append(OutlineTextGenerator.getText(object.getNext()));
		return builder.toString();
	}

	@Override
	public String caseWhileIterationScheme(WhileIterationScheme object) {
		StringBuilder builder = new StringBuilder();
		builder.append("while ");
		builder.append(OutlineTextGenerator.getText(object.getCondition()));
		return builder.toString();
	}

	@Override
	public String caseForIterationScheme(ForIterationScheme object) {
		StringBuilder builder = new StringBuilder();
		builder.append("for ");
		builder.append(object.getVariable());
		builder.append(" in ");
		builder.append(OutlineTextGenerator.getText(object.getIn()));
		return builder.toString();
	}

	@Override
	public String caseForGenerationScheme(ForGenerationScheme object) {
		StringBuilder builder = new StringBuilder();
		builder.append("for ");
		builder.append(object.getVariable());
		builder.append(" in ");
		builder.append(OutlineTextGenerator.getText(object.getIn()));
		return builder.toString();
	}

	@Override
	public String caseIfGenerationScheme(IfGenerationScheme object) {
		return "if " + OutlineTextGenerator.getText(object.getCondition());
	}

	@Override
	public String caseDelayMechanism(DelayMechanism object) {
		return "delay";
	}

	@Override
	public String caseRejectMechanism(RejectMechanism object) {
		return "reject " + OutlineTextGenerator.getText(object.getReject());
	}

	@Override
	public String caseTransportMechanism(TransportMechanism object) {
		return "transport";
	}

	@Override
	public String caseExpressionStatement(ExpressionStatement object) {
		StringBuilder builder = new StringBuilder();
		if (object.getLabel() != null) {
			builder.append(object.getLabel());
			builder.append(" : ");
		}

		builder.append(OutlineTextGenerator.getText(object.getExpression()));
		return builder.toString();
	}

}
