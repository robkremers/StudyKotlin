fun main() {
    // 6:49:25 Kotlin Ternary Operator: Single Line If

    /**
     * Kotlin does not have a ternary operator.
     */

    var name: String? = null
    // This does not exist in Kotlin
//    val length = name != null ? name.length: 0

    // Instead use a single line statement.
    // Note the difference with a normal if-statement: no return keyword.
    val length: Int = if (name != null) name.length else 0
    println(length)

}