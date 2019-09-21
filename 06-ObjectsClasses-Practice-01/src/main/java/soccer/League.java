package soccer;

public class League {

	public static void main(String[] args) {

		// Create team1
		Player player1 = new Player();
		player1.playerName = "George Eliot";

		Player player2 = new Player();
		player2.playerName = "Graham Greene";

		Player player3 = new Player();
		player3.playerName = "Geoffrey Chaucer";

		Team team1 = new Team();
		team1.teamName = "The Greens";

		Player[] thePlayers = { player1, player2, player3 };

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
		
		for (Player thePlayer : team1.playerArray) {
			System.out.println(thePlayer.playerName);
		}
		
		System.out.println();
		
		for (Player thePlayer : team2.playerArray) {
			System.out.println(thePlayer.playerName);
		}

	}
}
