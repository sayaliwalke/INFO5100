package DessertShopee;

import java.util.ArrayList;
import java.util.List;

public class DessertShopee {
	final double percentTaxRate = 6.5;
	final String nameOfShopee = "M & M Dessert Shopee";
	final int sizeOfItem = 20;
	final int width = 44;

	public double getPercentTaxRate() {
		return percentTaxRate;
	}

	public String getNameOfShopee() {
		return nameOfShopee;
	}

	public int getSizeOfItem() {
		return sizeOfItem;
	}

	public int getWidth() {
		return width;
	}

	public String splitToNChar(String text, int size) {
		List<String> parts = new ArrayList<>();

		int length = text.length();
		for (int i = 0; i < length; i += size) {
			parts.add(text.substring(i, Math.min(length, i + size)) + "\n");
		}
		String display = "";
		for (int i = 0; i < parts.size(); i++) {
			display = display + parts.get(i);

		}
		return display;
	}

	public String cents2dollarsAndCents(int amountInCents) {
		int cents = amountInCents % 100;
		int dollars = (amountInCents - cents) / 100;
		return dollars + "." + cents;
	}
}
