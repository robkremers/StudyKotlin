fun main() {

    /**
     * https://www.baeldung.com/kotlin/lambda-expressions
     *
     * A shorthand of a single argument lambda is to use the keyword ‘it’.
     * This value represents any lone that argument we pass to the lambda function.
     */

    // anonymous function definition
    var calculateGrade = fun(grade: Int): String {
        if (grade < 0 || grade > 100) {
            return "Error"
        } else if (grade < 40) {
            return "Fail"
        } else if (grade < 70) {
            return "Pass"
        }

        return "Distinction"
    }

    println(calculateGrade(5))

    // Lambda expression with explicit Type Declaration although it is strictly not necessary.
    var calculateGrade2: (Int) -> String = { grade : Int ->
        when(grade) {
            in 0..40 -> "Fail"
            in 41..70 -> "Pass"
            in 71..100 -> "Distinction"
            else -> "Erroneous input"
        }
    }

    // Lambda's as class extensions.
    val another : String.(Int) -> String = { this + it }
    println("Test".another(3))

    var intArray = arrayOf(1, 2, 3, 4, 5)

    // longhand
    intArray.forEach { item -> println(item) }

    // Or use the keyword 'it'.
    intArray.forEach { it -> println(it) }

    // shorthand: allways in combination with the keyword 'it'.
    intArray.forEach { println("shorthand: $it")}

    // Implementing Lambdas
    fun invokeLambda(lambda: (Double) -> Boolean) : Boolean {
        return lambda(4.329)
    }



}