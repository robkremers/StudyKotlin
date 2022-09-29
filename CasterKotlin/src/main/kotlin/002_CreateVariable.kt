fun main() {
    // 'var' is used to create variables.
    /**
     * Type Inference:
     *  the compiler is (often) able to determine the type.
     *
     *  Ref. 2:
     *  Library code should always specify return types of public/protected functions and properties explicitly thus never relying
    on type inference for public API. Subtle changes in type inference may cause return types to change inadvertently, leading
    to binary compatibility issues.
      */

    var fullName: String = "Rob Kremers"
    println(fullName)
    fullName = "Roberto Crematorio"
    println(fullName)
    fullName = ""
    println(fullName) // Will be printed although fullName is empty.

    println(fullName.isEmpty())

}
