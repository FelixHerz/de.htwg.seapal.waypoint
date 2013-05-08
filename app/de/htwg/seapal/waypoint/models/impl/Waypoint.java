package de.htwg.seapal.waypoint.models.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	private String name = "";

	@Column
	private String position = "";

	@Column
	private String note = "";

	@Column
	private int btm = 0;

	@Column
	private int dtm = 0;

	@Column
	private int sog = 0;

	@Column
	private int cog = 0;

	@Column
	private String mark = "";

	@Column
	private Maneuver maneuver = Maneuver.NONE;

	@Column
	private ForeSail foresail = ForeSail.NONE;

	@Column
	private MainSail mainsail = MainSail.NONE;



	/**
	 * Creates a new waypoint mock.
	 */
	public Waypoint() {
		id = Math.random() * 99999 + "";
		name = "Waypoint";
		position = "0°E 0°N";
		note = "";
		maneuver = Maneuver.NONE;
		foresail = ForeSail.NONE;
		mainsail = MainSail.NONE;
	}

	/**
	 * Creates a copy of the given waypoint.
	 * @param waypoint
	 */
	public Waypoint(final Waypoint waypoint) {
		super(waypoint);
		setId(waypoint.getId());
		setName(waypoint.getName());
		setPosition(waypoint.getPosition());
		setNote(waypoint.getNote());
		setBtm(waypoint.getBtm());
		setDtm(waypoint.getDtm());
		setCog(waypoint.getCog());
		setSog(waypoint.getSog());
		setManeuver(waypoint.getManeuver());
		setForesail(waypoint.getForesail());
		setMainsail(waypoint.getMainsail());
		setMark(waypoint.getMark());
	}

	@Override
	public void setId(final String id) {
		if (id == null) {
			throw new IllegalArgumentException("Id must not be null.");
		}
		this.id = id;
	}

	@Override
	public String getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#getName()
	 */
	@Override

	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#getPosition()
	 */

	@Override
	public String getPosition() {
		return position;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#getNote()
	 */

	@Override
	public String getNote() {
		return note;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#getBTM()
	 */

	@Override
	public int getBtm() {
		return btm;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#getDTM()
	 */

	@Override
	public int getDtm() {
		return dtm;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#getCOG()
	 */

	@Override
	public int getCog() {
		return cog;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#getSOG()
	 */

	@Override
	public int getSog() {
		return sog;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#getMark()
	 */

	@Override
	public String getMark() {
		return mark;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#getManeuver()
	 */

	@Override
	public Maneuver getManeuver() {
		return maneuver;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#getForesail()
	 */

	@Override
	public ForeSail getForesail() {
		return foresail;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#getMainsail()
	 */

	@Override
	public MainSail getMainsail() {
		return mainsail;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#setForesail(models.IWaypoint.ForeSail)
	 */

	@Override
	public void setForesail(final ForeSail foreSail) {
		if (foreSail == null) {
			throw new IllegalArgumentException("ForeSail must not be null.");
		}
		this.foresail = foreSail;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#setName(java.lang.String)
	 */
	@Override
	public void setName(final String name) {
		if (name == null || name.equals("")) {
			throw new IllegalArgumentException();
		}
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#setPosition(java.lang.String)
	 */
	@Override
	public void setPosition(final String position) {
		if (position == null || position.equals("")) {
			throw new IllegalArgumentException();
		}
		String trimmedposition = position.trim();
		if (!trimmedposition.matches("((1[0-8][0-9])|(0?\\d{0,2}))°(\\d{1,2}')?(\\d{1,2}\")?[E|W]\\s?" +
				"((90)|([0-8]\\d|\\d))°(\\d{1,2}')?(\\d{1,2}\")?[N|S]")) {
			throw new IllegalArgumentException(position);
		}
		this.position = trimmedposition;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#setNote(java.lang.String)
	 */
	@Override
	public void setNote(final String note) {
		if (note == null) {
			throw new IllegalArgumentException();
		}
		this.note = note;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#setBTM(int)
	 */
	@Override
	public void setBtm(final int btm) {
		this.btm = btm;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#setDTM(int)
	 */
	@Override
	public void setDtm(final int dtm) {
		this.dtm = dtm;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#setCOG(int)
	 */
	@Override
	public void setCog(final int cog) {
		this.cog = cog;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#setSOG(int)
	 */
	@Override
	public void setSog(final int sog) {
		this.sog = sog;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#setMark(models.IMark)
	 */
	@Override
	public void setMark(final String mark) {
		this.mark = mark;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#setManeuver(models.IWaypoint.Maneuver)
	 */
	@Override
	public void setManeuver(final Maneuver maneuver) {
		if (maneuver == null) {
			throw new IllegalArgumentException(
					"Maneuver must not be null. Use NONE instead.");
		}
		this.maneuver = maneuver;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#setMainsail(models.IWaypoint.MainSail)
	 */
	@Override
	public void setMainsail(final MainSail mainSail) {
		if (mainSail == null) {
			throw new IllegalArgumentException(
					"Mainsail must not be null. Use NONE instead.");
		}
		this.mainsail = mainSail;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return new Waypoint(this);
	}

}