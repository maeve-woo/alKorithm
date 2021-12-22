package problem.level.two

fun main() {
	fibonacci(100000) // 100000ㄲㅏ지 큰수 다루기
}

fun fibonacci(n: Int) {
	var a: Long = 0
	var b: Long = 1
	var N = n
	var maxIntCnt = 0
	while (N > 0) {
		var tmpA = a
		a = b
		if((b+tmpA) > Int.MAX_VALUE) {
			maxIntCnt += 1
			b = (b+tmpA) - Int.MAX_VALUE
		}
		if(maxIntCnt > 0) {
			maxIntCnt += 1
		}
		b += tmpA
		N -= 1
	}

	println(a % 1234567)
}