fun main() {
    // Multiple Arguments with Varargs.
    // The 'vararg' keyword should be the last keyword.
    printBookInfo("Green Eggs and Ham", "Dr. Seuss", "Donn Felker", "Jane Doe")
    printBookInfo("Some book without an Author")
}

fun printBookInfo(title: String, author: String) {
    println("$title - Author: $author")
}

//fun printBookInfo(title: String, author: String, author2: String) {
//    println("$title - Authors: $author, $author2")
//}

// Instead use the 'vararg' keyword:
fun printBookInfo(title: String, vararg authors: String) {
    println("$title - Author(s):")
    authors.forEach { println(it) }
    authors.forEach { element -> println("$element") }

}