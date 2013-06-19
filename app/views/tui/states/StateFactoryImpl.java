package views.tui.states;

import com.google.inject.Inject;

import de.htwg.seapal.mark.controllers.IMarkController;
import de.htwg.seapal.waypoint.controllers.IWaypointController;

public class StateFactoryImpl implements StateFactory {

	private InMenuState inMenuState;
	private InMarkMenuState inMarkState;
	private InWaypointSelectedState inWaypointSelectedState;

	IWaypointController waypointController;
	IMarkController markController;

	@Inject
	public StateFactoryImpl(final IWaypointController wC, final IMarkController mC) {
		waypointController = wC;
		markController = mC;
	}

	@Override
	public InMenuState createInMenuState() {
		if (inMenuState == null) {
			inMenuState = new InMenuState(this, waypointController);
		}
		return inMenuState;
	}

	@Override
	public InMarkMenuState createInMarkMenuState() {
		if (inMarkState == null) {
			inMarkState = new InMarkMenuState(this, markController);
		}
		return inMarkState;
	}

	@Override
	public InWaypointSelectedState createWaypointSelectedState() {
		if (inWaypointSelectedState == null) {
			inWaypointSelectedState = new InWaypointSelectedState(this, waypointController);
		}
		return inWaypointSelectedState;
	}

}
