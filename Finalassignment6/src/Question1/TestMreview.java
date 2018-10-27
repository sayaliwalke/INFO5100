
package Question1;

public class TestMreview {

	public static void main(String[] args) {
		Mreview mreview = new Mreview("Kill Bill", 3);
		mreview.addRating(3);
		mreview.addRating(4);
		mreview.addRating(4);
		System.out.println(mreview);
		System.out.println("The average rating is " + mreview.aveRating());
	}
}
