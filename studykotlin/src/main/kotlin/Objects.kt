import classes.Student
import classes.studentRegistry

fun main(args:Array<String>) {
    // Objects
    // kotlin-reference.pdf
    // Object expressions and declarations; pg. 356 / 1318.
    // Continue here: 7:59:26. Read first the above mentioned reference.

    /**
     * Object expressions create objects of anonymous classes, that is, classes that aren't explicitly declared with the class
     * declaration.
     * Such classes are useful for one-time use.
     * You can define them from scratch, inherit from existing classes, or implement interfaces.
     * Instances of anonymous classes are also called anonymous objects because they are defined by an
     * expression, not a name.
     *
     * Of an object only a single instance can be created: Singleton pattern.
     */


    val helloWorld = object {
        override fun toString() = "Hello World!";
    }

    println(helloWorld);

    val ab: A = object: A(1) {
        override val y = 15;
    }
    println( ab.y);

    val cInstance = C();
    cInstance.getObject();
    cInstance.getObjectA().funFromA();
    cInstance.getObjectB();

    val myClassInstance = MyClass.create();
    val myClassIntstance2 = MyClass.create();

//    // Examples from the course:
//    val student1 = Student("Ali", "Stallone");
//    val student2 = Student("Jack", "Sparrow");
//
//    /**
//     * So no specific creation. Just imported.
//     */
//    studentRegistry.addStudent(student1);
//    studentRegistry.addStudent(student2);
//
//    studentRegistry.printAllStudents();




}

open class A(x: Int) {
    public open  val y: Int = x;
}

interface AI {
    fun funFromA() {};
}
interface BI {}

class C {
    // The return type is Any. x is not accessible.
    fun getObject() = object {
        val x: String = "x";
    }

    // The return type is A; x is not accessible.
    fun getObjectA() = object: AI {
        override fun funFromA() {};
        val x: String = "x";
    }

    // The return type is B; funFromA() and x are not accessible.
    fun getObjectB(): BI = object: AI, BI { // explicit return type is required.
        override fun funFromA() {};
        val x: String = "x";
    }
}

// An object declaration inside a class can be marked with the companion keyword:
class MyClass {
    companion object Factory {
        fun create(): MyClass = MyClass();
    }
}