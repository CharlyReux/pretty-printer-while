/**
 * generated by Xtext 2.25.0
 */
package pret.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link pret.myDsl.Command#getEq <em>Eq</em>}</li>
 *   <li>{@link pret.myDsl.Command#getIf <em>If</em>}</li>
 *   <li>{@link pret.myDsl.Command#getWh <em>Wh</em>}</li>
 *   <li>{@link pret.myDsl.Command#getFo <em>Fo</em>}</li>
 *   <li>{@link pret.myDsl.Command#getFore <em>Fore</em>}</li>
 *   <li>{@link pret.myDsl.Command#getNo <em>No</em>}</li>
 * </ul>
 *
 * @see pret.myDsl.MyDslPackage#getCommand()
 * @model
 * @generated
 */
public interface Command extends EObject
{
  /**
   * Returns the value of the '<em><b>Eq</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Eq</em>' containment reference.
   * @see #setEq(Equal)
   * @see pret.myDsl.MyDslPackage#getCommand_Eq()
   * @model containment="true"
   * @generated
   */
  Equal getEq();

  /**
   * Sets the value of the '{@link pret.myDsl.Command#getEq <em>Eq</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Eq</em>' containment reference.
   * @see #getEq()
   * @generated
   */
  void setEq(Equal value);

  /**
   * Returns the value of the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>If</em>' containment reference.
   * @see #setIf(If)
   * @see pret.myDsl.MyDslPackage#getCommand_If()
   * @model containment="true"
   * @generated
   */
  If getIf();

  /**
   * Sets the value of the '{@link pret.myDsl.Command#getIf <em>If</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>If</em>' containment reference.
   * @see #getIf()
   * @generated
   */
  void setIf(If value);

  /**
   * Returns the value of the '<em><b>Wh</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wh</em>' containment reference.
   * @see #setWh(While)
   * @see pret.myDsl.MyDslPackage#getCommand_Wh()
   * @model containment="true"
   * @generated
   */
  While getWh();

  /**
   * Sets the value of the '{@link pret.myDsl.Command#getWh <em>Wh</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wh</em>' containment reference.
   * @see #getWh()
   * @generated
   */
  void setWh(While value);

  /**
   * Returns the value of the '<em><b>Fo</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fo</em>' containment reference.
   * @see #setFo(For)
   * @see pret.myDsl.MyDslPackage#getCommand_Fo()
   * @model containment="true"
   * @generated
   */
  For getFo();

  /**
   * Sets the value of the '{@link pret.myDsl.Command#getFo <em>Fo</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fo</em>' containment reference.
   * @see #getFo()
   * @generated
   */
  void setFo(For value);

  /**
   * Returns the value of the '<em><b>Fore</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fore</em>' containment reference.
   * @see #setFore(Foreach)
   * @see pret.myDsl.MyDslPackage#getCommand_Fore()
   * @model containment="true"
   * @generated
   */
  Foreach getFore();

  /**
   * Sets the value of the '{@link pret.myDsl.Command#getFore <em>Fore</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fore</em>' containment reference.
   * @see #getFore()
   * @generated
   */
  void setFore(Foreach value);

  /**
   * Returns the value of the '<em><b>No</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>No</em>' attribute.
   * @see #setNo(String)
   * @see pret.myDsl.MyDslPackage#getCommand_No()
   * @model
   * @generated
   */
  String getNo();

  /**
   * Sets the value of the '{@link pret.myDsl.Command#getNo <em>No</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>No</em>' attribute.
   * @see #getNo()
   * @generated
   */
  void setNo(String value);

} // Command
