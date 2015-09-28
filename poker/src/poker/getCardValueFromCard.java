package poker;

import static org.junit.Assert.*;

import org.junit.Test;

public class getCardValueFromCard {

	@Test
	public void test() {
		Card c = new Card("four", "Club");
		Card c1 = new Card("five", "Diamond");
		assertEquals( "fourClub", c.getValue());
		assertNotEquals( "fiveDiamond", c.getValue());
		assertEquals( "fiveDiamond", c1.getValue());
		assertNotEquals( "fourClub", c1.getValue());
	}

}
