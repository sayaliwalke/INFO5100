package Question2;

public class Account {
	protected String FirstName;
	protected String LastName;
	protected double curBalance;

	public Account(String fname, String lname, double curbalance) {
		this.FirstName = fname;
		this.LastName = lname;
		this.curBalance = curbalance;
	}

	public String getAcctType() {
		return this.getClass().getSimpleName();
	}

	public double DebitTransaction(double debitAmount) {
		if (debitAmount < 0.0) {
			System.out.println("Invalid amount");
			return 0;
		}
		if (debitAmount > curBalance) {
			System.out.println("Current balance is less than the amount to be debited");
			return 0;
		}
		curBalance = curBalance - debitAmount;

		return curBalance;
	}

	public double CreditTransaction(double creditAmount) {
		if (creditAmount < 0) {
			System.out.println("Invalid amount");
			return 0;
		}
		curBalance = curBalance + creditAmount;

		return curBalance;
	}

	public String toString() {
		String Display = "\nAccount Name: " + FirstName + " " + LastName + " " + ", Account Type: " + getAcctType()
				+ ", Balance: " + String.valueOf(curBalance);
		return Display;

	}
}
