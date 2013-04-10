package de.htwag.seapal.waypoint.app;

import com.google.inject.AbstractModule;

import de.htwg.seapal.mark.controllers.IMarkController;
import de.htwg.seapal.mark.models.IMark;
import de.htwg.seapal.waypoint.controllers.IWaypointController;
import de.htwg.seapal.waypoint.models.IWaypoint;

public class WaypointDemoImplModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IWaypoint.class).to(de.htwg.seapal.waypoint.models.impl.Waypoint.class);
		bind(IWaypointController.class).to(de.htwg.seapal.waypoint.controllers.impl.WaypointController.class);	

		bind(IMarkController.class).to(de.htwg.seapal.mark.controllers.impl.MarkController.class);
		bind(IMark.class).to(de.htwg.seapal.mark.models.impl.Mark.class);
	}

}
