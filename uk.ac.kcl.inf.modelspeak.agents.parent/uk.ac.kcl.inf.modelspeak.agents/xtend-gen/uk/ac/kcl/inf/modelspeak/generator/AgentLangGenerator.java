/**
 * generated by Xtext 2.35.0
 */
package uk.ac.kcl.inf.modelspeak.generator;

import com.google.common.collect.Iterables;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import uk.ac.kcl.inf.modelspeak.agentLang.AttackExperiment;
import uk.ac.kcl.inf.modelspeak.agentLang.AttackModel;
import uk.ac.kcl.inf.modelspeak.agentLang.AttackRequirement;
import uk.ac.kcl.inf.modelspeak.agentLang.CounterModel;
import uk.ac.kcl.inf.modelspeak.agentLang.Game;
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
import uk.ac.kcl.inf.modelspeak.theoryStoreLang.Element;
import uk.ac.kcl.inf.modelspeak.theoryStoreLang.Experiment;
import uk.ac.kcl.inf.modelspeak.theoryStoreLang.Model;
import uk.ac.kcl.inf.modelspeak.theoryStoreLang.Requirement;
import uk.ac.kcl.inf.modelspeak.theoryStoreLang.Theory;
import uk.ac.kcl.inf.modelspeak.theoryStoreLang.TheoryStore;
import uk.ac.kcl.inf.modelspeak.theoryStoreLang.TheoryStoreLangFactory;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class AgentLangGenerator extends AbstractGenerator {
  @Extension
  private final TheoryStoreLangFactory factory = TheoryStoreLangFactory.eINSTANCE;

  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Consumer<Game> _function = (Game it) -> {
      this.generateTheoryStore(it, resource, fsa);
    };
    Iterables.<Game>filter(resource.getContents(), Game.class).forEach(_function);
  }

  public void generateTheoryStore(final Game game, final Resource resource, final IFileSystemAccess2 fsa) {
    try {
      final TheoryStore theoryStore = this.factory.createTheoryStore();
      final HashMap<String, Requirement> requirementMap = new HashMap<String, Requirement>();
      final HashMap<String, Model> modelMap = new HashMap<String, Model>();
      final HashMap<String, Experiment> experimentMap = new HashMap<String, Experiment>();
      final HashMap<String, Theory> theoryMap = new HashMap<String, Theory>();
      final Consumer<Move> _function = (Move it) -> {
        this.updateTheoryStore(it, theoryStore, requirementMap, modelMap, experimentMap, theoryMap);
      };
      game.getMoves().forEach(_function);
      final URI outputUri = fsa.getURI("theoryStoreOutput.theoryStore");
      final ResourceSet resourceSet = resource.getResourceSet();
      final Resource newResource = resourceSet.createResource(outputUri);
      EList<EObject> _contents = newResource.getContents();
      _contents.add(theoryStore);
      newResource.save(SaveOptions.newBuilder().format().getOptions().toOptionsMap());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  /**
   * Update the theory store with the consequences of the given move, using the various maps to track referenced
   * elements and their representation in the theory store.
   */
  private Boolean _updateTheoryStore(final Move move, final TheoryStore theoryStore, final Map<String, Requirement> requirementMap, final Map<String, Model> modelMap, final Map<String, Experiment> experimentMap, final Map<String, Theory> theoryMap) {
    return null;
  }

  private Boolean _updateTheoryStore(final ProposeRequirement move, final TheoryStore theoryStore, final Map<String, Requirement> requirementMap, final Map<String, Model> modelMap, final Map<String, Experiment> experimentMap, final Map<String, Theory> theoryMap) {
    boolean _xblockexpression = false;
    {
      final Requirement req = this.factory.createRequirement();
      req.setName(move.getRequirement().getName());
      req.setContent(move.getRequirement().getContent());
      requirementMap.put(req.getName(), req);
      EList<Element> _elements = theoryStore.getElements();
      _xblockexpression = _elements.add(req);
    }
    return Boolean.valueOf(_xblockexpression);
  }

  private Boolean _updateTheoryStore(final AttackRequirement move, final TheoryStore theoryStore, final Map<String, Requirement> requirementMap, final Map<String, Model> modelMap, final Map<String, Experiment> experimentMap, final Map<String, Theory> theoryMap) {
    boolean _xblockexpression = false;
    {
      final Theory theory = this.factory.createTheory();
      theory.setName(move.getTheory().getName());
      theory.setContent(move.getTheory().getContent());
      String _name = move.getRequirement().getName();
      boolean _tripleNotEquals = (_name != null);
      if (_tripleNotEquals) {
        EList<Element> _elements = theory.getElements();
        Experiment _get = experimentMap.get(move.getRequirement().getName());
        _elements.add(_get);
      }
      theoryMap.put(theory.getName(), theory);
      EList<Element> _elements_1 = theoryStore.getElements();
      _xblockexpression = _elements_1.add(theory);
    }
    return Boolean.valueOf(_xblockexpression);
  }

  private Boolean _updateTheoryStore(final RedefineRequirement move, final TheoryStore theoryStore, final Map<String, Requirement> requirementMap, final Map<String, Model> modelMap, final Map<String, Experiment> experimentMap, final Map<String, Theory> theoryMap) {
    boolean _xblockexpression = false;
    {
      final Requirement newReq = this.factory.createRequirement();
      newReq.setName(move.getNewRequirement().getName());
      newReq.setContent(move.getNewRequirement().getContent());
      String _name = move.getRequirement().getName();
      boolean _tripleNotEquals = (_name != null);
      if (_tripleNotEquals) {
        final Requirement oldReq = requirementMap.remove(move.getRequirement().getName());
        final Consumer<Model> _function = (Model model) -> {
          boolean _contains = model.getRequirements().contains(oldReq);
          if (_contains) {
            model.getRequirements().remove(oldReq);
            model.getRequirements().add(newReq);
          }
        };
        modelMap.values().forEach(_function);
        final Function1<Theory, Boolean> _function_1 = (Theory theory) -> {
          return Boolean.valueOf(theory.getElements().contains(oldReq));
        };
        final Iterable<Theory> theoriesToRemove = IterableExtensions.<Theory>filter(Iterables.<Theory>filter(theoryStore.getElements(), Theory.class), _function_1);
        final Consumer<Theory> _function_2 = (Theory theory) -> {
          theoryStore.getElements().remove(theory);
        };
        theoriesToRemove.forEach(_function_2);
        theoryStore.getElements().remove(move.getRequirement().getName());
      }
      requirementMap.put(newReq.getName(), newReq);
      EList<Element> _elements = theoryStore.getElements();
      _xblockexpression = _elements.add(newReq);
    }
    return Boolean.valueOf(_xblockexpression);
  }

  private Boolean _updateTheoryStore(final RetractRequirement move, final TheoryStore theoryStore, final Map<String, Requirement> requirementMap, final Map<String, Model> modelMap, final Map<String, Experiment> experimentMap, final Map<String, Theory> theoryMap) {
    boolean _xifexpression = false;
    String _name = move.getRequirement().getName();
    boolean _tripleNotEquals = (_name != null);
    if (_tripleNotEquals) {
      boolean _xblockexpression = false;
      {
        requirementMap.remove(move.getRequirement().getName());
        final Function1<Theory, Boolean> _function = (Theory theory) -> {
          return Boolean.valueOf(theory.getElements().contains(move.getRequirement()));
        };
        final Iterable<Theory> theoriesToRemove = IterableExtensions.<Theory>filter(Iterables.<Theory>filter(theoryStore.getElements(), Theory.class), _function);
        final Consumer<Theory> _function_1 = (Theory theory) -> {
          theoryStore.getElements().remove(theory);
        };
        theoriesToRemove.forEach(_function_1);
        _xblockexpression = theoryStore.getElements().remove(move.getRequirement().getName());
      }
      _xifexpression = _xblockexpression;
    }
    return Boolean.valueOf(_xifexpression);
  }

  private Boolean _updateTheoryStore(final SupportRequirement move, final TheoryStore theoryStore, final Map<String, Requirement> requirementMap, final Map<String, Model> modelMap, final Map<String, Experiment> experimentMap, final Map<String, Theory> theoryMap) {
    boolean _xblockexpression = false;
    {
      final Theory theory = this.factory.createTheory();
      theory.setName(move.getTheory().getName());
      theory.setContent(move.getTheory().getContent());
      String _name = move.getRequirement().getName();
      boolean _tripleNotEquals = (_name != null);
      if (_tripleNotEquals) {
        EList<Element> _elements = theory.getElements();
        Requirement _get = requirementMap.get(move.getRequirement().getName());
        _elements.add(_get);
      }
      theoryMap.put(theory.getName(), theory);
      EList<Element> _elements_1 = theoryStore.getElements();
      _xblockexpression = _elements_1.add(theory);
    }
    return Boolean.valueOf(_xblockexpression);
  }

  private Boolean _updateTheoryStore(final ProposeModel move, final TheoryStore theoryStore, final Map<String, Requirement> requirementMap, final Map<String, Model> modelMap, final Map<String, Experiment> experimentMap, final Map<String, Theory> theoryMap) {
    boolean _xblockexpression = false;
    {
      final Model mdl = this.factory.createModel();
      mdl.setName(move.getModel().getName());
      mdl.setContent(move.getModel().getContent());
      String _name = move.getRequirement().getName();
      boolean _tripleNotEquals = (_name != null);
      if (_tripleNotEquals) {
        EList<Requirement> _requirements = mdl.getRequirements();
        Requirement _get = requirementMap.get(move.getRequirement().getName());
        _requirements.add(_get);
      }
      modelMap.put(mdl.getName(), mdl);
      EList<Element> _elements = theoryStore.getElements();
      _xblockexpression = _elements.add(mdl);
    }
    return Boolean.valueOf(_xblockexpression);
  }

  private Boolean _updateTheoryStore(final SupportModel move, final TheoryStore theoryStore, final Map<String, Requirement> requirementMap, final Map<String, Model> modelMap, final Map<String, Experiment> experimentMap, final Map<String, Theory> theoryMap) {
    boolean _xblockexpression = false;
    {
      final Theory theory = this.factory.createTheory();
      theory.setName(move.getTheory().getName());
      theory.setContent(move.getTheory().getContent());
      String _name = move.getModel().getName();
      boolean _tripleNotEquals = (_name != null);
      if (_tripleNotEquals) {
        EList<Element> _elements = theory.getElements();
        Model _get = modelMap.get(move.getModel().getName());
        _elements.add(_get);
      }
      theoryMap.put(theory.getName(), theory);
      EList<Element> _elements_1 = theoryStore.getElements();
      _xblockexpression = _elements_1.add(theory);
    }
    return Boolean.valueOf(_xblockexpression);
  }

  private Boolean _updateTheoryStore(final ReplaceModel move, final TheoryStore theoryStore, final Map<String, Requirement> requirementMap, final Map<String, Model> modelMap, final Map<String, Experiment> experimentMap, final Map<String, Theory> theoryMap) {
    boolean _xblockexpression = false;
    {
      final Model newModel = this.factory.createModel();
      newModel.setName(move.getNewModel().getName());
      newModel.setContent(move.getNewModel().getContent());
      String _name = move.getModel().getName();
      boolean _tripleNotEquals = (_name != null);
      if (_tripleNotEquals) {
        final Model oldModel = modelMap.get(move.getModel().getName());
        if ((oldModel != null)) {
          newModel.getRequirements().addAll(oldModel.getRequirements());
          final Function1<Theory, Boolean> _function = (Theory theory) -> {
            return Boolean.valueOf(theory.getElements().contains(oldModel));
          };
          final List<Theory> theoriesToRemove = IterableExtensions.<Theory>toList(IterableExtensions.<Theory>filter(Iterables.<Theory>filter(theoryStore.getElements(), Theory.class), _function));
          final Function1<Experiment, Boolean> _function_1 = (Experiment experiment) -> {
            return Boolean.valueOf(experiment.getModel().contains(oldModel));
          };
          final List<Experiment> experimentsToRemove = IterableExtensions.<Experiment>toList(IterableExtensions.<Experiment>filter(Iterables.<Experiment>filter(theoryStore.getElements(), Experiment.class), _function_1));
          final Consumer<Theory> _function_2 = (Theory theory) -> {
            theoryStore.getElements().remove(theory);
          };
          theoriesToRemove.forEach(_function_2);
          final Consumer<Experiment> _function_3 = (Experiment experiment) -> {
            theoryStore.getElements().remove(experiment);
          };
          experimentsToRemove.forEach(_function_3);
          modelMap.remove(move.getModel().getName());
          theoryStore.getElements().remove(oldModel);
        } else {
          String _name_1 = move.getModel().getName();
          String _plus = ("Old model not found for name: " + _name_1);
          InputOutput.<String>println(_plus);
        }
      } else {
        InputOutput.<String>println("Move model name is null");
      }
      modelMap.put(newModel.getName(), newModel);
      EList<Element> _elements = theoryStore.getElements();
      _xblockexpression = _elements.add(newModel);
    }
    return Boolean.valueOf(_xblockexpression);
  }

  private Boolean _updateTheoryStore(final CounterModel move, final TheoryStore theoryStore, final Map<String, Requirement> requirementMap, final Map<String, Model> modelMap, final Map<String, Experiment> experimentMap, final Map<String, Theory> theoryMap) {
    boolean _xblockexpression = false;
    {
      final Experiment experiment = this.factory.createExperiment();
      experiment.setName(move.getExperiment().getName());
      experiment.setContent(move.getExperiment().getContent());
      String _name = move.getModel().getName();
      boolean _tripleNotEquals = (_name != null);
      if (_tripleNotEquals) {
        EList<Model> _model = experiment.getModel();
        Model _get = modelMap.get(move.getModel().getName());
        _model.add(_get);
      }
      String _name_1 = move.getRequirement().getName();
      boolean _tripleNotEquals_1 = (_name_1 != null);
      if (_tripleNotEquals_1) {
        EList<Requirement> _requirements = experiment.getRequirements();
        Requirement _get_1 = requirementMap.get(move.getRequirement().getName());
        _requirements.add(_get_1);
      }
      experimentMap.put(experiment.getName(), experiment);
      EList<Element> _elements = theoryStore.getElements();
      _xblockexpression = _elements.add(experiment);
    }
    return Boolean.valueOf(_xblockexpression);
  }

  private Boolean _updateTheoryStore(final AttackModel move, final TheoryStore theoryStore, final Map<String, Requirement> requirementMap, final Map<String, Model> modelMap, final Map<String, Experiment> experimentMap, final Map<String, Theory> theoryMap) {
    boolean _xblockexpression = false;
    {
      final Theory theory = this.factory.createTheory();
      theory.setName(move.getTheory().getName());
      theory.setContent(move.getTheory().getContent());
      String _name = move.getModel().getName();
      boolean _tripleNotEquals = (_name != null);
      if (_tripleNotEquals) {
        EList<Element> _elements = theory.getElements();
        Model _get = modelMap.get(move.getModel().getName());
        _elements.add(_get);
      }
      theoryMap.put(theory.getName(), theory);
      EList<Element> _elements_1 = theoryStore.getElements();
      _xblockexpression = _elements_1.add(theory);
    }
    return Boolean.valueOf(_xblockexpression);
  }

  private Boolean _updateTheoryStore(final ProposeExperiment move, final TheoryStore theoryStore, final Map<String, Requirement> requirementMap, final Map<String, Model> modelMap, final Map<String, Experiment> experimentMap, final Map<String, Theory> theoryMap) {
    boolean _xblockexpression = false;
    {
      final Experiment exp = this.factory.createExperiment();
      exp.setName(move.getExperiment().getName());
      exp.setContent(move.getExperiment().getContent());
      String _name = move.getModel().getName();
      boolean _tripleNotEquals = (_name != null);
      if (_tripleNotEquals) {
        EList<Model> _model = exp.getModel();
        Model _get = modelMap.get(move.getModel().getName());
        _model.add(_get);
      }
      String _name_1 = move.getRequirement().getName();
      boolean _tripleNotEquals_1 = (_name_1 != null);
      if (_tripleNotEquals_1) {
        EList<Requirement> _requirements = exp.getRequirements();
        Requirement _get_1 = requirementMap.get(move.getRequirement().getName());
        _requirements.add(_get_1);
      }
      experimentMap.put(exp.getName(), exp);
      EList<Element> _elements = theoryStore.getElements();
      _xblockexpression = _elements.add(exp);
    }
    return Boolean.valueOf(_xblockexpression);
  }

  private Boolean _updateTheoryStore(final SupportExperiment move, final TheoryStore theoryStore, final Map<String, Requirement> requirementMap, final Map<String, Model> modelMap, final Map<String, Experiment> experimentMap, final Map<String, Theory> theoryMap) {
    boolean _xblockexpression = false;
    {
      final Theory theory = this.factory.createTheory();
      theory.setName(move.getTheory().getName());
      theory.setContent(move.getTheory().getContent());
      String _name = move.getExperiment().getName();
      boolean _tripleNotEquals = (_name != null);
      if (_tripleNotEquals) {
        EList<Element> _elements = theory.getElements();
        Experiment _get = experimentMap.get(move.getExperiment().getName());
        _elements.add(_get);
      }
      theoryMap.put(theory.getName(), theory);
      EList<Element> _elements_1 = theoryStore.getElements();
      _xblockexpression = _elements_1.add(theory);
    }
    return Boolean.valueOf(_xblockexpression);
  }

  private Boolean _updateTheoryStore(final AttackExperiment move, final TheoryStore theoryStore, final Map<String, Requirement> requirementMap, final Map<String, Model> modelMap, final Map<String, Experiment> experimentMap, final Map<String, Theory> theoryMap) {
    boolean _xblockexpression = false;
    {
      final Theory theory = this.factory.createTheory();
      theory.setName(move.getTheory().getName());
      theory.setContent(move.getTheory().getContent());
      String _name = move.getExperiment().getName();
      boolean _tripleNotEquals = (_name != null);
      if (_tripleNotEquals) {
        EList<Element> _elements = theory.getElements();
        Experiment _get = experimentMap.get(move.getExperiment().getName());
        _elements.add(_get);
      }
      theoryMap.put(theory.getName(), theory);
      EList<Element> _elements_1 = theoryStore.getElements();
      _xblockexpression = _elements_1.add(theory);
    }
    return Boolean.valueOf(_xblockexpression);
  }

  private Boolean _updateTheoryStore(final RetractExperiment move, final TheoryStore theoryStore, final Map<String, Requirement> requirementMap, final Map<String, Model> modelMap, final Map<String, Experiment> experimentMap, final Map<String, Theory> theoryMap) {
    boolean _xifexpression = false;
    String _name = move.getExperiment().getName();
    boolean _tripleNotEquals = (_name != null);
    if (_tripleNotEquals) {
      boolean _xblockexpression = false;
      {
        experimentMap.remove(move.getExperiment().getName());
        _xblockexpression = theoryStore.getElements().remove(move.getExperiment().getName());
      }
      _xifexpression = _xblockexpression;
    }
    return Boolean.valueOf(_xifexpression);
  }

  private Boolean _updateTheoryStore(final NotConvinced move, final TheoryStore theoryStore, final Map<String, Requirement> requirementMap, final Map<String, Model> modelMap, final Map<String, Experiment> experimentMap, final Map<String, Theory> theoryMap) {
    boolean _xblockexpression = false;
    {
      final Theory theory = this.factory.createTheory();
      theory.setName("NoConfidence");
      String _name = move.getModel().getName();
      String _plus = ("No confidence in model " + _name);
      theory.setContent(_plus);
      String _name_1 = move.getModel().getName();
      boolean _tripleNotEquals = (_name_1 != null);
      if (_tripleNotEquals) {
        EList<Element> _elements = theory.getElements();
        Model _get = modelMap.get(move.getModel().getName());
        _elements.add(_get);
      }
      EList<Element> _elements_1 = theoryStore.getElements();
      _xblockexpression = _elements_1.add(theory);
    }
    return Boolean.valueOf(_xblockexpression);
  }

  private Boolean updateTheoryStore(final Move move, final TheoryStore theoryStore, final Map<String, Requirement> requirementMap, final Map<String, Model> modelMap, final Map<String, Experiment> experimentMap, final Map<String, Theory> theoryMap) {
    if (move instanceof AttackExperiment) {
      return _updateTheoryStore((AttackExperiment)move, theoryStore, requirementMap, modelMap, experimentMap, theoryMap);
    } else if (move instanceof AttackModel) {
      return _updateTheoryStore((AttackModel)move, theoryStore, requirementMap, modelMap, experimentMap, theoryMap);
    } else if (move instanceof AttackRequirement) {
      return _updateTheoryStore((AttackRequirement)move, theoryStore, requirementMap, modelMap, experimentMap, theoryMap);
    } else if (move instanceof CounterModel) {
      return _updateTheoryStore((CounterModel)move, theoryStore, requirementMap, modelMap, experimentMap, theoryMap);
    } else if (move instanceof NotConvinced) {
      return _updateTheoryStore((NotConvinced)move, theoryStore, requirementMap, modelMap, experimentMap, theoryMap);
    } else if (move instanceof ProposeExperiment) {
      return _updateTheoryStore((ProposeExperiment)move, theoryStore, requirementMap, modelMap, experimentMap, theoryMap);
    } else if (move instanceof ProposeModel) {
      return _updateTheoryStore((ProposeModel)move, theoryStore, requirementMap, modelMap, experimentMap, theoryMap);
    } else if (move instanceof ProposeRequirement) {
      return _updateTheoryStore((ProposeRequirement)move, theoryStore, requirementMap, modelMap, experimentMap, theoryMap);
    } else if (move instanceof RedefineRequirement) {
      return _updateTheoryStore((RedefineRequirement)move, theoryStore, requirementMap, modelMap, experimentMap, theoryMap);
    } else if (move instanceof ReplaceModel) {
      return _updateTheoryStore((ReplaceModel)move, theoryStore, requirementMap, modelMap, experimentMap, theoryMap);
    } else if (move instanceof RetractExperiment) {
      return _updateTheoryStore((RetractExperiment)move, theoryStore, requirementMap, modelMap, experimentMap, theoryMap);
    } else if (move instanceof RetractRequirement) {
      return _updateTheoryStore((RetractRequirement)move, theoryStore, requirementMap, modelMap, experimentMap, theoryMap);
    } else if (move instanceof SupportExperiment) {
      return _updateTheoryStore((SupportExperiment)move, theoryStore, requirementMap, modelMap, experimentMap, theoryMap);
    } else if (move instanceof SupportModel) {
      return _updateTheoryStore((SupportModel)move, theoryStore, requirementMap, modelMap, experimentMap, theoryMap);
    } else if (move instanceof SupportRequirement) {
      return _updateTheoryStore((SupportRequirement)move, theoryStore, requirementMap, modelMap, experimentMap, theoryMap);
    } else if (move != null) {
      return _updateTheoryStore(move, theoryStore, requirementMap, modelMap, experimentMap, theoryMap);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(move, theoryStore, requirementMap, modelMap, experimentMap, theoryMap).toString());
    }
  }
}
