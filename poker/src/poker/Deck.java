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
		temp.add(new Card("Ace", "Spade"));		//0
		temp.add(new Card("Two", "Spade"));		//1
		temp.add(new Card("Three", "Spade"));	//2
		temp.add(new Card("Four", "Spade"));	//3
		temp.add(new Card("Five", "Spade"));	//4
		temp.add(new Card("Six", "Spade"));		//5
		temp.add(new Card("Seven", "Spade"));	//6
		temp.add(new Card("Eight", "Spade"));	//7
		temp.add(new Card("Nine", "Spade"));	//8
		temp.add(new Card("Ten", "Spade"));		//9
		temp.add(new Card("Jack", "Spade"));	//10
		temp.add(new Card("Queen", "Spade"));	//11
		temp.add(new Card("King", "Spade"));	//12
		//clubs
		temp.add(new Card("Ace", "Club"));		//13
		temp.add(new Card("Two", "Club"));		//14
		temp.add(new Card("Three", "Club"));	//15
		temp.add(new Card("Four", "Club"));		//16
		temp.add(new Card("Five", "Club"));		//17
		temp.add(new Card("Six", "Club"));		//18
		temp.add(new Card("Seven", "Club"));	//19
		temp.add(new Card("Eight", "Club"));	//20
		temp.add(new Card("Nine", "Club"));		//21
		temp.add(new Card("Ten", "Club"));		//22
		temp.add(new Card("Jack", "Club"));		//23
		temp.add(new Card("Queen", "Club"));	//24
		temp.add(new Card("King", "Club"));		//25
		//Heart
		temp.add(new Card("Ace", "Heart"));		//26
		temp.add(new Card("Two", "Heart"));		//27
		temp.add(new Card("Three", "Heart"));	//28
		temp.add(new Card("Four", "Heart"));	//29
		temp.add(new Card("Five", "Heart"));	//30
		temp.add(new Card("Six", "Heart"));		//31
		temp.add(new Card("Seven", "Heart"));	//32
		temp.add(new Card("Eight", "Heart"));	//33
		temp.add(new Card("Nine", "Heart"));	//34
		temp.add(new Card("Ten", "Heart"));		//35
		temp.add(new Card("Jack", "Heart"));	//36
		temp.add(new Card("Queen", "Heart"));	//37
		temp.add(new Card("King", "Heart"));	//38
		//Diamond
		temp.add(new Card("Ace", "Diamond"));	//39
		temp.add(new Card("Two", "Diamond"));	//40
		temp.add(new Card("Three", "Diamond"));	//41
		temp.add(new Card("Four", "Diamond"));	//42
		temp.add(new Card("Five", "Diamond"));	//43
		temp.add(new Card("Six", "Diamond"));	//44
		temp.add(new Card("Seven", "Diamond"));	//45
		temp.add(new Card("Eight", "Diamond"));	//46
		temp.add(new Card("Nine", "Diamond"));	//47
		temp.add(new Card("Ten", "Diamond"));	//48
		temp.add(new Card("Jack", "Diamond"));	//49
		temp.add(new Card("Queen", "Diamond"));	//50
		temp.add(new Card("King", "Diamond"));	//51
		
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
	//removes a card from the deck (by int)
	public Card removeCardFromDeck(int i){
		if (i<0 || i>cards.size()){
			new IllegalArgumentException("Card not in deck");
			return new Card("Joker", "");
		}
		Card r = cards.get(i);
		cards.remove(i);
		return r;
	}
	//copies a card from the deck (by int)
	public Card duplicateCardFromDeck(int i){
		if (i<0 || i>cards.size()){
			new IllegalArgumentException("Card not in deck");
			return new Card("Joker", "");
		}
		Card r = cards.get(i);
		return r;
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
