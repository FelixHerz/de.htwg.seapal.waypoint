package de.htwg.seapal.waypoint.database.impl;

import java.util.Map;

import com.avaje.ebean.Ebean;

import de.htwg.seapal.waypoint.database.IWaypointDatabase;
import de.htwg.seapal.waypoint.models.IWaypoint;
import de.htwg.seapal.waypoint.models.impl.Waypoint;

public class WaypointEBeanDatabase implements IWaypointDatabase {

	@Override
	public void open(final String database) {

	}

	@Override
	public void close() {

	}

	@Override
	public Map<String, IWaypoint> loadWaypoints() {
		return null;
	}

	@Override
	public Map<String, IWaypoint> loadWaypoints(final int limit) {
		return null;
	}

	@Override
	public IWaypoint getWaypointById(final String waypointId) {
		return Ebean.find(Waypoint.class, waypointId);
	}

	@Override
	public boolean insertWaypoint(final IWaypoint waypoint) {
		Ebean.save(waypoint);
		return true;
	}

	@Override
	public boolean updateWaypoint(final IWaypoint waypoint) {
		Ebean.update(waypoint);
		return true;
	}

	@Override
	public boolean deleteWaypoint(final IWaypoint waypoint) {
		Ebean.delete(Waypoint.class, waypoint.getId());
		return true;
	}

}
