fun main() {
    var x = sayHi()
    println(x) // Returns kotlin.Unit

    var y = sayHi2()
    println(y)
}

// Even if a function does nothing it will return kotlin.Unit.

// The type with only one value: the Unit object. This type corresponds to the void type in Java.
fun sayHi(): Unit {
    println("Hello World")
}

// A 'return' expression required in a function with a block body ('{...}')
fun sayHi2(): String {
    return "Hello World"
}
