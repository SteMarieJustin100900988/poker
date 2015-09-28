package poker;

public class Card {
	private String suit;
	private String rank;
	
	public Card(String r, String s){
		suit = s;
		rank = r;
	}
	
	//gets the string value of suit and rank
	public String getValue(){
		return rank + suit;
	}

	//gets the string value of suit
	public String getSuit(){
		return suit;
	}
	
	//gets the string value of rank
	public String getRank(){
		return rank;
	}
	
}
