fun main(args:Array<String>) {
    // Loops
    // While loop
    var x = 1;
    while (x < 100) {
        x = x + (x + 1)
        println(x)
    }
    println()

    // Repeat-While Loops - do-while loop
    /**
     * It differs from the while loop in that the condition is evaluated at the end of the loop
     * rather than at the beginning.
     * This means (see also below) that the loop code will be executed even if te condition will not be met.
     */
    x = 100; // So x does not meet the condition. However it will pass the do {} functionality and 201 will be printed.
    do {
        // Loop code
        x += (x + 1);
        println(x);
    } while (
        // Condition
        x < 100
    )

    println()
    // Continue here: 2:27:31.
    // The use of a break out of a loop
    x = 1;
    while (true) {
        x = x + (x + 1)
        println(x)
        if (x >= 100) {
            break
        }
    }
}