package DessertShopee;

public class Cookie extends DessertItem {
	int number;
	double pricePerDozen;
	DessertShopee shopee = new DessertShopee();

	public Cookie(String name, int number, int pricePerDozen) {
		super.name = name;
		this.number = number;
		this.pricePerDozen = pricePerDozen;
	}

	public Cookie() {

	}

	public double getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getPricePerDozen() {
		return pricePerDozen;
	}

	public void setPricePerDozen(double pricePerDozen) {
		this.pricePerDozen = pricePerDozen;
	}

	public int getCost() {
		int cost = (int) Math.round(number * pricePerDozen / 12);

		return cost;
	}

	public String toString() {
		String displayItem = number + " @ " + pricePerDozen + " /dz.\n" + super.getName() + "\t\t\t"
				+ shopee.cents2dollarsAndCents(getCost()) + "\n";
		return displayItem;

	}

}
