fun main(args: Array<String>) {



    // if / else conditions
    var calories: Int = 1400

    if (calories > 2000) {
        println("You've consumed all your calories for the day.")
    } else if (calories > 1500) {
        println("You have a few more calories left to eat!")
    } else if (calories > 1200) {
        println("You have some room for snacks!")
    }
    else {
        println("You still have some calories left.")
    }

    // One Line if / else conditional
    val age: Int = 17
    if (age > 10) {
        println("The age is greater than 10.")
    }
    // Could be put on one line:
    if (age > 10) println("The age is greater than 10.")
    // Note: is usually not done. Against codeing convention.

}
