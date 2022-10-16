@file:JvmName("StringExtensions")
package extensions

// 9:07:50 @JvmName Annotation

/**
 * Purpose:
 * A String function that prints the initials of a full name.
 * We can write an extension function for this purpose.
 */
fun String.initals(): String {

    var values: List<String> = listOf()
    if (this.equals("")) {
        return ""
    }
    if (this.contains( ' ')) {
        values = this.split(' ')
    } else {
        values = listOf(this)
    }
    var firstInitials: String = ""
    values.forEach {
        firstInitials = firstInitials.plus(it.substring(0,1))
    }
//        for( value in values) {
//            var initial = value.substring(0, 1)
//            println("Initial: $initial")
//            firstInitials = firstInitials.plus(initial) // For some reason the .plus does not work.
////            firstInitials = firstInitials + initial
//            println("Initials: $firstInitials")
//        }

    return firstInitials
}

fun Int.isAdult(): Boolean {
    return this >= 18
}