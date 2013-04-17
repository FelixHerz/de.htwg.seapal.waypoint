package de.htwg.seapal.waypoint.persistence.db4o;

import java.util.List;
import java.util.TreeMap;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.query.Predicate;

import de.htwg.seapal.waypoint.models.IWaypoint;
import de.htwg.seapal.waypoint.persistence.IPersistenceController;

public class WaypointControllerDb4o implements IPersistenceController {
	
	
	private ObjectContainer db;
	
	public WaypointControllerDb4o() {
	}
	
	@Override
	public IWaypoint getWaypointById(final String waypointId) {
		List<IWaypoint> waypoints = db.query(new Predicate<IWaypoint>() {

			private static final long serialVersionUID = 1L;

			@Override
			public boolean match(IWaypoint waypoint) {
				return waypoint.getId().equals(waypointId);
			}
		});
		
		if (waypoints.isEmpty()) {
			return null;
		}
		return waypoints.get(0);
	}
	
	public void deleteWaypointById(String waypointId) {
		db.delete(getWaypointById(waypointId));
	}

	@Override
	public void open(String database) {
		db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), database);
	}

	@Override
	public void close() {
		db.close();
	}

	@Override
	public TreeMap<String, IWaypoint> loadWaypoints() {
		List<IWaypoint> list = db.query(IWaypoint.class);
		TreeMap<String, IWaypoint> map = new TreeMap<String, IWaypoint>();
		for (IWaypoint iWaypoint : list) {
			map.put(iWaypoint.getId(), iWaypoint);
		}
		return map;
	}

	@Override
	public TreeMap<String, IWaypoint> loadWaypoints(int limit) {
		List<IWaypoint> list = db.query(IWaypoint.class);
		TreeMap<String, IWaypoint> map = new TreeMap<String, IWaypoint>();
		int i = 0;
		for (IWaypoint iWaypoint : list) {
			map.put(iWaypoint.getId(), iWaypoint);
			if (++i == limit) {
				break;
			}
		}
		return map;
	}


	//TODO what if waypoint == null
	//TODO what if waypoint (not) stored yet?
	//TODO handle exceptions
	//TODO set returnvalue right
	
	@Override
	public boolean insertWaypoint(IWaypoint waypoint) {
		db.store(waypoint);
		return true;
	}

	@Override
	public boolean updateWaypoint(IWaypoint waypoint) {
		db.store(waypoint);
		return true;
	}

	@Override
	public boolean deleteWaypoint(IWaypoint waypoint) {
		db.delete(waypoint);
		return true;
	}
	
	
}
