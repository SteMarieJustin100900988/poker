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
							d.duplicateCardFromDeck(0),
							d.duplicateCardFromDeck(26),
							d.duplicateCardFromDeck(51),
							d.duplicateCardFromDeck(38)
							); //Full House
		Hand h5 = new Hand(	d.duplicateCardFromDeck(0),
							d.duplicateCardFromDeck(2),
							d.duplicateCardFromDeck(3),
							d.duplicateCardFromDeck(5),
							d.duplicateCardFromDeck(7)
							); //Flush
		Hand h6 = new Hand(	d.duplicateCardFromDeck(13),
							d.duplicateCardFromDeck(51),
							d.duplicateCardFromDeck(50),
							d.duplicateCardFromDeck(49),
							d.duplicateCardFromDeck(48)
							); //Straight
		Hand h7 = new Hand(	d.duplicateCardFromDeck(13),
							d.duplicateCardFromDeck(0),
							d.duplicateCardFromDeck(26),
							d.duplicateCardFromDeck(2),
							d.duplicateCardFromDeck(3)
							); //Three of a Kind
		Hand h8 = new Hand(	d.duplicateCardFromDeck(13),
							d.duplicateCardFromDeck(0),
							d.duplicateCardFromDeck(1),
							d.duplicateCardFromDeck(14),
							d.duplicateCardFromDeck(15)
							); //Two Pair
		Hand h9 = new Hand(	d.duplicateCardFromDeck(13),
							d.duplicateCardFromDeck(0),
							d.duplicateCardFromDeck(1),
							d.duplicateCardFromDeck(2),
							d.duplicateCardFromDeck(5)
							); //One Pair
		Hand h10 = new Hand(d.duplicateCardFromDeck(13),
							d.duplicateCardFromDeck(14),
							d.duplicateCardFromDeck(17),
							d.duplicateCardFromDeck(47),
							d.duplicateCardFromDeck(48)
							); //High Card
		HandValueCalculator hvc = new HandValueCalculator();
		
		//tests
		hvc.rankHand(h1, h4);
		assertEquals(1, h1.getValue());
		assertEquals(2, h4.getValue());
		hvc.rankHand(h1, h3);
		assertEquals(1, h1.getValue());
		assertEquals(2, h3.getValue());
		hvc.rankHand(h2, h3);
		assertEquals(1, h2.getValue());
		assertEquals(2, h3.getValue());
		hvc.rankHand(h1, h2);
		assertEquals(1, h1.getValue());
		assertEquals(2, h2.getValue());
		hvc.rankHand(h2, h3);
		assertEquals(1, h2.getValue());
		assertEquals(2, h3.getValue());
		hvc.rankHand(h3, h4);
		assertEquals(1, h3.getValue());
		assertEquals(2, h4.getValue());
		hvc.rankHand(h4, h5);
		assertEquals(1, h4.getValue());
		assertEquals(2, h5.getValue());
		hvc.rankHand(h5, h6);
		assertEquals(1, h5.getValue());
		assertEquals(2, h6.getValue());
		hvc.rankHand(h6, h7);
		assertEquals(1, h6.getValue());
		assertEquals(2, h7.getValue());
		hvc.rankHand(h7, h8);
		assertEquals(1, h7.getValue());
		assertEquals(2, h8.getValue());
		hvc.rankHand(h8, h9);
		assertEquals(1, h8.getValue());
		assertEquals(2, h9.getValue());
		hvc.rankHand(h9, h10);
		assertEquals(1, h9.getValue());
		assertEquals(2, h10.getValue());
		hvc.rankHand(h1, h10);
		assertEquals(1, h1.getValue());
		assertEquals(2, h10.getValue());
		
	}

}
