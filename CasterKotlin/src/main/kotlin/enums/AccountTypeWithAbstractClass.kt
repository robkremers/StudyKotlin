package enums

import java.util.*

enum class AccountTypeWithAbstractClass() {
    BRONZE {
        override fun calculatedDiscountPercent(): Int {
            var percent = 5
            // Very difficult calculation
            percent = 5
            return percent
        }
           },
    SILVER {
        override fun calculatedDiscountPercent(): Int = 10
           },
    GOLD {
        override fun calculatedDiscountPercent(): Int = 15
         },
    PLATINUM {
        override fun calculatedDiscountPercent(): Int = 20
    };

    abstract fun calculatedDiscountPercent(): Int

    // 3:00:04 Adding Static Methods to Enums
    companion object {
        fun getAccountTypeByName(name: String) = valueOf(name.uppercase(Locale.getDefault()))
    }
}