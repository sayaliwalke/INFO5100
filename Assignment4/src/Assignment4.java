import java.util.Arrays;

public class Assignment4 {
	/*
	 * Given a string, find the first non-repeating character in it and return it's
	 * index. If it doesn't exist, return -1.
	 */
	public int firstUniqChar(String s) {
		if(s==null)
		{
			return -1;
		}
		char count[] = new char[57];
		
		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 65]++;

		}
		int index = -1;

		for (int i = 0; i < s.length(); i++) {
			if (count[s.charAt(i) - 65] == 1) {
				index = i;
				break;
			}

		}
		if (index != -1) {
			System.out.println("\nThe first non repeating character is " + s.charAt(index) + " at " + index);
		} else {
			System.out.println("\nThe string contain all repeating characters hence index is  " + index);
		}
		
		return index;
	}

	/*
	 * Given a non-negative integer num, repeatedly add all its digits until the
	 * result has only one digit. Input: 38 Output: 2 Explanation: The process is
	 * like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
	 */
	public int addDigits(int n) {
		int sum = 0;
		String s = String.valueOf(n);
		for (int i = 0; i < s.length(); i++) {
			sum = sum + (s.charAt(i) - '0');
		}
		if (sum < 10) {

			System.out.println("\nThe single digit sum is " + sum);
			return sum;
		} else {
			return addDigits(sum);
		}
	}

	/*
	 * Given an array nums, write a function to move all 0's to the end of it while
	 * maintaining the relative order of the non-zero elements. Input: [0,1,0,3,12]
	 * Output: [1,3,12,0,0]
	 */
	public void moveZeroes(int[] nums) {
		int Newnums[] = new int[nums.length];
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				Newnums[j] = nums[i];
				j++;
			}
		}
		for (int i = j; i < (nums.length - Newnums.length); i++) {
			Newnums[j] = 0;
			j++;
		}

		System.out.println(" \nThe new array formed by moving zeros to the end is " + Arrays.toString(Newnums));
	}

	/*
	 * Given a string s, find the longest palindromic substring in s. You may assume
	 * that the maximum length of s is 1000. Input: "babad" Output: "bab" Note:
	 * "aba" is also a valid answer.
	 */
	public String longestPalindrome(String s) {

		int rightIndex = 0, leftIndex = 0;
		String currentString = "", longestString = "";
		for (int centerIndex = 1; centerIndex < s.length() - 1; centerIndex++) {
			leftIndex = centerIndex - 1;
			rightIndex = centerIndex + 1;
			while (leftIndex >= 0 && rightIndex < s.length()) {
				if (s.charAt(leftIndex) != s.charAt(rightIndex)) {
					break;
				}
				currentString = s.substring(leftIndex, rightIndex + 1);
				longestString = currentString.length() > longestString.length() ? currentString : longestString;
				leftIndex--;
				rightIndex++;
			}
		}
		System.out.println("\n The longest palindromic string in the given string is " + longestString +"\n");
		return longestString;
	}

	/*
	 * You are given an n x n 2D matrix representing an image. Rotate the image by
	 * 90 degrees (clockwise). Given input matrix = [ [1,2,3], [4,5,6], [7,8,9] ],
	 * rotate the input matrix in-place such that it becomes: [ [7,4,1], [8,5,2],
	 * [9,6,3] ],
	 */
	public int[][] rotate(int[][] matrix) {

		int n = matrix.length;

		for (int rows = 0; rows < n / 2; rows++) {
			for (int cols = 0; cols < Math.ceil(((double) n) / 2); cols++) {
				int temp = matrix[rows][cols];
				matrix[rows][cols] = matrix[n - 1 - cols][rows];
				matrix[n - 1 - cols][rows] = matrix[n - 1 - rows][n - 1 - cols];
				matrix[n - 1 - rows][n - 1 - cols] = matrix[cols][n - 1 - rows];
				matrix[cols][n - 1 - rows] = temp;
			}
		}
		System.out.println("The new matrix formed by rotating is ");
		for (int rows = 0; rows < n; rows++) {
			for (int cols = 0; cols < n; cols++) {
				System.out.print(matrix[rows][cols] + " ");
			}
			System.out.println("\n");
		}
		return matrix;
	}

	public static void main(String Arg[]) {
		Assignment4 a = new Assignment4();
		
		a.firstUniqChar("ddaakk");
		a.addDigits(7654);
		a.moveZeroes(new int[] { 0, 1, 0, 3, 12 });
		a.longestPalindrome("jklmnobababababaaaadadadcasdhgfdadada");
		// int[][] matrix1 = new int[rows][cols];
		int[][] arr = { { 1, 2, 3, 11 }, { 4, 5, 6, 12 }, { 7, 8, 9, 13 }, { 14, 15, 16, 17 } };
		a.rotate(arr);

	}

}
