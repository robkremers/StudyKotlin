import java.util.*

fun main() {

    /**
     * Double Quote: String
     * Single Quote: Char
     *
     * If a value of character variable is a digit, you can explicitly convert it to an Int number using the digitToInt() function.
     *
     * Strings are immutable. Once you initialize a string, you can't change its value or assign a new value to it.
     * All operations that transform strings return their results in a new String object, leaving the original string unchanged.
     * (just like in Java).
     */

    var fullName: String = "Rob Kremers";
    println(fullName.length)
    println(fullName.replaceFirstChar { it.lowercase(Locale.getDefault()) })
    println(fullName.lowercase())

    val firstName = "Rob"

    val c: Char = 'c'

    // Special characters that require a '\'.
    // Char: 16-bit Unicode Character.
    // Examples:
    val newLine: Char = '\n'
    val tab: Char = '\t'

    var foo: String = "y" //

}
