package views;

import java.util.Scanner;

import views.tui.WaypointTUI;
import controllers.IWaypointController;
import controllers.impl.WaypointController;
import models.IWaypoint;
import models.impls.Waypoint;

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
