fun main() {

    var message: String = "Hello, \nMy name is Rob Kremers. \nHow are you?"
    println(message)

    /**
     * Result:
     * Hello,
     * My name is Rob Kremers.
     * How are you?
     */
    // Alternatively use the triple quotes:
    // the .trimIndent() will remove the indentation that is present before the words.
    message = """
        Hello,
        My name is Rob Kremers.
        How are you?
    """.trimIndent()
    println(message)

    message = """
        Hello,
        My name is Rob Kremers.
        How are you?
    """
    println(message)

    message = """
        >>>Hello,
        >>>My name is Rob Kremers.
        >>>How are you?
    """.trimMargin(">>>") // Default: removes pipes '|'
    println(message)

    var name: String = "Rob"
    var age: Int = 32
    // String Interpolation
    println("Hello $name, your age is $age and your name is ${name.length} characters long.")
    // Hello Rob, your age is 32 and your name is 3 characters long.

}
