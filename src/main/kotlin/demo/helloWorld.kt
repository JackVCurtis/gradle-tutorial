package demo

fun getGreeting(): String {
	val text = """
		This is a block of text.
		I can type new lines at will.
		The power, it is beyond imagining.
	"""

    return text
}

fun main(args: Array<String>) {
    println(getGreeting())
}