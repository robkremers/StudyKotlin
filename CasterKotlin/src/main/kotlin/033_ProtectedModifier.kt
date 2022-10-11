import classes.Chef
import classes.Person
import classes.SousChef

fun main() {
    // 3:33:50 Protected Modifier for Variables
    // A protected property / method is only visible within the class and the classes that inherit from it.
    // 3:40:53 Protected Modifier for Functions


    val person = Person("Rob", "Kremers")

//    person.printMyFavoriteFood()

    val chef = Chef("Bob", "Whatever", "Spareribs")

//    chef.printMyFavoriteFood()
    chef.setMyFavoriteFood("Celery")
    chef.info()
    // Can't use printMyFavoriteFood(): it's protected.
//    chef.printMyFavoriteFood()

    // The init block of SousChef will print the favorite food using the protected method printMyFavoriteFood().
    val sousChef = SousChef("John", "Denver", "Big Mac")




}

