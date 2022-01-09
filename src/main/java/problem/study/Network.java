package problem.study;

public class Network {
	public static void main(String[] args) {
		System.out.println(network(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
		System.out.println(network(3, new int[][]{{1, 1, 0}, {1, 1, 1}, {0, 1, 1}}));
	}

	/*
테스트 1 〉	통과 (0.02ms, 73.4MB)
테스트 2 〉	통과 (0.02ms, 78.5MB)
테스트 3 〉	통과 (0.04ms, 74MB)
테스트 4 〉	통과 (0.03ms, 73.1MB)
테스트 5 〉	통과 (0.02ms, 77.4MB)
테스트 6 〉	통과 (0.09ms, 74.9MB)
테스트 7 〉	통과 (0.03ms, 73.9MB)
테스트 8 〉	통과 (0.09ms, 71.6MB)
테스트 9 〉	통과 (0.05ms, 88.2MB)
테스트 10 〉	통과 (0.04ms, 76.6MB)
테스트 11 〉	통과 (0.15ms, 75.1MB)
테스트 12 〉	통과 (0.14ms, 79.9MB)
테스트 13 〉	통과 (0.08ms, 75.5MB)
	 */
	public static int network(int n, int[][] computers) {
		int answer = 0;
		boolean[] visited = new boolean[n];
		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				dfs(i, visited, n, computers);
				// 연결된 컴퓨터 한 그룹 모두 탐방하는 재귀호출
				answer += 1;
			}
		}
		return answer;
	}

	private static void dfs(int index, boolean[] visited, int n, int[][] computers) {
		visited[index] = true;
		for (int i = 0; i < n; i++) {
			if (!visited[i] && computers[index][i] == 1) {
				dfs(i, visited, n, computers);
			}
		}
	}
}
