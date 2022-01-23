package problem.study;

public class 전화번호목록 {
	public static void main(String[] args) {
		solution(new String[]{"119", "97674223", "1195524421"});
	}

	/*
정확성  테스트
테스트 1 〉	통과 (0.12ms, 77.1MB)
테스트 2 〉	통과 (0.02ms, 73.6MB)
테스트 3 〉	통과 (0.06ms, 76.1MB)
테스트 4 〉	통과 (0.06ms, 77MB)
테스트 5 〉	통과 (0.06ms, 72.4MB)
테스트 6 〉	통과 (0.07ms, 81MB)
테스트 7 〉	통과 (0.06ms, 73.8MB)
테스트 8 〉	통과 (0.02ms, 76.6MB)
테스트 9 〉	통과 (0.02ms, 79.3MB)
테스트 10 〉	통과 (0.08ms, 73.2MB)
테스트 11 〉	통과 (0.11ms, 75.7MB)
테스트 12 〉	통과 (0.06ms, 71MB)
테스트 13 〉	통과 (0.06ms, 73.6MB)
테스트 14 〉	통과 (13.73ms, 80.3MB)
테스트 15 〉	통과 (19.45ms, 83.8MB)
테스트 16 〉	통과 (19.30ms, 85.4MB)
테스트 17 〉	통과 (26.21ms, 81.6MB)
테스트 18 〉	통과 (41.50ms, 86.6MB)
테스트 19 〉	통과 (34.17ms, 84.5MB)
테스트 20 〉	통과 (64.10ms, 90MB)
효율성  테스트
테스트 1 〉	통과 (0.10ms, 57.5MB)
테스트 2 〉	통과 (0.03ms, 59.4MB)
테스트 3 〉	실패 (시간 초과)
테스트 4 〉	실패 (시간 초과)
	 */
	public static boolean solution(String[] phone_book) {
		int length = phone_book.length;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (phone_book[i].startsWith(phone_book[j])) {
					return false;
				} else if (phone_book[j].startsWith(phone_book[i])) {
					return false;
				}
			}
		}
		return true;
	}
}
