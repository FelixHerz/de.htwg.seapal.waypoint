package de.htwg.seapal.waypoint.models.mock;

import de.htwg.seapal.waypoint.models.AbstractWaypoint;
import de.htwg.seapal.waypoint.models.IWaypoint;

/**
 * Mock of an waypoint for testing.
 * @author Felix
 *
 */
public class Waypoint extends AbstractWaypoint {

	/**
	 * Creates a new waypoint mock.
	 */
	public Waypoint() {
	}

	/**
	 * Creates a copy of the given waypoint.
	 * @param waypoint
	 */
	public Waypoint(final IWaypoint waypoint) {
		super(waypoint);
	}

	@Override
	public String getName() {
		return "MyWaypoint";
	}

	@Override
	public String getPosition() {
		return "0°12'12\"E 47°12'12\"N";
	}

	@Override
	public String getNote() {
		return "Here is a note";
	}

	@Override
	public int getBtm() {
		return 0;
	}

	@Override
	public int getDtm() {
		return 0;
	}

	@Override
	public int getCog() {
		return 0;
	}

	@Override
	public int getSog() {
		return 0;
	}

	@Override
	public String getMark() {
		return null;
	}

	@Override
	public Maneuver getManeuver() {
		return Maneuver.ANKER_DOWN;
	}

	@Override
	public ForeSail getForesail() {
		return ForeSail.NONE;
	}

	@Override
	public MainSail getMainsail() {
		return MainSail.REEF1;
	}

	@Override
	public String getId() {
		return "w1";
	}


	@Override
	public Object clone() throws CloneNotSupportedException {
		return new Waypoint(this);
	}

	@Override
	public void setForesail(final ForeSail foreSail) {

	}

	@Override
	public void setName(final String name) {

	}

	@Override
	public void setPosition(final String position) {

	}

	@Override
	public void setNote(final String note) {

	}

	@Override
	public void setBtm(final int btm) {

	}

	@Override
	public void setDtm(final int dtm) {

	}

	@Override
	public void setCog(final int cog) {

	}

	@Override
	public void setSog(final int sog) {

	}

	@Override
	public void setMark(final String mark) {

	}

	@Override
	public void setManeuver(final Maneuver maneuver) {

	}

	@Override
	public void setMainsail(final MainSail mainSail) {

	}

	@Override
	public void setId(final String id) {

	}

}
