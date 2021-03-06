/**
 * generated by Xtext
 */
package dk.itu.smdp.survey.xtext.generator;

import dk.itu.smdp.survey.xtext.generator.AndroidGenerator;
import dk.itu.smdp.survey.xtext.generator.HTML5Generator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
@SuppressWarnings("all")
public class TacoGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    HTML5Generator _hTML5Generator = new HTML5Generator();
    _hTML5Generator.generate(resource, fsa);
    AndroidGenerator _androidGenerator = new AndroidGenerator();
    _androidGenerator.generate(resource, fsa);
  }
}
