package views.tui;

import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

import util.observer.Event;
import util.observer.IObserver;

import controllers.IWaypointController;

public class WaypointTUI implements IObserver {
	
	private IWaypointController controller;
	
	public WaypointTUI(IWaypointController controller) {
		this.controller = controller;
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
		if (line.equalsIgnoreCase("n")) {
			Scanner scanner = new Scanner(System.in);
			controller.setName(scanner.next());
			controller.setPosition(scanner.next());
			controller.setNote(scanner.next());
			controller.setBTM(scanner.nextInt());
			controller.setDTM(scanner.nextInt());
			controller.setCOG(scanner.nextInt());
			controller.setSOG(scanner.nextInt());
			controller.setManeuver(scanner.next());
			controller.setForesail(scanner.next());
			controller.setMainsail(scanner.next());
			controller.setMark(scanner.next());
		}
		return continu;
	}	
	
	public void printTUI() {
		System.out.println(controller.getName());
		System.out.println(controller.getPosition());
		System.out.println(controller.getNote());
		System.out.println(controller.getBTM());
		System.out.println(controller.getDTM());
		System.out.println(controller.getCOG());
		System.out.println(controller.getSOG());
		System.out.println(controller.getMark());
		System.out.println(controller.getManeuver());
		System.out.println(controller.getForesail());
		System.out.println(controller.getMainsail());
		
	}
}
