/**
 */
package SurveyModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SurveyModel.Option#getContains <em>Contains</em>}</li>
 *   <li>{@link SurveyModel.Option#isIsCheckedByDefault <em>Is Checked By Default</em>}</li>
 *   <li>{@link SurveyModel.Option#isIsUserInputAllowed <em>Is User Input Allowed</em>}</li>
 * </ul>
 * </p>
 *
 * @see SurveyModel.SurveyModelPackage#getOption()
 * @model
 * @generated
 */
public interface Option extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link SurveyModel.Description}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see SurveyModel.SurveyModelPackage#getOption_Contains()
	 * @model containment="true"
	 * @generated
	 */
	EList<Description> getContains();

	/**
	 * Returns the value of the '<em><b>Is Checked By Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Checked By Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Checked By Default</em>' attribute.
	 * @see #setIsCheckedByDefault(boolean)
	 * @see SurveyModel.SurveyModelPackage#getOption_IsCheckedByDefault()
	 * @model
	 * @generated
	 */
	boolean isIsCheckedByDefault();

	/**
	 * Sets the value of the '{@link SurveyModel.Option#isIsCheckedByDefault <em>Is Checked By Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Checked By Default</em>' attribute.
	 * @see #isIsCheckedByDefault()
	 * @generated
	 */
	void setIsCheckedByDefault(boolean value);

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
	 * @see SurveyModel.SurveyModelPackage#getOption_IsUserInputAllowed()
	 * @model
	 * @generated
	 */
	boolean isIsUserInputAllowed();

	/**
	 * Sets the value of the '{@link SurveyModel.Option#isIsUserInputAllowed <em>Is User Input Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is User Input Allowed</em>' attribute.
	 * @see #isIsUserInputAllowed()
	 * @generated
	 */
	void setIsUserInputAllowed(boolean value);

} // Option
