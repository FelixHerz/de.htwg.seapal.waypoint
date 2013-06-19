package de.htwg.seapal.waypoint.app;

import com.google.inject.AbstractModule;

import de.htwg.seapal.waypoint.controllers.IWaypointController;
import de.htwg.seapal.waypoint.controllers.impl.WaypointController;
import de.htwg.seapal.waypoint.controllers.impl.rmi.IRmiWaypointController;
import de.htwg.seapal.waypoint.controllers.impl.rmi.WaypointRmiReceiver;
import de.htwg.seapal.waypoint.database.IWaypointDatabase;
import de.htwg.seapal.waypoint.database.impl.WaypointDB4ODatabase;
import de.htwg.seapal.waypoint.models.IWaypoint;
import de.htwg.seapal.waypoint.models.impl.Waypoint;

/**
 * Injects the waypoint dependencies using the implementations.
 * @author Felix
 *
 */
public class WaypointRmilModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IWaypoint.class).to(Waypoint.class);
		bind(IWaypointController.class).to(WaypointController.class);
		bind(IRmiWaypointController.class).to(WaypointRmiReceiver.class);
		bind(IWaypointDatabase.class).to(WaypointDB4ODatabase.class);
	}

}
