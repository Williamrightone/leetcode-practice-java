package tw.william.leetcode.interview;

import java.util.ArrayList;
import java.util.List;

public class StringToFormula {

	public static void main(String[] args) {

		String formulas = "38 + 5 + 3 - 16 =";

		System.out.println(execute(formulas));

	}

	static int execute(String formulas) {

		String modString = formulas.replace(" ", "").replace("=", "");

		List<String> symList = new ArrayList<>();

		for (int i = 0; i < modString.length(); i++) {
			if (modString.substring(i, i + 1).equals("+") || modString.substring(i, i + 1).equals("-")) {
				symList.add(modString.substring(i, i + 1));
			}
		}

//		System.err.println(symList);

		String[] numbers = modString.split("\\+|\\-");

//		for (String str : numbers) {
//			System.out.println(str);
//		}

		int result = 0;

		for (int i = 0; i < numbers.length; i++) {

			if (i == 0) {
				result = Integer.valueOf(numbers[i]);
//				System.out.println("R:"+result);
			} else {

					if (symList.get(i-1).equals("+")) {
						result = result + Integer.valueOf(numbers[i]);
//						System.out.println("R:"+result);
					} else if (symList.get(i-1).equals("-")) {
						result = result - Integer.valueOf(numbers[i]);
//						System.out.println("R:"+result);
					}

			}
		}

		return result;
	}

}