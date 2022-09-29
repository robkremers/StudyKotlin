fun main(args:Array<String>) {
    // Advanced Control Flow
    /**
     * Ranges: presenting a sequence of countable integers.
     * for loop
     * when expression
     *
     */

    // Ranges
    // 1 - Closed range:
    val cr = 0..5 // from 0 to 5 inclusive, ascending.
    println(cr)

    // 2 - Half-Open range:
    val hor = 0 until 5 // from 0 to 4 inclusive, ascending.
    println(hor)

    // How to make a decreasing range:
    val dr = 5 downTo 0 // from 0 to 5 inclusive, descending.

    // For loop
//    for (<CONSTANT> in <RANGE>) {
//      <loop code>
//    }
    var sum = 0
    // So in Kotlin in the for loop the i will automatically be instantiated, contrary to the situation in Java.
    for(i in 1..10) {
        sum += i;
    }
    println("sum = ${sum}")

    // Repeat loop
    sum = 0;
    var lastSum = 0;
    repeat(10) {
        lastSum++;
        sum += lastSum;
    }
    println("sum = ${sum}")

    // For loop, only using odd numbers. Use the step operator. 1, 3, 5, 7, 9
    println()
    sum = 0;
    for (i in 1..10 step 2) {
        sum += i;
        println("sum = ${sum} using i = ${i}")
    }
    println()
    sum = 0;
    for (i in 10 downTo 1 step 2) { // i = 10, 8, 6, 4, 2
        sum += i;
        println("sum = ${sum} using i = ${i}")
    }
}