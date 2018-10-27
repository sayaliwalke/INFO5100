package Question1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class TestCaseQ1 {

	@Test
	void testAdd() {
		Mreview mreview = new Mreview("Kill Bill", 3);
		mreview.addRating(3);
		mreview.addRating(4);
		Assert.assertEquals(3, mreview.numRatings());
		Assert.assertEquals("Kill Bill", mreview.getTitle());
	}
	
	@Test
	void testAvg() {
		Mreview mreview = new Mreview("Kill Bill", 3);
		mreview.addRating(3);
		mreview.addRating(4);
		Assert.assertEquals(3.3, mreview.aveRating());
	}
	@Test
	void testEqualsAsFalse() {
		Mreview mreview = new Mreview("Kill Bill", 3);
		Mreview mreview1 = new Mreview("Spider Man", 3);
		
		Assert.assertEquals(false, mreview.equals(mreview1));
	}
	@Test
	void testEqualsAsTrue() {
		Mreview mreview = new Mreview("Kill Bill", 3);
		Mreview mreview1 = new Mreview("Kill Bill", 3);
		
		Assert.assertEquals(true, mreview.equals(mreview1));
	}
	@Test
	void testCompare() {
		Mreview mreview = new Mreview("aa", 3);
		Mreview mreview1 = new Mreview("ab", 3);
		
		Assert.assertEquals(-1, mreview.compareTo(mreview1));
	}
	@Test
	void testComparePositive() {
		Mreview mreview = new Mreview("ab", 3);
		Mreview mreview1 = new Mreview("aa", 3);
		
		Assert.assertEquals(1, mreview.compareTo(mreview1));
	}
	@Test
	void testCompareEqual() {
		Mreview mreview = new Mreview("aa", 3);
		Mreview mreview1 = new Mreview("aa", 3);
		
		Assert.assertEquals(0, mreview.compareTo(mreview1));
	}
	
	

}
