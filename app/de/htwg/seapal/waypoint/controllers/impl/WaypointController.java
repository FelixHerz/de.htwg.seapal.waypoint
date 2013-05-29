package de.htwg.seapal.waypoint.controllers.impl;


import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import de.htwg.seapal.waypoint.controllers.AbstractWaypointController;
import de.htwg.seapal.waypoint.models.IWaypoint;

@Singleton
public class WaypointController extends AbstractWaypointController {

	@Inject
	public WaypointController(IWaypoint waypoint) throws RemoteException, NotBoundException {
		super(waypoint);
	}

}
