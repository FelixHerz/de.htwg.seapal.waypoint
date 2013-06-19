package de.htwg.seapal.waypoint.models;

import java.io.Serializable;


public interface IWaypoint extends Cloneable, Serializable {

	public enum Maneuver {
		NONE, TACK, JIBE, LAYTO, SET_SAILS, CHANGE_SAILS, SAILS_DOWN, REFF, ANKER_UP, ANKER_DOWN
	}

	public enum ForeSail {
		NONE, GENUA1, GENUA2, GENUA3, FOCK, STORM_FOCK, BISTER, SPINACKER
	}

	public enum MainSail {
		NONE, FULL, REEF1, REEF2
	}

	/**
	 * Returns the name of the Waypoint.
	 * @return the name of the waypoint
	 */
	String getName();

	/**
	 * Returns the position of the waypoint.
	 * @return the position
	 */
	double getLatitude();

	double getLongitude();

	String getNote();

	int getCog();

	int getSog();

	String getMark();

	Maneuver getManeuver();

	ForeSail getForesail();

	MainSail getMainsail();

	void setForesail(ForeSail foreSail);

	void setName(String name);

	void setLatitude(double lat);
	void setLongitude(double lng);

	void setNote(String note);

	void setCog(int cog);

	void setSog(int sog);

	void setMark(String mark);

	void setManeuver(Maneuver maneuver);

	void setMainsail(MainSail mainSail);

	void setId(String id);

	String getId();

	Object clone() throws CloneNotSupportedException;

	int getBtm();

	int getDtm();

	void setDtm(int dtm);

	void setBtm(int btm);
}