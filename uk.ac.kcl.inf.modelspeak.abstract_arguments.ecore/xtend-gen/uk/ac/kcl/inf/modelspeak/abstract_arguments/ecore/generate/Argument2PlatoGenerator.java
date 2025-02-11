package uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.generate;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgument;
import uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgumentAttack;
import uk.ac.kcl.inf.modelspeak.abstract_arguments.ecore.abstract_arguments.AbstractArgumentFramework;

@SuppressWarnings("all")
public class Argument2PlatoGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EObject _head = IterableExtensions.<EObject>head(resource.getContents());
    fsa.generateFile(this.getPlatoFileName(resource), this.generate(((AbstractArgumentFramework) _head)));
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

  public CharSequence generate(final AbstractArgumentFramework framework) {
    StringConcatenation _builder = new StringConcatenation();
    final Function1<AbstractArgument, Long> _function = (AbstractArgument it) -> {
      return Long.valueOf(it.getId());
    };
    String _join = IterableExtensions.join(ListExtensions.<AbstractArgument, Long>map(framework.getArguments(), _function), System.lineSeparator());
    _builder.append(_join);
    _builder.newLineIfNotEmpty();
    _builder.append("#");
    _builder.newLine();
    final Function1<AbstractArgumentAttack, CharSequence> _function_1 = (AbstractArgumentAttack it) -> {
      return this.generateAttack(it);
    };
    String _join_1 = IterableExtensions.join(ListExtensions.<AbstractArgumentAttack, CharSequence>map(framework.getAttacks(), _function_1), System.lineSeparator());
    _builder.append(_join_1);
    _builder.newLineIfNotEmpty();
    return _builder;
  }

  public CharSequence generateAttack(final AbstractArgumentAttack aaa) {
    StringConcatenation _builder = new StringConcatenation();
    long _id = aaa.getSource().getId();
    _builder.append(_id);
    _builder.append(" ");
    long _id_1 = aaa.getTarget().getId();
    _builder.append(_id_1);
    return _builder;
  }
}
