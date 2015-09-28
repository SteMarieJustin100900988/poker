package poker;

public class Player {
	static int initID = 0;
	static Deck deck = new Deck();
	String pid;
	Hand myHand;

	public Player(){
		pid = "Player " + initID;
		initID++;
		myHand = new Hand(deck);
	}
	
	public String getPlayerID(){
		return pid;
	}
	
	public Hand getHand(){
		return myHand;
	}
}
