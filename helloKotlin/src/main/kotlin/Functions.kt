fun printWelcome(nameUser: String, rating:Int) {
    println("Welcome to our Course ${nameUser}! Your rating is ${rating} stars.");
}

fun double(x: Int): Int {
    return (x + x);
}

fun multiplyNumbers(x:Int, y:Int): Int {
    return x * y;
}

// Overloading Functions
// Method Overloading depends on
// 1 - Type of parameters
// 2 - Number of parameters
// Continue here: 4:20:43.

fun displayMessage(value: Int) {
    println("You entered ${value}");
}

fun displayMessage(value: String) {
    println("You entered ${value}");
}

fun displayMessage(number: Int, value: String) {
    println("You entered ${number} and ${value}");
}


// Functions as variables
// In Kotlin functions are just another data-type.
// Function reference operator: '::'
// The functionvariable can not be used independently but must be passed to another function.
fun sumNumbers(x: Int, y: Int): Int {
    return x + y;
}

var t = ::sumNumbers;

// Passed like this:
fun printResult(t:(Int, Int) -> Int, a:Int, b:Int) {
    val result = t(a, b);
    println(result);
}

fun main(xargs: Array<String>) {
    // Functions.
    printWelcome("Jack", 6);

    val doubleValue = double(2);
    println("doubleValue = ${doubleValue}")
    val multipliedNumbers = multiplyNumbers(2, 5);
    println("multipliedNumbers = ${multipliedNumbers}")

    displayMessage(6);
    displayMessage("A name");
    displayMessage(6, "A name");

//    t(5, 5);
//    println(t); // (Kotlin reflection is not available)
    printResult(t, 4, 2);
}