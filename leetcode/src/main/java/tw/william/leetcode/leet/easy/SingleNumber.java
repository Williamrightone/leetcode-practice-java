package tw.william.leetcode.leet.easy;

public class SingleNumber {

	public static void main(String[] args) {

		int[] nums = { 2, 2, 1 };

		System.out.println(singleNumber(nums));

	}

	static int singleNumber(int[] nums) {

		int single = 0;

		for (int e : nums)

			single ^= e;

		return single;
	}

}
