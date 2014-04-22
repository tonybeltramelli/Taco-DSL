package dk.itu.smdp.survey.xtext.generator

import SurveyModel.MultipleChoice
import SurveyModel.MutuallyExclusive
import SurveyModel.OpenField
import SurveyModel.Question
import SurveyModel.Ranking
import SurveyModel.Rating
import SurveyModel.Survey
import SurveyModel.YesNo
import java.io.UnsupportedEncodingException
import java.util.Arrays
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

class AndroidGenerator extends SurveyGenerator {
	private int _pageCounter;

	def override generate(Resource resource, IFileSystemAccess fsa) {
		resource.allContents.toIterable.filter(typeof(Survey)).forEach [ Survey it |
			fsa.generateFile("android/Survey.java", it.compile)
		]
	}

	def override compile(Survey it) {
		'''
			package dk.itu.smdp.model;
			
			import dk.itu.smdp.model.answer.Answer;
			import dk.itu.smdp.model.answer.AnswerFactory;
			import dk.itu.smdp.model.question.Question;
			import dk.itu.smdp.model.question.QuestionFactory;
			
			import java.util.ArrayList;
			import java.util.Date;
			
			public class Survey
			{	
				private String _title;
				private String _description;
				private Date _date;
				private boolean _isAnonymous;
				
				private Person _person;
				
				private ArrayList<Category> _categories;
				
				private static Survey _instance;
				
				public static Survey getInstance()
				{
					if (_instance == null) _instance = new Survey();
					
					return _instance;
				}
				
				private Survey()
				{
					_categories = new ArrayList<Category>();
					_isAnonymous = true;
					init();
				}
				
				public String getTitle()
				{
					return _title;
				}
				
				public void setTitle(String title)
				{
					this._title = title;
				}
				
				public String getDescription()
				{
					return _description;
				}
				
				public void setDescription(String description)
				{
					this._description = description;
				}
				
				public Date getDate()
				{
					return _date;
				}
				
				public void setDate(Date date)
				{
					this._date = date;
				}
				
				public void setPerson(Person person)
				{
					_isAnonymous = false;
					_person = person;
				}
				
				public Person getPerson()
				{
					return _person;
				}
				
				public boolean isAnonymous()
				{
					return _isAnonymous;
				}
				
				public ArrayList<Category> getCategories()
				{
					return _categories;
				}
				
				public void setCategories(ArrayList<Category> categories)
				{
					this._categories = categories;
				}
				
				public void addCategory(Category c)
				{
					_categories.add(c);
				}
				
				private void init()
				{
					this.setTitle("«title»");
					this.setDescription("«description»");
					
					«IF person != null»
						«FOR attribute : person.attribute»
							PersonAttribute «_getIdentifier(attribute.key)» = new PersonAttribute("«attribute.key»");
						«ENDFOR»
						
							Person p = new Person();
							«FOR attribute : person.attribute»
								p.addAttribute(«_getIdentifier(attribute.key)»);
							«ENDFOR»
							this.setPerson(p);
					«ENDIF»
					
					«FOR category : categories»
						
						Category «_getIdentifier(category.title)» = new Category("«category.title»", "«category.description»");
						
						«FOR page : category.pages»
							
							«FOR question : page.questions»
								«compileQuestion(question)»
							«ENDFOR»
							
							«_incrementPage()»
							
							Page page«_pageCounter» = new Page();
							
							«FOR question : page.questions»
								page«_pageCounter».addQuestion(«_getIdentifier(question.questionText)»);
							«ENDFOR»
							
							«_getIdentifier(category.title)».addPage(page«_pageCounter»);
						«ENDFOR»
						
						this.addCategory(«_getIdentifier(category.title)»);
						
					«ENDFOR»
				}
			}
		'''
	}

	def override String compileQuestion(Question it) {
		'''
			«IF (it instanceof OpenField)»
				Question «_getIdentifier(questionText)» = QuestionFactory.create(Question.OPEN_FIELD, «isMandatory», "«questionText»");								            
			«ENDIF»
			
			«IF (it instanceof Ranking)»
				Question «_getIdentifier(questionText)» = QuestionFactory.create(Question.RANKING, «isMandatory», "«questionText»");
				
				«FOR answer : answers»
					«_getIdentifier(questionText)».addAnswer(AnswerFactory.create(Answer.RANKING, "«answer.description»"));		
					«ENDFOR»
				«ENDIF»
				
				«IF (it instanceof YesNo)»
					Question «_getIdentifier(questionText)» = QuestionFactory.create(Question.YES_NO, «isMandatory», "«questionText»");
				«ELSEIF (it instanceof Rating)»
					Question «_getIdentifier(questionText)» = QuestionFactory.create(Question.RATING, «isMandatory», "«questionText»", «(it as Rating).start», «(it as Rating).end», «(it as Rating).interval»);
				«ELSEIF (it instanceof MutuallyExclusive)»
					Question «_getIdentifier(questionText)» = QuestionFactory.create(Question.MUTUALLY_EXCLUSIVE, «isMandatory», "«questionText»");
					
					«FOR answer : answers»
						«IF !answer.isUserInputAllowed»
							«_getIdentifier(questionText)».addAnswer(AnswerFactory.create(Answer.BINARY, "«answer.description»"));	
						«ELSE»
							«_getIdentifier(questionText)».addAnswer(AnswerFactory.create(Answer.USER_INPUT, "«answer.description»"));
						«ENDIF»
					«ENDFOR»
				«ELSEIF (it instanceof MultipleChoice)»
					Question «_getIdentifier(questionText)» = QuestionFactory.create(Question.MULTIPLE_CHOICE, «isMandatory», "«questionText»", «(it as MultipleChoice).min», «(it as MultipleChoice).max»);
					
					«FOR answer : answers»
						«IF !answer.isUserInputAllowed»
							«_getIdentifier(questionText)».addAnswer(AnswerFactory.create(Answer.BINARY, "«answer.description»"));	
						«ELSE»
							«_getIdentifier(questionText)».addAnswer(AnswerFactory.create(Answer.USER_INPUT, "«answer.description»"));
						«ENDIF»
					«ENDFOR»
				«ENDIF»
				
			'''
	}
	
	def private void _incrementPage()
	{
		_pageCounter = _pageCounter + 1;
	}
	
	def private _getIdentifier(String it) {
		try {
			Arrays.toString(getBytes("UTF-8")).replaceAll("\\D+", "_");
		} catch (UnsupportedEncodingException e) {
			null;
		}
	}
}
