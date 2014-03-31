/**
 */
package SurveyModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SurveyModel.Question#getSubquestion <em>Subquestion</em>}</li>
 *   <li>{@link SurveyModel.Question#getQuestionText <em>Question Text</em>}</li>
 *   <li>{@link SurveyModel.Question#isIsMandatory <em>Is Mandatory</em>}</li>
 *   <li>{@link SurveyModel.Question#getOption <em>Option</em>}</li>
 * </ul>
 * </p>
 *
 * @see SurveyModel.SurveyModelPackage#getQuestion()
 * @model abstract="true"
 * @generated
 */
public interface Question extends EObject {
	/**
	 * Returns the value of the '<em><b>Subquestion</b></em>' containment reference list.
	 * The list contents are of type {@link SurveyModel.Question}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subquestion</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subquestion</em>' containment reference list.
	 * @see SurveyModel.SurveyModelPackage#getQuestion_Subquestion()
	 * @model containment="true"
	 * @generated
	 */
	EList<Question> getSubquestion();

	/**
	 * Returns the value of the '<em><b>Question Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question Text</em>' attribute.
	 * @see #setQuestionText(String)
	 * @see SurveyModel.SurveyModelPackage#getQuestion_QuestionText()
	 * @model required="true"
	 * @generated
	 */
	String getQuestionText();

	/**
	 * Sets the value of the '{@link SurveyModel.Question#getQuestionText <em>Question Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question Text</em>' attribute.
	 * @see #getQuestionText()
	 * @generated
	 */
	void setQuestionText(String value);

	/**
	 * Returns the value of the '<em><b>Is Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Mandatory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Mandatory</em>' attribute.
	 * @see #setIsMandatory(boolean)
	 * @see SurveyModel.SurveyModelPackage#getQuestion_IsMandatory()
	 * @model
	 * @generated
	 */
	boolean isIsMandatory();

	/**
	 * Sets the value of the '{@link SurveyModel.Question#isIsMandatory <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Mandatory</em>' attribute.
	 * @see #isIsMandatory()
	 * @generated
	 */
	void setIsMandatory(boolean value);

	/**
	 * Returns the value of the '<em><b>Option</b></em>' containment reference list.
	 * The list contents are of type {@link SurveyModel.Option}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' containment reference list.
	 * @see SurveyModel.SurveyModelPackage#getQuestion_Option()
	 * @model containment="true"
	 * @generated
	 */
	EList<Option> getOption();

} // Question
