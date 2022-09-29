package classes

class Circle(var radius: Double = 0.0) { // Default value = 0.0.

    // Normally the value 3.14... would be used but this is to be calculated as an example of a lazy property.
    private val pi: Double by lazy {
        ((4.0 * Math.atan(1.0/5.0)) - Math.atan(1.0 / 239.0)) * 4.0;
    }

    val circumference: Double
        get() = pi * radius * 2;
}