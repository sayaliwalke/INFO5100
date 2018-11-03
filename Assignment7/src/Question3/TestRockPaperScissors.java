package Question3;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestRockPaperScissors {

	@Test
	void testScissorsandPaper() {
		Scissors s = new Scissors(20);
		Paper p = new Paper(30);
		Assert.assertEquals(true, s.fight(p));

	}

	@Test
	void testScissorsandRock() {
		Scissors s = new Scissors(5);
		Rock r = new Rock(40);
		Assert.assertEquals(false, s.fight(r));

	}

	@Test
	void testPaperandScissor() {
		Scissors s = new Scissors(20);
		Paper p = new Paper(30);
		Assert.assertEquals(false, p.fight(s));

	}

	@Test
	void testPaperandRock() {
		Rock r = new Rock(40);
		Paper p = new Paper(30);
		Assert.assertEquals(true, p.fight(r));

	}

	@Test
	void testRockandPaper() {
		Rock r = new Rock(40);
		Paper p = new Paper(30);
		Assert.assertEquals(false, r.fight(p));

	}

	@Test
	void testRockandScissors() {
		Rock r = new Rock(40);
		Scissors s = new Scissors(20);
		Assert.assertEquals(true, r.fight(s));

	}

}
