/**
 */
package org.xtext.htwg.seapal.waypoint.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.htwg.seapal.waypoint.Foresail;
import org.xtext.htwg.seapal.waypoint.Mainsail;
import org.xtext.htwg.seapal.waypoint.Maneuver;
import org.xtext.htwg.seapal.waypoint.Waypoint;
import org.xtext.htwg.seapal.waypoint.WaypointPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Waypoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.htwg.seapal.waypoint.impl.WaypointImpl#getWaypoint <em>Waypoint</em>}</li>
 *   <li>{@link org.xtext.htwg.seapal.waypoint.impl.WaypointImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.xtext.htwg.seapal.waypoint.impl.WaypointImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.xtext.htwg.seapal.waypoint.impl.WaypointImpl#getBtm <em>Btm</em>}</li>
 *   <li>{@link org.xtext.htwg.seapal.waypoint.impl.WaypointImpl#getDtm <em>Dtm</em>}</li>
 *   <li>{@link org.xtext.htwg.seapal.waypoint.impl.WaypointImpl#getCog <em>Cog</em>}</li>
 *   <li>{@link org.xtext.htwg.seapal.waypoint.impl.WaypointImpl#getSog <em>Sog</em>}</li>
 *   <li>{@link org.xtext.htwg.seapal.waypoint.impl.WaypointImpl#getManeuver <em>Maneuver</em>}</li>
 *   <li>{@link org.xtext.htwg.seapal.waypoint.impl.WaypointImpl#getForesail <em>Foresail</em>}</li>
 *   <li>{@link org.xtext.htwg.seapal.waypoint.impl.WaypointImpl#getMainsail <em>Mainsail</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WaypointImpl extends MinimalEObjectImpl.Container implements Waypoint
{
  /**
   * The default value of the '{@link #getWaypoint() <em>Waypoint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWaypoint()
   * @generated
   * @ordered
   */
  protected static final String WAYPOINT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWaypoint() <em>Waypoint</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWaypoint()
   * @generated
   * @ordered
   */
  protected String waypoint = WAYPOINT_EDEFAULT;

  /**
   * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPosition()
   * @generated
   * @ordered
   */
  protected static final String POSITION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPosition()
   * @generated
   * @ordered
   */
  protected String position = POSITION_EDEFAULT;

  /**
   * The default value of the '{@link #getNote() <em>Note</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNote()
   * @generated
   * @ordered
   */
  protected static final String NOTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNote() <em>Note</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNote()
   * @generated
   * @ordered
   */
  protected String note = NOTE_EDEFAULT;

  /**
   * The default value of the '{@link #getBtm() <em>Btm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBtm()
   * @generated
   * @ordered
   */
  protected static final String BTM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBtm() <em>Btm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBtm()
   * @generated
   * @ordered
   */
  protected String btm = BTM_EDEFAULT;

  /**
   * The default value of the '{@link #getDtm() <em>Dtm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDtm()
   * @generated
   * @ordered
   */
  protected static final String DTM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDtm() <em>Dtm</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDtm()
   * @generated
   * @ordered
   */
  protected String dtm = DTM_EDEFAULT;

  /**
   * The default value of the '{@link #getCog() <em>Cog</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCog()
   * @generated
   * @ordered
   */
  protected static final String COG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCog() <em>Cog</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCog()
   * @generated
   * @ordered
   */
  protected String cog = COG_EDEFAULT;

  /**
   * The default value of the '{@link #getSog() <em>Sog</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSog()
   * @generated
   * @ordered
   */
  protected static final String SOG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSog() <em>Sog</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSog()
   * @generated
   * @ordered
   */
  protected String sog = SOG_EDEFAULT;

  /**
   * The default value of the '{@link #getManeuver() <em>Maneuver</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManeuver()
   * @generated
   * @ordered
   */
  protected static final Maneuver MANEUVER_EDEFAULT = Maneuver.NONE;

  /**
   * The cached value of the '{@link #getManeuver() <em>Maneuver</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManeuver()
   * @generated
   * @ordered
   */
  protected Maneuver maneuver = MANEUVER_EDEFAULT;

  /**
   * The default value of the '{@link #getForesail() <em>Foresail</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForesail()
   * @generated
   * @ordered
   */
  protected static final Foresail FORESAIL_EDEFAULT = Foresail.NONE;

  /**
   * The cached value of the '{@link #getForesail() <em>Foresail</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getForesail()
   * @generated
   * @ordered
   */
  protected Foresail foresail = FORESAIL_EDEFAULT;

  /**
   * The default value of the '{@link #getMainsail() <em>Mainsail</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMainsail()
   * @generated
   * @ordered
   */
  protected static final Mainsail MAINSAIL_EDEFAULT = Mainsail.NONE;

  /**
   * The cached value of the '{@link #getMainsail() <em>Mainsail</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMainsail()
   * @generated
   * @ordered
   */
  protected Mainsail mainsail = MAINSAIL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WaypointImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return WaypointPackage.Literals.WAYPOINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWaypoint()
  {
    return waypoint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWaypoint(String newWaypoint)
  {
    String oldWaypoint = waypoint;
    waypoint = newWaypoint;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WaypointPackage.WAYPOINT__WAYPOINT, oldWaypoint, waypoint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPosition()
  {
    return position;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPosition(String newPosition)
  {
    String oldPosition = position;
    position = newPosition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WaypointPackage.WAYPOINT__POSITION, oldPosition, position));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNote()
  {
    return note;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNote(String newNote)
  {
    String oldNote = note;
    note = newNote;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WaypointPackage.WAYPOINT__NOTE, oldNote, note));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBtm()
  {
    return btm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBtm(String newBtm)
  {
    String oldBtm = btm;
    btm = newBtm;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WaypointPackage.WAYPOINT__BTM, oldBtm, btm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDtm()
  {
    return dtm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDtm(String newDtm)
  {
    String oldDtm = dtm;
    dtm = newDtm;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WaypointPackage.WAYPOINT__DTM, oldDtm, dtm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCog()
  {
    return cog;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCog(String newCog)
  {
    String oldCog = cog;
    cog = newCog;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WaypointPackage.WAYPOINT__COG, oldCog, cog));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSog()
  {
    return sog;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSog(String newSog)
  {
    String oldSog = sog;
    sog = newSog;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WaypointPackage.WAYPOINT__SOG, oldSog, sog));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Maneuver getManeuver()
  {
    return maneuver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setManeuver(Maneuver newManeuver)
  {
    Maneuver oldManeuver = maneuver;
    maneuver = newManeuver == null ? MANEUVER_EDEFAULT : newManeuver;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WaypointPackage.WAYPOINT__MANEUVER, oldManeuver, maneuver));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Foresail getForesail()
  {
    return foresail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setForesail(Foresail newForesail)
  {
    Foresail oldForesail = foresail;
    foresail = newForesail == null ? FORESAIL_EDEFAULT : newForesail;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WaypointPackage.WAYPOINT__FORESAIL, oldForesail, foresail));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mainsail getMainsail()
  {
    return mainsail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMainsail(Mainsail newMainsail)
  {
    Mainsail oldMainsail = mainsail;
    mainsail = newMainsail == null ? MAINSAIL_EDEFAULT : newMainsail;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WaypointPackage.WAYPOINT__MAINSAIL, oldMainsail, mainsail));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case WaypointPackage.WAYPOINT__WAYPOINT:
        return getWaypoint();
      case WaypointPackage.WAYPOINT__POSITION:
        return getPosition();
      case WaypointPackage.WAYPOINT__NOTE:
        return getNote();
      case WaypointPackage.WAYPOINT__BTM:
        return getBtm();
      case WaypointPackage.WAYPOINT__DTM:
        return getDtm();
      case WaypointPackage.WAYPOINT__COG:
        return getCog();
      case WaypointPackage.WAYPOINT__SOG:
        return getSog();
      case WaypointPackage.WAYPOINT__MANEUVER:
        return getManeuver();
      case WaypointPackage.WAYPOINT__FORESAIL:
        return getForesail();
      case WaypointPackage.WAYPOINT__MAINSAIL:
        return getMainsail();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case WaypointPackage.WAYPOINT__WAYPOINT:
        setWaypoint((String)newValue);
        return;
      case WaypointPackage.WAYPOINT__POSITION:
        setPosition((String)newValue);
        return;
      case WaypointPackage.WAYPOINT__NOTE:
        setNote((String)newValue);
        return;
      case WaypointPackage.WAYPOINT__BTM:
        setBtm((String)newValue);
        return;
      case WaypointPackage.WAYPOINT__DTM:
        setDtm((String)newValue);
        return;
      case WaypointPackage.WAYPOINT__COG:
        setCog((String)newValue);
        return;
      case WaypointPackage.WAYPOINT__SOG:
        setSog((String)newValue);
        return;
      case WaypointPackage.WAYPOINT__MANEUVER:
        setManeuver((Maneuver)newValue);
        return;
      case WaypointPackage.WAYPOINT__FORESAIL:
        setForesail((Foresail)newValue);
        return;
      case WaypointPackage.WAYPOINT__MAINSAIL:
        setMainsail((Mainsail)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case WaypointPackage.WAYPOINT__WAYPOINT:
        setWaypoint(WAYPOINT_EDEFAULT);
        return;
      case WaypointPackage.WAYPOINT__POSITION:
        setPosition(POSITION_EDEFAULT);
        return;
      case WaypointPackage.WAYPOINT__NOTE:
        setNote(NOTE_EDEFAULT);
        return;
      case WaypointPackage.WAYPOINT__BTM:
        setBtm(BTM_EDEFAULT);
        return;
      case WaypointPackage.WAYPOINT__DTM:
        setDtm(DTM_EDEFAULT);
        return;
      case WaypointPackage.WAYPOINT__COG:
        setCog(COG_EDEFAULT);
        return;
      case WaypointPackage.WAYPOINT__SOG:
        setSog(SOG_EDEFAULT);
        return;
      case WaypointPackage.WAYPOINT__MANEUVER:
        setManeuver(MANEUVER_EDEFAULT);
        return;
      case WaypointPackage.WAYPOINT__FORESAIL:
        setForesail(FORESAIL_EDEFAULT);
        return;
      case WaypointPackage.WAYPOINT__MAINSAIL:
        setMainsail(MAINSAIL_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case WaypointPackage.WAYPOINT__WAYPOINT:
        return WAYPOINT_EDEFAULT == null ? waypoint != null : !WAYPOINT_EDEFAULT.equals(waypoint);
      case WaypointPackage.WAYPOINT__POSITION:
        return POSITION_EDEFAULT == null ? position != null : !POSITION_EDEFAULT.equals(position);
      case WaypointPackage.WAYPOINT__NOTE:
        return NOTE_EDEFAULT == null ? note != null : !NOTE_EDEFAULT.equals(note);
      case WaypointPackage.WAYPOINT__BTM:
        return BTM_EDEFAULT == null ? btm != null : !BTM_EDEFAULT.equals(btm);
      case WaypointPackage.WAYPOINT__DTM:
        return DTM_EDEFAULT == null ? dtm != null : !DTM_EDEFAULT.equals(dtm);
      case WaypointPackage.WAYPOINT__COG:
        return COG_EDEFAULT == null ? cog != null : !COG_EDEFAULT.equals(cog);
      case WaypointPackage.WAYPOINT__SOG:
        return SOG_EDEFAULT == null ? sog != null : !SOG_EDEFAULT.equals(sog);
      case WaypointPackage.WAYPOINT__MANEUVER:
        return maneuver != MANEUVER_EDEFAULT;
      case WaypointPackage.WAYPOINT__FORESAIL:
        return foresail != FORESAIL_EDEFAULT;
      case WaypointPackage.WAYPOINT__MAINSAIL:
        return mainsail != MAINSAIL_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (waypoint: ");
    result.append(waypoint);
    result.append(", position: ");
    result.append(position);
    result.append(", note: ");
    result.append(note);
    result.append(", btm: ");
    result.append(btm);
    result.append(", dtm: ");
    result.append(dtm);
    result.append(", cog: ");
    result.append(cog);
    result.append(", sog: ");
    result.append(sog);
    result.append(", maneuver: ");
    result.append(maneuver);
    result.append(", foresail: ");
    result.append(foresail);
    result.append(", mainsail: ");
    result.append(mainsail);
    result.append(')');
    return result.toString();
  }

} //WaypointImpl
