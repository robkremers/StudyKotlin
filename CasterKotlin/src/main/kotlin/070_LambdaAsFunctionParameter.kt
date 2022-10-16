fun main() {
    // 8:34:29 Lambdas as Function Parameters

    /**
     * References:
     * - https://www.baeldung.com/kotlin/lambda-expressions
     */

    /**
     * val lambdaName: (InputType) -> ReturnType = { arguments:InputType -> body }
     *
     * The last statement of the lambda forms the return type, if any.
     * Kotlin can deduce the return type based on that statement.
     * However occasionally that is not possible and we must explicitly declare the type
     * for the lambda.
      */


//    lineLogger {
//        println("message 1")
//        println("message 2")
//        println("message 3")
//    }

    repeater(3) {
        println("Hello")
    }

    repeaterInt(5) { index ->
        println(index)
        if (index < 3) {
            println("Hello")
        } else {
            println("Goodbye")
        }
    }

    derbyAnnouncer { player: String -> "$player is a great asset to the team" }
}

/**----------------The functions-----------------------------*/

/**
 * lambda: the lambda function that will be executed nrTimes.
 * For a precise understanding see the code of function repeat().
 */
fun repeater(nrTimes: Int, lambda: () -> Unit) {
    repeat(nrTimes) { lambda() }
}

/**
 * The index starts with value '0' and each time the repeat is executed
 * the index will be set one higher. See the repeat functionality.
 * The block has as input value nrTimes and will not return anything: it is Unit (java: void).
 *
 * Note that 'block' is just a name. Could be anything, e.g. 'lambda'.
 */
fun repeaterInt(nrTimes: Int, block: (Int) -> Unit) {
    repeat(nrTimes) { index -> block(index) }
}
// For a good understanding this is the code of the repeater:
/**
@kotlin.internal.InlineOnly
public inline fun repeat(times: Int, action: (Int) -> Unit) {
    contract { callsInPlace(action) }

    for (index in 0 until times) {
    action(index)
    }
}
 */

    /**
     * Input parameter of function derbyAnnouncer is: block: (String) -> String
     * The block will have a String input parameter and will return a String value.
     */
    fun derbyAnnouncer( block: (String) -> String ) {
    val players = listOf(
        "McGwire",
        "Canseco",
        "Honeycutt",
        "Davis",
        "Dawley",
        "Weiss"
    )
    val randomPlayer = players.random()
    println("The next player is ... $randomPlayer")
    val announcer = block(randomPlayer) // value-parameter block: (String) -> String
    println(announcer)
}

fun lineLogger(block: () -> Unit) {
    repeat(5) {println("--------")}
    block()
    repeat(5) {println("--------")}
}