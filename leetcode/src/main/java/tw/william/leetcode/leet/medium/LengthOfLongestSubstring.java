package tw.william.leetcode.leet.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LengthOfLongestSubstring {

	public static void main(String[] args) {

		System.out.println(lengthOfLongestSubstring("bbabcabc"));

	}

	static int lengthOfLongestSubstring(String s) {

		
		int stringNum = 0;
		
		Map<Character, Integer> hm = new HashMap<>();
		
		for (int j = 0, i = 0; j < s.length(); j++) {
		
			if (hm.containsKey(s.charAt(j))) {
				i = Math.max(hm.get(s.charAt(j)), i);
			}
			
			stringNum = Math.max(stringNum, j - i + 1);
			hm.put(s.charAt(j), j + 1);
		}
		
		
		
		return stringNum;
		
	}

}
