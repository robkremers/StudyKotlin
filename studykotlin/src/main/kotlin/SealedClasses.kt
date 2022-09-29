import classes.Shape

fun main(args:Array<String>) {

    // Sealed Class
    /**
     * Kotlin-reference.pdf:
     * Sealed classes and interfaces represent restricted class hierarchies that provide more control over inheritance.
     * All direct subclasses of a sealed class are known at compile time. No other subclasses may appear after a module
     * with the sealed class is compiled. For example, third-party clients can't extend your sealed class in their code.
     * Thus, each instance of a sealed class has a type from a limited set that is known when this class is compiled.
     *
     * In some sense, sealed classes are similar to enum classes:
     * the set of values for an enum type is also restricted, but each enum constant exists only as a single instance,
     * whereas a subclass of a sealed class can have multiple instances, each with its own state.
     * 
     */

    val circle1 = Shape.Circle(4);
    val square2 = Shape.Square(2);

    println(size(circle1));
}

fun size(shape: Shape): Int {
    return when (shape) {
        is Shape.Circle -> shape.radius;
        is Shape.Square -> shape.sidelength;
    }
}