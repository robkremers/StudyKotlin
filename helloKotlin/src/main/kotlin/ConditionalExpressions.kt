fun main(args:Array<String>) {
    // Conditional Expression
    var x = 7
    var y = 15

    var min: Int
    if (x < y) {
        min = x
    } else {
        min = y
    }

    var max: Int;
    if (x > y) {
        max = x
    } else {
        max = y
    }

    println("min = ${min} and max = ${max}")

    // making use of returning value of expressions
    min = (if (x < y) x else y)
    max = (if (x > y) x else y)
    println("min = ${min} and max = ${max}")

}