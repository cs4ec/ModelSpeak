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
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import uk.ac.kcl.inf.modelspeak.agentLang.AttackExperiment;
import uk.ac.kcl.inf.modelspeak.agentLang.AttackModel;
import uk.ac.kcl.inf.modelspeak.agentLang.AttackRequirement;
import uk.ac.kcl.inf.modelspeak.agentLang.CounterModel;
import uk.ac.kcl.inf.modelspeak.agentLang.Game;
import uk.ac.kcl.inf.modelspeak.agentLang.GeneralTheory;
import uk.ac.kcl.inf.modelspeak.agentLang.Move;
import uk.ac.kcl.inf.modelspeak.agentLang.NotConvinced;
import uk.ac.kcl.inf.modelspeak.agentLang.ProposeExperiment;
import uk.ac.kcl.inf.modelspeak.agentLang.ProposeModel;
import uk.ac.kcl.inf.modelspeak.agentLang.ProposeRequirement;
import uk.ac.kcl.inf.modelspeak.agentLang.RedefineRequirement;
import uk.ac.kcl.inf.modelspeak.agentLang.ReplaceModel;
import uk.ac.kcl.inf.modelspeak.agentLang.RetractExperiment;
import uk.ac.kcl.inf.modelspeak.agentLang.RetractRequirement;
import uk.ac.kcl.inf.modelspeak.agentLang.SupportExperiment;
import uk.ac.kcl.inf.modelspeak.agentLang.SupportModel;
import uk.ac.kcl.inf.modelspeak.agentLang.SupportRequirement;
import uk.ac.kcl.inf.modelspeak.agentLang.Theory;
import uk.ac.kcl.inf.modelspeak.theoryStoreLang.TheoryStore;
import uk.ac.kcl.inf.modelspeak.theoryStoreLang.TheoryStoreLangFactory;

/**
 * Generate the theory store corresponding to the current agent dialogue state.
 * 
 * TODO: Need to update rules to be able to support the additional complexity of the agent dialogue language
 */
@SuppressWarnings("all")
public class TheoryStoreGenerator {
  private final Engine engine = InterpreterFactory.INSTANCE.createEngine();

  private final RuleApplication ruleRunner = InterpreterFactory.INSTANCE.createRuleApplication(this.engine);

  private EGraph modelGraph;

  private List<Rule> rules;

  @Extension
  private final TheoryStoreLangFactory factory = TheoryStoreLangFactory.eINSTANCE;

  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Resource rulesResource = resource.getResourceSet().getResource(
      URI.createPlatformPluginURI(
        "/uk.ac.kcl.inf.modelspeak.agents/uk/ac/kcl/inf/modelspeak/generator/theory_store.henshin", false), 
      true);
    EObject _head = IterableExtensions.<EObject>head(rulesResource.getContents());
    this.rules = ((org.eclipse.emf.henshin.model.Module) _head).getAllRules();
    final Consumer<Game> _function = (Game it) -> {
      this.generateTheoryStore(it, resource, fsa);
    };
    Iterables.<Game>filter(resource.getContents(), Game.class).forEach(_function);
  }

  public void generateTheoryStore(final Game game, final Resource resource, final IFileSystemAccess2 fsa) {
    try {
      final TheoryStore theoryStore = this.factory.createTheoryStore();
      final URI outputUri = fsa.getURI(this.theoryStoreFileName(resource));
      final ResourceSet resourceSet = resource.getResourceSet();
      final Resource newResource = resourceSet.createResource(outputUri);
      EList<EObject> _contents = newResource.getContents();
      _contents.add(theoryStore);
      EGraphImpl _eGraphImpl = new EGraphImpl(theoryStore);
      this.modelGraph = _eGraphImpl;
      this.ruleRunner.setEGraph(this.modelGraph);
      final Consumer<Move> _function = (Move it) -> {
        this.updateTheoryStore(it);
      };
      game.getMoves().forEach(_function);
      newResource.save(SaveOptions.newBuilder().format().getOptions().toOptionsMap());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  private String theoryStoreFileName(final Resource resource) {
    String _xblockexpression = null;
    {
      final String origName = resource.getURI().lastSegment();
      String _substring = origName.substring(0, origName.lastIndexOf("."));
      _xblockexpression = (_substring + ".theoryStore");
    }
    return _xblockexpression;
  }

  /**
   * Update the theory store with the consequences of the given move. The below is just plumbing. The real effects are implemented in the accompanying Henshin file.
   */
  private Boolean _updateTheoryStore(final Move move) {
    return null;
  }

  private Boolean _updateTheoryStore(final ProposeRequirement move) {
    String _name = move.getRequirement().getName();
    Pair<String, String> _mappedTo = Pair.<String, String>of("reqName", _name);
    String _content = move.getRequirement().getContent();
    Pair<String, String> _mappedTo_1 = Pair.<String, String>of("reqContents", _content);
    return Boolean.valueOf(this.execute("proposeRequirement", Collections.<Pair<String, String>>unmodifiableList(CollectionLiterals.<Pair<String, String>>newArrayList(_mappedTo, _mappedTo_1))));
  }

  private Boolean _updateTheoryStore(final AttackRequirement move) {
    String _name = move.getRequirement().getName();
    Pair<String, String> _mappedTo = Pair.<String, String>of("attackedRequirement", _name);
    String _name_1 = move.getTheory().getName();
    Pair<String, String> _mappedTo_1 = Pair.<String, String>of("theoryName", _name_1);
    Theory _theory = move.getTheory();
    String _content = ((GeneralTheory) _theory).getContent();
    Pair<String, String> _mappedTo_2 = Pair.<String, String>of("theoryContents", _content);
    return Boolean.valueOf(this.execute("attackRequirement", Collections.<Pair<String, String>>unmodifiableList(CollectionLiterals.<Pair<String, String>>newArrayList(_mappedTo, _mappedTo_1, _mappedTo_2))));
  }

  private Boolean _updateTheoryStore(final RedefineRequirement move) {
    String _name = move.getNewRequirement().getName();
    Pair<String, String> _mappedTo = Pair.<String, String>of("requirementName", _name);
    String _content = move.getNewRequirement().getContent();
    Pair<String, String> _mappedTo_1 = Pair.<String, String>of("requirementContents", _content);
    String _name_1 = move.getRequirement().getName();
    Pair<String, String> _mappedTo_2 = Pair.<String, String>of("oldReqName", _name_1);
    return Boolean.valueOf(this.execute("redefineRequirement", 
      Collections.<Pair<String, String>>unmodifiableList(CollectionLiterals.<Pair<String, String>>newArrayList(_mappedTo, _mappedTo_1, _mappedTo_2))));
  }

  private Boolean _updateTheoryStore(final RetractRequirement move) {
    String _name = move.getRequirement().getName();
    Pair<String, String> _mappedTo = Pair.<String, String>of("reqName", _name);
    return Boolean.valueOf(this.execute("retractRequirement", Collections.<Pair<String, String>>unmodifiableList(CollectionLiterals.<Pair<String, String>>newArrayList(_mappedTo))));
  }

  private Boolean _updateTheoryStore(final SupportRequirement move) {
    String _name = move.getRequirement().getName();
    Pair<String, String> _mappedTo = Pair.<String, String>of("requirementName", _name);
    String _name_1 = move.getTheory().getName();
    Pair<String, String> _mappedTo_1 = Pair.<String, String>of("theoryName", _name_1);
    Theory _theory = move.getTheory();
    String _content = ((GeneralTheory) _theory).getContent();
    Pair<String, String> _mappedTo_2 = Pair.<String, String>of("theoryContents", _content);
    return Boolean.valueOf(this.execute("supportRequirement", 
      Collections.<Pair<String, String>>unmodifiableList(CollectionLiterals.<Pair<String, String>>newArrayList(_mappedTo, _mappedTo_1, _mappedTo_2))));
  }

  private Boolean _updateTheoryStore(final ProposeModel move) {
    String _name = move.getRequirement().getName();
    Pair<String, String> _mappedTo = Pair.<String, String>of("requirementName", _name);
    String _name_1 = move.getModel().getName();
    Pair<String, String> _mappedTo_1 = Pair.<String, String>of("modelName", _name_1);
    String _content = move.getModel().getContent();
    Pair<String, String> _mappedTo_2 = Pair.<String, String>of("modelContents", _content);
    return Boolean.valueOf(this.execute("proposeModel", 
      Collections.<Pair<String, String>>unmodifiableList(CollectionLiterals.<Pair<String, String>>newArrayList(_mappedTo, _mappedTo_1, _mappedTo_2))));
  }

  private Boolean _updateTheoryStore(final SupportModel move) {
    String _name = move.getModel().getName();
    Pair<String, String> _mappedTo = Pair.<String, String>of("modelName", _name);
    Theory _theory = move.getTheory();
    String _content = ((GeneralTheory) _theory).getContent();
    Pair<String, String> _mappedTo_1 = Pair.<String, String>of("theoryContents", _content);
    String _name_1 = move.getTheory().getName();
    Pair<String, String> _mappedTo_2 = Pair.<String, String>of("theoryName", _name_1);
    return Boolean.valueOf(this.execute("supportModel", 
      Collections.<Pair<String, String>>unmodifiableList(CollectionLiterals.<Pair<String, String>>newArrayList(_mappedTo, _mappedTo_1, _mappedTo_2))));
  }

  private Boolean _updateTheoryStore(final ReplaceModel move) {
    String _name = move.getNewModel().getName();
    Pair<String, String> _mappedTo = Pair.<String, String>of("newModelName", _name);
    String _content = move.getNewModel().getContent();
    Pair<String, String> _mappedTo_1 = Pair.<String, String>of("newModelContents", _content);
    String _name_1 = move.getModel().getName();
    Pair<String, String> _mappedTo_2 = Pair.<String, String>of("oldModelName", _name_1);
    return Boolean.valueOf(this.execute("replaceModel", 
      Collections.<Pair<String, String>>unmodifiableList(CollectionLiterals.<Pair<String, String>>newArrayList(_mappedTo, _mappedTo_1, _mappedTo_2))));
  }

  private Boolean _updateTheoryStore(final CounterModel move) {
    String _name = move.getModel().getName();
    Pair<String, String> _mappedTo = Pair.<String, String>of("modelName", _name);
    String _name_1 = move.getRequirement().getName();
    Pair<String, String> _mappedTo_1 = Pair.<String, String>of("requirementName", _name_1);
    String _name_2 = move.getExperiment().getName();
    Pair<String, String> _mappedTo_2 = Pair.<String, String>of("experimentName", _name_2);
    String _content = move.getExperiment().getContent();
    Pair<String, String> _mappedTo_3 = Pair.<String, String>of("experimentContents", _content);
    return Boolean.valueOf(this.execute("counterModel", 
      Collections.<Pair<String, String>>unmodifiableList(CollectionLiterals.<Pair<String, String>>newArrayList(_mappedTo, _mappedTo_1, _mappedTo_2, _mappedTo_3))));
  }

  private Boolean _updateTheoryStore(final AttackModel move) {
    String _name = move.getModel().getName();
    Pair<String, String> _mappedTo = Pair.<String, String>of("modelName", _name);
    Theory _theory = move.getTheory();
    String _content = ((GeneralTheory) _theory).getContent();
    Pair<String, String> _mappedTo_1 = Pair.<String, String>of("theoryContents", _content);
    String _name_1 = move.getTheory().getName();
    Pair<String, String> _mappedTo_2 = Pair.<String, String>of("theoryName", _name_1);
    return Boolean.valueOf(this.execute("attackModel", 
      Collections.<Pair<String, String>>unmodifiableList(CollectionLiterals.<Pair<String, String>>newArrayList(_mappedTo, _mappedTo_1, _mappedTo_2))));
  }

  private Boolean _updateTheoryStore(final ProposeExperiment move) {
    String _name = move.getModel().getName();
    Pair<String, String> _mappedTo = Pair.<String, String>of("modelName", _name);
    String _name_1 = move.getRequirement().getName();
    Pair<String, String> _mappedTo_1 = Pair.<String, String>of("requirementName", _name_1);
    String _name_2 = move.getExperiment().getName();
    Pair<String, String> _mappedTo_2 = Pair.<String, String>of("experimentName", _name_2);
    String _content = move.getExperiment().getContent();
    Pair<String, String> _mappedTo_3 = Pair.<String, String>of("experimentContents", _content);
    return Boolean.valueOf(this.execute("proposeExperiment", 
      Collections.<Pair<String, String>>unmodifiableList(CollectionLiterals.<Pair<String, String>>newArrayList(_mappedTo, _mappedTo_1, _mappedTo_2, _mappedTo_3))));
  }

  private Boolean _updateTheoryStore(final SupportExperiment move) {
    String _name = move.getExperiment().getName();
    Pair<String, String> _mappedTo = Pair.<String, String>of("experimentName", _name);
    String _name_1 = move.getTheory().getName();
    Pair<String, String> _mappedTo_1 = Pair.<String, String>of("theoryName", _name_1);
    Theory _theory = move.getTheory();
    String _content = ((GeneralTheory) _theory).getContent();
    Pair<String, String> _mappedTo_2 = Pair.<String, String>of("theoryContents", _content);
    return Boolean.valueOf(this.execute("supportExperiment", 
      Collections.<Pair<String, String>>unmodifiableList(CollectionLiterals.<Pair<String, String>>newArrayList(_mappedTo, _mappedTo_1, _mappedTo_2))));
  }

  private Boolean _updateTheoryStore(final AttackExperiment move) {
    String _name = move.getExperiment().getName();
    Pair<String, String> _mappedTo = Pair.<String, String>of("experimentName", _name);
    String _name_1 = move.getTheory().getName();
    Pair<String, String> _mappedTo_1 = Pair.<String, String>of("theoryName", _name_1);
    Theory _theory = move.getTheory();
    String _content = ((GeneralTheory) _theory).getContent();
    Pair<String, String> _mappedTo_2 = Pair.<String, String>of("theoryContents", _content);
    return Boolean.valueOf(this.execute("attackExperiment", 
      Collections.<Pair<String, String>>unmodifiableList(CollectionLiterals.<Pair<String, String>>newArrayList(_mappedTo, _mappedTo_1, _mappedTo_2))));
  }

  private Boolean _updateTheoryStore(final RetractExperiment move) {
    String _name = move.getExperiment().getName();
    Pair<String, String> _mappedTo = Pair.<String, String>of("experimentName", _name);
    return Boolean.valueOf(this.execute("retractExperiment", Collections.<Pair<String, String>>unmodifiableList(CollectionLiterals.<Pair<String, String>>newArrayList(_mappedTo))));
  }

  private Boolean _updateTheoryStore(final NotConvinced move) {
    String _name = move.getModel().getName();
    Pair<String, String> _mappedTo = Pair.<String, String>of("modelName", _name);
    return Boolean.valueOf(this.execute("notConvinced", Collections.<Pair<String, String>>unmodifiableList(CollectionLiterals.<Pair<String, String>>newArrayList(_mappedTo))));
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

  private Boolean updateTheoryStore(final Move move) {
    if (move instanceof AttackExperiment) {
      return _updateTheoryStore((AttackExperiment)move);
    } else if (move instanceof AttackModel) {
      return _updateTheoryStore((AttackModel)move);
    } else if (move instanceof AttackRequirement) {
      return _updateTheoryStore((AttackRequirement)move);
    } else if (move instanceof CounterModel) {
      return _updateTheoryStore((CounterModel)move);
    } else if (move instanceof NotConvinced) {
      return _updateTheoryStore((NotConvinced)move);
    } else if (move instanceof ProposeExperiment) {
      return _updateTheoryStore((ProposeExperiment)move);
    } else if (move instanceof ProposeModel) {
      return _updateTheoryStore((ProposeModel)move);
    } else if (move instanceof ProposeRequirement) {
      return _updateTheoryStore((ProposeRequirement)move);
    } else if (move instanceof RedefineRequirement) {
      return _updateTheoryStore((RedefineRequirement)move);
    } else if (move instanceof ReplaceModel) {
      return _updateTheoryStore((ReplaceModel)move);
    } else if (move instanceof RetractExperiment) {
      return _updateTheoryStore((RetractExperiment)move);
    } else if (move instanceof RetractRequirement) {
      return _updateTheoryStore((RetractRequirement)move);
    } else if (move instanceof SupportExperiment) {
      return _updateTheoryStore((SupportExperiment)move);
    } else if (move instanceof SupportModel) {
      return _updateTheoryStore((SupportModel)move);
    } else if (move instanceof SupportRequirement) {
      return _updateTheoryStore((SupportRequirement)move);
    } else if (move != null) {
      return _updateTheoryStore(move);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(move).toString());
    }
  }
}
