/**
 */
package org.xtext.htwg.seapal.waypoint;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Maneuver</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.htwg.seapal.waypoint.WaypointPackage#getManeuver()
 * @model
 * @generated
 */
public enum Maneuver implements Enumerator
{
  /**
   * The '<em><b>NONE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NONE_VALUE
   * @generated
   * @ordered
   */
  NONE(0, "NONE", "none"),

  /**
   * The '<em><b>TACK</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #TACK_VALUE
   * @generated
   * @ordered
   */
  TACK(1, "TACK", "Tack"),

  /**
   * The '<em><b>JIBE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #JIBE_VALUE
   * @generated
   * @ordered
   */
  JIBE(2, "JIBE", "Jibe"),

  /**
   * The '<em><b>LAYTO</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LAYTO_VALUE
   * @generated
   * @ordered
   */
  LAYTO(3, "LAYTO", "Layto"),

  /**
   * The '<em><b>SETSAILS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SETSAILS_VALUE
   * @generated
   * @ordered
   */
  SETSAILS(4, "SETSAILS", "Set Sails"),

  /**
   * The '<em><b>CHANGESAILS</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CHANGESAILS_VALUE
   * @generated
   * @ordered
   */
  CHANGESAILS(5, "CHANGESAILS", "Change Sails"),

  /**
   * The '<em><b>SAILSDOWN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SAILSDOWN_VALUE
   * @generated
   * @ordered
   */
  SAILSDOWN(6, "SAILSDOWN", "Sails Down"),

  /**
   * The '<em><b>REFF</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REFF_VALUE
   * @generated
   * @ordered
   */
  REFF(7, "REFF", "Reff"),

  /**
   * The '<em><b>ANKERUP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ANKERUP_VALUE
   * @generated
   * @ordered
   */
  ANKERUP(8, "ANKERUP", "Anker Up"),

  /**
   * The '<em><b>ANKERDOWN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ANKERDOWN_VALUE
   * @generated
   * @ordered
   */
  ANKERDOWN(9, "ANKERDOWN", "Anker Down");

  /**
   * The '<em><b>NONE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NONE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NONE
   * @model literal="none"
   * @generated
   * @ordered
   */
  public static final int NONE_VALUE = 0;

  /**
   * The '<em><b>TACK</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>TACK</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #TACK
   * @model literal="Tack"
   * @generated
   * @ordered
   */
  public static final int TACK_VALUE = 1;

  /**
   * The '<em><b>JIBE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>JIBE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #JIBE
   * @model literal="Jibe"
   * @generated
   * @ordered
   */
  public static final int JIBE_VALUE = 2;

  /**
   * The '<em><b>LAYTO</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>LAYTO</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LAYTO
   * @model literal="Layto"
   * @generated
   * @ordered
   */
  public static final int LAYTO_VALUE = 3;

  /**
   * The '<em><b>SETSAILS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SETSAILS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SETSAILS
   * @model literal="Set Sails"
   * @generated
   * @ordered
   */
  public static final int SETSAILS_VALUE = 4;

  /**
   * The '<em><b>CHANGESAILS</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CHANGESAILS</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CHANGESAILS
   * @model literal="Change Sails"
   * @generated
   * @ordered
   */
  public static final int CHANGESAILS_VALUE = 5;

  /**
   * The '<em><b>SAILSDOWN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SAILSDOWN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SAILSDOWN
   * @model literal="Sails Down"
   * @generated
   * @ordered
   */
  public static final int SAILSDOWN_VALUE = 6;

  /**
   * The '<em><b>REFF</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>REFF</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REFF
   * @model literal="Reff"
   * @generated
   * @ordered
   */
  public static final int REFF_VALUE = 7;

  /**
   * The '<em><b>ANKERUP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ANKERUP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ANKERUP
   * @model literal="Anker Up"
   * @generated
   * @ordered
   */
  public static final int ANKERUP_VALUE = 8;

  /**
   * The '<em><b>ANKERDOWN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ANKERDOWN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ANKERDOWN
   * @model literal="Anker Down"
   * @generated
   * @ordered
   */
  public static final int ANKERDOWN_VALUE = 9;

  /**
   * An array of all the '<em><b>Maneuver</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Maneuver[] VALUES_ARRAY =
    new Maneuver[]
    {
      NONE,
      TACK,
      JIBE,
      LAYTO,
      SETSAILS,
      CHANGESAILS,
      SAILSDOWN,
      REFF,
      ANKERUP,
      ANKERDOWN,
    };

  /**
   * A public read-only list of all the '<em><b>Maneuver</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Maneuver> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Maneuver</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Maneuver get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Maneuver result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Maneuver</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Maneuver getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Maneuver result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Maneuver</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Maneuver get(int value)
  {
    switch (value)
    {
      case NONE_VALUE: return NONE;
      case TACK_VALUE: return TACK;
      case JIBE_VALUE: return JIBE;
      case LAYTO_VALUE: return LAYTO;
      case SETSAILS_VALUE: return SETSAILS;
      case CHANGESAILS_VALUE: return CHANGESAILS;
      case SAILSDOWN_VALUE: return SAILSDOWN;
      case REFF_VALUE: return REFF;
      case ANKERUP_VALUE: return ANKERUP;
      case ANKERDOWN_VALUE: return ANKERDOWN;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Maneuver(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Maneuver
