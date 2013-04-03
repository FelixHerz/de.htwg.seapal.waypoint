package models;

public interface IWaypoint {

	enum Maneuver {
		NONE, TACK, JIBE, LAYTO, SET_SAILS, CHANGE_SAILS, SAILS_DOWN, REFF, ANKER_UP, ANKER_DOWN
	}

	enum ForeSail {
		NONE, GENUA1, GENUA2, GENUA3, FOCK, STORM_FOCK, BISTER, SPINACKER
	}

	enum MainSail {
		NONE, FULL, REEF1, REEF2
	}
	
	 String getName();

	 String getPosition();

	 String getNote();

	 int getBTM();

	 int getDTM();

	 int getCOG();

	 int getSOG();

	 IMark getMark();

	 Maneuver getManeuver();

	 ForeSail getForesail();

	 MainSail getMainsail();

	 void setForesail(ForeSail foreSail);

	 void setName(String name);

	 void setPosition(String position);

	 void setNote(String note);

	 void setBTM(int btm);

	 void setDTM(int dtm);

	 void setCOG(int cog);

	 void setSOG(int sog);

	 void setMark(IMark mark);

	 void setManeuver(Maneuver maneuver);

	 void setMainsail(MainSail mainSail);

}