fun main(args:Array<String>) {
    // Any, Unit, Nothing

    // Any: every type in Kotlin except null. Equal to the Object in Java which is the root of all classes.
    // The following is an example, but not professional. Normally types will be used.
    val anyNumber: Any = 42
    val anyString: Any = "String"

    // Unit: refers to Unit object. Similar to void in Java

    add()

    // Nothing: Indicates that a fun does not return anything, but also never completes.
    doNothing()

}

// Nothing is returned. In java this would be void.
// Declaring 'Unit' is optional.
fun add(): Unit {
    val result = 2 + 5
    println(result)
}

// Will run forever.
fun doNothing(): Nothing {
    while(true) {

    }
}