import java.lang.Thread.sleep

fun main() {
    // 7:59:14 Lazy Evaluation

    /**
     * https://www.baeldung.com/kotlin/lazy-initialization
     *
     * The concept of ‘lazy initialization’ was designed to prevent unnecessary initialization of objects.
     *
     * Keyword: 'by lazy'
     *
     */

    val name: String by lazy {
        println("Computed")
        sleep(3000) // Long running operation.
        "Donn"
    }
    println(name)
    println(name)

    /**
     * Result:
     * Computed # Is only executed once.
    Donn
    Donn
     */


}