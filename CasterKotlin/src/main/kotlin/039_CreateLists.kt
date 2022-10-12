import classes.User
import java.util.*

fun main() {
    // 4:47:06 Creating Immutable Lists
    // 4:52:46 Creating Mutable Lists
    // 5:00:47 Filtering a List
    // 5:06:28 Finding Items in a List
    // 5:12:44 Using "filterNot" on a List
    // 5:14:10 filterTo and filterNotTo on Lists

    val items = listOf(1, 2, 3, 4, 5)
    items.forEach { println(it) }
    // An immutable List does not contain the method 'add'.

    val users = listOf(User("Rob", "Kremers"), User("Jane", "Doe"))

    val firstUser = users.first()
    println(firstUser)

    val name: String? = null
    val stuff: List<String> = if(name == null) emptyList<String>() else listOf(name)

    println(stuff.isEmpty())

    // 4:52:46 Creating Mutable Lists

    val mutableItems = mutableListOf<Int>(1, 2, 3, 4, 5)
    mutableItems.forEach{ println(it)}

    mutableItems.add(6)
    println(mutableItems)
    println(mutableItems[1])

    // Etc. lots of possibilities

    val names = listOf("Donn", "Bob", "Jane", "Jenny", "Tushar", "Kavita", "Donovan")

    var filtered = names.filter { it != "Donn"}
    println(filtered)

    filtered = names.filter { it.lowercase(Locale.getDefault()).contains("a")}
    println(filtered)

    val ages = listOf( 23, 33, 12, 9, 17, 19, 99)
    var adults = ages.filter { it -> it > 17 }
    adults = ages.filter ( ::isAdult )
    println(adults)

    // 5:06:28 Finding Items in a List
    var result = names.find { it == "FOOBAR"}
    println(result)
    /**
     * Result: null
     * Reason: see the implementation
     * @kotlin.internal.InlineOnly
    public inline fun <T> Iterable<T>.find(predicate: (T) -> Boolean): T? {
    return firstOrNull(predicate)
    }
     --> null is a possibility in the implementation.
     */

    // Instead use first:
    result = names.first { it == "Donn"} // If nothing is found: NoSuchElementException
    println(result.length) // Result: 4 --> 4 characters.

    result = names.firstOrNull{ it == "FOOBARR"}
    println(result?.length) // Result: null; no exception.

    result = names.first { it.lowercase().contains("don") }
    println(result)

    // 5:12:44 Using "filterNot" on a List
    var resultList = names.filterNot { it.contains("a") } // Opposite of names.filter {}
    println(resultList) // Everything that does NOT contain the letter "a".

    // 5:14:10 filterTo and filterNotTo on Lists
    // Handy when moving from one list to another.

    val approved = mutableListOf("Daniele", "Paul")
    names.filterTo(approved, { it.contains("a")}) // Effect: names containing "a" will be added to the approved List.
    println(approved) // Result: [Daniele, Paul, Jane, Tushar, Kavita, Donovan]

    names.filterNotTo(approved, { it.contains("a")}) // Effect: names NOT containing "a" will be added to the approved List.
    println(approved) // [Daniele, Paul, Jane, Tushar, Kavita, Donovan, Donn, Bob, Jenny]



}

fun isAdult(value: Int): Boolean {

    return value >= 18
}