fun main() {
    // 5:55:28 Ranges

    val i = 12
    if (i in 1..9) {
        println("Yes")
    } else {
        println("No")
    }

    for (i in 0..10 step 2) {
        println(i)
    }
}