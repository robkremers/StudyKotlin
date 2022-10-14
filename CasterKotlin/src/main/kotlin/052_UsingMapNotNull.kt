import kotlin.collections.Map

fun main() {
    // 6:16:30 Using mapNotNull on a Map

    /**
     * https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/
     * A Map.entry is the
     */


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

    var itemsFromWebService = items.map(::findValueInWebServiceHere)
    println(itemsFromWebService) // The result will contain null values.

    itemsFromWebService = items.mapNotNull(::findValueInWebServiceHere)
    println(itemsFromWebService) // The result will only contain non-null values.

    val entry = itemsFromWebService.get(0)
    println(entry.key)
    println(entry.value)

    // Find out later
    // Now I have a List<MutableMaap<String, String>. Not really what I intended.
    val itemsMapNotNull = items.mapNotNull { it ->
        {
            findValueInWebService3Here(it.key, it.value)
        }
    }
//        .flatMap {  }
    println(itemsMapNotNull)
}

fun findValueInWebServiceHere(entry: Map.Entry<String, String>): Map.Entry<String, String>? {
    if (entry.key.startsWith("N")) {
        return null
    } else {
        return entry
    }
}

//fun findValueInWebService2Here(entry: MutableMap<String, String>): MutableMap<String, String>? {
//        if (entry.keys.contains("N")) {
//            return null
//        } else {
//            return entry.
//        }
//    return null
//}

fun findValueInWebService3Here(key:String, value: String ): MutableMap<String, String>? {
        if (key.contains("N")) {
            return null
        } else {
            return mutableMapOf<String, String>(key to value)
        }
}