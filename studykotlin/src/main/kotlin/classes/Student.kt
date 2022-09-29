package classes

/**
 * Study: Kotlin-reference.pdf: Data Classes. pg. 338 onwards.
 * - classes whose main purpose is to hold data.
 * - Data classes may extend other classes (see Sealed classes for examples).
 * - if the generated class needs to have a parameterless constructor, default values for the properties have to be specified (see Constructors).
 *   - Example: data class User(val name: String = "", val age: Int = 0)
 * - The compiler only uses the properties defined inside the primary constructor for the automatically generated functions.
 *
 * If inheriting from another class the prefix 'data' can not be used.
 */
class Student (
    firstName: String,
    lastName: String,
    var grades: MutableList<Grade> = mutableListOf(),
    var credits: Double = 0.0
): Person(firstName, lastName) {

    companion object {
        var currentId = 0;

//        fun newStudent(firstName: String, lastName: String): StudentList {
//            currentId += 1;
//            return StudentList(currentId, firstName, lastName);
//        }
    }

    // functions
    // 'open' will allow the Person to use this method.
    open fun recordGrade(grade: Grade) {
        grades.add(grade);
        credits += grade.credits;
    }

    override fun fullName(): String {
        return super.fullName + " :: Hello Student ::";
    }

}