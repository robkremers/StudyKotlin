import classes.Order
import classes.Person
import classes.PersonDataClass

fun main() {
    // 3:15:09 Data Classes
    // 3:19:27 Data Class with Parameterless Constructor: constructor with default values.
    // 3:20:40 Data Class: Component1-N functions
    // 3:24:15 Destructuring Data Classes
    // 3:27:47 Copying Data Class Instances

    val person1 = Person("Rob", "Kremers")
    val person2 = Person("Rob", "Kremers")

    // The following creates the expected results.
    println(person1 == person2) // false
    println(person1)    // classes.Person@58372a00
    println(person2)    // classes.Person@4dd8dc3

    /**
     * In case of a Data Class Kotlin will actually compare the values. Not the object itself.
     * Kotlin will override: equals / hashcode / toString.
     */
    val personDataClass1 = PersonDataClass("Rob", "Kremers")
    val personDataClass2 = PersonDataClass("Rob", "Kremers")
    val personDataClass3 = PersonDataClass()
    println(personDataClass1 == personDataClass2) // true
    println(personDataClass1)   // PersonDataClass(firstName=Rob, lastName=Kremers)
    println(personDataClass2)   // PersonDataClass(firstName=Rob, lastName=Kremers)

    println(personDataClass3)

    /**
     * A Data Class contains component functions
     * https://kotlinlang.org/docs/data-classes.html
     * The componentN is in order of declaration unless named parameters are being used.
     */
    val myFirstName = personDataClass1.component1()
    val myLastName = personDataClass1.component2()
    println("$myFirstName - $myLastName")

    // destructuring declarations:
    val (firstName, lastName, age) = personDataClass1
    println(firstName)
    println(lastName)
    println(age)

    // Declaration of the instance with the input parameters being completely out of order
    val personDataClass4 = PersonDataClass(age=60, lastName = "Kremers", firstName = "Rob")
    // The components are available in the order of definition in the data class.
    println(personDataClass4.component1())
    println(personDataClass4.component2())
    println(personDataClass4.component3())

    // 3:27:47 Copying Data Class Instances
    // Use the built-in copy method

    val personDataClass5 = PersonDataClass("Rob", "Kremers", 60)
    println(personDataClass5)

    // It is possible to change the value of some or all parameters.
   val sibling = personDataClass5.copy(firstName = "Sam", age = 40)

    println(sibling)

    // This can be useful e.g. when multiple instances of a class with small changes need to be created
    // This is apparently not a deep copy, but the instances will be added to a List.
    val order = Order(amount = 100, customer = personDataClass5)
    println(order) // Order(amount=100, customer=PersonDataClass(firstName=Rob, lastName=Kremers, age=60))

    val newOrder = order.copy(amount = 200)
    println(newOrder)


}

