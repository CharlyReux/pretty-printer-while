/**
 * generated by Xtext 2.25.0
 */
package pret.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EBsy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pret.myDsl.EBsy#getSy <em>Sy</em>}</li>
 *   <li>{@link pret.myDsl.EBsy#getLe <em>Le</em>}</li>
 * </ul>
 *
 * @see pret.myDsl.MyDslPackage#getEBsy()
 * @model
 * @generated
 */
public interface EBsy extends EObject
{
  /**
   * Returns the value of the '<em><b>Sy</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sy</em>' attribute.
   * @see #setSy(String)
   * @see pret.myDsl.MyDslPackage#getEBsy_Sy()
   * @model
   * @generated
   */
  String getSy();

  /**
   * Sets the value of the '{@link pret.myDsl.EBsy#getSy <em>Sy</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sy</em>' attribute.
   * @see #getSy()
   * @generated
   */
  void setSy(String value);

  /**
   * Returns the value of the '<em><b>Le</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Le</em>' containment reference.
   * @see #setLe(LExpr)
   * @see pret.myDsl.MyDslPackage#getEBsy_Le()
   * @model containment="true"
   * @generated
   */
  LExpr getLe();

  /**
   * Sets the value of the '{@link pret.myDsl.EBsy#getLe <em>Le</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Le</em>' containment reference.
   * @see #getLe()
   * @generated
   */
  void setLe(LExpr value);

} // EBsy
