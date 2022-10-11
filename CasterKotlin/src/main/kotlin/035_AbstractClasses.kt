fun main() {
    // 3:55:07 Abstract Classes
    // 3:59:45 Implementing an Abstract Class
    // 4:13:30 Understanding Abstractions with Abstract Classes

    var townCar = TownCarClass("Brown", 4, 4)
    var hatchBack = HatchbackCarClass("Silver", 4, 2)
    val lambo = Lambo()
    val acura = Acura()

    driveVehicle(lambo)
    driveVehicle(acura)
    driveVehicle(hatchBack)
    driveVehicle(townCar)

}

fun driveVehicle(vehicle: VehicleClass) {
    vehicle.drive()
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

abstract class TwoDoorCarClass(color: String, numberOfWheels: Int) :
    VehicleClass(color, numberOfWheels, 2) {

    abstract fun driveFast()

    override fun drive() {
        driveFast()
    }

}

class Lambo(): TwoDoorCarClass("Red", 4) {
    override fun driveFast() {
        println("Driving fast.")
    }

//    override fun drive() {
//        // .. Just Drive.
//    }

}

class Acura(): TwoDoorCarClass("blue", 4) {
    override fun driveFast() {
        println("Zoom zoom.")
    }

}

class TownCarClass(color: String, numberOfWheels: Int, numberOfDoors: Int) :
    VehicleClass(color, numberOfWheels, numberOfDoors) {

    override fun drive() {
        println("So smooth")
    }
}

class HatchbackCarClass(color: String, numberOfWheels: Int, numberOfDoors: Int) :
    VehicleClass(color, numberOfWheels, numberOfDoors) {

    override fun drive() {
        println("Driving a hatchback.")
    }
}