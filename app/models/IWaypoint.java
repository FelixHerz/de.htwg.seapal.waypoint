package models;


public interface IWaypoint {
	
	enum Maneuver {
		TACK, JIBE, LAYTO, SET_SAILS, CHANGE_SAILS, SAILS_DOWN, REFF, ANKER_UP, ANKER_DOWN
	}
	
	enum ForeSail {
		GENUA1, GENUA2, GENUA3, FOCK, STORM_FOCK, BISTER, SPINACKER
	}
	
	enum MainSail {
		FULL, REEF1, REEF2
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

}
