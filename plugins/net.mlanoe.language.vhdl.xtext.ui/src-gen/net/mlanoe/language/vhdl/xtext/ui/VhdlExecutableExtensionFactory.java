/*
 * generated by Xtext
 */
package net.mlanoe.language.vhdl.xtext.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import net.mlanoe.language.vhdl.xtext.ui.internal.VhdlActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class VhdlExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return VhdlActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return VhdlActivator.getInstance().getInjector(VhdlActivator.NET_MLANOE_LANGUAGE_VHDL_XTEXT_VHDL);
	}
	
}
