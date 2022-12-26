package tw.william.leetcode.leet.easy;

public class PlusOne {

	public static void main(String[] args) {

		int[] arr = { 9,9 };
		
		for (int i = 10; i >= 0; i--) {
			System.out.println("i: "+i);
		}

		for (int i : plusOne(arr)) {

			System.out.println(i);

		}
		
	}

	static int[] plusOne(int[] digits) {
		
		for(int i = digits.length - 1; i >= 0; i--) {
			
			if(digits[i]<9) {
				++digits[i];
				return digits;
			}
			
			digits[i] = 0;
			
		}
		
		int[] ans = new int[digits.length +1];
		
		ans[0] = 1;
		
		return ans;

	}

}
