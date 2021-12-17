package problem.basic.datastructure

fun main() {
	/**
	 * level 2
	 * https://www.acmicpc.net/problem/5397
	 * 스택, 구현, 그리디
	 * 1. 문자열 크기가 1,000,000이므로 시뮬레이션 방식으로는 문제를 해결할 수 없다.
	 * 2. 스택을 활하여 선형시간 문제를 해결할 수 있는 알고리즘을 설계s
	 */
	keyLogger(listOf("<", "<", "B", "P", "<", "A", ">", ">", "C", "d", "-")) // BAPC
	keyLogger(listOf("A","B","C","<","<","D",">","E","<","<","F",">",">"))
}

fun keyLogger(list: List<String>) {
	val left = "<"
	val right = ">"
	val backSpace = "-"

	val leftStack = mutableListOf<String>()
	val rightStack = mutableListOf<String>()

	for (s: String in list) {
		if (s == left) {
			if (leftStack.isNotEmpty()) {
				val pop = leftStack.last()
				leftStack.removeLast()
				rightStack.add(pop)
			}
			continue
		}

		if (s == right) {
			if (rightStack.isNotEmpty()) {
				val pop = rightStack.last()
				rightStack.removeLast()
				leftStack.add(pop)
			}
			continue
		}

		if (s == backSpace) {
			if (leftStack.isNotEmpty()) {
				leftStack.removeLast()
			}
			continue
		}

		leftStack.add(s)
	}
	for (i: Int in rightStack.indices) {
		leftStack.add(rightStack.removeLast())
	}
	println(leftStack)
}