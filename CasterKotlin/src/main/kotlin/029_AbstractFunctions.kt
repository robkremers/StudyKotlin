import enums.AccountTypeWithAbstractClass
import java.util.*

fun main() {
    // 2:55:27 Abstract Functions in Kotlin
    // 2:58:51 Iterating over Enum Values
    // 3:00:04 Adding Static Methods to Enums


    val fromApi = "Gold"
    var accountType:AccountTypeWithAbstractClass = AccountTypeWithAbstractClass.valueOf(fromApi.uppercase(Locale.getDefault()))
    println(accountType.calculatedDiscountPercent())

    println("\nIterating over enums:")
    for (accountType in AccountTypeWithAbstractClass.values()) {
        println(accountType)
    }
    println("\nIterating over enums using forEach:")
    AccountTypeWithAbstractClass.values().forEach { println(it) }

    println("\nThe use of static functions in Enums.")

    accountType = AccountTypeWithAbstractClass.getAccountTypeByName("Gold")
    println(accountType)


}