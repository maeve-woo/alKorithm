package problem.basic.dynamicprogramming;

import java.util.Arrays;
import java.util.List;

public class 긴증가부분수열 {
	public static void main(String[] args) {
		/**
		 * level 1
		 * https://www.acmicpc.net/problem/11053
		 * LIS
		 */
		longSeq2(List.of(10, 20, 10, 30, 20, 50));
	}

	public static void longSeq(List<Integer> numbers) {
		int numbersSize = numbers.size();
		int max = 0;

		for (int i = 0; i < numbersSize; i++) {
			int gap = 0;
			int seqSize = 0;
			for (int j = i + 1; j <= numbersSize / 2; j++) {
				int gapTmp = numbers.get(i) - numbers.get(j);
				if (j == i + 1) {
					gap = gapTmp;
					continue;
				}
				if (gap == gapTmp) {
					seqSize += 1;
				} else {
					break;
				}
			}
			if (seqSize > max) {
				max = seqSize;
			}
		}
		System.out.println(max);
	}

	public static void longSeq2(List<Integer> numbers) {
		int numbersSize = numbers.size();
		int[] dp = new int[numbersSize];
		Arrays.fill(dp, 1);

		int max = 0;
		for (int i = 1; i < numbersSize; i++) {
			dp[i-1] = 1;
			for (int j = 0; j < i; j++) {
				if (numbers.get(i) < numbers.get(j)) {
					if (dp[i] >= (dp[j] + 1)) {
						dp[i] = dp[i];
					} else {
						dp[i] = dp[j] + 1;
					}
				}
				if (dp[i] >= max) {
					max = dp[i];
				}
			}
		}
		System.out.println(max);
	}
}
