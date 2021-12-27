package problem.basic.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 등수매기기 {
	public static void main(String[] args) {
		/**
		 * level 1
		 * https://www.acmicpc.net/problem/2012
		 */
		minDissatifaction(5, List.of(1, 5, 3, 1, 2));
	}

	public static void minDissatifaction(int studentNumber, List<Integer> expectationScore) {
		List<Integer> copyExNumber = new ArrayList<>(expectationScore);
		Collections.sort(copyExNumber);
		int result = 0;

		for (int i = 1; i <= studentNumber; i++) {
			int expectScore = copyExNumber.get(i - 1);
			if (expectScore != i) {
				result += Math.abs(expectScore - i);
			}
		}
		System.out.println(result);
	}
}
