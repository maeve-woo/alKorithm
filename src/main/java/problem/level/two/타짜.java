package problem.level.two;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class 타짜 {
	public static void main(String[] args) {
//		System.out.println(solution(List.of(4,2,5,3,1)));
//		System.out.println(solution(List.of(2,5,3,1)));
		System.out.println(solution(List.of(6,2,5,2,7,8,4)));
	}

	public static int solution(List<Integer> cards) {
		int resultIndex = -1;
		for (int i = 0; i < cards.size(); i++) {
			List<Integer> copyCards = new ArrayList<>(cards);
			copyCards.remove(copyCards.get(i));

			BigInteger kero = BigInteger.ZERO;
			BigInteger benny = BigInteger.ZERO;

			for (int j = 0; j < copyCards.size(); j++) {
				BigInteger value = new BigInteger(copyCards.get(j).toString());
				if (j % 2 == 0) {
					kero = kero.add(value);
				} else {
					benny = benny.add(value);
				}
			}
			if (kero.compareTo(benny) == 0) {
				System.out.println(i);
				resultIndex = i;
				break;
			}
		}
		if (resultIndex == -1) {
			return resultIndex;
		}
		return resultIndex + 1;
	}
}
