/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
package net.mlanoe.language.vhdl.xtext.ui.outline.internal;

import net.mlanoe.language.vhdl.declaration.AliasDeclaration;
import net.mlanoe.language.vhdl.declaration.AttributeDeclaration;
import net.mlanoe.language.vhdl.declaration.AttributeSpecification;
import net.mlanoe.language.vhdl.declaration.BranchQuantityDeclaration;
import net.mlanoe.language.vhdl.declaration.ConfigurationSpecification;
import net.mlanoe.language.vhdl.declaration.Declaration;
import net.mlanoe.language.vhdl.declaration.DisconnectionSpecification;
import net.mlanoe.language.vhdl.declaration.EntityClass;
import net.mlanoe.language.vhdl.declaration.FileDeclaration;
import net.mlanoe.language.vhdl.declaration.FreeQuantityDeclaration;
import net.mlanoe.language.vhdl.declaration.FunctionDeclaration;
import net.mlanoe.language.vhdl.declaration.GroupDeclaration;
import net.mlanoe.language.vhdl.declaration.GroupTemplateDeclaration;
import net.mlanoe.language.vhdl.declaration.LimitDeclaration;
import net.mlanoe.language.vhdl.declaration.NatureDeclaration;
import net.mlanoe.language.vhdl.declaration.ProcedureDeclaration;
import net.mlanoe.language.vhdl.declaration.SourceQuantityDeclaration;
import net.mlanoe.language.vhdl.declaration.SubnatureDeclaration;
import net.mlanoe.language.vhdl.declaration.SubprogramBody;
import net.mlanoe.language.vhdl.declaration.SubtypeDeclaration;
import net.mlanoe.language.vhdl.declaration.TerminalDeclaration;
import net.mlanoe.language.vhdl.declaration.TypeDeclaration;
import net.mlanoe.language.vhdl.declaration.UseClauseDeclaration;
import net.mlanoe.language.vhdl.declaration.ValueDeclaration;
import net.mlanoe.language.vhdl.declaration.util.DeclarationSwitch;
import net.mlanoe.language.vhdl.xtext.ui.outline.OutlineTextGenerator;

/**
 * Outline text for classes declared into the 'declaration' package.
 * 
 * @author <a href="mailto:mickael.lanoe@laposte.net">Mickael LANOE</a>
 *
 */
public class OutlineTextDeclarationSwitch extends DeclarationSwitch<Object> {

	@Override
	public Object caseTypeDeclaration(TypeDeclaration object) {
		return OutlineTextGenerator.getText(object.getName(), object.getIs());
	}

	@Override
	public Object caseSubtypeDeclaration(SubtypeDeclaration object) {
		return OutlineTextGenerator.getText(object.getName(), object.getType());
	}

	@Override
	public Object caseFunctionDeclaration(FunctionDeclaration object) {
		StringBuilder builder = new StringBuilder();
		builder.append(OutlineTextGenerator.getText(object.getName()));
		builder.append('(');

		StringBuilder parameterBuilder = new StringBuilder();
		for (Declaration parameter : object.getParameter()) {
			if (parameterBuilder.length() != 0)
				parameterBuilder.append(", ");
			parameterBuilder.append(OutlineTextGenerator.getText(parameter));
		}

		builder.append(parameterBuilder);
		builder.append(')');
		if (object.getType() != null) {
			return OutlineTextGenerator.getText(builder, object.getType());
		}
		return builder.toString();
	}

	@Override
	public String caseProcedureDeclaration(ProcedureDeclaration object) {
		StringBuilder builder = new StringBuilder();
		builder.append(OutlineTextGenerator.getText(object.getName()));
		builder.append('(');

		StringBuilder parameterBuilder = new StringBuilder();
		for (Declaration parameter : object.getParameter()) {
			if (parameterBuilder.length() != 0)
				parameterBuilder.append(", ");
			parameterBuilder.append(OutlineTextGenerator.getText(parameter));
		}

		builder.append(parameterBuilder);
		builder.append(')');
		return builder.toString();
	}

	@Override
	public Object caseValueDeclaration(ValueDeclaration object) {
		return OutlineTextGenerator.getText(object.getName(), object.getType());
	}

	@Override
	public String caseSubprogramBody(SubprogramBody object) {
		return "body";
	}

	@Override
	public Object caseFreeQuantityDeclaration(FreeQuantityDeclaration object) {
		return OutlineTextGenerator.getText(object.getName(), object.getType());
	}

	@Override
	public String caseBranchQuantityDeclaration(BranchQuantityDeclaration object) {
		return OutlineTextGenerator.getText(object.getLeft()) + " to "
				+ OutlineTextGenerator.getText(object.getRight());
	}

	@Override
	public Object caseSourceQuantityDeclaration(SourceQuantityDeclaration object) {
		return OutlineTextGenerator.getText(object.getName(), object.getType());
	}

	@Override
	public Object caseLimitDeclaration(LimitDeclaration object) {
		return OutlineTextGenerator.getText(object.getName(), object.getType());
	}

	@Override
	public Object caseSubnatureDeclaration(SubnatureDeclaration object) {
		return OutlineTextGenerator.getText(object.getName(),
				object.getNature());
	}

	@Override
	public Object caseAliasDeclaration(AliasDeclaration object) {
		StringBuilder builder = new StringBuilder();
		builder.append(OutlineTextGenerator.getText(object.getName()));
		if (object.getAlias() != null) {
			return OutlineTextGenerator.getText(builder, object.getAlias());
		}
		return builder.toString();
	}

	@Override
	public Object caseAttributeDeclaration(AttributeDeclaration object) {
		return OutlineTextGenerator.getText(object.getName(), object.getType());
	}

	@Override
	public Object caseAttributeSpecification(AttributeSpecification object) {
		return OutlineTextGenerator.getText(
				OutlineTextGenerator.getText(object.getName()) + " of "
						+ OutlineTextGenerator.getText(object.getEntity()),
				object.getClass_());
	}

	@Override
	public Object caseConfigurationSpecification(
			ConfigurationSpecification object) {
		return OutlineTextGenerator.getText(object.getList(),
				object.getComponent());
	}

	@Override
	public Object caseDisconnectionSpecification(
			DisconnectionSpecification object) {
		return OutlineTextGenerator.getText(object.getDisconnect(),
				object.getType());
	}

	@Override
	public Object caseFileDeclaration(FileDeclaration object) {
		return OutlineTextGenerator.getText(object.getName(), object.getType());
	}

	@Override
	public Object caseTerminalDeclaration(TerminalDeclaration object) {
		return OutlineTextGenerator.getText(object.getName(),
				object.getNature());
	}

	@Override
	public Object caseGroupDeclaration(GroupDeclaration object) {
		return OutlineTextGenerator.getText(object.getName(),
				OutlineTextGenerator.getText(object.getIs()) + " ("
						+ OutlineTextGenerator.getText(object.getMember())
						+ ")");
	}

	@Override
	public String caseGroupTemplateDeclaration(GroupTemplateDeclaration object) {
		StringBuilder builder = new StringBuilder();
		builder.append(OutlineTextGenerator.getText(object.getName()));

		boolean first = true;
		for (EntityClass entityClass : object.getEntry()) {
			if (!first) {
				builder.append(", ");
			}
			first = false;
			builder.append(OutlineTextGenerator.getText(entityClass));
		}

		return builder.toString();
	}

	@Override
	public Object caseNatureDeclaration(NatureDeclaration object) {
		return OutlineTextGenerator.getText(object.getName(), object.getIs());
	}

	@Override
	public Object caseUseClauseDeclaration(UseClauseDeclaration object) {
		return OutlineTextGenerator.getText(object.getUse());
	}

}
