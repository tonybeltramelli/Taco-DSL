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
 * An implementation of the model object '<em><b>Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SurveyModel.impl.AnswerImpl#isIsUserInputAllowed <em>Is User Input Allowed</em>}</li>
 *   <li>{@link SurveyModel.impl.AnswerImpl#getSubquestion <em>Subquestion</em>}</li>
 *   <li>{@link SurveyModel.impl.AnswerImpl#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnswerImpl extends MinimalEObjectImpl.Container implements Answer {
	/**
	 * The default value of the '{@link #isIsUserInputAllowed() <em>Is User Input Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUserInputAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_USER_INPUT_ALLOWED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUserInputAllowed() <em>Is User Input Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUserInputAllowed()
	 * @generated
	 * @ordered
	 */
	protected boolean isUserInputAllowed = IS_USER_INPUT_ALLOWED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubquestion() <em>Subquestion</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubquestion()
	 * @generated
	 * @ordered
	 */
	protected EList<Question> subquestion;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveyModelPackage.Literals.ANSWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUserInputAllowed() {
		return isUserInputAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUserInputAllowed(boolean newIsUserInputAllowed) {
		boolean oldIsUserInputAllowed = isUserInputAllowed;
		isUserInputAllowed = newIsUserInputAllowed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyModelPackage.ANSWER__IS_USER_INPUT_ALLOWED, oldIsUserInputAllowed, isUserInputAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Question> getSubquestion() {
		if (subquestion == null) {
			subquestion = new EObjectContainmentEList<Question>(Question.class, this, SurveyModelPackage.ANSWER__SUBQUESTION);
		}
		return subquestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyModelPackage.ANSWER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SurveyModelPackage.ANSWER__SUBQUESTION:
				return ((InternalEList<?>)getSubquestion()).basicRemove(otherEnd, msgs);
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
			case SurveyModelPackage.ANSWER__IS_USER_INPUT_ALLOWED:
				return isIsUserInputAllowed();
			case SurveyModelPackage.ANSWER__SUBQUESTION:
				return getSubquestion();
			case SurveyModelPackage.ANSWER__DESCRIPTION:
				return getDescription();
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
			case SurveyModelPackage.ANSWER__IS_USER_INPUT_ALLOWED:
				setIsUserInputAllowed((Boolean)newValue);
				return;
			case SurveyModelPackage.ANSWER__SUBQUESTION:
				getSubquestion().clear();
				getSubquestion().addAll((Collection<? extends Question>)newValue);
				return;
			case SurveyModelPackage.ANSWER__DESCRIPTION:
				setDescription((String)newValue);
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
			case SurveyModelPackage.ANSWER__IS_USER_INPUT_ALLOWED:
				setIsUserInputAllowed(IS_USER_INPUT_ALLOWED_EDEFAULT);
				return;
			case SurveyModelPackage.ANSWER__SUBQUESTION:
				getSubquestion().clear();
				return;
			case SurveyModelPackage.ANSWER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case SurveyModelPackage.ANSWER__IS_USER_INPUT_ALLOWED:
				return isUserInputAllowed != IS_USER_INPUT_ALLOWED_EDEFAULT;
			case SurveyModelPackage.ANSWER__SUBQUESTION:
				return subquestion != null && !subquestion.isEmpty();
			case SurveyModelPackage.ANSWER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (isUserInputAllowed: ");
		result.append(isUserInputAllowed);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //AnswerImpl
