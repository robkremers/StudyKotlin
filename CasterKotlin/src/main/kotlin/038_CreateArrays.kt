import classes.User

fun main() {
    // 4:40:34 Creating Arrays

    // Creating an Array<Int>.
    var items = arrayOf(1, 2, 3, 4, 5)

//    items.forEach { println( it ) }
    // OR, without using the it keyword.
    items.forEach { value -> println(value) }
    // Other options are also possible.

    // Now an IntArray is returned. NOT and Array<Int>.
    items = intArrayOf(1, 2, 3, 4, 5).toTypedArray()

    var doubleItems = arrayOf(1.0, 2.0, 3.0, 4.1, 5.2)
    var stringIems = arrayOf("Rob", "Kremers")

    var users = arrayOf(User("Rob", "Kremers"), User("John", "Doe"))
    users.forEach { println(it) }
    users = users.plus(User("Jane", "Doe"))
    users.forEach { println(it) }
    users.set(0, User("Foo", "Bar"))
    
}