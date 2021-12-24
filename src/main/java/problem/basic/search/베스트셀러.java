package problem.basic.search;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class 베스트셀러 {
	public static void main(String[] args) {
		/**
		 * level 1
		 * https://www.acmicpc.net/problem/1302
		 */
		bestSeller(List.of("top", "top", "top", "top", "kimtop"));
		bestSeller(List.of("table","chair","table","table","lamp","door","lamp","table","chair"));
		bestSeller(List.of("a","a","a","b","b","b"));
	}

	public static void bestSeller(List<String> soldBookList) {
		Map<String, Integer> soldBooks = new HashMap<>();

		for (String soldBook : soldBookList) {
			soldBooks.merge(soldBook, 1, Integer::sum);
		}

		List<Map.Entry<String, Integer>> collect =
				soldBooks.entrySet().stream()
						.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
						.collect(Collectors.toList());
		System.out.println(collect.get(0).getKey());
	}
}