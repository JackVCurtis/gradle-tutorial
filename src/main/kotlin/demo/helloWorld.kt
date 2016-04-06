package demo

fun getGreeting(): String {
	val wordOne = "Hello"
	val wordTwo = "world"

    return "$wordOne, $wordTwo"
}

fun main(args: Array<String>) {
    println(getGreeting())
}