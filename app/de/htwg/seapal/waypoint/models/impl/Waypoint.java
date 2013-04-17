package de.htwg.seapal.waypoint.models.impl;

import de.htwg.seapal.mark.models.IMark;
import de.htwg.seapal.waypoint.models.IWaypoint;

public class Waypoint implements IWaypoint {

	private String id;
	private String name;
	private String position;
	private String note;
	private int btm;
	private int dtm;
	private int cog;
	private int sog;
	private IMark mark;
	private Maneuver maneuver;
	private ForeSail foreSail;
	private MainSail mainSail;
	
	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#getName()
	 */
	@Override
	
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#getPosition()
	 */
	
	@Override
	public String getPosition() {
		return position;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#getNote()
	 */
	
	@Override
	public String getNote() {
		return note;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#getBTM()
	 */
	
	@Override
	public int getBTM() {
		return btm;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#getDTM()
	 */
	
	@Override
	public int getDTM() {
		return dtm;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#getCOG()
	 */
	
	@Override
	public int getCOG() {
		return cog;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#getSOG()
	 */
	
	@Override
	public int getSOG() {
		return sog;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#getMark()
	 */
	
	@Override
	public IMark getMark() {
		return mark;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#getManeuver()
	 */
	
	@Override
	public Maneuver getManeuver() {
		return maneuver;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#getForesail()
	 */
	
	@Override
	public ForeSail getForesail() {
		return foreSail;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#getMainsail()
	 */
	
	@Override
	public MainSail getMainsail() {
		return mainSail;
	}
	
	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#setForesail(models.IWaypoint.ForeSail)
	 */
	
	public void setForesail(ForeSail foreSail) {
		this.foreSail = foreSail;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		if (name == null || name.equals("")) {
			throw new IllegalArgumentException();
		}
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#setPosition(java.lang.String)
	 */
	@Override
	public void setPosition(final String position) {
		if (position == null || position.equals("")) {
			throw new IllegalArgumentException();
		}
		String trimmedposition = position.trim();
		if (!trimmedposition.matches("((1[0-8][0-9])|(0?\\d{0,2}))°(\\d{1,2}')?(\\d{1,2}\")?[E|W]\\s?" +
				"((90)|([0-8]\\d|\\d))°(\\d{1,2}')?(\\d{1,2}\")?[N|S]")) {
			throw new IllegalArgumentException(position);
		}
		this.position = trimmedposition;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#setNote(java.lang.String)
	 */
	@Override
	public void setNote(String note) {
		this.note = note;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#setBTM(int)
	 */
	@Override
	public void setBTM(int btm) {
		this.btm = btm;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#setDTM(int)
	 */
	@Override
	public void setDTM(int dtm) {
		this.dtm = dtm;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#setCOG(int)
	 */
	@Override
	public void setCOG(int cog) {
		this.cog = cog;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#setSOG(int)
	 */
	@Override
	public void setSOG(int sog) {
		this.sog = sog;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#setMark(models.IMark)
	 */
	@Override
	public void setMark(IMark mark) {
		this.mark = mark;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#setManeuver(models.IWaypoint.Maneuver)
	 */
	@Override
	public void setManeuver(Maneuver maneuver) {
		this.maneuver = maneuver;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#setMainsail(models.IWaypoint.MainSail)
	 */
	@Override
	public void setMainsail(MainSail mainSail) {
		this.mainSail = mainSail;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("{");
		sb.append("name=").append(name)
		  	.append("; pos=").append(position)
		  	.append("; note=").append(note)
		  	.append("; btm=").append(btm)
		  	.append("; dtm=").append(dtm)
		  	.append("; cog=").append(cog)
		  	.append("; sog=").append(sog)
		  	.append("; man=").append(maneuver)
		  	.append("; fsail=").append(foreSail)
		  	.append("; msail=").append(mainSail)
		  	.append("}");
		return sb.toString();
	}

	@Override
	public String getId() {
		return id;
	}

}
