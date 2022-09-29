package interfaces

interface Vehicle {

    fun accelerate()
    fun stop() {
        // Default Method Implementation.
        // This method does not need to be implemented anymore in a class implementing the interface.
        println("Slow Down to Zero Speed");
    }
}