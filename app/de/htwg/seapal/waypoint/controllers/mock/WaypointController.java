package de.htwg.seapal.waypoint.controllers.mock;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import de.htwg.seapal.waypoint.controllers.AbstractWaypointController;
import de.htwg.seapal.waypoint.database.IWaypointDatabase;
import de.htwg.seapal.waypoint.models.IWaypoint;

@Singleton
public class WaypointController extends AbstractWaypointController {

	@Inject
	public WaypointController(final IWaypoint waypoint, final IWaypointDatabase db) {
		super(waypoint, db);
	}
}
