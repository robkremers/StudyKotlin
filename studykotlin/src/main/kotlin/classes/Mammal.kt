package classes

/**
 * Because the class is abstract no instance can be created directly from this class.
 */
abstract class Mammal(val birthDate: String) {

    abstract fun consumeFood();
}