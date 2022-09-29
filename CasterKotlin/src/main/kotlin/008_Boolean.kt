fun main() {

    var isBlank: Boolean = false

    println(isBlank)
    println(isBlank.not())

    isBlank = "".isBlank()
    println(isBlank) // true

    isBlank = "Rob".isBlank()
    println(isBlank) // false

}
