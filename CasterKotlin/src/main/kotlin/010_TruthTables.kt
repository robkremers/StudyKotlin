fun main(args: Array<String>) {
    // Truth Tables

    /**
     * Logical Conjunction AND
     * p        q       p^q
     * TRUE     TRUE    TRUE
     * TRUE     FALSE   FALSE
     * FALSE    TRUE    FALSE
     * FALSE    FALSE   FALSE
     *
     * Logical Conjunction OR
     * p        q       p v q
     * TRUE     TRUE    TRUE
     * TRUE     FALSE   TRUE
     * FALSE    TRUE    TRUE
     * FALSE    FALSE   FALSE
     */

    val myAge: Int = 32
    val yourAge: Int = 32

    val myName = "Don"
    val yourName = "Tushar"

    if ( (myAge != yourAge) && (myName != yourName)) {
        println("Both items are true")
    } else {
        println("Both items are false")
    }

    if ( (myAge != yourAge) || (myName != yourName)) {
        println("Both items are true or at least one of them is true")
    } else {
        println("Both items are false")
    }

    // The checks will be short-circuited if the first is already wrong but both checks need to be true of both false.
}
