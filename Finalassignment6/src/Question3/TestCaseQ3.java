package Question3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class TestCaseQ3 {

	@Test
	void testDisplayCathair() {
		Cat cat = new Cat("Spot", "Bob", "Black", "Short");
		String output = cat.getHairLength();
		String ExpectedOutput = "Short";
		Assert.assertEquals(output, ExpectedOutput);

	}

	@Test
	void testDisplayGender() {
		Dog dog = new Dog("Spot", "Susan", "White", "Medium");
		dog.setSex(3);
		String output = dog.getSex();
		String ExpectedOutput = "SPAYED";
		Assert.assertEquals(output, ExpectedOutput);

	}

	@Test
	void testBoardingDateIsInLimits() {
		Cat cat = new Cat("Spot", "Bob", "Black", "Short");
		cat.setBoardStart(2, 14, 2014);
		cat.setBoardEnd(5, 15, 2015);
		Assert.assertEquals(true, cat.boarding(4, 10, 2014));
	}

	@Test
	void testBoardingDateIsNotInLimits() {
		Cat cat = new Cat("Spot", "Bob", "Black", "Short");
		cat.setBoardStart(2, 15, 2014);
		cat.setBoardEnd(5, 15, 2015);
		Assert.assertEquals(false, cat.boarding(6, 20, 2016));
	}

	@Test
	void testBoardingDateisValid() {
		Cat cat = new Cat("Spot", "Bob", "Black", "Short");
		cat.setBoardStart(2, 15, 2014);
		cat.setBoardEnd(5, 15, 2015);
		Assert.assertEquals(false, cat.boarding(13, 10, 2014));
		Assert.assertEquals(false, cat.boarding(3, 32, 2014));
		Assert.assertEquals(false, cat.boarding(3, 10, 201));
	}

	@Test
	void testBoardingDateIsInLimitsDog() {
		Dog dog = new Dog("Spot", "Susan", "White", "Medium");
		dog.setBoardStart(7, 05, 2011);
		dog.setBoardEnd(12, 05, 2013);
		Assert.assertEquals(true, dog.boarding(4, 02, 2012));
	}

	@Test
	void testBoardingDateIsNotInLimitsDog() {
		Dog dog = new Dog("Spot", "Susan", "White", "Medium");
		dog.setBoardStart(7, 05, 2011);
		dog.setBoardEnd(12, 05, 2013);
		Assert.assertEquals(false, dog.boarding(6, 20, 2016));
	}

	@Test
	void testBoardingDateisValidDog() {
		Dog dog = new Dog("Spot", "Susan", "White", "Medium");
		dog.setBoardStart(7, 05, 2011);
		dog.setBoardEnd(12, 05, 2013);
		Assert.assertEquals(false, dog.boarding(13, 10, 2014));
		Assert.assertEquals(false, dog.boarding(3, 32, 2014));
		Assert.assertEquals(false, dog.boarding(3, 10, 201));
	}

}
