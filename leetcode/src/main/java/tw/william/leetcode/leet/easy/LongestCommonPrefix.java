package tw.william.leetcode.leet.easy;

public class LongestCommonPrefix {

	public static void main(String[] args) {

		String[] a = { "flower", "flow", "flight" };

		System.out.println(longestCommonPrefix(a));

		String[] b = { "dog", "racecar", "car" };

		System.out.println(longestCommonPrefix(b));
	}

	static String longestCommonPrefix(String[] strs) {

		String firstString = strs[0];

		for (int i = 1; i < strs.length; i++) {

			while (strs[i].indexOf(firstString) != 0) {
				firstString = firstString.substring(0, firstString.length() - 1);
			}

		}

		return firstString;
	}

}
