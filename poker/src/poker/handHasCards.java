package poker;

import static org.junit.Assert.*;

import org.junit.Test;

public class handHasCards {

	@Test
	public void test() {
		Hand h = new Hand();
		assertEquals("fourClub,fiveDiamond,sixHeart,queenDiamond,aceSpade", h.getCards());
	}

}
