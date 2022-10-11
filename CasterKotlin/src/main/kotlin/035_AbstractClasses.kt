fun main() {
    // 3:55:07 Abstract Classes

    val vehicle = VehicleClass("Red")
}

abstract class VehicleClass(
    var color: String,
    val numberOfWheels: Int,
    valNumberOfDoors: Int
) {
    // Different for the different types of vehicles.
    abstract fun drive()

    // The same for every type of vehicle.
    fun openDoor() {
        // ...
    }

    // Etc.
}

abstract class TwoDoorCarClass(color: String, numberOfWheels: Int) : VehicleClass(color, numberOfWheels, 2) {

    abstract fun driveFast()

}

class TownCarClass(color: String, numberOfWheels: Int, numberOfDoors: Int) :
    VehicleClass(color, numberOfWheels, numberOfDoors) {

    override fun drive() {
        // Very smooth.
    }
}

class HatchbackCarClass(color: String, numberOfWheels: Int, numberOfDoors: Int) :
    VehicleClass(color, numberOfWheels, numberOfDoors) {

    override fun drive() {
        // Very basic.
    }
}