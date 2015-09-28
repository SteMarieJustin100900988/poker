package poker;

import static org.junit.Assert.*;

import org.junit.Test;

public class gameShowsScore {

	@Test
	public void test() {
		Game g = new Game(2);
		String p1id = g.getPlayerID(0);
		String p2id = g.getPlayerID(1);
		Hand h1 = g.getPlayerHand(0);
		Hand h2 = g.getPlayerHand(1);
		HandValueCalculator hvc = new HandValueCalculator();
		
		h1.setValue(1);
		h2.setValue(2);
		
		assertEquals(p1id+" "+h1.getFinalValue(), g.getScore(0));
		assertEquals(p2id+" "+h2.getFinalValue(), g.getScore(1));
		
		assertEquals(g.getFinalScore(), g.getScore(1) + "\n" + g.getScore(0) + "\n");
		
	}

}
