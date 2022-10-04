package classes

/**
 * In Kotlin the way to create a Singleton is to use the keyword 'object' instead of 'class'.
 */
object FavoriteFood {

    var name = "unknown"
    var ingredients = mutableListOf<String>()

    fun numberOfIngredients(): Int = ingredients.size
}