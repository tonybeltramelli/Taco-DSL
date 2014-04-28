package dk.itu.smdp.survey.xtext.generator

import SurveyModel.Question
import SurveyModel.Survey
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

abstract class SurveyGenerator
{
	protected int _questionCounter;
	
	abstract def void generate(Resource resource, IFileSystemAccess fsa)
	abstract def String compile(Survey it)
	abstract def String compileQuestion(Question it, String id)
	
	def protected void _incrementQuestion()
	{
		_questionCounter = _questionCounter + 1;
	}
}