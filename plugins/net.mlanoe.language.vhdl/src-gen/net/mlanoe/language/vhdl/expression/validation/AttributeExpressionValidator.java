/**
 *
 * $Id$
 */
package net.mlanoe.language.vhdl.expression.validation;

import net.mlanoe.language.vhdl.Signature;

/**
 * A sample validator interface for {@link net.mlanoe.language.vhdl.expression.AttributeExpression}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AttributeExpressionValidator {
	boolean validate();

	boolean validateSignature(Signature value);
}