import classes.Person
import classes.SimplePerson


fun main(args:Array<String>) {
    // Class
    // Data takes the form of properties.
    // The behaviour is implmented using methods.

    // Creating an object from Person Class.
    val silvStallone = Person("Silvester", "Stallone");
    println(silvStallone.fullName);

    var person1 = SimplePerson("Jack");
    var person2 = person1;

    println(person1);
    println(person2);

    /**
     * The class instances are stored in the heap.
     * The references to instances of the classes are stored in the stack unless the reference is part of a class
     * in which case the instance is, being part of the class instance, also stored in the heap.
     * 
     */


}