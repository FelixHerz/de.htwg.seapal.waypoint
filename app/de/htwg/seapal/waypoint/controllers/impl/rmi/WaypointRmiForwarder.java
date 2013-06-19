package de.htwg.seapal.waypoint.controllers.impl.rmi;

import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import de.htwg.seapal.common.observer.Observable;
import de.htwg.seapal.waypoint.controllers.IWaypointController;
import de.htwg.seapal.waypoint.models.IWaypoint;
import de.htwg.seapal.waypoint.models.IWaypoint.ForeSail;
import de.htwg.seapal.waypoint.models.IWaypoint.MainSail;
import de.htwg.seapal.waypoint.models.IWaypoint.Maneuver;

public class WaypointRmiForwarder extends Observable implements IWaypointController {

	private final IRmiWaypointController rmiReceiver;

	@Inject
	public WaypointRmiForwarder(@Named("ServerName") final String serverName) throws AccessException, RemoteException, NotBoundException {
		Registry registry = LocateRegistry.getRegistry(serverName);
		rmiReceiver = (IRmiWaypointController)registry.lookup("WaypointRmiServer");
	}

	@Override
	public String getName() {
		try {
			return rmiReceiver.getName();
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public double getLatitude() {
		try {
			return rmiReceiver.getLatitude();
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public double getLongitude() {
		try {
			return rmiReceiver.getLongitude();
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public String getNote() {
		try {
			return rmiReceiver.getNote();
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public int getBTM() {
		try {
			return rmiReceiver.getBTM();
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public int getDTM() {
		try {
			return rmiReceiver.getDTM();
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public int getCOG() {
		try {
			return rmiReceiver.getCOG();
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public int getSOG() {
		try {
			return rmiReceiver.getSOG();
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public String getMark() {
		try {
			return rmiReceiver.getMark();
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public Maneuver getManeuver() {
		try {
			return rmiReceiver.getManeuver();
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public ForeSail getForesail() {
		try {
			return rmiReceiver.getForesail();
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public MainSail getMainsail() {
		try {
			return rmiReceiver.getMainsail();
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void setName(final String name) {
		try {
			rmiReceiver.setName(name);
			notifyObservers();
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void setLatitude(final double lat) {
		try {
			rmiReceiver.setLatitude(lat);
			notifyObservers();
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void setNote(final String note) {
		try {
			rmiReceiver.setNote(note);
			notifyObservers();
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void setCOG(final int cog) {
		try {
			rmiReceiver.setCOG(cog);
			notifyObservers();
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}

	}

	@Override
	public void setSOG(final int sog) {
		try {
			rmiReceiver.setSOG(sog);
			notifyObservers();
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}

	}

	@Override
	public void setMark(final String markId) {
		try {
			rmiReceiver.setMark(markId);
			notifyObservers();
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}

	}

	@Override
	public void setManeuver(final Maneuver maneuver) {
		try {
			rmiReceiver.setManeuver(maneuver);
			notifyObservers();
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void setMainsail(final MainSail mainSail) {
		try {
			rmiReceiver.setMainsail(mainSail);
			notifyObservers();
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}

	}

	@Override
	public void setForesail(final ForeSail foreSail) {
		try {
			rmiReceiver.setForesail(foreSail);
			notifyObservers();
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public String getString() {
		try {
			return rmiReceiver.getString();
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void createNewWaypoint() {
		try {
			rmiReceiver.createNewWaypoint();
			notifyObservers();
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void updateWaypoint(final String id) {
		try {
			rmiReceiver.updateWaypoint(id);
			notifyObservers();
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void deleteWaypoint() {
		try {
			rmiReceiver.deleteWaypoint();
			notifyObservers();
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void saveWaypoint() {
		try {
			rmiReceiver.saveWaypoint();
			notifyObservers();
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}

	}

	@Override
	public List<IWaypoint> getWaypoints() {
		try {
			return rmiReceiver.getWaypoints();
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void tearDown() {
		try {
			rmiReceiver.tearDown();
			notifyObservers();
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}

	}

	@Override
	public void setLongitude(final double lng) {
		try {
			rmiReceiver.setLongitude(lng);
			notifyObservers();
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void selectWaypoint(final String id) {
		try {
			rmiReceiver.selectWaypoint(id);
		} catch (RemoteException e) {
			throw new RuntimeException(e);
		}
	}


}
