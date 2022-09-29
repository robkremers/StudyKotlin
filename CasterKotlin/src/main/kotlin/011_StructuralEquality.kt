fun main() {
    // Structural Equality
    // == equality
    // != inequality

    var name1 = "Don"
    var name2 = "Tushar"

    println(name1 == name2) // false This is according to Kotlin convention.
    println(name1.equals(name2)) // false

    println(name1 != name2) // true

    name1 = "Don"
    name2 = "Don"

    println(name1 == name2)
    println(name1.equals(name2))

}
