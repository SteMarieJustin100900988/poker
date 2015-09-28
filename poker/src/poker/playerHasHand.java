package poker;

import static org.junit.Assert.*;

import org.junit.Test;

public class playerHasHand {

	@Test
	public void test() {
		Deck d = new Deck();
		Player p1 = new Player(d);
		assertNotEquals("", p1.getHand().getCards());
	}

}
