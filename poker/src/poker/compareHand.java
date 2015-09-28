package poker;

import static org.junit.Assert.*;

import org.junit.Test;

public class compareHand {

	@Test
	public void test() {
		Deck d = new Deck();
		Card c1, c2, c3, c4, c5, c6;
		c1 = new Card("Ace", "Heart");
		c2 = new Card("Ace", "Club");
		c3 = new Card("Ace", "Space");
		c4 = new Card("Ace", "Diamond");
		c5 = new Card("King", "Heart");
		c6 = new Card("Queen", "Heart");
		Hand h1 = new Hand(c1, c2, c3, c4, c5);
		Hand h2 = new Hand(c2, c4, c5, c3, c1);
		Hand h3 = new Hand(c4, c6, c5, c3, c1);
		assertTrue(h1.compare(h2));
		assertFalse(h1.compare(h3));
	}

}
