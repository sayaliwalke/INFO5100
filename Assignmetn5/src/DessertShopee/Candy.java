package DessertShopee;

public class Candy extends DessertItem {
	double weight;
	double pricePerPound;
	DessertShopee shopee = new DessertShopee();

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPricePerPound() {
		return pricePerPound;
	}

	public void setPricePerPound(double pricePerPound) {
		this.pricePerPound = pricePerPound;
	}

	public Candy() {

	}

	public Candy(String name, double weight, double pricePerPound) {
		super.name = name;
		this.weight = weight;
		this.pricePerPound = pricePerPound;

	}

	public String toString() {
		String displayItem = weight + " lbs. @  " + pricePerPound + " /lb.\n" + super.getName() + "\t\t\t"
				+ shopee.cents2dollarsAndCents(getCost()) + "\n";
		return displayItem;

	}

	public int getCost() {
		int cost = (int) Math.round(((weight * pricePerPound) * 100.0) / 100.0);

		return cost;
	}
}
