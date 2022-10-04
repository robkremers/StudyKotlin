fun main() {
    // Function Overloading.

    printUserInfo("Rob Kremers")
    printUserInfo("Rob Kremers", 60)
    printUserInfo("Jane Doe", 39, "Red")
}

//fun printUserInfo(name: String) {
//    println("Name: $name")
//}

//fun printUserInfo(name: String, age: Int) {
//    println("Name: $name, age: $age")
//}
fun printUserInfo(name: String, age: Int = 0, favColor: String = "") {
    println("Name: $name, age: $age, Favorite Color: $favColor")
}