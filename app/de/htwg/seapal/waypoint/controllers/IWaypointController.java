package de.htwg.seapal.waypoint.controllers;


import java.util.NoSuchElementException;

import de.htwg.seapal.mark.models.IMark;
import de.htwg.seapal.waypoint.models.IWaypoint.*;
import de.htwg.util.observer.IObservable;


public interface IWaypointController extends IObservable {

	/**
	 * Returns the name of the waypoint.
	 * @return the name
	 */
	 String getName();

	 /**
	  * Returns the position as string of the waypoint.
	  * @return the position.
	  */
	 String getPosition();

	 /**
	  * Returns the Note of the waypoint.
	  * @return the note or an empty String.
	  */
	 String getNote();

	 /**
	  * Returns the Baring To Mark value.
	  * @return baring to mark in degrees.
	  */
	 int getBTM();

	 /**
	  * Returns the Distance To Mark value.
	  * @return distance to mark.
	  */
	 int getDTM();

	 /**
	  * Returns the Course Over Ground value.
	  * @return course over ground in degrees.
	  */
	 int getCOG();

	 /**
	  * Returns the Speed Over Ground value.
	  * @return speed over ground.
	  */
	 int getSOG();

	 IMark getMark();

	 /**
	  * Returns the maneuver done at the waypoint.
	  * @return
	  */
	 Maneuver getManeuver();

	 /**
	  * Returns the foresail set at the waypoint
	  * @return
	  */
	 ForeSail getForesail();

	 /**
	  * Returns the main sail set at the waypoint.
	  * @return
	  */
	 MainSail getMainsail();

	 

	 void setName(String name);

	 void setPosition(String position);

	 void setNote(String note);

	 /**
	  * Sets the Baring To Mark in degrees. 
	  * @param btm
	  */
	 void setBTM(int btm);

	 /**
	  * Sets the Distance To Mark.
	  * @param dtm
	  */
	 void setDTM(int dtm);

	 /**
	  * Sets the Course Over Ground in degrees.
	  * @param cog
	  */
	 void setCOG(int cog);

	 /**
	  * Sets the Speed Over Ground.
	  * @param sog
	  */
	 void setSOG(int sog);

	 /**
	  * Sets the mark representing through its id.
	  * @param markId
	  * @throws NoSuchElementException if there is no Mark to the id
	  */
	 void setMark(String markId) throws NoSuchElementException;

	 /**
	  * Sets the maneuver of the waypoint.
	  * Don't use <tt>null</tt> here. Use <tt>Maneuver.NONE</tt> instead.
	  * @param maneuver the maneuver
	  * @throws IllegalArgumentException if mainSail is null
	  */
	 void setManeuver(Maneuver maneuver);

	 /**
	  * Sets the main sail.<br/>
	  * Don't use <tt>null</tt> here. Use <tt>Mainsail.NONE</tt> instead.
	  * @param mainSail the mainsail 
	  * @throws IllegalArgumentException if mainSail is null
	  */
	 void setMainsail(MainSail mainSail);
	
	 /**
	  * Sets the fore sail.<br/>
	  * Don't use <tt>null</tt> here. Use <tt>Foresail.NONE</tt> instead.
	  * @param foreSail the foresail 
	  * @throws IllegalArgumentException if foreSail is null
	  */
	 void setForesail(ForeSail foreSail);
	 
	 /**
	  * Returns the string representing the current modifying waypoint.
	  * @return
	  */
	 String getString();
	 
	 /**
	  * Creates a new WaypointElement.
	  */
	 void createNewWaypoint();

	 /**
	  * Selects the waypoint representing by the id.
	  * @param id
	  */
	 void updateWaypoint(String id);


	 /**
	  * Delete the currently selected waypoint.
	  */
	 void deleteWaypoint();

	 /**
	  * Saves the changes to the currently selected waypoint.
	  */
	 void saveWaypoint();
	 
}