package poker;

import java.util.ArrayList;

public class Game {
	ArrayList<Player> players;
	Deck d;

	public Game(int playerNum){
		if(playerNum <2 || playerNum >4){
			throw new IllegalArgumentException("Bad number of Players");
		}
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
		for(int j=4; j>0; j++){
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

	//runs the game
	public void run() {
		HandValueCalculator hvc = new HandValueCalculator();
		if(players.size() == 2){
			hvc.rankHand(players.get(0).getHand(), players.get(1).getHand());
		} else if(players.size()==3){
			hvc.rankHand(players.get(0).getHand(), players.get(1).getHand(), players.get(2).getHand());
		} else {
			hvc.rankHand(players.get(0).getHand(), players.get(1).getHand(), players.get(2).getHand(), players.get(3).getHand());
		}
	}
}
