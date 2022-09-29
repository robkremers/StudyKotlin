fun main(args:Array<String>) {
    // Basic Control Flow
    // 1 - Comparison Operators == != < <= > >=

    // Again: this can be declared using Type Inference
    var yesVariable: Boolean = true
    var noVariable: Boolean = false

    // Boolean Operators
    var doesOneEqualTwo = (1 == 2)
    println(doesOneEqualTwo)

    doesOneEqualTwo = (1 != 2)
    println(doesOneEqualTwo)

    doesOneEqualTwo = !(1 == 2)
    println(doesOneEqualTwo)

    doesOneEqualTwo = (1 >= 2)
    println(doesOneEqualTwo)
    doesOneEqualTwo = (1 <= 2)
    println(doesOneEqualTwo)

    doesOneEqualTwo = (1 > 2)
    println(doesOneEqualTwo)

    // Etc.

    // 2 - Logic Operators
    // AND operator <==> &&
    // OR operator <==> ||
    var andConstant = true && true
    println(andConstant)

    andConstant = false && false
    println(andConstant)
    andConstant = true && false
    println(andConstant)

    var orConstant = true || true
    println(orConstant)
    orConstant = true || false
    println(orConstant)
    orConstant = false || false
    println(orConstant)

    // Continue here: 1:42:37.
    val andTrue = (1 < 5 && 50 < 100)
    println(andTrue);

    // 3 - String Equality
    val x = "kotlin"
    val yEqualsx = x == "java"
    println(yEqualsx)

    var z = "php" < "java"
    println(z)
    z = "a" < "java"
    println(z)


}