package problem

fun main() {
	/**
	 * level 1
	 * https://www.acmicpc.net/problem/2920
	 * 1. 리스트에서의 원소를  차례대로 비교한다.
	 * 2. 비교할 때 두 원소를 기준으로 오름차순/내림차순 여부를 체크한다.
	 */
	println(scale(listOf(1, 2, 3, 4, 5, 6, 7, 8))) // ascending
	println(scale(listOf(8, 7, 6, 5, 4, 3, 2, 1))) // descending
	println(scale(listOf(8, 1, 7, 2, 6, 3, 5, 4))) // mixed

	scale2(listOf(1, 2, 3, 4, 5, 6, 7, 8)) // ascending
	scale2(listOf(8, 7, 6, 5, 4, 3, 2, 1)) // descending
	scale2(listOf(8, 1, 7, 2, 6, 3, 5, 4)) // mixed
}

fun scale(list: List<Int>): String {
	var before = 0
	val MAX = 8
	var isAsc = true
	var isMix = false

	for (i: Int in list) {
		if (i == (before + 1)) {
			before = i

		} else {
			isAsc = false

			if (i == MAX || i == (before - 1)) {
				before = i

			} else if (i != (before - 1)) {
				isMix = true
				break
			}
		}
	}
	if (isMix) return "mixed"
	if (isAsc) return "ascending"
	return "descending"
}

fun scale2(list: List<Int>) {
	var isAsc = true
	var isDesc = true

	for (i: Int in 1..7) {
		if (list[i] > list[i - 1]) {
			isDesc = false
		} else if (list[i - 1] > list[i]) {
			isAsc = false
		}
	}
	if (isAsc) {
		println("ascending")
	} else if (isDesc) {
		println("descending")
	} else {
		println("mixed")
	}
}