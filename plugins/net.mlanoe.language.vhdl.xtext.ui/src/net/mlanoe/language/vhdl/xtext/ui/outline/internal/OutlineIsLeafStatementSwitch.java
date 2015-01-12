/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.xtext.ui.outline.internal;

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

/**
 * Outline "IsLeaf" for classes declared into the 'statement' package.
 * 
 * @author <a href="mailto:mickael.lanoe@laposte.net">Mickael LANOE</a>
 *
 */
public class OutlineIsLeafStatementSwitch extends StatementSwitch<Boolean> {

	@Override
	public Boolean caseWaitStatement(WaitStatement object) {
		return object.eContents().isEmpty();
	}

	@Override
	public Boolean caseReportStatement(ReportStatement object) {
		return object.getSeverity() == null;
	}

	@Override
	public Boolean caseReturnStatement(ReturnStatement object) {
		return true;
	}

	@Override
	public Boolean caseSequentialSignalAssignmentStatement(
			SequentialSignalAssignmentStatement object) {
		return true;
	}

	@Override
	public Boolean caseConditionalSignalAssignmentStatement(
			ConditionalSignalAssignmentStatement object) {
		return true;
	}

	@Override
	public Boolean caseSelectedSignalAssignmentStatement(
			SelectedSignalAssignmentStatement object) {
		return true;
	}

	@Override
	public Boolean caseVariableAssignmentStatement(
			VariableAssignmentStatement object) {
		return true;
	}

	@Override
	public Boolean caseSimultaneousCaseStatement(
			SimultaneousCaseStatement object) {
		return object.getWhen().isEmpty();
	}

	@Override
	public Boolean caseCaseStatement(CaseStatement object) {
		return object.getWhen().isEmpty();
	}

	@Override
	public Boolean caseCaseAlternative(CaseAlternative object) {
		return object.getStatement().isEmpty();
	}

	@Override
	public Boolean caseSimultaneousIfStatement(SimultaneousIfStatement object) {
		return object.eContents().isEmpty();
	}

	@Override
	public Boolean caseIfStatement(IfStatement object) {
		return object.eContents().isEmpty();
	}

	@Override
	public Boolean caseIfStatementTest(IfStatementTest object) {
		return object.getStatement().isEmpty();
	}

	@Override
	public Boolean caseProcedureCallStatement(ProcedureCallStatement object) {
		return true;
	}

	@Override
	public Boolean caseSimultaneousProceduralStatement(
			SimultaneousProceduralStatement object) {
		return true;
	}

	@Override
	public Boolean caseProcessStatement(ProcessStatement object) {
		return true;
	}

	@Override
	public Boolean caseAssertionStatement(AssertionStatement object) {
		return object.eContents().isEmpty();
	}

	@Override
	public Boolean caseBlockStatement(BlockStatement object) {
		return object.eContents().isEmpty();
	}

	@Override
	public Boolean caseBreakStatement(BreakStatement object) {
		return object.eContents().isEmpty();
	}

	@Override
	public Boolean caseBreakStatementItem(BreakStatementItem object) {
		return true;
	}

	@Override
	public Boolean caseComponentInstantiationStatement(
			ComponentInstantiationStatement object) {
		if (object.getGenericMap() != null
				&& !object.getGenericMap().getGeneric().isEmpty()) {
			return false;
		}

		if (object.getPortMap() != null
				&& !object.getPortMap().getPort().isEmpty()) {
			return false;
		}

		return true;
	}

	@Override
	public Boolean caseEntityInstantiationStatement(
			EntityInstantiationStatement object) {
		if (object.getGenericMap() != null
				&& !object.getGenericMap().getGeneric().isEmpty()) {
			return false;
		}

		if (object.getPortMap() != null
				&& !object.getPortMap().getPort().isEmpty()) {
			return false;
		}

		return true;
	}

	@Override
	public Boolean caseConfigurationInstantiationStatement(
			ConfigurationInstantiationStatement object) {
		if (object.getGenericMap() != null
				&& !object.getGenericMap().getGeneric().isEmpty()) {
			return false;
		}

		if (object.getPortMap() != null
				&& !object.getPortMap().getPort().isEmpty()) {
			return false;
		}

		return true;
	}

	@Override
	public Boolean caseSimpleSimultaneousStatement(
			SimpleSimultaneousStatement object) {
		return object.eContents().isEmpty();
	}

	@Override
	public Boolean caseExitStatement(ExitStatement object) {
		return object.eContents().isEmpty();
	}

	@Override
	public Boolean caseGenerateStatement(GenerateStatement object) {
		return true;
	}

	@Override
	public Boolean caseLoopStatement(LoopStatement object) {
		return true;
	}

	@Override
	public Boolean caseNextStatement(NextStatement object) {
		return true;
	}

	@Override
	public Boolean caseWhileIterationScheme(WhileIterationScheme object) {
		return true;
	}

	@Override
	public Boolean caseForIterationScheme(ForIterationScheme object) {
		return true;
	}

	@Override
	public Boolean caseForGenerationScheme(ForGenerationScheme object) {
		return true;
	}

	@Override
	public Boolean caseIfGenerationScheme(IfGenerationScheme object) {
		return true;
	}

	@Override
	public Boolean caseDelayMechanism(DelayMechanism object) {
		return true;
	}

	@Override
	public Boolean caseRejectMechanism(RejectMechanism object) {
		return true;
	}

	@Override
	public Boolean caseTransportMechanism(TransportMechanism object) {
		return true;
	}

	@Override
	public Boolean caseExpressionStatement(ExpressionStatement object) {
		return true;
	}

}
