package de.htwg.seapal.waypoint.models.mock;

import de.htwg.seapal.mark.models.IMark;
import de.htwg.seapal.waypoint.models.AbstractWaypoint;

public class Waypoint extends AbstractWaypoint {

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

}
