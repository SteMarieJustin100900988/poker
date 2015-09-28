package poker;

import static org.junit.Assert.*;

import org.junit.Test;

public class playerHasHand {

	@Test
	public void test() {
		Player p1 = new Player();
		assertNotEquals("", p1.getHand().getCards());
	}

}
