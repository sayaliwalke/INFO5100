package Question2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class TestCaseQ2 {

	@Test
	void testCheckingAccountDebit() {
		CheckingAccount check = new CheckingAccount("John", "Wlliams", 600);
		Assert.assertEquals(400.0, check.DebitTransaction(200));
		/* $250 will be deducted but balance is below
		  minimum value hence $10 fee is charged */
		Assert.assertEquals(140.0, check.DebitTransaction(250)); 
	}
	@Test
	void testDebitMoreThanBalance() {
		CheckingAccount check = new CheckingAccount("John", "Wlliams", 100);
		Assert.assertEquals(0.0, check.DebitTransaction(200));
		
	}
	@Test
	void testNegativeAmount() {
		CheckingAccount check = new CheckingAccount("John", "Wlliams", 100);
		Assert.assertEquals(0.0, check.DebitTransaction(-20.0));
	}


	@Test
	void testCheckingAccountCredit() {
		CheckingAccount check = new CheckingAccount("John", "Wlliams", 100);
		/* $50 will be added but balance is below
        minimum value hence deduct $10*/
		Assert.assertEquals(140.0,check.CreditTransaction(50));                  
		Assert.assertEquals(400.0, check.CreditTransaction(260));
	}

	@Test
	void testGetAccountType() {
		CheckingAccount check = new CheckingAccount("John", "Wlliams", 100);

		Assert.assertEquals("CheckingAccount", check.getAcctType());

	}

}
