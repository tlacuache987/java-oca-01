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

		// Create team1
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

		/* Practice 6-2. Remove the two for loops below */
		for (Player thePlayer : team1.playerArray) {
			System.out.println(thePlayer.playerName);
		}

		System.out.println();

		for (Player thePlayer : team2.playerArray) {
			System.out.println(thePlayer.playerName);
		}

		/* Practice 6-2. Create a Game here */

		/* Practice 6-2. Create a Goal object here */

		/*
		 * Practice 6-2. Put Goal object in a Goal array and assign Goal array to goals
		 * attribute of Game object
		 */

		/* Practice 6-2. Print out the score of the Game */

	}
}
