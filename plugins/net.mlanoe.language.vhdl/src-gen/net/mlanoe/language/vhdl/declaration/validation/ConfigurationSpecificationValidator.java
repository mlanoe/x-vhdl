/**
 *
 * $Id$
 */
package net.mlanoe.language.vhdl.declaration.validation;

import net.mlanoe.language.vhdl.ComponentReference;
import net.mlanoe.language.vhdl.EntityReference;
import net.mlanoe.language.vhdl.GenericMaps;
import net.mlanoe.language.vhdl.MultiName;
import net.mlanoe.language.vhdl.PortMaps;

import net.mlanoe.language.vhdl.configuration.ConfigurationReference;

/**
 * A sample validator interface for {@link net.mlanoe.language.vhdl.declaration.ConfigurationSpecification}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ConfigurationSpecificationValidator {
	boolean validate();

	boolean validateList(MultiName value);
	boolean validateComponent(ComponentReference value);
	boolean validateEntity(EntityReference value);
	boolean validateConfiguration(ConfigurationReference value);
	boolean validateGenericMap(GenericMaps value);
	boolean validatePortMap(PortMaps value);
}
