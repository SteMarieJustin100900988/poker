package poker;

import static org.junit.Assert.*;

import org.junit.Test;

public class deckDealsCard {

	@Test
	public void test() {
		Deck d = new Deck();
		Deck d2 = new Deck();
		d.dealCard();
		assertEquals(51, d.remainingCards());
		assertNotEquals(d2, d);
	}

}
