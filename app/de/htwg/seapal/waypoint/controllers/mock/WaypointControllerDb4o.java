package de.htwg.seapal.waypoint.controllers.mock;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

import de.htwg.seapal.waypoint.models.IWaypoint;

public class WaypointControllerDb4o {
	
	
	private ObjectContainer db;
	
	public WaypointControllerDb4o() {
		db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "waypoint.data");
	}
	
	public void saveWaypoint(IWaypoint waypoint) {
		db.store(waypoint);
	}
	
	
}
