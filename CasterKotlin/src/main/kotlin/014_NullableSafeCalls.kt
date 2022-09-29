fun main() {
    // Nullable Safe Calls

    var firstName: String = "Donn"
    val length: Int = firstName.length // Guaranteed this will not be null.

    var lastName: String? = "Felker"
    // Adding a '?' after lastName is named a safe call.
    var length2: Int? = lastName?.length // This will not compile unless length2 itself is also nullable.

    // Now the safety is not required by Kotlin because it is recognized that length3 will not receive a null value.
    var length3: Int = if (lastName != null)  lastName.length else 0

    // Chain these calls: Multiple safe calls chained.
    // If any of these call can cause a null value the safe call needs to be used.
    var length4 = lastName?.substring(0, 2)?.length

    // The construction above is equivalent to the following:
    if (lastName != null && lastName.length > 1) {
        var length5 = lastName;
    }


}
