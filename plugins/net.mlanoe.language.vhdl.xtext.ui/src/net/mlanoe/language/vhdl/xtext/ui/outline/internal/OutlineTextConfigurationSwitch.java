package net.mlanoe.language.vhdl.xtext.ui.outline.internal;

/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
import net.mlanoe.language.vhdl.configuration.BlockConfiguration;
import net.mlanoe.language.vhdl.configuration.ComponentConfiguration;
import net.mlanoe.language.vhdl.configuration.Configuration;
import net.mlanoe.language.vhdl.configuration.util.ConfigurationSwitch;
import net.mlanoe.language.vhdl.xtext.ui.outline.OutlineTextGenerator;

/**
 * Outline text for classes declared into the 'configuration' package.
 * 
 * @author <a href="mailto:mickael.lanoe@laposte.net">Mickael LANOE</a>
 *
 */
public class OutlineTextConfigurationSwitch extends ConfigurationSwitch<Object> {

	@Override
	public Object caseBlockConfiguration(BlockConfiguration object) {
		return OutlineTextGenerator.getText(object.getName());
	}

	@Override
	public Object caseComponentConfiguration(ComponentConfiguration object) {
		return OutlineTextGenerator.getText(object.getList(),
				object.getComponent());
	}

	@Override
	public Object caseConfiguration(Configuration object) {
		return OutlineTextGenerator.getText(object.getName(), object.getOf());
	}
}
