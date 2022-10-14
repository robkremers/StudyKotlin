import kotlin.collections.Map
import kotlin.collections.mapOf

fun main() {

    // 7:14:58 Generic Lists and Maps
    // 7:19:50 Your First Generic Class

    val listOfStrings: List<String> = listOf("Donn", "John", "Mary")
    val listOfInts: List<Int> = listOf(1, 2, 3)

    val map: Map<String, Int> = mapOf("Donn" to 1, "Rob" to 2)

    var result = EvenList(listOfStrings)
    println(result.evenItems()) // Result: [Donn, Mary]

    var otherResult = EvenList(listOfInts)
    println(otherResult.evenItems())

    data class Person(val name: String)

    val people = listOf(
        Person("Donn"),
        Person("Bob "),
        Person("Mary"),
        Person("Felicia")
    )
    println(EvenList(people).evenItems())

}

class EvenList<T>(val list: List<T>) {
    /**
     * Function: only return the even elements of the list used to create the instance.
     */
    fun evenItems(): List<T> {
        // .filterIndexed(predicate: (index: Int, T) -> Boolean)
        return list.filterIndexed { index, value -> index % 2 == 0 }
    }
}