fun main(args:Array<String>) {

    // Pair and Triples
    // (x,y) or (x, y, z)
    // Type Inference works here too. But the preferred way is to explicitly declare the type.

    val coordinates2:Pair<Int,Int> = Pair(1, 2)
    println("The Coordinates: $coordinates2")
    val coordinates3:Pair<Int,Int> = 2 to 4                   // Using "to" operator
    println(coordinates3)

    val coordinates4 = Pair(4.1, 2) // Type Inference.
    println("the x Coordinates: ${coordinates2.first} and ${coordinates2.second}")

    val coordinates3D: Triple<Int, Int, Int> = Triple(1, 2, 3)
    println("The 3D coordinates + ${coordinates3D}")
    // Type Inference
    val coordinates3D_2 = Triple(4, 5, 6)
    println("The 3D Coordinates + ${coordinates3D_2}")

    val x = coordinates3D.first
    val y = coordinates3D.second
    val z = coordinates3D.third

    println("z of coordinates3D:  ${coordinates3D.third}")

}