fun main() {
    // 6:31:33 Kotlin Sequences
    // Understanding how Sequences and mapping operations work.
    // https://winterbe.com/posts/2018/07/23/kotlin-sequence-tutorial/
    // https://kotlinlang.org/docs/lambdas.html

    listOf("A", "B", "C")
        .filter {
            println("filter: $it")
            true
        }
        .forEach {
            println("forEach: $it")
        }

    /**
     * .filter will be eagerly executed.
     * Each mapping operation will create a new List.
     * This can potentially slow down the performance.
     *
     * The result is:
     * filter: A
    filter: B
    filter: C
    forEach: A
    forEach: B
    forEach: C
     */

    println("------------------")
    /**
     * Sequences are evaluated lazily.
     */
    sequenceOf("A", "B", "C")
        .filter {
            println("filter: $it")
            true
        }
        .forEach {
            println("forEach: $it")
        }
    /**
     * filter: A
    forEach: A
    filter: B
    forEach: B
    filter: C
    forEach: C
     */

    /**
     * Because of it's nature it is recommended that in case of large Lists a Sequence will be better performing.
     * Check this site:
     * https://winterbe.com/posts/2018/07/23/kotlin-sequence-tutorial/
     */
}