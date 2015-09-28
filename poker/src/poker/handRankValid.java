package poker;

import static org.junit.Assert.*;

import org.junit.Test;

public class handRankValid {

	@Test
	public void test() {
		HandValueCalculator hvc = new HandValueCalculator();
		Deck d = new Deck();
		Hand h1 = new Hand( d.duplicateCardFromDeck(0),
							d.duplicateCardFromDeck(12),
							d.duplicateCardFromDeck(11),
							d.duplicateCardFromDeck(10),
							d.duplicateCardFromDeck(9)
							);
		assertEquals("RoyalFlush", hvc.rankOneHand(h1));
	}

}
