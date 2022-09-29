fun main() {
    /**
     * For read only variables use the 'val' keyword.
     */
    val fullName: String = "Rob Kremers"
    println(fullName)

    // Compiler error: Val cannot be reassigned
//    fullName = "asdfasdf"

    val age: Number = 32
    println(age)

    // Compiler error: Val cannot be reassigned
//    age = 42
}
