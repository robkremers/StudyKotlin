fun main() {
    // 5:53:53 Iterating over a List with an Index

    data class Person(val name: String)

    val people = listOf(
        Person("Donn"),
        Person("Jake"),
        Person("Janet"),
        Person("Kavita")
    )

    // Using .foreach {} you do not have access to the index of the list.
    // In order to access the index nonetheless an overload method is available.

    people.forEachIndexed { index, person -> println("Index: $index, Person: $person") }



}
