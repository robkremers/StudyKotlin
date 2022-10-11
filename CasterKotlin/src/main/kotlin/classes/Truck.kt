package classes

class Truck(color: String) : Vehicle(color) {

    init {
        // 2 wheels in the front and 4 wheels in the back.
        addAxle(2)
        addAxle(4)
    }
}