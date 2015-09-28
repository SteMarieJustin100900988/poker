package poker;

import static org.junit.Assert.*;

import org.junit.Test;

public class deckHasCards {

	@Test
	public void test() {
		Deck d = new Deck();
		assertEquals(52, d.remainingCards());
	}

}
