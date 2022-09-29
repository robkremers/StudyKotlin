package classes

class Cats(birthDate: String): Mammal(birthDate ) {
    override fun consumeFood() {
        println("Comsuming 400 calories per day.");
    }
}