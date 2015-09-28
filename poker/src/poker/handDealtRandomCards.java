package poker;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class handDealtRandomCards {

	@Test
	public void test() {
		Deck d = new Deck();
		Hand h = new Hand(d);
		
		ArrayList<Card> tempL = new ArrayList<Card>();
		Deck d2 = new Deck();
		Card temp;
		
		//while loop makes it so the first card in h is removed from d2
		while(d2.remainingCards() > 0){
			temp = d2.dealCard();
			
			if (temp.equals(h.getCard(0))){
				while(tempL.size() > 0){
					d2.returnCard(tempL.get(0));
					tempL.remove(0);
				}
				break;
			} else {
				tempL.add(temp);
			}
		}
		Hand h2 = new Hand(d2);
		
		assertNotEquals(h2.getCards(), h.getCards());
	}

}
