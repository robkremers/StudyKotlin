package classes

class Student2 {

    var firstName: String = "";
    var lastName: String = "";
    var grades: MutableList<Grade> = mutableListOf();
    var credits: Double = 0.0;

    constructor(
        firstName: String,
        lastName: String,
        grades: MutableList<Grade> = mutableListOf(),
        credits: Double = 0.0,
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades.addAll(grades);
        this.credits = credits;
    }

    constructor(
        firstName: String,
        lastName: String,
        grades: MutableList<Grade> = mutableListOf(),
    ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades.addAll(grades);
    }
}