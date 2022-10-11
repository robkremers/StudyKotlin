package classes

open class Vehicle(var color: String = "") {
    var brand: String = "Unknown"

    // Indicates a property that will be initialized later.
    // The vehicle will have a number of axles.
    // Initially: 'public' property exposes its 'internal' type argument Axle
    // internal properties should not be exposed. So make them private.
    private lateinit var axles: MutableList<Axle>

    fun info() = println("$brand and the vehicle has color $color")

    fun addAxle(numberOfWheels: Int) {
        axles.add(Axle(numberOfWheels))
    }

    // 'public' function exposes its 'internal' return type argument Axle.
//    fun getAxleInfo(): List<Axle> {
//        return axles
//    }

    /**
     * The keyword 'inner' gives access to the properties of the higher class.
     */
    inner class SteeringWheel {
        var name = "Leather"
        fun info() = println("$brand is the brand of the vehicle with a $name steering wheel")
    }

    /**
     * A nested class behaves like a static member.
     */
    class Transmission {
        var type = "Automatic"
        fun shift() = println("The vehicle has shifted")
    }
}