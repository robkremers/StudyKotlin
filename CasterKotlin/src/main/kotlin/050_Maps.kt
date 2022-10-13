fun main() {
    // 5:56:59 Immutable Maps
    // 6:00:49 Mutable Maps

    /**
     * Note that in this case the Map functionality is defined in:
     * - C:\Software\Java\17\lib\src.zip!\java.base\java\util\Map.java
     *   So not from Kotlin!
     */

    // Map: key-value pairs.
    val states = mapOf(
        "NY" to "New York",
        "NJ" to "New Jersey",
        "CA" to "California"
    )

    var result = states.get("FL")
    // Can be replaced with;
    result = states["FL"] // Variable 'result' initializer is redundant
    println(result) // result: null
    result = states.getOrDefault("FL", "UNKNOWN_VALUE")
    println(result) // result: UNKNOWN_VALUE
    result = states.getOrElse("FL", { "Foo" })
    println(result)

    var isPresent = states.containsKey("FL")
    println(isPresent)

    val setOfStates = states.entries
    setOfStates.forEach { (key, value) -> println("Key: $key, Value: $value") }

    println(states.keys) // [NY, NJ, CA]
    println(states.values) // [New York, New Jersey, California]

    // 6:00:49 Mutable Maps

    var items = mutableMapOf(
        "NY" to "New York",
        "NJ" to "New Jersey",
        "CA" to "California"
    )

    items.put("TX", "Texas") // So now it's possible to add a key-value item.
    // Or: change into an assignment call.
    items["TX"] = "Texas"
    println(items)

    items.remove("NY")
    println(items)

    items.put("NJ", "Joisey")
    println(items) // Result: {NJ=Joisey, CA=California, TX=Texas} --> The value of key 'NJ' has been replaced.
    // If you do not want to override a value:
    items.putIfAbsent("NJ", "Jersey")
    println(items) // Result: {NJ=Joisey, CA=California, TX=Texas} --> 'NJ' already has a value so will not be overwritten.

    // Remove
    items.remove("NJ")
    println(items) // {CA=California, TX=Texas}
    // Remove only if both key and value combination are present:
    items.put("NJ", "New Joisey")
    items.remove("NJ", "New Joisey")
    println(items)
    items.put("NJ", "New Jersey")
    items.remove("NJ", "New Joisey")
    println(items) // {CA=California, TX=Texas, NJ=New Jersey} -- > NJ is not removed: the key - value combi did not match.

    // Add in case it does not exist
    items.getOrPut("UT", { "Utah" } ) // Note the lambda-expression
    println(items) // {CA=California, TX=Texas, NJ=New Jersey, UT=Utah}

    items.clear()
    println(items) // {}



}