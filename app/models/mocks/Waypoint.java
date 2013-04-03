package models.mocks;

import models.IMark;
import models.IWaypoint;

public class Waypoint implements IWaypoint {

	@Override
	public String getName() {
		return "MyWaypoint";
	}

	@Override
	public String getPosition() {
		return "0°12'12\"E 47°12'12\"N";
	}

	@Override
	public String getNote() {
		return "Here is a note";
	}

	@Override
	public int getBTM() {
		return 0;
	}

	@Override
	public int getDTM() {
		return 0;
	}

	@Override
	public int getCOG() {
		return 0;
	}

	@Override
	public int getSOG() {
		return 0;
	}

	@Override
	public IMark getMark() {
		return null;
	}

	@Override
	public Maneuver getManeuver() {
		return Maneuver.ANKER_DOWN;
	}

	@Override
	public ForeSail getForesail() {
		return ForeSail.NONE;
	}

	@Override
	public MainSail getMainsail() {
		return MainSail.REEF1;
	}

	@Override
	public void setForesail(ForeSail foreSail) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPosition(String position) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setNote(String note) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBTM(int btm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDTM(int dtm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCOG(int cog) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSOG(int sog) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMark(IMark mark) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setManeuver(Maneuver maneuver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMainsail(MainSail mainSail) {
		// TODO Auto-generated method stub
		
	}

}
