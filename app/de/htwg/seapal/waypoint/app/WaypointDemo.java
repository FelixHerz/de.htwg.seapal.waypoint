package de.htwg.seapal.waypoint.app;

import java.io.File;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

import play.api.Application;
import play.api.DefaultApplication;
import play.api.Mode;
import play.api.Play;
import views.tui.WaypointTUI;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.htwg.seapal.mark.app.MarkImplModule;
import de.htwg.seapal.waypoint.controllers.IWaypointController;

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

		// Initialize Play Application to use the play environment functions...
		Application play = new DefaultApplication(
				new File("."), WaypointDemo.class.getClassLoader(), null, Mode.Dev());
		Play.start(play);

		try {
			// Set up Google Guice Dependency Injector
			Injector injector = Guice.createInjector(new WaypointImplModule(),
					new MarkImplModule());

			IWaypointController controller = injector.getInstance(IWaypointController.class);

			Registry registry = LocateRegistry.getRegistry(Registry.REGISTRY_PORT);
			IWaypointController stub = (IWaypointController)
					UnicastRemoteObject.exportObject(controller, 0);
			registry.rebind("WaypointController", stub);

			/* Build up the application, resolving dependencies
			 * automatically by Guice */
			WaypointTUI tui = new WaypointTUI(controller);

			tui.printTUI();
			/* continue to read user input on the tui until the user
			 * decides to quit*/
			boolean continu = true;
			Scanner scanner = new Scanner(System.in);
			while (continu) {
				continu = tui.processInputLine(scanner.nextLine());
			}
			scanner.close();
		} catch (RemoteException e) {
			e.printStackTrace();
		} finally {
			Play.stop();
		}

	}
}
