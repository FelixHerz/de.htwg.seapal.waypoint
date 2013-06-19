package de.htwg.seapal.waypoint.database.impl;

import java.util.Map;

import de.htwg.seapal.waypoint.database.IWaypointDatabase;
import de.htwg.seapal.waypoint.models.IWaypoint;

public class WaypointCouchDBDatabase implements IWaypointDatabase {

	@Override
	public void open(String database) {
//		HttpClient client = new StdHttpClient?.Builder()
//			.url("http://lenny2.in.htwg-konstanz.de:5984")
//			.build();
//		CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient);!
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Map<String, IWaypoint> loadWaypoints() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, IWaypoint> loadWaypoints(int limit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IWaypoint getWaypointById(String waypointId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertWaypoint(IWaypoint waypoint) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateWaypoint(IWaypoint waypoint) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteWaypoint(IWaypoint waypoint) {
		// TODO Auto-generated method stub
		return false;
	}

}
