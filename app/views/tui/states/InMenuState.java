package views.tui.states;

import static java.lang.System.out;

import com.google.inject.Inject;

import de.htwg.seapal.common.views.tui.StateContext;
import de.htwg.seapal.common.views.tui.TuiState;
import de.htwg.seapal.waypoint.controllers.IWaypointController;
import de.htwg.seapal.waypoint.models.IWaypoint;

public class InMenuState implements TuiState {

	private final StateFactory stateFactory;
	private final IWaypointController controller;

	enum Command {create, select, show, mark};
	private Command currentCommand;

	@Inject
	public InMenuState(final StateFactory stateFactory, final IWaypointController controller){
		this.stateFactory = stateFactory;
		this.controller = controller;
	}


	@Override
	public void print() {
		out.println(controller.getString());
		out.println("WaypointDemo:\n" +
				"\t\t create - creates new waypoint\n" +
				"\t\t select - selects an waypoint by its id\n" +
				"\t\t show   - show all waypoints\n\n" +
				"\t\t mark   - go to mark\n" +
				"\t\t q - quit");
		out.print(">>");

	}

	@Override
	public boolean process(final StateContext context, final String input) {
		boolean continu = true;
		if (input.equalsIgnoreCase("q")) {
			continu = false;
			controller.tearDown();
		}

		if (currentCommand == null) {
			if (input.equalsIgnoreCase("create")) {
				controller.createNewWaypoint();
				context.setState(stateFactory.createWaypointSelectedState());
			}
			if (input.equalsIgnoreCase("select")) {
				currentCommand = Command.select;
				System.out.println("Enter id>>>");
			}
			if (input.equalsIgnoreCase("show")) {
				for (IWaypoint iWaypoint : controller.getWaypoints()) {
					System.out.println(iWaypoint);
				}
				print();
			}
			if (input.equalsIgnoreCase("mark")) {
				context.setState(stateFactory.createInMarkMenuState());
			}
		} else if (currentCommand == Command.select) {
			controller.selectWaypoint(input);
			currentCommand = null;
			context.setState(stateFactory.createWaypointSelectedState());
		}
		return continu;
	}

}
