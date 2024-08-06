/**
 * generated by Xtext 2.35.0
 */
package uk.ac.kcl.inf.modelspeak.generator;

import com.google.common.collect.Iterables;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.henshin.interpreter.EGraph;
import org.eclipse.emf.henshin.interpreter.Engine;
import org.eclipse.emf.henshin.interpreter.InterpreterFactory;
import org.eclipse.emf.henshin.interpreter.RuleApplication;
import org.eclipse.emf.henshin.interpreter.impl.EGraphImpl;
import org.eclipse.emf.henshin.model.Rule;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import uk.ac.kcl.inf.modelspeak.agentLang.CounterModel;
import uk.ac.kcl.inf.modelspeak.agentLang.Game;
import uk.ac.kcl.inf.modelspeak.agentLang.LiteratureReference;
import uk.ac.kcl.inf.modelspeak.agentLang.Move;
import uk.ac.kcl.inf.modelspeak.agentLang.ProposeModel;
import uk.ac.kcl.inf.modelspeak.agentLang.ProposeRQ;
import uk.ac.kcl.inf.modelspeak.agentLang.ProposeRequirement;
import uk.ac.kcl.inf.modelspeak.agentLang.SupportRequirement;
import uk.ac.kcl.inf.modelspeak.agentLang.Theory;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentGraph;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentsFactory;

/**
 * Generate the argument graph corresponding to the current agent dialogue state.
 */
@SuppressWarnings("all")
public class ArgumentGraphGenerator {
  private final Engine engine = InterpreterFactory.INSTANCE.createEngine();

  private final RuleApplication ruleRunner = InterpreterFactory.INSTANCE.createRuleApplication(this.engine);

  private EGraph modelGraph;

  private List<Rule> rules;

  @Extension
  private final ArgumentsFactory factory = ArgumentsFactory.eINSTANCE;

  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Resource rulesResource = resource.getResourceSet().getResource(
      URI.createPlatformPluginURI(
        "/uk.ac.kcl.inf.modelspeak.agents/uk/ac/kcl/inf/modelspeak/generator/argument_graph.henshin", false), 
      true);
    EObject _head = IterableExtensions.<EObject>head(rulesResource.getContents());
    this.rules = ((org.eclipse.emf.henshin.model.Module) _head).getAllRules();
    final Consumer<Game> _function = (Game it) -> {
      this.generateArgumentGraph(it, resource, fsa);
    };
    Iterables.<Game>filter(resource.getContents(), Game.class).forEach(_function);
  }

  public void generateArgumentGraph(final Game game, final Resource resource, final IFileSystemAccess2 fsa) {
    try {
      final ArgumentGraph theoryStore = this.factory.createArgumentGraph();
      final URI outputUri = fsa.getURI(this.getArgumentGraphFileName(resource));
      final ResourceSet resourceSet = resource.getResourceSet();
      final Resource newResource = resourceSet.createResource(outputUri);
      EList<EObject> _contents = newResource.getContents();
      _contents.add(theoryStore);
      EGraphImpl _eGraphImpl = new EGraphImpl(theoryStore);
      this.modelGraph = _eGraphImpl;
      this.ruleRunner.setEGraph(this.modelGraph);
      final Consumer<Move> _function = (Move it) -> {
        this.updateArgumentGraph(it);
      };
      game.getMoves().forEach(_function);
      newResource.save(SaveOptions.newBuilder().format().getOptions().toOptionsMap());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  private String getArgumentGraphFileName(final Resource resource) {
    String _xblockexpression = null;
    {
      final String origName = resource.getURI().lastSegment();
      String _substring = origName.substring(0, origName.lastIndexOf("."));
      _xblockexpression = (_substring + ".arguments");
    }
    return _xblockexpression;
  }

  /**
   * Update the argument graph with the consequences of the given move. The below is just plumbing. The real effects are implemented in the accompanying Henshin file.
   */
  private Boolean _updateArgumentGraph(final Move move) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Moves of type ");
    String _name = move.eClass().getName();
    _builder.append(_name);
    _builder.append(" not yet supported in argument generation.");
    throw new UnsupportedOperationException(_builder.toString());
  }

  private Boolean _updateArgumentGraph(final ProposeRQ move) {
    return null;
  }

  private Boolean _updateArgumentGraph(final ProposeRequirement move) {
    String _name = move.getRequirement().getName();
    Pair<String, String> _mappedTo = Pair.<String, String>of("reqName", _name);
    String _effect = move.getRq().getEffect();
    Pair<String, String> _mappedTo_1 = Pair.<String, String>of("effect", _effect);
    String _dataDescription = move.getRequirement().getDataDescription();
    Pair<String, String> _mappedTo_2 = Pair.<String, String>of("data", _dataDescription);
    return Boolean.valueOf(this.execute("proposeRequirement", 
      Collections.<Pair<String, String>>unmodifiableList(CollectionLiterals.<Pair<String, String>>newArrayList(_mappedTo, _mappedTo_1, _mappedTo_2))));
  }

  private Boolean _updateArgumentGraph(final SupportRequirement move) {
    boolean _xifexpression = false;
    Theory _theory = move.getTheory();
    if ((_theory instanceof LiteratureReference)) {
      String _name = move.getRequirement().getName();
      Pair<String, String> _mappedTo = Pair.<String, String>of("reqName", _name);
      Theory _theory_1 = move.getTheory();
      String _ref = ((LiteratureReference) _theory_1).getRef();
      Pair<String, String> _mappedTo_1 = Pair.<String, String>of("litRef", _ref);
      _xifexpression = this.execute("supportRequirement", 
        Collections.<Pair<String, String>>unmodifiableList(CollectionLiterals.<Pair<String, String>>newArrayList(_mappedTo, _mappedTo_1)));
    } else {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Cannot currently process support requirement moves with anything else than a literature reference.");
      throw new IllegalArgumentException(_builder.toString());
    }
    return Boolean.valueOf(_xifexpression);
  }

  private Boolean _updateArgumentGraph(final ProposeModel move) {
    String _name = move.getRequirement().getName();
    Pair<String, String> _mappedTo = Pair.<String, String>of("reqName", _name);
    String _name_1 = move.getModel().getName();
    Pair<String, String> _mappedTo_1 = Pair.<String, String>of("modelName", _name_1);
    String _mechanism = move.getModel().getMechanism();
    Pair<String, String> _mappedTo_2 = Pair.<String, String>of("mechanism", _mechanism);
    return Boolean.valueOf(this.execute("proposeModel", 
      Collections.<Pair<String, String>>unmodifiableList(CollectionLiterals.<Pair<String, String>>newArrayList(_mappedTo, _mappedTo_1, _mappedTo_2))));
  }

  private Boolean _updateArgumentGraph(final CounterModel move) {
    String _name = move.getModel().getName();
    Pair<String, String> _mappedTo = Pair.<String, String>of("modelName", _name);
    String _name_1 = move.getRequirement().getName();
    Pair<String, String> _mappedTo_1 = Pair.<String, String>of("reqName", _name_1);
    String _name_2 = move.getExperiment().getName();
    Pair<String, String> _mappedTo_2 = Pair.<String, String>of("experimentName", _name_2);
    String _content = move.getExperiment().getContent();
    Pair<String, String> _mappedTo_3 = Pair.<String, String>of("experimentData", _content);
    return Boolean.valueOf(this.execute("counterModel", 
      Collections.<Pair<String, String>>unmodifiableList(CollectionLiterals.<Pair<String, String>>newArrayList(_mappedTo, _mappedTo_1, _mappedTo_2, _mappedTo_3))));
  }

  private boolean execute(final String ruleName, final List<Pair<String, String>> parameters) {
    boolean _xblockexpression = false;
    {
      final Function1<Rule, Boolean> _function = (Rule it) -> {
        String _name = it.getName();
        return Boolean.valueOf(Objects.equals(_name, ruleName));
      };
      this.ruleRunner.setRule(IterableExtensions.<Rule>findFirst(this.rules, _function));
      final Consumer<Pair<String, String>> _function_1 = (Pair<String, String> it) -> {
        this.ruleRunner.setParameterValue(it.getKey(), it.getValue());
      };
      parameters.forEach(_function_1);
      _xblockexpression = this.ruleRunner.execute(null);
    }
    return _xblockexpression;
  }

  private Boolean updateArgumentGraph(final Move move) {
    if (move instanceof CounterModel) {
      return _updateArgumentGraph((CounterModel)move);
    } else if (move instanceof ProposeModel) {
      return _updateArgumentGraph((ProposeModel)move);
    } else if (move instanceof ProposeRQ) {
      return _updateArgumentGraph((ProposeRQ)move);
    } else if (move instanceof ProposeRequirement) {
      return _updateArgumentGraph((ProposeRequirement)move);
    } else if (move instanceof SupportRequirement) {
      return _updateArgumentGraph((SupportRequirement)move);
    } else if (move != null) {
      return _updateArgumentGraph(move);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(move).toString());
    }
  }
}
