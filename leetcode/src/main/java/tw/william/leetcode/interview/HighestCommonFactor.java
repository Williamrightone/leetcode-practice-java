package tw.william.leetcode.interview;

public class HighestCommonFactor {

	public static void main(String[] args) {

		int[] nums = { 7, 28, 35 };

		int result = execute(nums);

		System.out.println(result);

	}

	static int execute(int[] nums) {
		int result = 0;

		if (nums.length == 1) {
			return nums[0];
		}

		if (nums.length > 1) {
			result = getHcf(nums[0], nums[1]);
			for (int i = 2; i < nums.length; i++) {
				result = getHcf(result, nums[i]);
			}

		}

		return result;

	}

	static int getHcf(int a, int b) {

		if (b > a) {

			return getHcf(b, a);
		}

		if (b == 0) {
			return a;
		} else {
			return getHcf(b, a % b);
		}

	}

}
