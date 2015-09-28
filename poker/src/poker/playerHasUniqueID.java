package poker;

import static org.junit.Assert.*;

import org.junit.Test;

public class playerHasUniqueID {

	@Test
	public void test() {
		Player p1 = new Player();
		Player p2 = new Player();
		
		assertNotEquals(p1.getPlayerID(), p2.getPlayerID());
	}

}
