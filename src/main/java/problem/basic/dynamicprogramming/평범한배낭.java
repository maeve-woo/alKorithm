package problem.basic.dynamicprogramming;

import java.util.List;

public class 평범한배낭 {
	public static void main(String[] args) {
		/**
		 * level 1
		 * https://www.acmicpc.net/problem/12865
		 */
		backPack(7, List.of(new Stuff(6, 14), new Stuff(4, 8), new Stuff(3, 6), new Stuff(5, 12)));
	}

	public static void backPack(int supportWeight, List<Stuff> stuffs) {
		int stuffsSize = stuffs.size();
		int[][] dp = new int[stuffsSize + 1][supportWeight + 1];

		for (int i = 1; i <= stuffsSize; i++) {
			for (int j = 1; j <= supportWeight; j++) {
				Stuff stuff = stuffs.get(i - 1);
				if (j < stuff.getWeight()) {
					dp[i][j] = dp[i - 1][j];
				} else {
					int left = dp[i - 1][j];
					int right = dp[i - 1][j - stuff.getWeight()] + stuff.getValue();
					if (left >= right) {
						dp[i][j] = left;
					} else {
						dp[i][j] = right;
					}
				}
			}
		}
		System.out.println(dp[stuffsSize][supportWeight]);
	}
}

class Stuff {
	private int weight;
	private int value;

	public Stuff(int weight, int value) {
		this.weight = weight;
		this.value = value;
	}

	public int getWeight() {
		return weight;
	}

	public int getValue() {
		return value;
	}
}