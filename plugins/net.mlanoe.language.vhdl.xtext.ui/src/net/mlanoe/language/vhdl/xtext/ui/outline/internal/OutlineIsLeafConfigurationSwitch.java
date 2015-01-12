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

/**
 * Outline "isLeaf" for classes declared into the 'configuration' package.
 * 
 * @author <a href="mailto:mickael.lanoe@laposte.net">Mickael LANOE</a>
 *
 */
public class OutlineIsLeafConfigurationSwitch extends
		ConfigurationSwitch<Boolean> {

	@Override
	public Boolean caseBlockConfiguration(BlockConfiguration object) {
		return object.getUse().isEmpty() && object.getItem().isEmpty();
	}

	@Override
	public Boolean caseComponentConfiguration(ComponentConfiguration object) {
		if (object.getGenericMap() != null
				&& !object.getGenericMap().getGeneric().isEmpty()) {
			return false;
		}
		if (object.getPortMap() != null
				&& !object.getPortMap().getPort().isEmpty()) {
			return false;
		}
		if (object.getBlock() != null
				&& (!object.getBlock().getUse().isEmpty() || !object.getBlock()
						.getItem().isEmpty())) {
			return false;
		}
		return true;
	}

	@Override
	public Boolean caseConfiguration(Configuration object) {
		if (object.getBlock() != null
				&& (!object.getBlock().getUse().isEmpty() || !object.getBlock()
						.getItem().isEmpty())) {
			return false;
		}

		return object.getDeclaration().isEmpty();
	}
}
