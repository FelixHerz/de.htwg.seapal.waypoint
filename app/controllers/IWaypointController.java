package controllers;

import models.IMark;
import models.IWaypoint.*;

public interface IWaypointController {

	public abstract String getName();

	public abstract String getPosition();

	public abstract String getNote();

	public abstract int getBTM();

	public abstract int getDTM();

	public abstract int getCOG();

	public abstract int getSOG();

	public abstract IMark getMark();

	public abstract Maneuver getManeuver();

	public abstract ForeSail getForesail();

	public abstract MainSail getMainsail();

	public abstract void setForesail(ForeSail foreSail);

	public abstract void setName(String name);

	public abstract void setPosition(String position);

	public abstract void setNote(String note);

	public abstract void setBTM(int btm);

	public abstract void setDTM(int dtm);

	public abstract void setCOG(int cog);

	public abstract void setSOG(int sog);

	public abstract void setMark(IMark mark);

	public abstract void setManeuver(Maneuver maneuver);

	public abstract void setMainsail(MainSail mainSail);

}