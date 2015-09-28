package poker;

public class Card {
	String suit;
	String rank;
	
	public Card(String r, String s){
		suit = s;
		rank = r;
	}
	
	public String getValue(){
		return rank + suit;
	}
}
