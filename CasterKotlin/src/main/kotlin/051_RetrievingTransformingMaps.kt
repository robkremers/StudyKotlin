import kotlin.collections.Map

fun main() {
    // 6:08:29 Filtering and Transforming Maps
    // 6:16:30 Using mapNotNull on a Map

    val items = mutableMapOf(
        "NY" to "New York",
        "NJ" to "New Jersey",
        "NM" to "New Mexico",
        "CA" to "California",
        "TX" to "Texas",
        "WA" to "Washington",
        "OR" to "Oregon",
        "NV" to "Nevada",
        "CT" to "Connecticut",
        "FL" to "Florida",
        "AZ" to "Arizona",
        "MN" to "Minnesota",
        "NE" to "Nebraska"
    )

    // The following is also present in Lists.
    if (items.any()) {
        // do something
    } else {
        // do something else.
    }

    if (items.none()) {
        // There are no entries
    } else {
        // There are entries.
    }

    println(items.contains("CT")) // true

    var result = items.filter { it.key == "NY" }
    println(result) // {NY=New York}

    result = items.filter { it.key.contains("N") }
    println(result) // {NY=New York, NJ=New Jersey, NM=New Mexico, NV=Nevada, MN=Minnesota, NE=Nebraska}

    // If instead of .filter the method .filterkey is used 'it' will refer to the original 'it.key'
    result = items.filterKeys { it.contains("N") }
    println(result) // {NY=New York, NJ=New Jersey, NM=New Mexico, NV=Nevada, MN=Minnesota, NE=Nebraska}

    result = items.filterValues { it.lowercase().contains("n") }
    println(result) // {NY=New York, NJ=New Jersey, NM=New Mexico, CA=California, WA=Washington, OR=Oregon, NV=Nevada, CT=Connecticut, AZ=Arizona, MN=Minnesota, NE=Nebraska}

    val filterValues = items.filterValues { it.lowercase().contains("f") }
        .map {
            it.value.substring(0, 3)
        }
    println(filterValues) // [Cal, Flo]

    // A lot more Map methods are available!

    // 6:16:30 Using mapNotNull on a Map
    // Handling of null values

//    val (key1, value1) = Map.entry("key", "value")
//    items.map { (key, value) -> findValueInWebService( Map.entry(key, value)) }

    val itemsFromWebService = items.map(::findValueInWebService)
    println(itemsFromWebService)

//    mapEntry: Map.Entry<String, String> =

    val hashMap: HashMap<String, String> = HashMap<String, String>()
    hashMap.put("bla", "at")
    println(hashMap)

}

fun findValueInWebService(entry: Map.Entry<String, String>): Map.Entry<String, String>? {
    if (entry.key.startsWith("N")) {
        return null
    } else {
        return entry
    }
}