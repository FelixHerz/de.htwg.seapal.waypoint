package views.tui.states;


public interface StateFactory {
	InMenuState createInMenuState();
	InMarkMenuState createInMarkMenuState();
	InWaypointSelectedState createWaypointSelectedState();
}
