package DessertShopee;

public class Sundae extends IceCream {

	double costOfTopping;
	String nameOfTopping;
	DessertShopee shopee = new DessertShopee();

	public double getCostOfTopping() {
		return costOfTopping;
	}

	public void setCostOfTopping(double costOfTopping) {
		this.costOfTopping = costOfTopping;
	}

	public Sundae() {

	}

	public Sundae(String nameOfIcecream, double priceOfIcecream, String nameOfTopping, double costOfTopping) {
		super.name = nameOfIcecream;
		this.nameOfTopping = nameOfTopping;
		super.priceOfIcecream = priceOfIcecream;
		this.costOfTopping = costOfTopping;

	}

	public int getCost() {

		int cost = super.getCost() + (int) Math.round((costOfTopping * 100.0) / 100);
		return cost;
	}

	public String toString() {

		String displayItem = nameOfTopping + " with " + super.getName();
		String displayName = shopee.splitToNChar(displayItem, shopee.sizeOfItem);

		displayItem = displayName.toString()
				+ String.format("%" + shopee.width + ".2f", Double.parseDouble(shopee.cents2dollarsAndCents(getCost())))
				+ "\n";

		return displayItem;
	}

}
