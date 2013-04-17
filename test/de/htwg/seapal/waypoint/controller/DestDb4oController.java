package de.htwg.seapal.waypoint.controller;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import de.htwg.seapal.waypoint.controllers.impl.WaypointControllerDb4o;
import de.htwg.seapal.waypoint.models.IWaypoint;
import de.htwg.seapal.waypoint.models.IWaypoint.MainSail;

public class DestDb4oController {

	private WaypointControllerDb4o dbController;
	private final IWaypoint waypoint;
	
	public DestDb4oController() {
		waypoint = new de.htwg.seapal.waypoint.models.impl.Waypoint();
		waypoint.setId("W1");
		waypoint.setBTM(12);
		waypoint.setDTM(14);
		waypoint.setCOG(16);
		waypoint.setSOG(18);
		waypoint.setName("Waypoint 1");
		waypoint.setNote("My Note");
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		dbController = new WaypointControllerDb4o("test.data");
		
	}

	@After
	public void tearDown() throws Exception {
		dbController.closeDb();
		File f = new File("test.data");
		if (f.exists()) {
			if (!f.delete()) {
				System.err.println("Couldn't delete test database file");
			}
		}
	}

	@Test
	public void testStoreWaypoint() {
		dbController.saveWaypoint(waypoint);
		IWaypoint waypointGot = dbController.getWaypointById("W1");
		assertEquals(waypoint, waypointGot);
	}

	@Test
	public void testUpdateWaypoint() throws CloneNotSupportedException {
		dbController.saveWaypoint(waypoint);
		IWaypoint waypointGot = dbController.getWaypointById("W1");
		
		IWaypoint clone = (IWaypoint)waypoint.clone();
		
		waypointGot.setMainsail(MainSail.FULL);
		dbController.saveWaypoint(waypointGot);
		
		waypointGot = dbController.getWaypointById("W1");
		
		assertFalse(clone.equals(waypointGot));
		assertTrue(waypoint.equals(waypointGot)); 
		
	}

	@Test
	public void testGetWaypoint() {
		
	}

	@Test
	public void testDeleteWaypoint() {
		
	}

}
