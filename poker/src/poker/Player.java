package poker;

public class Player {
	static int initID = 0;
	String pid;

	public Player(){
		pid = "Player " + initID;
		initID++;
	}
	
	public String getPlayerID(){
		return pid;
	}
}
