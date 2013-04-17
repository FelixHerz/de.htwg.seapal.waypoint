package de.htwg.seapal.waypoint.controllers;

import java.util.NoSuchElementException;

import com.google.inject.Singleton;

import de.htwg.seapal.mark.controllers.IMarkController;
import de.htwg.seapal.mark.models.IMark;
import de.htwg.seapal.waypoint.models.IWaypoint;
import de.htwg.seapal.waypoint.models.IWaypoint.ForeSail;
import de.htwg.seapal.waypoint.models.IWaypoint.MainSail;
import de.htwg.seapal.waypoint.models.IWaypoint.Maneuver;
import de.htwg.seapal.waypoint.models.impl.Waypoint;
import de.htwg.seapal.waypoint.persistence.IPersistenceController;
import de.htwg.util.observer.Observable;

@Singleton
public class AbstractWaypointController extends Observable
		implements IWaypointController {

	/** The currently selected waypoint	 */
	private IWaypoint waypoint;
	
	/** To foreward all mark calls */
	private IMarkController markController;
	
	/** Controller handeling the persistence */
	private IPersistenceController persistenceController;
	
	protected AbstractWaypointController(IWaypoint waypoint) {
		this.waypoint = waypoint;
	}
	

	@Override
	public String getName() {
		return waypoint.getName();
	}

	@Override
	public String getPosition() {
		return waypoint.getPosition();
	}

	@Override
	public String getNote() {
		return waypoint.getNote();
	}
	
	@Override
	public int getBTM() {
		return waypoint.getBTM();
	}

	@Override
	public int getDTM() {
		return waypoint.getDTM();
	}

	@Override
	public int getCOG() {
		return waypoint.getCOG();
	}

	@Override
	public int getSOG() {
		return waypoint.getSOG();
	}

	@Override
	public IMark getMark() {
		return waypoint.getMark();
	}

	@Override
	public Maneuver getManeuver() {
		return waypoint.getManeuver();
	}

	@Override
	public ForeSail getForesail() {
		return waypoint.getForesail();
	}

	@Override
	public MainSail getMainsail() {
		return waypoint.getMainsail();
	}

	
	
	@Override
	public void setForesail(ForeSail foreSail) {
		waypoint.setForesail(foreSail);
		notifyObservers();
	}

	@Override
	public void setName(String name) {
		waypoint.setName(name);
		notifyObservers();
		
	}

	@Override
	public void setPosition(String position) {
		waypoint.setPosition(position);
		notifyObservers();
	}

	@Override
	public void setNote(String note) {
		waypoint.setNote(note);
		notifyObservers();
	}

	@Override
	public void setBTM(int btm) {
		waypoint.setBTM(btm);
		notifyObservers();
	}

	@Override
	public void setDTM(int dtm) {
		waypoint.setDTM(dtm);
		notifyObservers();
	}

	@Override
	public void setCOG(int cog) {
		waypoint.setCOG(cog);
		notifyObservers();
	}

	@Override
	public void setSOG(int sog) {
		waypoint.setSOG(sog);
		notifyObservers();
	}

	@Override
	public void setMark(String markId) throws NoSuchElementException {
		//TODO not implemented at all
		markController.getString();
	}

	@Override
	public void setManeuver(Maneuver maneuver) {
		waypoint.setManeuver(maneuver);
		notifyObservers();		
	}

	@Override
	public void setMainsail(MainSail mainSail) {
		waypoint.setMainsail(mainSail);
		notifyObservers();
	}

	@Override
	public String getString() {
		return "Waypoint:" + waypoint.toString();
	}


	@Override
	public void createNewWaypoint() {
		//FIXME Use DependencyInjection here
		//TODO Save Changes before creating a new waypoint?
		//TODO Compute id(?)
		waypoint = new Waypoint();
		notifyObservers();
	}


	@Override
	public void updateWaypoint(String id) {
		waypoint = persistenceController.getWaypointById(id);
		notifyObservers();
	}


	@Override
	public void deleteWaypoint() {
		if (waypoint != null)
			persistenceController.deleteWaypoint(waypoint);
		notifyObservers();
	}


	@Override
	public void saveWaypoint() {
		if (waypoint != null)
			persistenceController.insertWaypoint(waypoint);
		notifyObservers();
	}

}
