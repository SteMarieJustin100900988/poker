package poker;

public class Hand {
	Card c1;
	Card c2;
	Card c3;
	Card c4;
	Card c5;
	
	public Hand(){
		c1 = new Card("four", "Club");
		c2 = new Card("five", "Diamond");
		c3 = new Card("six", "Heart");
		c4 = new Card("queen", "Diamond");
		c5 = new Card("ace", "Spade");
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
