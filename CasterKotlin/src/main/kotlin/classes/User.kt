package classes

/**
 * In case there is only one constructor the 'constructor' keyword is redundant.
 * We can use the 'constructor' keyword implicitly
 *
 * We can use the 'internal' keyword for an internal constructor.
 * class User internal constructor (var firstName: String = "", var lastName: String = "" ) {
 */
//class User constructor(var firstName: String = "", var lastName: String = "" ) {
class User (
    var firstName: String = "",
    var lastName: String = "Smith",
    var isPlatinum: Boolean) {

    /**
     * Multiple init blocks are also possible in Java.
     * Order of execution:
     * - The primary / first constructor (if secondary constructors are calling the primary constructor).
     * - The init block(s).
     * - The secondary constructor.
      */

    /**
     * 'field' is the backing field for the property 'fullName'.
     * get() and set() will
     */
    var fullName = "$firstName $lastName"
        get() = "$field"
        set(value) {
            println("value = $value")
            field = value
        }

    var age: Int = 60
    var favoriteColor: String = "blue"

    init {
        println("Initializer block 1. Called after the primary constructor.")
        println("This class is for user $fullName")
    }
    init {
        println("Initializer block 2")
    }

    // It is possible to create secondary constructors.
    constructor(firstName: String = "",
                lastName: String = "Smith")
                :this(firstName, lastName, false
    ) {
        if (!isPlatinum) {
            println("Platinum is false by default")
        }
    }

    constructor(firstName: String): this(firstName, "Unknown") {
        println("This is the 3d constructor")
    }

//    var firstName: String = ""
//    var lastName: String = ""

    fun printFullName() {
        println("$firstName $lastName")
    }

    fun printWithPrefix(prefix: String) {
        println("$prefix $lastName")
    }

    fun updateName(newFirstName: String) {
        this.firstName = newFirstName
    }

    fun printFirstNameLength() {
        println( {
            firstName.length
        })
    }

    fun sayHi() = println("Hi ${fullName}")

    fun updateFullNameWithSuffix(suffix: String): Unit {
        fullName = "$suffix $fullName"
    }

    /**
     * Companion objects
    If you need to write a function that can be called without having a class instance but that needs access to the internals of a
    class (such as a factory method), you can write it as a member of an object declaration inside that class.
    Even more specifically, if you declare a companion object inside your class, you can access its members using only the class
    name as a qualifier.

     So in Java terms: a static function / object.
     It is a Singletion, attached to the actual class itself.
     */

    companion object {
        // 2:29:09:
        // Definition of constants
        // Must be declared after the constructors (I don't make the rules)
        // Now the constant is scoped to be a singleton.
        const val MAX_AGE: Int = 18

        val users = mutableListOf<User>()

        fun createUsers(count: Int): List<User> {
            for(i in 0..count) {
                users.add( User("FirstName$i", "LastName$i"))
            }
            return users
        }

        fun createUser(firstName: String, lastName: String): User {
            return User(firstName, lastName)
        }
    }

    fun fullName(): String = "$firstName - $lastName"

    override fun toString(): String {
        return fullName()
    }



}