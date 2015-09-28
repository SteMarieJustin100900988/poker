package poker;

import static org.junit.Assert.*;

import org.junit.Test;

public class gameTest {

	@Test
	public void test() {
		Game g = new Game(3);
		g.run();
		g.getFinalScore();
		assertNotEquals("", g.getFinalScore());
	}

}
