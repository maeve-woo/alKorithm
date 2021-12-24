package problem.basic.dynamicprogramming;

public class _01타일 {
	public static void main(String[] args) {
		/**
		 * level 1
		 * https://www.acmicpc.net/problem/1904
		 * 동적 프로그래밍 문제를 풀기 위해서는 점화식(접한 항들 사이의 관계식)
		 */
		tile01(4);
		tile01(900_000);
		tile01(1_000_000);
	}

	public static void tile01(int n) {
		// D[i] = D[i-1] + D[i-2]
		int[] dp = new int[1000_001];
		dp[1] = 1;
		dp[2] = 2;

		for (int i = 3; i < n + 1; i++) {
			dp[i] = (dp[i - 2] + dp[i - 1]) % 15746;
		}
		System.out.println(dp[n]);
	}
}
