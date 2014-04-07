/**
 */
package SurveyModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SurveyModel.Answer#isIsUserInputAllowed <em>Is User Input Allowed</em>}</li>
 *   <li>{@link SurveyModel.Answer#getSubquestion <em>Subquestion</em>}</li>
 *   <li>{@link SurveyModel.Answer#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see SurveyModel.SurveyModelPackage#getAnswer()
 * @model
 * @generated
 */
public interface Answer extends EObject {
	/**
	 * Returns the value of the '<em><b>Is User Input Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is User Input Allowed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is User Input Allowed</em>' attribute.
	 * @see #setIsUserInputAllowed(boolean)
	 * @see SurveyModel.SurveyModelPackage#getAnswer_IsUserInputAllowed()
	 * @model
	 * @generated
	 */
	boolean isIsUserInputAllowed();

	/**
	 * Sets the value of the '{@link SurveyModel.Answer#isIsUserInputAllowed <em>Is User Input Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is User Input Allowed</em>' attribute.
	 * @see #isIsUserInputAllowed()
	 * @generated
	 */
	void setIsUserInputAllowed(boolean value);

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
	 * @see SurveyModel.SurveyModelPackage#getAnswer_Subquestion()
	 * @model containment="true"
	 * @generated
	 */
	EList<Question> getSubquestion();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see SurveyModel.SurveyModelPackage#getAnswer_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link SurveyModel.Answer#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Answer
