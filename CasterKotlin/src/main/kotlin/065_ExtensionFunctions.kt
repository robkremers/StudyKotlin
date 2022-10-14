import extensions.initals
import extensions.isAdult
import java.util.*

fun main() {
    // 7:50:38 Extension Functions

    /**
     * https://kotlinlang.org/docs/extensions.html
     * Kotlin provides the ability to extend a class or an interface with new functionality
     * without having to inherit from the class or use design patterns such as Decorator.
     * This is done via special declarations called extensions.
     *
     * For example, you can write new functions for a class or an interface from a third-party
     * library that you can't modify.
     * Such functions can be called in the usual way, as if they were methods of the original class.
     * This mechanism is called an extension function.
     * There are also extension properties that let you define new properties for existing classes.
     *
     * Example:
     * To declare an extension function, prefix its name with a receiver type,
     * which refers to the type being extended.
     * The following adds a swap function to MutableList<Int>:
     * fun MutableList<Int>.swap(index1: Int, index2: Int) {
     *  val tmp = this[index1] // 'this' corresponds to the list
     *  this[index1] = this[index2]
     *  this[index2] = tmp
     * }
     *
     * https://www.baeldung.com/kotlin/extension-methods
     *
     * Tip from the course leader:
     * - Add the extensions in a separate extensions.kt file.
     * - Can also be done for a custom class.
     */

    val name = "Robert Johan Willem Kremers"

//    val uppercase = name.let { n -> n.uppercase(Locale.getDefault())}
//    val uppercase1 = name.uppercase(Locale.getDefault())
//    println(name)
//    println(uppercase)
//    println(uppercase1)

    println(name.initals())

    val a = "Hello"
    val b = "Rob"
    val c = a.plus(" ").plus(b)
    println(c)

    val age = 35
    println(age.isAdult()) // Result: true

    data class Person(val firstName: String, val lastName: String, val age: Int)

    val person = Person("Robert", "Kremers", 89)
    // An extension functiom to a custom Class
    fun Person.fullName() = "$firstName $lastName"
    println("Initials: "+ person.fullName().initals())


}