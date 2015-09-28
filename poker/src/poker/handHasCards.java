package poker;

import static org.junit.Assert.*;

import org.junit.Test;

public class handHasCards {

	@Test
	public void test() {
		Deck d = new Deck();
		Hand h = new Hand(d);
		assertEquals("aceSpade,twoSpade,threeSpade,fourSpade,fiveSpade", h.getCards());
	}

}
