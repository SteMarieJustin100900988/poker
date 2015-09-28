package poker;

import java.util.ArrayList;

public class Game {
	ArrayList<Player> players;
	Deck d;

	public Game(int playerNum){
		d = new Deck();
		players = new ArrayList<Player>();
		for(int i=0; i<playerNum; i++){
			players.add(new Player(d));
		}
	}
	
	public String getPlayerID(int playerN){
		return players.get(playerN).getPlayerID();
	}
	
	public Hand getPlayerHand(int playerN){
		return players.get(playerN).getHand();
	}
	
	public String getScore(int playerN){
		return players.get(playerN).getPlayerID() + " " + players.get(playerN).getHand().getFinalValue();
	}
	
	public String getFinalScore(){
		return "";
	}
}
