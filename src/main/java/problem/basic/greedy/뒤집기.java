package problem.basic.greedy;

public class 뒤집기 {
	public static void main(String[] args) {
		/**
		 * level1
		 * https://www.acmicpc.net/problem/1439
		 */
		reverse("0001100");
		reverse("11111");
		reverse("00000001");
		reverse("11001100110011000001");

		reverse2("0001100");
		reverse2("11111");
		reverse2("00000001");
		reverse2("11001100110011000001");
	}

	public static void reverse(String digits) {
		Character pivot = null;
		int changeCount = 0;

		for (char digit : digits.toCharArray()) {
			if (pivot == null) {
				pivot = digit;
				continue;
			}
			if (digit != pivot) {
				changeCount += 1;
				pivot = digit;
			}
		}
		if (changeCount == 1) {
			System.out.println(1);
		} else {
			System.out.println(changeCount / 2);
		}
	}

	public static void reverse2(String digits) {
		char[] chars = digits.toCharArray();
		int count0 = 0;
		int count1 = 0;

		if (chars[0] == '1') {
			count0 += 1;
		} else {
			count1 += 1;
		}

		for (int i = 1; i < chars.length; i++) {
			if (chars[i - 1] != chars[i]) {
				if (chars[i] == '1') {
					count0 += 1;
				} else {
					count1 += 1;
				}
			}
		}
		if (count0 < count1) {
			System.out.println(count0);
		} else {
			System.out.println(count1);
		}
	}
}
