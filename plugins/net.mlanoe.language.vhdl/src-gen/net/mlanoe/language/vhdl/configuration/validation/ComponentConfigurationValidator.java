/**
 *
 * $Id$
 */
package net.mlanoe.language.vhdl.configuration.validation;

import net.mlanoe.language.vhdl.GenericMaps;
import net.mlanoe.language.vhdl.MultiName;
import net.mlanoe.language.vhdl.Name;
import net.mlanoe.language.vhdl.PortMaps;

import net.mlanoe.language.vhdl.configuration.BlockConfiguration;

import net.mlanoe.language.vhdl.expression.Expression;

/**
 * A sample validator interface for {@link net.mlanoe.language.vhdl.configuration.ComponentConfiguration}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ComponentConfigurationValidator {
	boolean validate();

	boolean validateList(MultiName value);

	boolean validateList(Expression value);
	boolean validateComponent(Name value);
	boolean validateEntity(Name value);
	boolean validateConfiguration(Name value);
	boolean validateGenericMap(GenericMaps value);
	boolean validatePortMap(PortMaps value);
	boolean validateBlock(BlockConfiguration value);
}
