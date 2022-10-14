fun main() {
    // 6:50:51 Double Bang !! Operator
    // 6:54:58 Using requireNotNull()
    // 6:59:04 Using checkNotNull()

    /**
     * RequireNotNull is used to check input values, typically at the beginning of a method,
     * while checkNotNull is used anywhere to check the current state.
     * Technically they are the same since both methods have exactly the same body,
     * except for a different Exception.,
     */

    /**
     * If we are sure that the returned value will not be null
     * we can use the Double Bang !! operator to indicate that the returned value will never be null.
     */

    var name: String? = "Donn"

    // Here the '?' after the Int is necessary that the input is a nullable parameter.
    var length:Int? = name?.length
    println(length)

    // Here the '?' is not necessary because we tell Kotline that the variable 'name' will never be null.
    // If nonetheless the variable IS NULL a NullPointerException will be thrown.
    var length2: Int = name!!.length
    println(length2)

    data class Person(val name: String)

    var person: Person? = Person("Donn")
    println(person!!.name)

    // 6:54:58 Using requireNotNull()
    // Instead of the !! operator

    var name2: String? = "Donn"
    // Exception in thread "main" java.lang.IllegalArgumentException: Required value was null.
    length2 = requireNotNull(name2).length
    println(length2)

    // Use of an additional message:
    // Exception in thread "main" java.lang.IllegalArgumentException: The name should not be null, but it was.
    length2 = requireNotNull(name2, {"The name should not be null, but it was."}).length
    println(length2)

    // 6:59:04 Using checkNotNull()
    println(requireNotNull(person?.name))

    person = null
    // Exception in thread "main" java.lang.IllegalArgumentException: Person should not be null
//    println(requireNotNull(person?.name, {"Person should not be null"}))

    // Better:
    if (person?.name != null) {
        println("Hi ${person?.name}")
    } else {
        println("Hi")
    }

    if (checkNotNull(person?.name) != null) {
        println("Hi ${person?.name}")
    } else {
        println("Hi")
    }

}