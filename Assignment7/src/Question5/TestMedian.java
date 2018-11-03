package Question5;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestMedian {
	private static final double DELTA = 1e-15;
	@Test
	void testEvenArrays() {
		Solution solution=new Solution();
		int[] nums1= {3,1,2};
		int[] nums2= {6,5,4};
		Assert.assertEquals(3.5, solution.findMedianSortedArrays(nums1, nums2),DELTA);
	}
	@Test
	void testOddArrays() {
		Solution solution=new Solution();
		int[] nums1= {3,2,1};
		int[] nums2= {5,4};
		Assert.assertEquals(3, solution.findMedianSortedArrays(nums1, nums2),DELTA);
	}


}
