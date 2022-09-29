package classes

class Address { // Empty constructor.

    var address1: String; // must be initialized or be made abstract.
    var address2: String? = null;
    var city = "";
    var state: String; // must be initialized or be made abstract.

    // Initialization of properties.
    init {
        address1 = "";
        state = "";
    }

}