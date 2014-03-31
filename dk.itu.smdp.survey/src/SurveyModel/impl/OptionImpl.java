/**
 */
package SurveyModel.impl;

import SurveyModel.Description;
import SurveyModel.Option;
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
 * An implementation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link SurveyModel.impl.OptionImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link SurveyModel.impl.OptionImpl#isIsCheckedByDefault <em>Is Checked By Default</em>}</li>
 *   <li>{@link SurveyModel.impl.OptionImpl#isIsUserInputAllowed <em>Is User Input Allowed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OptionImpl extends MinimalEObjectImpl.Container implements Option {
	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<Description> contains;

	/**
	 * The default value of the '{@link #isIsCheckedByDefault() <em>Is Checked By Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCheckedByDefault()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CHECKED_BY_DEFAULT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCheckedByDefault() <em>Is Checked By Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCheckedByDefault()
	 * @generated
	 * @ordered
	 */
	protected boolean isCheckedByDefault = IS_CHECKED_BY_DEFAULT_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SurveyModelPackage.Literals.OPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Description> getContains() {
		if (contains == null) {
			contains = new EObjectContainmentEList<Description>(Description.class, this, SurveyModelPackage.OPTION__CONTAINS);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCheckedByDefault() {
		return isCheckedByDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCheckedByDefault(boolean newIsCheckedByDefault) {
		boolean oldIsCheckedByDefault = isCheckedByDefault;
		isCheckedByDefault = newIsCheckedByDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyModelPackage.OPTION__IS_CHECKED_BY_DEFAULT, oldIsCheckedByDefault, isCheckedByDefault));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SurveyModelPackage.OPTION__IS_USER_INPUT_ALLOWED, oldIsUserInputAllowed, isUserInputAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SurveyModelPackage.OPTION__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
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
			case SurveyModelPackage.OPTION__CONTAINS:
				return getContains();
			case SurveyModelPackage.OPTION__IS_CHECKED_BY_DEFAULT:
				return isIsCheckedByDefault();
			case SurveyModelPackage.OPTION__IS_USER_INPUT_ALLOWED:
				return isIsUserInputAllowed();
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
			case SurveyModelPackage.OPTION__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends Description>)newValue);
				return;
			case SurveyModelPackage.OPTION__IS_CHECKED_BY_DEFAULT:
				setIsCheckedByDefault((Boolean)newValue);
				return;
			case SurveyModelPackage.OPTION__IS_USER_INPUT_ALLOWED:
				setIsUserInputAllowed((Boolean)newValue);
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
			case SurveyModelPackage.OPTION__CONTAINS:
				getContains().clear();
				return;
			case SurveyModelPackage.OPTION__IS_CHECKED_BY_DEFAULT:
				setIsCheckedByDefault(IS_CHECKED_BY_DEFAULT_EDEFAULT);
				return;
			case SurveyModelPackage.OPTION__IS_USER_INPUT_ALLOWED:
				setIsUserInputAllowed(IS_USER_INPUT_ALLOWED_EDEFAULT);
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
			case SurveyModelPackage.OPTION__CONTAINS:
				return contains != null && !contains.isEmpty();
			case SurveyModelPackage.OPTION__IS_CHECKED_BY_DEFAULT:
				return isCheckedByDefault != IS_CHECKED_BY_DEFAULT_EDEFAULT;
			case SurveyModelPackage.OPTION__IS_USER_INPUT_ALLOWED:
				return isUserInputAllowed != IS_USER_INPUT_ALLOWED_EDEFAULT;
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
		result.append(" (isCheckedByDefault: ");
		result.append(isCheckedByDefault);
		result.append(", isUserInputAllowed: ");
		result.append(isUserInputAllowed);
		result.append(')');
		return result.toString();
	}

} //OptionImpl
