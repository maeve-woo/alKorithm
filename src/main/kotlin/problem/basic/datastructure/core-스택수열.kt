package problem.basic.datastructure

import kotlin.system.exitProcess

fun main() {
	/**
	 * level 1
	 * https://www.acmicpc.net/problem/1874
	 * 스택, 그리디
	 * 1. 스택에 원소를 삽일할 때는, 단순히 특정 수에 도달할 때까지 삽입하면 된다.
	 * 2. 스택에서 원소를 연달아 빼낼 때 내림차순을 유지할 수 있는지 확인한다.
	 */
	stack(listOf(4,3,6,8,7,5,2,1))
}

fun stack(list: List<Int>) {
	var pushPop = mutableListOf<String>()
	var stack = mutableListOf<Int>()
	var count = 1

	for (i: Int in list) {
		while (count <= i) {
			stack.add(count)
			count += 1
			pushPop.add("+")
		}
		if (stack.last() == i) {
			stack.removeLastOrNull()
			pushPop.add("-")
		} else {
			println("NO")
			break
			exitProcess(0)
		}
	}
	println(pushPop)
}