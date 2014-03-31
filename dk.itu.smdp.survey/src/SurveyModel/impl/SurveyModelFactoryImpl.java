/**
 */
package SurveyModel.impl;

import SurveyModel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SurveyModelFactoryImpl extends EFactoryImpl implements SurveyModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SurveyModelFactory init() {
		try {
			SurveyModelFactory theSurveyModelFactory = (SurveyModelFactory)EPackage.Registry.INSTANCE.getEFactory(SurveyModelPackage.eNS_URI);
			if (theSurveyModelFactory != null) {
				return theSurveyModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SurveyModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurveyModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SurveyModelPackage.CATEGORY: return createCategory();
			case SurveyModelPackage.STEP: return createStep();
			case SurveyModelPackage.OPTION: return createOption();
			case SurveyModelPackage.MULTIPLE_CHOICE: return createMultipleChoice();
			case SurveyModelPackage.RANKING: return createRanking();
			case SurveyModelPackage.RATING: return createRating();
			case SurveyModelPackage.YES_NO: return createYesNo();
			case SurveyModelPackage.OPEN_FIELD: return createOpenField();
			case SurveyModelPackage.SURVEY: return createSurvey();
			case SurveyModelPackage.MUTUALLY_EXCLUSIVE: return createMutuallyExclusive();
			case SurveyModelPackage.TEXT: return createText();
			case SurveyModelPackage.IMAGE: return createImage();
			case SurveyModelPackage.PERSON: return createPerson();
			case SurveyModelPackage.PERSON_ATTRIBUTE: return createPersonAttribute();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step createStep() {
		StepImpl step = new StepImpl();
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option createOption() {
		OptionImpl option = new OptionImpl();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleChoice createMultipleChoice() {
		MultipleChoiceImpl multipleChoice = new MultipleChoiceImpl();
		return multipleChoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ranking createRanking() {
		RankingImpl ranking = new RankingImpl();
		return ranking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rating createRating() {
		RatingImpl rating = new RatingImpl();
		return rating;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public YesNo createYesNo() {
		YesNoImpl yesNo = new YesNoImpl();
		return yesNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenField createOpenField() {
		OpenFieldImpl openField = new OpenFieldImpl();
		return openField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Survey createSurvey() {
		SurveyImpl survey = new SurveyImpl();
		return survey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MutuallyExclusive createMutuallyExclusive() {
		MutuallyExclusiveImpl mutuallyExclusive = new MutuallyExclusiveImpl();
		return mutuallyExclusive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Text createText() {
		TextImpl text = new TextImpl();
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImage() {
		ImageImpl image = new ImageImpl();
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person createPerson() {
		PersonImpl person = new PersonImpl();
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonAttribute createPersonAttribute() {
		PersonAttributeImpl personAttribute = new PersonAttributeImpl();
		return personAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurveyModelPackage getSurveyModelPackage() {
		return (SurveyModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SurveyModelPackage getPackage() {
		return SurveyModelPackage.eINSTANCE;
	}

} //SurveyModelFactoryImpl
