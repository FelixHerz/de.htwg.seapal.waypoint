package de.htwg.seapal.waypoint.app;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

import de.htwg.seapal.waypoint.controllers.IWaypointController;
import de.htwg.seapal.waypoint.controllers.impl.rmi.WaypointRmiForwarder;
import de.htwg.seapal.waypoint.models.IWaypoint;
import de.htwg.seapal.waypoint.models.impl.Waypoint;

/**
 * Injects the waypoint dependencies using the implementations.
 * @author Felix
 *
 */
public class WaypointRmiModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IWaypoint.class).to(Waypoint.class);
		bind(IWaypointController.class).to(WaypointRmiForwarder.class);
		bind(String.class)
		.annotatedWith(Names.named("ServerName"))
		.toInstance("localhost");
	}

}
