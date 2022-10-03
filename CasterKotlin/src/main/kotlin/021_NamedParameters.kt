fun main() {
    // Named Parameters.
    // Mixing named parameters is allowed.
    // Mixing named parameters and positioned argument.

    // Default arguments can be used.

    printUserInfo(
        firstName = "Rob",
        lastName = "Kremers",
        age = 60,
//        isSunburned = true,
//        likesMovies = true,
//        lovesPopcorn = true
    )

    printUserInfo(firstName = "Donn", lastName = "Felker", age = 32, lovesPopcorn = false)
}

fun printUserInfo(
    firstName: String,
    lastName: String,
    age: Int,
    isSunburned: Boolean = false,
    likesMovies: Boolean = true,
    lovesPopcorn: Boolean = true
) {
    println("$firstName $lastName is of age $age." +
    "Is Sunburned: $isSunburned, Likes Movies: $likesMovies, Loves Popcorn: $lovesPopcorn")
}
