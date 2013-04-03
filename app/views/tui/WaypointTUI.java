package views.tui;

import java.util.Scanner;


import util.observer.Event;
import util.observer.IObserver;

import controllers.IWaypointController;
import models.IWaypoint.*;

public class WaypointTUI implements IObserver {
	
	private IWaypointController controller;
	private Scanner scanner = new Scanner(System.in);
	
	public WaypointTUI(IWaypointController controller) {
		this.controller = controller;
		this.controller.addObserver(this);
	}
	
	@Override
	public void update(Event e) {
		printTUI();
	}
	
	public boolean processInputLine(String line) {
		boolean continu = true;
		if (line.equalsIgnoreCase("q")) {
			continu = false;
		}
		if (line.equalsIgnoreCase("name")) {
			controller.setName(scanner.next());
		}
		if (line.equalsIgnoreCase("pos")) {
			controller.setPosition(scanner.next());
		}
		if (line.equalsIgnoreCase("note")) {
			controller.setNote(scanner.next());
		}
		if (line.equalsIgnoreCase("btm")) {
			controller.setBTM(scanner.nextInt());
		}
		if (line.equalsIgnoreCase("dtm")) {
			controller.setDTM(scanner.nextInt());
		}
		if (line.equalsIgnoreCase("cog")) {
			controller.setCOG(scanner.nextInt());
		}
		if (line.equalsIgnoreCase("sog")) {
			controller.setSOG(scanner.nextInt());
		}
		if (line.equalsIgnoreCase("man")) {
			controller.setManeuver(Maneuver.valueOf(scanner.next()));
		}
		if (line.equalsIgnoreCase("fsail")) {
			controller.setForesail(ForeSail.valueOf(scanner.next()));
		}
		if (line.equalsIgnoreCase("msail")) {
			controller.setMainsail(MainSail.valueOf(scanner.next()));
		}
		if (line.equalsIgnoreCase("mark")) {
//			controller.setMark(scanner.next());
		}
		return continu;
	}	
	
	public void printTUI() {
		System.out.println("WaypointDemo: q - quit\n" +
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
				"\t\t mark  - set mark\n" +
				"");
		System.out.println(controller.getString());
		
	}
}
