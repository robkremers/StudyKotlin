fun main() {

    /**
     * Ref. 2: pg. 288 Basic Types
     *
     * In Kotlin, everything is an object in the sense that we can call member functions and properties on any variable.
     * Overview of primitives.
     * These number types all implement the abstract class Number.
     * So actually these primitives are not primitives at all.
     */

    val myByte: Byte = 8 // 8-bit signed integer
    val myShort: Short = 16 // 16-bit signed integer
    val myInt: Int = 32 // 32-bit signed integer
    val myLong: Long = 64L // 64-bit signed integer. Here the 'L' is not obligatory if the type is explicit.

    // decimals
    val myFloat: Float = 32.00F // 32-bit floating point number. The 'F' indicator is obligatory.
    val myDouble: Double = 64.00 // 64-fit floating point number

    println(myByte.toDouble()) // Result: 8.0 ==> so the Byte number is turned into a Double number.
    println(myByte.toDouble()::class) // Result: double (Kotlin reflection is not available)
    println(myByte.toLong()) // Result: 8. So is turned into a Long number.
    println(myByte.toLong()::class) // Result: long.

    val bigLong: Long = 1_000_000_000 // Allows for easier reading. Does also exist in Java.
    println(bigLong) // Result: 1000000000

    val newInt = myInt + 12
    println(newInt) // Result: 44.
    // Or use the built-in methods
    val newInt2 = myInt.plus(14)
    println(newInt2) // Result: 46.


}
