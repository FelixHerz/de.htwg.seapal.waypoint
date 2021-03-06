package de.htwg.seapal.waypoint.models.mock;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import de.htwg.seapal.waypoint.models.IWaypoint;
import de.htwg.seapal.waypoint.models.IWaypoint.ForeSail;
import de.htwg.seapal.waypoint.models.IWaypoint.MainSail;
import de.htwg.seapal.waypoint.models.IWaypoint.Maneuver;

public class WaypointTest {

	private IWaypoint waypoint;

	@Before
	public void setUp() throws Exception {
		waypoint = new Waypoint();
	}

	@Test
	public void testGetName() {
		assertEquals("MyWaypoint", waypoint.getName());
	}

	@Test
	public void testGetPosition() {
		assertEquals("0°12'12\"E 47°12'12\"N", waypoint.getLatitude());
	}

	@Test
	public void testGetNote() {
		assertEquals("Here is a note", waypoint.getNote());
	}

	@Test
	public void testGetBTM() {
		assertEquals(0, waypoint.getBtm());
	}

	@Test
	public void testGetDTM() {
		assertEquals(0, waypoint.getDtm());
	}

	@Test
	public void testGetCOG() {
		assertEquals(0, waypoint.getCog());
	}
	@Test
	public void testGetSOG() {
		assertEquals(0, waypoint.getSog());
	}

	//FIXME use a correct mark
	@Test
	public void testGetMark() {
		assertEquals(null, waypoint.getMark());
	}

	@Test
	public void testGetForesail() {
		assertEquals(ForeSail.NONE, waypoint.getForesail());
	}


	@Test
	public void testGetMainsail() {
		assertEquals(MainSail.REEF1, waypoint.getMainsail());
	}


	@Test
	public void testGetManeuver() {
		assertEquals(Maneuver.ANKER_DOWN, waypoint.getManeuver());
	}

	@Test
	public void testToString() {
		assertEquals("{id=w1; name=MyWaypoint; pos=0°12'12\"E 47°12'12\"N; note=Here is a note; " +
				"btm=0; dtm=0; cog=0; sog=0; man=ANKER_DOWN; fsail=NONE; msail=REEF1; mark=null}",
				waypoint.toString());
	}



}
