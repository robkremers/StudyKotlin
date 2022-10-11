package enums

enum class AccountType(val discountPercent: Int, val numberOfSubscriptions: Int) {
    BRONZE(10, 1),
    SILVER(15, 5),
    GOLD(20, 10),
    PLATINUM(25, 15 )
}