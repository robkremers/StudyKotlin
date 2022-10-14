typealias AuthToken = String
fun main() {
    // 7:47:27 Creating a typealias
    /**
     * https://kotlinlang.org/docs/type-aliases.html
     *
     * Type aliases provide alternative names for existing types.
     * If the type name is too long you can introduce a different shorter name and use the new one instead.
     * It's useful to shorten long generic types.
     * For instance, it's often tempting to shrink collection types.
     * Examples:
     *      typealias NodeSet = Set<Network.Node>
     *      typealias FileTable<K> = MutableMap<K, MutableList<File>>
     *      typealias Predicate<T> = (T) -> Boolean
     */

    data class User(val username: String, val authToken: AuthToken)
    data class Account(val authToken: AuthToken)
    data class Order(val authToken: AuthToken)

    val user = User("Donn", "234KJI234-JHBXT320NRTS23")
    /**
     * When choosing user.authToken a hint will be visible that shows the authToken is still a String.
     * The same String operations are still available.
     */
    user.authToken

    Order("my-auth-token")

}