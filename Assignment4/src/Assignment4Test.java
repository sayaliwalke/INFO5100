
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class Assignment4Test {
	Assignment4 assignment4=new Assignment4();
	@Test
	void testFirstUniqChar() {
		
		int index = assignment4.firstUniqChar("asdasff");
		Assert.assertEquals(2, index);
	}
	@Test
	void testFirstUniqCharWithNullInput() {
		
		int index = assignment4.firstUniqChar("");
		Assert.assertEquals(-1, index);
	}

	@Test
	void testAddDigits() {
		fail("Not yet implemented");
	}

	@Test
	void testMoveZeroes() {
		fail("Not yet implemented");
	}

	@Test
	void testLongestPalindrome() {
		fail("Not yet implemented");
	}

	@Test
	void testRotate() {
		fail("Not yet implemented");
	}

}
