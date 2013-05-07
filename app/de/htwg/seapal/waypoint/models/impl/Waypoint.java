package de.htwg.seapal.waypoint.models.impl;

import javax.persistence.Entity;

import javax.persistence.Column;	
import javax.persistence.GeneratedValue;	
import javax.persistence.GenerationType;	
import javax.persistence.Id;	

import de.htwg.seapal.mark.models.IMark;
import de.htwg.seapal.waypoint.models.AbstractWaypoint;


/**
 * Mock of an waypoint for testing.
 * @author Felix
 *
 */
@Entity
public class Waypoint extends AbstractWaypoint {

	@Id @GeneratedValue(strategy=GenerationType.AUTO) 
	private String id;
	
	@Column
	private String name = null;
	
	@Column	
	private String position = null;
	
	@Column	
	private String note;
	
	@Column	
	private int btm = 0;

	@Column	
	private int dtm = 0;
	
	@Column	
	private int sog = 0;

	@Column	
	private int cog = 0;

	@Column	
	private IMark mark = null;

	@Column
	private Maneuver maneuver = null;

	@Column	
	private ForeSail foresail = null;

	@Column	
	private MainSail mainsail = null;
	

	
	/**
	 * Creates a new waypoint mock.
	 */
	public Waypoint() {
	}

	/**
	 * Creates a copy of the given waypoint.
	 * @param waypoint
	 */
	public Waypoint(final Waypoint waypoint) {
		super(waypoint);
	}

	public String getName() {
		return "MyWaypoint";
	}

	public String getPosition() {
		return "0°12'12\"E 47°12'12\"N";
	}

	public String getNote() {
		return "Here is a note";
	}

	public int getBTM() {
		return 0;
	}

	public int getDTM() {
		return 0;
	}

	public int getCOG() {
		return 0;
	}

	public int getSOG() {
		return 0;
	}

	public IMark getMark() {
		return null;
	}

	public Maneuver getManeuver() {
		return Maneuver.ANKER_DOWN;
	}

	public ForeSail getForesail() {
		return ForeSail.NONE;
	}

	public MainSail getMainsail() {
		return MainSail.REEF1;
	}

	public String getId() {
		return "w1";
	}

	public Object clone() throws CloneNotSupportedException {
		return new Waypoint(this);
	}

}