package poker;

public class Hand {
	Card c1;
	Card c2;
	Card c3;
	Card c4;
	Card c5;
	
	public Hand(Deck d){
		c1 = d.dealCard();
		c2 = d.dealCard();
		c3 = d.dealCard();
		c4 = d.dealCard();
		c5 = d.dealCard();
	}

	public String getCards(){
		String returnstring = "";
		returnstring = returnstring + c1.getValue() + ",";
		returnstring = returnstring + c2.getValue() + ",";
		returnstring = returnstring + c3.getValue() + ",";
		returnstring = returnstring + c4.getValue() + ",";
		returnstring = returnstring + c5.getValue();
		return returnstring;
	}
}
