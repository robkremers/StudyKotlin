import classes.Constants
import classes.User

fun main() {
//    var user = User("Rob", "Kremers", true)
//    user.firstName = "Rob"
//    user.lastName = "Kremers"
//    user.printFullName()
//    user.updateName("Roberto")
//    user.printFullName()
//    user.printWithPrefix("Mr.")
//    user.printFirstNameLength()

    var friend = User("Jane", "Doe")
//    friend.firstName = "Jane"
//    friend.lastName = "Doe"
//    friend.printFullName()
//    friend.printWithPrefix("Ms.")
//    friend.printFirstNameLength()
     println(friend.fullName);
    friend.fullName = "Johanna"
    println(friend.fullName)
    println(friend.age)

    friend.favoriteColor = "Green"
    friend.sayHi()
    friend.updateFullNameWithSuffix("Ms.")

    val userFoo = User.createUser("foo", "bar")
    println(userFoo)

    val users: List<User> = User.createUsers(5)
    println(users)
    users.forEach{ println(it)}

    val users2: List<User> = User.users
    users2.forEach { println(it) }

    // The constant is now a singleton defined in class User.
    println(User.MAX_AGE)
    // The constant is now a singleton defined in a static class.
    println(Constants.MAX_AGE)
}