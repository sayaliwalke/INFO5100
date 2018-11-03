package Question4;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	public List<Interval> merge(List<Interval> intervals) {
		List<Interval> newlist = new ArrayList<Interval>();
		for (int i = 0; i < intervals.size() - 1; i++) {
			boolean isoverlapping = isOverlapping(intervals.get(i), intervals.get(i + 1));
			if (isoverlapping) {
				int start = intervals.get(i).getLowerBound();
				int end = intervals.get(i + 1).getUpperBound();
				newlist.add(new Interval(start, end));
			}
		}
		String temp = "";
		for (int i = 0; i < newlist.size(); i++) {
			temp = String.valueOf(newlist.get(i).getLowerBound()) + " ";
			temp = temp + String.valueOf(newlist.get(i).getUpperBound());
			System.out.println(temp);
		}
		return newlist;

	}


	private boolean isOverlapping(Interval interval1, Interval interval2) {

		if (interval1.getUpperBound() >= interval2.getLowerBound()) {
			System.out.println("Overlapping");
			return true;
		}

		return false;
	}
}
