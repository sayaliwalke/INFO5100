package Question1;

public class ExceptionTrial {
	public static void main(String[] args) throws Exception {

		int[] nums = new int[10];
		int b = 11;
		try {
			int a = nums[b];
		} catch (ArrayIndexOutOfBoundsException e) {
			throw new MyIndexOutOfBoundException(nums.length, 0, b);

		}
	}

}
