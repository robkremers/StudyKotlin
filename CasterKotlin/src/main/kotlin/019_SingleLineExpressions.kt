fun main() {
    // Single Line Expressions
    // General Rule of Thumb: not longer that the right line of Marging.

    sayHiHere()

    val age = 12

    // Internal function
//    fun doWork() {
//        if (age < 21) {
//            println("less than 21")
//        } else {
//            println("eligible")
//        }
//    }
    // Turned into a Single Line Expression
    fun doWork() = if (age < 21) println("less than 21") else println("eligible")

    doWork()
}

/**
 * A Single Line Expression.
 */
fun sayHiHere() = println("Hi!")