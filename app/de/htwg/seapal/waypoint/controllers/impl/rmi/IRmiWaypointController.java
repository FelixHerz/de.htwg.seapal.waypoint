package de.htwg.seapal.waypoint.controllers.impl.rmi;


import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import java.util.NoSuchElementException;

import de.htwg.seapal.waypoint.models.IWaypoint;
import de.htwg.seapal.waypoint.models.IWaypoint.ForeSail;
import de.htwg.seapal.waypoint.models.IWaypoint.MainSail;
import de.htwg.seapal.waypoint.models.IWaypoint.Maneuver;

/**
 * Represents a waypoint.
 * @author Felix
 *
 */
public interface IRmiWaypointController extends Remote {

	/**
	 * Returns the name of the waypoint.
	 * @return the name
	 */
	String getName() throws RemoteException;

	/**
	 * Returns the position as string of the waypoint.
	 * @return the position.
	 */
	String getPosition() throws RemoteException;

	/**
	 * Returns the Note of the waypoint.
	 * @return the note or an empty String.
	 */
	String getNote() throws RemoteException;

	/**
	 * Returns the Baring To Mark value.
	 * @return baring to mark in degrees.
	 */
	int getBTM() throws RemoteException;

	/**
	 * Returns the Distance To Mark value.
	 * @return distance to mark.
	 */
	int getDTM() throws RemoteException;

	/**
	 * Returns the Course Over Ground value.
	 * @return course over ground in degrees.
	 */
	int getCOG() throws RemoteException;

	/**
	 * Returns the Speed Over Ground value.
	 * @return speed over ground.
	 */
	int getSOG() throws RemoteException;

	/**
	 * Returns the mark.
	 * @return the mark
	 */
	String getMark() throws RemoteException;

	/**
	 * Returns the maneuver done at the waypoint.
	 * @return the maneuver
	 */
	Maneuver getManeuver() throws RemoteException;

	/**
	 * Returns the foresail set at the waypoint.
	 * @return the foresail
	 */
	ForeSail getForesail() throws RemoteException;

	/**
	 * Returns the main sail set at the waypoint.
	 * @return the main sail
	 */
	MainSail getMainsail() throws RemoteException;


	/**
	 * Sets the name.
	 * @param name the name
	 */
	void setName(String name) throws RemoteException;

	/**
	 * Sets the position.
	 * @param position the position
	 */
	void setPosition(String position) throws RemoteException;

	/**
	 * Sets the note.
	 * @param note the note
	 */
	void setNote(String note) throws RemoteException;

	/**
	 * Sets the Baring To Mark in degrees.
	 * @param btm Baring To Mark
	 */
	void setBTM(int btm) throws RemoteException;

	/**
	 * Sets the Distance To Mark.
	 * @param dtm Distance To Mark
	 */
	void setDTM(int dtm) throws RemoteException;

	/**
	 * Sets the Course Over Ground in degrees.
	 * @param cog Course Over Ground
	 */
	void setCOG(int cog) throws RemoteException;

	/**
	 * Sets the Speed Over Ground.
	 * @param sog Speed Over Ground
	 */
	void setSOG(int sog) throws RemoteException;

	/**
	 * Sets the mark representing through its id.
	 * @param markId id of mark
	 * @throws NoSuchElementException if there is no Mark to the id
	 */
	void setMark(String markId) throws RemoteException;

	/**
	 * Sets the maneuver of the waypoint.
	 * Don't use <tt>null</tt> here. Use <tt>Maneuver.NONE</tt> instead.
	 * @param maneuver the maneuver
	 * @throws IllegalArgumentException if mainSail is null
	 */
	void setManeuver(Maneuver maneuver) throws RemoteException;

	/**
	 * Sets the main sail.<br/>
	 * Don't use <tt>null</tt> here. Use <tt>Mainsail.NONE</tt> instead.
	 * @param mainSail the mainsail
	 * @throws IllegalArgumentException if mainSail is null
	 */
	void setMainsail(MainSail mainSail) throws RemoteException;

	/**
	 * Sets the fore sail.<br/>
	 * Don't use <tt>null</tt> here. Use <tt>Foresail.NONE</tt> instead.
	 * @param foreSail the foresail
	 * @throws IllegalArgumentException if foreSail is null
	 */
	void setForesail(ForeSail foreSail) throws RemoteException;

	/**
	 * Returns the string representing the current modifying waypoint.
	 * @return string representing the current modifying waypoint
	 */
	String getString() throws RemoteException;

	/**
	 * Creates a new WaypointElement.
	 */
	void createNewWaypoint() throws RemoteException;

	/**
	 * Selects the waypoint representing by the id.
	 * @param id id of waypoint
	 */
	void updateWaypoint(String id) throws RemoteException;


	/**
	 * Delete the currently selected waypoint.
	 */
	void deleteWaypoint() throws RemoteException;

	/**
	 * Saves the changes to the currently selected waypoint.
	 */
	void saveWaypoint() throws RemoteException;

	/**
	 * Gets a list of all waypoints.
	 */
	List<IWaypoint> getWaypoints() throws RemoteException;

	/**
	 * Closes database connection and other open resources.
	 */
	void tearDown() throws RemoteException;
}
