package Question1;

import java.util.ArrayList;

public class Mreview implements Comparable<Mreview> {
	private String title;
	private ArrayList<Integer> ratings;
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ArrayList<Integer> getRatings() {
		return ratings;
	}

	public void setRatings(ArrayList<Integer> ratings) {
		this.ratings = ratings;
	}
     public Mreview()
     {
     }
	public Mreview(String title) {
		this.title = title;
	}

	public Mreview(String title, int firstRating) {
		this.title = title;
		ratings = new ArrayList();
		ratings.add(firstRating);

	}

	public void addRating(int r) {

		ratings.add(r);
	}

	public double aveRating() {
		int sum = 0;
		for (int i = 0; i < ratings.size(); i++) {
			sum = sum + (ratings.get(i));
		}
		double average = (double) sum / (double) ratings.size();
		return (Math.round(average*10.0))/10.0;
	}

	public int numRatings() {
		int size = ratings.size();
		return size;
	}

	public String displayRatings() {
		String Display = "";
		for (int i = 0; i < numRatings(); i++) {
			Display = Display + " " + ratings.get(i);
		}
		return Display;
	}

	@Override
	public boolean equals(Object o) {
		Mreview newTitle = (Mreview) o;
		return title.equals(newTitle.title);
	}

	public java.lang.String toString() {

		String displayResult = " The title of the movie is " + title + " and the ratings are \n" + displayRatings()
				+ "\n" + "Total number of ratings are " + numRatings();
		return displayResult;
	}

	@Override
	public int compareTo(Mreview mreview) {
		
		return title.compareTo(mreview.title);

	}
}
