import java.util.*

fun main(args:Array<String>) {
    // Lambdas
    // Continue here: 7:04:10
    // See also:
    // https://kotlinlang.org/docs/lambdas.html
    // https://play.kotlinlang.org/byExample/04_functional/02_Lambdas
    // https://www.baeldung.com/kotlin/lambda-expressions
    // A Lambda expression is a anonymous function. So a function without a name.
    // It can be assigned to a variable.
    /**
     * Syntax:
     * val lambdaName : Type = { argumentList -> codeBody }
     * The only part of a lambda that isn’t optional is the codeBody.
     *
     * Predicates:
     * kotlin.jvm.functions.*
     */
    var multiplyLambda: (Int, Int) -> Int;

    // Lambdas are code blocks enclosed in curly braces.
    multiplyLambda = {a: Int, b: Int ->  a * b    };

    val lambdaResult = multiplyLambda(7, 10);
    println(lambdaResult);

    // Shorthand Lambda
    multiplyLambda = {a, b -> a * b };

    // The use of it
    // https://kotlinlang.org/docs/scope-functions.html#context-object-this-or-it
    // Can be used if there is only one parameter.
    // https://www.baeldung.com/kotlin/lambda-expressions
    // it represents any lone that argument we pass to the lambda function.

    var doubleLambda = { a: Int -> 2 * a; };
    // Shortened Lambda:
    doubleLambda =  { 2 * it};

    var square: (Int) -> Int = {it * it};
    square = {number: Int -> number * number};
    println(square(2));

    // Continue here: 7:17:37.

    var filter = { a: Int -> a > 0 };
    var printHello = { println("Hello")}

    val another  : String.(Int) -> String = { this + it}; // Concatenation + implicitly turning an Int into a String.
    val another2 : String.(Int) -> String = { this + it };
    println(another("Hello", 2));

    val calculateGrade = {grade: Int ->
        when(grade) {
            in 0..54 -> "Fail"
            in 55..79 -> "Pass"
            in 80..100 -> "Distinction"
            else -> false
        }
    }
    println(calculateGrade(75));

    val array = arrayOf(1, 2, 3, 4, 5, 6);
    array.forEach { item: Int -> println(item * 4) };
    // Shorthand:
    array.forEach { println(it * 4) };

    val checkSize: (Double) -> Boolean = { arg: Double -> arg >= 0}

    val lambda = { arg: Double ->
        arg == 4.329
    }

    println(invokeLambda(lambda));

    val numbers = arrayOf(1, 5, 2, 4, 8);
    numbers.sort();

    // Custom sorting.
    val names = arrayOf("AAA", "NNNN", "RR", "CCCCC");
    println("\nSorting");
    names.sorted();
    names.forEach { println(it) };

    // Or:
    println(Arrays.toString(names));

    // Now sort the names by length.
    val namesByLength = names.sortedWith( compareBy{
        -it.length
    });
    namesByLength.forEach{ print(it + " ")};
    println();
    println(namesByLength);

    // Continue here: 7:26:11
    println("\nIterating Collection using Lambda:")
    var values = listOf(1, 2, 3, 4,5);
    values.forEach{
        println("${it}: ${it * it}");
    }
    println("\nUse of filter:");
    values = listOf(6, 8, 10, 17, 5);
    val largerThanTen = values.filter{ it > 10};
    println(largerThanTen); // 17

}

fun multiplyFunction(a: Int, b: Int): Int {
    return a * b;
}

/**
 * Accepts a Lambda as an argument.
 */
fun invokeLambda(lambda: (Double) -> Boolean): Boolean {
    return lambda(4.329);
}