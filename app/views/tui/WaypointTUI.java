package views.tui;

import views.tui.states.StateFactory;

import com.google.inject.Inject;

import de.htwg.seapal.common.observer.Event;
import de.htwg.seapal.common.observer.IObserver;
import de.htwg.seapal.common.plugin.Plugin;
import de.htwg.seapal.common.views.tui.StateContext;
import de.htwg.seapal.common.views.tui.TuiState;
import de.htwg.seapal.waypoint.controllers.IWaypointController;

public class WaypointTUI implements IObserver, StateContext, Plugin {

	private TuiState currentState = null;

	@Inject
	public WaypointTUI(final IWaypointController controller, final StateFactory stateFactory) {
		controller.addObserver(this);
		currentState = stateFactory.createInMenuState();
	}

	@Override
	public void update(final Event e) {
		printTUI();
	}

	@Override
	public boolean processInputLine(final String line) {
		return currentState.process(this, line);
	}

	@Override
	public void printTUI() {
		currentState.print();
	}

	@Override
	public String getMenuEntry() {
		return "Waypoint";
	}

	@Override
	public char getMenuKey() {
		return 'w';
	}

	@Override
	public void setState(final TuiState state) {
		currentState = state;
		printTUI();
	}
}
