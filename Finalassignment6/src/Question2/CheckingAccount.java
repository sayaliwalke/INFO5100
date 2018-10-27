package Question2;

public class CheckingAccount extends Account {
	static private double chargeFee = 10;
	static private double minBalance = 200;

	public CheckingAccount(String fname, String lname, double cb) {
		super(fname, lname, cb);
	}

	@Override
	public double DebitTransaction(double debitAmount) {

		double balance = super.DebitTransaction(debitAmount);
		if (balance == 0.0) {
			return 0;
		}
		if (balance < minBalance) {
			ChargeFee();
		}

		return curBalance;
	}

	private void ChargeFee() {
		curBalance = curBalance - chargeFee;
	}

	@Override
	public double CreditTransaction(double creditAmount) {
		double balance = super.CreditTransaction(creditAmount);
		if (balance < minBalance) {
			ChargeFee();

		}
		return curBalance;
	}

}
