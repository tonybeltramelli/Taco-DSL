/**
 */
package SurveyModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see SurveyModel.SurveyModelPackage
 * @generated
 */
public interface SurveyModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SurveyModelFactory eINSTANCE = SurveyModel.impl.SurveyModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category</em>'.
	 * @generated
	 */
	Category createCategory();

	/**
	 * Returns a new object of class '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page</em>'.
	 * @generated
	 */
	Page createPage();

	/**
	 * Returns a new object of class '<em>Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Answer</em>'.
	 * @generated
	 */
	Answer createAnswer();

	/**
	 * Returns a new object of class '<em>Multiple Choice</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multiple Choice</em>'.
	 * @generated
	 */
	MultipleChoice createMultipleChoice();

	/**
	 * Returns a new object of class '<em>Ranking</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ranking</em>'.
	 * @generated
	 */
	Ranking createRanking();

	/**
	 * Returns a new object of class '<em>Rating</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rating</em>'.
	 * @generated
	 */
	Rating createRating();

	/**
	 * Returns a new object of class '<em>Yes No</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Yes No</em>'.
	 * @generated
	 */
	YesNo createYesNo();

	/**
	 * Returns a new object of class '<em>Open Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Field</em>'.
	 * @generated
	 */
	OpenField createOpenField();

	/**
	 * Returns a new object of class '<em>Survey</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Survey</em>'.
	 * @generated
	 */
	Survey createSurvey();

	/**
	 * Returns a new object of class '<em>Mutually Exclusive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mutually Exclusive</em>'.
	 * @generated
	 */
	MutuallyExclusive createMutuallyExclusive();

	/**
	 * Returns a new object of class '<em>Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person</em>'.
	 * @generated
	 */
	Person createPerson();

	/**
	 * Returns a new object of class '<em>Person Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person Attribute</em>'.
	 * @generated
	 */
	PersonAttribute createPersonAttribute();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SurveyModelPackage getSurveyModelPackage();

} //SurveyModelFactory
