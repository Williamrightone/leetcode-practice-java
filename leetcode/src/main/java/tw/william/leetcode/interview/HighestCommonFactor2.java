package tw.william.leetcode.interview;

public class HighestCommonFactor2 {

	public static void main(String[] args) {

		int num = 9;

		System.out.print(num + "=");

		for (int i = 2; i < num; i++) {

			while (num != i) {

				if(num % i ==0) {
					
					System.out.print(i + "*");
					
					num = num /i;
					
				}else {
					break;
				}
				
				
			}

		}

		System.out.println(num);
		
	}
	
}
