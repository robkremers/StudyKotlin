package classes

sealed class Shape {

    class Circle(val radius: Int): Shape()
    class Square(val sidelength: Int): Shape()

}