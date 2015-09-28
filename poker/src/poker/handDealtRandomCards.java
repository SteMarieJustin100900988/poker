package poker;

import static org.junit.Assert.*;

import org.junit.Test;

public class handDealtRandomCards {

	@Test
	public void test() {
		Deck d = new Deck();
		Hand h = new Hand(d);
		
		Deck d2 = new Deck();
		Card temp = d2.removeCardFromDeck(h.getCard(0));
		Hand h2 = new Hand(d2);
		
		assertNotEquals(h2.getCards(), h.getCards());
	}

}
