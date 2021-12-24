package problem.basic.search;

public class 새 {
	public static void main(String[] args) {
		/**
		 * level 1
		 * https://www.acmicpc.net/problem/1568
		 */
		bird(14);
		bird(1);
		bird(3);
		bird(4);

		bird2(14);
		bird2(1);
		bird2(3);
		bird2(4);
	}

	public static void bird(int n) {
		int second = 0;
		int birds = n;
		while (birds > 0) {
			int i = 1;
			for (; i <= birds; i++) {
				birds -= i;
				second += 1;
			}
		}
		System.out.println(second);
	}

	public static void bird2(int n) {
		int second = 0;
		int birds = n;
		int i = 1;
		while (birds > 0) {
			if (i > birds) {
				i = 1;
			}
			birds -= i;
			i += 1;
			second += 1;
		}
		System.out.println(second);
	}
}
