/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soccer;

/**
 *
 * @author Administrator
 */
public class Goal {

	private Team theTeam;

	private Player thePlayer;

	private double theTime;
	
	public Team getTheTeam() {
		return theTeam;
	}
	
	public void setTheTeam(Team theTeam) {
		this.theTeam = theTeam;
	}
	
	public Player getThePlayer() {
		return thePlayer;
	}
	
	public void setThePlayer(Player thePlayer) {
		this.thePlayer = thePlayer;
	}
	
	public double getTheTime() {
		return theTime;
	}
	
	public void setTheTime(double theTime) {
		this.theTime = theTime;
	}
}
