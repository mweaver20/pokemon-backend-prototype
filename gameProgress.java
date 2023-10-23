
public class gameProgress {
	static void progressService() {
		System.out.println("A player’s score, health, status, and current level will be tracked in real-time "
				+ "and stored in a temporary location for access throughout the game as long as the progress "
				+ "has been saved. A player’s progress is cumulative while the game is in progress. "
				+ "If a player ends the game without saving the current character’s status, the progress and "
				+ "all other data are lost and the game will reset to level one once restarted. If a player "
				+ "saves their current status, then that player can resume from the last known stage in the game.");
	}


	public static void main(String[] args) {
		progressService();

	}

}
