fun main() {
    // 2:36:09 The lateinit modifier
    /**
     * Will be used very often in combination with Spring / Quarkus since often a property will be
     * autowired.
     */

    val user = ShowUseLateInitModifier("Rob", "Kremers")
    user.favoriteCity = "Delft" // Initialization.
    println(user)


}

class ShowUseLateInitModifier(var firstName: String, var lastName: String) {

    /**
     * lateinit: will be initialized at a later stage.
     * Because of this it has to be a var.
     * If not initialized this will throw an exception:
     * Exception in thread "main" kotlin.UninitializedPropertyAccessException: lateinit property favoriteCity has not been initialized
     */
    lateinit var favoriteCity: String
    fun fullName(): String = "$firstName - $lastName"

    override fun toString(): String {
        return fullName() + "'s Favorite City is $favoriteCity"
    }
}