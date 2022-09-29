package classes

class Contact(
    var firstName: String,
    var lastName: String,
    var emailAddress: String,
    var type: String = "Friend",
) {
    val fullName = "${firstName} ${lastName}";


}