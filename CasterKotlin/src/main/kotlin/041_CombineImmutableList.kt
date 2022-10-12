fun main() {
    // 5:19:39 Combining Immutable Lists

    val mine = listOf("Apples", "Grapes")
    val theirs = listOf("Oranges", "Pears", "Strawberries")
    val others = listOf("Kiwi", "Watermelon")

    // Combining the immutable Lists.
    val result = mine.plus(theirs).plus(others)
    println(result)

    result.minus(theirs)
    println(result.minus(theirs))
    println(result.minus("Kiwi"))


}

