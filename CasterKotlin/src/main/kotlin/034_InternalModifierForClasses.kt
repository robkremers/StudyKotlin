import classes.Truck
import classes.Vehicle

fun main() {
    // 3:47:02 Internal Modifier for Classes
    /**
     * In this situation the handling of axes has to be restricted and kept with the current package.
     *
     */

    val vehicle = Vehicle("Red")
    val truck = Truck("Blue")
    // It is possible to set the (number of) axles here.
    vehicle.addAxle(4)

}