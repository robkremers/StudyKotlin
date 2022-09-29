package classes

/**
 * Being an objects this will be a Singleton.
 */
object studentRegistry {
    val allStudents = mutableListOf<Student>();

    fun addStudent(student: Student) {
        allStudents.add(student);
    }

    fun removeStudent(student: Student) {
        allStudents.remove(student);
    }

    fun printAllStudents() {
        allStudents.forEach {
            println( it.fullName);
        }
    }
}