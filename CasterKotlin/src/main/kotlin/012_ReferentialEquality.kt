import classes.Person

fun main() {
    // Referential equality
    // Keep in mind that numbers are actually also Objects!

    // However 'primitives' are treated as such.
    var a = 12
    var b = 12

    println(a == b) // true
    println(a === b) // true

    // Now instance of Classes are created. At least what we are used to.
    var person1 = Person("Donn", "Felker")
    var person2 = Person("Donn", "Felker")
    println(person1 == person2) // false
}
