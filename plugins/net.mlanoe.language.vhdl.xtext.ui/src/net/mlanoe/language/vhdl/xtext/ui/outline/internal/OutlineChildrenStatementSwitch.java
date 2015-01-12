/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.xtext.ui.outline.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

import org.eclipse.emf.ecore.EObject;

/**
 * Outline children for classes declared into the 'statement' package.
 * 
 * @author <a href="mailto:mickael.lanoe@laposte.net">Mickael LANOE</a>
 *
 */
public class OutlineChildrenStatementSwitch extends
		StatementSwitch<Iterable<? extends EObject>> {

	@Override
	public Iterable<? extends EObject> caseWaitStatement(WaitStatement object) {
		return object.eContents();
	}

	@Override
	public Iterable<? extends EObject> caseReportStatement(
			ReportStatement object) {
		return Collections.singletonList(object.getSeverity());
	}

	@Override
	public Iterable<? extends EObject> caseReturnStatement(
			ReturnStatement object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseSequentialSignalAssignmentStatement(
			SequentialSignalAssignmentStatement object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseConditionalSignalAssignmentStatement(
			ConditionalSignalAssignmentStatement object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseSelectedSignalAssignmentStatement(
			SelectedSignalAssignmentStatement object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseVariableAssignmentStatement(
			VariableAssignmentStatement object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseSimultaneousCaseStatement(
			SimultaneousCaseStatement object) {
		return object.getWhen();
	}

	@Override
	public Iterable<? extends EObject> caseCaseStatement(CaseStatement object) {
		return object.getWhen();
	}

	@Override
	public Iterable<? extends EObject> caseCaseAlternative(
			CaseAlternative object) {
		return object.getStatement();
	}

	@Override
	public Iterable<? extends EObject> caseSimultaneousIfStatement(
			SimultaneousIfStatement object) {
		return object.eContents();
	}

	@Override
	public Iterable<? extends EObject> caseIfStatement(IfStatement object) {
		return object.eContents();
	}

	@Override
	public Iterable<? extends EObject> caseIfStatementTest(
			IfStatementTest object) {
		return object.getStatement();
	}

	@Override
	public Iterable<? extends EObject> caseProcedureCallStatement(
			ProcedureCallStatement object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseSimultaneousProceduralStatement(
			SimultaneousProceduralStatement object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseProcessStatement(
			ProcessStatement object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseAssertionStatement(
			AssertionStatement object) {
		return object.eContents();
	}

	@Override
	public Iterable<? extends EObject> caseBlockStatement(BlockStatement object) {
		return object.eContents();
	}

	@Override
	public Iterable<? extends EObject> caseBreakStatement(BreakStatement object) {
		return object.eContents();
	}

	@Override
	public Iterable<? extends EObject> caseBreakStatementItem(
			BreakStatementItem object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseComponentInstantiationStatement(
			ComponentInstantiationStatement object) {
		List<EObject> res = new ArrayList<EObject>();
		if (object.getGenericMap() != null) {
			res.add(object.getGenericMap());
		}

		if (object.getPortMap() != null) {
			res.add(object.getPortMap());
		}

		return res;
	}

	@Override
	public Iterable<? extends EObject> caseEntityInstantiationStatement(
			EntityInstantiationStatement object) {
		List<EObject> res = new ArrayList<EObject>();
		if (object.getGenericMap() != null) {
			res.add(object.getGenericMap());
		}

		if (object.getPortMap() != null) {
			res.add(object.getPortMap());
		}

		return res;
	}

	@Override
	public Iterable<? extends EObject> caseConfigurationInstantiationStatement(
			ConfigurationInstantiationStatement object) {
		List<EObject> res = new ArrayList<EObject>();
		if (object.getGenericMap() != null) {
			res.add(object.getGenericMap());
		}

		if (object.getPortMap() != null) {
			res.add(object.getPortMap());
		}

		return res;
	}

	@Override
	public Iterable<? extends EObject> caseSimpleSimultaneousStatement(
			SimpleSimultaneousStatement object) {
		return object.eContents();
	}

	@Override
	public Iterable<? extends EObject> caseExitStatement(ExitStatement object) {
		return object.eContents();
	}

	@Override
	public Iterable<? extends EObject> caseGenerateStatement(
			GenerateStatement object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseLoopStatement(LoopStatement object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseNextStatement(NextStatement object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseWhileIterationScheme(
			WhileIterationScheme object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseForIterationScheme(
			ForIterationScheme object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseForGenerationScheme(
			ForGenerationScheme object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseIfGenerationScheme(
			IfGenerationScheme object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseDelayMechanism(DelayMechanism object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseRejectMechanism(
			RejectMechanism object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseTransportMechanism(
			TransportMechanism object) {
		return Collections.emptyList();
	}

	@Override
	public Iterable<? extends EObject> caseExpressionStatement(
			ExpressionStatement object) {
		return Collections.emptyList();
	}

}
