fun main() {
    // 5:39:05 For Loops

    val values = listOf<Int>(1, 2, 3, 4, 5, 6, 7)

    for (number in values) {
        println(number)
    }
    println("**********************")
    val upperLimit = 10
    for (i in 0 until  upperLimit) {
        println(i)
    }
    println("**********************")
    for (i in 0 ..  upperLimit step 2) {
        println(i)
    }
    println("**********************")
    for (i in 10 downTo  0 step 5) {
        println(i)
    }

    val people = listOf(
        Person("Donn"),
        Person("Jane"),
        Person("Karthik")
    )
    println("**********************")
    for (person in people) {
        println(person)
    }

    data class Person(val name: String)

}

