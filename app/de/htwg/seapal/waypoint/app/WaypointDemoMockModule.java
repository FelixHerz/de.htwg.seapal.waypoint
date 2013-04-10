package de.htwg.seapal.waypoint.app;

import com.google.inject.AbstractModule;

import de.htwg.seapal.mark.controllers.IMarkController;
import de.htwg.seapal.mark.models.IMark;
import de.htwg.seapal.waypoint.controllers.IWaypointController;
import de.htwg.seapal.waypoint.models.IWaypoint;

public class WaypointDemoMockModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IWaypoint.class).to(de.htwg.seapal.waypoint.models.mock.Waypoint.class);
		bind(IWaypointController.class).to(de.htwg.seapal.waypoint.controllers.mock.WaypointController.class);	

		bind(IMarkController.class).to(de.htwg.seapal.mark.controllers.mock.MarkController.class);
		bind(IMark.class).to(de.htwg.seapal.mark.models.mock.Mark.class);
	}
}
