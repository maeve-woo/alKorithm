package problem.level.two;

public class 비밀번호입력하기 {
	public static void main(String[] args) {
//		System.out.println(solution("523817", "371648295"));
//		System.out.println(solution("3999", "735194826"));
		System.out.println(solution("13722327", "481729356"));
	}

	public static int solution(String s, String key) {
		int result = 0;
		char[] sc = s.toCharArray();
		char[] keys = key.toCharArray();

		int beforeIndex = -1;
		for (int i = 0; i < sc.length; i++) {
			char now = sc[i];
			int nowIndex = -1;
			for (int j = 0; j < keys.length; j++) {
				if (now == keys[j]) {
					nowIndex = j;
					break;
				}
			}
			if (beforeIndex != -1) {
				int gap = Math.abs(nowIndex - beforeIndex);
				if (gap == 0) {
				} else if (gap == 1) {
					if (nowIndex == 4 || nowIndex == 7) {
						result += 2;
					} else if (beforeIndex == 4 || beforeIndex == 7) {
						result += 2;
					} else {
						result += 1;
					}
				} else if (gap == 2) {
					if (nowIndex == 3 || nowIndex == 6 || nowIndex == 9) {
						result += 2;
					} else if (beforeIndex == 3 || beforeIndex == 6 || beforeIndex == 9) {
						result += 2;
					} else {
						result += 1;
					}
				} else if (gap == 3) {
					result += 1;
				} else if (gap == 4) {
					if (nowIndex == 7) {
						result += 2;
					} else if (beforeIndex == 7) {
						result += 2;
					} else {
						result += 1;
					}
				} else {
					result += 2;
				}
			}
			beforeIndex = nowIndex;
		}
		return result;
	}
}
