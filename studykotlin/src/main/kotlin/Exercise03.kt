fun main(args:Array<String>) {
    // Exercise 3:
    // Write a Kotlin program, that checks the position of a 3D point with respect to the three axes.

    // In the following way a global variable is declared.
    val (x, y, z) = Triple(0, 10, 10);
    when {
        x == y && y == z -> println("x = y = z");
        z == 0 -> println("On the X/Y plane");
        y == 0 -> println("On the X/Z plane");
        x == 0 -> println("On the Y/Z plane");
        else -> println("Ordinary point");
    }
}