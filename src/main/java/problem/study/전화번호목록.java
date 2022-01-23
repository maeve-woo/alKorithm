package problem.study;

import java.util.Arrays;

public class 전화번호목록 {
	public static void main(String[] args) {
		solution(new String[]{"119", "97674223", "1195524421"});
	}

	/*
정확성  테스트
테스트 1 〉	통과 (0.36ms, 79.9MB)
테스트 2 〉	통과 (0.19ms, 76.7MB)
테스트 3 〉	통과 (0.27ms, 76.2MB)
테스트 4 〉	통과 (0.19ms, 75.4MB)
테스트 5 〉	통과 (0.24ms, 77.6MB)
테스트 6 〉	통과 (0.24ms, 76.9MB)
테스트 7 〉	통과 (0.23ms, 78.7MB)
테스트 8 〉	통과 (0.23ms, 70.5MB)
테스트 9 〉	통과 (0.22ms, 72.9MB)
테스트 10 〉	통과 (0.24ms, 79.7MB)
테스트 11 〉	통과 (0.22ms, 73.9MB)
테스트 12 〉	통과 (0.18ms, 75MB)
테스트 13 〉	통과 (0.20ms, 72.9MB)
테스트 14 〉	통과 (2.20ms, 76.6MB)
테스트 15 〉	통과 (2.12ms, 69.6MB)
테스트 16 〉	통과 (2.69ms, 73.5MB)
테스트 17 〉	통과 (2.68ms, 78.7MB)
테스트 18 〉	통과 (3.65ms, 75.2MB)
테스트 19 〉	통과 (4.61ms, 83.3MB)
테스트 20 〉	통과 (4.60ms, 77.6MB)

효율성  테스트
테스트 1 〉	통과 (30.31ms, 72.3MB)
테스트 2 〉	통과 (14.28ms, 56.6MB)
테스트 3 〉	통과 (364.57ms, 98MB)
테스트 4 〉	통과 (253.30ms, 95.8MB)
	 */
	public static boolean solution(String[] phone_book) {
		int length = phone_book.length;
		Arrays.sort(phone_book);
		for (int j = 0; j < length - 1; j++) {
			if (phone_book[j + 1].startsWith(phone_book[j])) {
				return false;
			}
		}
		return true;
	}
}
