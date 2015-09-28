package poker;

import static org.junit.Assert.*;

import org.junit.Test;

public class handCanBeRanked {

	@Test
	public void test() {
		//setup
		Deck d = new Deck();
		Hand h1 = new Hand(	d.duplicateCardFromDeck(39),
							d.duplicateCardFromDeck(51),
							d.duplicateCardFromDeck(50),
							d.duplicateCardFromDeck(49),
							d.duplicateCardFromDeck(48)
							); //Royal Flush
		Hand h2 = new Hand(	d.duplicateCardFromDeck(47),
							d.duplicateCardFromDeck(46),
							d.duplicateCardFromDeck(45),
							d.duplicateCardFromDeck(44),
							d.duplicateCardFromDeck(43)
							); //Straight Flush
		Hand h3 = new Hand(	d.duplicateCardFromDeck(39),
							d.duplicateCardFromDeck(26),
							d.duplicateCardFromDeck(13),
							d.duplicateCardFromDeck(0),
							d.duplicateCardFromDeck(51)
							); //Four of a Kind
		Hand h4 = new Hand(	d.duplicateCardFromDeck(13),
							d.duplicateCardFromDeck(51),
							d.duplicateCardFromDeck(50),
							d.duplicateCardFromDeck(49),
							d.duplicateCardFromDeck(48)
							); //Straight - not royal flush
		handValueCalculator hvc = new handValueCalculator();
		
		//tests
		hvc.rankHand(h1, h4);
		assertEquals(1, h1.getValue());
		assertEquals(2, h4.getValue());
		hvc.rankHand(h1, h2);
		assertEquals(1, h1.getValue());
		assertEquals(2, h2.getValue());
		hvc.rankHand(h1, h3);
		assertEquals(1, h1.getValue());
		assertEquals(2, h3.getValue());
		hvc.rankHand(h2, h3);
		assertEquals(1, h2.getValue());
		assertEquals(2, h3.getValue());
		hvc.rankHand(h2, h4);
		assertEquals(1, h2.getValue());
		assertEquals(2, h4.getValue());
		hvc.rankHand(h3, h4);
		assertEquals(1, h3.getValue());
		assertEquals(2, h4.getValue());
		
	}

}
