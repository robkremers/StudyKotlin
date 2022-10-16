import java.lang.IllegalArgumentException

fun main(args: Array<String>) {
    // 9:13:52 Project: Setup
    // 9:15:54 Project: Reading Input
    // 9:20:16 Project: Calculator Logic
    // 9:28:04 Project: Adding Validation
    // 9:35:54 Project: Compiling to a Jar File and Execution
    // 9:38:21 Kotlin Koans --> https://play.kotlinlang.org/ --> Test and experiment with the Kotlin code.

    println("Please enter an arithmetic problem...")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")

    var input = readLine()

    while (input != null && input.isNotBlank()) { // Ends if a newline is entered.
        val values = input.trim().split(' ')
//        println(values[0])
//        println(values[1]) // The operator.
//        println(values[2])
        println("Size: ${values.size}")

        if (values.size < 3) {
            println("Invalid input. Expected value + value. Received: ${input}")
        } else {
            val operator = values[1]
            val firstValue = values[0].toDoubleOrNull() ?: throw IllegalArgumentException("Invalid input: ${values[0]}")
            val secondValue = values[2].toDoubleOrNull() ?: throw IllegalArgumentException("Invalid input: ${values[2]}")
            val result = when (operator) {
                "+" -> firstValue + secondValue
                "-" -> firstValue - secondValue
                "*" -> firstValue * secondValue
                "/" -> firstValue / secondValue
                else -> throw IllegalArgumentException("Incorrect operator: ${operator}")
            }
            println(result)
        }
        input = readLine()
    }

    println("Goodbye!")
}