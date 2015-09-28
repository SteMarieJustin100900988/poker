package poker;

import java.util.ArrayList;

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
	
	//gets the card suit at the position
	public String getCardSuit(int pos){
		switch(pos){
		case 0: return c1.getSuit();
		case 1: return c2.getSuit();
		case 2: return c3.getSuit();
		case 3: return c4.getSuit();
		case 4: return c5.getSuit();
		default: return "";
		}
	}
	
	//gets the card rank at the position
	public String getCardRank(int pos){
		switch(pos){
		case 0: return c1.getRank();
		case 1: return c2.getRank();
		case 2: return c3.getRank();
		case 3: return c4.getRank();
		case 4: return c5.getRank();
		default: return "";
		}
	}
	
	//compares 2 hands to see if their rank is equal
	public boolean compare(Hand h){
		ArrayList<Integer> ignore = new ArrayList<Integer>();
		int t;
		for(int i=0; i<5; i++){
			t = compareCard(ignore, h, i);
			if(t<0){
				return false;
			}
			ignore.add(t);
		}
		return true;
	}
	
	//compares one card in hand to the entire other hand
	//while ignoring the other hand's positions that are in al
	//Ignores Suit
	private int compareCard(ArrayList<Integer> al, Hand h, int c){
		int r = -1;
		boolean skipFlag = false;
		for (int i=0; i<5; i++){
			for(int j=0; j<al.size(); j++){
				if(i == al.get(j)){
					skipFlag = true;
					break;
				}
			}
			if(skipFlag){
				skipFlag = false;
				continue;
			}
			if(getCardRank(c).equals(h.getCardRank(i))){
				r = i;
				break;
			}
		}
		return r;
	}
	
	//returns the value of the hand (1-4)
	public int getValue(){
		return 0;
	}
}
