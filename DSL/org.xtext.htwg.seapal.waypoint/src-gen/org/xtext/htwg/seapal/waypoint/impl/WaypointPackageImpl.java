/**
 */
package org.xtext.htwg.seapal.waypoint.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.htwg.seapal.waypoint.Foresail;
import org.xtext.htwg.seapal.waypoint.Mainsail;
import org.xtext.htwg.seapal.waypoint.Maneuver;
import org.xtext.htwg.seapal.waypoint.Waypoint;
import org.xtext.htwg.seapal.waypoint.WaypointFactory;
import org.xtext.htwg.seapal.waypoint.WaypointPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WaypointPackageImpl extends EPackageImpl implements WaypointPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass waypointEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum maneuverEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum foresailEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum mainsailEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.htwg.seapal.waypoint.WaypointPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private WaypointPackageImpl()
  {
    super(eNS_URI, WaypointFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link WaypointPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static WaypointPackage init()
  {
    if (isInited) return (WaypointPackage)EPackage.Registry.INSTANCE.getEPackage(WaypointPackage.eNS_URI);

    // Obtain or create and register package
    WaypointPackageImpl theWaypointPackage = (WaypointPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WaypointPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WaypointPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theWaypointPackage.createPackageContents();

    // Initialize created meta-data
    theWaypointPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theWaypointPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(WaypointPackage.eNS_URI, theWaypointPackage);
    return theWaypointPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWaypoint()
  {
    return waypointEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWaypoint_Waypoint()
  {
    return (EAttribute)waypointEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWaypoint_Position()
  {
    return (EAttribute)waypointEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWaypoint_Note()
  {
    return (EAttribute)waypointEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWaypoint_Btm()
  {
    return (EAttribute)waypointEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWaypoint_Dtm()
  {
    return (EAttribute)waypointEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWaypoint_Cog()
  {
    return (EAttribute)waypointEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWaypoint_Sog()
  {
    return (EAttribute)waypointEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWaypoint_Maneuver()
  {
    return (EAttribute)waypointEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWaypoint_Foresail()
  {
    return (EAttribute)waypointEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWaypoint_Mainsail()
  {
    return (EAttribute)waypointEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getManeuver()
  {
    return maneuverEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getForesail()
  {
    return foresailEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getMainsail()
  {
    return mainsailEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WaypointFactory getWaypointFactory()
  {
    return (WaypointFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    waypointEClass = createEClass(WAYPOINT);
    createEAttribute(waypointEClass, WAYPOINT__WAYPOINT);
    createEAttribute(waypointEClass, WAYPOINT__POSITION);
    createEAttribute(waypointEClass, WAYPOINT__NOTE);
    createEAttribute(waypointEClass, WAYPOINT__BTM);
    createEAttribute(waypointEClass, WAYPOINT__DTM);
    createEAttribute(waypointEClass, WAYPOINT__COG);
    createEAttribute(waypointEClass, WAYPOINT__SOG);
    createEAttribute(waypointEClass, WAYPOINT__MANEUVER);
    createEAttribute(waypointEClass, WAYPOINT__FORESAIL);
    createEAttribute(waypointEClass, WAYPOINT__MAINSAIL);

    // Create enums
    maneuverEEnum = createEEnum(MANEUVER);
    foresailEEnum = createEEnum(FORESAIL);
    mainsailEEnum = createEEnum(MAINSAIL);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(waypointEClass, Waypoint.class, "Waypoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWaypoint_Waypoint(), ecorePackage.getEString(), "waypoint", null, 0, 1, Waypoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWaypoint_Position(), ecorePackage.getEString(), "position", null, 0, 1, Waypoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWaypoint_Note(), ecorePackage.getEString(), "note", null, 0, 1, Waypoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWaypoint_Btm(), ecorePackage.getEString(), "btm", null, 0, 1, Waypoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWaypoint_Dtm(), ecorePackage.getEString(), "dtm", null, 0, 1, Waypoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWaypoint_Cog(), ecorePackage.getEString(), "cog", null, 0, 1, Waypoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWaypoint_Sog(), ecorePackage.getEString(), "sog", null, 0, 1, Waypoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWaypoint_Maneuver(), this.getManeuver(), "maneuver", null, 0, 1, Waypoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWaypoint_Foresail(), this.getForesail(), "foresail", null, 0, 1, Waypoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWaypoint_Mainsail(), this.getMainsail(), "mainsail", null, 0, 1, Waypoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(maneuverEEnum, Maneuver.class, "Maneuver");
    addEEnumLiteral(maneuverEEnum, Maneuver.NONE);
    addEEnumLiteral(maneuverEEnum, Maneuver.TACK);
    addEEnumLiteral(maneuverEEnum, Maneuver.JIBE);
    addEEnumLiteral(maneuverEEnum, Maneuver.LAYTO);
    addEEnumLiteral(maneuverEEnum, Maneuver.SETSAILS);
    addEEnumLiteral(maneuverEEnum, Maneuver.CHANGESAILS);
    addEEnumLiteral(maneuverEEnum, Maneuver.SAILSDOWN);
    addEEnumLiteral(maneuverEEnum, Maneuver.REFF);
    addEEnumLiteral(maneuverEEnum, Maneuver.ANKERUP);
    addEEnumLiteral(maneuverEEnum, Maneuver.ANKERDOWN);

    initEEnum(foresailEEnum, Foresail.class, "Foresail");
    addEEnumLiteral(foresailEEnum, Foresail.NONE);
    addEEnumLiteral(foresailEEnum, Foresail.GENUA1);
    addEEnumLiteral(foresailEEnum, Foresail.GENUA2);
    addEEnumLiteral(foresailEEnum, Foresail.GENUA3);
    addEEnumLiteral(foresailEEnum, Foresail.FOCK);
    addEEnumLiteral(foresailEEnum, Foresail.STORMFOCK);
    addEEnumLiteral(foresailEEnum, Foresail.BISTER);
    addEEnumLiteral(foresailEEnum, Foresail.SPINACKER);

    initEEnum(mainsailEEnum, Mainsail.class, "Mainsail");
    addEEnumLiteral(mainsailEEnum, Mainsail.NONE);
    addEEnumLiteral(mainsailEEnum, Mainsail.FULL);
    addEEnumLiteral(mainsailEEnum, Mainsail.REEF1);
    addEEnumLiteral(mainsailEEnum, Mainsail.REEF2);

    // Create resource
    createResource(eNS_URI);
  }

} //WaypointPackageImpl
