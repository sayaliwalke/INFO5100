package DessertShopee;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class TestCase {
	Checkout checkout;

	// Cookie cookie=new Cookie();
	@Test
	void testEnteritem() {
		checkout = new Checkout();
		checkout.enterItem(new Candy("Cadbury", 2, 50));
		Assert.assertEquals(1, checkout.getVec().size());
	}

	@Test
	void testtotalCost() {
		checkout = new Checkout();
		checkout.enterItem(new Candy("Cadbury", 2, 50));
		int total = checkout.totalCost();
		Assert.assertEquals(100, total);
	}

	@Test
	void testtotalTax() {
		checkout = new Checkout();
		checkout.enterItem(new Candy("Cadbury", 2, 50));
		int total = checkout.totalCost();
		int tax = checkout.totalTax();
		Assert.assertEquals(7, tax);
	}

	@Test
	void testcalculate() {
		checkout = new Checkout();
		checkout.enterItem(new Candy("Cadbury", 2, 50));
		int total = checkout.totalCost();
		int tax = checkout.totalTax();
		String cal = checkout.CalculateTotal();
		Assert.assertEquals("1.7", cal);
	}

}
