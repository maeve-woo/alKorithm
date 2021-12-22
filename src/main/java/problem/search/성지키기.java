package problem.search;

import java.util.List;

public class 성지키기 {
	public static void main(String[] args) {
		/**
		 * level 1
		 * https://www.acmicpc.net/problem/1236
		 */
		protect(List.of(
				List.of("*","*","*","*"),
				List.of("*","*","*","*"),
				List.of("*","*","*","*"),
				List.of("*","*","*","*")
		));

		protect(List.of(
				List.of("X","X","*","*","*"),
				List.of("*","X","X","*","*"),
				List.of("*","*","*","X","X")
		));
	}

	public static void protect(List<List<String>> castle) {
		int rowSize = castle.size();
		int columnSize = castle.get(0).size();
		int[] row = new int[rowSize];
		int[] column = new int[columnSize];

		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < columnSize; j++) {
				if (castle.get(i).get(j).equals("X")) {
					row[i] = 1;
					column[j] = 1;
				}
			}
		}
		int rowCount = 0;
		int columnCount = 0;
		for (int rc : row) {
			if (rc == 0) {
				rowCount += 1;
			}
		}
		for (int cc : column) {
			if (cc == 0) {
				columnCount += 1;
			}
		}
		if (rowCount > columnCount) {
			System.out.println(rowCount);
		} else {
			System.out.println(columnCount);
		}
	}
}
