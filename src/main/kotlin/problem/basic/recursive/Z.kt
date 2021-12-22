package problem.basic.recursive

import kotlin.math.pow

fun main() {
	/**
	 * level 2
	 * https://www.acmicpc.net/problem/1074
	 */
	z(2.toDouble(), 3.toDouble(), 1.toDouble())
//	z(3, 7, 7)
//	z(1, 0, 0)
//	z(4, 7, 7)
//	z(10, 511, 511)
}

var result = 0
fun z(n: Double, x: Double, y: Double) {
	val X = 0.toDouble()
	val Y = 0.toDouble()
	val N = 2.toDouble().pow(n)
	if (N == 2.toDouble()) {
		if (X == x && Y == y) {
			println(result)
			return
		}
		result += 1
		if (X == x && Y + 1 == y) {
			println(result)
			return
		}
		result += 1
		if (X + 1 == x && Y == y) {
			println(result)
			return
		}
		result += 1
		if (X + 1 == x && Y + 1 == y) {
			println(result)
			return
		}
		result += 1
		return
	}
	z(N / 2, x, y)
	z(N / 2, x, y + N / 2)
	z(N / 2, x + N / 2, y)
	z(N / 2, x + N / 2, y + N / 2)
}
