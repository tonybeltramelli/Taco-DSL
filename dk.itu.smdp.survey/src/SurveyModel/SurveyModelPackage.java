/**
 */
package SurveyModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see SurveyModel.SurveyModelFactory
 * @model kind="package"
 * @generated
 */
public interface SurveyModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "SurveyModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/dk.itu.smdp.survey/model/SurveyModel.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "survey";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SurveyModelPackage eINSTANCE = SurveyModel.impl.SurveyModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link SurveyModel.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SurveyModel.impl.CategoryImpl
	 * @see SurveyModel.impl.SurveyModelPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 0;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__STEPS = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SurveyModel.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SurveyModel.impl.StepImpl
	 * @see SurveyModel.impl.SurveyModelPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 1;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__QUESTIONS = 0;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SurveyModel.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SurveyModel.impl.QuestionImpl
	 * @see SurveyModel.impl.SurveyModelPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 2;

	/**
	 * The feature id for the '<em><b>Subquestion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__SUBQUESTION = 0;

	/**
	 * The feature id for the '<em><b>Question Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__QUESTION_TEXT = 1;

	/**
	 * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__IS_MANDATORY = 2;

	/**
	 * The feature id for the '<em><b>Option</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__OPTION = 3;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SurveyModel.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SurveyModel.impl.OptionImpl
	 * @see SurveyModel.impl.SurveyModelPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 3;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__CONTAINS = 0;

	/**
	 * The feature id for the '<em><b>Is Checked By Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__IS_CHECKED_BY_DEFAULT = 1;

	/**
	 * The feature id for the '<em><b>Is User Input Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__IS_USER_INPUT_ALLOWED = 2;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SurveyModel.impl.MultipleChoiceImpl <em>Multiple Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SurveyModel.impl.MultipleChoiceImpl
	 * @see SurveyModel.impl.SurveyModelPackageImpl#getMultipleChoice()
	 * @generated
	 */
	int MULTIPLE_CHOICE = 4;

	/**
	 * The feature id for the '<em><b>Subquestion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__SUBQUESTION = QUESTION__SUBQUESTION;

	/**
	 * The feature id for the '<em><b>Question Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__QUESTION_TEXT = QUESTION__QUESTION_TEXT;

	/**
	 * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__IS_MANDATORY = QUESTION__IS_MANDATORY;

	/**
	 * The feature id for the '<em><b>Option</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__OPTION = QUESTION__OPTION;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__MIN = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE__MAX = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multiple Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Multiple Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLE_CHOICE_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SurveyModel.impl.RankingImpl <em>Ranking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SurveyModel.impl.RankingImpl
	 * @see SurveyModel.impl.SurveyModelPackageImpl#getRanking()
	 * @generated
	 */
	int RANKING = 5;

	/**
	 * The feature id for the '<em><b>Subquestion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__SUBQUESTION = QUESTION__SUBQUESTION;

	/**
	 * The feature id for the '<em><b>Question Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__QUESTION_TEXT = QUESTION__QUESTION_TEXT;

	/**
	 * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__IS_MANDATORY = QUESTION__IS_MANDATORY;

	/**
	 * The feature id for the '<em><b>Option</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING__OPTION = QUESTION__OPTION;

	/**
	 * The number of structural features of the '<em>Ranking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ranking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANKING_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SurveyModel.impl.MutuallyExclusiveImpl <em>Mutually Exclusive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SurveyModel.impl.MutuallyExclusiveImpl
	 * @see SurveyModel.impl.SurveyModelPackageImpl#getMutuallyExclusive()
	 * @generated
	 */
	int MUTUALLY_EXCLUSIVE = 11;

	/**
	 * The feature id for the '<em><b>Subquestion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUALLY_EXCLUSIVE__SUBQUESTION = MULTIPLE_CHOICE__SUBQUESTION;

	/**
	 * The feature id for the '<em><b>Question Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUALLY_EXCLUSIVE__QUESTION_TEXT = MULTIPLE_CHOICE__QUESTION_TEXT;

	/**
	 * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUALLY_EXCLUSIVE__IS_MANDATORY = MULTIPLE_CHOICE__IS_MANDATORY;

	/**
	 * The feature id for the '<em><b>Option</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUALLY_EXCLUSIVE__OPTION = MULTIPLE_CHOICE__OPTION;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUALLY_EXCLUSIVE__MIN = MULTIPLE_CHOICE__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUALLY_EXCLUSIVE__MAX = MULTIPLE_CHOICE__MAX;

	/**
	 * The number of structural features of the '<em>Mutually Exclusive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUALLY_EXCLUSIVE_FEATURE_COUNT = MULTIPLE_CHOICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mutually Exclusive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MUTUALLY_EXCLUSIVE_OPERATION_COUNT = MULTIPLE_CHOICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SurveyModel.impl.RatingImpl <em>Rating</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SurveyModel.impl.RatingImpl
	 * @see SurveyModel.impl.SurveyModelPackageImpl#getRating()
	 * @generated
	 */
	int RATING = 6;

	/**
	 * The feature id for the '<em><b>Subquestion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__SUBQUESTION = MUTUALLY_EXCLUSIVE__SUBQUESTION;

	/**
	 * The feature id for the '<em><b>Question Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__QUESTION_TEXT = MUTUALLY_EXCLUSIVE__QUESTION_TEXT;

	/**
	 * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__IS_MANDATORY = MUTUALLY_EXCLUSIVE__IS_MANDATORY;

	/**
	 * The feature id for the '<em><b>Option</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__OPTION = MUTUALLY_EXCLUSIVE__OPTION;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__MIN = MUTUALLY_EXCLUSIVE__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__MAX = MUTUALLY_EXCLUSIVE__MAX;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__START = MUTUALLY_EXCLUSIVE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__END = MUTUALLY_EXCLUSIVE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING__INTERVAL = MUTUALLY_EXCLUSIVE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rating</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_FEATURE_COUNT = MUTUALLY_EXCLUSIVE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Rating</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RATING_OPERATION_COUNT = MUTUALLY_EXCLUSIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SurveyModel.impl.YesNoImpl <em>Yes No</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SurveyModel.impl.YesNoImpl
	 * @see SurveyModel.impl.SurveyModelPackageImpl#getYesNo()
	 * @generated
	 */
	int YES_NO = 7;

	/**
	 * The feature id for the '<em><b>Subquestion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_NO__SUBQUESTION = MUTUALLY_EXCLUSIVE__SUBQUESTION;

	/**
	 * The feature id for the '<em><b>Question Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_NO__QUESTION_TEXT = MUTUALLY_EXCLUSIVE__QUESTION_TEXT;

	/**
	 * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_NO__IS_MANDATORY = MUTUALLY_EXCLUSIVE__IS_MANDATORY;

	/**
	 * The feature id for the '<em><b>Option</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_NO__OPTION = MUTUALLY_EXCLUSIVE__OPTION;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_NO__MIN = MUTUALLY_EXCLUSIVE__MIN;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_NO__MAX = MUTUALLY_EXCLUSIVE__MAX;

	/**
	 * The number of structural features of the '<em>Yes No</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_NO_FEATURE_COUNT = MUTUALLY_EXCLUSIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Yes No</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int YES_NO_OPERATION_COUNT = MUTUALLY_EXCLUSIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SurveyModel.impl.DescriptionImpl <em>Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SurveyModel.impl.DescriptionImpl
	 * @see SurveyModel.impl.SurveyModelPackageImpl#getDescription()
	 * @generated
	 */
	int DESCRIPTION = 8;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SurveyModel.impl.OpenFieldImpl <em>Open Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SurveyModel.impl.OpenFieldImpl
	 * @see SurveyModel.impl.SurveyModelPackageImpl#getOpenField()
	 * @generated
	 */
	int OPEN_FIELD = 9;

	/**
	 * The feature id for the '<em><b>Subquestion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FIELD__SUBQUESTION = QUESTION__SUBQUESTION;

	/**
	 * The feature id for the '<em><b>Question Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FIELD__QUESTION_TEXT = QUESTION__QUESTION_TEXT;

	/**
	 * The feature id for the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FIELD__IS_MANDATORY = QUESTION__IS_MANDATORY;

	/**
	 * The feature id for the '<em><b>Option</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FIELD__OPTION = QUESTION__OPTION;

	/**
	 * The number of structural features of the '<em>Open Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FIELD_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Open Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_FIELD_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SurveyModel.impl.SurveyImpl <em>Survey</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SurveyModel.impl.SurveyImpl
	 * @see SurveyModel.impl.SurveyModelPackageImpl#getSurvey()
	 * @generated
	 */
	int SURVEY = 10;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__CATEGORIES = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__DATE = 2;

	/**
	 * The feature id for the '<em><b>Person</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__PERSON = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY__DESCRIPTION = 4;

	/**
	 * The number of structural features of the '<em>Survey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Survey</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURVEY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SurveyModel.impl.TextImpl <em>Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SurveyModel.impl.TextImpl
	 * @see SurveyModel.impl.SurveyModelPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 12;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT__CONTENT = DESCRIPTION__CONTENT;

	/**
	 * The number of structural features of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_FEATURE_COUNT = DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_OPERATION_COUNT = DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SurveyModel.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SurveyModel.impl.ImageImpl
	 * @see SurveyModel.impl.SurveyModelPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 13;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE__CONTENT = DESCRIPTION__CONTENT;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link SurveyModel.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SurveyModel.impl.PersonImpl
	 * @see SurveyModel.impl.SurveyModelPackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 14;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ATTRIBUTE = 0;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link SurveyModel.impl.PersonAttributeImpl <em>Person Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see SurveyModel.impl.PersonAttributeImpl
	 * @see SurveyModel.impl.SurveyModelPackageImpl#getPersonAttribute()
	 * @generated
	 */
	int PERSON_ATTRIBUTE = 15;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_ATTRIBUTE__KEY = 0;

	/**
	 * The number of structural features of the '<em>Person Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_ATTRIBUTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Person Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_ATTRIBUTE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link SurveyModel.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see SurveyModel.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the containment reference list '{@link SurveyModel.Category#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Steps</em>'.
	 * @see SurveyModel.Category#getSteps()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Steps();

	/**
	 * Returns the meta object for the attribute '{@link SurveyModel.Category#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see SurveyModel.Category#getTitle()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Title();

	/**
	 * Returns the meta object for the attribute '{@link SurveyModel.Category#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see SurveyModel.Category#getDescription()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Description();

	/**
	 * Returns the meta object for class '{@link SurveyModel.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see SurveyModel.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the containment reference list '{@link SurveyModel.Step#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questions</em>'.
	 * @see SurveyModel.Step#getQuestions()
	 * @see #getStep()
	 * @generated
	 */
	EReference getStep_Questions();

	/**
	 * Returns the meta object for class '{@link SurveyModel.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see SurveyModel.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the containment reference list '{@link SurveyModel.Question#getSubquestion <em>Subquestion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subquestion</em>'.
	 * @see SurveyModel.Question#getSubquestion()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Subquestion();

	/**
	 * Returns the meta object for the attribute '{@link SurveyModel.Question#getQuestionText <em>Question Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question Text</em>'.
	 * @see SurveyModel.Question#getQuestionText()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_QuestionText();

	/**
	 * Returns the meta object for the attribute '{@link SurveyModel.Question#isIsMandatory <em>Is Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Mandatory</em>'.
	 * @see SurveyModel.Question#isIsMandatory()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_IsMandatory();

	/**
	 * Returns the meta object for the containment reference list '{@link SurveyModel.Question#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Option</em>'.
	 * @see SurveyModel.Question#getOption()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Option();

	/**
	 * Returns the meta object for class '{@link SurveyModel.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see SurveyModel.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the containment reference list '{@link SurveyModel.Option#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see SurveyModel.Option#getContains()
	 * @see #getOption()
	 * @generated
	 */
	EReference getOption_Contains();

	/**
	 * Returns the meta object for the attribute '{@link SurveyModel.Option#isIsCheckedByDefault <em>Is Checked By Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Checked By Default</em>'.
	 * @see SurveyModel.Option#isIsCheckedByDefault()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_IsCheckedByDefault();

	/**
	 * Returns the meta object for the attribute '{@link SurveyModel.Option#isIsUserInputAllowed <em>Is User Input Allowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is User Input Allowed</em>'.
	 * @see SurveyModel.Option#isIsUserInputAllowed()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_IsUserInputAllowed();

	/**
	 * Returns the meta object for class '{@link SurveyModel.MultipleChoice <em>Multiple Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiple Choice</em>'.
	 * @see SurveyModel.MultipleChoice
	 * @generated
	 */
	EClass getMultipleChoice();

	/**
	 * Returns the meta object for the attribute '{@link SurveyModel.MultipleChoice#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see SurveyModel.MultipleChoice#getMin()
	 * @see #getMultipleChoice()
	 * @generated
	 */
	EAttribute getMultipleChoice_Min();

	/**
	 * Returns the meta object for the attribute '{@link SurveyModel.MultipleChoice#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see SurveyModel.MultipleChoice#getMax()
	 * @see #getMultipleChoice()
	 * @generated
	 */
	EAttribute getMultipleChoice_Max();

	/**
	 * Returns the meta object for class '{@link SurveyModel.Ranking <em>Ranking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ranking</em>'.
	 * @see SurveyModel.Ranking
	 * @generated
	 */
	EClass getRanking();

	/**
	 * Returns the meta object for class '{@link SurveyModel.Rating <em>Rating</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rating</em>'.
	 * @see SurveyModel.Rating
	 * @generated
	 */
	EClass getRating();

	/**
	 * Returns the meta object for the attribute '{@link SurveyModel.Rating#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see SurveyModel.Rating#getStart()
	 * @see #getRating()
	 * @generated
	 */
	EAttribute getRating_Start();

	/**
	 * Returns the meta object for the attribute '{@link SurveyModel.Rating#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see SurveyModel.Rating#getEnd()
	 * @see #getRating()
	 * @generated
	 */
	EAttribute getRating_End();

	/**
	 * Returns the meta object for the attribute '{@link SurveyModel.Rating#getInterval <em>Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see SurveyModel.Rating#getInterval()
	 * @see #getRating()
	 * @generated
	 */
	EAttribute getRating_Interval();

	/**
	 * Returns the meta object for class '{@link SurveyModel.YesNo <em>Yes No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Yes No</em>'.
	 * @see SurveyModel.YesNo
	 * @generated
	 */
	EClass getYesNo();

	/**
	 * Returns the meta object for class '{@link SurveyModel.Description <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Description</em>'.
	 * @see SurveyModel.Description
	 * @generated
	 */
	EClass getDescription();

	/**
	 * Returns the meta object for the attribute '{@link SurveyModel.Description#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see SurveyModel.Description#getContent()
	 * @see #getDescription()
	 * @generated
	 */
	EAttribute getDescription_Content();

	/**
	 * Returns the meta object for class '{@link SurveyModel.OpenField <em>Open Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Field</em>'.
	 * @see SurveyModel.OpenField
	 * @generated
	 */
	EClass getOpenField();

	/**
	 * Returns the meta object for class '{@link SurveyModel.Survey <em>Survey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Survey</em>'.
	 * @see SurveyModel.Survey
	 * @generated
	 */
	EClass getSurvey();

	/**
	 * Returns the meta object for the containment reference list '{@link SurveyModel.Survey#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see SurveyModel.Survey#getCategories()
	 * @see #getSurvey()
	 * @generated
	 */
	EReference getSurvey_Categories();

	/**
	 * Returns the meta object for the attribute '{@link SurveyModel.Survey#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see SurveyModel.Survey#getTitle()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_Title();

	/**
	 * Returns the meta object for the attribute '{@link SurveyModel.Survey#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see SurveyModel.Survey#getDate()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_Date();

	/**
	 * Returns the meta object for the containment reference '{@link SurveyModel.Survey#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Person</em>'.
	 * @see SurveyModel.Survey#getPerson()
	 * @see #getSurvey()
	 * @generated
	 */
	EReference getSurvey_Person();

	/**
	 * Returns the meta object for the attribute '{@link SurveyModel.Survey#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see SurveyModel.Survey#getDescription()
	 * @see #getSurvey()
	 * @generated
	 */
	EAttribute getSurvey_Description();

	/**
	 * Returns the meta object for class '{@link SurveyModel.MutuallyExclusive <em>Mutually Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mutually Exclusive</em>'.
	 * @see SurveyModel.MutuallyExclusive
	 * @generated
	 */
	EClass getMutuallyExclusive();

	/**
	 * Returns the meta object for class '{@link SurveyModel.Text <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text</em>'.
	 * @see SurveyModel.Text
	 * @generated
	 */
	EClass getText();

	/**
	 * Returns the meta object for class '{@link SurveyModel.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see SurveyModel.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for class '{@link SurveyModel.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see SurveyModel.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the containment reference list '{@link SurveyModel.Person#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see SurveyModel.Person#getAttribute()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Attribute();

	/**
	 * Returns the meta object for class '{@link SurveyModel.PersonAttribute <em>Person Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person Attribute</em>'.
	 * @see SurveyModel.PersonAttribute
	 * @generated
	 */
	EClass getPersonAttribute();

	/**
	 * Returns the meta object for the attribute '{@link SurveyModel.PersonAttribute#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see SurveyModel.PersonAttribute#getKey()
	 * @see #getPersonAttribute()
	 * @generated
	 */
	EAttribute getPersonAttribute_Key();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SurveyModelFactory getSurveyModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link SurveyModel.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SurveyModel.impl.CategoryImpl
		 * @see SurveyModel.impl.SurveyModelPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__STEPS = eINSTANCE.getCategory_Steps();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__TITLE = eINSTANCE.getCategory_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__DESCRIPTION = eINSTANCE.getCategory_Description();

		/**
		 * The meta object literal for the '{@link SurveyModel.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SurveyModel.impl.StepImpl
		 * @see SurveyModel.impl.SurveyModelPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STEP__QUESTIONS = eINSTANCE.getStep_Questions();

		/**
		 * The meta object literal for the '{@link SurveyModel.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SurveyModel.impl.QuestionImpl
		 * @see SurveyModel.impl.SurveyModelPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Subquestion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__SUBQUESTION = eINSTANCE.getQuestion_Subquestion();

		/**
		 * The meta object literal for the '<em><b>Question Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__QUESTION_TEXT = eINSTANCE.getQuestion_QuestionText();

		/**
		 * The meta object literal for the '<em><b>Is Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__IS_MANDATORY = eINSTANCE.getQuestion_IsMandatory();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__OPTION = eINSTANCE.getQuestion_Option();

		/**
		 * The meta object literal for the '{@link SurveyModel.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SurveyModel.impl.OptionImpl
		 * @see SurveyModel.impl.SurveyModelPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION__CONTAINS = eINSTANCE.getOption_Contains();

		/**
		 * The meta object literal for the '<em><b>Is Checked By Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__IS_CHECKED_BY_DEFAULT = eINSTANCE.getOption_IsCheckedByDefault();

		/**
		 * The meta object literal for the '<em><b>Is User Input Allowed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__IS_USER_INPUT_ALLOWED = eINSTANCE.getOption_IsUserInputAllowed();

		/**
		 * The meta object literal for the '{@link SurveyModel.impl.MultipleChoiceImpl <em>Multiple Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SurveyModel.impl.MultipleChoiceImpl
		 * @see SurveyModel.impl.SurveyModelPackageImpl#getMultipleChoice()
		 * @generated
		 */
		EClass MULTIPLE_CHOICE = eINSTANCE.getMultipleChoice();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_CHOICE__MIN = eINSTANCE.getMultipleChoice_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLE_CHOICE__MAX = eINSTANCE.getMultipleChoice_Max();

		/**
		 * The meta object literal for the '{@link SurveyModel.impl.RankingImpl <em>Ranking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SurveyModel.impl.RankingImpl
		 * @see SurveyModel.impl.SurveyModelPackageImpl#getRanking()
		 * @generated
		 */
		EClass RANKING = eINSTANCE.getRanking();

		/**
		 * The meta object literal for the '{@link SurveyModel.impl.RatingImpl <em>Rating</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SurveyModel.impl.RatingImpl
		 * @see SurveyModel.impl.SurveyModelPackageImpl#getRating()
		 * @generated
		 */
		EClass RATING = eINSTANCE.getRating();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATING__START = eINSTANCE.getRating_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATING__END = eINSTANCE.getRating_End();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RATING__INTERVAL = eINSTANCE.getRating_Interval();

		/**
		 * The meta object literal for the '{@link SurveyModel.impl.YesNoImpl <em>Yes No</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SurveyModel.impl.YesNoImpl
		 * @see SurveyModel.impl.SurveyModelPackageImpl#getYesNo()
		 * @generated
		 */
		EClass YES_NO = eINSTANCE.getYesNo();

		/**
		 * The meta object literal for the '{@link SurveyModel.impl.DescriptionImpl <em>Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SurveyModel.impl.DescriptionImpl
		 * @see SurveyModel.impl.SurveyModelPackageImpl#getDescription()
		 * @generated
		 */
		EClass DESCRIPTION = eINSTANCE.getDescription();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIPTION__CONTENT = eINSTANCE.getDescription_Content();

		/**
		 * The meta object literal for the '{@link SurveyModel.impl.OpenFieldImpl <em>Open Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SurveyModel.impl.OpenFieldImpl
		 * @see SurveyModel.impl.SurveyModelPackageImpl#getOpenField()
		 * @generated
		 */
		EClass OPEN_FIELD = eINSTANCE.getOpenField();

		/**
		 * The meta object literal for the '{@link SurveyModel.impl.SurveyImpl <em>Survey</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SurveyModel.impl.SurveyImpl
		 * @see SurveyModel.impl.SurveyModelPackageImpl#getSurvey()
		 * @generated
		 */
		EClass SURVEY = eINSTANCE.getSurvey();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY__CATEGORIES = eINSTANCE.getSurvey_Categories();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__TITLE = eINSTANCE.getSurvey_Title();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__DATE = eINSTANCE.getSurvey_Date();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SURVEY__PERSON = eINSTANCE.getSurvey_Person();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURVEY__DESCRIPTION = eINSTANCE.getSurvey_Description();

		/**
		 * The meta object literal for the '{@link SurveyModel.impl.MutuallyExclusiveImpl <em>Mutually Exclusive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SurveyModel.impl.MutuallyExclusiveImpl
		 * @see SurveyModel.impl.SurveyModelPackageImpl#getMutuallyExclusive()
		 * @generated
		 */
		EClass MUTUALLY_EXCLUSIVE = eINSTANCE.getMutuallyExclusive();

		/**
		 * The meta object literal for the '{@link SurveyModel.impl.TextImpl <em>Text</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SurveyModel.impl.TextImpl
		 * @see SurveyModel.impl.SurveyModelPackageImpl#getText()
		 * @generated
		 */
		EClass TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '{@link SurveyModel.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SurveyModel.impl.ImageImpl
		 * @see SurveyModel.impl.SurveyModelPackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '{@link SurveyModel.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SurveyModel.impl.PersonImpl
		 * @see SurveyModel.impl.SurveyModelPackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__ATTRIBUTE = eINSTANCE.getPerson_Attribute();

		/**
		 * The meta object literal for the '{@link SurveyModel.impl.PersonAttributeImpl <em>Person Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see SurveyModel.impl.PersonAttributeImpl
		 * @see SurveyModel.impl.SurveyModelPackageImpl#getPersonAttribute()
		 * @generated
		 */
		EClass PERSON_ATTRIBUTE = eINSTANCE.getPersonAttribute();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON_ATTRIBUTE__KEY = eINSTANCE.getPersonAttribute_Key();

	}

} //SurveyModelPackage
