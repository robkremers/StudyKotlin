import classes.Person

fun main() {
    // Nullable Types

    var name: String = "Donn"

    // Null can not be a value of a non-null type String
//    name = null

    // Nullable reference: indicate with '?'
    var name2: String? = "Donn"

    var age: Int? = 32

    var person: Person? = Person("Foo")

    person = null
    
}
