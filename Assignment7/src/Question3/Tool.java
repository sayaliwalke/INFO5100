package Question3;

public class Tool {
	private int Strength;
	private char type;

	public int getStrength() {
		return Strength;
	}

	public void setStrength(int strength) {
		Strength = strength;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	Tool(int Strength) {
		this.Strength = Strength;
	}

	Tool(char type) {
		this.type = type;
	}

}
