/*
* generated by Xtext
*/
package net.mlanoe.language.vhdl.xtext;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class VhdlUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return net.mlanoe.language.vhdl.xtext.ui.internal.VhdlActivator.getInstance().getInjector("net.mlanoe.language.vhdl.xtext.Vhdl");
	}
	
}