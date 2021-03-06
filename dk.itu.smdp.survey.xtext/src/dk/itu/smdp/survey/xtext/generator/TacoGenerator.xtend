/*
 * generated by Xtext
 */
package dk.itu.smdp.survey.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class TacoGenerator implements IGenerator
{	
	override void doGenerate(Resource resource, IFileSystemAccess fsa)
	{
		new HTML5Generator().generate(resource, fsa);
		new AndroidGenerator().generate(resource, fsa);
	}
}
