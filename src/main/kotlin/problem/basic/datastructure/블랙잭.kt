package problem

fun main() {
	/**
	 * level 1
	 * ç
	 * 1. 카드 중 3개씩 뽑는 모든 경우의 수는 C(n, 3)이며, n은 최대 100이다.
	 * 2. 따라서 단순히 3중 반복문으로 모든 경우의 수를 확인하여 문제를 해결할 수 있다.
	 */
	blackJack(5, 21, listOf(5,6,7,8,9))
	blackJack(10, 500, listOf(93, 181, 245, 214, 315, 36, 185, 138, 216, 295))
}

fun blackJack(cardAmountN: Int, numberSumM: Int, cardList: List<Int>) {
//	var C = cardAmountN * (cardAmountN - 1) * (cardAmountN - 2) / 3 * 2 * 1
	var sum = 0
	var max = 0

	a@ for (i: Int in 0 until cardAmountN) {
		for (j: Int in i + 1 until cardAmountN) {
			for (k: Int in j + 1 until cardAmountN) {
				sum = cardList[i] + cardList[j] + cardList[k]
				if(sum == numberSumM) {
					max = numberSumM
					break@a
				}
				if(sum < numberSumM) {
					if(sum > max) {
						max = sum
					}
				}
			}
		}
	}
	println(max)
}