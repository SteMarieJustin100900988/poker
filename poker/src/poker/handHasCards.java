package poker;

import static org.junit.Assert.*;

import org.junit.Test;

public class handHasCards {

	@Test
	public void test() {
		Hand h = new Hand( 	new Card("Ace", "Spade"),
							new Card("Two", "Spade"),
							new Card("Three", "Spade"),
							new Card("Four", "Spade"),
							new Card("Five", "Spade")
							);
		assertEquals("AceSpade TwoSpade ThreeSpade FourSpade FiveSpade", h.getCards());
	}

}
