import classes.Privilege
import classes.PrivilegedUser

fun main(args:Array<String>) {

    // Visibility Modifiers
    // 1 - public [default modifier]
    // 2 - private
    // 3 - protected
    // 4 - internal // If you mark it as internal, it will be visible everywhere in the same module.

    val privilegedUser = PrivilegedUser("Jack", "123", 30);
    val privilege = Privilege(1, "No Access");
    privilegedUser.addPrivilege(privilege);
    println(privilegedUser.about());

}