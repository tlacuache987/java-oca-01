/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccer;

import java.util.ArrayList;
import java.util.StringTokenizer;

import utility.PlayerDatabase;

/**
 *
 * @author Administrator
 */
public class League {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		League theLeague = new League();

		Team[] theTeams = theLeague.createTeams("The Reds,The Greens,The Pinks", 5);
		Game[] theGames = theLeague.createGames(theTeams);

		for (Game currGame : theGames) {
			currGame.playGame();
			System.out.println(currGame.getDescription());
		}

		theLeague.showBestTeam(theTeams);

	}

	public Team[] createTeams(String teamNames, int teamSize) {

		/* Practice 11-1. Remove the code below that creates The Greens and The Reds */
		/*
		 * Player player1 = new Player("George Eliot"); Player player2 = new
		 * Player("Graham Greene"); Player player3 = new Player("Geoffrey Chaucer");
		 * Player[] thePlayers = { player1, player2, player3 };
		 * 
		 * Team team1 = new Team("The Greens", thePlayers);
		 * 
		 * // Create team2 Team team2 = new Team(); team2.setTeamName("The Reds");
		 * team2.setPlayerArray(new Player[3]); team2.getPlayerArray()[0] = new
		 * Player("Robert Service"); team2.getPlayerArray()[1] = new
		 * Player("Robbie Burns"); team2.getPlayerArray()[2] = new
		 * Player("Rafael Sabatini");
		 */
		/* Practice 11-1. Remove the above code that creates The Greens and The Reds */

		/*
		 * Team[] theTeams = { team1, team2 };
		 */

		PlayerDatabase playerDB = new PlayerDatabase();

		StringTokenizer teamNamesToken = new StringTokenizer(teamNames, ",");
		Team[] teams = new Team[teamNamesToken.countTokens()];
		for (int i = 0; i < teams.length; i++) {
			teams[i] = new Team(teamNamesToken.nextToken(), playerDB.getTeam(teamSize));
		}

		return teams;
	}

	public Game[] createGames(Team[] theTeams) {
		/*
		 * Game theGame = new Game(theTeams[0], theTeams[1]); Game theGame2 = new
		 * Game(theTeams[1], theTeams[0]); Game theGame3 = new Game(theTeams[0],
		 * theTeams[1]); Game theGame4 = new Game(theTeams[1], theTeams[0]); Game[]
		 * theGames = { theGame, theGame2, theGame3, theGame4 }; return theGames;
		 */
		ArrayList<Game> games = new ArrayList<>();

		for (Team home : theTeams) {
			for (Team away : theTeams) {
				if (home != away) {
					games.add(new Game(home, away));
				}
			}
		}

		return (Game[]) games.toArray(new Game[1]);
	}

	public void showBestTeam(Team[] theTeams) {
		Team currBestTeam = theTeams[0];
		System.out.println("\nTeam Points");

		for (Team currTeam : theTeams) {
			System.out.println(
					currTeam.getTeamName() + " : " + currTeam.getPointsTotal() + " : " + currTeam.getGoalsTotal());
			currBestTeam = currTeam.getPointsTotal() > currBestTeam.getPointsTotal() ? currTeam : currBestTeam;
			if (currTeam.getPointsTotal() > currBestTeam.getPointsTotal()) {
				currBestTeam = currTeam;
			} else if (currTeam.getPointsTotal() == currBestTeam.getPointsTotal()) {
				if (currTeam.getGoalsTotal() > currBestTeam.getGoalsTotal()) {
					currBestTeam = currTeam;
				}
			}
		}

		System.out.println("Winner of the League is " + currBestTeam.getTeamName());

	}

}
