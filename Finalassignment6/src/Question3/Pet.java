package Question3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pet {
	private String petName;
	private String ownerName;
	private String colour;
	protected int sex;

	public static final int MALE = 1, FEMALE = 2, SPAYED = 3, NEUTERED = 4;

	static enum Sex {
		MALE, FEMALE, SPAYED, NEUTERED
	}

	public Pet(String name, String ownerName, String color) {
		this.petName = name;
		this.ownerName = ownerName;
		this.colour = color;
	}

	public String getPetName() {
		return petName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getColour() {
		return colour;
	}

	public void setSex(int sexid) {
		this.sex = sexid;
	}

	public String getSex() {
		switch (sex) {
		case MALE:
			return Sex.MALE.name();
		case FEMALE:
			return Sex.FEMALE.name();
		case SPAYED:
			return Sex.SPAYED.name();
		case NEUTERED:
			return Sex.NEUTERED.name();
		}
		return null;
	}

	protected Date convertDate(int month, int day, int year) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String dateInString = String.valueOf(day) + "-" + String.valueOf(month) + "-" + String.valueOf(year);
		Date date = null;
		try {
			date = sdf.parse(dateInString);
		} catch (ParseException e) {

			e.printStackTrace();
		}

		return date;
	}

	public String toString() {
		String Display = getPetName() + " owned by " + getOwnerName() + "\nColor: " + getColour() + "\nSex: "
				+ getSex();
		return Display;
	}

}
