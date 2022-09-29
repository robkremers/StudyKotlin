fun main(args:Array<String>) {

    // Nullability
    // Resources: https://kotlinlang.org/docs/null-safety.html#safe-calls
    var name = "Jack";
    var age = 29;
    var occupation: String? = null; // Absence of a value. '?' indicates a nullable variable.

    // name = null; // Compilation error.
     occupation = "Developer"; // Type mismatch. Required: Nothing? Found: String

    println(occupation);

    // Check for Null
    var result: Int? = 30; // Nullable variable.

    // Operator call corresponds to a dot-qualified call 'result.plus(1)' which is not allowed on a nullable receiver 'result'.
    // println(result + 1);

    // !! : The not-null assertion operator (!!) converts any value to a non-null type and throws an exception if the value is null.
    var resultPlusOne = result!! + 1;
    println(resultPlusOne);

    // Smart Casting of var: Checking for null in conditions and handle accordingly.
    var enteredName: String = "Jack";   //
    var aName: String;                  // Default value of any String is null.
    var aNameNotNull: String?;          // Can be null.

    if (enteredName != null) {
        name = enteredName;
    } else {
        aNameNotNull = enteredName;
    }
    /**
     * In case of smart casting ensure that this is the last time the variables have been assigned values.
     * Otherwise it is not a safe situation.
     */

    // Elvis Operator: ?:
    /**
     * When you have a nullable reference, b, you can say "if b is not null, use it, otherwise use some non-null value":
     *  val l: Int = if (b != null) b.length else -1
     *  Instead of writing the complete if expression, you can also express this with the Elvis operator ?:
     *  val l = b?.length ?: -1
     */

    var nullableInt: Int? = null;
    var result2 = nullableInt ?: 0;
    println(result2);

    // Safe call operarot: ?.
    var a = "Kotlin";
    var b: String? = null;
    println(a?.length); // Unnecessary safe call because a can not be null once having been assigned a not-null value.
    println(b?.length); // returns 'null'!!! So now you definitely have a variable with a null value.

}