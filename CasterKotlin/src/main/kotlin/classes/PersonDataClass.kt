package classes

/**
 * In a data class the use of the 'val' keyword is obligatory.
 * By providing default values the data class may seem to be constructorless.
 */
data class PersonDataClass(
    val firstName: String = "FirstUnknown",
    val lastName: String = "LastUnknown",
    val age: Int = 0
) {

    fun fullName(): String {
        return "$firstName $lastName"
    }

    fun nameLength(): Int = fullName().length
}