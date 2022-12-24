package tw.william.leetcode.leet.easy;

import java.util.Arrays;
import java.util.Collections;

public class IsPalindrome {

	public static void main(String[] args) {

		int inputNum = 1000021;

		System.out.println(isPalindrome(inputNum));

	}

	//Runtime 13 ms 42 MB
	static boolean isPalindrome(int x) {

		String inputNum = String.valueOf(x);

		char[] charArr = inputNum.toCharArray();

		StringBuffer sb = new StringBuffer();

		boolean isPalindrome = false;

		for (int i = charArr.length - 1; i >= 0; i--) {
			sb.append(charArr[i]);
		}

		if (inputNum.equals(sb.toString())) {
			isPalindrome = true;
		} else {

			isPalindrome = false;
		}

		return isPalindrome;
	}

	// Memory 42 MB, Runtime 33 ms
//	static boolean isPalindrome(int x) {
//
//		String inputNum = String.valueOf(x);
//
//		String[] stringArrRev = inputNum.split("");
//
//		Collections.reverse(Arrays.asList(stringArrRev));
//
//		StringBuffer sb = new StringBuffer();
//		
//		boolean isPalindrome = false;
//
//		for (String str : stringArrRev) {
//			sb.append(str);
//		}
//
//		if (inputNum.equals(sb.toString())) {
//			isPalindrome = true;
//		} else {
//
//			isPalindrome = false;
//		}
//		
//		return isPalindrome;
//	}


}
