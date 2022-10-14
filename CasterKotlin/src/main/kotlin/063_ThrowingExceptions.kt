fun main() {
    // 7:27:06 Throwing Exceptions
    // 7:29:54 Creating a Custom Exception
    // 7:32:44 Catching Exceptions with Try/Catch
    // 7:36:09 Catching Multiple Exception Types
    // 7:40:43 Try/Catch/Finally blocks
    // 7:44:52 Try/Catch vs Try/Finally

    /**
     * TypeAliases.kt:
     * @SinceKotlin("1.1") public actual typealias Exception = java.lang.Exception
     */

    data class Person(val name: String, val age: Int)
    class InvalidAgeException(val age:Int, message: String): IllegalArgumentException("Invalid age: $age. $message")

    fun checkAge(person: Person) {
        if (person.age < 18) {
            throw InvalidAgeException(person.age, "User is below the age level of 18.")
        }
    }

    val person: Person = Person("Donnie", 13)
//    if (person.age < 18) {
//        throw InvalidAgeException(person.age, "User is too young.")
//    }

    try {
        checkAge(person)
        println("Done")
    } catch(exception: Exception) {
//        println("The exception is caught.")
//        throw Exception(exception.message, exception)
        when(exception) {
            is InvalidAgeException -> println("Invalid age")
            is IllegalArgumentException -> println("Illegal argument")
            else -> throw Exception(exception.message, exception)
        }
    } finally {
        println("Finally")
        // e.g. here a stream can be closed. ??? In Java the construction does this automatically???
    }

}