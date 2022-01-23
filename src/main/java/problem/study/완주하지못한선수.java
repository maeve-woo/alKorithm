package problem.study;

import java.util.ArrayList;
import java.util.List;

public class 완주하지못한선수 {
	public static void main(String[] args) {
		System.out.println(solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
	}

	/*
정확성  테스트
테스트 1 〉	통과 (0.04ms, 76.9MB)
테스트 2 〉	통과 (0.05ms, 77.6MB)
테스트 3 〉	통과 (1.41ms, 84.5MB)
테스트 4 〉	통과 (3.58ms, 77.4MB)
테스트 5 〉	통과 (8.37ms, 77MB)
효율성  테스트
테스트 1 〉	실패 (시간 초과)
테스트 2 〉	실패 (시간 초과)
테스트 3 〉	실패 (시간 초과)
테스트 4 〉	실패 (시간 초과)
테스트 5 〉	실패 (시간 초과)
	 */
	public static String solution(String[] participant, String[] completion) {
		List<String> participants = new ArrayList<>(List.of(participant.clone()));
		for (String c: completion) {
			participants.remove(c);
		}
		return participants.get(0);
	}
}
