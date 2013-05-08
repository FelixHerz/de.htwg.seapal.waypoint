package de.htwg.seapal.waypoint.database.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import play.api.Application;
import play.api.DefaultApplication;
import play.api.Mode;
import play.api.Play;
import de.htwg.seapal.waypoint.database.IWaypointDatabase;
import de.htwg.seapal.waypoint.models.IWaypoint;
import de.htwg.seapal.waypoint.models.IWaypoint.MainSail;

/**
 * Test the Persistence using a DB4O database.
 * @author Felix
 *
 */
public class WaypointEbeanDatabaseTest {

	private IWaypointDatabase dbController;
	private final IWaypoint waypoint;

	public WaypointEbeanDatabaseTest() {
		waypoint = new de.htwg.seapal.waypoint.models.impl.Waypoint();
		waypoint.setId("W1");
		waypoint.setBtm(12);
		waypoint.setDtm(14);
		waypoint.setCog(16);
		waypoint.setSog(18);
		waypoint.setName("Waypoint 1");
		waypoint.setNote("My Note");
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {


		// Initialize Play Application to use the play environment functions...
		Application play = new DefaultApplication(
				new File("."), WaypointEbeanDatabaseTest.class.getClassLoader(), null, Mode.Dev());
		Play.start(play);


	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Play.stop();
	}

	@Before
	public void setUp() throws Exception {
		dbController = new WaypointEBeanDatabase();
		dbController.open("test.data");

	}

	@After
	public void tearDown() throws Exception {
		dbController.close();
		File f = new File("test.data");
		if (f.exists()) {
			if (!f.delete()) {
				System.err.println("Couldn't delete test database file");
			}
		}
	}

	@Test
	public void testStoreWaypoint() {
		dbController.insertWaypoint(waypoint);
		IWaypoint waypointGot = dbController.getWaypointById("W1");

		//Verify
		assertEquals(waypoint, waypointGot);

		//clean up
		dbController.deleteWaypoint(waypoint);
	}

	@Test
	public void testUpdateWaypoint() throws CloneNotSupportedException {
		//TODO check this test
		dbController.insertWaypoint(waypoint);
		IWaypoint waypointGot = dbController.getWaypointById("W1");

		IWaypoint clone = (IWaypoint)waypoint.clone();

		waypointGot.setMainsail(MainSail.FULL);
		dbController.updateWaypoint(waypointGot);

		waypointGot = dbController.getWaypointById("W1");

		System.out.println(clone);
		System.out.println(waypointGot);
		System.out.println(waypoint);
		System.out.println(clone.equals(waypointGot));
		assertFalse(clone.equals(waypointGot));
		assertTrue(waypoint.equals(waypointGot));

		//clean up
		dbController.deleteWaypoint(waypoint);
	}

	@Test
	public void testGetWaypoints() throws CloneNotSupportedException {
		dbController.insertWaypoint(waypoint);
		IWaypoint clone = (IWaypoint)waypoint.clone();
		clone.setId("w2");
		dbController.insertWaypoint(clone);

		Map<String, IWaypoint> map = dbController.loadWaypoints();
		assertEquals(2, map.size());
		assertEquals(waypoint, map.get("W1"));
		assertEquals(clone, map.get("w2"));


		//clean up
		dbController.deleteWaypoint(waypoint);
		dbController.deleteWaypoint(clone);
	}


	@Test
	public void testGetWaypointsLimit() throws CloneNotSupportedException {
		dbController.insertWaypoint(waypoint);
		IWaypoint clone = (IWaypoint)waypoint.clone();
		clone.setId("w2");
		dbController.insertWaypoint(clone);

		clone = (IWaypoint)waypoint.clone();
		clone.setId("w3");
		dbController.insertWaypoint(clone);

		Map<String, IWaypoint> map = dbController.loadWaypoints(2);
		assertEquals(2, map.size());
		assertEquals(waypoint, map.get("W1"));
		assertNull(map.get("w3"));

		map = dbController.loadWaypoints(4);
		assertEquals(3, map.size());
		assertEquals(waypoint, map.get("W1"));
		assertEquals(clone, map.get("w3"));
	}

	@Test
	public void testDeleteWaypoint() {
		dbController.insertWaypoint(waypoint);
		dbController.deleteWaypoint(waypoint);
		assertNull(dbController.getWaypointById("W1"));
	}

}
