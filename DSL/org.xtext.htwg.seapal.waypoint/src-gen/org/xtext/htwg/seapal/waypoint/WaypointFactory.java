/**
 */
package org.xtext.htwg.seapal.waypoint;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.htwg.seapal.waypoint.WaypointPackage
 * @generated
 */
public interface WaypointFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  WaypointFactory eINSTANCE = org.xtext.htwg.seapal.waypoint.impl.WaypointFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Waypoint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Waypoint</em>'.
   * @generated
   */
  Waypoint createWaypoint();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  WaypointPackage getWaypointPackage();

} //WaypointFactory
