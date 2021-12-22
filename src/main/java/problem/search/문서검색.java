package problem.search;

import java.util.List;

public class 문서검색 {
	public static void main(String[] args) {
		/**
		 * level 1
		 * https://www.acmicpc.net/problem/1543
		 */
		searchStringFrequency("ababababa", "aba");
		searchStringFrequency("aaaaa", "aa");
		searchStringFrequency("ababababa", "ababa");

		searchStringFrequency2("ababababa", "aba");
		searchStringFrequency2("aaaaa", "aa");
		searchStringFrequency2("ababababa", "ababa");
	}

	public static void searchStringFrequency(String document, String searchString) {
		int maxFreq = document.length() / searchString.length();

		int count = 0;
		for (int i = 0; i < maxFreq; i++) {
			if (document.contains(searchString)) {
				if (maxFreq == 1) {
					System.out.println(1);
					return;
				}
				List split = List.of(document.split(searchString));
				int splitSize = split.size() - 1;
				if (split.size() - 1 > count) {
					count = splitSize;
				}

			} else {
				System.out.println(0);
				return;
			}
		}
		System.out.println(count);
	}

	public static void searchStringFrequency2(String document, String searchString) {
		int index = 0;
		int result = 0;
		while (document.length() - index >= searchString.length()) {
			if (document.startsWith(searchString, index)) {
				result += 1;
				index += searchString.length();
			} else {
				index += 1;
			}
		}
		System.out.println(result);
	}
}
