package poker;

public class HandValueCalculator {
	
	private enum Tier {
		HighCard, OnePair, TwoPair,
		ThreeOfAKind, Straight, Flush,
		FullHouse, FourOfAKind,
		StraightFlush, RoyalFlush
	}
	private enum CardRank {
		Two, Three, Four, Five, Six,
		Seven, Eight, Nine, Ten, Jack,
		Queen, King, Ace
	}
	
	//TESTCODE
	public String rankOneHand(Hand h){
		return handTier(h).toString();
	}
	
	//determines which hand is higher and sets their values
	public void rankHand(Hand h1, Hand h2){
		Tier h1Tier = handTier(h1);
		Tier h2Tier = handTier(h2);
		if( h1Tier.ordinal() == h2Tier.ordinal() ){
			higherHand(h1Tier, h1, h2);
		} else if (h1Tier.ordinal() > h2Tier.ordinal()){
			h1.setValue(1);
			h2.setValue(2);
		} else {
			h1.setValue(2);
			h2.setValue(1);
		}
	}
	//determines which hand is higher and sets their values, with an offset
	public void rankHand(Hand h1, Hand h2, int offset){
		Tier h1Tier = handTier(h1);
		Tier h2Tier = handTier(h2);
		if( h1Tier.ordinal() == h2Tier.ordinal() ){
			higherHand(h1Tier, h1, h2, offset);
		} else if (h1Tier.ordinal() > h2Tier.ordinal()){
			h1.setValue(1+offset);
			h2.setValue(2+offset);
		} else {
			h1.setValue(2+offset);
			h2.setValue(1+offset);
		}
	}
	
	//determines which hand is higher inside the "tier" the hands are in
	//then sets their rank
	private void higherHand(Tier t, Hand h1, Hand h2){
		
	}
	
	//determines which hand is higher inside the "tier" the hands are in
	//then sets their rank, with an offset
	private void higherHand(Tier t, Hand h1, Hand h2, int offset){
		higherHand(t, h1, h2);
		h1.setValue(h1.getValue()+offset);
		h2.setValue(h2.getValue()+offset);
	}
	
	//determines if cards in entered positions have the same suit
	private boolean sameSuit(Hand h, int p1, int p2){
		return (h.getCardSuit(p1).equals(h.getCardSuit(p2)));
	}
	//determines if cards in entered positions have the same suit
	private boolean sameSuit(Hand h, int p1, int p2, int p3){
		return (sameSuit(h, p1, p2) && sameSuit(h, p1, p3));
	}
	//determines if cards in entered positions have the same suit
	private boolean sameSuit(Hand h, int p1, int p2, int p3, int p4){
		return (sameSuit(h, p1, p2) && sameSuit(h, p1, p3) && sameSuit(h, p1, p4));
	}
	//determines if cards in entered positions have the same suit
	private boolean sameSuit(Hand h, int p1, int p2, int p3, int p4, int p5){
		return (sameSuit(h, p1, p2) && sameSuit(h, p1, p3) && sameSuit(h, p1, p4) && sameSuit(h, p1, p5));
	}
	//determines if hand is the same suit
	private boolean sameSuit(Hand h){
		return (sameSuit(h, 0, 1) && sameSuit(h, 0, 2) && sameSuit(h, 0, 3) && sameSuit(h, 0, 4));
	}
	
	
	//determines if cards in entered positions have the same rank
	private boolean sameRank(Hand h, int p1, int p2){
		return (h.getCardRank(p1).equals(h.getCardRank(p2)));
	}
	//determines if cards in entered positions have the same rank
	private boolean sameRank(Hand h, int p1, int p2, int p3){
		return (sameRank(h, p1, p2) && sameRank(h, p1, p3));
	}
	//determines if cards in entered positions have the same rank
	private boolean sameRank(Hand h, int p1, int p2, int p3, int p4){
		return (sameRank(h, p1, p2) && sameRank(h, p1, p3) && sameRank(h, p1, p4));
	}
	//determines if cards in entered positions have the same rank
	private boolean sameRank(Hand h, int p1, int p2, int p3, int p4, int p5){
		return (sameRank(h, p1, p2) && sameRank(h, p1, p3) && sameRank(h, p1, p4) && sameRank(h, p1, p5));
	}
	
	//determines if exactly x cards in the hand are the same card
	private boolean sameRank(Hand h, int x){
		int count = 0;
		for(int i=0; i<4; i++){
			//don't need to do last one since it'll 
			//already be checked with everything else
			if(count == x){
				return true;
			} else {
				count = 0;
			}
			for(int j=0; j<5; j++){
				if(j==i){
					continue;
				}
				if(sameRank(h, i, j)){
					count++;
				}
			}
		}
		return (count == x);
	}
	
	//returns the CardRank of string, if applicable
	private CardRank stringToCR(String in){
		if( in.equals("Two") ||
			in.equals("Three") ||
			in.equals("Four") ||
			in.equals("Five") ||
			in.equals("Six") ||
			in.equals("Seven") ||
			in.equals("Eight") ||
			in.equals("Nine") ||
			in.equals("Ten") ||
			in.equals("Jack") ||
			in.equals("Queen") ||
			in.equals("King") ||
			in.equals("Ace") ){
				return CardRank.valueOf(in);
		} else {
			throw new IllegalArgumentException("Invalid String - " + in);
		}	
	}
	
	//returns the position of the highest card in hand.
	private int highestCardInHand(Hand h){
		int currentHighestPos = -1;
		int currentHighestValue = -1;
		for(int i=0; i<5; i++){
			if(stringToCR(h.getCardRank(i)).ordinal() > currentHighestValue){
				currentHighestPos = i;
				currentHighestValue = stringToCR(h.getCardRank(i)).ordinal();
			}
		}
		return currentHighestPos;
	}
	
	//returns the position of the highest card in hand, below passed in value.
	//CAN return -1
	private int highestCardInHandBelow(Hand h, CardRank cr){
		int currentHighestPos = -1;
		int currentHighestValue = -1;
		for(int i=0; i<5; i++){
			if(	stringToCR(h.getCardRank(i)).ordinal() > currentHighestValue
			&& 	stringToCR(h.getCardRank(i)).ordinal() < cr.ordinal()
					){
				currentHighestPos = i;
				currentHighestValue = stringToCR(h.getCardRank(i)).ordinal();
			}
		}
		return currentHighestPos;
	}
	
	//determines if a card is card directly below entered cardrank
	private boolean directlyBelow(Hand h, CardRank cr){
		int highestInt = highestCardInHandBelow(h, cr);
		if(highestInt == -1){
			return false;
		}
		if(stringToCR(h.getCardRank(highestInt)).ordinal() == cr.ordinal()-1){
			return true;
		}
		return false;
	}
	
	
	//determines if cards are 1 away from one another.
	private boolean isHandStraight(Hand h){
		if(sameRank(h, 2) || sameRank(h, 3) || sameRank(h, 4)){
			//hand has no duplicates
			return false;
		}
		int highest = highestCardInHand(h);
		if(stringToCR(h.getCardRank(highest)).ordinal() == CardRank.Ace.ordinal()) {
			int highestIA = highestCardInHandBelow(h, CardRank.Ace);
			if(stringToCR(h.getCardRank(highestIA)).ordinal() == CardRank.King.ordinal()){
				//royal or bust
				if(	directlyBelow(h, CardRank.King)
				&&	directlyBelow(h, CardRank.Queen)
				&&	directlyBelow(h, CardRank.Jack) ){
					return true;
				}
				return false;
			} else {
				//ace is low or bust
				if(	directlyBelow(h, CardRank.Six)
				&&	directlyBelow(h, CardRank.Five)
				&&	directlyBelow(h, CardRank.Four)
				&&	directlyBelow(h, CardRank.Three) ){
					return true;
				}
				return false;
			}
		} else {
			int highestOrd = stringToCR(h.getCard(highest)).ordinal();
			if(	directlyBelow(h, CardRank.values()[highestOrd])
			&&	directlyBelow(h, CardRank.values()[highestOrd-1])
			&&	directlyBelow(h, CardRank.values()[highestOrd-2])
			&&	directlyBelow(h, CardRank.values()[highestOrd-3])){
				return true;
			}
			return false;
		}
	}
	
	
	
	
	
	//determines what "tier" the hand is in
	private Tier handTier(Hand h){
		if(sameSuit(h)){
			//RoyalFlush, StraightFlush, Flush
			if(isHandStraight(h)){
				//RoyalFlush, StraightFlush
				if(stringToCR(h.getCardRank(highestCardInHandBelow(h, CardRank.Ace))).ordinal() == CardRank.King.ordinal()){
					return Tier.RoyalFlush;
				} else {
					return Tier.StraightFlush;
				}
			} else {
				return Tier.Flush;
			} 
		} else {
			//FourOfAKind,FullHouse,Straight,ThreeOfAKind,TwoPair,OnePair
			if(isHandStraight(h)){
				return Tier.Straight;
			}
			if(sameRank(h, 4)){
				return Tier.FourOfAKind;
			} else if(sameRank(h, 3)){
				//ThreeOfAKind, FullHouse
				if(sameRank(h,2)){
					return Tier.FullHouse;
				} else {
					return Tier.ThreeOfAKind;
				}
			} else if(sameRank(h, 2)){
				//TwoPair,OnePair
				
				//Pair Checking
				if(sameRank(h, 1, 2)){
					if(sameRank(h, 3, 4) || sameRank(h, 3, 5) || sameRank(h, 4, 5)){
						return Tier.TwoPair;
					} else {
						return Tier.OnePair;
					}
				} else if(sameRank(h, 1, 3)){
					if(sameRank(h, 2, 4) || sameRank(h, 2, 5) || sameRank(h, 4, 5)){
						return Tier.TwoPair;
					} else {
						return Tier.OnePair;
					}
				} else if(sameRank(h, 1, 4)){
					if(sameRank(h, 2, 3) || sameRank(h, 2, 5) || sameRank(h, 3, 5)){
						return Tier.TwoPair;
					} else {
						return Tier.OnePair;
					}
				} else if(sameRank(h, 1, 5)){
					if(sameRank(h, 2, 4) || sameRank(h, 2, 3) || sameRank(h, 4, 3)){
						return Tier.TwoPair;
					} else {
						return Tier.OnePair;
					}
				} else {
					if(sameRank(h, 2, 3)){
						if(sameRank(h, 4, 5)){
							return Tier.TwoPair;
						} else {
							return Tier.OnePair;
						}
					} else if(sameRank(h, 2, 4)){
						if(sameRank(h, 3, 5)){
							return Tier.TwoPair;
						} else {
							return Tier.OnePair;
						}
					}  else {
						return Tier.OnePair;
					}
				}
				//Pair checking end
			} else {
				return Tier.HighCard;
			}
		}
	}
}
