package poker;

import static org.junit.Assert.*;

import org.junit.Test;

public class deckDenysWrongCards {

	@Test
	public void test() {
		Deck d = new Deck();
		Card c = new Card("cat", "Mouse");
		Card c2 = d.dealCard();
		assertEquals(51, d.remainingCards());
		d.returnCard(c);
		assertEquals(51, d.remainingCards());
		d.returnCard(c2);
		assertEquals(52, d.remainingCards());
		d.returnCard(c2);
		assertEquals(52, d.remainingCards());
	}

}
