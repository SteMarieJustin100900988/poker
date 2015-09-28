package poker;

import java.util.ArrayList;

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
		temp.add(new Card("Ace", "Spade"));
		temp.add(new Card("Two", "Spade"));
		temp.add(new Card("Three", "Spade"));
		temp.add(new Card("Four", "Spade"));
		temp.add(new Card("Five", "Spade"));
		temp.add(new Card("Six", "Spade"));
		temp.add(new Card("Seven", "Spade"));
		temp.add(new Card("Eight", "Spade"));
		temp.add(new Card("Nine", "Spade"));
		temp.add(new Card("Ten", "Spade"));
		temp.add(new Card("Jack", "Spade"));
		temp.add(new Card("Queen", "Spade"));
		temp.add(new Card("King", "Spade"));
		//clubs
		temp.add(new Card("Ace", "Club"));
		temp.add(new Card("Two", "Club"));
		temp.add(new Card("Three", "Club"));
		temp.add(new Card("Four", "Club"));
		temp.add(new Card("Five", "Club"));
		temp.add(new Card("Six", "Club"));
		temp.add(new Card("Seven", "Club"));
		temp.add(new Card("Eight", "Club"));
		temp.add(new Card("Nine", "Club"));
		temp.add(new Card("Ten", "Club"));
		temp.add(new Card("Jack", "Club"));
		temp.add(new Card("Queen", "Club"));
		temp.add(new Card("King", "Club"));
		//Heart
		temp.add(new Card("Ace", "Heart"));
		temp.add(new Card("Two", "Heart"));
		temp.add(new Card("Three", "Heart"));
		temp.add(new Card("Four", "Heart"));
		temp.add(new Card("Five", "Heart"));
		temp.add(new Card("Six", "Heart"));
		temp.add(new Card("Seven", "Heart"));
		temp.add(new Card("Eight", "Heart"));
		temp.add(new Card("Nine", "Heart"));
		temp.add(new Card("Ten", "Heart"));
		temp.add(new Card("Jack", "Heart"));
		temp.add(new Card("Queen", "Heart"));
		temp.add(new Card("King", "Heart"));
		//Diamond
		temp.add(new Card("Ace", "Diamond"));
		temp.add(new Card("Two", "Diamond"));
		temp.add(new Card("Three", "Diamond"));
		temp.add(new Card("Four", "Diamond"));
		temp.add(new Card("Five", "Diamond"));
		temp.add(new Card("Six", "Diamond"));
		temp.add(new Card("Seven", "Diamond"));
		temp.add(new Card("Eight", "Diamond"));
		temp.add(new Card("Nine", "Diamond"));
		temp.add(new Card("Ten", "Diamond"));
		temp.add(new Card("Jack", "Diamond"));
		temp.add(new Card("Queen", "Diamond"));
		temp.add(new Card("King", "Diamond"));
		
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
