fun main(args:Array<String>) {

    // Exercise 1: Give the results of these constants.
    val q1 = true && true
    val q2 = false || false
    val q3 = (true && 1 != 2) || (4 > 3 && 100 < 1)
    val q4 = ((10 / 2) > 3) && ((10 % 2) == 0)

    println(q1) // true
    println(q2) // false
    println(q3) // !!! so true || false returns false.
    println(q4) // true && true

}