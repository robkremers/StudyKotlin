import classes.User

fun main() {
    // 3:01:37 The When Statement (Kotlin Switch Statement)
    // 3:08:19 Exhaustive vs Non-Exhaustive When
    // An  'else' statement must be provided unless absolutely every possibility has been covered.

    val user = User("Rob", "Kremers")

    when(user.firstName) {
        "Rob" -> {
            println("This is Rob")
        }
        else -> {
            println("This is a default")
        }
    }

    val accountCardType: AccountCardType = AccountCardType.GOLD

    /**
     * When the block has not been filled in completely:
     * 'when' expression must be exhaustive, add necessary 'BRONZE', 'SILVER', 'GOLD', 'PLATINUM' branches or 'else' branch instead
     */
    val message: String = returnMessage(accountCardType)
    println(message)

}

enum class AccountCardType {
    BRONZE,
    SILVER,
    GOLD,
    PLATINUM;
}

fun returnMessage(accountCardType: AccountCardType): String {
    /**
     * In this situation all types have to be covered somehow.
     */
    when (accountCardType) {
        AccountCardType.GOLD -> {
            return "Gold Member"
        }
        AccountCardType.BRONZE -> {
            return "Bronze Member"
        }
        AccountCardType.SILVER -> {
            return "Silver Member"
        }
        AccountCardType.PLATINUM -> {
            return "Platinum Member"
        }
        /**
         * The else statement is currently redundant: all cases are covered.
         * However if a new AccountCardType this new type will also be covered if the else statement is present.
         */
        else -> {
            return "Regular Member"
        }
    }
}

enum class Direction {
    NORTH, EAST, SOUTH, WEST
}

fun move(direction: Direction): String {
    return "Move ${direction.name}"
}

fun runInDirection(direction: Direction) {
    when (direction) {
        Direction.NORTH -> move(direction)
        Direction.EAST -> move(direction)
        Direction.WEST -> move(direction)
        Direction.SOUTH -> move(direction)
        // no branch for Direction.SOUTH
    }
}