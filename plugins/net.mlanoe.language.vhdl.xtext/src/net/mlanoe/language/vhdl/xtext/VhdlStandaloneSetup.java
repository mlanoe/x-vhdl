/*
* generated by Xtext
*/
package net.mlanoe.language.vhdl.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class VhdlStandaloneSetup extends VhdlStandaloneSetupGenerated{

	public static void doSetup() {
		new VhdlStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

