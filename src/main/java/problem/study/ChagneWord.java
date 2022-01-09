package problem.study;

import java.util.List;

public class ChagneWord {
	public static void main(String[] args) {
		System.out.println(changeWordDfs("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log", "cog"}));
	}

	public static int changeWordDfs(String begin, String target, String[] words) {
		int size = words.length;
		boolean[] visited = new boolean[size];
		int min = 0;

		return dfs(0, begin, target, visited, words, min);
	}

	private static int dfs(int count, String begin, String target, boolean[] visited, String[] words, int min) {
		List<String> wordList = List.of(words.clone());

		if (!wordList.contains(target)) return count;
		if (begin.equals(target)) return count;

		for (int i = 0; i < words.length; i++) {
			int tmpMin = 0;
			if (!visited[i]) {
				if (checkWord(begin, words[i])) {
					visited[i] = true;
					tmpMin = dfs(count + 1, words[i], target, visited, words, min);
				}
			}
			visited[i] = false;
			if (tmpMin < min) {
				min = tmpMin;
			}
		}
		return min;
	}

	private static boolean checkWord(String now, String word) {
		int matchCount = 0;
		int size = now.length();

		for (int i = 0; i < size; i++) {
			if(now.charAt(i) == word.charAt(i)) {
				matchCount += 1;
			}
		}

		return matchCount == size - 1;
	}
}
