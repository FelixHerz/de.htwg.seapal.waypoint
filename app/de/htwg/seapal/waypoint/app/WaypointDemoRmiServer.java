package de.htwg.seapal.waypoint.app;

import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import play.api.Application;
import play.api.DefaultApplication;
import play.api.Mode;
import play.api.Play;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.htwg.seapal.mark.app.MarkImplModule;
import de.htwg.seapal.waypoint.controllers.impl.rmi.IRmiWaypointController;

/**
 * A executable Demo application for Waypoint.
 * @author Felix
 *
 */
public final class WaypointDemoRmiServer {

	/** Silent checkstyle. */
	private WaypointDemoRmiServer() { }

	/**
	 * Silent checkstyle.
	 * @param args not used
	 */
	public static void main(final String[] args) {



		// Initialize Play Application to use the play environment functions...
		Application play = new DefaultApplication(
				new File("."), WaypointDemoRmiServer.class.getClassLoader(), null, Mode.Dev());
		Play.start(play);

		try {
			// Set up Google Guice Dependency Injector
			Injector injector = Guice.createInjector(
					new WaypointRmilModule(),
					new MarkImplModule());

			IRmiWaypointController rmiController = injector.getInstance(IRmiWaypointController.class);


			try {
				//Setting up the RMI Registry
				Registry registry = LocateRegistry.createRegistry(Registry.REGISTRY_PORT);
				IRmiWaypointController stub = (IRmiWaypointController)UnicastRemoteObject.exportObject(rmiController, 0);
				registry.rebind("WaypointRmiServer", stub);

				try {

					System.out.println("Press ENTER to shutdown the server");
					System.in.read();
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					UnicastRemoteObject.unexportObject(rmiController, true);
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				//In any case.. shut down that controller (closing the DB)
				try {
					rmiController.tearDown();
				} catch (RemoteException e) {
					/* never happens */
				}
			}
			System.out.println("Server Routine Finished");
		} finally {
			Play.stop();
		}

	}
}
