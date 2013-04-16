package de.htwg.seapal.waypoint.controllers.impl;


import com.google.inject.Inject;
import com.google.inject.Singleton;

import de.htwg.seapal.waypoint.controllers.IWaypointController;
import de.htwg.seapal.mark.models.IMark;
import de.htwg.seapal.waypoint.models.IWaypoint;
import de.htwg.seapal.waypoint.models.IWaypoint.ForeSail;
import de.htwg.seapal.waypoint.models.IWaypoint.MainSail;
import de.htwg.seapal.waypoint.models.IWaypoint.Maneuver;
import de.htwg.util.observer.Observable;

@Singleton
public class WaypointController extends Observable implements IWaypointController {

	private IWaypoint waypoint;
	
	@Inject
	public WaypointController(IWaypoint waypoint) {
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
	public void setMark(IMark mark) {
		waypoint.setMark(mark);
		notifyObservers();
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
}
