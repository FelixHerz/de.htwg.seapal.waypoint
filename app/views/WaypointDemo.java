package views;

import java.util.Scanner;

import views.tui.WaypointTUI;
import de.htwg.seapal.waypoint.controllers.IWaypointController;
import de.htwg.seapal.waypoint.controllers.impl.WaypointController;
import de.htwg.seapal.waypoint.models.IWaypoint;
import de.htwg.seapal.waypoint.models.impls.Waypoint;

public class WaypointDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IWaypoint waypoint = new Waypoint();
		IWaypointController waypointController = new WaypointController(waypoint);
		WaypointTUI tui = new WaypointTUI(waypointController);
		
		tui.printTUI();
		boolean continu = true;
		Scanner scanner = new Scanner(System.in);
		while (continu) {
			continu = tui.processInputLine(scanner.next());
		}
		

	}

}
