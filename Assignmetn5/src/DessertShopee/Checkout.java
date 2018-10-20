package DessertShopee;

import java.util.Vector;

public class Checkout {
	private Vector<DessertItem> vec;

	public Vector<DessertItem> getVec() {
		return vec;
	}

	DessertShopee Shop;

	public Checkout() {
		Shop = new DessertShopee();
		vec = new Vector<DessertItem>();
	}

	public int numberOfItems() {
		return vec.size();
	}

	public void enterItem(DessertItem Item) {
		vec.add(Item);
	}

	public void clear() {
		vec.clear();
	}

	public int totalCost() {
		int totalcost = 0;
		for (int i = 0; i < vec.size(); i++) {
			int temp = (vec.get(i).getCost());
			totalcost = totalcost + temp;
		}
		return totalcost;
	}

	public int totalTax() {
		int tax = (int) Math.round(Shop.percentTaxRate) * (totalCost() / 100);
		return tax;
	}

	public String CalculateTotal() {
		int totalAmount = totalCost() + totalTax();
		String total = Shop.cents2dollarsAndCents(totalAmount);
		return total;
	}

	public String toString() {

		String display = "\t\t\t " + Shop.getNameOfShopee() + "\n\t\t------------------------------------\n";
		for (int i = 0; i < vec.size(); i++) {
			String temp = (vec.get(i).toString());
			display = display + temp;
		}

		display = display + "\nTotal Tax\t\t\t\t" + Shop.cents2dollarsAndCents(totalTax());
		display = display + "\nTotal Cost\t\t\t\t" + CalculateTotal();

		return display;
	}

}
