package poker;

import static org.junit.Assert.*;

import org.junit.Test;

public class getCardValueFromCard {

	@Test
	public void test() {
		Card c = new Card();
		assertEquals( "", c.getValue());
	}

}
