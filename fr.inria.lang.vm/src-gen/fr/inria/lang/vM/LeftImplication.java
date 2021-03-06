/**
 */
package fr.inria.lang.vM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Left Implication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.lang.vM.LeftImplication#getLeft <em>Left</em>}</li>
 *   <li>{@link fr.inria.lang.vM.LeftImplication#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see fr.inria.lang.vM.VMPackage#getLeftImplication()
 * @model
 * @generated
 */
public interface LeftImplication extends ComplexExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(ComplexExpression)
   * @see fr.inria.lang.vM.VMPackage#getLeftImplication_Left()
   * @model containment="true"
   * @generated
   */
  ComplexExpression getLeft();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.LeftImplication#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(ComplexExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(ComplexExpression)
   * @see fr.inria.lang.vM.VMPackage#getLeftImplication_Right()
   * @model containment="true"
   * @generated
   */
  ComplexExpression getRight();

  /**
   * Sets the value of the '{@link fr.inria.lang.vM.LeftImplication#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(ComplexExpression value);

} // LeftImplication
