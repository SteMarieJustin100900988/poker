package poker;

public class Player {
	static int initID = 0;
	String pid;
	Hand myHand;

	public Player(Deck d){
		pid = "Player " + initID;
		initID++;
		myHand = new Hand(d);
	}
	
	public String getPlayerID(){
		return pid;
	}
	
	public Hand getHand(){
		return myHand;
	}
}
