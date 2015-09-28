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
	public Hand(Card i1, Card i2, Card i3, Card i4, Card i5){
		c1 = i1;
		c2 = i2;
		c3 = i3;
		c4 = i4;
		c5 = i5;
	}

	//returns the complete string of cards in hand
	public String getCards(){
		String returnstring = "";
		returnstring = returnstring + c1.getValue() + " ";
		returnstring = returnstring + c2.getValue() + " ";
		returnstring = returnstring + c3.getValue() + " ";
		returnstring = returnstring + c4.getValue() + " ";
		returnstring = returnstring + c5.getValue();
		return returnstring;
	}
	
	//gets the card at the position
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
	
	//compares 2 hands to see if their rank is equal
	public boolean compare(Hand h){
		return false;
	}
}
