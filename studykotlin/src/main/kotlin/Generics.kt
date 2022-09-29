fun main(args:Array<String>) {
    // Generics
    // Continue here: 10:10:29

    /**
     * Check Collections.kt for examples of Generics.
     * Example:
     * public fun <T> listOf(vararg elements: T): List<T> = if (elements.size > 0) elements.asList() else emptyList()
      */

    val list: List<String> = listOf("element1", "element2", "element3");

    // Continue here: 10:15:50

    // Generics - List

    val numberList = mutableListOf(1, 2);
//    numberList.add("Jack"); // Not allowed. Type

    val anyList: MutableList<Any> = mutableListOf(1, 2);
    anyList.add("Jack"); // Allowed because now I have specified that values of any type can be added to the list.
    println(anyList);

}