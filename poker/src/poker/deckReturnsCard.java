package poker;

import static org.junit.Assert.*;

import org.junit.Test;

public class deckReturnsCard {

	@Test
	public void test() {
		Deck d = new Deck();
		Card c = d.dealCard();
		assertEquals(51, d.remainingCards());
		d.returnCard(c);
		assertEquals(52, d.remainingCards());
	}

}
