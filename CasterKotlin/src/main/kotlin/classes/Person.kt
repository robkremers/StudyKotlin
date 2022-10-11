package classes

open class Person(var firstName: String, var lastName: String) {

    protected var favoriteFood: String = "Unknown"
    // Java:
    // setFavoriteFood(value: String)
    // getFavoriteFood(): String

    fun info() {
        println("This person's name is $firstName $lastName")
    }
}
