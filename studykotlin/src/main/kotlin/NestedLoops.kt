fun main(args:Array<String>) {
    // Nested Loops.
    // Continue here tomorrow: 3:10:17.

    /**
     * Task:
     * Print the following:
     * 1 2 3 4
     * 1 2 3 4
     * 1 2 3 4
     * 1 2 3 4
     */

    for (i in 1..4) {
        for (j in 1..4) {
            print("${j} ")
        }
        println()
    }
    println()

    // Exercise 2: print out the multiplication table like below:
    /**
     * 1  2  3  4  5
     * 2  4  6  8 10
     * 3  6  9 12 15
     * 4  8 12 16 20
     * 5 10 15 20 25
     */

    for (row in 1..5) {
        var seed: Int = row;
        for (column in 1..5) {
            var output =  seed * column;
            print(output.toString().padEnd(3, ' '))
        }
        println();
    }
    println();

    // Exercise 3: idem, but skip specific lines using 'continue'.
    for (row in 1..5) {
        if (row % 2 == 0) {
            continue
        }
        var seed: Int = row;
        for (column in 1..5) {
            var output =  seed * column;
            print(output.toString().padEnd(3, ' '))
        }
        println();
    }
}