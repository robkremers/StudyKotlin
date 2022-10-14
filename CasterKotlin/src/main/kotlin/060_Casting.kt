fun main() {
    // 7:08:52 Casting

    val obj: Any = getStuff("5")

    val casted: Person = obj as Person
    // Casting like in any OO language:
    // Now I can use casted.<Person methods / properties>
//    println(casted.name)
    println(casted)

    fun getStuff(value: String): Any {
        return when (value) {
            "1" -> 99
            "2" -> "Hello"
            "3" -> true
            "4" -> 16.1
            "5" -> Person("Donn")
            else -> false
        }
    }

    data class Person(val name: String) {

    }
}