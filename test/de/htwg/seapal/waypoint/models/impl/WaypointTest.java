package de.htwg.seapal.waypoint.models.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import de.htwg.seapal.waypoint.models.IWaypoint;

public class WaypointTest {

	private IWaypoint waypoint;
	
	@Before
	public void setUp() throws Exception {
		waypoint = new Waypoint();
	}

	@Test
	public void testName() {
		waypoint.setName("Waypoint 1");
		assertEquals("Waypoint 1", waypoint.getName());
	}

	@Test
	public void testNameEmpty() {
		try {
			waypoint.setName("");
			fail();
		} catch (IllegalArgumentException e) {
			
		} catch (Exception e) {
			fail();
		}
	}

	@Test
	public void testNameNull() {
		try {
			waypoint.setName(null);
			fail();
		} catch (IllegalArgumentException e) {
			
		} catch (Exception e) {
			fail();
		}
	}


	@Test
	public void testPosition() {
		waypoint.setPosition("0°12'12\"E 47°12'12\"N");
		assertEquals("0°12'12\"E 47°12'12\"N", waypoint.getPosition());
		

		waypoint.setPosition("0°12'E 47°12'N");
		assertEquals("0°12'E 47°12'N", waypoint.getPosition());
		

		waypoint.setPosition("0°E 47°N");
		assertEquals("0°E 47°N", waypoint.getPosition());
	}
	
	@Test
	public void testPositionWrong() {
		try {
			waypoint.setPosition("0°12'12\"E ");
			fail("Setting a wrong Position");
		} catch (IllegalArgumentException iae) {
			
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public void testPositionNull() {
		try {
			waypoint.setPosition(null);
			fail("Setting a null Position");
		} catch (IllegalArgumentException iae) {
			
		} catch (Exception e) {
			fail();
		}
	}

	@Test
	public void testNote() {
	}

	@Test
	public void testBTM() {
	}

	@Test
	public void testDTM() {
	}

	@Test
	public void testCOG() {
	}
	@Test
	public void testSOG() {
	}
	
	//FIXME use a correct mark
	@Test
	public void testMark() {
	}

	@Test
	public void testForesail() {
	}
	

	@Test
	public void testMainsail() {
	}
	

	@Test
	public void testManeuver() {
	}

	@Test
	public void testToString() {
		//assertEquals("{name=MyWaypoint; pos=0°12'12\"E 47°12'12\"N; note=Here is a note; " +
		//		"btm=0; dtm=0; cog=0; sog=0; man=ANKER_DOWN; fsail=NONE; msail=REEF1; mark=null}",
		//		waypoint.toString());
	}
	


}
