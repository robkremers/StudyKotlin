fun main() {
    // 7:02:20 Type Checking with 'is'
    // See: https://medium.com/@m.sandovalcalvo/kotlin-type-system-unveiling-the-mystery-50613f0db893

    /**
     * - Any non-nullable type will extend into Any.
     * - Any nullable type will exten into Any?.
     */

    val age: Any = 32
    val obj: Any = getStuff("1")
    println("Type name: " + obj.javaClass.name)
    if (obj is String) {
        println("It is!")  // Yup!
    } else {
        println("It is not!")
    }

    data class Order(val amount: Int)
    data class Person(val name: String)
}

fun getStuff(value: String): Any {
    return when(value) {
        "1" -> 1
        "2" -> "Hello"
        "3" -> true
        "4" -> 16.1
        else -> false
    }
}


