fun main() {

    // 3:31:17 The Pair and Triple Data Classes
    // Special Data Classes
    // The properties do not necessarily need to be of the same type.
    val pair = "Foo" to "Bar" // Instead of Pair("Foo", "Bar").
    println(pair.first)
    println(pair.second)

    // A Pair is really a Data Class so the componentN functions still exist.
    println(pair.component1())
    println(pair.component2())

    val triple = Triple("Foo", "Bar", 60)
    println(triple.first)
    println(triple.second)
    println(triple.third)

}