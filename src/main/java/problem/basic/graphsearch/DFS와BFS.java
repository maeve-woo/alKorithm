package problem.basic.graphsearch;

import java.util.*;

public class DFS와BFS {
	public static void main(String[] args) {
		/**
		 * level 1
		 * https://www.acmicpc.net/problem/1260
		 */
		int[][] graph = {{1, 2}, {1, 3}, {1, 4}, {2, 4}, {3, 4}};
		printDFS(4, 5, 1, graph);
		int[][] graph2 = {{5, 4}, {5, 2}, {1, 2}, {3, 4}, {3, 1}};
		printDFS(5, 5, 3, graph2);
	}

	public static void printDFS(int n, int m, int v, int[][] graph) {
		boolean[] visited = new boolean[n + 1];
		int[][] copyGraph = graph.clone();
		Arrays.sort(copyGraph, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] >= o2[0]) {
					return 1;
				}
				return -1;
			}
		});
		System.out.println(">>sorted : " + Arrays.toString(copyGraph));

		dfs(v, visited, copyGraph);
	}

	public static void dfs(int v, boolean[] visited, int[][] graph) {
		visited[v] = true;
		System.out.println(v);

		for (int i: graph[v]) {
			if (visited[i]) {
				continue;
			}
			dfs(i, visited, graph);
		}
	}
}

