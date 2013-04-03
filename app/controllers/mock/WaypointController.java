package controllers.mock;

import models.IMark;
import models.IWaypoint;
import controllers.IWaypointController;
import models.IWaypoint.*;

public class WaypointController implements IWaypointController {

	private IWaypoint waypoint;
	
	
	/* (non-Javadoc)
	 * @see controllers.mock.IWaypointController#getName()
	 */
	public String getName() {
		return waypoint.getName();
	}

	/* (non-Javadoc)
	 * @see controllers.mock.IWaypointController#getPosition()
	 */
	public String getPosition() {
		return null;
	}

	/* (non-Javadoc)
	 * @see controllers.mock.IWaypointController#getNote()
	 */
	public String getNote() {
		return null;
	}
	
	/* (non-Javadoc)
	 * @see controllers.mock.IWaypointController#getBTM()
	 */
	public int getBTM() {
		return 0;
	}

	/* (non-Javadoc)
	 * @see controllers.mock.IWaypointController#getDTM()
	 */
	public int getDTM() {
		return 0;
	}

	/* (non-Javadoc)
	 * @see controllers.mock.IWaypointController#getCOG()
	 */
	public int getCOG() {
		return 0;
	}

	/* (non-Javadoc)
	 * @see controllers.mock.IWaypointController#getSOG()
	 */
	public int getSOG() {
		return 0;
	}

	/* (non-Javadoc)
	 * @see controllers.mock.IWaypointController#getMark()
	 */
	public IMark getMark() {
		return null;
	}

	
	
	public Maneuver getManeuver() {
		return null;
	}

	
	
	public ForeSail getForesail() {
		return null;
	}

	
	
	public MainSail getMainsail() {
		return null;
	}

	
	
	public void setForesail(ForeSail foreSail) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see controllers.mock.IWaypointController#setName(java.lang.String)
	 */
	
	
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see controllers.mock.IWaypointController#setPosition(java.lang.String)
	 */
	
	
	public void setPosition(String position) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see controllers.mock.IWaypointController#setNote(java.lang.String)
	 */
	
	
	public void setNote(String note) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see controllers.mock.IWaypointController#setBTM(int)
	 */
	
	
	public void setBTM(int btm) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see controllers.mock.IWaypointController#setDTM(int)
	 */
	
	
	public void setDTM(int dtm) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see controllers.mock.IWaypointController#setCOG(int)
	 */
	
	
	public void setCOG(int cog) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see controllers.mock.IWaypointController#setSOG(int)
	 */
	
	
	public void setSOG(int sog) {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see controllers.mock.IWaypointController#setMark(models.IMark)
	 */
	
	
	public void setMark(IMark mark) {
		// TODO Auto-generated method stub
		
	}

	
	
	public void setManeuver(Maneuver maneuver) {
		// TODO Auto-generated method stub
		
	}

	
	
	public void setMainsail(MainSail mainSail) {
		// TODO Auto-generated method stub
		
	}

}
