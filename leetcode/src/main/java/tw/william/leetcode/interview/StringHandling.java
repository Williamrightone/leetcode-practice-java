package tw.william.leetcode.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class StringHandling {

	public static void main(String[] args) {

		/**
		 * 移除所有符號 反轉句子 計算各單字出現次數 找出第一與第二多的單字與次數
		 */

		execute("I think, you are the most most most beautiful girl I ever seen.");
	}

	static void execute(String inputString) {

		String[] splitStrin = inputString.replace(",", "").replace(".", "").split(" ");

		List<String> reversedStringList = new ArrayList<>();

		Map<String, Integer> hm = new HashMap<>();

		for (String word : splitStrin) {

			reversedStringList.add(0, word);

			if (hm.containsKey(word)) {

				int appearNum = hm.get(word) + 1;
				hm.put(word, appearNum);

			} else {
				hm.put(word, 1);
			}
		}

		for (String word : reversedStringList) {
			System.out.print(word);
		}
		
		System.out.println();
		System.out.println();

		Iterator hmSet = hm.keySet().iterator();

		while (hmSet.hasNext()) {
			
			String key = (String) hmSet.next();

			System.out.println(key + "(" + hm.get(key) + ")");

		}
		
		System.out.println();
		
		
		int maxNum = 0;
		
		hmSet = hm.keySet().iterator();
		
		while(hmSet.hasNext()) {
			String key = (String) hmSet.next();
			
			if(maxNum < hm.get(key)) {
				maxNum = hm.get(key);
			}
		}
		
		hmSet = hm.keySet().iterator();
		
		while(hmSet.hasNext()) {
			String key = (String) hmSet.next();
			
			if(maxNum == hm.get(key)) {
				System.out.println("Top Word: " + key + "(" + maxNum + ")");
			}
		}
		
		int secondNum = 0;
		
		hmSet = hm.keySet().iterator();
		
		while(hmSet.hasNext()) {
			String key = (String) hmSet.next();
			
			if(secondNum < hm.get(key) && hm.get(key) < maxNum) {
				secondNum = hm.get(key);
			}
		}
		
		hmSet = hm.keySet().iterator();
		
		while(hmSet.hasNext()) {
			String key = (String) hmSet.next();
			
			if(secondNum == hm.get(key)) {
				System.out.println("Second Word: " + key + "(" + secondNum + ")");
			}
		}
		

	}

}
