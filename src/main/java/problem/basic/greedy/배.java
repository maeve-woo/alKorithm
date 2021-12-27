package problem.basic.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 배 {
	public static void main(String[] args) {
		/**
		 * level 2
		 * https://www.acmicpc.net/problem/1092
		 */
		loadShip(List.of(6, 8, 9), List.of(2, 5, 2, 4, 7));
		loadShip(List.of(19, 20), List.of(14, 12, 16, 19, 16, 1, 5));
		loadShip(List.of(23, 32, 25, 28), List.of(5, 27, 10, 16, 24, 20, 2, 32, 18, 7));

		loadShip2(List.of(6, 8, 9), List.of(2, 5, 2, 4, 7));
		loadShip2(List.of(19, 20), List.of(14, 12, 16, 19, 16, 1, 5));
		loadShip2(List.of(23, 32, 25, 28), List.of(5, 27, 10, 16, 24, 20, 2, 32, 18, 7));
	}

	public static void loadShip(List<Integer> craneCanHoldWeights, List<Integer> boxWeights) {
		List<Integer> copyCHWs = new ArrayList<>(craneCanHoldWeights);
		List<Integer> copyBoxWeights = new ArrayList<>(boxWeights);

		copyCHWs.sort(Collections.reverseOrder());
		copyBoxWeights.sort(Collections.reverseOrder());

		if (copyBoxWeights.get(0) > copyCHWs.get(0)) {
			System.out.println(-1);
		} else {
			int result = 0;

			while (!copyBoxWeights.isEmpty()) {
				for (Integer cHW : copyCHWs) {
					for (Integer boxWeight: copyBoxWeights) {
						if (boxWeight <= cHW) {
							copyBoxWeights.remove(boxWeight);
							break;
						}
					}
				}
				result += 1;
			}
			System.out.println(result);
		}
	}

	public static void loadShip2(List<Integer> craneCanHoldWeights, List<Integer> boxWeights) {
		List<Integer> copyCHWs = new ArrayList<>(craneCanHoldWeights);
		List<Integer> copyBoxWeights = new ArrayList<>(boxWeights);

		copyCHWs.sort(Collections.reverseOrder());
		copyBoxWeights.sort(Collections.reverseOrder());

		boolean[] isMoved = new boolean[copyBoxWeights.size()];

		if (copyBoxWeights.get(0) > copyCHWs.get(0)) {
			System.out.println(-1);
		} else {
			int result = 0;

			while (!isMoved[copyBoxWeights.size()-1]) {
				for (Integer craneCanHoldWeight : copyCHWs) {
					for (int i = 0; i < boxWeights.size(); i++) {
						if (!isMoved[i] && craneCanHoldWeight >= boxWeights.get(i)) {
							isMoved[i] = true;
							break;
						}
					}
				}
				result += 1;
			}
			System.out.println(result);
		}
	}
}
