package Question4;

import java.util.ArrayList;
import java.util.List;

public class testMergeIntervals {

	public static void main(String[] args) {
		List<Interval> intervals=new ArrayList<Interval>();
		Solution solution=new Solution();

		 intervals.add(new Interval(1,3));
		 intervals.add(new Interval(2,4));
		 intervals.add(new Interval(5,7));
		 intervals.add(new Interval(6,8));
		 intervals.add(new Interval(11,13));
		 intervals.add(new Interval(14,16));
		 
		solution.merge(intervals);
		

	}

}
