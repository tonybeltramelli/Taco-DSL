/**
 */
package SurveyModel.impl;

import SurveyModel.Answer;
import SurveyModel.Question;
import SurveyModel.SurveyModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SurveyModel.impl.QuestionImpl#getQuestionText <em>Question Text</em>}</li>
 *   <li>{@link SurveyModel.impl.QuestionImpl#isIsMandatory <em>Is Mandatory</em>}</li>
 *   <li>{@link SurveyModel.impl.QuestionImpl#getAnswers <em>Answers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class QuestionImpl extends MinimalEObjectImpl.Container implements Question {
	/**
	 * The default value of the '{@link #getQuestionText() <em>Question Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionText()
	 * @generated
	 * @ordered
	 */
	protected static final String QUESTION_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuestionText() <em>Question Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionText()
	 * @generated
	 * @ordered
	 */
	protected String questionText = QUESTION_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsMandatory() <em>Is Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean isMandatory = IS_MANDATORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnswers() <em>Answers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnswers()
	 * @generated
	 * @ordered
	 */
	protected EList<Answer> answers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveyModelPackage.Literals.QUESTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuestionText() {
		return questionText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestionText(String newQuestionText) {
		String oldQuestionText = questionText;
		questionText = newQuestionText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyModelPackage.QUESTION__QUESTION_TEXT, oldQuestionText, questionText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMandatory() {
		return isMandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMandatory(boolean newIsMandatory) {
		boolean oldIsMandatory = isMandatory;
		isMandatory = newIsMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyModelPackage.QUESTION__IS_MANDATORY, oldIsMandatory, isMandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Answer> getAnswers() {
		if (answers == null) {
			answers = new EObjectContainmentEList<Answer>(Answer.class, this, SurveyModelPackage.QUESTION__ANSWERS);
		}
		return answers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SurveyModelPackage.QUESTION__ANSWERS:
				return ((InternalEList<?>)getAnswers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SurveyModelPackage.QUESTION__QUESTION_TEXT:
				return getQuestionText();
			case SurveyModelPackage.QUESTION__IS_MANDATORY:
				return isIsMandatory();
			case SurveyModelPackage.QUESTION__ANSWERS:
				return getAnswers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SurveyModelPackage.QUESTION__QUESTION_TEXT:
				setQuestionText((String)newValue);
				return;
			case SurveyModelPackage.QUESTION__IS_MANDATORY:
				setIsMandatory((Boolean)newValue);
				return;
			case SurveyModelPackage.QUESTION__ANSWERS:
				getAnswers().clear();
				getAnswers().addAll((Collection<? extends Answer>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SurveyModelPackage.QUESTION__QUESTION_TEXT:
				setQuestionText(QUESTION_TEXT_EDEFAULT);
				return;
			case SurveyModelPackage.QUESTION__IS_MANDATORY:
				setIsMandatory(IS_MANDATORY_EDEFAULT);
				return;
			case SurveyModelPackage.QUESTION__ANSWERS:
				getAnswers().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SurveyModelPackage.QUESTION__QUESTION_TEXT:
				return QUESTION_TEXT_EDEFAULT == null ? questionText != null : !QUESTION_TEXT_EDEFAULT.equals(questionText);
			case SurveyModelPackage.QUESTION__IS_MANDATORY:
				return isMandatory != IS_MANDATORY_EDEFAULT;
			case SurveyModelPackage.QUESTION__ANSWERS:
				return answers != null && !answers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (questionText: ");
		result.append(questionText);
		result.append(", isMandatory: ");
		result.append(isMandatory);
		result.append(')');
		return result.toString();
	}

} //QuestionImpl
