package uk.ac.kcl.inf.modelspeak.generator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.XbaseGenerated;
import uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgument;
import uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgumentAttack;
import uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgumentFramework;
import uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.Abstract_argumentsFactory;
import uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.DerivedAbstractArgument;
import uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.VirtualAbstractArgument;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentElement;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentElementRelation;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentGraph;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.Attack;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.Support;

/**
 * Take an argument graph and translate it into an abstract argument graph.
 */
@SuppressWarnings("all")
public class ArgumentFrameworkGenerator {
  @Extension
  private final Abstract_argumentsFactory factory = Abstract_argumentsFactory.eINSTANCE;

  private final AbstractArgumentFramework argumentFramework = this.factory.createAbstractArgumentFramework();

  private Resource frameworkResource;

  public void beforeGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final URI outputUri = fsa.getURI(this.getAbstractArgumentFrameworkFileName(resource));
    final ResourceSet resourceSet = resource.getResourceSet();
    this.frameworkResource = resourceSet.createResource(outputUri);
    EList<EObject> _contents = this.frameworkResource.getContents();
    _contents.add(this.argumentFramework);
  }

  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    try {
      EObject _head = IterableExtensions.<EObject>head(resource.getContents());
      final ArgumentGraph argGraph = ((ArgumentGraph) _head);
      this.argumentFramework.setArgumentgraph(argGraph);
      final HashMap<ArgumentElement, AbstractArgument> elementTrace = new HashMap<ArgumentElement, AbstractArgument>();
      final Consumer<ArgumentElement> _function = (ArgumentElement it) -> {
        this.transformElement(it, this.argumentFramework, elementTrace);
      };
      argGraph.getArgumentElements().forEach(_function);
      final Consumer<ArgumentElementRelation> _function_1 = (ArgumentElementRelation it) -> {
        this.transformRelation(it, this.argumentFramework, elementTrace);
      };
      argGraph.getRelations().forEach(_function_1);
      this.frameworkResource.save(SaveOptions.newBuilder().format().getOptions().toOptionsMap());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  private String getAbstractArgumentFrameworkFileName(final Resource resource) {
    String _xblockexpression = null;
    {
      final String origName = resource.getURI().lastSegment();
      String _substring = origName.substring(0, origName.lastIndexOf("."));
      _xblockexpression = (_substring + ".abstract_arguments");
    }
    return _xblockexpression;
  }

  private void transformElement(final ArgumentElement ae, final AbstractArgumentFramework framework, final Map<ArgumentElement, AbstractArgument> trace) {
    DerivedAbstractArgument _createDerivedArgumentFor = this.createDerivedArgumentFor(framework, ae);
    Pair<ArgumentElement, AbstractArgument> _mappedTo = Pair.<ArgumentElement, AbstractArgument>of(ae, _createDerivedArgumentFor);
    trace.put(_mappedTo.getKey(), _mappedTo.getValue());
  }

  private void _transformRelation(final ArgumentElementRelation aer, final AbstractArgumentFramework framework, final Map<ArgumentElement, AbstractArgument> trace) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Argument relations of type ");
    String _name = aer.eClass().getName();
    _builder.append(_name);
    _builder.append(" not currently supported.");
    throw new UnsupportedOperationException(_builder.toString());
  }

  private void _transformRelation(final Attack a, final AbstractArgumentFramework framework, final Map<ArgumentElement, AbstractArgument> trace) {
    final AbstractArgumentAttack attack = this.createAttack(framework);
    attack.setSource(trace.get(a.getEvidence()));
    attack.setTarget(trace.get(a.getClaim()));
  }

  private void _transformRelation(final Support s, final AbstractArgumentFramework framework, final Map<ArgumentElement, AbstractArgument> trace) {
    final VirtualAbstractArgument intermediary = this.createVirtualArgument(framework);
    final AbstractArgumentAttack attack1 = this.createAttack(framework);
    final AbstractArgumentAttack attack2 = this.createAttack(framework);
    attack1.setSource(trace.get(s.getEvidence()));
    attack1.setTarget(intermediary);
    attack2.setSource(intermediary);
    attack2.setTarget(trace.get(s.getClaim()));
  }

  private DerivedAbstractArgument createDerivedArgumentFor(final AbstractArgumentFramework framework, final ArgumentElement ae) {
    final DerivedAbstractArgument abstractArg = this.factory.createDerivedAbstractArgument();
    abstractArg.setArgumentelement(ae);
    abstractArg.setId(this.createArgID());
    EList<AbstractArgument> _arguments = framework.getArguments();
    _arguments.add(abstractArg);
    return abstractArg;
  }

  private VirtualAbstractArgument createVirtualArgument(final AbstractArgumentFramework framework) {
    final VirtualAbstractArgument abstractArg = this.factory.createVirtualAbstractArgument();
    abstractArg.setId(this.createArgID());
    EList<AbstractArgument> _arguments = framework.getArguments();
    _arguments.add(abstractArg);
    return abstractArg;
  }

  private AbstractArgumentAttack createAttack(final AbstractArgumentFramework framework) {
    final AbstractArgumentAttack attack = this.factory.createAbstractArgumentAttack();
    EList<AbstractArgumentAttack> _attacks = framework.getAttacks();
    _attacks.add(attack);
    attack.setId(this.createAttackID());
    return attack;
  }

  private long argID = 0;

  private long attackID = 0;

  private long createArgID() {
    return this.argID++;
  }

  private long createAttackID() {
    return this.attackID++;
  }

  @XbaseGenerated
  private void transformRelation(final ArgumentElementRelation a, final AbstractArgumentFramework framework, final Map<ArgumentElement, AbstractArgument> trace) {
    if (a instanceof Attack) {
      _transformRelation((Attack)a, framework, trace);
      return;
    } else if (a instanceof Support) {
      _transformRelation((Support)a, framework, trace);
      return;
    } else if (a != null) {
      _transformRelation(a, framework, trace);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(a, framework, trace).toString());
    }
  }
}
