package Question5;

public class Solution {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {

		int m = nums1.length;
		int n = nums2.length;
		int i = 0;
		int j = 0;
		int k = 0;
		int merge[] = new int[n + m];
		while (i < m) {
			merge[k] = nums1[i];
			i++;
			k++;
		}
		while (j < n) {
			merge[k] = nums2[j];
			j++;
			k++;
		}
		for (int index = 0; index < merge.length - 1; index++)
			for (int NewIndex = 0; NewIndex < merge.length - 1; NewIndex++) {
				if (merge[NewIndex] > merge[NewIndex + 1]) {
					int temp = merge[NewIndex + 1];
					merge[NewIndex + 1] = merge[NewIndex];
					merge[NewIndex] = temp;
				}
			}
		double medianValue = 0;
		if (merge.length % 2 == 0) {
			medianValue = ((double) merge[merge.length / 2] + (double) merge[merge.length / 2 - 1]) / 2;
		} else {
			medianValue = (double) merge[merge.length / 2];
		}
		System.out.println("The median value is:" + medianValue);
		return medianValue;

	}

}
