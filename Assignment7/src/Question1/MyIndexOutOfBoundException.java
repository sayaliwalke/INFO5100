package Question1;

public class MyIndexOutOfBoundException extends Exception {
	int upperBound;
	int lowerBound;
	int index;

	public MyIndexOutOfBoundException(int upper, int lower, int index) {
		this.upperBound = upper;
		this.lowerBound = lower;
		this.index = index;

	}

	public String toString() {
		String display;
		display = "Error Message: Index:" + index + " but Lower bound: " + lowerBound + " Upper bound: " + upperBound;
		return display;

	}

}
