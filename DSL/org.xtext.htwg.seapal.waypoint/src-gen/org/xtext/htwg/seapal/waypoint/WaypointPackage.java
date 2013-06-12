/**
 */
package org.xtext.htwg.seapal.waypoint;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.htwg.seapal.waypoint.WaypointFactory
 * @model kind="package"
 * @generated
 */
public interface WaypointPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "waypoint";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/htwg/seapal/Waypoint";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "waypoint";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  WaypointPackage eINSTANCE = org.xtext.htwg.seapal.waypoint.impl.WaypointPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.htwg.seapal.waypoint.impl.WaypointImpl <em>Waypoint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.htwg.seapal.waypoint.impl.WaypointImpl
   * @see org.xtext.htwg.seapal.waypoint.impl.WaypointPackageImpl#getWaypoint()
   * @generated
   */
  int WAYPOINT = 0;

  /**
   * The feature id for the '<em><b>Waypoint</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WAYPOINT__WAYPOINT = 0;

  /**
   * The feature id for the '<em><b>Position</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WAYPOINT__POSITION = 1;

  /**
   * The feature id for the '<em><b>Note</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WAYPOINT__NOTE = 2;

  /**
   * The feature id for the '<em><b>Btm</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WAYPOINT__BTM = 3;

  /**
   * The feature id for the '<em><b>Dtm</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WAYPOINT__DTM = 4;

  /**
   * The feature id for the '<em><b>Cog</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WAYPOINT__COG = 5;

  /**
   * The feature id for the '<em><b>Sog</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WAYPOINT__SOG = 6;

  /**
   * The feature id for the '<em><b>Maneuver</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WAYPOINT__MANEUVER = 7;

  /**
   * The feature id for the '<em><b>Foresail</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WAYPOINT__FORESAIL = 8;

  /**
   * The feature id for the '<em><b>Mainsail</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WAYPOINT__MAINSAIL = 9;

  /**
   * The number of structural features of the '<em>Waypoint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WAYPOINT_FEATURE_COUNT = 10;

  /**
   * The meta object id for the '{@link org.xtext.htwg.seapal.waypoint.Maneuver <em>Maneuver</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.htwg.seapal.waypoint.Maneuver
   * @see org.xtext.htwg.seapal.waypoint.impl.WaypointPackageImpl#getManeuver()
   * @generated
   */
  int MANEUVER = 1;

  /**
   * The meta object id for the '{@link org.xtext.htwg.seapal.waypoint.Foresail <em>Foresail</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.htwg.seapal.waypoint.Foresail
   * @see org.xtext.htwg.seapal.waypoint.impl.WaypointPackageImpl#getForesail()
   * @generated
   */
  int FORESAIL = 2;

  /**
   * The meta object id for the '{@link org.xtext.htwg.seapal.waypoint.Mainsail <em>Mainsail</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.htwg.seapal.waypoint.Mainsail
   * @see org.xtext.htwg.seapal.waypoint.impl.WaypointPackageImpl#getMainsail()
   * @generated
   */
  int MAINSAIL = 3;


  /**
   * Returns the meta object for class '{@link org.xtext.htwg.seapal.waypoint.Waypoint <em>Waypoint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Waypoint</em>'.
   * @see org.xtext.htwg.seapal.waypoint.Waypoint
   * @generated
   */
  EClass getWaypoint();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.htwg.seapal.waypoint.Waypoint#getWaypoint <em>Waypoint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Waypoint</em>'.
   * @see org.xtext.htwg.seapal.waypoint.Waypoint#getWaypoint()
   * @see #getWaypoint()
   * @generated
   */
  EAttribute getWaypoint_Waypoint();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.htwg.seapal.waypoint.Waypoint#getPosition <em>Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Position</em>'.
   * @see org.xtext.htwg.seapal.waypoint.Waypoint#getPosition()
   * @see #getWaypoint()
   * @generated
   */
  EAttribute getWaypoint_Position();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.htwg.seapal.waypoint.Waypoint#getNote <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Note</em>'.
   * @see org.xtext.htwg.seapal.waypoint.Waypoint#getNote()
   * @see #getWaypoint()
   * @generated
   */
  EAttribute getWaypoint_Note();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.htwg.seapal.waypoint.Waypoint#getBtm <em>Btm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Btm</em>'.
   * @see org.xtext.htwg.seapal.waypoint.Waypoint#getBtm()
   * @see #getWaypoint()
   * @generated
   */
  EAttribute getWaypoint_Btm();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.htwg.seapal.waypoint.Waypoint#getDtm <em>Dtm</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dtm</em>'.
   * @see org.xtext.htwg.seapal.waypoint.Waypoint#getDtm()
   * @see #getWaypoint()
   * @generated
   */
  EAttribute getWaypoint_Dtm();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.htwg.seapal.waypoint.Waypoint#getCog <em>Cog</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cog</em>'.
   * @see org.xtext.htwg.seapal.waypoint.Waypoint#getCog()
   * @see #getWaypoint()
   * @generated
   */
  EAttribute getWaypoint_Cog();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.htwg.seapal.waypoint.Waypoint#getSog <em>Sog</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sog</em>'.
   * @see org.xtext.htwg.seapal.waypoint.Waypoint#getSog()
   * @see #getWaypoint()
   * @generated
   */
  EAttribute getWaypoint_Sog();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.htwg.seapal.waypoint.Waypoint#getManeuver <em>Maneuver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Maneuver</em>'.
   * @see org.xtext.htwg.seapal.waypoint.Waypoint#getManeuver()
   * @see #getWaypoint()
   * @generated
   */
  EAttribute getWaypoint_Maneuver();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.htwg.seapal.waypoint.Waypoint#getForesail <em>Foresail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Foresail</em>'.
   * @see org.xtext.htwg.seapal.waypoint.Waypoint#getForesail()
   * @see #getWaypoint()
   * @generated
   */
  EAttribute getWaypoint_Foresail();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.htwg.seapal.waypoint.Waypoint#getMainsail <em>Mainsail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Mainsail</em>'.
   * @see org.xtext.htwg.seapal.waypoint.Waypoint#getMainsail()
   * @see #getWaypoint()
   * @generated
   */
  EAttribute getWaypoint_Mainsail();

  /**
   * Returns the meta object for enum '{@link org.xtext.htwg.seapal.waypoint.Maneuver <em>Maneuver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Maneuver</em>'.
   * @see org.xtext.htwg.seapal.waypoint.Maneuver
   * @generated
   */
  EEnum getManeuver();

  /**
   * Returns the meta object for enum '{@link org.xtext.htwg.seapal.waypoint.Foresail <em>Foresail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Foresail</em>'.
   * @see org.xtext.htwg.seapal.waypoint.Foresail
   * @generated
   */
  EEnum getForesail();

  /**
   * Returns the meta object for enum '{@link org.xtext.htwg.seapal.waypoint.Mainsail <em>Mainsail</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Mainsail</em>'.
   * @see org.xtext.htwg.seapal.waypoint.Mainsail
   * @generated
   */
  EEnum getMainsail();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  WaypointFactory getWaypointFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.htwg.seapal.waypoint.impl.WaypointImpl <em>Waypoint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.htwg.seapal.waypoint.impl.WaypointImpl
     * @see org.xtext.htwg.seapal.waypoint.impl.WaypointPackageImpl#getWaypoint()
     * @generated
     */
    EClass WAYPOINT = eINSTANCE.getWaypoint();

    /**
     * The meta object literal for the '<em><b>Waypoint</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WAYPOINT__WAYPOINT = eINSTANCE.getWaypoint_Waypoint();

    /**
     * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WAYPOINT__POSITION = eINSTANCE.getWaypoint_Position();

    /**
     * The meta object literal for the '<em><b>Note</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WAYPOINT__NOTE = eINSTANCE.getWaypoint_Note();

    /**
     * The meta object literal for the '<em><b>Btm</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WAYPOINT__BTM = eINSTANCE.getWaypoint_Btm();

    /**
     * The meta object literal for the '<em><b>Dtm</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WAYPOINT__DTM = eINSTANCE.getWaypoint_Dtm();

    /**
     * The meta object literal for the '<em><b>Cog</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WAYPOINT__COG = eINSTANCE.getWaypoint_Cog();

    /**
     * The meta object literal for the '<em><b>Sog</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WAYPOINT__SOG = eINSTANCE.getWaypoint_Sog();

    /**
     * The meta object literal for the '<em><b>Maneuver</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WAYPOINT__MANEUVER = eINSTANCE.getWaypoint_Maneuver();

    /**
     * The meta object literal for the '<em><b>Foresail</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WAYPOINT__FORESAIL = eINSTANCE.getWaypoint_Foresail();

    /**
     * The meta object literal for the '<em><b>Mainsail</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WAYPOINT__MAINSAIL = eINSTANCE.getWaypoint_Mainsail();

    /**
     * The meta object literal for the '{@link org.xtext.htwg.seapal.waypoint.Maneuver <em>Maneuver</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.htwg.seapal.waypoint.Maneuver
     * @see org.xtext.htwg.seapal.waypoint.impl.WaypointPackageImpl#getManeuver()
     * @generated
     */
    EEnum MANEUVER = eINSTANCE.getManeuver();

    /**
     * The meta object literal for the '{@link org.xtext.htwg.seapal.waypoint.Foresail <em>Foresail</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.htwg.seapal.waypoint.Foresail
     * @see org.xtext.htwg.seapal.waypoint.impl.WaypointPackageImpl#getForesail()
     * @generated
     */
    EEnum FORESAIL = eINSTANCE.getForesail();

    /**
     * The meta object literal for the '{@link org.xtext.htwg.seapal.waypoint.Mainsail <em>Mainsail</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.htwg.seapal.waypoint.Mainsail
     * @see org.xtext.htwg.seapal.waypoint.impl.WaypointPackageImpl#getMainsail()
     * @generated
     */
    EEnum MAINSAIL = eINSTANCE.getMainsail();

  }

} //WaypointPackage
