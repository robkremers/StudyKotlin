fun main() {
    // 5:16:40 Flattening Lists and Arrays

    val mine = listOf("Apples", "Grapes")
    val theirs = listOf("Oranges", "Pears", "Strawberries")
    val others = listOf("Kiwi", "Watermelon")
    val allOfUs = listOf(mine, theirs, others)

    println(allOfUs)
    println(allOfUs.flatten()) // Will add all Lists to one.

    val mineArray = arrayOf("Apples", "Grapes")
    val theirsArray = arrayOf("Oranges", "Pears", "Strawberries")
    val othersArray = arrayOf("Kiwi", "Watermelon")
    val allArrays = arrayOf(mineArray, theirsArray, othersArray)

    println(allArrays)
    println(allArrays.flatten())

}