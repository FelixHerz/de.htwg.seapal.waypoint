package views.tui.states;

import static java.lang.System.out;

import com.google.inject.Inject;

import de.htwg.seapal.common.views.tui.StateContext;
import de.htwg.seapal.common.views.tui.TuiState;
import de.htwg.seapal.waypoint.controllers.IWaypointController;
import de.htwg.seapal.waypoint.models.IWaypoint.ForeSail;
import de.htwg.seapal.waypoint.models.IWaypoint.MainSail;
import de.htwg.seapal.waypoint.models.IWaypoint.Maneuver;

public class InWaypointSelectedState implements TuiState {

	private final StateFactory stateFactory;
	private final IWaypointController controller;


	enum Command {name, lat, lng, note, cog, sog, man, fsail, msail, mark};
	private Command currentCommand;

	@Inject
	public InWaypointSelectedState(final StateFactory stateFactory, final IWaypointController controller) {
		this.stateFactory = stateFactory;
		this.controller = controller;
	}

	@Override
	public void print() {

		out.println(controller.getString());
		out.println("WaypointDemo:\n" +
				"\t\t save   - saves all changes\n" +
				"\t\t delete - deletes the current waypoint\n\n" +
				"\t\t name   - set name\n" +
				"\t\t lat    - set latitude\n" +
				"\t\t lng    - set longitude\n" +
				"\t\t note   - set note\n" +
				"\t\t cog    - set course over ground\n" +
				"\t\t sog    - set speed over ground\n" +
				"\t\t man    - set maneuver\n" +
				"\t\t fsail  - set foresail\n" +
				"\t\t msail  - set mainsail\n" +
				"\t\t mark   - set mark\n" +
				"\t\t q - quit");
		out.print(">>");
	}

	@Override
	public boolean process(final StateContext context, final String input) {
		boolean continu = true;
		if (input.equalsIgnoreCase("q")) {
			context.setState(stateFactory.createInMenuState());
		}
		if (currentCommand == null) {
			if (input.equalsIgnoreCase("name")) {
				currentCommand = Command.name;
			}
			if (input.equalsIgnoreCase("lat")) {
				currentCommand = Command.lat;
			}
			if (input.equalsIgnoreCase("lng")) {
				currentCommand = Command.lng;
			}
			if (input.equalsIgnoreCase("note")) {
				currentCommand = Command.note;
			}
			if (input.equalsIgnoreCase("cog")) {
				currentCommand = Command.cog;
			}
			if (input.equalsIgnoreCase("sog")) {
				currentCommand = Command.sog;
			}
			if (input.equalsIgnoreCase("man")) {
				currentCommand = Command.man;
			}
			if (input.equalsIgnoreCase("fsail")) {
				currentCommand = Command.fsail;
			}
			if (input.equalsIgnoreCase("msail")) {
				currentCommand = Command.msail;
			}
			if (input.equalsIgnoreCase("mark")) {
				currentCommand = Command.mark;
			}
			if (input.equalsIgnoreCase("save")) {
				controller.saveWaypoint();
				context.setState(stateFactory.createInMenuState());
			}
			if (input.equalsIgnoreCase("delete")) {
				controller.deleteWaypoint();
				context.setState(stateFactory.createInMenuState());
			}
		} else if (currentCommand == Command.name) {
			controller.setName(input);
			currentCommand = null;
		} else if (currentCommand == Command.note) {
			controller.setNote(input);
			currentCommand = null;
		} else if (currentCommand == Command.lat) {
			controller.setLatitude(Double.valueOf(input));
			currentCommand = null;
		} else if (currentCommand == Command.lng) {
			controller.setLongitude(Double.valueOf(input));
			currentCommand = null;
		} else if (currentCommand == Command.cog) {
			controller.setCOG(Integer.valueOf(input));
			currentCommand = null;
		} else if (currentCommand == Command.sog) {
			controller.setSOG(Integer.valueOf(input));
			currentCommand = null;
		} else if (currentCommand == Command.man) {
			controller.setManeuver(Maneuver.valueOf(input));
			currentCommand = null;
		} else if (currentCommand == Command.fsail) {
			controller.setForesail(ForeSail.valueOf(input));
			currentCommand = null;
		} else if (currentCommand == Command.msail) {
			controller.setMainsail(MainSail.valueOf(input));
			currentCommand = null;
		} else if (currentCommand == Command.mark) {
			controller.setMark(input);
			currentCommand = null;
		}
		return continu;
	}

}
