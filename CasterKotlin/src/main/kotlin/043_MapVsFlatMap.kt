fun main() {
    // 5:29:40 Map vs FlatMap

    // Showing the difference between Map and FlatMap.

    val groceryBags = listOf(
        ShoppingBag(listOf("Grapes", "Apples", "Oranges")),
        ShoppingBag(listOf("Milk", "Eggs", "Pasta")),
        ShoppingBag(listOf("Bread", "Naan", "Cake"))
    )

    val retailBags = listOf(
        ShoppingBag(listOf("Shirt", "Pants", "Trousers")),
        ShoppingBag(listOf("Socks", "Shoes")),
        ShoppingBag(listOf("Jacket", "Sweater", "Scarf"))
    )

    val groceries = groceryBags.flatMap { it.items }
    println(groceries)
    val clothes = retailBags.map { it.items }
    println(retailBags)
    println(clothes)

}

class ShoppingBag(val items: List<String>)