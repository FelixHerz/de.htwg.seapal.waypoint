package views.tui;

import java.util.Scanner;

import com.google.inject.Inject;


import de.htwg.seapal.waypoint.controllers.IWaypointController;
import de.htwg.seapal.waypoint.models.IWaypoint.*;
import de.htwg.util.observer.Event;
import de.htwg.util.observer.IObserver;
import de.htwg.util.plugin.Plugin;

public class WaypointTUI implements IObserver, Plugin {
	
	private IWaypointController controller;
	
	@Inject
	public WaypointTUI(IWaypointController controller) {
		this.controller = controller;
		this.controller.addObserver(this);
	}
	
	@Override
	public void update(Event e) {
		printTUI();
	}
	
	public boolean processInputLine(String line) {

		Scanner scanner = new Scanner(line);
		scanner.useDelimiter(" ");
		String input = scanner.next();
		boolean continu = true;
		if (input.equalsIgnoreCase("q")) {
			continu = false;
		}
		if (input.equalsIgnoreCase("name")) {
			controller.setName(scanner.next());
		}
		if (input.equalsIgnoreCase("pos")) {
			controller.setPosition(scanner.next());
		}
		if (input.equalsIgnoreCase("note")) {
			controller.setNote(scanner.next());
		}
		if (input.equalsIgnoreCase("btm")) {
			controller.setBTM(scanner.nextInt());
		}
		if (input.equalsIgnoreCase("dtm")) {
			controller.setDTM(scanner.nextInt());
		}
		if (input.equalsIgnoreCase("cog")) {
			controller.setCOG(scanner.nextInt());
		}
		if (input.equalsIgnoreCase("sog")) {
			controller.setSOG(scanner.nextInt());
		}
		if (input.equalsIgnoreCase("man")) {
			controller.setManeuver(Maneuver.valueOf(scanner.next()));
		}
		if (input.equalsIgnoreCase("fsail")) {
			controller.setForesail(ForeSail.valueOf(scanner.next()));
		}
		if (input.equalsIgnoreCase("msail")) {
			controller.setMainsail(MainSail.valueOf(scanner.next()));
		}
		if (input.equalsIgnoreCase("mark")) {
//		
		}
		return continu;
	}	
	
	public void printTUI() {
		System.out.println(controller.getString());
		System.out.println("WaypointDemo:" +
				"\t\t q - quit\n" +
				"\t\t name  - set name\n" +
				"\t\t pos   - set position\n" +
				"\t\t note  - set note\n" +
				"\t\t btm   - set btm\n" +
				"\t\t dtm   - set dtm\n" +
				"\t\t cog   - set cog\n" +
				"\t\t sog   - set sog\n" +
				"\t\t man   - set maneuver\n" +
				"\t\t fsail - set foresail\n" +
				"\t\t msail - set mainsail\n" +
				"\t\t mark  - set mark");
		
	}

	@Override
	public String getMenuEntry() {
		return "Waypoint";
	}

	@Override
	public char getMenuKey() {
		return 'w';
	}
}
