package Question4;

public class Interval {
	private int UpperBound;
	private int LowerBound;

	public int getUpperBound() {
		return UpperBound;
	}

	public void setUpperBound(int upperBound) {
		UpperBound = upperBound;
	}

	public int getLowerBound() {
		return LowerBound;
	}

	public void setLowerBound(int lowerBound) {
		LowerBound = lowerBound;
	}

	public Interval(int i, int j) {
		this.LowerBound = i;
		this.UpperBound = j;
	}

	public Interval() {

	}

}
