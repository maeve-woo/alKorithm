package problem.basic.graphsearch;

import java.util.List;

public class 바이러스 {
	static int countConnect = 0;
	public static void main(String[] args) {
		/**
		 * level 1
		 * https://www.acmicpc.net/problem/2606
		 */
		connectedComputer(7, List.of(List.of(1, 2), List.of(2, 3), List.of(1, 5), List.of(5, 2), List.of(5, 6), List.of(4, 7)));
	}

	public static void connectedComputer(int computerNumber, List<List<Integer>> lines) {
		boolean[] visited = new boolean[computerNumber + 1];

		dfs(1, lines, visited);
		System.out.println(countConnect -1);
	}

	public static void dfs(int now, List<List<Integer>> lines, boolean[] visited) {
		countConnect += 1;
		visited[now] = true;
		for (int i = 0; i < lines.size(); i++) {
			boolean isContain = lines.get(i).contains(now);
			int next;
			if (lines.get(i).get(0) != now) {
				next = lines.get(i).get(0);
			} else {
				next = lines.get(i).get(1);
			}

			if (isContain && !visited[next]) {
				dfs(next, lines, visited);
			}
		}
	}
}
