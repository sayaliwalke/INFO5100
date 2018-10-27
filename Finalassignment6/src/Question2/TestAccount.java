package Question2;

public class TestAccount {

	public static void main(String[] args) {
		CheckingAccount acc = new CheckingAccount("Sayali", "Walke", 500);
		System.out.println(acc);
		acc.DebitTransaction(400);
		System.out.println(acc);
		acc.CreditTransaction(50);
		System.out.println(acc);

	}

}
