fun main(args:Array<String>) {

    // Kotlin is Strongly Typed.

    // Constants: can not be changed anymore
    val number: Int = 10        // Int: Stores integers
    val pi: Double = 3.14159    // Double: Stores decimals; has about double the precision of Float.
    val k: Float = 6.34345654F  // Float: Lower precision than Double.

    // Variable.
    var alsoANumber: Int = 10

    alsoANumber = 12

    var personAge: Int = 99
    var personName: String = "John"

    // 33.12: Conversion
    var x: Int = 7
    var y: Double = 3.14

    x = y.toInt()
    y = x.toDouble()

    println(x) // Result: 3. So the decimal part has been removed.

    // Numbers
    val s:Short = 12
    val b:Byte = 120
    val i:Int = -10000
    val l:Long = 23984573945
    val f:Float = 7234.234F         // Only in a Float it is necessary to specify that it is a Float, using an 'F' or 'f'.
    val d:Double = 834957.456456

    // Type of answer (not declared with a type): receives the type of the variable with the largest size.
    val answer = s + b + i + l

    println(answer)

    // Continue: 45:05.
    // Char. In Kotlin Chars are not treated like numbers.
    // You can only add one character to a Char variable (of course). Single quotation is used.
    val letter:Char = 'K'   // This is the preferred way.
    // or
    val letter2 = 'K'       // Implicit declaration: Type Inference. Can be used for any type.
    // Not possible:
//    val letter3: Char = 65  // The integer literal does not conform to the expected type Char

    println(letter)

    // Booleans: Have 2 possible values: true of false.
    val flag: Boolean = true
    println(flag)

    // Strings
    // String variables are instances of class String.
    val stringA: String = "Hello Master Coding Channel"     // String Literal
    println(stringA)

    // Concatenation
    val stringB: String = "Hi "
    val stringC: String = "Friends"
    println(stringB + stringC)  // Concatenation like in Java.
    val stringD:String = stringB + stringC
    println(stringD)

    // String Template. Kotlin typical.
    val stringN:String = "Jack"
    val stringK:String = "Hello my name is $stringN"
    println(stringK)
}