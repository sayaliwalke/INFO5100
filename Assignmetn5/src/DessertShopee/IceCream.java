package DessertShopee;

public class IceCream extends DessertItem {
	double priceOfIcecream;
	DessertShopee shopee = new DessertShopee();

	public double getPrice() {
		return priceOfIcecream;
	}

	public void setPrice(double priceOfIcecream) {
		this.priceOfIcecream = priceOfIcecream;
	}

	public IceCream() {

	}

	public IceCream(String name, double priceOfIcecream) {
		super.name = name;
		this.priceOfIcecream = priceOfIcecream;
	}

	public int getCost() {
		return (int) Math.round((priceOfIcecream * 100.0) / 100.0);
	}

	public String toString() {
		String displayItem = super.getName() + "\t\t\t" + shopee.cents2dollarsAndCents(getCost()) + "\n";
		return displayItem;

	}
}
