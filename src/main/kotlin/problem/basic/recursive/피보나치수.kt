package problem.basic.recursive

fun main() {
	/**
	 * https://www.acmicpc.net/problem/2747
	 * 1. 피보나치 수열의 점화식을 세운다. Fn = Fn-1 + Fn-2 (n>=2)
	 * 2. 재귀함수를 이용해 문제를 풀 수 있는지 검토해야 한다.
	 * 3. 문제에서 N은 최대 45이다.
	 */
//	println(fibonacci(10))
		fibonacci2(10)
}

fun fibonacci(seed: Int): Int {
	/*
		재귀적 구현의 한계 : 반복적인 함수호출이 많음 -> 시간초과 걸릴 수 있음 -> 다이나믹 프로그래밍 필요
		O(2^n)
	*/
	if (seed == 0) return 0
	if (seed == 1) return 1

	return fibonacci(seed - 1) + fibonacci(seed - 2)
}

fun fibonacci2(seed: Int) {
	var seedCopy = seed
	var a = 0
	var b = 1

	while (seedCopy > 0) {
		val tmpA = a
		a = b
		b += tmpA
		seedCopy -= 1
	}
	println(a)
}
