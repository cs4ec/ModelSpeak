/**
 * generated by Xtext 2.35.0
 */
package uk.ac.kcl.inf.modelspeak;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class TheoryStoreLangStandaloneSetup extends TheoryStoreLangStandaloneSetupGenerated {
  public static void doSetup() {
    new TheoryStoreLangStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
