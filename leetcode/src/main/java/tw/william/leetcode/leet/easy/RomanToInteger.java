package tw.william.leetcode.leet.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {

		System.out.println(romanToInt("XII"));

	}

	static int romanToInt(String s) {

		int result = 0;

		if (!s.isBlank() || !s.isEmpty()) {

			Map<String, Integer> hm = new HashMap<String, Integer>();

			hm.put("I", 1);
			hm.put("V", 5);
			hm.put("X", 10);
			hm.put("L", 50);
			hm.put("C", 100);
			hm.put("D", 500);
			hm.put("M", 1000);

			for (int i = 0; i < s.length(); i++) {

				int num = hm.get(String.valueOf(s.charAt(i)));

				if (i != 0 && hm.get(String.valueOf(s.charAt(i - 1))) < hm.get(String.valueOf(s.charAt(i)))) {
					num = num - hm.get(String.valueOf(s.charAt(i - 1))) * 2;
				}

				result = result + num;

			}

		}
		return result;
	}

}
