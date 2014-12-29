package net.mlanoe.language.vhdl.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import net.mlanoe.language.vhdl.Architecture;
import net.mlanoe.language.vhdl.Component;
import net.mlanoe.language.vhdl.DesignUnit;
import net.mlanoe.language.vhdl.Entity;
import net.mlanoe.language.vhdl.GenericMaps;
import net.mlanoe.language.vhdl.Generics;
import net.mlanoe.language.vhdl.Model;
import net.mlanoe.language.vhdl.NameList;
import net.mlanoe.language.vhdl.PackageBody;
import net.mlanoe.language.vhdl.PortMaps;
import net.mlanoe.language.vhdl.Ports;
import net.mlanoe.language.vhdl.Signature;
import net.mlanoe.language.vhdl.VhdlPackage;
import net.mlanoe.language.vhdl.ams.AmsPackage;
import net.mlanoe.language.vhdl.ams.Noise;
import net.mlanoe.language.vhdl.ams.QuantityAspect;
import net.mlanoe.language.vhdl.ams.Spectrum;
import net.mlanoe.language.vhdl.configuration.BlockConfiguration;
import net.mlanoe.language.vhdl.configuration.ComponentConfiguration;
import net.mlanoe.language.vhdl.configuration.Configuration;
import net.mlanoe.language.vhdl.configuration.ConfigurationPackage;
import net.mlanoe.language.vhdl.declaration.AliasDeclaration;
import net.mlanoe.language.vhdl.declaration.AttributeDeclaration;
import net.mlanoe.language.vhdl.declaration.AttributeSpecification;
import net.mlanoe.language.vhdl.declaration.BranchQuantityDeclaration;
import net.mlanoe.language.vhdl.declaration.ConfigurationSpecification;
import net.mlanoe.language.vhdl.declaration.ConstantDeclaration;
import net.mlanoe.language.vhdl.declaration.DeclarationPackage;
import net.mlanoe.language.vhdl.declaration.DisconnectionSpecification;
import net.mlanoe.language.vhdl.declaration.FileDeclaration;
import net.mlanoe.language.vhdl.declaration.FreeQuantityDeclaration;
import net.mlanoe.language.vhdl.declaration.FunctionDeclaration;
import net.mlanoe.language.vhdl.declaration.GroupDeclaration;
import net.mlanoe.language.vhdl.declaration.GroupTemplateDeclaration;
import net.mlanoe.language.vhdl.declaration.LimitDeclaration;
import net.mlanoe.language.vhdl.declaration.NatureDeclaration;
import net.mlanoe.language.vhdl.declaration.ProcedureDeclaration;
import net.mlanoe.language.vhdl.declaration.SignalDeclaration;
import net.mlanoe.language.vhdl.declaration.SourceQuantityDeclaration;
import net.mlanoe.language.vhdl.declaration.SubnatureDeclaration;
import net.mlanoe.language.vhdl.declaration.SubprogramBody;
import net.mlanoe.language.vhdl.declaration.SubtypeDeclaration;
import net.mlanoe.language.vhdl.declaration.TerminalDeclaration;
import net.mlanoe.language.vhdl.declaration.TypeDeclaration;
import net.mlanoe.language.vhdl.declaration.UseClauseDeclaration;
import net.mlanoe.language.vhdl.declaration.VariableDeclaration;
import net.mlanoe.language.vhdl.expression.AddingExpression;
import net.mlanoe.language.vhdl.expression.AggregateExpression;
import net.mlanoe.language.vhdl.expression.AllExpression;
import net.mlanoe.language.vhdl.expression.AllocatorExpression;
import net.mlanoe.language.vhdl.expression.AssociationExpression;
import net.mlanoe.language.vhdl.expression.AttributeExpression;
import net.mlanoe.language.vhdl.expression.BitStringExpression;
import net.mlanoe.language.vhdl.expression.CharacterExpression;
import net.mlanoe.language.vhdl.expression.ExpressionPackage;
import net.mlanoe.language.vhdl.expression.IdentifierExpression;
import net.mlanoe.language.vhdl.expression.LogicalExpression;
import net.mlanoe.language.vhdl.expression.MultiExpression;
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
import net.mlanoe.language.vhdl.expression.UnaryExpression;
import net.mlanoe.language.vhdl.expression.UnitValueExpression;
import net.mlanoe.language.vhdl.expression.ValueExpression;
import net.mlanoe.language.vhdl.expression.WaveformExpression;
import net.mlanoe.language.vhdl.nature.ConstrainedArrayNatureDefinition;
import net.mlanoe.language.vhdl.nature.NaturePackage;
import net.mlanoe.language.vhdl.nature.RecordNatureDefinition;
import net.mlanoe.language.vhdl.nature.RecordNatureElement;
import net.mlanoe.language.vhdl.nature.ScalarNatureDefinition;
import net.mlanoe.language.vhdl.nature.UnconstrainedArrayNatureDefinition;
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
import net.mlanoe.language.vhdl.statement.StatementPackage;
import net.mlanoe.language.vhdl.statement.TransportMechanism;
import net.mlanoe.language.vhdl.statement.VariableAssignmentStatement;
import net.mlanoe.language.vhdl.statement.WaitStatement;
import net.mlanoe.language.vhdl.statement.WhileIterationScheme;
import net.mlanoe.language.vhdl.type.AccessTypeDefinition;
import net.mlanoe.language.vhdl.type.ConstrainedArrayTypeDefinition;
import net.mlanoe.language.vhdl.type.EnumerationTypeDefinition;
import net.mlanoe.language.vhdl.type.FileTypeDefinition;
import net.mlanoe.language.vhdl.type.PhysicalTypeDefinition;
import net.mlanoe.language.vhdl.type.PhysicalTypeDefinitionSecondary;
import net.mlanoe.language.vhdl.type.RangeTypeDefinition;
import net.mlanoe.language.vhdl.type.RecordTypeDefinition;
import net.mlanoe.language.vhdl.type.RecordTypeElement;
import net.mlanoe.language.vhdl.type.TypePackage;
import net.mlanoe.language.vhdl.type.UnconstrainedArrayTypeDefinition;
import net.mlanoe.language.vhdl.xtext.services.VhdlGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public abstract class AbstractVhdlSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private VhdlGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AmsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AmsPackage.NOISE:
				if(context == grammarAccess.getNoiseRule() ||
				   context == grammarAccess.getSourceAspectRule()) {
					sequence_Noise(context, (Noise) semanticObject); 
					return; 
				}
				else break;
			case AmsPackage.QUANTITY_ASPECT:
				if(context == grammarAccess.getQuantityAspectRule()) {
					sequence_QuantityAspect(context, (QuantityAspect) semanticObject); 
					return; 
				}
				else break;
			case AmsPackage.SPECTRUM:
				if(context == grammarAccess.getSourceAspectRule() ||
				   context == grammarAccess.getSpectrumRule()) {
					sequence_Spectrum(context, (Spectrum) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == ConfigurationPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ConfigurationPackage.BLOCK_CONFIGURATION:
				if(context == grammarAccess.getBlockConfigurationRule() ||
				   context == grammarAccess.getConfigurationItemRule()) {
					sequence_BlockConfiguration(context, (BlockConfiguration) semanticObject); 
					return; 
				}
				else break;
			case ConfigurationPackage.COMPONENT_CONFIGURATION:
				if(context == grammarAccess.getComponentConfigurationRule() ||
				   context == grammarAccess.getConfigurationItemRule()) {
					sequence_ComponentConfiguration(context, (ComponentConfiguration) semanticObject); 
					return; 
				}
				else break;
			case ConfigurationPackage.CONFIGURATION:
				if(context == grammarAccess.getConfigurationRule() ||
				   context == grammarAccess.getModuleRule()) {
					sequence_Configuration(context, (Configuration) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == DeclarationPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DeclarationPackage.ALIAS_DECLARATION:
				if(context == grammarAccess.getAliasDeclarationRule() ||
				   context == grammarAccess.getBlockDeclarativeItemRule() ||
				   context == grammarAccess.getEntityDeclarativeItemRule() ||
				   context == grammarAccess.getPackageBodyDeclarativeItemRule() ||
				   context == grammarAccess.getPackageDeclarativeItemRule() ||
				   context == grammarAccess.getProceduralDeclarativeItemRule() ||
				   context == grammarAccess.getProcessDeclarativeItemRule() ||
				   context == grammarAccess.getSubprogramDeclarativeItemRule()) {
					sequence_AliasDeclaration(context, (AliasDeclaration) semanticObject); 
					return; 
				}
				else break;
			case DeclarationPackage.ATTRIBUTE_DECLARATION:
				if(context == grammarAccess.getAttributeDeclarationRule() ||
				   context == grammarAccess.getBlockDeclarativeItemRule() ||
				   context == grammarAccess.getEntityDeclarativeItemRule() ||
				   context == grammarAccess.getPackageDeclarativeItemRule() ||
				   context == grammarAccess.getProceduralDeclarativeItemRule() ||
				   context == grammarAccess.getProcessDeclarativeItemRule() ||
				   context == grammarAccess.getSubprogramDeclarativeItemRule()) {
					sequence_AttributeDeclaration(context, (AttributeDeclaration) semanticObject); 
					return; 
				}
				else break;
			case DeclarationPackage.ATTRIBUTE_SPECIFICATION:
				if(context == grammarAccess.getAttributeSpecificationRule() ||
				   context == grammarAccess.getBlockDeclarativeItemRule() ||
				   context == grammarAccess.getConfigurationDeclarativeItemRule() ||
				   context == grammarAccess.getEntityDeclarativeItemRule() ||
				   context == grammarAccess.getPackageDeclarativeItemRule() ||
				   context == grammarAccess.getProceduralDeclarativeItemRule() ||
				   context == grammarAccess.getProcessDeclarativeItemRule() ||
				   context == grammarAccess.getSubprogramDeclarativeItemRule()) {
					sequence_AttributeSpecification(context, (AttributeSpecification) semanticObject); 
					return; 
				}
				else break;
			case DeclarationPackage.BRANCH_QUANTITY_DECLARATION:
				if(context == grammarAccess.getBlockDeclarativeItemRule() ||
				   context == grammarAccess.getBranchQuantityDeclarationRule() ||
				   context == grammarAccess.getEntityDeclarativeItemRule() ||
				   context == grammarAccess.getQuantityDeclarationRule()) {
					sequence_BranchQuantityDeclaration(context, (BranchQuantityDeclaration) semanticObject); 
					return; 
				}
				else break;
			case DeclarationPackage.CONFIGURATION_SPECIFICATION:
				if(context == grammarAccess.getBlockDeclarativeItemRule() ||
				   context == grammarAccess.getConfigurationSpecificationRule()) {
					sequence_ConfigurationSpecification(context, (ConfigurationSpecification) semanticObject); 
					return; 
				}
				else break;
			case DeclarationPackage.CONSTANT_DECLARATION:
				if(context == grammarAccess.getBlockDeclarativeItemRule() ||
				   context == grammarAccess.getConstantDeclarationRule() ||
				   context == grammarAccess.getEntityDeclarativeItemRule() ||
				   context == grammarAccess.getPackageBodyDeclarativeItemRule() ||
				   context == grammarAccess.getPackageDeclarativeItemRule() ||
				   context == grammarAccess.getProceduralDeclarativeItemRule() ||
				   context == grammarAccess.getProcessDeclarativeItemRule() ||
				   context == grammarAccess.getSubprogramDeclarativeItemRule()) {
					sequence_ConstantDeclaration(context, (ConstantDeclaration) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFunctionParameterDeclarationRule() ||
				   context == grammarAccess.getGenericDeclarationRule() ||
				   context == grammarAccess.getInterfaceConstantDeclarationRule() ||
				   context == grammarAccess.getProcedureParameterDeclarationRule()) {
					sequence_InterfaceConstantDeclaration(context, (ConstantDeclaration) semanticObject); 
					return; 
				}
				else break;
			case DeclarationPackage.DISCONNECTION_SPECIFICATION:
				if(context == grammarAccess.getBlockDeclarativeItemRule() ||
				   context == grammarAccess.getDisconnectionSpecificationRule() ||
				   context == grammarAccess.getEntityDeclarativeItemRule() ||
				   context == grammarAccess.getPackageDeclarativeItemRule()) {
					sequence_DisconnectionSpecification(context, (DisconnectionSpecification) semanticObject); 
					return; 
				}
				else break;
			case DeclarationPackage.FILE_DECLARATION:
				if(context == grammarAccess.getBlockDeclarativeItemRule() ||
				   context == grammarAccess.getEntityDeclarativeItemRule() ||
				   context == grammarAccess.getFileDeclarationRule() ||
				   context == grammarAccess.getPackageBodyDeclarativeItemRule() ||
				   context == grammarAccess.getPackageDeclarativeItemRule() ||
				   context == grammarAccess.getProcessDeclarativeItemRule() ||
				   context == grammarAccess.getSubprogramDeclarativeItemRule()) {
					sequence_FileDeclaration(context, (FileDeclaration) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getFunctionParameterDeclarationRule() ||
				   context == grammarAccess.getInterfaceFileDeclarationRule() ||
				   context == grammarAccess.getProcedureParameterDeclarationRule()) {
					sequence_InterfaceFileDeclaration(context, (FileDeclaration) semanticObject); 
					return; 
				}
				else break;
			case DeclarationPackage.FREE_QUANTITY_DECLARATION:
				if(context == grammarAccess.getBlockDeclarativeItemRule() ||
				   context == grammarAccess.getEntityDeclarativeItemRule() ||
				   context == grammarAccess.getFreeQuantityDeclarationRule() ||
				   context == grammarAccess.getQuantityDeclarationRule()) {
					sequence_FreeQuantityDeclaration(context, (FreeQuantityDeclaration) semanticObject); 
					return; 
				}
				else break;
			case DeclarationPackage.FUNCTION_DECLARATION:
				if(context == grammarAccess.getBlockDeclarativeItemRule() ||
				   context == grammarAccess.getEntityDeclarativeItemRule() ||
				   context == grammarAccess.getFunctionDeclarationRule() ||
				   context == grammarAccess.getPackageBodyDeclarativeItemRule() ||
				   context == grammarAccess.getPackageDeclarativeItemRule() ||
				   context == grammarAccess.getProceduralDeclarativeItemRule() ||
				   context == grammarAccess.getProcessDeclarativeItemRule() ||
				   context == grammarAccess.getSubprogramDeclarationRule() ||
				   context == grammarAccess.getSubprogramDeclarativeItemRule()) {
					sequence_FunctionDeclaration(context, (FunctionDeclaration) semanticObject); 
					return; 
				}
				else break;
			case DeclarationPackage.GROUP_DECLARATION:
				if(context == grammarAccess.getBlockDeclarativeItemRule() ||
				   context == grammarAccess.getConfigurationDeclarativeItemRule() ||
				   context == grammarAccess.getEntityDeclarativeItemRule() ||
				   context == grammarAccess.getGroupDeclarationRule() ||
				   context == grammarAccess.getPackageBodyDeclarativeItemRule() ||
				   context == grammarAccess.getPackageDeclarativeItemRule() ||
				   context == grammarAccess.getProceduralDeclarativeItemRule() ||
				   context == grammarAccess.getProcessDeclarativeItemRule() ||
				   context == grammarAccess.getSubprogramDeclarativeItemRule()) {
					sequence_GroupDeclaration(context, (GroupDeclaration) semanticObject); 
					return; 
				}
				else break;
			case DeclarationPackage.GROUP_TEMPLATE_DECLARATION:
				if(context == grammarAccess.getBlockDeclarativeItemRule() ||
				   context == grammarAccess.getEntityDeclarativeItemRule() ||
				   context == grammarAccess.getGroupTemplateDeclarationRule() ||
				   context == grammarAccess.getPackageBodyDeclarativeItemRule() ||
				   context == grammarAccess.getPackageDeclarativeItemRule() ||
				   context == grammarAccess.getProceduralDeclarativeItemRule() ||
				   context == grammarAccess.getProcessDeclarativeItemRule() ||
				   context == grammarAccess.getSubprogramDeclarativeItemRule()) {
					sequence_GroupTemplateDeclaration(context, (GroupTemplateDeclaration) semanticObject); 
					return; 
				}
				else break;
			case DeclarationPackage.LIMIT_DECLARATION:
				if(context == grammarAccess.getBlockDeclarativeItemRule() ||
				   context == grammarAccess.getEntityDeclarativeItemRule() ||
				   context == grammarAccess.getLimitDeclarationRule()) {
					sequence_LimitDeclaration(context, (LimitDeclaration) semanticObject); 
					return; 
				}
				else break;
			case DeclarationPackage.NATURE_DECLARATION:
				if(context == grammarAccess.getBlockDeclarativeItemRule() ||
				   context == grammarAccess.getEntityDeclarativeItemRule() ||
				   context == grammarAccess.getNatureDeclarationRule() ||
				   context == grammarAccess.getPackageDeclarativeItemRule()) {
					sequence_NatureDeclaration(context, (NatureDeclaration) semanticObject); 
					return; 
				}
				else break;
			case DeclarationPackage.PROCEDURE_DECLARATION:
				if(context == grammarAccess.getBlockDeclarativeItemRule() ||
				   context == grammarAccess.getEntityDeclarativeItemRule() ||
				   context == grammarAccess.getPackageBodyDeclarativeItemRule() ||
				   context == grammarAccess.getPackageDeclarativeItemRule() ||
				   context == grammarAccess.getProceduralDeclarativeItemRule() ||
				   context == grammarAccess.getProcedureDeclarationRule() ||
				   context == grammarAccess.getProcessDeclarativeItemRule() ||
				   context == grammarAccess.getSubprogramDeclarationRule() ||
				   context == grammarAccess.getSubprogramDeclarativeItemRule()) {
					sequence_ProcedureDeclaration(context, (ProcedureDeclaration) semanticObject); 
					return; 
				}
				else break;
			case DeclarationPackage.SIGNAL_DECLARATION:
				if(context == grammarAccess.getFunctionParameterDeclarationRule() ||
				   context == grammarAccess.getInterfaceSignalDeclarationRule() ||
				   context == grammarAccess.getPortDeclarationRule() ||
				   context == grammarAccess.getProcedureParameterDeclarationRule()) {
					sequence_InterfaceSignalDeclaration(context, (SignalDeclaration) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getBlockDeclarativeItemRule() ||
				   context == grammarAccess.getEntityDeclarativeItemRule() ||
				   context == grammarAccess.getPackageDeclarativeItemRule() ||
				   context == grammarAccess.getSignalDeclarationRule()) {
					sequence_SignalDeclaration(context, (SignalDeclaration) semanticObject); 
					return; 
				}
				else break;
			case DeclarationPackage.SOURCE_QUANTITY_DECLARATION:
				if(context == grammarAccess.getBlockDeclarativeItemRule() ||
				   context == grammarAccess.getEntityDeclarativeItemRule() ||
				   context == grammarAccess.getQuantityDeclarationRule() ||
				   context == grammarAccess.getSourceQuantityDeclarationRule()) {
					sequence_SourceQuantityDeclaration(context, (SourceQuantityDeclaration) semanticObject); 
					return; 
				}
				else break;
			case DeclarationPackage.SUBNATURE_DECLARATION:
				if(context == grammarAccess.getBlockDeclarativeItemRule() ||
				   context == grammarAccess.getEntityDeclarativeItemRule() ||
				   context == grammarAccess.getPackageDeclarativeItemRule() ||
				   context == grammarAccess.getSubnatureDeclarationRule()) {
					sequence_SubnatureDeclaration(context, (SubnatureDeclaration) semanticObject); 
					return; 
				}
				else break;
			case DeclarationPackage.SUBPROGRAM_BODY:
				if(context == grammarAccess.getSubprogramBodyRule()) {
					sequence_SubprogramBody(context, (SubprogramBody) semanticObject); 
					return; 
				}
				else break;
			case DeclarationPackage.SUBTYPE_DECLARATION:
				if(context == grammarAccess.getBlockDeclarativeItemRule() ||
				   context == grammarAccess.getEntityDeclarativeItemRule() ||
				   context == grammarAccess.getPackageBodyDeclarativeItemRule() ||
				   context == grammarAccess.getPackageDeclarativeItemRule() ||
				   context == grammarAccess.getProceduralDeclarativeItemRule() ||
				   context == grammarAccess.getProcessDeclarativeItemRule() ||
				   context == grammarAccess.getSubprogramDeclarativeItemRule() ||
				   context == grammarAccess.getSubtypeDeclarationRule()) {
					sequence_SubtypeDeclaration(context, (SubtypeDeclaration) semanticObject); 
					return; 
				}
				else break;
			case DeclarationPackage.TERMINAL_DECLARATION:
				if(context == grammarAccess.getBlockDeclarativeItemRule() ||
				   context == grammarAccess.getEntityDeclarativeItemRule() ||
				   context == grammarAccess.getPackageDeclarativeItemRule() ||
				   context == grammarAccess.getTerminalDeclarationRule()) {
					sequence_TerminalDeclaration(context, (TerminalDeclaration) semanticObject); 
					return; 
				}
				else break;
			case DeclarationPackage.TYPE_DECLARATION:
				if(context == grammarAccess.getBlockDeclarativeItemRule() ||
				   context == grammarAccess.getEntityDeclarativeItemRule() ||
				   context == grammarAccess.getPackageBodyDeclarativeItemRule() ||
				   context == grammarAccess.getPackageDeclarativeItemRule() ||
				   context == grammarAccess.getProceduralDeclarativeItemRule() ||
				   context == grammarAccess.getProcessDeclarativeItemRule() ||
				   context == grammarAccess.getSubprogramDeclarativeItemRule() ||
				   context == grammarAccess.getTypeDeclarationRule()) {
					sequence_TypeDeclaration(context, (TypeDeclaration) semanticObject); 
					return; 
				}
				else break;
			case DeclarationPackage.USE_CLAUSE_DECLARATION:
				if(context == grammarAccess.getBlockDeclarativeItemRule() ||
				   context == grammarAccess.getConfigurationDeclarativeItemRule() ||
				   context == grammarAccess.getEntityDeclarativeItemRule() ||
				   context == grammarAccess.getPackageBodyDeclarativeItemRule() ||
				   context == grammarAccess.getPackageDeclarativeItemRule() ||
				   context == grammarAccess.getProceduralDeclarativeItemRule() ||
				   context == grammarAccess.getProcessDeclarativeItemRule() ||
				   context == grammarAccess.getSubprogramDeclarativeItemRule() ||
				   context == grammarAccess.getUseClauseDeclarationRule()) {
					sequence_UseClauseDeclaration(context, (UseClauseDeclaration) semanticObject); 
					return; 
				}
				else break;
			case DeclarationPackage.VARIABLE_DECLARATION:
				if(context == grammarAccess.getFunctionParameterDeclarationRule() ||
				   context == grammarAccess.getInterfaceVariableDeclarationRule() ||
				   context == grammarAccess.getProcedureParameterDeclarationRule()) {
					sequence_InterfaceVariableDeclaration(context, (VariableDeclaration) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getBlockDeclarativeItemRule() ||
				   context == grammarAccess.getEntityDeclarativeItemRule() ||
				   context == grammarAccess.getPackageBodyDeclarativeItemRule() ||
				   context == grammarAccess.getPackageDeclarativeItemRule() ||
				   context == grammarAccess.getProceduralDeclarativeItemRule() ||
				   context == grammarAccess.getProcessDeclarativeItemRule() ||
				   context == grammarAccess.getSubprogramDeclarativeItemRule() ||
				   context == grammarAccess.getVariableDeclarationRule()) {
					sequence_VariableDeclaration(context, (VariableDeclaration) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == ExpressionPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ExpressionPackage.ADDING_EXPRESSION:
				if(context == grammarAccess.getChoiceRule() ||
				   context == grammarAccess.getChoicesRule() ||
				   context == grammarAccess.getChoicesAccess().getMultiExpressionExpressionAction_1_0() ||
				   context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getLogicalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getParameterRule() ||
				   context == grammarAccess.getRangeRule() ||
				   context == grammarAccess.getRangeConstraintRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getShiftExpressionRule() ||
				   context == grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule() ||
				   context == grammarAccess.getWaveformRule() ||
				   context == grammarAccess.getWaveformAccess().getWaveformExpressionExpressionAction_1_0()) {
					sequence_SimpleExpression(context, (AddingExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSimpleExpressionAccess().getAddingExpressionLeftAction_0_1_0()) {
					sequence_SimpleExpression_AddingExpression_0_1_0(context, (AddingExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSimpleExpressionAccess().getAddingExpressionLeftAction_1_1_0()) {
					sequence_SimpleExpression_AddingExpression_1_1_0(context, (AddingExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.AGGREGATE_EXPRESSION:
				if(context == grammarAccess.getAggregateRule() ||
				   context == grammarAccess.getChoiceRule() ||
				   context == grammarAccess.getChoicesRule() ||
				   context == grammarAccess.getChoicesAccess().getMultiExpressionExpressionAction_1_0() ||
				   context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getLogicalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getFactorRule() ||
				   context == grammarAccess.getFactorAccess().getPowerExpressionLeftAction_0_1_0() ||
				   context == grammarAccess.getNameSuffixRule() ||
				   context == grammarAccess.getParameterRule() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getRangeRule() ||
				   context == grammarAccess.getRangeConstraintRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getShiftExpressionRule() ||
				   context == grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule() ||
				   context == grammarAccess.getSimpleExpressionAccess().getAddingExpressionLeftAction_0_1_0() ||
				   context == grammarAccess.getTargetRule() ||
				   context == grammarAccess.getTermExpressionRule() ||
				   context == grammarAccess.getTermExpressionAccess().getMultiplyingExpressionLeftAction_1_0() ||
				   context == grammarAccess.getWaveformRule() ||
				   context == grammarAccess.getWaveformAccess().getWaveformExpressionExpressionAction_1_0()) {
					sequence_Aggregate(context, (AggregateExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.ALL_EXPRESSION:
				if(context == grammarAccess.getAllRule() ||
				   context == grammarAccess.getAttributeEntityRule() ||
				   context == grammarAccess.getAttributeEntityDesignatorRule() ||
				   context == grammarAccess.getAttributeEntityAccess().getNameListNameAction_1_0() ||
				   context == grammarAccess.getChoiceRule() ||
				   context == grammarAccess.getChoicesRule() ||
				   context == grammarAccess.getChoicesAccess().getMultiExpressionExpressionAction_1_0() ||
				   context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getDiscreteRangeRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getLogicalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getFactorRule() ||
				   context == grammarAccess.getFactorAccess().getPowerExpressionLeftAction_0_1_0() ||
				   context == grammarAccess.getGroupConstituentRule() ||
				   context == grammarAccess.getGroupConstituentsRule() ||
				   context == grammarAccess.getGroupConstituentsAccess().getNameListNameAction_1_0() ||
				   context == grammarAccess.getIndexConstraintRule() ||
				   context == grammarAccess.getIndexConstraintAccess().getMultiExpressionExpressionAction_2_0() ||
				   context == grammarAccess.getInstantiationListRule() ||
				   context == grammarAccess.getMultiNameRule() ||
				   context == grammarAccess.getMultiNameAccess().getNameListNameAction_1_0() ||
				   context == grammarAccess.getNameRule() ||
				   context == grammarAccess.getNameExpressionRule() ||
				   context == grammarAccess.getNamePrefixRule() ||
				   context == grammarAccess.getNamePrefixExpressionRule() ||
				   context == grammarAccess.getNameSignatureRule() ||
				   context == grammarAccess.getNameSignatureAccess().getSignatureExpressionNameAction_1_0() ||
				   context == grammarAccess.getNameSuffixRule() ||
				   context == grammarAccess.getNameAccess().getNameExpressionElementAction_1_0() ||
				   context == grammarAccess.getParameterRule() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getRangeRule() ||
				   context == grammarAccess.getRangeConstraintRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSelectedNameRule() ||
				   context == grammarAccess.getShiftExpressionRule() ||
				   context == grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule() ||
				   context == grammarAccess.getSimpleExpressionAccess().getAddingExpressionLeftAction_0_1_0() ||
				   context == grammarAccess.getSubnatureIndicationRule() ||
				   context == grammarAccess.getSubtypeIndicationRule() ||
				   context == grammarAccess.getSubtypeIndicationExpressionRule() ||
				   context == grammarAccess.getTargetRule() ||
				   context == grammarAccess.getTermExpressionRule() ||
				   context == grammarAccess.getTermExpressionAccess().getMultiplyingExpressionLeftAction_1_0() ||
				   context == grammarAccess.getWaveformRule() ||
				   context == grammarAccess.getWaveformAccess().getWaveformExpressionExpressionAction_1_0()) {
					sequence_All(context, (AllExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.ALLOCATOR_EXPRESSION:
				if(context == grammarAccess.getAllocatorExpressionRule() ||
				   context == grammarAccess.getChoiceRule() ||
				   context == grammarAccess.getChoicesRule() ||
				   context == grammarAccess.getChoicesAccess().getMultiExpressionExpressionAction_1_0() ||
				   context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getLogicalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getFactorRule() ||
				   context == grammarAccess.getFactorAccess().getPowerExpressionLeftAction_0_1_0() ||
				   context == grammarAccess.getParameterRule() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getRangeRule() ||
				   context == grammarAccess.getRangeConstraintRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getShiftExpressionRule() ||
				   context == grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule() ||
				   context == grammarAccess.getSimpleExpressionAccess().getAddingExpressionLeftAction_0_1_0() ||
				   context == grammarAccess.getTermExpressionRule() ||
				   context == grammarAccess.getTermExpressionAccess().getMultiplyingExpressionLeftAction_1_0() ||
				   context == grammarAccess.getWaveformRule() ||
				   context == grammarAccess.getWaveformAccess().getWaveformExpressionExpressionAction_1_0()) {
					sequence_AllocatorExpression(context, (AllocatorExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.ASSOCIATION_EXPRESSION:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (AssociationExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.ATTRIBUTE_EXPRESSION:
				if(context == grammarAccess.getAttributeNameRule() ||
				   context == grammarAccess.getNameSuffixRule()) {
					sequence_AttributeName(context, (AttributeExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.BIT_STRING_EXPRESSION:
				if(context == grammarAccess.getBitStringNameRule() ||
				   context == grammarAccess.getChoiceRule() ||
				   context == grammarAccess.getChoicesRule() ||
				   context == grammarAccess.getChoicesAccess().getMultiExpressionExpressionAction_1_0() ||
				   context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getLogicalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getFactorRule() ||
				   context == grammarAccess.getFactorAccess().getPowerExpressionLeftAction_0_1_0() ||
				   context == grammarAccess.getParameterRule() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getRangeRule() ||
				   context == grammarAccess.getRangeConstraintRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getShiftExpressionRule() ||
				   context == grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule() ||
				   context == grammarAccess.getSimpleExpressionAccess().getAddingExpressionLeftAction_0_1_0() ||
				   context == grammarAccess.getTermExpressionRule() ||
				   context == grammarAccess.getTermExpressionAccess().getMultiplyingExpressionLeftAction_1_0() ||
				   context == grammarAccess.getWaveformRule() ||
				   context == grammarAccess.getWaveformAccess().getWaveformExpressionExpressionAction_1_0()) {
					sequence_BitStringName(context, (BitStringExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.CHARACTER_EXPRESSION:
				if(context == grammarAccess.getAttributeEntityRule() ||
				   context == grammarAccess.getAttributeEntityDesignatorRule() ||
				   context == grammarAccess.getAttributeEntityDesignatorAccess().getSignatureExpressionNameAction_1_1_0() ||
				   context == grammarAccess.getAttributeEntityAccess().getNameListNameAction_1_0() ||
				   context == grammarAccess.getCharacterNameRule() ||
				   context == grammarAccess.getChoiceRule() ||
				   context == grammarAccess.getChoicesRule() ||
				   context == grammarAccess.getChoicesAccess().getMultiExpressionExpressionAction_1_0() ||
				   context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getEnumerationLiteralRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getLogicalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getFactorRule() ||
				   context == grammarAccess.getFactorAccess().getPowerExpressionLeftAction_0_1_0() ||
				   context == grammarAccess.getGroupConstituentRule() ||
				   context == grammarAccess.getGroupConstituentsRule() ||
				   context == grammarAccess.getGroupConstituentsAccess().getNameListNameAction_1_0() ||
				   context == grammarAccess.getNameSuffixRule() ||
				   context == grammarAccess.getParameterRule() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getRangeRule() ||
				   context == grammarAccess.getRangeConstraintRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSelectedNameRule() ||
				   context == grammarAccess.getShiftExpressionRule() ||
				   context == grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule() ||
				   context == grammarAccess.getSimpleExpressionAccess().getAddingExpressionLeftAction_0_1_0() ||
				   context == grammarAccess.getTermExpressionRule() ||
				   context == grammarAccess.getTermExpressionAccess().getMultiplyingExpressionLeftAction_1_0() ||
				   context == grammarAccess.getWaveformRule() ||
				   context == grammarAccess.getWaveformAccess().getWaveformExpressionExpressionAction_1_0()) {
					sequence_CharacterName(context, (CharacterExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.IDENTIFIER_EXPRESSION:
				if(context == grammarAccess.getAttributeDesignatorRule()) {
					sequence_AttributeDesignator_IdentifierName(context, (IdentifierExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAttributeEntityRule() ||
				   context == grammarAccess.getAttributeEntityDesignatorRule() ||
				   context == grammarAccess.getAttributeEntityDesignatorAccess().getSignatureExpressionNameAction_0_1_0() ||
				   context == grammarAccess.getAttributeEntityAccess().getNameListNameAction_1_0() ||
				   context == grammarAccess.getChoiceRule() ||
				   context == grammarAccess.getChoicesRule() ||
				   context == grammarAccess.getChoicesAccess().getMultiExpressionExpressionAction_1_0() ||
				   context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getDesignatorNameRule() ||
				   context == grammarAccess.getDiscreteRangeRule() ||
				   context == grammarAccess.getEnumerationLiteralRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getLogicalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getFactorRule() ||
				   context == grammarAccess.getFactorAccess().getPowerExpressionLeftAction_0_1_0() ||
				   context == grammarAccess.getGroupConstituentRule() ||
				   context == grammarAccess.getGroupConstituentsRule() ||
				   context == grammarAccess.getGroupConstituentsAccess().getNameListNameAction_1_0() ||
				   context == grammarAccess.getIdentifierNameRule() ||
				   context == grammarAccess.getIndexConstraintRule() ||
				   context == grammarAccess.getIndexConstraintAccess().getMultiExpressionExpressionAction_2_0() ||
				   context == grammarAccess.getInstantiationListRule() ||
				   context == grammarAccess.getMultiIdentifierNameRule() ||
				   context == grammarAccess.getMultiIdentifierNameAccess().getNameListNameAction_1_0() ||
				   context == grammarAccess.getMultiNameRule() ||
				   context == grammarAccess.getMultiNameAccess().getNameListNameAction_1_0() ||
				   context == grammarAccess.getNameRule() ||
				   context == grammarAccess.getNameExpressionRule() ||
				   context == grammarAccess.getNamePrefixRule() ||
				   context == grammarAccess.getNamePrefixExpressionRule() ||
				   context == grammarAccess.getNameSignatureRule() ||
				   context == grammarAccess.getNameSignatureAccess().getSignatureExpressionNameAction_1_0() ||
				   context == grammarAccess.getNameSuffixRule() ||
				   context == grammarAccess.getNameAccess().getNameExpressionElementAction_1_0() ||
				   context == grammarAccess.getParameterRule() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getRangeRule() ||
				   context == grammarAccess.getRangeConstraintRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSelectedNameRule() ||
				   context == grammarAccess.getShiftExpressionRule() ||
				   context == grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule() ||
				   context == grammarAccess.getSimpleExpressionAccess().getAddingExpressionLeftAction_0_1_0() ||
				   context == grammarAccess.getSubnatureIndicationRule() ||
				   context == grammarAccess.getSubtypeIndicationRule() ||
				   context == grammarAccess.getSubtypeIndicationExpressionRule() ||
				   context == grammarAccess.getTargetRule() ||
				   context == grammarAccess.getTermExpressionRule() ||
				   context == grammarAccess.getTermExpressionAccess().getMultiplyingExpressionLeftAction_1_0() ||
				   context == grammarAccess.getWaveformRule() ||
				   context == grammarAccess.getWaveformAccess().getWaveformExpressionExpressionAction_1_0()) {
					sequence_IdentifierName(context, (IdentifierExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.LOGICAL_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getLogicalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getParameterRule() ||
				   context == grammarAccess.getWaveformRule() ||
				   context == grammarAccess.getWaveformAccess().getWaveformExpressionExpressionAction_1_0()) {
					sequence_Expression(context, (LogicalExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.MULTI_EXPRESSION:
				if(context == grammarAccess.getChoicesRule()) {
					sequence_Choices(context, (MultiExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getIndexConstraintRule()) {
					sequence_IndexConstraint(context, (MultiExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.MULTIPLYING_EXPRESSION:
				if(context == grammarAccess.getSignTermExpressionRule() ||
				   context == grammarAccess.getSignTermExpressionAccess().getMultiplyingExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionAccess().getAddingExpressionLeftAction_1_1_0()) {
					sequence_SignTermExpression(context, (MultiplyingExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getChoiceRule() ||
				   context == grammarAccess.getChoicesRule() ||
				   context == grammarAccess.getChoicesAccess().getMultiExpressionExpressionAction_1_0() ||
				   context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getLogicalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getParameterRule() ||
				   context == grammarAccess.getRangeRule() ||
				   context == grammarAccess.getRangeConstraintRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getShiftExpressionRule() ||
				   context == grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule() ||
				   context == grammarAccess.getWaveformRule() ||
				   context == grammarAccess.getWaveformAccess().getWaveformExpressionExpressionAction_1_0()) {
					sequence_SignTermExpression_TermExpression(context, (MultiplyingExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSimpleExpressionAccess().getAddingExpressionLeftAction_0_1_0() ||
				   context == grammarAccess.getTermExpressionRule() ||
				   context == grammarAccess.getTermExpressionAccess().getMultiplyingExpressionLeftAction_1_0()) {
					sequence_TermExpression(context, (MultiplyingExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.NAME_EXPRESSION:
				if(context == grammarAccess.getChoiceRule() ||
				   context == grammarAccess.getChoicesRule() ||
				   context == grammarAccess.getChoicesAccess().getMultiExpressionExpressionAction_1_0() ||
				   context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getDiscreteRangeRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getLogicalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getFactorRule() ||
				   context == grammarAccess.getFactorAccess().getPowerExpressionLeftAction_0_1_0() ||
				   context == grammarAccess.getIndexConstraintRule() ||
				   context == grammarAccess.getIndexConstraintAccess().getMultiExpressionExpressionAction_2_0() ||
				   context == grammarAccess.getNameExpressionRule() ||
				   context == grammarAccess.getParameterRule() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getRangeRule() ||
				   context == grammarAccess.getRangeConstraintRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getShiftExpressionRule() ||
				   context == grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule() ||
				   context == grammarAccess.getSimpleExpressionAccess().getAddingExpressionLeftAction_0_1_0() ||
				   context == grammarAccess.getSubtypeIndicationExpressionRule() ||
				   context == grammarAccess.getTargetRule() ||
				   context == grammarAccess.getTermExpressionRule() ||
				   context == grammarAccess.getTermExpressionAccess().getMultiplyingExpressionLeftAction_1_0() ||
				   context == grammarAccess.getWaveformRule() ||
				   context == grammarAccess.getWaveformAccess().getWaveformExpressionExpressionAction_1_0()) {
					sequence_NameExpression(context, (NameExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getGroupConstituentRule() ||
				   context == grammarAccess.getGroupConstituentsRule() ||
				   context == grammarAccess.getGroupConstituentsAccess().getNameListNameAction_1_0() ||
				   context == grammarAccess.getMultiNameRule() ||
				   context == grammarAccess.getMultiNameAccess().getNameListNameAction_1_0() ||
				   context == grammarAccess.getNameRule() ||
				   context == grammarAccess.getNameSignatureRule() ||
				   context == grammarAccess.getNameSignatureAccess().getSignatureExpressionNameAction_1_0() ||
				   context == grammarAccess.getSubnatureIndicationRule() ||
				   context == grammarAccess.getSubtypeIndicationRule()) {
					sequence_Name(context, (NameExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.NULL_EXPRESSION:
				if(context == grammarAccess.getChoiceRule() ||
				   context == grammarAccess.getChoicesRule() ||
				   context == grammarAccess.getChoicesAccess().getMultiExpressionExpressionAction_1_0() ||
				   context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getLogicalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getFactorRule() ||
				   context == grammarAccess.getFactorAccess().getPowerExpressionLeftAction_0_1_0() ||
				   context == grammarAccess.getNullExpressionRule() ||
				   context == grammarAccess.getParameterRule() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getRangeRule() ||
				   context == grammarAccess.getRangeConstraintRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getShiftExpressionRule() ||
				   context == grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule() ||
				   context == grammarAccess.getSimpleExpressionAccess().getAddingExpressionLeftAction_0_1_0() ||
				   context == grammarAccess.getTermExpressionRule() ||
				   context == grammarAccess.getTermExpressionAccess().getMultiplyingExpressionLeftAction_1_0() ||
				   context == grammarAccess.getWaveformRule() ||
				   context == grammarAccess.getWaveformAccess().getWaveformExpressionExpressionAction_1_0()) {
					sequence_NullExpression(context, (NullExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.OPEN_EXPRESSION:
				if(context == grammarAccess.getOpenRule() ||
				   context == grammarAccess.getParameterRule()) {
					sequence_Open(context, (OpenExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.OTHERS_EXPRESSION:
				if(context == grammarAccess.getAttributeEntityRule() ||
				   context == grammarAccess.getAttributeEntityDesignatorRule() ||
				   context == grammarAccess.getAttributeEntityAccess().getNameListNameAction_1_0() ||
				   context == grammarAccess.getChoiceRule() ||
				   context == grammarAccess.getChoicesRule() ||
				   context == grammarAccess.getChoicesAccess().getMultiExpressionExpressionAction_1_0() ||
				   context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getDiscreteRangeRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getLogicalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getFactorRule() ||
				   context == grammarAccess.getFactorAccess().getPowerExpressionLeftAction_0_1_0() ||
				   context == grammarAccess.getGroupConstituentRule() ||
				   context == grammarAccess.getGroupConstituentsRule() ||
				   context == grammarAccess.getGroupConstituentsAccess().getNameListNameAction_1_0() ||
				   context == grammarAccess.getIndexConstraintRule() ||
				   context == grammarAccess.getIndexConstraintAccess().getMultiExpressionExpressionAction_2_0() ||
				   context == grammarAccess.getInstantiationListRule() ||
				   context == grammarAccess.getMultiNameRule() ||
				   context == grammarAccess.getMultiNameAccess().getNameListNameAction_1_0() ||
				   context == grammarAccess.getNameRule() ||
				   context == grammarAccess.getNameExpressionRule() ||
				   context == grammarAccess.getNamePrefixRule() ||
				   context == grammarAccess.getNamePrefixExpressionRule() ||
				   context == grammarAccess.getNameSignatureRule() ||
				   context == grammarAccess.getNameSignatureAccess().getSignatureExpressionNameAction_1_0() ||
				   context == grammarAccess.getNameAccess().getNameExpressionElementAction_1_0() ||
				   context == grammarAccess.getOthersRule() ||
				   context == grammarAccess.getParameterRule() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getRangeRule() ||
				   context == grammarAccess.getRangeConstraintRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getShiftExpressionRule() ||
				   context == grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule() ||
				   context == grammarAccess.getSimpleExpressionAccess().getAddingExpressionLeftAction_0_1_0() ||
				   context == grammarAccess.getSubnatureIndicationRule() ||
				   context == grammarAccess.getSubtypeIndicationRule() ||
				   context == grammarAccess.getSubtypeIndicationExpressionRule() ||
				   context == grammarAccess.getTargetRule() ||
				   context == grammarAccess.getTermExpressionRule() ||
				   context == grammarAccess.getTermExpressionAccess().getMultiplyingExpressionLeftAction_1_0() ||
				   context == grammarAccess.getWaveformRule() ||
				   context == grammarAccess.getWaveformAccess().getWaveformExpressionExpressionAction_1_0()) {
					sequence_Others(context, (OthersExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.POWER_EXPRESSION:
				if(context == grammarAccess.getFactorRule() ||
				   context == grammarAccess.getSimpleExpressionAccess().getAddingExpressionLeftAction_0_1_0() ||
				   context == grammarAccess.getTermExpressionRule() ||
				   context == grammarAccess.getTermExpressionAccess().getMultiplyingExpressionLeftAction_1_0()) {
					sequence_Factor(context, (PowerExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getChoiceRule() ||
				   context == grammarAccess.getChoicesRule() ||
				   context == grammarAccess.getChoicesAccess().getMultiExpressionExpressionAction_1_0() ||
				   context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getLogicalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getParameterRule() ||
				   context == grammarAccess.getRangeRule() ||
				   context == grammarAccess.getRangeConstraintRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getShiftExpressionRule() ||
				   context == grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule() ||
				   context == grammarAccess.getWaveformRule() ||
				   context == grammarAccess.getWaveformAccess().getWaveformExpressionExpressionAction_1_0()) {
					sequence_Factor_SignFactor(context, (PowerExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSignFactorRule() ||
				   context == grammarAccess.getSignTermExpressionRule() ||
				   context == grammarAccess.getSignTermExpressionAccess().getMultiplyingExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionAccess().getAddingExpressionLeftAction_1_1_0()) {
					sequence_SignFactor(context, (PowerExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.RANGE_EXPRESSION:
				if(context == grammarAccess.getChoiceRule() ||
				   context == grammarAccess.getChoicesRule() ||
				   context == grammarAccess.getChoicesAccess().getMultiExpressionExpressionAction_1_0() ||
				   context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getDiscreteRangeRule() ||
				   context == grammarAccess.getIndexConstraintRule() ||
				   context == grammarAccess.getIndexConstraintAccess().getMultiExpressionExpressionAction_2_0() ||
				   context == grammarAccess.getNameSuffixRule() ||
				   context == grammarAccess.getRangeRule() ||
				   context == grammarAccess.getRangeConstraintRule() ||
				   context == grammarAccess.getRangeSpecificationRule() ||
				   context == grammarAccess.getSliceNameRule()) {
					sequence_RangeSpecification(context, (RangeExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.RELATIONAL_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getLogicalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getParameterRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getWaveformRule() ||
				   context == grammarAccess.getWaveformAccess().getWaveformExpressionExpressionAction_1_0()) {
					sequence_Relation(context, (RelationalExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.SHIFT_EXPRESSION:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getLogicalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getParameterRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getShiftExpressionRule() ||
				   context == grammarAccess.getWaveformRule() ||
				   context == grammarAccess.getWaveformAccess().getWaveformExpressionExpressionAction_1_0()) {
					sequence_ShiftExpression(context, (ShiftExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.SIGN_EXPRESSION:
				if(context == grammarAccess.getSignFactorAccess().getPowerExpressionLeftAction_0_1_0() ||
				   context == grammarAccess.getSignPrimaryRule()) {
					sequence_SignPrimary(context, (SignExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getChoiceRule() ||
				   context == grammarAccess.getChoicesRule() ||
				   context == grammarAccess.getChoicesAccess().getMultiExpressionExpressionAction_1_0() ||
				   context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getLogicalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getParameterRule() ||
				   context == grammarAccess.getRangeRule() ||
				   context == grammarAccess.getRangeConstraintRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getShiftExpressionRule() ||
				   context == grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSignFactorRule() ||
				   context == grammarAccess.getSignTermExpressionRule() ||
				   context == grammarAccess.getSignTermExpressionAccess().getMultiplyingExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule() ||
				   context == grammarAccess.getSimpleExpressionAccess().getAddingExpressionLeftAction_1_1_0() ||
				   context == grammarAccess.getWaveformRule() ||
				   context == grammarAccess.getWaveformAccess().getWaveformExpressionExpressionAction_1_0()) {
					sequence_SignPrimary_SignUnaryExpression(context, (SignExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSignUnaryExpressionRule()) {
					sequence_SignUnaryExpression(context, (SignExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.SIGNATURE_EXPRESSION:
				if(context == grammarAccess.getAttributeEntityRule() ||
				   context == grammarAccess.getAttributeEntityDesignatorRule() ||
				   context == grammarAccess.getAttributeEntityAccess().getNameListNameAction_1_0()) {
					sequence_AttributeEntityDesignator(context, (SignatureExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getNameSignatureRule()) {
					sequence_NameSignature(context, (SignatureExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.STRING_EXPRESSION:
				if(context == grammarAccess.getAttributeEntityRule() ||
				   context == grammarAccess.getAttributeEntityDesignatorRule() ||
				   context == grammarAccess.getAttributeEntityDesignatorAccess().getSignatureExpressionNameAction_2_1_0() ||
				   context == grammarAccess.getAttributeEntityAccess().getNameListNameAction_1_0() ||
				   context == grammarAccess.getChoiceRule() ||
				   context == grammarAccess.getChoicesRule() ||
				   context == grammarAccess.getChoicesAccess().getMultiExpressionExpressionAction_1_0() ||
				   context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getDesignatorNameRule() ||
				   context == grammarAccess.getDiscreteRangeRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getLogicalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getFactorRule() ||
				   context == grammarAccess.getFactorAccess().getPowerExpressionLeftAction_0_1_0() ||
				   context == grammarAccess.getGroupConstituentRule() ||
				   context == grammarAccess.getGroupConstituentsRule() ||
				   context == grammarAccess.getGroupConstituentsAccess().getNameListNameAction_1_0() ||
				   context == grammarAccess.getIndexConstraintRule() ||
				   context == grammarAccess.getIndexConstraintAccess().getMultiExpressionExpressionAction_2_0() ||
				   context == grammarAccess.getMultiNameRule() ||
				   context == grammarAccess.getMultiNameAccess().getNameListNameAction_1_0() ||
				   context == grammarAccess.getNameRule() ||
				   context == grammarAccess.getNameExpressionRule() ||
				   context == grammarAccess.getNamePrefixRule() ||
				   context == grammarAccess.getNamePrefixExpressionRule() ||
				   context == grammarAccess.getNameSignatureRule() ||
				   context == grammarAccess.getNameSignatureAccess().getSignatureExpressionNameAction_1_0() ||
				   context == grammarAccess.getNameSuffixRule() ||
				   context == grammarAccess.getNameAccess().getNameExpressionElementAction_1_0() ||
				   context == grammarAccess.getParameterRule() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getRangeRule() ||
				   context == grammarAccess.getRangeConstraintRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSelectedNameRule() ||
				   context == grammarAccess.getShiftExpressionRule() ||
				   context == grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule() ||
				   context == grammarAccess.getSimpleExpressionAccess().getAddingExpressionLeftAction_0_1_0() ||
				   context == grammarAccess.getStringNameRule() ||
				   context == grammarAccess.getSubnatureIndicationRule() ||
				   context == grammarAccess.getSubtypeIndicationRule() ||
				   context == grammarAccess.getSubtypeIndicationExpressionRule() ||
				   context == grammarAccess.getTargetRule() ||
				   context == grammarAccess.getTermExpressionRule() ||
				   context == grammarAccess.getTermExpressionAccess().getMultiplyingExpressionLeftAction_1_0() ||
				   context == grammarAccess.getWaveformRule() ||
				   context == grammarAccess.getWaveformAccess().getWaveformExpressionExpressionAction_1_0()) {
					sequence_StringName(context, (StringExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.SUBNATURE_INDICATION_EXPRESSION:
				if(context == grammarAccess.getSubnatureIndicationRule()) {
					sequence_SubnatureIndication(context, (SubnatureIndicationExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.SUBTYPE_INDICATION_EXPRESSION:
				if(context == grammarAccess.getChoiceRule() ||
				   context == grammarAccess.getChoicesRule() ||
				   context == grammarAccess.getChoicesAccess().getMultiExpressionExpressionAction_1_0() ||
				   context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getDiscreteRangeRule() ||
				   context == grammarAccess.getIndexConstraintRule() ||
				   context == grammarAccess.getIndexConstraintAccess().getMultiExpressionExpressionAction_2_0() ||
				   context == grammarAccess.getSubtypeIndicationExpressionRule()) {
					sequence_SubtypeIndicationExpression(context, (SubtypeIndicationExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSubtypeIndicationRule()) {
					sequence_SubtypeIndication(context, (SubtypeIndicationExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.UNARY_EXPRESSION:
				if(context == grammarAccess.getChoiceRule() ||
				   context == grammarAccess.getChoicesRule() ||
				   context == grammarAccess.getChoicesAccess().getMultiExpressionExpressionAction_1_0() ||
				   context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getLogicalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getFactorRule() ||
				   context == grammarAccess.getParameterRule() ||
				   context == grammarAccess.getRangeRule() ||
				   context == grammarAccess.getRangeConstraintRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getShiftExpressionRule() ||
				   context == grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule() ||
				   context == grammarAccess.getSimpleExpressionAccess().getAddingExpressionLeftAction_0_1_0() ||
				   context == grammarAccess.getTermExpressionRule() ||
				   context == grammarAccess.getTermExpressionAccess().getMultiplyingExpressionLeftAction_1_0() ||
				   context == grammarAccess.getUnaryExpressionRule() ||
				   context == grammarAccess.getWaveformRule() ||
				   context == grammarAccess.getWaveformAccess().getWaveformExpressionExpressionAction_1_0()) {
					sequence_UnaryExpression(context, (UnaryExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.UNIT_VALUE_EXPRESSION:
				if(context == grammarAccess.getChoiceRule() ||
				   context == grammarAccess.getChoicesRule() ||
				   context == grammarAccess.getChoicesAccess().getMultiExpressionExpressionAction_1_0() ||
				   context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getLogicalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getFactorRule() ||
				   context == grammarAccess.getFactorAccess().getPowerExpressionLeftAction_0_1_0() ||
				   context == grammarAccess.getParameterRule() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getRangeRule() ||
				   context == grammarAccess.getRangeConstraintRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getShiftExpressionRule() ||
				   context == grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule() ||
				   context == grammarAccess.getSimpleExpressionAccess().getAddingExpressionLeftAction_0_1_0() ||
				   context == grammarAccess.getTermExpressionRule() ||
				   context == grammarAccess.getTermExpressionAccess().getMultiplyingExpressionLeftAction_1_0() ||
				   context == grammarAccess.getValueExpressionRule() ||
				   context == grammarAccess.getWaveformRule() ||
				   context == grammarAccess.getWaveformAccess().getWaveformExpressionExpressionAction_1_0()) {
					sequence_ValueExpression(context, (UnitValueExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.VALUE_EXPRESSION:
				if(context == grammarAccess.getChoiceRule() ||
				   context == grammarAccess.getChoicesRule() ||
				   context == grammarAccess.getChoicesAccess().getMultiExpressionExpressionAction_1_0() ||
				   context == grammarAccess.getConstraintRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getExpressionAccess().getLogicalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getFactorRule() ||
				   context == grammarAccess.getFactorAccess().getPowerExpressionLeftAction_0_1_0() ||
				   context == grammarAccess.getParameterRule() ||
				   context == grammarAccess.getPrimaryRule() ||
				   context == grammarAccess.getRangeRule() ||
				   context == grammarAccess.getRangeConstraintRule() ||
				   context == grammarAccess.getRelationRule() ||
				   context == grammarAccess.getRelationAccess().getRelationalExpressionLeftAction_1_0() ||
				   context == grammarAccess.getShiftExpressionRule() ||
				   context == grammarAccess.getShiftExpressionAccess().getShiftExpressionLeftAction_1_0() ||
				   context == grammarAccess.getSimpleExpressionRule() ||
				   context == grammarAccess.getSimpleExpressionAccess().getAddingExpressionLeftAction_0_1_0() ||
				   context == grammarAccess.getTermExpressionRule() ||
				   context == grammarAccess.getTermExpressionAccess().getMultiplyingExpressionLeftAction_1_0() ||
				   context == grammarAccess.getValueExpressionRule() ||
				   context == grammarAccess.getWaveformRule() ||
				   context == grammarAccess.getWaveformAccess().getWaveformExpressionExpressionAction_1_0()) {
					sequence_ValueExpression(context, (ValueExpression) semanticObject); 
					return; 
				}
				else break;
			case ExpressionPackage.WAVEFORM_EXPRESSION:
				if(context == grammarAccess.getWaveformRule()) {
					sequence_Waveform(context, (WaveformExpression) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == NaturePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case NaturePackage.CONSTRAINED_ARRAY_NATURE_DEFINITION:
				if(context == grammarAccess.getArrayNatureDefinitionRule() ||
				   context == grammarAccess.getCompositeNatureDefinitionRule() ||
				   context == grammarAccess.getConstrainedArrayNatureDefinitionRule() ||
				   context == grammarAccess.getNatureDefinitionRule()) {
					sequence_ConstrainedArrayNatureDefinition(context, (ConstrainedArrayNatureDefinition) semanticObject); 
					return; 
				}
				else break;
			case NaturePackage.RECORD_NATURE_DEFINITION:
				if(context == grammarAccess.getCompositeNatureDefinitionRule() ||
				   context == grammarAccess.getNatureDefinitionRule() ||
				   context == grammarAccess.getRecordNatureDefinitionRule()) {
					sequence_RecordNatureDefinition(context, (RecordNatureDefinition) semanticObject); 
					return; 
				}
				else break;
			case NaturePackage.RECORD_NATURE_ELEMENT:
				if(context == grammarAccess.getRecordNatureElementRule()) {
					sequence_RecordNatureElement(context, (RecordNatureElement) semanticObject); 
					return; 
				}
				else break;
			case NaturePackage.SCALAR_NATURE_DEFINITION:
				if(context == grammarAccess.getNatureDefinitionRule() ||
				   context == grammarAccess.getScalarNatureDefinitionRule()) {
					sequence_ScalarNatureDefinition(context, (ScalarNatureDefinition) semanticObject); 
					return; 
				}
				else break;
			case NaturePackage.UNCONSTRAINED_ARRAY_NATURE_DEFINITION:
				if(context == grammarAccess.getArrayNatureDefinitionRule() ||
				   context == grammarAccess.getCompositeNatureDefinitionRule() ||
				   context == grammarAccess.getNatureDefinitionRule() ||
				   context == grammarAccess.getUnconstrainedArrayNatureDefinitionRule()) {
					sequence_UnconstrainedArrayNatureDefinition(context, (UnconstrainedArrayNatureDefinition) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == StatementPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case StatementPackage.ASSERTION_STATEMENT:
				if(context == grammarAccess.getAssertionStatementRule() ||
				   context == grammarAccess.getSequentialStatementRule()) {
					sequence_AssertionStatement(context, (AssertionStatement) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getArchitectureStatementRule() ||
				   context == grammarAccess.getConcurrentAssertionStatementRule() ||
				   context == grammarAccess.getEntityStatementRule()) {
					sequence_ConcurrentAssertionStatement(context, (AssertionStatement) semanticObject); 
					return; 
				}
				else break;
			case StatementPackage.BLOCK_STATEMENT:
				if(context == grammarAccess.getArchitectureStatementRule() ||
				   context == grammarAccess.getBlockStatementRule()) {
					sequence_BlockStatement(context, (BlockStatement) semanticObject); 
					return; 
				}
				else break;
			case StatementPackage.BREAK_STATEMENT:
				if(context == grammarAccess.getBreakStatementRule() ||
				   context == grammarAccess.getSequentialStatementRule()) {
					sequence_BreakStatement(context, (BreakStatement) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getArchitectureStatementRule() ||
				   context == grammarAccess.getConcurrentBreakStatementRule()) {
					sequence_ConcurrentBreakStatement(context, (BreakStatement) semanticObject); 
					return; 
				}
				else break;
			case StatementPackage.BREAK_STATEMENT_ITEM:
				if(context == grammarAccess.getBreakStatementItemRule()) {
					sequence_BreakStatementItem(context, (BreakStatementItem) semanticObject); 
					return; 
				}
				else break;
			case StatementPackage.CASE_ALTERNATIVE:
				if(context == grammarAccess.getCaseAlternativeRule()) {
					sequence_CaseAlternative(context, (CaseAlternative) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSimultaneousAlternativeRule()) {
					sequence_SimultaneousAlternative(context, (CaseAlternative) semanticObject); 
					return; 
				}
				else break;
			case StatementPackage.CASE_STATEMENT:
				if(context == grammarAccess.getCaseStatementRule() ||
				   context == grammarAccess.getSequentialStatementRule()) {
					sequence_CaseStatement(context, (CaseStatement) semanticObject); 
					return; 
				}
				else break;
			case StatementPackage.COMPONENT_INSTANTIATION_STATEMENT:
				if(context == grammarAccess.getArchitectureStatementRule() ||
				   context == grammarAccess.getComponentInstantiationStatementRule()) {
					sequence_ComponentInstantiationStatement(context, (ComponentInstantiationStatement) semanticObject); 
					return; 
				}
				else break;
			case StatementPackage.CONDITIONAL_SIGNAL_ASSIGNMENT_STATEMENT:
				if(context == grammarAccess.getArchitectureStatementRule() ||
				   context == grammarAccess.getConditionalSignalAssignmentStatementRule()) {
					sequence_ConditionalSignalAssignmentStatement(context, (ConditionalSignalAssignmentStatement) semanticObject); 
					return; 
				}
				else break;
			case StatementPackage.CONDITIONAL_WAVEFORM:
				if(context == grammarAccess.getConditionalWaveformRule()) {
					sequence_ConditionalWaveform(context, (ConditionalWaveform) semanticObject); 
					return; 
				}
				else break;
			case StatementPackage.CONFIGURATION_INSTANTIATION_STATEMENT:
				if(context == grammarAccess.getArchitectureStatementRule() ||
				   context == grammarAccess.getConfigurationInstantiationStatementRule()) {
					sequence_ConfigurationInstantiationStatement(context, (ConfigurationInstantiationStatement) semanticObject); 
					return; 
				}
				else break;
			case StatementPackage.ENTITY_INSTANTIATION_STATEMENT:
				if(context == grammarAccess.getArchitectureStatementRule() ||
				   context == grammarAccess.getEntityInstantiationStatementRule()) {
					sequence_EntityInstantiationStatement(context, (EntityInstantiationStatement) semanticObject); 
					return; 
				}
				else break;
			case StatementPackage.EXIT_STATEMENT:
				if(context == grammarAccess.getExitStatementRule() ||
				   context == grammarAccess.getSequentialStatementRule()) {
					sequence_ExitStatement(context, (ExitStatement) semanticObject); 
					return; 
				}
				else break;
			case StatementPackage.EXPRESSION_STATEMENT:
				if(context == grammarAccess.getNullStatementRule() ||
				   context == grammarAccess.getSequentialStatementRule() ||
				   context == grammarAccess.getSimultaneousStatementRule()) {
					sequence_NullStatement(context, (ExpressionStatement) semanticObject); 
					return; 
				}
				else break;
			case StatementPackage.FOR_GENERATION_SCHEME:
				if(context == grammarAccess.getForGenerationSchemeRule() ||
				   context == grammarAccess.getGenerationSchemeRule()) {
					sequence_ForGenerationScheme(context, (ForGenerationScheme) semanticObject); 
					return; 
				}
				else break;
			case StatementPackage.FOR_ITERATION_SCHEME:
				if(context == grammarAccess.getForIterationSchemeRule() ||
				   context == grammarAccess.getIterationSchemeRule()) {
					sequence_ForIterationScheme(context, (ForIterationScheme) semanticObject); 
					return; 
				}
				else break;
			case StatementPackage.GENERATE_STATEMENT:
				if(context == grammarAccess.getArchitectureStatementRule() ||
				   context == grammarAccess.getGenerateStatementRule()) {
					sequence_GenerateStatement(context, (GenerateStatement) semanticObject); 
					return; 
				}
				else break;
			case StatementPackage.IF_GENERATION_SCHEME:
				if(context == grammarAccess.getGenerationSchemeRule() ||
				   context == grammarAccess.getIfGenerationSchemeRule()) {
					sequence_IfGenerationScheme(context, (IfGenerationScheme) semanticObject); 
					return; 
				}
				else break;
			case StatementPackage.IF_STATEMENT:
				if(context == grammarAccess.getIfStatementRule() ||
				   context == grammarAccess.getSequentialStatementRule()) {
					sequence_IfStatement(context, (IfStatement) semanticObject); 
					return; 
				}
				else break;
			case StatementPackage.IF_STATEMENT_TEST:
				if(context == grammarAccess.getIfStatementTestRule()) {
					sequence_IfStatementTest(context, (IfStatementTest) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSimultaneousIfStatementTestRule()) {
					sequence_SimultaneousIfStatementTest(context, (IfStatementTest) semanticObject); 
					return; 
				}
				else break;
			case StatementPackage.LOOP_STATEMENT:
				if(context == grammarAccess.getLoopStatementRule() ||
				   context == grammarAccess.getSequentialStatementRule()) {
					sequence_LoopStatement(context, (LoopStatement) semanticObject); 
					return; 
				}
				else break;
			case StatementPackage.NEXT_STATEMENT:
				if(context == grammarAccess.getNextStatementRule() ||
				   context == grammarAccess.getSequentialStatementRule()) {
					sequence_NextStatement(context, (NextStatement) semanticObject); 
					return; 
				}
				else break;
			case StatementPackage.PROCEDURE_CALL_STATEMENT:
				if(context == grammarAccess.getArchitectureStatementRule() ||
				   context == grammarAccess.getConcurrentProcedureCallStatementRule() ||
				   context == grammarAccess.getEntityStatementRule()) {
					sequence_ConcurrentProcedureCallStatement(context, (ProcedureCallStatement) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getProcedureCallStatementRule() ||
				   context == grammarAccess.getSequentialStatementRule()) {
					sequence_ProcedureCallStatement(context, (ProcedureCallStatement) semanticObject); 
					return; 
				}
				else break;
			case StatementPackage.PROCESS_STATEMENT:
				if(context == grammarAccess.getArchitectureStatementRule() ||
				   context == grammarAccess.getEntityStatementRule() ||
				   context == grammarAccess.getProcessStatementRule()) {
					sequence_ProcessStatement(context, (ProcessStatement) semanticObject); 
					return; 
				}
				else break;
			case StatementPackage.REJECT_MECHANISM:
				if(context == grammarAccess.getDelayMechanismRule() ||
				   context == grammarAccess.getRejectMechanismRule()) {
					sequence_RejectMechanism(context, (RejectMechanism) semanticObject); 
					return; 
				}
				else break;
			case StatementPackage.REPORT_STATEMENT:
				if(context == grammarAccess.getReportStatementRule() ||
				   context == grammarAccess.getSequentialStatementRule()) {
					sequence_ReportStatement(context, (ReportStatement) semanticObject); 
					return; 
				}
				else break;
			case StatementPackage.RETURN_STATEMENT:
				if(context == grammarAccess.getReturnStatementRule() ||
				   context == grammarAccess.getSequentialStatementRule()) {
					sequence_ReturnStatement(context, (ReturnStatement) semanticObject); 
					return; 
				}
				else break;
			case StatementPackage.SELECTED_SIGNAL_ASSIGNMENT_STATEMENT:
				if(context == grammarAccess.getArchitectureStatementRule() ||
				   context == grammarAccess.getSelectedSignalAssignmentStatementRule()) {
					sequence_SelectedSignalAssignmentStatement(context, (SelectedSignalAssignmentStatement) semanticObject); 
					return; 
				}
				else break;
			case StatementPackage.SEQUENTIAL_SIGNAL_ASSIGNMENT_STATEMENT:
				if(context == grammarAccess.getArchitectureStatementRule() ||
				   context == grammarAccess.getSequentialSignalAssignmentStatementRule() ||
				   context == grammarAccess.getSequentialStatementRule()) {
					sequence_SequentialSignalAssignmentStatement(context, (SequentialSignalAssignmentStatement) semanticObject); 
					return; 
				}
				else break;
			case StatementPackage.SIMPLE_SIMULTANEOUS_STATEMENT:
				if(context == grammarAccess.getArchitectureStatementRule() ||
				   context == grammarAccess.getSimpleSimultaneousStatementRule() ||
				   context == grammarAccess.getSimultaneousStatementRule()) {
					sequence_SimpleSimultaneousStatement(context, (SimpleSimultaneousStatement) semanticObject); 
					return; 
				}
				else break;
			case StatementPackage.SIMULTANEOUS_CASE_STATEMENT:
				if(context == grammarAccess.getArchitectureStatementRule() ||
				   context == grammarAccess.getSimultaneousCaseStatementRule() ||
				   context == grammarAccess.getSimultaneousStatementRule()) {
					sequence_SimultaneousCaseStatement(context, (SimultaneousCaseStatement) semanticObject); 
					return; 
				}
				else break;
			case StatementPackage.SIMULTANEOUS_IF_STATEMENT:
				if(context == grammarAccess.getArchitectureStatementRule() ||
				   context == grammarAccess.getSimultaneousIfStatementRule() ||
				   context == grammarAccess.getSimultaneousStatementRule()) {
					sequence_SimultaneousIfStatement(context, (SimultaneousIfStatement) semanticObject); 
					return; 
				}
				else break;
			case StatementPackage.SIMULTANEOUS_PROCEDURAL_STATEMENT:
				if(context == grammarAccess.getArchitectureStatementRule() ||
				   context == grammarAccess.getSimultaneousProceduralStatementRule() ||
				   context == grammarAccess.getSimultaneousStatementRule()) {
					sequence_SimultaneousProceduralStatement(context, (SimultaneousProceduralStatement) semanticObject); 
					return; 
				}
				else break;
			case StatementPackage.TRANSPORT_MECHANISM:
				if(context == grammarAccess.getDelayMechanismRule() ||
				   context == grammarAccess.getTransportMechanismRule()) {
					sequence_TransportMechanism(context, (TransportMechanism) semanticObject); 
					return; 
				}
				else break;
			case StatementPackage.VARIABLE_ASSIGNMENT_STATEMENT:
				if(context == grammarAccess.getSequentialStatementRule() ||
				   context == grammarAccess.getVariableAssignmentStatementRule()) {
					sequence_VariableAssignmentStatement(context, (VariableAssignmentStatement) semanticObject); 
					return; 
				}
				else break;
			case StatementPackage.WAIT_STATEMENT:
				if(context == grammarAccess.getSequentialStatementRule() ||
				   context == grammarAccess.getWaitStatementRule()) {
					sequence_WaitStatement(context, (WaitStatement) semanticObject); 
					return; 
				}
				else break;
			case StatementPackage.WHILE_ITERATION_SCHEME:
				if(context == grammarAccess.getIterationSchemeRule() ||
				   context == grammarAccess.getWhileIterationSchemeRule()) {
					sequence_WhileIterationScheme(context, (WhileIterationScheme) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == TypePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TypePackage.ACCESS_TYPE_DEFINITION:
				if(context == grammarAccess.getAccessTypeDefinitionRule() ||
				   context == grammarAccess.getTypeDefinitionRule()) {
					sequence_AccessTypeDefinition(context, (AccessTypeDefinition) semanticObject); 
					return; 
				}
				else break;
			case TypePackage.CONSTRAINED_ARRAY_TYPE_DEFINITION:
				if(context == grammarAccess.getArrayTypeDefinitionRule() ||
				   context == grammarAccess.getCompositeTypeDefinitionRule() ||
				   context == grammarAccess.getConstrainedArrayTypeDefinitionRule() ||
				   context == grammarAccess.getTypeDefinitionRule()) {
					sequence_ConstrainedArrayTypeDefinition(context, (ConstrainedArrayTypeDefinition) semanticObject); 
					return; 
				}
				else break;
			case TypePackage.ENUMERATION_TYPE_DEFINITION:
				if(context == grammarAccess.getEnumerationTypeDefinitionRule() ||
				   context == grammarAccess.getTypeDefinitionRule()) {
					sequence_EnumerationTypeDefinition(context, (EnumerationTypeDefinition) semanticObject); 
					return; 
				}
				else break;
			case TypePackage.FILE_TYPE_DEFINITION:
				if(context == grammarAccess.getFileTypeDefinitionRule() ||
				   context == grammarAccess.getTypeDefinitionRule()) {
					sequence_FileTypeDefinition(context, (FileTypeDefinition) semanticObject); 
					return; 
				}
				else break;
			case TypePackage.PHYSICAL_TYPE_DEFINITION:
				if(context == grammarAccess.getPhysicalTypeDefinitionRule() ||
				   context == grammarAccess.getTypeDefinitionRule()) {
					sequence_PhysicalTypeDefinition(context, (PhysicalTypeDefinition) semanticObject); 
					return; 
				}
				else break;
			case TypePackage.PHYSICAL_TYPE_DEFINITION_SECONDARY:
				if(context == grammarAccess.getPhysicalTypeDefinitionSecondaryRule()) {
					sequence_PhysicalTypeDefinitionSecondary(context, (PhysicalTypeDefinitionSecondary) semanticObject); 
					return; 
				}
				else break;
			case TypePackage.RANGE_TYPE_DEFINITION:
				if(context == grammarAccess.getRangeTypeDefinitionRule() ||
				   context == grammarAccess.getTypeDefinitionRule()) {
					sequence_RangeTypeDefinition(context, (RangeTypeDefinition) semanticObject); 
					return; 
				}
				else break;
			case TypePackage.RECORD_TYPE_DEFINITION:
				if(context == grammarAccess.getCompositeTypeDefinitionRule() ||
				   context == grammarAccess.getRecordTypeDefinitionRule() ||
				   context == grammarAccess.getTypeDefinitionRule()) {
					sequence_RecordTypeDefinition(context, (RecordTypeDefinition) semanticObject); 
					return; 
				}
				else break;
			case TypePackage.RECORD_TYPE_ELEMENT:
				if(context == grammarAccess.getRecordTypeElementRule()) {
					sequence_RecordTypeElement(context, (RecordTypeElement) semanticObject); 
					return; 
				}
				else break;
			case TypePackage.UNCONSTRAINED_ARRAY_TYPE_DEFINITION:
				if(context == grammarAccess.getArrayTypeDefinitionRule() ||
				   context == grammarAccess.getCompositeTypeDefinitionRule() ||
				   context == grammarAccess.getTypeDefinitionRule() ||
				   context == grammarAccess.getUnconstrainedArrayTypeDefinitionRule()) {
					sequence_UnconstrainedArrayTypeDefinition(context, (UnconstrainedArrayTypeDefinition) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == VhdlPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case VhdlPackage.ARCHITECTURE:
				if(context == grammarAccess.getArchitectureRule() ||
				   context == grammarAccess.getModuleRule()) {
					sequence_Architecture(context, (Architecture) semanticObject); 
					return; 
				}
				else break;
			case VhdlPackage.COMPONENT:
				if(context == grammarAccess.getBlockDeclarativeItemRule() ||
				   context == grammarAccess.getComponentRule() ||
				   context == grammarAccess.getPackageDeclarativeItemRule()) {
					sequence_Component(context, (Component) semanticObject); 
					return; 
				}
				else break;
			case VhdlPackage.DESIGN_UNIT:
				if(context == grammarAccess.getDesignUnitRule()) {
					sequence_DesignUnit(context, (DesignUnit) semanticObject); 
					return; 
				}
				else break;
			case VhdlPackage.ENTITY:
				if(context == grammarAccess.getEntityRule() ||
				   context == grammarAccess.getModuleRule()) {
					sequence_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case VhdlPackage.GENERIC_MAPS:
				if(context == grammarAccess.getGenericMapsRule()) {
					sequence_GenericMaps(context, (GenericMaps) semanticObject); 
					return; 
				}
				else break;
			case VhdlPackage.GENERICS:
				if(context == grammarAccess.getGenericsRule()) {
					sequence_Generics(context, (Generics) semanticObject); 
					return; 
				}
				else break;
			case VhdlPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case VhdlPackage.NAME_LIST:
				if(context == grammarAccess.getAttributeEntityRule()) {
					sequence_AttributeEntity(context, (NameList) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getGroupConstituentsRule()) {
					sequence_GroupConstituents(context, (NameList) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getInstantiationListRule() ||
				   context == grammarAccess.getMultiIdentifierNameRule()) {
					sequence_MultiIdentifierName(context, (NameList) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getMultiNameRule()) {
					sequence_MultiName(context, (NameList) semanticObject); 
					return; 
				}
				else break;
			case VhdlPackage.PACKAGE:
				if(context == grammarAccess.getModuleRule() ||
				   context == grammarAccess.getPackageRule()) {
					sequence_Package(context, (net.mlanoe.language.vhdl.Package) semanticObject); 
					return; 
				}
				else break;
			case VhdlPackage.PACKAGE_BODY:
				if(context == grammarAccess.getModuleRule() ||
				   context == grammarAccess.getPackageBodyRule()) {
					sequence_PackageBody(context, (PackageBody) semanticObject); 
					return; 
				}
				else break;
			case VhdlPackage.PORT_MAPS:
				if(context == grammarAccess.getPortMapsRule()) {
					sequence_PortMaps(context, (PortMaps) semanticObject); 
					return; 
				}
				else break;
			case VhdlPackage.PORTS:
				if(context == grammarAccess.getPortsRule()) {
					sequence_Ports(context, (Ports) semanticObject); 
					return; 
				}
				else break;
			case VhdlPackage.SIGNATURE:
				if(context == grammarAccess.getSignatureRule()) {
					sequence_Signature(context, (Signature) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     type=SubtypeIndication
	 */
	protected void sequence_AccessTypeDefinition(EObject context, AccessTypeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((expression+=Parameter expression+=Parameter*)?)
	 */
	protected void sequence_Aggregate(EObject context, AggregateExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=DesignatorName alias=SubtypeIndication? is=NameSignature)
	 */
	protected void sequence_AliasDeclaration(EObject context, AliasDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {AllExpression}
	 */
	protected void sequence_All(EObject context, AllExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=SubtypeIndication
	 */
	protected void sequence_AllocatorExpression(EObject context, AllocatorExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IdentifierName of=Name declaration+=BlockDeclarativeItem* statement+=ArchitectureStatement*)
	 */
	protected void sequence_Architecture(EObject context, Architecture semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (label=Label? condition=Expression report=Expression? severity=Expression?)
	 */
	protected void sequence_AssertionStatement(EObject context, AssertionStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IdentifierName type=IdentifierName)
	 */
	protected void sequence_AttributeDeclaration(EObject context, AttributeDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         value=Identifier | 
	 *         value='range' | 
	 *         value='across' | 
	 *         value='through' | 
	 *         value='reference' | 
	 *         value='tolerance'
	 *     )
	 */
	protected void sequence_AttributeDesignator_IdentifierName(EObject context, IdentifierExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (name=AttributeEntityDesignator_SignatureExpression_0_1_0 signature=Signature) | 
	 *         (name=AttributeEntityDesignator_SignatureExpression_1_1_0 signature=Signature) | 
	 *         (name=AttributeEntityDesignator_SignatureExpression_2_1_0 signature=Signature)
	 *     )
	 */
	protected void sequence_AttributeEntityDesignator(EObject context, SignatureExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name+=AttributeEntity_NameList_1_0 name+=AttributeEntityDesignator+)
	 */
	protected void sequence_AttributeEntity(EObject context, NameList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (signature=Signature? value=ATTRIBUTE)
	 */
	protected void sequence_AttributeName(EObject context, AttributeExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=AttributeDesignator entity=AttributeEntity class=EntityClass is=Expression)
	 */
	protected void sequence_AttributeSpecification(EObject context, AttributeSpecification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=BIT_STRING_LITERAL
	 */
	protected void sequence_BitStringName(EObject context, BitStringExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Name (use+=Name use+=Name*)* item+=ConfigurationItem*)
	 */
	protected void sequence_BlockConfiguration(EObject context, BlockConfiguration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         label=Label 
	 *         guard=Expression? 
	 *         (generic=Generics genericMap=GenericMaps?)? 
	 *         (port=Ports portMap=PortMaps?)? 
	 *         declaration+=BlockDeclarativeItem* 
	 *         statement+=ArchitectureStatement*
	 *     )
	 */
	protected void sequence_BlockStatement(EObject context, BlockStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (across=QuantityAspect? through=QuantityAspect? left=Name right=Name?)
	 */
	protected void sequence_BranchQuantityDeclaration(EObject context, BranchQuantityDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Name? use=Name arrow=Expression)
	 */
	protected void sequence_BreakStatementItem(EObject context, BreakStatementItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (label=Label? (break+=BreakStatementItem break+=BreakStatementItem*)? when=Expression?)
	 */
	protected void sequence_BreakStatement(EObject context, BreakStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (choice=Choices statement+=SequentialStatement*)
	 */
	protected void sequence_CaseAlternative(EObject context, CaseAlternative semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (label=Label? case=Expression when+=CaseAlternative+)
	 */
	protected void sequence_CaseStatement(EObject context, CaseStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=CHAR
	 */
	protected void sequence_CharacterName(EObject context, CharacterExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression+=Choices_MultiExpression_1_0 expression+=Choice+)
	 */
	protected void sequence_Choices(EObject context, MultiExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         list=InstantiationList 
	 *         component=Name 
	 *         ((entity=Name | configuration=Name)? genericMap=GenericMaps? portMap=PortMaps?)? 
	 *         block=BlockConfiguration?
	 *     )
	 */
	protected void sequence_ComponentConfiguration(EObject context, ComponentConfiguration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (label=Label name=Name genericMap=GenericMaps? portMap=PortMaps?)
	 */
	protected void sequence_ComponentInstantiationStatement(EObject context, ComponentInstantiationStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IdentifierName generic=Generics? port=Ports?)
	 */
	protected void sequence_Component(EObject context, Component semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (label=Label? postponed?='postponed'? condition=Expression report=Expression? severity=Expression?)
	 */
	protected void sequence_ConcurrentAssertionStatement(EObject context, AssertionStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (label=Label? (break+=BreakStatementItem break+=BreakStatementItem*)? sensitivity=MultiName? when=Expression?)
	 */
	protected void sequence_ConcurrentBreakStatement(EObject context, BreakStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (label=Label? postponed?='postponed' procedure=Name)
	 */
	protected void sequence_ConcurrentProcedureCallStatement(EObject context, ProcedureCallStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         label=Label? 
	 *         postponed?='postponed'? 
	 *         target=Target 
	 *         guarded?='guarded'? 
	 *         delay=DelayMechanism? 
	 *         waveform+=ConditionalWaveform 
	 *         waveform+=ConditionalWaveform*
	 *     )
	 */
	protected void sequence_ConditionalSignalAssignmentStatement(EObject context, ConditionalSignalAssignmentStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((waveform+=Waveform waveform+=Waveform*)? choice=Choices)
	 */
	protected void sequence_ConditionalWaveform(EObject context, ConditionalWaveform semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (label=Label name=Name genericMap=GenericMaps? portMap=PortMaps?)
	 */
	protected void sequence_ConfigurationInstantiationStatement(EObject context, ConfigurationInstantiationStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (list=InstantiationList component=Name (entity=Name | configuration=Name)? genericMap=GenericMaps? portMap=PortMaps?)
	 */
	protected void sequence_ConfigurationSpecification(EObject context, ConfigurationSpecification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IdentifierName of=Name declaration+=ConfigurationDeclarativeItem* block=BlockConfiguration)
	 */
	protected void sequence_Configuration(EObject context, Configuration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=MultiIdentifierName type=SubtypeIndication initial=Expression?)
	 */
	protected void sequence_ConstantDeclaration(EObject context, ConstantDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (constraint=IndexConstraint nature=SubnatureIndication)
	 */
	protected void sequence_ConstrainedArrayNatureDefinition(EObject context, ConstrainedArrayNatureDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (constraint=IndexConstraint type=SubtypeIndication)
	 */
	protected void sequence_ConstrainedArrayTypeDefinition(EObject context, ConstrainedArrayTypeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((library+=Identifier library+=Identifier*) | (use+=Name use+=Name*))* module=Module)
	 */
	protected void sequence_DesignUnit(EObject context, DesignUnit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (disconnect=MultiName type=Name after=Expression)
	 */
	protected void sequence_DisconnectionSpecification(EObject context, DisconnectionSpecification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (label=Label name=Name genericMap=GenericMaps? portMap=PortMaps?)
	 */
	protected void sequence_EntityInstantiationStatement(EObject context, EntityInstantiationStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IdentifierName generic=Generics? port=Ports? declaration+=EntityDeclarativeItem* statement+=EntityStatement*)
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (literal+=EnumerationLiteral literal+=EnumerationLiteral*)
	 */
	protected void sequence_EnumerationTypeDefinition(EObject context, EnumerationTypeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (label=Label? exit=Identifier? when=Expression?)
	 */
	protected void sequence_ExitStatement(EObject context, ExitStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Expression_LogicalExpression_1_0 operator=LogicalOperator right=Relation)
	 */
	protected void sequence_Expression(EObject context, LogicalExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Factor_PowerExpression_0_1_0 right=Primary)
	 */
	protected void sequence_Factor(EObject context, PowerExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((left=Factor_PowerExpression_0_1_0 right=Primary) | (left=SignFactor_PowerExpression_0_1_0 right=Primary))
	 */
	protected void sequence_Factor_SignFactor(EObject context, PowerExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=MultiIdentifierName type=SubtypeIndication (open=Expression? is=Expression)?)
	 */
	protected void sequence_FileDeclaration(EObject context, FileDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=Name
	 */
	protected void sequence_FileTypeDefinition(EObject context, FileTypeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variable=Identifier in=DiscreteRange)
	 */
	protected void sequence_ForGenerationScheme(EObject context, ForGenerationScheme semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variable=Identifier in=DiscreteRange)
	 */
	protected void sequence_ForIterationScheme(EObject context, ForIterationScheme semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=MultiIdentifierName type=SubtypeIndication quantity=Expression?)
	 */
	protected void sequence_FreeQuantityDeclaration(EObject context, FreeQuantityDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         purity=Purity? 
	 *         name=DesignatorName 
	 *         (parameter+=FunctionParameterDeclaration parameter+=FunctionParameterDeclaration*)? 
	 *         type=Name 
	 *         body=SubprogramBody?
	 *     )
	 */
	protected void sequence_FunctionDeclaration(EObject context, FunctionDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (label=Label scheme=GenerationScheme declaration+=BlockDeclarativeItem* statement+=ArchitectureStatement*)
	 */
	protected void sequence_GenerateStatement(EObject context, GenerateStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (generic+=Parameter generic+=Parameter*)
	 */
	protected void sequence_GenericMaps(EObject context, GenericMaps semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (declaration+=GenericDeclaration declaration+=GenericDeclaration*)
	 */
	protected void sequence_Generics(EObject context, Generics semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name+=GroupConstituents_NameList_1_0 name+=GroupConstituent+)
	 */
	protected void sequence_GroupConstituents(EObject context, NameList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IdentifierName is=Name member=GroupConstituents)
	 */
	protected void sequence_GroupDeclaration(EObject context, GroupDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IdentifierName entry+=EntityClass entry+=EntityClass*)
	 */
	protected void sequence_GroupTemplateDeclaration(EObject context, GroupTemplateDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=Identifier
	 */
	protected void sequence_IdentifierName(EObject context, IdentifierExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     condition=Expression
	 */
	protected void sequence_IfGenerationScheme(EObject context, IfGenerationScheme semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=Expression statement+=SequentialStatement*)
	 */
	protected void sequence_IfStatementTest(EObject context, IfStatementTest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (label=Label? test+=IfStatementTest test+=IfStatementTest* statement+=SequentialStatement*)
	 */
	protected void sequence_IfStatement(EObject context, IfStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression+=IndexConstraint_MultiExpression_2_0 expression+=DiscreteRange+)
	 */
	protected void sequence_IndexConstraint(EObject context, MultiExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=MultiIdentifierName type=SubtypeIndication initial=Expression?)
	 */
	protected void sequence_InterfaceConstantDeclaration(EObject context, ConstantDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=MultiIdentifierName type=SubtypeIndication)
	 */
	protected void sequence_InterfaceFileDeclaration(EObject context, FileDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=MultiIdentifierName mode=Mode? type=SubtypeIndication kind=SignalKind? initial=Expression?)
	 */
	protected void sequence_InterfaceSignalDeclaration(EObject context, SignalDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=MultiIdentifierName mode=Mode? type=SubtypeIndication initial=Expression?)
	 */
	protected void sequence_InterfaceVariableDeclaration(EObject context, VariableDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=MultiName type=Name value=Expression)
	 */
	protected void sequence_LimitDeclaration(EObject context, LimitDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (label=Label? iteration=IterationScheme? statement+=SequentialStatement*)
	 */
	protected void sequence_LoopStatement(EObject context, LoopStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     design+=DesignUnit*
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name+=MultiIdentifierName_NameList_1_0 name+=IdentifierName+)
	 */
	protected void sequence_MultiIdentifierName(EObject context, NameList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name+=MultiName_NameList_1_0 name+=Name+)
	 */
	protected void sequence_MultiName(EObject context, NameList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (element+=NamePrefix element+=NameSuffix+)
	 */
	protected void sequence_NameExpression(EObject context, NameExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=NameSignature_SignatureExpression_1_0 signature=Signature)
	 */
	protected void sequence_NameSignature(EObject context, SignatureExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (element+=Name_NameExpression_1_0 element+=NameSuffix+)
	 */
	protected void sequence_Name(EObject context, NameExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IdentifierName is=NatureDefinition)
	 */
	protected void sequence_NatureDeclaration(EObject context, NatureDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (label=Label? next=Identifier? when=Expression?)
	 */
	protected void sequence_NextStatement(EObject context, NextStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     noise=SimpleExpression
	 */
	protected void sequence_Noise(EObject context, Noise semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {NullExpression}
	 */
	protected void sequence_NullExpression(EObject context, NullExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (label=Label? expression=NullExpression)
	 */
	protected void sequence_NullStatement(EObject context, ExpressionStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {OpenExpression}
	 */
	protected void sequence_Open(EObject context, OpenExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {OthersExpression}
	 */
	protected void sequence_Others(EObject context, OthersExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IdentifierName declaration+=PackageBodyDeclarativeItem*)
	 */
	protected void sequence_PackageBody(EObject context, PackageBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IdentifierName declaration+=PackageDeclarativeItem*)
	 */
	protected void sequence_Package(EObject context, net.mlanoe.language.vhdl.Package semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (choice=Choices expression=Expression?)
	 */
	protected void sequence_Parameter(EObject context, AssociationExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Identifier number=ABSTRACT_LITERAL? of=Name)
	 */
	protected void sequence_PhysicalTypeDefinitionSecondary(EObject context, PhysicalTypeDefinitionSecondary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (range=RangeConstraint primary=Identifier secondary+=PhysicalTypeDefinitionSecondary*)
	 */
	protected void sequence_PhysicalTypeDefinition(EObject context, PhysicalTypeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (port+=Parameter port+=Parameter*)
	 */
	protected void sequence_PortMaps(EObject context, PortMaps semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (declaration+=PortDeclaration declaration+=PortDeclaration*)
	 */
	protected void sequence_Ports(EObject context, Ports semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (label=Label? procedure=Name)
	 */
	protected void sequence_ProcedureCallStatement(EObject context, ProcedureCallStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=DesignatorName (parameter+=ProcedureParameterDeclaration parameter+=ProcedureParameterDeclaration*)? body=SubprogramBody?)
	 */
	protected void sequence_ProcedureDeclaration(EObject context, ProcedureDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (label=Label? postponed?='postponed'? sensitivity=MultiIdentifierName? declaration+=ProcessDeclarativeItem* statement+=SequentialStatement*)
	 */
	protected void sequence_ProcessStatement(EObject context, ProcessStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=MultiIdentifierName tolerance=Expression? expression=Expression?)
	 */
	protected void sequence_QuantityAspect(EObject context, QuantityAspect semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=SimpleExpression direction=RangeDirection right=SimpleExpression)
	 */
	protected void sequence_RangeSpecification(EObject context, RangeExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=SimpleExpression direction=RangeDirection right=SimpleExpression)
	 */
	protected void sequence_RangeTypeDefinition(EObject context, RangeTypeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     record+=RecordNatureElement+
	 */
	protected void sequence_RecordNatureDefinition(EObject context, RecordNatureDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=MultiIdentifierName nature=SubnatureIndication)
	 */
	protected void sequence_RecordNatureElement(EObject context, RecordNatureElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     declaration+=RecordTypeElement+
	 */
	protected void sequence_RecordTypeDefinition(EObject context, RecordTypeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=MultiIdentifierName type=SubtypeIndication)
	 */
	protected void sequence_RecordTypeElement(EObject context, RecordTypeElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (reject=Expression?)
	 */
	protected void sequence_RejectMechanism(EObject context, RejectMechanism semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Relation_RelationalExpression_1_0 operator=RelationalOperator right=ShiftExpression)
	 */
	protected void sequence_Relation(EObject context, RelationalExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (label=Label? report=Expression severity=Expression?)
	 */
	protected void sequence_ReportStatement(EObject context, ReportStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (label=Label? expression=Expression?)
	 */
	protected void sequence_ReturnStatement(EObject context, ReturnStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Name across=Name through=Name)
	 */
	protected void sequence_ScalarNatureDefinition(EObject context, ScalarNatureDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         label=Label? 
	 *         postponed?='postponed'? 
	 *         selected=Expression 
	 *         target=Target 
	 *         guarded?='guarded'? 
	 *         delay=DelayMechanism? 
	 *         waveform+=ConditionalWaveform 
	 *         waveform+=ConditionalWaveform*
	 *     )
	 */
	protected void sequence_SelectedSignalAssignmentStatement(EObject context, SelectedSignalAssignmentStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         label=Label? 
	 *         postponed?='postponed'? 
	 *         target=Target 
	 *         guarded?='guarded'? 
	 *         delay=DelayMechanism? 
	 *         (waveform+=Waveform waveform+=Waveform*)?
	 *     )
	 */
	protected void sequence_SequentialSignalAssignmentStatement(EObject context, SequentialSignalAssignmentStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=ShiftExpression_ShiftExpression_1_0 operator=ShiftOperator right=SimpleExpression)
	 */
	protected void sequence_ShiftExpression(EObject context, ShiftExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=SignFactor_PowerExpression_0_1_0 right=Primary)
	 */
	protected void sequence_SignFactor(EObject context, PowerExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sign=Sign expression=Primary)
	 */
	protected void sequence_SignPrimary(EObject context, SignExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((sign=Sign expression=Primary) | (sign=Sign expression=UnaryExpression))
	 */
	protected void sequence_SignPrimary_SignUnaryExpression(EObject context, SignExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=SignTermExpression_MultiplyingExpression_1_0 operator=MultiplyingOperator right=Factor)
	 */
	protected void sequence_SignTermExpression(EObject context, MultiplyingExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (left=TermExpression_MultiplyingExpression_1_0 operator=MultiplyingOperator right=Factor) | 
	 *         (left=SignTermExpression_MultiplyingExpression_1_0 operator=MultiplyingOperator right=Factor)
	 *     )
	 */
	protected void sequence_SignTermExpression_TermExpression(EObject context, MultiplyingExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sign=Sign expression=UnaryExpression)
	 */
	protected void sequence_SignUnaryExpression(EObject context, SignExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=MultiIdentifierName type=SubtypeIndication kind=SignalKind? initial=Expression?)
	 */
	protected void sequence_SignalDeclaration(EObject context, SignalDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((parameter+=Name parameter+=Name*)? return=Name?)
	 */
	protected void sequence_Signature(EObject context, Signature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (left=SimpleExpression_AddingExpression_0_1_0 operator=AddingOperator right=TermExpression) | 
	 *         (left=SimpleExpression_AddingExpression_1_1_0 operator=AddingOperator right=TermExpression)
	 *     )
	 */
	protected void sequence_SimpleExpression(EObject context, AddingExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=SimpleExpression_AddingExpression_0_1_0 operator=AddingOperator right=TermExpression)
	 */
	protected void sequence_SimpleExpression_AddingExpression_0_1_0(EObject context, AddingExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=SimpleExpression_AddingExpression_1_1_0 operator=AddingOperator right=TermExpression)
	 */
	protected void sequence_SimpleExpression_AddingExpression_1_1_0(EObject context, AddingExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (label=Label? left=SimpleExpression right=SimpleExpression tolerance=Expression?)
	 */
	protected void sequence_SimpleSimultaneousStatement(EObject context, SimpleSimultaneousStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (choice=Choices statement+=SimultaneousStatement*)
	 */
	protected void sequence_SimultaneousAlternative(EObject context, CaseAlternative semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (label=Label? case=Expression when+=SimultaneousAlternative+)
	 */
	protected void sequence_SimultaneousCaseStatement(EObject context, SimultaneousCaseStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=Expression statement+=SimultaneousStatement*)
	 */
	protected void sequence_SimultaneousIfStatementTest(EObject context, IfStatementTest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (label=Label? test+=SimultaneousIfStatementTest test+=SimultaneousIfStatementTest* statement+=SimultaneousStatement*)
	 */
	protected void sequence_SimultaneousIfStatement(EObject context, SimultaneousIfStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (label=Label? declaration+=ProceduralDeclarativeItem* statement+=SequentialStatement*)
	 */
	protected void sequence_SimultaneousProceduralStatement(EObject context, SimultaneousProceduralStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=MultiIdentifierName type=SubtypeIndication source=SourceAspect)
	 */
	protected void sequence_SourceQuantityDeclaration(EObject context, SourceQuantityDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=SimpleExpression right=SimpleExpression)
	 */
	protected void sequence_Spectrum(EObject context, Spectrum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringName(EObject context, StringExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IdentifierName nature=SubnatureIndication)
	 */
	protected void sequence_SubnatureDeclaration(EObject context, SubnatureDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((mark=Name constraint=IndexConstraint (tolerance=Expression across=Expression?)?) | (mark=Name tolerance=Expression across=Expression?))
	 */
	protected void sequence_SubnatureIndication(EObject context, SubnatureIndicationExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (declaration+=SubprogramDeclarativeItem* statement+=SequentialStatement*)
	 */
	protected void sequence_SubprogramBody(EObject context, SubprogramBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IdentifierName type=SubtypeIndication)
	 */
	protected void sequence_SubtypeDeclaration(EObject context, SubtypeDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (name=Name mark=Name constraint=Constraint? (tolerance=Expression across=Expression?)?) | 
	 *         (mark=Name constraint=Constraint (tolerance=Expression across=Expression?)?) | 
	 *         (mark=Name tolerance=Expression across=Expression?)
	 *     )
	 */
	protected void sequence_SubtypeIndicationExpression(EObject context, SubtypeIndicationExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (name=Name mark=Name constraint=Constraint? (tolerance=Expression across=Expression?)?) | 
	 *         (mark=Name constraint=Constraint (tolerance=Expression across=Expression?)?) | 
	 *         (mark=Name tolerance=Expression across=Expression?)
	 *     )
	 */
	protected void sequence_SubtypeIndication(EObject context, SubtypeIndicationExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=TermExpression_MultiplyingExpression_1_0 operator=MultiplyingOperator right=Factor)
	 */
	protected void sequence_TermExpression(EObject context, MultiplyingExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=MultiIdentifierName nature=SubnatureIndication)
	 */
	protected void sequence_TerminalDeclaration(EObject context, TerminalDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {TransportMechanism}
	 */
	protected void sequence_TransportMechanism(EObject context, TransportMechanism semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=IdentifierName is=TypeDefinition?)
	 */
	protected void sequence_TypeDeclaration(EObject context, TypeDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operator=UnaryOperator expression=Primary)
	 */
	protected void sequence_UnaryExpression(EObject context, UnaryExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (index+=Name index+=Name* nature=SubnatureIndication)
	 */
	protected void sequence_UnconstrainedArrayNatureDefinition(EObject context, UnconstrainedArrayNatureDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (index+=Name index+=Name* type=SubtypeIndication)
	 */
	protected void sequence_UnconstrainedArrayTypeDefinition(EObject context, UnconstrainedArrayTypeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     use=MultiName
	 */
	protected void sequence_UseClauseDeclaration(EObject context, UseClauseDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=ABSTRACT_LITERAL unit=Name)
	 */
	protected void sequence_ValueExpression(EObject context, UnitValueExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=ABSTRACT_LITERAL
	 */
	protected void sequence_ValueExpression(EObject context, ValueExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (label=Label? target=Target initial=Expression)
	 */
	protected void sequence_VariableAssignmentStatement(EObject context, VariableAssignmentStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (shared?='shared'? name=MultiIdentifierName type=SubtypeIndication initial=Expression?)
	 */
	protected void sequence_VariableDeclaration(EObject context, VariableDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (label=Label? sensitivity=MultiName? until=Expression? time=Expression?)
	 */
	protected void sequence_WaitStatement(EObject context, WaitStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=Waveform_WaveformExpression_1_0 after=Expression)
	 */
	protected void sequence_Waveform(EObject context, WaveformExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     condition=Expression
	 */
	protected void sequence_WhileIterationScheme(EObject context, WhileIterationScheme semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
