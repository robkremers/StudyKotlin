import enums.AccountType
import java.util.*

fun main() {
    // 2:46:56 Creating an Enum

    /**
     * Account types:
     * Bronze
     * Silver
     * Gold
     * Platinum
     */

    println(AccountType.GOLD)

    val accountTypeFromApi: String = "gold"
    val accountType = AccountType.valueOf(accountTypeFromApi.toUpperCase())
    println(accountType)
    println(accountType == AccountType.GOLD) // true

    val user = ShowUseEnums("Rob", "Kremers", AccountType.PLATINUM)

    println(AccountType.GOLD)
    println(AccountType.GOLD.discountPercent)
    println(AccountType.GOLD.numberOfSubscriptions)

    val value = AccountType.valueOf("Platinum".uppercase(Locale.getDefault()))
    println(value)
    println(value.discountPercent)
    println(value.numberOfSubscriptions)
}

class ShowUseEnums(var firstName: String, var lastName: String, var accountType: AccountType = AccountType.BRONZE) {

    fun fullName(): String = "$firstName - $lastName"

    override fun toString(): String {
        return fullName()
    }
}
