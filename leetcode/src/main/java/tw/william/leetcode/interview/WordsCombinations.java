package tw.william.leetcode.interview;

import java.util.ArrayList;
import java.util.List;

public class WordsCombinations {

	public static void main(String[] args) {

		List<String> strings = new ArrayList<String>();
		strings.add("A");
		strings.add("B");
		strings.add("C");
		strings.add("D");

		List<String> stringList = execute(strings);

		for (String str : stringList) {
			System.out.println(str);
		}

	}

	public static List<String> execute(List<String> strings) {
		List<String> result = new ArrayList<String>();

		int StringsNum = (int) Math.pow(2, strings.size()) - 1;

		for (int i = 1; i <= StringsNum; i++) {

			String binString = Integer.toBinaryString(i);

			StringBuffer tempSb = new StringBuffer(binString);

			if (binString.length() < strings.size()) {
				tempSb.insert(0, "0");
			}

			tempSb.reverse();

			String rtnString = "";

			for (int j = 0; j < tempSb.length(); j++) {

				if(tempSb.subSequence(j, j+1).equals("1")) {
					rtnString = rtnString + strings.get(j);
				}
				
			}
			
			result.add(rtnString);

		}

		return result;
	}

}
