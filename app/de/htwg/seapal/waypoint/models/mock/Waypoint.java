package de.htwg.seapal.waypoint.models.mock;

import javax.persistence.Entity;

import de.htwg.seapal.mark.models.IMark;
import de.htwg.seapal.waypoint.models.AbstractWaypoint;
import de.htwg.seapal.waypoint.models.IWaypoint;

/**
 * Mock of an waypoint for testing.
 * @author Felix
 *
 */
@Entity
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
	public int getBTM() {
		return 0;
	}

	@Override
	public int getDTM() {
		return 0;
	}

	@Override
	public int getCOG() {
		return 0;
	}

	@Override
	public int getSOG() {
		return 0;
	}

	@Override
	public IMark getMark() {
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
	public void setBTM(final int btm) {

	}

	@Override
	public void setDTM(final int dtm) {

	}

	@Override
	public void setCOG(final int cog) {

	}

	@Override
	public void setSOG(final int sog) {

	}

	@Override
	public void setMark(final IMark mark) {

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
