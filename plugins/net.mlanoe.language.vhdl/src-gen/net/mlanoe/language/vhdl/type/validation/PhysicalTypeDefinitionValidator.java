/**
 *
 * $Id$
 */
package net.mlanoe.language.vhdl.type.validation;

import net.mlanoe.language.vhdl.expression.Expression;

import net.mlanoe.language.vhdl.type.PhysicalTypeDefinitionSecondary;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link net.mlanoe.language.vhdl.type.PhysicalTypeDefinition}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PhysicalTypeDefinitionValidator {
	boolean validate();

	boolean validateRange(Expression value);
	boolean validatePrimary(String value);
	boolean validateSecondary(EList<PhysicalTypeDefinitionSecondary> value);
}
