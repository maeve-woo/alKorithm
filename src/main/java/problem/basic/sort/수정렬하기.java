package problem.basic.sort;

import java.util.*;

public class 수정렬하기 {
	public static void main(String[] args) {
		/**
		 * level 1
		 * https://www.acmicpc.net/problem/2750
		 * 1. 데이터의 개수가 1,000개 이하
		 */
		sortNumber(List.of(5, 5, 2, 3, 4, 1));
		sortNumber2(List.of(5, 5, 2, 3, 4, 1));
	}

	private static void sortNumber(List<Integer> list) { //selection Sort
		Set<Integer> trimedList = new HashSet<>(list);
		List<Integer> sortedList = new ArrayList<>(trimedList);
		int size = sortedList.size();

		for (int i = 0; i < size; i++) {
			int min_index = i;
			for (int j = i + 1; j < size; j++) {
				if (sortedList.get(min_index) > sortedList.get(j)) {
					min_index = j;
				}
			}
			int tmp = sortedList.get(i);
			sortedList.set(i, sortedList.get(min_index));
			sortedList.set(min_index, tmp);
		}
		System.out.println(sortedList);
	}

	private static void sortNumber2(List<Integer> list) {
		Set<Integer> trimedList = new HashSet<>(list);
		List<Integer> sortedList = new ArrayList<>(trimedList);
		sortedList.sort(Comparator.naturalOrder());

		System.out.println(sortedList);
	}
}
