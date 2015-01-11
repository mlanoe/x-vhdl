package net.mlanoe.language.vhdl.xtext.serializer;

import com.google.inject.Inject;
import java.util.List;
import net.mlanoe.language.vhdl.xtext.services.VhdlGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public abstract class AbstractVhdlSyntacticSequencer extends AbstractSyntacticSequencer {

	protected VhdlGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Architecture_ArchitectureKeyword_9_q;
	protected AbstractElementAlias match_Architecture_IdentifierParserRuleCall_10_q;
	protected AbstractElementAlias match_BlockStatement_IdentifierParserRuleCall_12_q;
	protected AbstractElementAlias match_BlockStatement_IsKeyword_4_q;
	protected AbstractElementAlias match_CaseStatement_IdentifierParserRuleCall_7_q;
	protected AbstractElementAlias match_ComponentConfiguration___UseKeyword_4_0_0_OpenKeyword_4_0_1_2__q;
	protected AbstractElementAlias match_ComponentConfiguration_____UseKeyword_4_0_0_OpenKeyword_4_0_1_2__q_SemicolonKeyword_4_3__q;
	protected AbstractElementAlias match_ComponentInstantiationStatement_ComponentKeyword_2_q;
	protected AbstractElementAlias match_Component_IdentifierParserRuleCall_7_q;
	protected AbstractElementAlias match_Component_IsKeyword_2_q;
	protected AbstractElementAlias match_ConfigurationSpecification___UseKeyword_4_0_OpenKeyword_4_1_2__q;
	protected AbstractElementAlias match_Configuration_ConfigurationKeyword_8_q;
	protected AbstractElementAlias match_Configuration_IdentifierParserRuleCall_9_q;
	protected AbstractElementAlias match_Entity_BeginKeyword_6_0_q;
	protected AbstractElementAlias match_Entity_EntityKeyword_8_q;
	protected AbstractElementAlias match_Entity_IdentifierParserRuleCall_9_q;
	protected AbstractElementAlias match_FileDeclaration_InKeyword_4_2_q;
	protected AbstractElementAlias match_GenerateStatement_BeginKeyword_4_1_q;
	protected AbstractElementAlias match_GenerateStatement_IdentifierParserRuleCall_8_q;
	protected AbstractElementAlias match_GroupTemplateDeclaration_LessThanSignGreaterThanSignKeyword_5_q;
	protected AbstractElementAlias match_GroupTemplateDeclaration_LessThanSignGreaterThanSignKeyword_6_2_q;
	protected AbstractElementAlias match_IfStatement_ElseKeyword_4_0_q;
	protected AbstractElementAlias match_IfStatement_IdentifierParserRuleCall_7_q;
	protected AbstractElementAlias match_IndexConstraint_RangeConstraint_LeftParenthesisKeyword_0_or_RangeKeyword_0;
	protected AbstractElementAlias match_InterfaceConstantDeclaration_ConstantKeyword_0_q;
	protected AbstractElementAlias match_InterfaceConstantDeclaration_InKeyword_3_q;
	protected AbstractElementAlias match_InterfaceSignalDeclaration_SignalKeyword_0_q;
	protected AbstractElementAlias match_InterfaceVariableDeclaration_VariableKeyword_0_q;
	protected AbstractElementAlias match_LoopStatement_IdentifierParserRuleCall_7_q;
	protected AbstractElementAlias match_PackageBody_IdentifierParserRuleCall_7_q;
	protected AbstractElementAlias match_PackageBody___PackageKeyword_6_0_BodyKeyword_6_1__q;
	protected AbstractElementAlias match_Package_IdentifierParserRuleCall_6_q;
	protected AbstractElementAlias match_Package_PackageKeyword_5_q;
	protected AbstractElementAlias match_PhysicalTypeDefinition_IdentifierParserRuleCall_6_q;
	protected AbstractElementAlias match_ProcessStatement_IdentifierParserRuleCall_12_q;
	protected AbstractElementAlias match_ProcessStatement_IsKeyword_5_q;
	protected AbstractElementAlias match_ProcessStatement_PostponedKeyword_10_q;
	protected AbstractElementAlias match_RecordNatureDefinition_IdentifierParserRuleCall_4_q;
	protected AbstractElementAlias match_RecordTypeDefinition_IdentifierParserRuleCall_4_q;
	protected AbstractElementAlias match_SimultaneousCaseStatement_IdentifierParserRuleCall_7_q;
	protected AbstractElementAlias match_SimultaneousIfStatement_ElseKeyword_5_0_q;
	protected AbstractElementAlias match_SimultaneousIfStatement_IdentifierParserRuleCall_8_q;
	protected AbstractElementAlias match_SimultaneousProceduralStatement_IdentifierParserRuleCall_9_q;
	protected AbstractElementAlias match_SimultaneousProceduralStatement_IsKeyword_3_q;
	protected AbstractElementAlias match_SubprogramBody_DesignatorParserRuleCall_7_q;
	protected AbstractElementAlias match_SubprogramBody___FunctionKeyword_6_1_or_ProcedureKeyword_6_0__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (VhdlGrammarAccess) access;
		match_Architecture_ArchitectureKeyword_9_q = new TokenAlias(false, true, grammarAccess.getArchitectureAccess().getArchitectureKeyword_9());
		match_Architecture_IdentifierParserRuleCall_10_q = new TokenAlias(false, true, grammarAccess.getArchitectureAccess().getIdentifierParserRuleCall_10());
		match_BlockStatement_IdentifierParserRuleCall_12_q = new TokenAlias(false, true, grammarAccess.getBlockStatementAccess().getIdentifierParserRuleCall_12());
		match_BlockStatement_IsKeyword_4_q = new TokenAlias(false, true, grammarAccess.getBlockStatementAccess().getIsKeyword_4());
		match_CaseStatement_IdentifierParserRuleCall_7_q = new TokenAlias(false, true, grammarAccess.getCaseStatementAccess().getIdentifierParserRuleCall_7());
		match_ComponentConfiguration___UseKeyword_4_0_0_OpenKeyword_4_0_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getComponentConfigurationAccess().getUseKeyword_4_0_0()), new TokenAlias(false, false, grammarAccess.getComponentConfigurationAccess().getOpenKeyword_4_0_1_2()));
		match_ComponentConfiguration_____UseKeyword_4_0_0_OpenKeyword_4_0_1_2__q_SemicolonKeyword_4_3__q = new GroupAlias(false, true, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getComponentConfigurationAccess().getUseKeyword_4_0_0()), new TokenAlias(false, false, grammarAccess.getComponentConfigurationAccess().getOpenKeyword_4_0_1_2())), new TokenAlias(false, false, grammarAccess.getComponentConfigurationAccess().getSemicolonKeyword_4_3()));
		match_ComponentInstantiationStatement_ComponentKeyword_2_q = new TokenAlias(false, true, grammarAccess.getComponentInstantiationStatementAccess().getComponentKeyword_2());
		match_Component_IdentifierParserRuleCall_7_q = new TokenAlias(false, true, grammarAccess.getComponentAccess().getIdentifierParserRuleCall_7());
		match_Component_IsKeyword_2_q = new TokenAlias(false, true, grammarAccess.getComponentAccess().getIsKeyword_2());
		match_ConfigurationSpecification___UseKeyword_4_0_OpenKeyword_4_1_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getConfigurationSpecificationAccess().getUseKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getConfigurationSpecificationAccess().getOpenKeyword_4_1_2()));
		match_Configuration_ConfigurationKeyword_8_q = new TokenAlias(false, true, grammarAccess.getConfigurationAccess().getConfigurationKeyword_8());
		match_Configuration_IdentifierParserRuleCall_9_q = new TokenAlias(false, true, grammarAccess.getConfigurationAccess().getIdentifierParserRuleCall_9());
		match_Entity_BeginKeyword_6_0_q = new TokenAlias(false, true, grammarAccess.getEntityAccess().getBeginKeyword_6_0());
		match_Entity_EntityKeyword_8_q = new TokenAlias(false, true, grammarAccess.getEntityAccess().getEntityKeyword_8());
		match_Entity_IdentifierParserRuleCall_9_q = new TokenAlias(false, true, grammarAccess.getEntityAccess().getIdentifierParserRuleCall_9());
		match_FileDeclaration_InKeyword_4_2_q = new TokenAlias(false, true, grammarAccess.getFileDeclarationAccess().getInKeyword_4_2());
		match_GenerateStatement_BeginKeyword_4_1_q = new TokenAlias(false, true, grammarAccess.getGenerateStatementAccess().getBeginKeyword_4_1());
		match_GenerateStatement_IdentifierParserRuleCall_8_q = new TokenAlias(false, true, grammarAccess.getGenerateStatementAccess().getIdentifierParserRuleCall_8());
		match_GroupTemplateDeclaration_LessThanSignGreaterThanSignKeyword_5_q = new TokenAlias(false, true, grammarAccess.getGroupTemplateDeclarationAccess().getLessThanSignGreaterThanSignKeyword_5());
		match_GroupTemplateDeclaration_LessThanSignGreaterThanSignKeyword_6_2_q = new TokenAlias(false, true, grammarAccess.getGroupTemplateDeclarationAccess().getLessThanSignGreaterThanSignKeyword_6_2());
		match_IfStatement_ElseKeyword_4_0_q = new TokenAlias(false, true, grammarAccess.getIfStatementAccess().getElseKeyword_4_0());
		match_IfStatement_IdentifierParserRuleCall_7_q = new TokenAlias(false, true, grammarAccess.getIfStatementAccess().getIdentifierParserRuleCall_7());
		match_IndexConstraint_RangeConstraint_LeftParenthesisKeyword_0_or_RangeKeyword_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getIndexConstraintAccess().getLeftParenthesisKeyword_0()), new TokenAlias(false, false, grammarAccess.getRangeConstraintAccess().getRangeKeyword_0()));
		match_InterfaceConstantDeclaration_ConstantKeyword_0_q = new TokenAlias(false, true, grammarAccess.getInterfaceConstantDeclarationAccess().getConstantKeyword_0());
		match_InterfaceConstantDeclaration_InKeyword_3_q = new TokenAlias(false, true, grammarAccess.getInterfaceConstantDeclarationAccess().getInKeyword_3());
		match_InterfaceSignalDeclaration_SignalKeyword_0_q = new TokenAlias(false, true, grammarAccess.getInterfaceSignalDeclarationAccess().getSignalKeyword_0());
		match_InterfaceVariableDeclaration_VariableKeyword_0_q = new TokenAlias(false, true, grammarAccess.getInterfaceVariableDeclarationAccess().getVariableKeyword_0());
		match_LoopStatement_IdentifierParserRuleCall_7_q = new TokenAlias(false, true, grammarAccess.getLoopStatementAccess().getIdentifierParserRuleCall_7());
		match_PackageBody_IdentifierParserRuleCall_7_q = new TokenAlias(false, true, grammarAccess.getPackageBodyAccess().getIdentifierParserRuleCall_7());
		match_PackageBody___PackageKeyword_6_0_BodyKeyword_6_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getPackageBodyAccess().getPackageKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getPackageBodyAccess().getBodyKeyword_6_1()));
		match_Package_IdentifierParserRuleCall_6_q = new TokenAlias(false, true, grammarAccess.getPackageAccess().getIdentifierParserRuleCall_6());
		match_Package_PackageKeyword_5_q = new TokenAlias(false, true, grammarAccess.getPackageAccess().getPackageKeyword_5());
		match_PhysicalTypeDefinition_IdentifierParserRuleCall_6_q = new TokenAlias(false, true, grammarAccess.getPhysicalTypeDefinitionAccess().getIdentifierParserRuleCall_6());
		match_ProcessStatement_IdentifierParserRuleCall_12_q = new TokenAlias(false, true, grammarAccess.getProcessStatementAccess().getIdentifierParserRuleCall_12());
		match_ProcessStatement_IsKeyword_5_q = new TokenAlias(false, true, grammarAccess.getProcessStatementAccess().getIsKeyword_5());
		match_ProcessStatement_PostponedKeyword_10_q = new TokenAlias(false, true, grammarAccess.getProcessStatementAccess().getPostponedKeyword_10());
		match_RecordNatureDefinition_IdentifierParserRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getRecordNatureDefinitionAccess().getIdentifierParserRuleCall_4());
		match_RecordTypeDefinition_IdentifierParserRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getRecordTypeDefinitionAccess().getIdentifierParserRuleCall_4());
		match_SimultaneousCaseStatement_IdentifierParserRuleCall_7_q = new TokenAlias(false, true, grammarAccess.getSimultaneousCaseStatementAccess().getIdentifierParserRuleCall_7());
		match_SimultaneousIfStatement_ElseKeyword_5_0_q = new TokenAlias(false, true, grammarAccess.getSimultaneousIfStatementAccess().getElseKeyword_5_0());
		match_SimultaneousIfStatement_IdentifierParserRuleCall_8_q = new TokenAlias(false, true, grammarAccess.getSimultaneousIfStatementAccess().getIdentifierParserRuleCall_8());
		match_SimultaneousProceduralStatement_IdentifierParserRuleCall_9_q = new TokenAlias(false, true, grammarAccess.getSimultaneousProceduralStatementAccess().getIdentifierParserRuleCall_9());
		match_SimultaneousProceduralStatement_IsKeyword_3_q = new TokenAlias(false, true, grammarAccess.getSimultaneousProceduralStatementAccess().getIsKeyword_3());
		match_SubprogramBody_DesignatorParserRuleCall_7_q = new TokenAlias(false, true, grammarAccess.getSubprogramBodyAccess().getDesignatorParserRuleCall_7());
		match_SubprogramBody___FunctionKeyword_6_1_or_ProcedureKeyword_6_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getSubprogramBodyAccess().getFunctionKeyword_6_1()), new TokenAlias(false, false, grammarAccess.getSubprogramBodyAccess().getProcedureKeyword_6_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getDesignatorRule())
			return getDesignatorToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIdentifierRule())
			return getIdentifierToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Designator:
	 *     Identifier
	 *   | STRING
	 * ;
	 */
	protected String getDesignatorToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * Identifier:
	 *     ID
	 *   | EXTENDED_IDENTIFIER
	 * ;
	 */
	protected String getIdentifierToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Architecture_ArchitectureKeyword_9_q.equals(syntax))
				emit_Architecture_ArchitectureKeyword_9_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Architecture_IdentifierParserRuleCall_10_q.equals(syntax))
				emit_Architecture_IdentifierParserRuleCall_10_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BlockStatement_IdentifierParserRuleCall_12_q.equals(syntax))
				emit_BlockStatement_IdentifierParserRuleCall_12_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_BlockStatement_IsKeyword_4_q.equals(syntax))
				emit_BlockStatement_IsKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CaseStatement_IdentifierParserRuleCall_7_q.equals(syntax))
				emit_CaseStatement_IdentifierParserRuleCall_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ComponentConfiguration___UseKeyword_4_0_0_OpenKeyword_4_0_1_2__q.equals(syntax))
				emit_ComponentConfiguration___UseKeyword_4_0_0_OpenKeyword_4_0_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ComponentConfiguration_____UseKeyword_4_0_0_OpenKeyword_4_0_1_2__q_SemicolonKeyword_4_3__q.equals(syntax))
				emit_ComponentConfiguration_____UseKeyword_4_0_0_OpenKeyword_4_0_1_2__q_SemicolonKeyword_4_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ComponentInstantiationStatement_ComponentKeyword_2_q.equals(syntax))
				emit_ComponentInstantiationStatement_ComponentKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Component_IdentifierParserRuleCall_7_q.equals(syntax))
				emit_Component_IdentifierParserRuleCall_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Component_IsKeyword_2_q.equals(syntax))
				emit_Component_IsKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ConfigurationSpecification___UseKeyword_4_0_OpenKeyword_4_1_2__q.equals(syntax))
				emit_ConfigurationSpecification___UseKeyword_4_0_OpenKeyword_4_1_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Configuration_ConfigurationKeyword_8_q.equals(syntax))
				emit_Configuration_ConfigurationKeyword_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Configuration_IdentifierParserRuleCall_9_q.equals(syntax))
				emit_Configuration_IdentifierParserRuleCall_9_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Entity_BeginKeyword_6_0_q.equals(syntax))
				emit_Entity_BeginKeyword_6_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Entity_EntityKeyword_8_q.equals(syntax))
				emit_Entity_EntityKeyword_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Entity_IdentifierParserRuleCall_9_q.equals(syntax))
				emit_Entity_IdentifierParserRuleCall_9_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FileDeclaration_InKeyword_4_2_q.equals(syntax))
				emit_FileDeclaration_InKeyword_4_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_GenerateStatement_BeginKeyword_4_1_q.equals(syntax))
				emit_GenerateStatement_BeginKeyword_4_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_GenerateStatement_IdentifierParserRuleCall_8_q.equals(syntax))
				emit_GenerateStatement_IdentifierParserRuleCall_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_GroupTemplateDeclaration_LessThanSignGreaterThanSignKeyword_5_q.equals(syntax))
				emit_GroupTemplateDeclaration_LessThanSignGreaterThanSignKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_GroupTemplateDeclaration_LessThanSignGreaterThanSignKeyword_6_2_q.equals(syntax))
				emit_GroupTemplateDeclaration_LessThanSignGreaterThanSignKeyword_6_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IfStatement_ElseKeyword_4_0_q.equals(syntax))
				emit_IfStatement_ElseKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IfStatement_IdentifierParserRuleCall_7_q.equals(syntax))
				emit_IfStatement_IdentifierParserRuleCall_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_IndexConstraint_RangeConstraint_LeftParenthesisKeyword_0_or_RangeKeyword_0.equals(syntax))
				emit_IndexConstraint_RangeConstraint_LeftParenthesisKeyword_0_or_RangeKeyword_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_InterfaceConstantDeclaration_ConstantKeyword_0_q.equals(syntax))
				emit_InterfaceConstantDeclaration_ConstantKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_InterfaceConstantDeclaration_InKeyword_3_q.equals(syntax))
				emit_InterfaceConstantDeclaration_InKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_InterfaceSignalDeclaration_SignalKeyword_0_q.equals(syntax))
				emit_InterfaceSignalDeclaration_SignalKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_InterfaceVariableDeclaration_VariableKeyword_0_q.equals(syntax))
				emit_InterfaceVariableDeclaration_VariableKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LoopStatement_IdentifierParserRuleCall_7_q.equals(syntax))
				emit_LoopStatement_IdentifierParserRuleCall_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PackageBody_IdentifierParserRuleCall_7_q.equals(syntax))
				emit_PackageBody_IdentifierParserRuleCall_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PackageBody___PackageKeyword_6_0_BodyKeyword_6_1__q.equals(syntax))
				emit_PackageBody___PackageKeyword_6_0_BodyKeyword_6_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Package_IdentifierParserRuleCall_6_q.equals(syntax))
				emit_Package_IdentifierParserRuleCall_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Package_PackageKeyword_5_q.equals(syntax))
				emit_Package_PackageKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PhysicalTypeDefinition_IdentifierParserRuleCall_6_q.equals(syntax))
				emit_PhysicalTypeDefinition_IdentifierParserRuleCall_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ProcessStatement_IdentifierParserRuleCall_12_q.equals(syntax))
				emit_ProcessStatement_IdentifierParserRuleCall_12_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ProcessStatement_IsKeyword_5_q.equals(syntax))
				emit_ProcessStatement_IsKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ProcessStatement_PostponedKeyword_10_q.equals(syntax))
				emit_ProcessStatement_PostponedKeyword_10_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RecordNatureDefinition_IdentifierParserRuleCall_4_q.equals(syntax))
				emit_RecordNatureDefinition_IdentifierParserRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_RecordTypeDefinition_IdentifierParserRuleCall_4_q.equals(syntax))
				emit_RecordTypeDefinition_IdentifierParserRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SimultaneousCaseStatement_IdentifierParserRuleCall_7_q.equals(syntax))
				emit_SimultaneousCaseStatement_IdentifierParserRuleCall_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SimultaneousIfStatement_ElseKeyword_5_0_q.equals(syntax))
				emit_SimultaneousIfStatement_ElseKeyword_5_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SimultaneousIfStatement_IdentifierParserRuleCall_8_q.equals(syntax))
				emit_SimultaneousIfStatement_IdentifierParserRuleCall_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SimultaneousProceduralStatement_IdentifierParserRuleCall_9_q.equals(syntax))
				emit_SimultaneousProceduralStatement_IdentifierParserRuleCall_9_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SimultaneousProceduralStatement_IsKeyword_3_q.equals(syntax))
				emit_SimultaneousProceduralStatement_IsKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SubprogramBody_DesignatorParserRuleCall_7_q.equals(syntax))
				emit_SubprogramBody_DesignatorParserRuleCall_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_SubprogramBody___FunctionKeyword_6_1_or_ProcedureKeyword_6_0__q.equals(syntax))
				emit_SubprogramBody___FunctionKeyword_6_1_or_ProcedureKeyword_6_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'architecture'?
	 */
	protected void emit_Architecture_ArchitectureKeyword_9_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Identifier?
	 */
	protected void emit_Architecture_IdentifierParserRuleCall_10_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Identifier?
	 */
	protected void emit_BlockStatement_IdentifierParserRuleCall_12_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'is'?
	 */
	protected void emit_BlockStatement_IsKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Identifier?
	 */
	protected void emit_CaseStatement_IdentifierParserRuleCall_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('use' 'open')?
	 */
	protected void emit_ComponentConfiguration___UseKeyword_4_0_0_OpenKeyword_4_0_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (('use' 'open')? ';')?
	 */
	protected void emit_ComponentConfiguration_____UseKeyword_4_0_0_OpenKeyword_4_0_1_2__q_SemicolonKeyword_4_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'component'?
	 */
	protected void emit_ComponentInstantiationStatement_ComponentKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Identifier?
	 */
	protected void emit_Component_IdentifierParserRuleCall_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'is'?
	 */
	protected void emit_Component_IsKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('use' 'open')?
	 */
	protected void emit_ConfigurationSpecification___UseKeyword_4_0_OpenKeyword_4_1_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'configuration'?
	 */
	protected void emit_Configuration_ConfigurationKeyword_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Identifier?
	 */
	protected void emit_Configuration_IdentifierParserRuleCall_9_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'begin'?
	 */
	protected void emit_Entity_BeginKeyword_6_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'entity'?
	 */
	protected void emit_Entity_EntityKeyword_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Identifier?
	 */
	protected void emit_Entity_IdentifierParserRuleCall_9_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'in'?
	 */
	protected void emit_FileDeclaration_InKeyword_4_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'begin'?
	 */
	protected void emit_GenerateStatement_BeginKeyword_4_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Identifier?
	 */
	protected void emit_GenerateStatement_IdentifierParserRuleCall_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '<>'?
	 */
	protected void emit_GroupTemplateDeclaration_LessThanSignGreaterThanSignKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '<>'?
	 */
	protected void emit_GroupTemplateDeclaration_LessThanSignGreaterThanSignKeyword_6_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'else'?
	 */
	protected void emit_IfStatement_ElseKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Identifier?
	 */
	protected void emit_IfStatement_IdentifierParserRuleCall_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '(' | 'range'
	 */
	protected void emit_IndexConstraint_RangeConstraint_LeftParenthesisKeyword_0_or_RangeKeyword_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'constant'?
	 */
	protected void emit_InterfaceConstantDeclaration_ConstantKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'in'?
	 */
	protected void emit_InterfaceConstantDeclaration_InKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'signal'?
	 */
	protected void emit_InterfaceSignalDeclaration_SignalKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'variable'?
	 */
	protected void emit_InterfaceVariableDeclaration_VariableKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Identifier?
	 */
	protected void emit_LoopStatement_IdentifierParserRuleCall_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Identifier?
	 */
	protected void emit_PackageBody_IdentifierParserRuleCall_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('package' 'body')?
	 */
	protected void emit_PackageBody___PackageKeyword_6_0_BodyKeyword_6_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Identifier?
	 */
	protected void emit_Package_IdentifierParserRuleCall_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'package'?
	 */
	protected void emit_Package_PackageKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Identifier?
	 */
	protected void emit_PhysicalTypeDefinition_IdentifierParserRuleCall_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Identifier?
	 */
	protected void emit_ProcessStatement_IdentifierParserRuleCall_12_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'is'?
	 */
	protected void emit_ProcessStatement_IsKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'postponed'?
	 */
	protected void emit_ProcessStatement_PostponedKeyword_10_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Identifier?
	 */
	protected void emit_RecordNatureDefinition_IdentifierParserRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Identifier?
	 */
	protected void emit_RecordTypeDefinition_IdentifierParserRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Identifier?
	 */
	protected void emit_SimultaneousCaseStatement_IdentifierParserRuleCall_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'else'?
	 */
	protected void emit_SimultaneousIfStatement_ElseKeyword_5_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Identifier?
	 */
	protected void emit_SimultaneousIfStatement_IdentifierParserRuleCall_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Identifier?
	 */
	protected void emit_SimultaneousProceduralStatement_IdentifierParserRuleCall_9_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'is'?
	 */
	protected void emit_SimultaneousProceduralStatement_IsKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Designator?
	 */
	protected void emit_SubprogramBody_DesignatorParserRuleCall_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('procedure' | 'function')?
	 */
	protected void emit_SubprogramBody___FunctionKeyword_6_1_or_ProcedureKeyword_6_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
