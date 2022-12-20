package tw.william.leetcode.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NameSorting {

	public static void main(String[] args) {
		
		/**
		 * 將單字依照 A~Z 排序
		 */

		String[] names = { "Aws", "RedHat", "Google", "Azure" };

		List<String> resultList = execute(names);

		for (String name : resultList) {
			System.out.println(name);
		}

	}

	static List<String> execute(String[] names) {

		List<String> resultList = new ArrayList<>();

		for (String name : names) {

			resultList.add(name);

		}

		Collections.sort(resultList, new Comparator<String>() {

			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}

		});

		return resultList;
	}

}
