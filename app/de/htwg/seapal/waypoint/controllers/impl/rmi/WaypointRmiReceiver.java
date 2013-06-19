package de.htwg.seapal.waypoint.controllers.impl.rmi;

import java.rmi.RemoteException;
import java.util.List;

import com.google.inject.Inject;

import de.htwg.seapal.waypoint.controllers.IWaypointController;
import de.htwg.seapal.waypoint.models.IWaypoint;
import de.htwg.seapal.waypoint.models.IWaypoint.ForeSail;
import de.htwg.seapal.waypoint.models.IWaypoint.MainSail;
import de.htwg.seapal.waypoint.models.IWaypoint.Maneuver;

public class WaypointRmiReceiver implements IRmiWaypointController {

	private final IWaypointController controller;

	@Inject
	public WaypointRmiReceiver(final IWaypointController controller) {
		this.controller = controller;
	}

	@Override
	public String getName() throws RemoteException {
		return controller.getName();
	}

	@Override
	public double getLatitude() throws RemoteException {
		return controller.getLatitude();
	}

	@Override
	public double getLongitude() throws RemoteException {
		return controller.getLatitude();
	}

	@Override
	public String getNote() throws RemoteException {
		return controller.getNote();
	}

	@Override
	public int getBTM() throws RemoteException {
		return controller.getBTM();
	}

	@Override
	public int getDTM() throws RemoteException {
		return controller.getDTM();
	}

	@Override
	public int getCOG() throws RemoteException {
		return controller.getCOG();
	}

	@Override
	public int getSOG() throws RemoteException {
		return controller.getSOG();
	}

	@Override
	public String getMark() throws RemoteException {
		return controller.getMark();
	}

	@Override
	public Maneuver getManeuver() throws RemoteException {
		return controller.getManeuver();
	}

	@Override
	public ForeSail getForesail() throws RemoteException {
		return controller.getForesail();
	}

	@Override
	public MainSail getMainsail() throws RemoteException {
		return controller.getMainsail();
	}

	@Override
	public void setName(final String name) throws RemoteException {
		controller.setName(name);
	}

	@Override
	public void setLatitude(final double latitude) throws RemoteException {
		controller.setLatitude(latitude);
	}

	@Override
	public void setLongitude(final double lng) throws RemoteException {
		controller.setLongitude(lng);
	}

	@Override
	public void setNote(final String note) throws RemoteException {
		controller.setNote(note);
	}

	@Override
	public void setCOG(final int cog) throws RemoteException {
		controller.setCOG(cog);
	}

	@Override
	public void setSOG(final int sog) throws RemoteException {
		controller.setSOG(sog);
	}

	@Override
	public void setMark(final String markId) throws RemoteException {
		controller.setMark(markId);
	}

	@Override
	public void setManeuver(final Maneuver maneuver) throws RemoteException {
		controller.setManeuver(maneuver);
	}

	@Override
	public void setMainsail(final MainSail mainSail) throws RemoteException {
		controller.setMainsail(mainSail);
	}

	@Override
	public void setForesail(final ForeSail foreSail) throws RemoteException {
		controller.setForesail(foreSail);
	}

	@Override
	public String getString() throws RemoteException {
		return controller.getString();
	}

	@Override
	public void createNewWaypoint() throws RemoteException {
		controller.createNewWaypoint();
	}

	@Override
	public void updateWaypoint(final String id) throws RemoteException {
		controller.updateWaypoint(id);
	}

	@Override
	public void deleteWaypoint() throws RemoteException {
		controller.deleteWaypoint();
	}

	@Override
	public void saveWaypoint() throws RemoteException {
		controller.saveWaypoint();
	}

	@Override
	public List<IWaypoint> getWaypoints() throws RemoteException {
		return controller.getWaypoints();
	}

	@Override
	public void tearDown() throws RemoteException {
		controller.tearDown();
	}

	@Override
	public void selectWaypoint(final String id) throws RemoteException {
		controller.selectWaypoint(id);
	}

}
