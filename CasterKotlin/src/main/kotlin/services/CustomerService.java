package services;

import extensions.StringExtensions;
import models.CustomerDataClass;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    // 8:56:38 Calling Kotlin from Java
    // 8:59:39 Calling Java from Kotlin
    // 9:04:51 Calling an Extension Function from Java
    // 9:07:50 @JvmName Annotation

    /**
     * The pitfall of using Kotlin in Java may be the difference between 'val' and 'var'.
     * (for simple situations).
     *
     */

    public void processCustomer(CustomerDataClass customer) {
        boolean customerHasLongName = customer.customerHasLongName();

        /**
         * The class only has a getter defined. Reason: the 'name' property is a 'val' so readOnly.
         * If a setter is required the 'name' property should be a 'var'.
         */
        customer.getName();
        customer.setName("A name");
    }

    /**
     * Implementation below is not important.
     *
     * The @NotNull below is a safeguard that will tell Kotlin that nog null parameter will be returned here.
     */

    @NotNull
    public CustomerDataClass customerFromSocial(String handle) {
        CustomerDataClass customer = new CustomerDataClass("Bob");
        // 9:04:51 Calling an Extension Function from Java:
        // ExtensionsKt.initals() has been defined in:
        // CasterKotlin\src\main\kotlin\extensions\Extensions.kt

        /**
         * // 9:07:50 @JvmName Annotation
         * The use of 'Kt'in the name of 'ExtensionsKt' is a bit clunky.
         * The use of @file:JvmName(<name>) enables the use of a more standardized name.
         * See for the use: CasterKotlin\src\main\kotlin\extensions\Extensions.kt
         * --> @file:JvmName("StringExtensions")
         */

        String initials = StringExtensions.initals(customer.getName());
        System.out.println(initials);
        return new CustomerDataClass("Bob");
    }

    @NotNull
    public List<CustomerDataClass> processCustomers() {
        return new ArrayList<>();
    }
}
