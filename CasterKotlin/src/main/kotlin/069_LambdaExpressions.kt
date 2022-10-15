import java.util.*

fun main() {
    // 8:21:09 Simple Lambda Expressions

    // val lambdaName: (InputType) -> ReturnType = { arguments:InputType -> body }

    // greeter("Donn") --> "Hello Donn"
    val greeterReturnString: (String, String) -> String = { firstName: String, lastName:String ->
        val modifiedFirstName = firstName.uppercase(Locale.getDefault())
        val modifiedLastName = lastName.lowercase(Locale.getDefault())
        // The last line will give the return. No 'return' keyword is allowed.
        "Hello $modifiedFirstName $modifiedLastName"
    }

    println(greeterReturnString("Rob", "Kremers"))

    val greeterReturnInt: (String, String) -> Int = { firstName: String, lastName:String ->
        val modifiedFirstName = firstName.uppercase(Locale.getDefault())
        val modifiedLastName = lastName.lowercase(Locale.getDefault())
        // The last line will give the return. No 'return' keyword is allowed.
        "Hello $modifiedFirstName $modifiedLastName".length
    }

    println(greeterReturnInt("Rob", "Kremers"))

    // Unit: == void. No return.
    val greeterReturnVoid: (String, String) -> Unit = { firstName: String, lastName:String ->
        val modifiedFirstName = firstName.uppercase(Locale.getDefault())
        val modifiedLastName = lastName.lowercase(Locale.getDefault())
        println("Hello $modifiedFirstName $modifiedLastName")
    }

    println(greeterReturnVoid("Rob", "Kremers")) // Returns kotlin.Unit

    // Kotlin can infer the input- and return-types.
    val greeterReturnVoid2 = { firstName: String, lastName:String ->
        val modifiedFirstName = firstName.uppercase(Locale.getDefault())
        val modifiedLastName = lastName.lowercase(Locale.getDefault())
        println("Hello $modifiedFirstName $modifiedLastName")
    }
    greeterReturnVoid2("Rob", "Kremers") // Now no kotlin.Unit is returned.

    // So in Kotlin a Lambda can be what is between the curly braces. In it's simplest form :-)
    val greeter = { name: String -> println("$name")}
    greeter("Rob Kremers")

}