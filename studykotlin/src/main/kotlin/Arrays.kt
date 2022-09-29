import java.util.*

fun main(args:Array<String>) {
    // Arrays.
    /**
     * The index of the first element is 0.
     */

    // Typesafe. So in case of Type Inference mixing different types in the array will lead to a compile time error.
    // Although the numbers 1, 3, 5, 7, 9 are primitives actually an array of objects will be created:
    // Array<T> with T indicating the class of the object.
    // This is called Boxing (like in Java).
    val oddNumbers: Array<Int> = arrayOf(1, 3, 5, 7, 9);
    println(oddNumbers); // prints something like: [Ljava.lang.Integer;@7adf9f5f

    val evenNumbers: IntArray = intArrayOf(2, 4, 6, 8); // Now you have an array of primitives.
    // Other primitive arrays, e.g. doubleArrayOf, exist.
    // Handling with these arrays is faster and is therefore recommended.

    println("Using a for-loop");
    for (element in oddNumbers) {
        println(element);
    }

    println("Using Arrays.toString");
    println(Arrays.toString(oddNumbers));

    println("Using he forEach() function");
    oddNumbers.forEach { println(it)}; // Note: 'it' is a special property.

    val sixSixes = Array(6, {6}); // Array consisting of: 6, 6, 6, 6, 6, 6.



}