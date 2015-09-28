package poker;

import static org.junit.Assert.*;

import org.junit.Test;

public class playerHasUniqueID {

	@Test
	public void test() {
		Deck d = new Deck();
		Player p1 = new Player(d);
		Player p2 = new Player(d);
		
		assertNotEquals(p1.getPlayerID(), p2.getPlayerID());
	}

}
