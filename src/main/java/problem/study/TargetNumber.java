package problem.study;

public class TargetNumber {
	public static void main(String[] args) {
		System.out.println(solution(new int[]{1, 1, 1, 1, 1}, 3));
		System.out.println(backTrack(new int[]{1, 1, 1, 1, 1}, 3, 0));
	}

	public static int solution(int[] numbers, int target) {
		return recursive(numbers, target, 0, 0);
	}

	public static int recursive(int[] numbers, int target, int depth, int sum) {
		int count = 0;

		if (depth == numbers.length) {
			if (sum == target) {
				return 1;
			}
			return 0;
		}
		count += recursive(numbers, target, depth + 1, sum + numbers[depth]);
		count += recursive(numbers, target, depth + 1, sum - numbers[depth]);
		return count;
	}

	public static int backTrack(int[] numbers, int target, int index) {
		if (index == numbers.length) {
			int sum = 0;
			for (int n : numbers) {
				sum += n;
			}

			return sum == target ? 1 : 0;
		}

		int rest = 0;
		rest += backTrack(numbers, target, index + 1);

		numbers[index] *= -1;
		rest += backTrack(numbers, target, index + 1);

		return rest;
	}
}
