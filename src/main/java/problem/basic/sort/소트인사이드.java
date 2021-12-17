package problem.basic.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class 소트인사이드 {
	public static void main(String[] args) {
		/**
		 * level 1
		 * https://www.acmicpc.net/problem/1427
		 */
		sortInside(2143);
		sortInside(993249891);
		sortInside2(2143);
		sortInside2(993249891);
	}

	private static void sortInside(Integer numbers) {
		String numbersStr = numbers.toString();
		List<Integer> sortedList = new ArrayList<>();

		for (char c : numbersStr.toCharArray()) {
			sortedList.add(Character.getNumericValue(c));
		}
		sortedList.sort(Comparator.reverseOrder());
		System.out.println(sortedList);
	}

	private static void sortInside2(Integer numbers) {
		String numbersStr = numbers.toString();
		List<Integer> sortedList = new ArrayList<>();

		for (int i = 9; i > -1; i--) {
			for(char c: numbersStr.toCharArray()) {
				if(i == Character.getNumericValue(c)) {
					sortedList.add(i);
				}
			}
		}
		System.out.println(sortedList);
	}
}
