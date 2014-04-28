package dk.itu.smdp.survey.xtext.serializer;

import SurveyModel.Answer;
import SurveyModel.Category;
import SurveyModel.MultipleChoice;
import SurveyModel.MutuallyExclusive;
import SurveyModel.OpenField;
import SurveyModel.Page;
import SurveyModel.Person;
import SurveyModel.PersonAttribute;
import SurveyModel.Ranking;
import SurveyModel.Rating;
import SurveyModel.Survey;
import SurveyModel.SurveyModelPackage;
import SurveyModel.YesNo;
import com.google.inject.Inject;
import com.google.inject.Provider;
import dk.itu.smdp.survey.xtext.services.TacoGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractTacoSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TacoGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SurveyModelPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SurveyModelPackage.ANSWER:
				if(context == grammarAccess.getAnswerRule()) {
					sequence_Answer(context, (Answer) semanticObject); 
					return; 
				}
				else break;
			case SurveyModelPackage.CATEGORY:
				if(context == grammarAccess.getCategoryRule()) {
					sequence_Category(context, (Category) semanticObject); 
					return; 
				}
				else break;
			case SurveyModelPackage.MULTIPLE_CHOICE:
				if(context == grammarAccess.getMultipleChoice_ImplRule() ||
				   context == grammarAccess.getQuestionRule()) {
					sequence_MultipleChoice_Impl(context, (MultipleChoice) semanticObject); 
					return; 
				}
				else break;
			case SurveyModelPackage.MUTUALLY_EXCLUSIVE:
				if(context == grammarAccess.getMutuallyExclusive_ImplRule() ||
				   context == grammarAccess.getQuestionRule()) {
					sequence_MutuallyExclusive_Impl(context, (MutuallyExclusive) semanticObject); 
					return; 
				}
				else break;
			case SurveyModelPackage.OPEN_FIELD:
				if(context == grammarAccess.getOpenFieldRule() ||
				   context == grammarAccess.getQuestionRule()) {
					sequence_OpenField(context, (OpenField) semanticObject); 
					return; 
				}
				else break;
			case SurveyModelPackage.PAGE:
				if(context == grammarAccess.getPageRule()) {
					sequence_Page(context, (Page) semanticObject); 
					return; 
				}
				else break;
			case SurveyModelPackage.PERSON:
				if(context == grammarAccess.getPersonRule()) {
					sequence_Person(context, (Person) semanticObject); 
					return; 
				}
				else break;
			case SurveyModelPackage.PERSON_ATTRIBUTE:
				if(context == grammarAccess.getPersonAttributeRule()) {
					sequence_PersonAttribute(context, (PersonAttribute) semanticObject); 
					return; 
				}
				else break;
			case SurveyModelPackage.RANKING:
				if(context == grammarAccess.getQuestionRule() ||
				   context == grammarAccess.getRankingRule()) {
					sequence_Ranking(context, (Ranking) semanticObject); 
					return; 
				}
				else break;
			case SurveyModelPackage.RATING:
				if(context == grammarAccess.getQuestionRule() ||
				   context == grammarAccess.getRatingRule()) {
					sequence_Rating(context, (Rating) semanticObject); 
					return; 
				}
				else break;
			case SurveyModelPackage.SURVEY:
				if(context == grammarAccess.getSurveyRule()) {
					sequence_Survey(context, (Survey) semanticObject); 
					return; 
				}
				else break;
			case SurveyModelPackage.YES_NO:
				if(context == grammarAccess.getQuestionRule() ||
				   context == grammarAccess.getYesNoRule()) {
					sequence_YesNo(context, (YesNo) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (description=EString isUserInputAllowed?='['? (subquestion+=Question subquestion+=Question*)?)
	 */
	protected void sequence_Answer(EObject context, Answer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (title=EString description=EString? pages+=Page pages+=Page*)
	 */
	protected void sequence_Category(EObject context, Category semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         isMandatory?='*'? 
	 *         questionText=EString 
	 *         min=EInt 
	 *         max=EInt 
	 *         answers+=Answer 
	 *         answers+=Answer*
	 *     )
	 */
	protected void sequence_MultipleChoice_Impl(EObject context, MultipleChoice semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isMandatory?='*'? questionText=EString answers+=Answer answers+=Answer*)
	 */
	protected void sequence_MutuallyExclusive_Impl(EObject context, MutuallyExclusive semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isMandatory?='*'? questionText=EString)
	 */
	protected void sequence_OpenField(EObject context, OpenField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (questions+=Question questions+=Question*)
	 */
	protected void sequence_Page(EObject context, Page semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     key=EString
	 */
	protected void sequence_PersonAttribute(EObject context, PersonAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SurveyModelPackage.Literals.PERSON_ATTRIBUTE__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SurveyModelPackage.Literals.PERSON_ATTRIBUTE__KEY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPersonAttributeAccess().getKeyEStringParserRuleCall_0(), semanticObject.getKey());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (attribute+=PersonAttribute attribute+=PersonAttribute*)
	 */
	protected void sequence_Person(EObject context, Person semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isMandatory?='*'? questionText=EString answers+=Answer answers+=Answer*)
	 */
	protected void sequence_Ranking(EObject context, Ranking semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isMandatory?='*'? questionText=EString start=EInt end=EInt interval=EInt)
	 */
	protected void sequence_Rating(EObject context, Rating semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         title=EString 
	 *         date=EString? 
	 *         description=EString? 
	 *         email=EString? 
	 *         person=Person? 
	 *         categories+=Category 
	 *         categories+=Category*
	 *     )
	 */
	protected void sequence_Survey(EObject context, Survey semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (isMandatory?='*'? questionText=EString)
	 */
	protected void sequence_YesNo(EObject context, YesNo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
