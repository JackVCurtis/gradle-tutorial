package demo

fun getGreeting(): String {
    val words = mutableListOf<String>()
    words.add("Hello,")
    words.add("world!")

    return words.joinToString(separator = " ")
}

fun getArray(): Array<String> {
	val asc = Array(6, { (it + 1).toString() })
	return asc
}

fun main(args: Array<String>) {
    println(getArray())
}