package uk.ac.kcl.inf.modelspeak.arguments.ecore.generate;

import com.google.common.collect.Iterables;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentElement;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ArgumentGraph;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.Attack;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ExperimentResults;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.LiteratureEvidence;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.MechanismExplainsEffect;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.ModelMatchesDataOverTime;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.SimulationMechanismWarrant;
import uk.ac.kcl.inf.modelspeak.arguments.ecore.arguments.StandardSimulationWarrant;

@SuppressWarnings("all")
public class Argument2PlatoGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    fsa.generateFile(this.getPlatoFileName(resource), this.generate(((ArgumentGraph) _head)));
  }

  private String getPlatoFileName(final Resource resource) {
    String _xblockexpression = null;
    {
      final String origName = resource.getURI().lastSegment();
      String _substring = origName.substring(0, origName.lastIndexOf("."));
      _xblockexpression = (_substring + ".tgf");
    }
    return _xblockexpression;
  }

  public CharSequence generate(final ArgumentGraph graph) {
    CharSequence _xblockexpression = null;
    {
      final HashMap<ArgumentElement, String> argumentIDs = new HashMap<ArgumentElement, String>();
      StringConcatenation _builder = new StringConcatenation();
      final Function1<ArgumentElement, String> _function = (ArgumentElement it) -> {
        return this.generateLabel(it, argumentIDs);
      };
      String _join = IterableExtensions.join(ListExtensions.<ArgumentElement, String>map(graph.getArgumentElements(), _function), System.lineSeparator());
      _builder.append(_join);
      _builder.newLineIfNotEmpty();
      _builder.append("#");
      _builder.newLine();
      final Function1<Attack, CharSequence> _function_1 = (Attack it) -> {
        return this.generateAttack(it, argumentIDs);
      };
      String _join_1 = IterableExtensions.join(IterableExtensions.<Attack, CharSequence>map(Iterables.<Attack>filter(graph.getRelations(), Attack.class), _function_1), System.lineSeparator());
      _builder.append(_join_1);
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }

  private long nextID = 0L;

  public String generateLabel(final ArgumentElement ae, final Map<ArgumentElement, String> argumentIDs) {
    String _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      CharSequence _label = this.getLabel(ae);
      _builder.append(_label);
      long _plusPlus = this.nextID++;
      _builder.append(_plusPlus);
      final String label = _builder.toString();
      Pair<ArgumentElement, String> _mappedTo = Pair.<ArgumentElement, String>of(ae, label);
      argumentIDs.put(_mappedTo.getKey(), _mappedTo.getValue());
      _xblockexpression = label;
    }
    return _xblockexpression;
  }

  public CharSequence generateAttack(final Attack aer, @Extension final Map<ArgumentElement, String> argumentIDs) {
    StringConcatenation _builder = new StringConcatenation();
    String _get = argumentIDs.get(aer.getEvidence());
    _builder.append(_get);
    _builder.append(" ");
    String _get_1 = argumentIDs.get(aer.getClaim());
    _builder.append(_get_1);
    return _builder;
  }

  private CharSequence _getLabel(final ArgumentElement ae) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Argument Elements of type ");
    EClass _eClass = ae.eClass();
    _builder.append(_eClass);
    _builder.append(" not currently supported.");
    throw new UnsupportedOperationException(_builder.toString());
  }

  private CharSequence _getLabel(final SimulationMechanismWarrant smw) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("SMW");
    String _clean = this.clean(smw.getExplainedEffect());
    _builder.append(_clean);
    return _builder;
  }

  private CharSequence _getLabel(final StandardSimulationWarrant ssw) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("SSW");
    return _builder;
  }

  private CharSequence _getLabel(final LiteratureEvidence le) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("LE");
    String _clean = this.clean(le.getReference());
    _builder.append(_clean);
    return _builder;
  }

  private CharSequence _getLabel(final ModelMatchesDataOverTime mmdot) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("MMDOT");
    String _clean = this.clean(mmdot.getDataOverTime());
    _builder.append(_clean);
    return _builder;
  }

  private CharSequence _getLabel(final MechanismExplainsEffect mee) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("MEE");
    String _clean = this.clean(mee.getMechanism());
    _builder.append(_clean);
    return _builder;
  }

  private CharSequence _getLabel(final ExperimentResults er) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("ER");
    String _clean = this.clean(er.getResults());
    _builder.append(_clean);
    return _builder;
  }

  private String clean(final String s) {
    return s.replaceAll("[\\s(){}\\[\\]\\.]", "");
  }

  private CharSequence getLabel(final ArgumentElement er) {
    if (er instanceof ExperimentResults) {
      return _getLabel((ExperimentResults)er);
    } else if (er instanceof LiteratureEvidence) {
      return _getLabel((LiteratureEvidence)er);
    } else if (er instanceof MechanismExplainsEffect) {
      return _getLabel((MechanismExplainsEffect)er);
    } else if (er instanceof ModelMatchesDataOverTime) {
      return _getLabel((ModelMatchesDataOverTime)er);
    } else if (er instanceof SimulationMechanismWarrant) {
      return _getLabel((SimulationMechanismWarrant)er);
    } else if (er instanceof StandardSimulationWarrant) {
      return _getLabel((StandardSimulationWarrant)er);
    } else if (er != null) {
      return _getLabel(er);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(er).toString());
    }
  }
}
