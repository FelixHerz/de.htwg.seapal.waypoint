package de.htwg.seapal.waypoint.controllers.mock;

import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.query.Predicate;

import de.htwg.seapal.waypoint.models.IWaypoint;

public class WaypointControllerDb4o {
	
	
	private ObjectContainer db;
	
	public WaypointControllerDb4o() {
		db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), "waypoint.data");
	}
	
	public void saveWaypoint(IWaypoint waypoint) {
		db.store(waypoint);
	}
	
	public IWaypoint getWaypointById(final String waypointId) {
		List<IWaypoint> waypoints = db.query(new Predicate<IWaypoint>() {

			private static final long serialVersionUID = 1L;

			@Override
			public boolean match(IWaypoint waypoint) {
				return waypoint.getId().equals(waypointId);
			}
		});
		
		if (waypoints.isEmpty())
			return null;
		return waypoints.get(0);
	}
	
	public void deleteWaypointById(String waypointId) {
		db.delete(getWaypointById(waypointId));
	}
	
	public void closeDb() {
		db.close();
	}
	
	
}
