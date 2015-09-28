package poker;

import java.util.ArrayList;

public class Deck {
	ArrayList<Card> cards;

	public Deck(){
		cards = new ArrayList<Card>();
		//spades
		cards.add(new Card("ace", "Spade"));
		cards.add(new Card("two", "Spade"));
		cards.add(new Card("three", "Spade"));
		cards.add(new Card("four", "Spade"));
		cards.add(new Card("five", "Spade"));
		cards.add(new Card("six", "Spade"));
		cards.add(new Card("seven", "Spade"));
		cards.add(new Card("eight", "Spade"));
		cards.add(new Card("nine", "Spade"));
		cards.add(new Card("ten", "Spade"));
		cards.add(new Card("jack", "Spade"));
		cards.add(new Card("queen", "Spade"));
		cards.add(new Card("king", "Spade"));
		//clubs
		cards.add(new Card("ace", "Club"));
		cards.add(new Card("two", "Club"));
		cards.add(new Card("three", "Club"));
		cards.add(new Card("four", "Club"));
		cards.add(new Card("five", "Club"));
		cards.add(new Card("six", "Club"));
		cards.add(new Card("seven", "Club"));
		cards.add(new Card("eight", "Club"));
		cards.add(new Card("nine", "Club"));
		cards.add(new Card("ten", "Club"));
		cards.add(new Card("jack", "Club"));
		cards.add(new Card("queen", "Club"));
		cards.add(new Card("king", "Club"));
		//Heart
		cards.add(new Card("ace", "Heart"));
		cards.add(new Card("two", "Heart"));
		cards.add(new Card("three", "Heart"));
		cards.add(new Card("four", "Heart"));
		cards.add(new Card("five", "Heart"));
		cards.add(new Card("six", "Heart"));
		cards.add(new Card("seven", "Heart"));
		cards.add(new Card("eight", "Heart"));
		cards.add(new Card("nine", "Heart"));
		cards.add(new Card("ten", "Heart"));
		cards.add(new Card("jack", "Heart"));
		cards.add(new Card("queen", "Heart"));
		cards.add(new Card("king", "Heart"));
		//Diamond
		cards.add(new Card("ace", "Diamond"));
		cards.add(new Card("two", "Diamond"));
		cards.add(new Card("three", "Diamond"));
		cards.add(new Card("four", "Diamond"));
		cards.add(new Card("five", "Diamond"));
		cards.add(new Card("six", "Diamond"));
		cards.add(new Card("seven", "Diamond"));
		cards.add(new Card("eight", "Diamond"));
		cards.add(new Card("nine", "Diamond"));
		cards.add(new Card("ten", "Diamond"));
		cards.add(new Card("jack", "Diamond"));
		cards.add(new Card("queen", "Diamond"));
		cards.add(new Card("king", "Diamond"));
	}
	
	public int remainingCards(){
		return cards.size();
	}
	
	public Card dealCard(){
		Card c = cards.get(0);
		cards.remove(0);
		return c;
	}
	
	public void returnCard(Card c){
		if (!cardInDeck(c)){
			cards.add(c);
		}
	}
	
	public boolean cardInDeck(Card c){
		for(int i=0; i < remainingCards(); i++){
			if(c.getValue() == cards.get(i).getValue()){
				return true;
			}
		}
		return false;
	}
}
