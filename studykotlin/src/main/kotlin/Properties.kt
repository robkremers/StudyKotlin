import classes.Address
import classes.Circle
import classes.Contact
import classes.TV

fun main(args: Array<String>) {
    // Properties

    val contact1 = Contact("Jack", "Sparrow", "jacksparrow@gmail.com");

    // Access the properties.
    val namey = contact1.fullName;
    val emaily = contact1.emailAddress;

    println(namey);
    println(emaily);

    // contact1.fullName is a val and therefore cannot be reassigned.
    println(contact1.fullName);

    println(contact1.type);

    contact1.type = "Family";
    println(contact1.type);

    // Property initalizer.
    val address = Address();
    println(address.address1); // empty space.
    println(address.address2); // null.

    // Custom Getter.
    val tv = TV(53.93, 95.87);
    val size = tv.diagonal; // 110.
    println(size);
    tv.width = tv.height;
    println(tv.diagonal); // 76.

    // Custom Setter.
    tv.diagonal = 70;
    println(tv.width); // 61.010287598718456
    println(tv.height); // 34.31828677427913

    // Lazy Property
    // Continue here: 8:57:01.
    /**
     * A property is set to be lazy if the calculation will take a lot of resources.
     */
    val circle = Circle(5.0);
    // Only now the lazy property Circle.pi is calculated.
    println("The circumference is ${circle.circumference}"); // The circumference is 31.415926535897935



}