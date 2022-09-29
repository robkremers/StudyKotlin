fun main(args:Array<String>) {
    // Lists
    // An Array has a fixed size once created whereas a List is dynamically sized.
    // The use of <T> is not necessary, like in Java.
    var planetList = listOf("Mercury", "Earth", "Mars");
    // Continue here tomorrow: 5:25:25
    println(planetList);

    //Alternatively:
    planetList = arrayListOf("Mercury", "Earth", "Mars"); // However listOf() is preferred.

    // It is not possible to add elements to the list above! Does not have a get method.

    // Starting an empty list. Now it is required to inform Kotlin about the type.
    val emptyList: List<String> = listOf();
    // Or:
    val emptyList2 = listOf<String>();

    // Mutable list
    // Again: Type Inference.
    val mutableList1 = mutableListOf("one", "two");

    mutableList1.add("three");

    // Accessing Elements
    // 1 - Using properties and methods.
    println(mutableList1.isEmpty());
    println(mutableList1.size);
    println(mutableList1.first());
    println(mutableList1.last());

    // 2 - Indexing
    println(mutableList1[0]);
    println(mutableList1.get(1));

    // 3 - Slicing
    val sliced = mutableList1.slice(0..2);
    println(sliced);



}