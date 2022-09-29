fun main(xargs:Array<String>) {
    // Advanced Control Flow
    // When expression; behaves like the Switch in Java.
    val number:Int = 1;

    when(number) {
        0 -> println("It is zero");
        1 -> println("It is one");
        else -> println("Non Zero");
    }
    println();

    val name = "Udemy"
    when(name) {
        "Udemy", "Coursera", "Linda", "Plurals" -> println("Learning System: ${name}");
        else -> println("Not learning systems");
    }

    // Returning Values of when Expression
    val aNumber:Int = 9;
    val numberName = when(aNumber) {
        2 -> "two";
        3 -> "three";
        5 -> "five";
        9 -> "nine"
        else -> {
            println("Unknown Number");
        }
    }
    println(numberName); // nine.

}