package Question3;

import java.util.Date;

public class Dog extends Pet implements Boardable {
	private String Size;
	private int sday, sMonth, sYear, eday, eMonth, eYear;

	Dog(String name, String ownerName, String color, String hairLength) {
		super(name, ownerName, color);
		this.Size = hairLength;
	}

	@Override
	public void setBoardStart(int month, int day, int year) {
		this.sMonth = month;
		this.sday = day;
		this.sYear = year;

	}

	@Override
	public void setBoardEnd(int month, int day, int year) {

		this.eMonth = month;
		this.eday = day;
		this.eYear = year;

	}

	@Override
	public boolean boarding(int month, int day, int year) {

		if (month < 1 || month > 12) {
			System.out.println("Invalid month");
			return false;
		}
		if (day < 1 || day > 31) {
			System.out.println("Invalid date");
			return false;
		}
		if (String.valueOf(year).length() != 4) {
			System.out.println("Invalid year");
			return false;
		}
		Date StartDate = convertDate(sMonth, sday, sYear);
		Date endDate = convertDate(eMonth, eday, eYear);
		Date givenDate = convertDate(month, day, year);

		if (givenDate.before(endDate) && givenDate.after(StartDate)) {
			return true;
		}
		return false;
	}

	public String getSize() {
		return Size;
	}

	public String toString() {
		String Display = "\n" + this.getClass().getSimpleName() + ":\n" + super.toString() + "\nSize: " + getSize();
		return Display;
		/*
		 * DOG: Spot owned by Susan Color: white Sex: spayed Size: medium
		 */
	}

}
