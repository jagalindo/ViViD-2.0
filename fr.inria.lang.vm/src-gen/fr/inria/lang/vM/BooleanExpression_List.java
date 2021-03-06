/**
 */
package fr.inria.lang.vM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Expression List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.lang.vM.BooleanExpression_List#getEx <em>Ex</em>}</li>
 * </ul>
 *
 * @see fr.inria.lang.vM.VMPackage#getBooleanExpression_List()
 * @model
 * @generated
 */
public interface BooleanExpression_List extends EObject
{
  /**
   * Returns the value of the '<em><b>Ex</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.lang.vM.BooleanExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ex</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ex</em>' containment reference list.
   * @see fr.inria.lang.vM.VMPackage#getBooleanExpression_List_Ex()
   * @model containment="true"
   * @generated
   */
  EList<BooleanExpression> getEx();

} // BooleanExpression_List
