package de.htwg.seapal.waypoint.controllers;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import de.htwg.seapal.common.observer.Observable;
import de.htwg.seapal.mark.controllers.IMarkController;
import de.htwg.seapal.mark.models.IMark;
import de.htwg.seapal.waypoint.database.IWaypointDatabase;
import de.htwg.seapal.waypoint.models.IWaypoint;
import de.htwg.seapal.waypoint.models.IWaypoint.ForeSail;
import de.htwg.seapal.waypoint.models.IWaypoint.MainSail;
import de.htwg.seapal.waypoint.models.IWaypoint.Maneuver;
import de.htwg.seapal.waypoint.models.impl.Waypoint;

/**
 * Implements the common default behaviour.
 * @author Felix
 *
 */
@Singleton
public abstract class AbstractWaypointController extends Observable
implements IWaypointController {

	private static final int MAX_RANDOM_ID = 9999;

	/** The currently selected waypoint.	 */
	private IWaypoint waypoint;

	/** Controller handeling the persistence. */
	private final IWaypointDatabase persistenceController;

	@Inject
	private IMarkController markController;

	/**
	 * Creates an instance with a waypoint. Only for generalized classes.
	 * @param pWaypoint the waypoint.
	 */
	protected AbstractWaypointController(final IWaypoint pWaypoint, final IWaypointDatabase persistenceController) {
		this.waypoint = pWaypoint;
		this.persistenceController = persistenceController;
		persistenceController.open("waypoint.data");
	}

	/** (non-Javadoc).
	 * @see models.impls.IWaypoint#getName()
	 */
	@Override
	public final String getName() {
		return waypoint.getName();
	}

	@Override
	public final double getLatitude() {
		return waypoint.getLatitude();
	}

	@Override
	public final double getLongitude() {
		return waypoint.getLongitude();
	}

	@Override
	public final String getNote() {
		return waypoint.getNote();
	}

	@Override
	public final int getBTM() {
		IMark mark = markController.getMark(
				UUID.fromString(getMark()));

		if (mark == null) {
			return 0;
		}

		return (int)bearing(
				mark.getLatitude(),
				mark.getLongitude(),
				waypoint.getLatitude(),
				waypoint.getLongitude());
	}

	@Override
	public final int getDTM() {

		IMark mark = markController.getMark(
				UUID.fromString(getMark()));

		if (mark == null) {
			return 0;
		}

		return (int) distFrom(
				mark.getLatitude(),
				mark.getLongitude(),
				waypoint.getLatitude(),
				waypoint.getLongitude());
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
	public final void setLatitude(final double lat) {
		waypoint.setLatitude(lat);
		waypoint.setBtm(getBTM());
		waypoint.setDtm(getDTM());
		notifyObservers();
	}

	@Override
	public final void setLongitude(final double lng) {
		waypoint.setLongitude(lng);
		waypoint.setBtm(getBTM());
		waypoint.setDtm(getDTM());
		notifyObservers();
	}

	@Override
	public final void setNote(final String note) {
		waypoint.setNote(note);
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
		IMark mark = markController.getMark(UUID.fromString(markId));
		if (mark != null) {
			waypoint.setMark(markId);
			waypoint.setBtm(getBTM());
			waypoint.setDtm(getDTM());
		}
		notifyObservers();
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


	@Override
	public void selectWaypoint(final String id) {
		waypoint = persistenceController.getWaypointById(id);
	}

	private static double distFrom(final double lat1, final double lng1, final double lat2, final double lng2) {
		double earthRadius = 3958.75;
		double dLat = Math.toRadians(lat2-lat1);
		double dLng = Math.toRadians(lng2-lng1);
		double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
				Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
				Math.sin(dLng/2) * Math.sin(dLng/2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
		double dist = earthRadius * c;

		int meterConversion = 1609;

		return new Double(dist * meterConversion);
	}

	private static double bearing(final double lati1, final double lng1, final double lati2, final double lng2) {
		double deltaLong = Math.toRadians(lng2 - lng1);

		double lat1 = Math.toRadians(lati1);
		double lat2 = Math.toRadians(lati2);

		double y = Math.sin(deltaLong) * Math.cos(lat2);
		double x = Math.cos(lat1) * Math.sin(lat2) - Math.sin(lat1) * Math.cos(lat2) * Math.cos(deltaLong);
		double result = Math.toDegrees(Math.atan2(y, x));
		return (result + 360.0) % 360.0;
	}

}
