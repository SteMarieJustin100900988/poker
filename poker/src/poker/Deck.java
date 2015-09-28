package poker;

import java.util.ArrayList;
import java.math.*;

public class Deck {
	private ArrayList<Card> cards;
	private ArrayList<Card> validCards;

	public Deck(){
		cards = basicDeck();
		validCards = basicDeck();
	}
	
	private ArrayList<Card> basicDeck(){
		ArrayList<Card> temp = new ArrayList<Card>();
		//spades
		temp.add(new Card("ace", "Spade"));
		temp.add(new Card("two", "Spade"));
		temp.add(new Card("three", "Spade"));
		temp.add(new Card("four", "Spade"));
		temp.add(new Card("five", "Spade"));
		temp.add(new Card("six", "Spade"));
		temp.add(new Card("seven", "Spade"));
		temp.add(new Card("eight", "Spade"));
		temp.add(new Card("nine", "Spade"));
		temp.add(new Card("ten", "Spade"));
		temp.add(new Card("jack", "Spade"));
		temp.add(new Card("queen", "Spade"));
		temp.add(new Card("king", "Spade"));
		//clubs
		temp.add(new Card("ace", "Club"));
		temp.add(new Card("two", "Club"));
		temp.add(new Card("three", "Club"));
		temp.add(new Card("four", "Club"));
		temp.add(new Card("five", "Club"));
		temp.add(new Card("six", "Club"));
		temp.add(new Card("seven", "Club"));
		temp.add(new Card("eight", "Club"));
		temp.add(new Card("nine", "Club"));
		temp.add(new Card("ten", "Club"));
		temp.add(new Card("jack", "Club"));
		temp.add(new Card("queen", "Club"));
		temp.add(new Card("king", "Club"));
		//Heart
		temp.add(new Card("ace", "Heart"));
		temp.add(new Card("two", "Heart"));
		temp.add(new Card("three", "Heart"));
		temp.add(new Card("four", "Heart"));
		temp.add(new Card("five", "Heart"));
		temp.add(new Card("six", "Heart"));
		temp.add(new Card("seven", "Heart"));
		temp.add(new Card("eight", "Heart"));
		temp.add(new Card("nine", "Heart"));
		temp.add(new Card("ten", "Heart"));
		temp.add(new Card("jack", "Heart"));
		temp.add(new Card("queen", "Heart"));
		temp.add(new Card("king", "Heart"));
		//Diamond
		temp.add(new Card("ace", "Diamond"));
		temp.add(new Card("two", "Diamond"));
		temp.add(new Card("three", "Diamond"));
		temp.add(new Card("four", "Diamond"));
		temp.add(new Card("five", "Diamond"));
		temp.add(new Card("six", "Diamond"));
		temp.add(new Card("seven", "Diamond"));
		temp.add(new Card("eight", "Diamond"));
		temp.add(new Card("nine", "Diamond"));
		temp.add(new Card("ten", "Diamond"));
		temp.add(new Card("jack", "Diamond"));
		temp.add(new Card("queen", "Diamond"));
		temp.add(new Card("king", "Diamond"));
		
		return temp;
	}
	
	//returns size of card list
	public int remainingCards(){
		return cards.size();
	}
	
	//deals a random card from the deck
	public Card dealCard(){
		if (cards.size() <= 0){
			throw new IllegalArgumentException("No cards in deck");
		}
		int randomPos = (int)(Math.random() * cards.size());
		Card c = cards.get(randomPos);
		cards.remove(randomPos);
		return c;
	}
	
	//puts a card back into the deck.
	public void returnCard(Card c){
		if(validCard(c)){
			if (!cardInDeck(c)){
				cards.add(c);
			}
		}
	}
	
	//checks if the card is in the deck
	public boolean cardInDeck(Card c){
		for(int i=0; i < cards.size(); i++){
			if(c.getValue().equals(cards.get(i).getValue())){
				return true;
			}
		}
		return false;
	}
	
	//ensures the card is a card that can be in the deck
	private boolean validCard(Card c){
		for(int i=0; i < validCards.size(); i++){
			if(c.getValue().equals(validCards.get(i).getValue())){
				return true;
			}
		}
		return false;
	}
	
	
	//removes a card from the deck
	public Card removeCardFromDeck(Card c){
		int ind = findCardIndex(c);
		if(ind > -1){
			Card r = cards.get(ind);
			cards.remove(ind);
			return r;
		} else {
			new IllegalArgumentException("Card not in deck");
			return new Card("Joker", "");
		}
	}
	//removes a card from the deck (by string)
	public Card removeCardFromDeck(String s){
		int ind = findCardIndex(s);
		if(ind > -1){
			Card r = cards.get(ind);
			cards.remove(ind);
			return r;
		} else {
			new IllegalArgumentException("Card not in deck");
			return new Card("Joker", "");
		}
	}

	//finds the index of a card if it is in the deck
	private int findCardIndex(Card c){
		for(int i=0; i < cards.size(); i++){
			if(c.getValue().equals(cards.get(i).getValue())){
				return i;
			}
		}
		return -1;
	}

	//finds the index of a card if it is in the deck (by string)
	private int findCardIndex(String s){
		for(int i=0; i < cards.size(); i++){
			if(s.equals(cards.get(i).getValue())){
				return i;
			}
		}
		return -1;
	}
}
