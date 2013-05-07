package de.htwg.seapal.waypoint.models;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractWaypoint implements IWaypoint {


	protected AbstractWaypoint() {}

	protected AbstractWaypoint(final IWaypoint waypoint) {
	}



	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("{");
		sb.append("id=").append(getId())
		.append("; name=").append(getName())
		.append("; pos=").append(getPosition())
		.append("; note=").append(getNote())
		.append("; btm=").append(getBTM())
		.append("; dtm=").append(getDTM())
		.append("; cog=").append(getCOG())
		.append("; sog=").append(getSOG())
		.append("; man=").append(getManeuver())
		.append("; fsail=").append(getForesail())
		.append("; msail=").append(getMainsail())
		.append("; mark=").append(getMark())
		.append("}");
		return sb.toString();
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
				getId().equals(other.getId())
				&& getName().equals(other.getName())
				&& getNote().equals(other.getNote())
				&& getPosition().equals(other.getPosition())
				&& getBTM() == other.getBTM()
				&& getDTM() == other.getDTM()
				&& getCOG() == other.getCOG()
				&& getSOG() == other.getSOG()
				&& getForesail() == other.getForesail()
				&& getMainsail() == other.getMainsail()
				&& getManeuver() == other.getManeuver()
				&& ((getMark() != null && getMark().equals(other.getMark()))
						|| (getMark() == null && other.getMark() == null))
				);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public abstract Object clone() throws CloneNotSupportedException;
}
