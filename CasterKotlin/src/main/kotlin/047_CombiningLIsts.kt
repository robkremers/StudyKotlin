fun main() {
    // 5:51:03 Combining Lists with the Union Operator

    data class Person(val name: String)

    val people = listOf(
        Person("Donn"),
        Person("Jake"),
        Person("Janet"),
        Person("Kavita")
    )

    val morePeople = listOf(
        Person("Donn"),
        Person("Jake"),
        Person("Janet"),
        Person("Kavita"),
        Person("Kevin"),
        Person("Cathy")
    )

    val uniqueValues = people.union(morePeople)
    uniqueValues.forEach{ println(it)}


}