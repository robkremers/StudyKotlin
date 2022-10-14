fun main() {
    // 7:01:05 Filtering a List with filterNotNull()
    val names: List<String?> = listOf("Donn", "John", "Mike", null, "Davita", "Jenn", null, "Mihta")

    // Suppose it is required to show all items that are not null.

    val namesThatAreNotNull = names.filterNotNull()
    println(namesThatAreNotNull) // [Donn, John, Mike, Davita, Jenn, Mihta]
    
}