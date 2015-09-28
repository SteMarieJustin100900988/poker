package poker;

import org.junit.runners.Suite;
import org.junit.runner.RunWith;
@RunWith(Suite.class)
@Suite.SuiteClasses({
	compareHand.class,
	deckDealsCard.class,
	deckDenysWrongCards.class,
	deckHasCards.class,
	deckReturnsCard.class,
	gameHasPlayers.class,
	gameShowsScore.class,
	gameTest.class,
	getCardValueFromCard.class,
	handCanBeRanked.class,
	handCanBeRankedTest2.class,
	handComparisonTestMultiple.class,
	handDealtRandomCards.class,
	handHasCards.class,
	handRankValid.class,
	playerHasHand.class,
	playerHasUniqueID.class
})
public class testSuite {
}
