package problem.basic.sort

fun main() {
	sortByAge(listOf(Pair("a", 20), Pair("b", 20), Pair("c", 30), Pair("d", 19)))
}

fun sortByAge(members : List<Pair<String, Int>>) {
	val copiedMembers = members.sortedBy { it.second }
	println(copiedMembers)
}