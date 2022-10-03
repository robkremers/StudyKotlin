fun main() {
    // Function Arguments

    doWork("Rob", 32, true)
    doWork("John", 24, false)
}

fun doWork(name: String, age: Int, isHappy: Boolean) {
    println("$name, your age is $age.")
    println("You are happy? $isHappy")
}