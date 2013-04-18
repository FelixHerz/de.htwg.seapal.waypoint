package de.htwg.seapal.waypoint.models.impl;

import de.htwg.seapal.mark.models.IMark;
import de.htwg.seapal.waypoint.models.IWaypoint;

public final class Waypoint implements IWaypoint {

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

	public Waypoint() {
		id = "";
		name = "";
		position = "0°E 0°N";
		note = "";
		maneuver = Maneuver.NONE;
		foreSail = ForeSail.NONE;
		mainSail = MainSail.NONE;
	}

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

	@Override
	public void setForesail(final ForeSail foreSail) {
		if (foreSail == null) {
			throw new IllegalArgumentException("ForeSail must not be null.");
		}
		this.foreSail = foreSail;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#setName(java.lang.String)
	 */
	@Override
	public void setName(final String name) {
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
	public void setNote(final String note) {
		if (note == null) {
			throw new IllegalArgumentException();
		}
		this.note = note;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#setBTM(int)
	 */
	@Override
	public void setBTM(final int btm) {
		this.btm = btm;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#setDTM(int)
	 */
	@Override
	public void setDTM(final int dtm) {
		this.dtm = dtm;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#setCOG(int)
	 */
	@Override
	public void setCOG(final int cog) {
		this.cog = cog;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#setSOG(int)
	 */
	@Override
	public void setSOG(final int sog) {
		this.sog = sog;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#setMark(models.IMark)
	 */
	@Override
	public void setMark(final IMark mark) {
		this.mark = mark;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#setManeuver(models.IWaypoint.Maneuver)
	 */
	@Override
	public void setManeuver(final Maneuver maneuver) {
		if (maneuver == null) {
			throw new IllegalArgumentException(
					"Maneuver must not be null. Use NONE instead.");
		}
		this.maneuver = maneuver;
	}

	/* (non-Javadoc)
	 * @see models.impls.IWaypoint#setMainsail(models.IWaypoint.MainSail)
	 */
	@Override
	public void setMainsail(final MainSail mainSail) {
		if (mainSail == null) {
			throw new IllegalArgumentException(
					"Mainsail must not be null. Use NONE instead.");
		}
		this.mainSail = mainSail;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("{");
		sb.append("id=").append(id)
		.append("; name=").append(name)
		.append("; pos=").append(position)
		.append("; note=").append(note)
		.append("; btm=").append(btm)
		.append("; dtm=").append(dtm)
		.append("; cog=").append(cog)
		.append("; sog=").append(sog)
		.append("; man=").append(maneuver)
		.append("; fsail=").append(foreSail)
		.append("; msail=").append(mainSail)
		.append("; mark=").append(mark)
		.append("}");
		return sb.toString();
	}

	@Override
	public void setId(final String id) {
		if (id == null) {
			throw new IllegalArgumentException("Id must not be null.");
		}
		this.id = id;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public boolean equals(final Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof IWaypoint)) {
			return false;
		}
		IWaypoint other = (IWaypoint)obj;
		return (
				this.id.equals(other.getId())
				&& this.name.equals(other.getName())
				&& this.note.equals(other.getNote())
				&& this.position.equals(other.getPosition())
				&& this.btm == other.getBTM()
				&& this.dtm == other.getDTM()
				&& this.cog == other.getCOG()
				&& this.sog == other.getSOG()
				&& this.foreSail == other.getForesail()
				&& this.mainSail == other.getMainsail()
				&& this.maneuver == other.getManeuver()
				&& ((this.mark != null && this.mark.equals(other.getMark()))
						|| (this.mark == null && other.getMark() == null))
				);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		IWaypoint ret = new Waypoint();
		ret.setId(id);
		ret.setName(name);
		ret.setNote(note);
		ret.setPosition(position);
		ret.setBTM(btm);
		ret.setDTM(dtm);
		ret.setCOG(cog);
		ret.setSOG(sog);
		ret.setForesail(foreSail);
		ret.setMainsail(mainSail);
		ret.setManeuver(maneuver);
		ret.setMark(mark);
		return ret;
	}
}
