/**
 */
package SurveyModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiple Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SurveyModel.MultipleChoice#getMin <em>Min</em>}</li>
 *   <li>{@link SurveyModel.MultipleChoice#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see SurveyModel.SurveyModelPackage#getMultipleChoice()
 * @model
 * @generated
 */
public interface MultipleChoice extends Question {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(int)
	 * @see SurveyModel.SurveyModelPackage#getMultipleChoice_Min()
	 * @model required="true"
	 * @generated
	 */
	int getMin();

	/**
	 * Sets the value of the '{@link SurveyModel.MultipleChoice#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(int value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(int)
	 * @see SurveyModel.SurveyModelPackage#getMultipleChoice_Max()
	 * @model required="true"
	 * @generated
	 */
	int getMax();

	/**
	 * Sets the value of the '{@link SurveyModel.MultipleChoice#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(int value);

} // MultipleChoice
