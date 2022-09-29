package classes

/**
 * 'open' means that the class can be inherited.
 * A class that inheritable is called a super-class.
 */
open class Person(
    var firstName: String,
    var lastName: String) {

    val fullName: String
        get() = "${firstName} ${lastName}";

    // 'open' here indicates that the method can be overridden.
    open fun fullName() = "${firstName} ${lastName}";

}