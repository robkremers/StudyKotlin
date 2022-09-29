package classes

import interfaces.Vehicle

class Bicycle: Vehicle {

    var speed: Int = 0;

    override fun accelerate() {
        speed = 8;
    }

    // For this method a default implementation has been defined in the interface.
    // I can still override the default implementation.
    override fun stop() {
        super.stop(); // Optional to take the functionality of the default implementation.
        speed = 0;
    }

}