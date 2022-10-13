fun main() {
    // 5:34:15 Set Data Structure (a List with no Duplicates)

    // A normal Set will not contain the items in a given order, like alphabetically.

    // Kotlin-specific: there are always immutable and mutable versions of a Collection type.

    val nameSet: Set<String> = setOf("Donn", "John", "Felicia", "Donn") // A readonly Set.
    println(nameSet) // [Donn, John, Felicia] --> Like in Java a Set will not contain duplicates.

    // Mutable set of Strings.
    val nameMutableSet = mutableSetOf<String>("Rob", "John", "Felicia")
    println(nameMutableSet)
    nameMutableSet.add("Jenny")
    println(nameMutableSet)
    nameMutableSet.add("Rob")
    println(nameMutableSet)

    // Note that the two instances of Person("Rob") are different objects. Therefore they will be shown both.
    // In order to fix this add equals, hashCode, toString methods.
    // If the class will only contain data turn the class into a data class. Now the two instances will be compared
    // and found to be equal. Actually, technically we still have two different objects, but the mentioned checks
    // (equals, hashCode, toString) are already in place.
    val people = setOf<Person>(
        Person("Rob"),
        Person("Rob"),
        Person("Janet")
    )
    println(people) // [Person(name=Rob), Person(name=Janet)]

}

data class Person(val name: String)