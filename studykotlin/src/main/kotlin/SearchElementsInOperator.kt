fun main(args:Array<String>) {

    val namesArray = mutableListOf("Ali", "Mohammad", "Jack", "Perla");

    // Check for the existence of an element inside an array.
    println("Checking for Jack: ${namesArray.contains("Jack")}");
    println("Jack" in namesArray);
    println("Checking for John:" + "John" in namesArray);

    println(isFound("John", namesArray));

    // Modifying Lists.
    // 1 - Appending elements: takes place at the end of the list.
    namesArray.add("Sara"); // [Ali, Mohammad, Jack, Perla, Sara]
    println(namesArray);

    namesArray += "Bill"; // [Ali, Mohammad, Jack, Perla, Sara, Bill]
    println(namesArray);

    // 2 - Inserting elements at specific positions / index.
    namesArray.add(2, "Lara"); // [Ali, Mohammad, Lara, Jack, Perla, Sara, Bill]
    println(namesArray);

    // 3 - Removing elements from Array / List.
    // Note: this concerns a mutable list.
    // Continue here: 6:01:45.
    var isRemoved: Boolean = namesArray.remove("Jack");
    println(namesArray); // Jack has been removed.
    println(isRemoved); // true
    isRemoved = namesArray.remove("Someone");
    println(isRemoved); // false
    namesArray.removeAt(0);
    println(namesArray); // [Mohammad, Lara, Perla, Sara, Bill] : Ali has been removed.

    // 4 - Update elements
    namesArray[2] = "Pamela";
    println(namesArray); // [Mohammad, Lara, Pamela, Sara, Bill] Perla has been replaced by Pamela.

    /**
     * If an index outside the boundary of the list is used an IndexOutOfBoundsException is raised.
     */
//    println(namesArray[12]); // namesArray only has 5 elements.

    // 5 - Sorting elements
    namesArray.sort();
    println(namesArray); // [Bill, Lara, Mohammad, Pamela, Sara]

    println();
    // 6 - Iterating through a list.
    for (name in namesArray) {
        println(name);
    }
    println("\nUsing namesArray.forEach. In this situation 'it' is a pre-conditioned variable.");
    namesArray.forEach { println(it) };
}

fun isFound(name: String, namesArray: MutableList<String>): Boolean {
    return name in namesArray;
}