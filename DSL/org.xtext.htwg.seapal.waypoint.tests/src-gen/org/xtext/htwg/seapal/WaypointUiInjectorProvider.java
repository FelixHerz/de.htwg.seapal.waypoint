/*
* generated by Xtext
*/
package org.xtext.htwg.seapal;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class WaypointUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.xtext.htwg.seapal.ui.internal.WaypointActivator.getInstance().getInjector("org.xtext.htwg.seapal.Waypoint");
	}
	
}