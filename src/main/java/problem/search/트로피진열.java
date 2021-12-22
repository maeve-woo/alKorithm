package problem.search;

import java.util.Comparator;
import java.util.List;

public class 트로피진열 {
	public static void main(String[] args) {
		/**
		 * level 1
		 * https://www.acmicpc.net/problem/1668
		 */
		getTrophyViewCount(List.of(1, 2, 3, 4, 5));
		getTrophyViewCount(List.of(5, 5, 5, 5));
		getTrophyViewCount(List.of(1, 2, 5, 2, 1));
		getTrophyViewCount(List.of(1, 4, 2, 5, 3, 7, 1));

		getTrophyViewCount2(List.of(1, 2, 3, 4, 5));
		getTrophyViewCount2(List.of(5, 5, 5, 5));
		getTrophyViewCount2(List.of(1, 2, 5, 2, 1));
		getTrophyViewCount2(List.of(1, 4, 2, 5, 3, 7, 1));
	}

	public static void getTrophyViewCount(List<Integer> leftToRightHight) {
		int stepLeft = 0;
		int leftCount = 0;
		int stepRight = 0;
		int rightCount = 0;

		int leftToRightHightSize = leftToRightHight.size();
		for (int i = 0; i < leftToRightHightSize; i++) {
			int leftHeight = leftToRightHight.get(i);
			if (leftHeight > stepLeft) {
				stepLeft = leftHeight;
				leftCount += 1;
			}

			int rightHeight = leftToRightHight.get(leftToRightHightSize - 1 - i);
			if (rightHeight > stepRight) {
				stepRight = rightHeight;
				rightCount += 1;
			}
		}

		System.out.println(leftCount + ", " + rightCount);
	}

	public static void getTrophyViewCount2(List<Integer> leftToRightHight) {
		int now = leftToRightHight.get(0);
		int result = 1;

		for (int i = 0; i < leftToRightHight.size(); i++) {
			int height = leftToRightHight.get(i);
			if (height > now) {
				result += 1;
				now = height;
			}
		}
		System.out.println(result);
	}
}
