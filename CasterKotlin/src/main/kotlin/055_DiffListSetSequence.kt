fun main() {
    // 6:44:19 List vs Set vs Map vs Sequence

    // fixed or mutable

    val list = listOf("Donn", "Tushar", "Kavita", "Evelyn", "Felicia")

    /**
     * Set: will contain a number of unique items.
     */
    val set = setOf("Donn", "Tushar", "Donn", "Tushar") // show only 2 items.

    /**
     * Map: a mapping of one element to another: key --> value
     */
    val map = mapOf("Donn" to "Felker", "Tushar" to "Muhaj", "Evelyn" to "Smith")
    val map2 = mapOf( 1 to "Donn", 2 to "Tushar")
    val map3 = mapOf( Person("Donn") to "Android", Person("Tushar") to "iPhone")

    /**
     * used if a List contains a very large number of items.
     * In that case performance is key.
     */
    val sequence = sequenceOf(1, 2, 3, 4, 5)
    list.asSequence()
    map.asSequence()

    data class Person(val name: String)
}