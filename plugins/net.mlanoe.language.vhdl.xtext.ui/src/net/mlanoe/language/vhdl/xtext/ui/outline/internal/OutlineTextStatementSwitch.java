package net.mlanoe.language.vhdl.xtext.ui.outline.internal;

import net.mlanoe.language.vhdl.statement.AssertionStatement;
import net.mlanoe.language.vhdl.statement.BlockStatement;
import net.mlanoe.language.vhdl.statement.BreakStatement;
import net.mlanoe.language.vhdl.statement.BreakStatementItem;
import net.mlanoe.language.vhdl.statement.CaseAlternative;
import net.mlanoe.language.vhdl.statement.CaseStatement;
import net.mlanoe.language.vhdl.statement.ComponentInstantiationStatement;
import net.mlanoe.language.vhdl.statement.ConditionalSignalAssignmentStatement;
import net.mlanoe.language.vhdl.statement.ConditionalWaveform;
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
import net.mlanoe.language.vhdl.statement.SignalAssignmentStatement;
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
public class OutlineTextStatementSwitch extends StatementSwitch<String> {

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
		builder.append(OutlineTextGenerator.getOutline(object.getReport()));
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
		builder.append(OutlineTextGenerator.getOutline(object.getExpression()));
		return builder.toString();
	}

	@Override
	public String caseSignalAssignmentStatement(SignalAssignmentStatement object) {
		StringBuilder builder = new StringBuilder();
		if (object.getLabel() != null) {
			builder.append(object.getLabel());
			builder.append(" : ");
		}
		builder.append(OutlineTextGenerator.getOutline(object.getTarget()));
		builder.append(" <= ");
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
		builder.append(OutlineTextGenerator.getOutline(object.getTarget()));
		builder.append(" <= ");
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
		builder.append(OutlineTextGenerator.getOutline(object.getTarget()));
		builder.append(" <= ");
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
		builder.append(OutlineTextGenerator.getOutline(object.getTarget()));
		builder.append(" <= ");
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
		builder.append(OutlineTextGenerator.getOutline(object.getTarget()));
		builder.append(" := ");
		builder.append(OutlineTextGenerator.getOutline(object.getInitial()));
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
		return "when";
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
	public String caseIfStatementTest(IfStatementTest object) {
		return "test";
	}

	@Override
	public String caseProcedureCallStatement(ProcedureCallStatement object) {
		StringBuilder builder = new StringBuilder();

		if (object.getLabel() != null) {
			builder.append(object.getLabel());
			builder.append(" : ");
		}

		builder.append(OutlineTextGenerator.getOutline(object.getProcedure()));
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
	public String caseProcessStatement(ProcessStatement object) {
		StringBuilder builder = new StringBuilder();
		if (object.getLabel() != null) {
			builder.append(object.getLabel());
			builder.append(" : ");
		}

		builder.append("process");
		builder.append("(");
		builder.append(OutlineTextGenerator.getOutline(object.getSensitivity()));
		builder.append(")");

		return builder.toString();
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
	public String caseBreakStatementItem(BreakStatementItem object) {
		return OutlineTextGenerator.getOutline(object.getName());
	}

	@Override
	public String caseComponentInstantiationStatement(
			ComponentInstantiationStatement object) {
		StringBuilder builder = new StringBuilder();
		if (object.getLabel() != null) {
			builder.append(object.getLabel());
			builder.append(" : ");
		}

		builder.append(OutlineTextGenerator.getOutline(object.getName()));
		return builder.toString();
	}

	@Override
	public String caseEntityInstantiationStatement(
			EntityInstantiationStatement object) {
		StringBuilder builder = new StringBuilder();
		if (object.getLabel() != null) {
			builder.append(object.getLabel());
			builder.append(" : ");
		}

		builder.append(OutlineTextGenerator.getOutline(object.getName()));
		return builder.toString();
	}

	@Override
	public String caseConfigurationInstantiationStatement(
			ConfigurationInstantiationStatement object) {
		StringBuilder builder = new StringBuilder();
		if (object.getLabel() != null) {
			builder.append(object.getLabel());
			builder.append(" : ");
		}

		builder.append(OutlineTextGenerator.getOutline(object.getName()));
		return builder.toString();
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

		builder.append(OutlineTextGenerator.getOutline(object.getExit()));
		return builder.toString();
	}

	@Override
	public String caseGenerateStatement(GenerateStatement object) {
		StringBuilder builder = new StringBuilder();
		if (object.getLabel() != null) {
			builder.append(object.getLabel());
			builder.append(" : ");
		}

		builder.append(OutlineTextGenerator.getOutline(object.getScheme()));
		return builder.toString();
	}

	@Override
	public String caseLoopStatement(LoopStatement object) {
		StringBuilder builder = new StringBuilder();
		if (object.getLabel() != null) {
			builder.append(object.getLabel());
			builder.append(" : ");
		}

		builder.append(OutlineTextGenerator.getOutline(object.getIteration()));
		return builder.toString();
	}

	@Override
	public String caseNextStatement(NextStatement object) {
		StringBuilder builder = new StringBuilder();
		if (object.getLabel() != null) {
			builder.append(object.getLabel());
			builder.append(" : ");
		}

		builder.append(OutlineTextGenerator.getOutline(object.getNext()));
		return builder.toString();
	}

	@Override
	public String caseConditionalWaveform(ConditionalWaveform object) {
		// TODO
		return "waveform";
	}

	@Override
	public String caseWhileIterationScheme(WhileIterationScheme object) {
		StringBuilder builder = new StringBuilder();
		builder.append("while ");
		builder.append(OutlineTextGenerator.getOutline(object.getCondition()));
		return builder.toString();
	}

	@Override
	public String caseForIterationScheme(ForIterationScheme object) {
		StringBuilder builder = new StringBuilder();
		builder.append("for ");
		builder.append(object.getVariable());
		builder.append(" in ");
		builder.append(OutlineTextGenerator.getOutline(object.getIn()));
		return builder.toString();
	}

	@Override
	public String caseForGenerationScheme(ForGenerationScheme object) {
		StringBuilder builder = new StringBuilder();
		builder.append("for ");
		builder.append(object.getVariable());
		builder.append(" in ");
		builder.append(OutlineTextGenerator.getOutline(object.getIn()));
		return builder.toString();
	}

	@Override
	public String caseIfGenerationScheme(IfGenerationScheme object) {
		return "if " + OutlineTextGenerator.getOutline(object.getCondition());
	}

	@Override
	public String caseDelayMechanism(DelayMechanism object) {
		return "delay";
	}

	@Override
	public String caseRejectMechanism(RejectMechanism object) {
		return "reject " + OutlineTextGenerator.getOutline(object.getReject());
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

		builder.append(OutlineTextGenerator.getOutline(object.getExpression()));
		return builder.toString();
	}

}
