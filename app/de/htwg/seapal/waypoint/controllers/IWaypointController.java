package de.htwg.seapal.waypoint.controllers;


import de.htwg.seapal.mark.models.IMark;
import de.htwg.seapal.waypoint.models.IWaypoint.*;
import de.htwg.util.observer.IObservable;


public interface IWaypointController extends IObservable {

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
	
	String getString();

}