package problem.level.two;

import java.util.List;

public class k찾기 {
	public static void main(String[] args) {
		System.out.println(findNumber(List.of(1, 2, 3, 4, 5), 1));
		System.out.println(findNumber(List.of(2, 3, 1), 5));
	}

	public static String findNumber(List<Integer> arr, int k) {
		for (int i = 0; i < arr.size(); i++) {
			if (i == k) {
				return "YES";
			}
		}
		return "NO";
	}
}
