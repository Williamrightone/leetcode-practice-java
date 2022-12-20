package tw.william.leetcode.interview;

import java.util.ArrayList;
import java.util.List;

public class FindPrimeNumber {

	public static void main(String[] args) {

		/**
		 * 給定二非負數字，找出兩數字區間的所有質數
		 */

		System.out.println(calPrimes(2, 100));

	}

	static List<Integer> calPrimes(int startNum, int endNum) {

		List<Integer> primeList = new ArrayList<Integer>();

		for (int i = startNum; i <= endNum; i++) {

			boolean isPrime = true;

			for (int n = 2; n < i; n++) {

				if (i % n == 0) {

					isPrime = false;
					break;
					
				}

			}

			if(isPrime) {
				primeList.add(i);				
			}
			
			
		}

		return primeList;
	}

}
