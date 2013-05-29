package de.htwg.seapal.waypoint.controllers;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import com.google.inject.Singleton;

import de.htwg.seapal.mark.controllers.IMarkController;
import de.htwg.seapal.waypoint.database.IWaypointDatabase;
import de.htwg.seapal.waypoint.database.impl.WaypointDB4ODatabase;
import de.htwg.seapal.waypoint.models.IWaypoint;
import de.htwg.seapal.waypoint.models.IWaypoint.ForeSail;
import de.htwg.seapal.waypoint.models.IWaypoint.MainSail;
import de.htwg.seapal.waypoint.models.IWaypoint.Maneuver;
import de.htwg.seapal.waypoint.models.impl.Waypoint;
import de.htwg.util.observer.IObservable;
import de.htwg.util.observer.Observable;

/**
 * Implements the common default behaviour.
 * @author Felix
 *
 */
@Singleton
public class AbstractWaypointController extends Observable
implements IWaypointController, IObservable {

	private static final int MAX_RANDOM_ID = 9999;

	/** The currently selected waypoint.	 */
	private IWaypoint waypoint;

	/** Controller handeling the persistence. */
	private final IWaypointDatabase persistenceController;

	private final IMarkController markController;


	/**
	 * Creates an instance with a waypoint. Only for generalized classes.
	 * @param pWaypoint the waypoint.
	 * @throws RemoteException
	 * @throws NotBoundException
	 */
	protected AbstractWaypointController(final IWaypoint pWaypoint) throws RemoteException, NotBoundException {
		this.waypoint = pWaypoint;
		persistenceController = new WaypointDB4ODatabase();
		persistenceController.open("waypoint.data");

		Registry registry = LocateRegistry.getRegistry("141.37.81.97");
		markController = (IMarkController) registry.lookup("Seapal_Mark");
	}

	/** (non-Javadoc).
	 * @see models.impls.IWaypoint#getName()
	 */
	@Override
	public final String getName() {
		return waypoint.getName();
	}

	@Override
	public final String getPosition() {
		return waypoint.getPosition();
	}

	@Override
	public final String getNote() {
		return waypoint.getNote();
	}

	@Override
	public final int getBTM() {
		return waypoint.getBtm();
	}

	@Override
	public final int getDTM() {
		return waypoint.getDtm();
	}

	@Override
	public final int getCOG() {
		return waypoint.getCog();
	}

	@Override
	public final int getSOG() {
		return waypoint.getSog();
	}

	@Override
	public final String getMark() {
		return waypoint.getMark();
	}

	@Override
	public final Maneuver getManeuver() {
		return waypoint.getManeuver();
	}

	@Override
	public final ForeSail getForesail() {
		return waypoint.getForesail();
	}

	@Override
	public final MainSail getMainsail() {
		return waypoint.getMainsail();
	}



	@Override
	public final void setForesail(final ForeSail foreSail) {
		waypoint.setForesail(foreSail);
		notifyObservers();
	}

	@Override
	public final void setName(final String name) {
		waypoint.setName(name);
		notifyObservers();

	}

	@Override
	public final void setPosition(final String position) {
		waypoint.setPosition(position);
		notifyObservers();
	}

	@Override
	public final void setNote(final String note) {
		waypoint.setNote(note);
		notifyObservers();
	}

	@Override
	public final void setBTM(final int btm) {
		waypoint.setBtm(btm);
		notifyObservers();
	}

	@Override
	public final void setDTM(final int dtm) {
		waypoint.setDtm(dtm);
		notifyObservers();
	}

	@Override
	public final void setCOG(final int cog) {
		waypoint.setCog(cog);
		notifyObservers();
	}

	@Override
	public final void setSOG(final int sog) {
		waypoint.setSog(sog);
		notifyObservers();
	}

	@Override
	public final void setMark(final String markId) {
		throw new UnsupportedOperationException("Not implemented yet");
	}

	@Override
	public final void setManeuver(final Maneuver maneuver) {
		waypoint.setManeuver(maneuver);
		notifyObservers();
	}

	@Override
	public final void setMainsail(final MainSail mainSail) {
		waypoint.setMainsail(mainSail);
		notifyObservers();
	}

	@Override
	public final String getString() {
		return "Waypoint:" + waypoint.toString();
	}


	@Override
	public final void createNewWaypoint() {
		//FIXME Use DependencyInjection here
		//TODO Save Changes before creating a new waypoint?
		//FIXME Compute id(?)
		waypoint = new Waypoint();
		waypoint.setId(String.valueOf(new Random().nextInt(MAX_RANDOM_ID)));
		notifyObservers();
	}


	@Override
	public final void updateWaypoint(final String id) {
		waypoint = persistenceController.getWaypointById(id);
		notifyObservers();
	}


	@Override
	public final void deleteWaypoint() {
		if (waypoint != null) {
			persistenceController.deleteWaypoint(waypoint);
		}
		notifyObservers();
	}


	@Override
	public final void saveWaypoint() {
		if (waypoint != null) {
			persistenceController.insertWaypoint(waypoint);
		}
		notifyObservers();
	}

	@Override
	public final void tearDown() {
		persistenceController.close();
	}

	@Override
	public final List<IWaypoint> getWaypoints() {
		return new LinkedList<IWaypoint>(
				persistenceController.loadWaypoints().values());
	}

}
