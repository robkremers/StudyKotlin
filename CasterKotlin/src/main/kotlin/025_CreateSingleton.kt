import classes.FavoriteFood

fun main() {
    // Create Singleton

    val x = FavoriteFood
    println(FavoriteFood.name)
    FavoriteFood.name = "Watermelon"
    println(FavoriteFood.name)
    FavoriteFood.ingredients.add("Salt")
    println(FavoriteFood.ingredients.firstOrNull())
    println(FavoriteFood.numberOfIngredients())

    doStuff()
    println(FavoriteFood.name)

    // Exception in thread "main" java.util.NoSuchElementException: List is empty.
    println(FavoriteFood.ingredients.firstOrNull()) // Prints: 'null'

    println(FavoriteFood.numberOfIngredients())

    println(FavoriteFood == FavoriteFood) // true: so there is only one instance of object FavouriteFood.

}

fun doStuff() {
    FavoriteFood.name = "Chicken"
    FavoriteFood.ingredients.clear()
}
