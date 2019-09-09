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
public class League {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		Team[] theTeams = createTeams();

		Game[] theGames = createGames(theTeams);

		Game currGame = theGames[0];

		/*
		 * Practice 8-2. Start of code that creates a Goal and assigns to Team and a
		 * Game
		 */
		Goal goal1 = new Goal();

		goal1.thePlayer = currGame.homeTeam.playerArray[2];
		goal1.theTeam = currGame.homeTeam;
		goal1.theTime = 55;

		Goal[] theGoals = { goal1 };

		currGame.goals = theGoals;

		/*
		 * Practice 8-2. End of code that creates a Goal and assigns to a Team and a
		 * Game
		 */

		/*
		 * Practice 8-2. Add code to initialize the array currGame.goals to a random
		 * size
		 */

		// Print out goal details
		System.out.println("Goal scored after " + currGame.goals[0].theTime + " mins by "
				+ currGame.goals[0].thePlayer.playerName + " of " + currGame.goals[0].theTeam.teamName);

	}

	public static Team[] createTeams() {

		Player player1 = new Player();
		player1.playerName = "George Eliot";

		Player player2 = new Player();
		player2.playerName = "Graham Greene";

		Player player3 = new Player();
		player3.playerName = "Geoffrey Chaucer";

		Player[] thePlayers = { player1, player2, player3 };

		Team team1 = new Team();
		team1.teamName = "The Greens";
		team1.playerArray = thePlayers;

		// Create team2
		Team team2 = new Team();
		team2.teamName = "The Reds";
		team2.playerArray = new Player[3];

		team2.playerArray[0] = new Player();
		team2.playerArray[0].playerName = "Robert Service";

		team2.playerArray[1] = new Player();
		team2.playerArray[1].playerName = "Robbie Burns";

		team2.playerArray[2] = new Player();
		team2.playerArray[2].playerName = "Rafael Sabatini";

		Team[] theTeams = { team1, team2 };

		return theTeams;
	}

	public static Game[] createGames(Team[] theTeams) {

		Game theGame = new Game();

		theGame.homeTeam = theTeams[0];
		theGame.awayTeam = theTeams[1];

		Game[] theGames = { theGame };

		return theGames;
	}

}
