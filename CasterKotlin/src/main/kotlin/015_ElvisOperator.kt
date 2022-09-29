fun main() {
    // The Elvis Operator
    var lastName: String? = "Kremers"

    // This would normally cause an error, because the length is non-nullable.
//    var length: Int = lastName?.length // null, 6

    // Alternative: will return a non-null value.
    var length: Int = if (lastName != null) lastName.length else 0;

    // Alternative: the Elvis operator: ?:
    length = lastName?.length?:0

    // Or:
    length = lastName?.substring(0, 2)?.length ?:0


}
