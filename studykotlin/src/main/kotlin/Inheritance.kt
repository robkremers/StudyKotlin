import classes.Grade
import classes.Person
import classes.Student

fun main(args:Array<String>) {
    // Inheritance
    // Kotlin can inherit from only one other class.

    val jason = Person("Jason", "Statham");
    val  jennifer = Student("Jennifer", "Lopez");

    println(jason.fullName());

    println(jennifer.fullName);
    val gradeHistory = Grade("A", 19.0, 3.0);
    jennifer.recordGrade(gradeHistory);
    println(jennifer.credits);
    println(jennifer.fullName());

    // Polymorphism.
    /**
     * Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
     * Like we specified in the previous chapter; Inheritance lets us inherit attributes and methods from another class.
     * Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.
     */

    // Method overriding.

}