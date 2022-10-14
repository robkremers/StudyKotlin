fun main() {
    // 7:11:36 Safe Casting with 'as'

    val obj: Any = getStuff2("2")

    /**
     * Exception in thread "main" java.lang.ClassCastException:
     * class java.lang.String cannot be cast to class java.lang.Integer
     * (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
     */
//    val casted: Int = obj as Int

    // Better:
    var casted: Int = if (obj is Int) obj else 0
    println(casted)

    // Still better: Use a safe cast.
    // Here a Nullable Int? is used.
    // If a parameter is nullable you can us 'as?' as a safe cast to prevent an exception.
    var castedSafe = obj as? Int
    println(castedSafe)

    fun getStuff(value: String): Any {
        return when (value) {
            "1" -> 99
            "2" -> "Hello"
            "3" -> true
            "4" -> 16.1
            else -> false
        }
    }
}

fun getStuff2(value: String): Any {
    return when (value) {
        "1" -> 99
        "2" -> "Hello"
        "3" -> true
        "4" -> 16.1
        else -> false
    }
}
