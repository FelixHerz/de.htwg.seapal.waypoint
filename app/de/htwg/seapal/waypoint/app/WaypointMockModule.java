package de.htwg.seapal.waypoint.app;

import views.tui.states.StateFactory;
import views.tui.states.StateFactoryImpl;

import com.google.inject.AbstractModule;

import de.htwg.seapal.waypoint.controllers.IWaypointController;
import de.htwg.seapal.waypoint.controllers.mock.WaypointController;
import de.htwg.seapal.waypoint.database.IWaypointDatabase;
import de.htwg.seapal.waypoint.database.impl.WaypointDB4ODatabase;
import de.htwg.seapal.waypoint.models.IWaypoint;
import de.htwg.seapal.waypoint.models.mock.Waypoint;

/**
 * Injects the waypoint dependencies using the mocks.
 * @author Felix
 *
 */
public class WaypointMockModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IWaypoint.class).to(Waypoint.class);
		bind(IWaypointController.class).to(WaypointController.class);
		bind(IWaypointDatabase.class).to(WaypointDB4ODatabase.class);
		bind(StateFactory.class).to(StateFactoryImpl.class);
	}
}
