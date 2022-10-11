package classes

/**
 * In this case I can not use the keyword 'var' or 'val' since it would mean overriding the properties of the superclass.
 */
open class Chef(firstName: String, lastName: String, var favFood: String): Person(firstName, lastName) {
    init {
        favoriteFood = favFood
    }

    /**
     * This is already done by Kotlin. It is recognized as a setter function.
     * So setFavoriteFood(food: String) already exists.
     */
    fun setMyFavoriteFood(food: String) {
        favoriteFood = food
    }

    protected fun printMyFavoriteFood() {
        println(favoriteFood)
    }

}

class SousChef(firstName: String, lastName: String, favFood: String): Chef(firstName, lastName, favFood) {
    init {
        printMyFavoriteFood()
    }

    // Several methods.
}