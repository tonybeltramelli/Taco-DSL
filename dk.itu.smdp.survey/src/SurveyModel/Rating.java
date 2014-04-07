/**
 */
package SurveyModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rating</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link SurveyModel.Rating#getStart <em>Start</em>}</li>
 *   <li>{@link SurveyModel.Rating#getEnd <em>End</em>}</li>
 *   <li>{@link SurveyModel.Rating#getInterval <em>Interval</em>}</li>
 * </ul>
 * </p>
 *
 * @see SurveyModel.SurveyModelPackage#getRating()
 * @model
 * @generated
 */
public interface Rating extends MutuallyExclusive {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(int)
	 * @see SurveyModel.SurveyModelPackage#getRating_Start()
	 * @model required="true"
	 * @generated
	 */
	int getStart();

	/**
	 * Sets the value of the '{@link SurveyModel.Rating#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(int value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(int)
	 * @see SurveyModel.SurveyModelPackage#getRating_End()
	 * @model required="true"
	 * @generated
	 */
	int getEnd();

	/**
	 * Sets the value of the '{@link SurveyModel.Rating#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(int value);

	/**
	 * Returns the value of the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interval</em>' attribute.
	 * @see #setInterval(int)
	 * @see SurveyModel.SurveyModelPackage#getRating_Interval()
	 * @model required="true"
	 * @generated
	 */
	int getInterval();

	/**
	 * Sets the value of the '{@link SurveyModel.Rating#getInterval <em>Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interval</em>' attribute.
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(int value);

} // Rating
