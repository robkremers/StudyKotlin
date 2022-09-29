fun main(args:Array<String>) {
    // Sets
    // 1 - Creating Sets
    var names = mutableSetOf(
        "Ali",
        "Lara",
        "Mohammad",
        "Jack",
        "Sami",
        "Ali"
    );
    println(names); // [Ali, Lara, Mohammad, Jack, Sami].
                    // Note that 'Ali' occurs only once. A set is an unordered collection of unique elmeents.

    // 2 - Create a Set from an Array.
    val gradesArray = arrayOf(8, 3, 4, 5, 8);
    var gradesSet = mutableSetOf(*gradesArray); // Notice the '*'!!!
    println(gradesSet); // [8, 3, 4, 5]. Again: only unique elements. The '8' is only present once.

    // 3 - Accessing Elements of a Set.
    // Determining whether an element is present in the Set names.
    println(names.contains("Lara")); // true
    println(names.contains("Bill")); // false

    // Or:
    println("Jack" in names); // true
    println("Bill" in names); // false

    // Accessing elements:
    println(names.first()); // Not necessary the first in the Set as defined. The hash is random.

    // 4 - Adding and removing Elements to / from a Set.
    names.add("Rob");
    println(names); // [Ali, Lara, Mohammad, Jack, Sami, Rob]

    names.remove("Rob");
    println(names); // [Ali, Lara, Mohammad, Jack, Sami]
}