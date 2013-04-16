package de.htwg.seapal.waypoint.app;

import com.google.inject.AbstractModule;

import de.htwg.seapal.mark.controllers.IMarkController;
import de.htwg.seapal.mark.controllers.impl.MarkController;
import de.htwg.seapal.mark.models.IMark;
import de.htwg.seapal.mark.models.impl.Mark;
import de.htwg.seapal.waypoint.controllers.IWaypointController;
import de.htwg.seapal.waypoint.controllers.impl.WaypointController;
import de.htwg.seapal.waypoint.models.IWaypoint;
import de.htwg.seapal.waypoint.models.impl.Waypoint;

public class WaypointDemoImplModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IWaypoint.class).to(Waypoint.class);
		bind(IWaypointController.class).to(WaypointController.class);	

		bind(IMarkController.class).to(MarkController.class);
		bind(IMark.class).to(Mark.class);
	}

}
