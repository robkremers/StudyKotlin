import classes.Vehicle

fun main() {
    // 2:43:57 Inner Classes

    val myCar = Vehicle()
    myCar.brand = "Fiat"
    myCar.info()

    /**
     * Constructor of inner class SteeringWheel can be called only with receiver of containing class
     */
    val sw = myCar.SteeringWheel()
    sw.info()

    val transmission = Vehicle.Transmission()
    transmission.shift()

}