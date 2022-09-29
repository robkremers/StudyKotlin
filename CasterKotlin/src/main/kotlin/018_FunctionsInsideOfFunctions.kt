fun main() {
    sayHello()
}

// Functions within functions can be messy so usually are not done.
fun sayHello() {
    println("Hello")

    // Can't be called here, because it's being used before the declaration of the function.
    // sayBye()

    // Scope of this function is inside sayHello(), so only exists in function sayHello().
    fun sayBye() {
        println("Bye")
    }

    // Here it can be called because it's after the function declaration.
    sayBye()
}
