fun main(args: Array<String>) {
    /**
     * Maps in Kotlin: key - value setup.
     * - As in Java keys are unique.
     * - Values do not need to be unique.
     */

    // Creating Maps: Use Map or Function in the standard Kotlin library.
    // 1 - Immutable map (fixed size map).
    var studentsMap = mapOf(
        "Ali" to 17,
        "Lara" to 21,
        "Mohammad" to 20,
        "Jack" to 19,
        "Sami" to 12
    );

    // 2 - Mutable Map (dynamically sized map)
    var studentsMap2 = mutableMapOf(
        "Ali" to 17,
        "Lara" to 21,
        "Mohammad" to 20,
        "Jack" to 19,
        "Sami" to 12
    );

    println(studentsMap2); // {Ali=17, Lara=21, Mohammad=20, Jack=19, Sami=12}
    // Continue here: 6:31:41.
    // Accessing maps by key or get().
    println(studentsMap2.get("Ali")); // or
    println(studentsMap2["Ali"]);

    // Properties
    println(studentsMap2.size); // Returns the number of key/value pairs in the map.
    println(studentsMap2.isEmpty());

    // How to add elements to mutable maps.
    studentsMap2.put("Bill", 15);
    println(studentsMap2); // {Ali=17, Lara=21, Mohammad=20, Jack=19, Sami=12, Bill=15}
    // Updating
    studentsMap2["Bill"] = 16;
    println(studentsMap2); // {Ali=17, Lara=21, Mohammad=20, Jack=19, Sami=12, Bill=16}
    studentsMap2.replace("Bill", 17);
    println(studentsMap2); // {Ali=17, Lara=21, Mohammad=20, Jack=19, Sami=12, Bill=17}

    // Removing key/value pairs.
    studentsMap2.remove("Bill");
    println(studentsMap2); // {Ali=17, Lara=21, Mohammad=20, Jack=19, Sami=12}

    // Iterating through maps.
    println("\nIterating through maps using for-loop:");
    for ( (key, value) in studentsMap2) {
        println("${key} -> ${value}");
    }
    // Iterating through maps; keys only.
    println("\nIterating through maps using for-loop for keys only:")
    for (key in studentsMap2.keys) {
        println("${key}");
    }
    println("\nIterating through maps using foreach:")
    studentsMap2.forEach{ entry: Map.Entry<String, Int> -> println("${entry.key} -> ${entry.value}") };
}