package poker;

import static org.junit.Assert.*;

import org.junit.Test;

public class handCanBeRankedTest2 {

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
		Hand h22 = new Hand(d.duplicateCardFromDeck(46),
							d.duplicateCardFromDeck(45),
							d.duplicateCardFromDeck(44),
							d.duplicateCardFromDeck(43),
							d.duplicateCardFromDeck(42)
							); //Straight Flush Weaker
		Hand h3 = new Hand(	d.duplicateCardFromDeck(39),
							d.duplicateCardFromDeck(26),
							d.duplicateCardFromDeck(13),
							d.duplicateCardFromDeck(0),
							d.duplicateCardFromDeck(51)
							); //Four of a Kind
		Hand h32 = new Hand(d.duplicateCardFromDeck(51),
							d.duplicateCardFromDeck(38),
							d.duplicateCardFromDeck(25),
							d.duplicateCardFromDeck(12),
							d.duplicateCardFromDeck(50)
							); //Four of a Kind Weaker
		Hand h4 = new Hand(	d.duplicateCardFromDeck(13),
							d.duplicateCardFromDeck(0),
							d.duplicateCardFromDeck(26),
							d.duplicateCardFromDeck(51),
							d.duplicateCardFromDeck(38)
							); //Full House
		Hand h42 = new Hand(	d.duplicateCardFromDeck(12),
				d.duplicateCardFromDeck(38),
				d.duplicateCardFromDeck(25),
				d.duplicateCardFromDeck(50),
				d.duplicateCardFromDeck(37)
				); //Full House Weaker
		Hand h5 = new Hand(	d.duplicateCardFromDeck(0),
							d.duplicateCardFromDeck(2),
							d.duplicateCardFromDeck(3),
							d.duplicateCardFromDeck(5),
							d.duplicateCardFromDeck(7)
							); //Flush
		Hand h52 = new Hand(	d.duplicateCardFromDeck(1),
				d.duplicateCardFromDeck(2),
				d.duplicateCardFromDeck(3),
				d.duplicateCardFromDeck(5),
				d.duplicateCardFromDeck(7)
				); //Flush Weaker
		Hand h6 = new Hand(	d.duplicateCardFromDeck(13),
							d.duplicateCardFromDeck(51),
							d.duplicateCardFromDeck(50),
							d.duplicateCardFromDeck(49),
							d.duplicateCardFromDeck(48)
							); //Straight
		Hand h62 = new Hand(	d.duplicateCardFromDeck(34),
				d.duplicateCardFromDeck(51),
				d.duplicateCardFromDeck(50),
				d.duplicateCardFromDeck(49),
				d.duplicateCardFromDeck(48)
				); //Straight weaker
		Hand h7 = new Hand(	d.duplicateCardFromDeck(13),
							d.duplicateCardFromDeck(0),
							d.duplicateCardFromDeck(26),
							d.duplicateCardFromDeck(2),
							d.duplicateCardFromDeck(3)
							); //Three of a Kind
		Hand h72 = new Hand(	d.duplicateCardFromDeck(51),
				d.duplicateCardFromDeck(38),
				d.duplicateCardFromDeck(25),
				d.duplicateCardFromDeck(2),
				d.duplicateCardFromDeck(3)
				); //Three of a Kind weaker
		Hand h8 = new Hand(	d.duplicateCardFromDeck(13),
							d.duplicateCardFromDeck(0),
							d.duplicateCardFromDeck(1),
							d.duplicateCardFromDeck(14),
							d.duplicateCardFromDeck(15)
							); //Two Pair
		Hand h82 = new Hand(	d.duplicateCardFromDeck(51),
				d.duplicateCardFromDeck(28),
				d.duplicateCardFromDeck(1),
				d.duplicateCardFromDeck(14),
				d.duplicateCardFromDeck(15)
				); //Two Pair weaker
		Hand h9 = new Hand(	d.duplicateCardFromDeck(13),
							d.duplicateCardFromDeck(0),
							d.duplicateCardFromDeck(1),
							d.duplicateCardFromDeck(2),
							d.duplicateCardFromDeck(5)
							); //One Pair
		Hand h92 = new Hand(	d.duplicateCardFromDeck(51),
				d.duplicateCardFromDeck(28),
				d.duplicateCardFromDeck(1),
				d.duplicateCardFromDeck(2),
				d.duplicateCardFromDeck(5)
				); //One Pair weaker
		Hand h10 = new Hand(d.duplicateCardFromDeck(13),
							d.duplicateCardFromDeck(14),
							d.duplicateCardFromDeck(17),
							d.duplicateCardFromDeck(47),
							d.duplicateCardFromDeck(48)
							); //High Card
		Hand h102 = new Hand(d.duplicateCardFromDeck(51),
				d.duplicateCardFromDeck(14),
				d.duplicateCardFromDeck(17),
				d.duplicateCardFromDeck(47),
				d.duplicateCardFromDeck(48)
				); //High Card weaker
		HandValueCalculator hvc = new HandValueCalculator();
		
		//tests
		compareTwoFirstFirst(h2, h22, hvc);
		compareTwoFirstFirst(h3, h32, hvc);
		compareTwoFirstFirst(h4, h42, hvc);
		compareTwoFirstFirst(h5, h52, hvc);
		compareTwoFirstFirst(h6, h62, hvc);
		compareTwoFirstFirst(h7, h72, hvc);
		compareTwoFirstFirst(h8, h82, hvc);
		compareTwoFirstFirst(h9, h92, hvc);
		compareTwoFirstFirst(h10, h102, hvc);
	}
	
	public void compareTwoFirstFirst(Hand hand1, Hand hand2, HandValueCalculator hvc){
		hvc.rankHand(hand1, hand2);
		assertEquals(1, hand1.getValue());
		assertEquals(2, hand2.getValue());
	}

}
