package Question4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class testMergeIntervalsTest {
	List<Interval> intervals=new ArrayList<Interval>();
	Solution solution=new Solution();

	
	 //intervals.add(new Interval(5,7));
	 //intervals.add(new Interval(6,8));
	//solution.add(new Interval(11,12));
	//solution.add(new Interval(13,14));
    
	@Test
	void testMerge() {
		 intervals.add(new Interval(1,3));
		 intervals.add(new Interval(2,4));
		 intervals.add(new Interval(5,7));
		 intervals.add(new Interval(6,8));
		 List<Interval> list=solution.merge(intervals);
		
		Assert.assertEquals(1,list.get(0).getLowerBound());;
		Assert.assertEquals(4,list.get(0).getUpperBound());;
		Assert.assertEquals(5,list.get(1).getLowerBound());;
		Assert.assertEquals(8,list.get(1).getUpperBound());;
		
	}
	@Test
	void testMergeNotOverlapping() {
		 intervals.add(new Interval(11,12));
		 intervals.add(new Interval(13,14));
		
		 List<Interval> list1=solution.merge(intervals);
		
		Assert.assertEquals(true,list1.isEmpty());;
		
	}


}
