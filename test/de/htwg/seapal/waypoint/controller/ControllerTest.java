package de.htwg.seapal.waypoint.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.htwg.seapal.waypoint.controllers.IWaypointController;
import de.htwg.seapal.waypoint.controllers.impl.WaypointController;
import de.htwg.seapal.waypoint.models.IWaypoint.ForeSail;
import de.htwg.seapal.waypoint.models.IWaypoint.MainSail;
import de.htwg.seapal.waypoint.models.IWaypoint.Maneuver;
import de.htwg.seapal.waypoint.models.mock.Waypoint;

public class ControllerTest {

	private IWaypointController controller;

	@Before
	public void setUp() {
		try {
			controller = new WaypointController(new Waypoint());
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}

	@After
	public void tearDown() {
		try {
			controller.tearDown();
		} catch (RemoteException e) {
			fail();
		}
	}

	@Test
	public void testGetName() {
		try {
			assertEquals("MyWaypoint", controller.getName());
		} catch (RemoteException e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void testGetPosition() {
		try {
			assertEquals("0°12'12\"E 47°12'12\"N", controller.getPosition());
		} catch (RemoteException e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void testGetNote() {
		try {
			assertEquals("Here is a note", controller.getNote());
		} catch (RemoteException e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void testGetBTM() {
		try {
			assertEquals(0, controller.getBTM());
		} catch (RemoteException e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void testGetDTM() {
		try {
			assertEquals(0, controller.getDTM());
		} catch (RemoteException e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void testGetCOG() {
		try {
			assertEquals(0, controller.getCOG());
		} catch (RemoteException e) {
			e.printStackTrace();
			fail();
		}
	}
	@Test
	public void testGetSOG() {
		try {
			assertEquals(0, controller.getSOG());
		} catch (RemoteException e) {
			e.printStackTrace();
			fail();
		}
	}

	//FIXME use a correct mark
	@Test
	public void testGetMark() {
		try {
			assertEquals(null, controller.getMark());
		} catch (RemoteException e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void testGetForesail() {
		try {
			assertEquals(ForeSail.NONE, controller.getForesail());
		} catch (RemoteException e) {
			e.printStackTrace();
			fail();
		}
	}


	@Test
	public void testGetMainsail() {
		try {
			assertEquals(MainSail.REEF1, controller.getMainsail());
		} catch (RemoteException e) {
			e.printStackTrace();
			fail();
		}
	}


	@Test
	public void testGetManeuver() {
		try {
			assertEquals(Maneuver.ANKER_DOWN, controller.getManeuver());
		} catch (RemoteException e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	public void testToString() {
		try {
			assertEquals("Waypoint:{id=w1; name=MyWaypoint; pos=0°12'12\"E 47°12'12\"N; note=Here is a note; " +
					"btm=0; dtm=0; cog=0; sog=0; man=ANKER_DOWN; fsail=NONE; msail=REEF1; mark=null}",
					controller.getString());
		} catch (RemoteException e) {
			e.printStackTrace();
			fail();
		}
	}

}
