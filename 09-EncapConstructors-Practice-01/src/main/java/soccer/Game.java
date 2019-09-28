/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soccer;

import utility.GameUtils;

/**
 *
 * @author Administrator
 */
public class Game {

	private Team homeTeam;

	private Team awayTeam;

	private Goal[] goals;

	public void playGame(int maxGoals) {
		/*
		 * Practice 8-2. Add code to initialize the array currGame.goals to a random
		 * size
		 */
		int numberOfGoals = (int) (Math.random() * maxGoals + 1);

		Goal[] theGoals = new Goal[numberOfGoals];

		this.goals = theGoals;

		GameUtils.addGameGoals(this);
	}

	public void playGame() {
		playGame(6);
	}

	public String getDescription() {

		StringBuilder returnString = new StringBuilder();

		for (Goal currGoal : this.goals) {
			returnString.append("Goal scored after " + currGoal.getTheTime() + " mins by " + currGoal.getThePlayer().getPlayerName()
					+ " of " + currGoal.getTheTeam().getTeamName() + "\n");
		}

		return returnString.toString();
	}
	
	public Team getHomeTeam() {
		return homeTeam;
	}
	
	public void setHomeTeam(Team homeTeam) {
		this.homeTeam = homeTeam;
	}
	
	public Team getAwayTeam() {
		return awayTeam;
	}
	
	public void setAwayTeam(Team awayTeam) {
		this.awayTeam = awayTeam;
	}
	
	public Goal[] getGoals() {
		return goals;
	}
	
	public void setGoals(Goal[] goals) {
		this.goals = goals;
	}

}
