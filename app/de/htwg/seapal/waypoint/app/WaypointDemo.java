package de.htwg.seapal.waypoint.app;

import java.util.Scanner;

import views.tui.WaypointTUI;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.htwg.seapal.mark.app.MarkImplModule;

/**
 * A executable Demo application for Waypoint.
 * @author Felix
 *
 */
public final class WaypointDemo {

	/** Silent checkstyle. */
	private WaypointDemo() { }

	/**
	 * Silent checkstyle.
	 * @param args not used
	 */
	public static void main(final String[] args) {

		// Set up Google Guice Dependency Injector
		Injector injector = Guice.createInjector(new WaypointImplModule(),
				new MarkImplModule());

		/* Build up the application, resolving dependencies
		 * automatically by Guice */
		WaypointTUI tui = injector.getInstance(WaypointTUI.class);

		tui.printTUI();
		/* continue to read user input on the tui until the user
		 * decides to quit*/
		boolean continu = true;
		Scanner scanner = new Scanner(System.in);
		while (continu) {
			continu = tui.processInputLine(scanner.nextLine());
		}
		scanner.close();

	}
}
