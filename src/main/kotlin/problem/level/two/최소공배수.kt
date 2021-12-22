package problem.level.two

fun main() {
 println(최소공배수(listOf(2,4,6,8,14)))
}

fun 최소공배수(array: List<Int>): Int {
	val max: Int = array.maxOrNull()!!
	var r = 0
	var min = 0
	for(i: Int in array) {
		val tmpR = max % i
		if(tmpR > r) {
			r = tmpR
			min = i
		}
	}
	return max * r * min
}