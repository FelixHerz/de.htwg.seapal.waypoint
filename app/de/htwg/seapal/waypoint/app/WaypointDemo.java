package de.htwg.seapal.waypoint.app;

import java.util.Scanner;

import views.tui.WaypointTUI;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.htwg.seapal.mark.app.MarkImplModule;

public class WaypointDemo {

	public static void main(String[] args) {

		// Set up Google Guice Dependency Injector
		Injector injector = Guice.createInjector(new WaypointDemoImplModule(),
												new MarkImplModule());

		// Build up the application, resolving dependencies automatically by Guice
		WaypointTUI tui = injector.getInstance(WaypointTUI.class);

		tui.printTUI();
		// continue to read user input on the tui until the user decides to quit
		boolean continu = true;
		Scanner scanner = new Scanner(System.in);
		while (continu) {
			continu = tui.processInputLine(scanner.nextLine());
		}

	}
}
