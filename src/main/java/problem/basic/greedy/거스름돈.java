package problem.basic.greedy;

import java.util.ArrayList;
import java.util.List;

public class 거스름돈 {
	public static void main(String[] args) {
		/**
		 * level 1
		 * https://www.acmicpc.net/problem/5585
		 */
		changes(380);
		changes(1);

		changes2(380);
		changes2(1);
	}

	public static void changes(int price) {
		int change = 1000 - price;
		List<Integer> coins = new ArrayList<>(List.of(500, 100, 50, 10, 5, 1));
		int changeCoinCount = 0;

		for (Integer coin : coins) {
			while (true) {
				int remain = change - coin;
				if (remain >= 0) {
					changeCoinCount += 1;
					change = remain;

					if (change - coin < 0) {
						break;
					}
				} else {
					break;
				}
			}
		}
		System.out.println(changeCoinCount);
	}

	public static void changes2(int price) {
		int change = 1000 - price;
		List<Integer> coins = new ArrayList<>(List.of(500, 100, 50, 10, 5, 1));
		int changeCoinCount = 0;

		for (Integer coin : coins) {
			changeCoinCount += change / coin;
			change = change % coin;
		}
		System.out.println(changeCoinCount);
	}
}
