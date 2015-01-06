package net.mlanoe.language.vhdl.xtext.ui.outline.internal;

/**
 * Copyright (c) 2014 mlanoe
 * Some rights reserved. See COPYING, AUTHORS.
 *   
 * Contributors:
 *     mlanoe - initial API and implementation
 */
import java.util.ArrayList;
import java.util.List;

import net.mlanoe.language.vhdl.configuration.BlockConfiguration;
import net.mlanoe.language.vhdl.configuration.ComponentConfiguration;
import net.mlanoe.language.vhdl.configuration.Configuration;
import net.mlanoe.language.vhdl.configuration.util.ConfigurationSwitch;

import org.eclipse.emf.ecore.EObject;

/**
 * Outline children for classes declared into the 'configuration' package.
 * 
 * @author <a href="mailto:mickael.lanoe@laposte.net">Mickael LANOE</a>
 *
 */
public class OutlineChildrenConfigurationSwitch extends
		ConfigurationSwitch<Iterable<? extends EObject>> {

	@Override
	public Iterable<? extends EObject> caseBlockConfiguration(
			BlockConfiguration object) {
		if (!object.getUse().isEmpty() && !object.getItem().isEmpty()) {
			List<EObject> res = new ArrayList<EObject>();
			res.addAll(object.getUse());
			res.addAll(object.getItem());
			return res;
		}

		return !object.getUse().isEmpty() ? object.getUse() : object.getItem();
	}

	@Override
	public Iterable<? extends EObject> caseComponentConfiguration(
			ComponentConfiguration object) {
		List<EObject> res = new ArrayList<EObject>();
		if (object.getGenericMap() != null) {
			res.addAll(object.getGenericMap().getGeneric());
		}

		if (object.getPortMap() != null) {
			res.addAll(object.getPortMap().getPort());
		}
		if (object.getBlock() != null) {
			res.addAll(object.getBlock().getUse());
			res.addAll(object.getBlock().getItem());
		}
		return res;
	}

	@Override
	public Iterable<? extends EObject> caseConfiguration(Configuration object) {
		List<EObject> res = new ArrayList<EObject>();
		if (object.getBlock() != null) {
			res.addAll(object.getBlock().getUse());
			res.addAll(object.getBlock().getItem());
		}
		res.addAll(object.getDeclaration());
		return res;
	}
}
