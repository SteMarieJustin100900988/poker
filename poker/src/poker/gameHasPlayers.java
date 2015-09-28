package poker;

import static org.junit.Assert.*;

import org.junit.Test;

public class gameHasPlayers {

	@Test
	public void test() {
		Game g = new Game(2);

		assertNotEquals("", g.getPlayerID(0));
	}

}
