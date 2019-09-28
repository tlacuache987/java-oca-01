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
public class Team {

	private String teamName;

	private Player[] playerArray;
	
	public String getTeamName() {
		return teamName;
	}
	
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public Player[] getPlayerArray() {
		return playerArray;
	}
	
	public void setPlayerArray(Player[] playerArray) {
		this.playerArray = playerArray;
	}
}
