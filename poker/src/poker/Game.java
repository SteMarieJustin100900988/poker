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
	public String getScore(int playerN, ArrayList<Player> playerlist){
		return playerlist.get(playerN).getPlayerID() + " " + playerlist.get(playerN).getHand().getFinalValue();
	}
	
	public String getFinalScore(){
		ArrayList<Player> playerInOrder = new ArrayList<Player>();
		ArrayList<Player> playerListCopy = new ArrayList<Player>(players);
		for(int j=1; j<5; j++){
			for(int i=0; i<playerListCopy.size(); i++){
				if(playerListCopy.get(i).getHand().getValue() == j){
					playerInOrder.add(playerListCopy.get(i));
					playerListCopy.remove(i);
					i=0;
				}
			}
		}
		
		String finalString = "";
		for(int i =0; i<playerInOrder.size()-1; i++){
			finalString = finalString + getScore(i, playerInOrder) + "\n";
		}
		finalString = finalString + getScore(playerInOrder.size()-1, playerInOrder);
		
		return finalString;
	}
}
