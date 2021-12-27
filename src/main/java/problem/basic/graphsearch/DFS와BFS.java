package problem.basic.graphsearch;

import java.util.ArrayList;
import java.util.List;

public class DFS와BFS {
	static List<Location> nodes;
	static int nodesSize;
	static boolean[] visited;
	public static void main(String[] args) {
		/**
		 * level 1
		 * https://www.acmicpc.net/problem/1260
		 */
		printDFSBFS(4, 1, List.of(new Location(1, 2), new Location(1, 3), new Location(1, 4), new Location(2, 4), new Location(3, 4)));
		printDFSBFS(5, 3, List.of(new Location(5,4), new Location(5,2), new Location(1,2), new Location(3,4), new Location(3,1)));
	}

	public static void printDFSBFS(int   n, int start, List<Location> nodes) {
		DFS와BFS.nodes = nodes;
		nodesSize = nodes.size();
		visited = new boolean[1001];
		dfs(start);
		System.out.println();
	}

	public static void dfs(int start) {
		visited[start] = true;

		for (int i = 1; i <= nodesSize; i++) {
			if (nodes.get(i - 1).isThereXY(start) && !visited[i]) {
				System.out.print(start + ",");
				dfs(i);
			}
		}
	}
}

class Location {
	private int x;
	private int y;

	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean isThereXY(int xy) {
		if (x == xy || y == xy) {
			return true;
		}
		return false;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "Location{" +
				"x=" + x +
				", y=" + y +
				'}';
	}
}

