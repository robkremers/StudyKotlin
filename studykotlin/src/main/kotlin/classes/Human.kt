package classes

/**
 * In case of inheritance the property should be declared without val / var.
 */
class Human(birthDate: String) : Mammal(birthDate) {
    override fun consumeFood() {
        println("Consuming 1000 calories per day.");
    }

}