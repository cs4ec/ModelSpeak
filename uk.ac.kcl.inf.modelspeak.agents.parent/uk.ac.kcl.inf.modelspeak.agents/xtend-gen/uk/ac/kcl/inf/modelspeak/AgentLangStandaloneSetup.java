/**
 * generated by Xtext 2.35.0
 */
package uk.ac.kcl.inf.modelspeak;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class AgentLangStandaloneSetup extends AgentLangStandaloneSetupGenerated {
  public static void doSetup() {
    new AgentLangStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}