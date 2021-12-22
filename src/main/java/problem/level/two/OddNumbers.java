package problem.level.two;

import java.util.ArrayList;
import java.util.List;

public class OddNumbers {
	public static void main(String[] args) {
		System.out.println(oddNumbers(1,6));
	}

	public static List<Integer> oddNumbers(int l, int r) {
		List<Integer> result = new ArrayList<>();
		for (int i = l; i <= r; i++) {
			if (i % 2 != 0){
				result.add(i);
			}
		}
		return result;
	}
}
