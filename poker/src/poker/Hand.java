package poker;

public class Hand {
	private Card c1, c2, c3, c4, c5;
	
	public Hand(Deck d){
		c1 = d.dealCard();
		c2 = d.dealCard();
		c3 = d.dealCard();
		c4 = d.dealCard();
		c5 = d.dealCard();
	}

	public String getCards(){
		String returnstring = "";
		returnstring = returnstring + c1.getValue() + " ";
		returnstring = returnstring + c2.getValue() + " ";
		returnstring = returnstring + c3.getValue() + " ";
		returnstring = returnstring + c4.getValue() + " ";
		returnstring = returnstring + c5.getValue();
		return returnstring;
	}
	
	public String getCard(int pos){
		switch(pos){
		case 0: return c1.getValue();
		case 1: return c2.getValue();
		case 2: return c3.getValue();
		case 3: return c4.getValue();
		case 4: return c5.getValue();
		default: return "";
		}
	}
}
