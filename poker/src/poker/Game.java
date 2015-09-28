package poker;

import java.util.ArrayList;

public class Game {
	ArrayList<Player> players;

	public Game(int playerNum){
		players = new ArrayList<Player>();
		for(int i=0; i<playerNum; i++){
			players.add(new Player());
		}
	}
	
	public String getPlayerID(int playerN){
		return players.get(playerN).getPlayerID();
	}
	
	public Hand getPlayerHand(int playerN){
		return players.get(playerN).getHand();
	}
	
	public String getScore(int playerN){
		return "";
	}
	
	public String getFinalScore(){
		return "";
	}
}
