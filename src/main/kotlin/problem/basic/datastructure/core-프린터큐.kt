package problem.basic.datastructure

fun main() {
	/**
	 * level 1
	 * https://www.acmicpc.net/problem/1966
	 * 큐, 구현, 그리디
	 * 1. 데이터의 개수(N <= 100)가 많지 않으므로, 단순히 문제에서 요구하는 대로 구현
	 * 2. 현재 리스트에서 가장 큰 수가 앞에 올 때까지 회전시킨 뒤에 추출
	 * 3. 가장 큰 수가 M이면 가장 앞에 있을 때 프로그램을 종료.
	 */

	printQueue(listOf(1, 0), listOf(5)) // 1
	printQueue(listOf(4, 2), listOf(1, 2, 3, 4)) // 2
	printQueue(listOf(6, 0), listOf(1, 1, 9, 1, 1, 1)) // 5

	printQueue2(listOf(1, 0), listOf(5)) // 1
	printQueue2(listOf(4, 2), listOf(1, 2, 3, 4)) // 2
	printQueue2(listOf(6, 0), listOf(1, 1, 9, 1, 1, 1)) // 5
}

fun printQueue(sizeNPivot: List<Int>, list: List<Int>) {
	var pivotIndex = sizeNPivot[1]
	val listCopy = mutableListOf<Int>()
	listCopy.addAll(list)
	var count = 0

	while (listCopy.size != 0) {
		val max = listCopy.maxOrNull()
		if (listCopy.first() == max) {
			count += 1
			listCopy.removeFirst()
			if (pivotIndex == 0) {
				println(count)
				break
			}
		} else {
			if (pivotIndex == 0) {
				pivotIndex = listCopy.size
			}

			val first = listCopy.first()
			listCopy.removeFirst()
			listCopy.add(first)
		}
		pivotIndex -= 1
	}
}

fun printQueue2(sizeNPivot: List<Int>, list: List<Int>) {
	val pivotIndex = sizeNPivot[1]
	val queue = mutableListOf<Pair<Int, Int>>()
	for (i: Int in list.indices) {
		queue.add(Pair(list[i], i)) // (value, index)
	}
	var count = 0

	while (queue.size != 0) {
		var max = 0
		queue.forEach { e ->
			if (e.first > max) {
				max = e.first
			}
		}

		if (queue[0].first == max) {
			count += 1
			if (queue[0].second == pivotIndex) {
				println(count)
				break
			} else {
				queue.removeFirst()
			}
		} else {
			queue.add(queue.removeFirst())
		}
	}
}
