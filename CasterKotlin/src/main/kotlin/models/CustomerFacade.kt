package models

import extensions.initals
import services.CustomerService

/**
 * It is possible to put a 'main' function anywhere and play with some new ideas.
 * Notice: Kotlin will recognize the name 'main'.
 * Using another name will not enable this possibility.
 */
fun main() {
    println("Foo")
}

class CustomerFacade(customerService: CustomerService) {
    // 9:10:21 Top Level Main Functions

    /**
     * - https://kotlinlang.org/docs/java-interop.html
     * - https://www.baeldung.com/kotlin/platform-types
     *
     * Platform types are types of Java declaration.
     * Objects in the Java language are nullable.
     * Therefore, Kotlin can’t check their nullability at compile-time in Kotlin.
     * Additionally, Kotlin’s compiler is not able to issue an error.
     * Moreover, platform types may cause an error at runtime.
     * Therefore, Kotlin’s paradigm of strict null-safety is broken.
     *
     * The notation of platform types is defined as a type with an exclamation mark.
     * For example, String! means that object may be nullable or not.
     */

    /**
     * Note that CustomerDataClass has an exlamation point at the end.
     * val customer: CustomerDataClass! = customerService.customerFromSocial("@exampleUsername")
     * Meaning: that object may be nullable or not.
     * T! means "T or T?"
     *
     * Handling of null in the Java code.
     * If there is access to the java code a check on nullability could be added if not already present.
     * Adding in Java class CustomerService a @NotNull to the method customerFromSocial()
     * will remove the '!'. in the code below: Kotlin recognized the safeguard.
     *
     */
    init {
        val customer = customerService.customerFromSocial("@exampleUsername")

        println(customer.name)

        val customers = customerService.processCustomers()

        customers.map { }

        val initials = customer.name.initals()
    }
}