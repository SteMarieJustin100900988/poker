package poker;

public class HandValueCalculator {
	
	private enum Tier {
		HighCard, OnePair, TwoPair,
		ThreeOfAKind, Straight, Flush,
		FullHouse, FourOfAKind,
		StraightFlush, RoyalFlush
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
	
	//determines what "tier" the hand is in
	//@TODO
	private Tier handTier(Hand h){
		
		
		
		
		
		
		
		
		return Tier.HighCard;
	}
}
