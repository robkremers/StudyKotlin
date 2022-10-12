import classes.Person
import java.util.*

fun main() {
    // 5:21:21 List vs Map

    val items = listOf("Donn Felker", "Jane Doe", "Karthik Muhaj", "Peter Parker", "Clark Kent")
    var abbreviations = items.map {
        it.substring(0, 3)
            .uppercase(Locale.getDefault())
    }

    println(abbreviations) // [DON, JAN, KAR, PET, CLA]

    abbreviations = items.map { "FOO" }
    println(abbreviations) // [FOO, FOO, FOO, FOO, FOO]

    abbreviations = items.map {
        val words = it.split(' ')
        // Take the first letter of each word: firstName lastName. Would go wrong if the user had multiple names.
        // The last map is returned. Hence the hint: '^map'.
        words[0].substring(0, 1) + words[1].substring(0, 1)
    }
    println(abbreviations)

    var mapLengths = items.map {
        it.substring(0, 3).uppercase(Locale.getDefault())
    }.map {
        it.length
    }
    println(mapLengths) // [3, 3, 3, 3, 3]

    var sumLength = items.map {
        it.substring(0, 3).uppercase(Locale.getDefault())
    }
        .sumOf {
            it.length
        }
    println(sumLength) // 15

    var namesContainingO = items.map {
        it.substring(0, 3)
            .uppercase(Locale.getDefault())
    }
        .filter { it.contains("O") }
    println(namesContainingO) // [DON]

    namesContainingO = items.map {
        it.substring(0, 3)
            .uppercase(Locale.getDefault())
    }
        .filterNot { it.contains("O") }
        .reversed()
    println(namesContainingO) // [CLA, PET, KAR, JAN]

    val people = listOf(
        PersonName("Donn"),
        PersonName("Jane"),
        PersonName("Bob"),
        PersonName("Kavita")
    )

    val peopleResult = people.map { it.name}
    println(peopleResult) // [Donn, Jane, Bob, Kavita]

    val mapNameLength = people.map { it.name }.map { it.length }
    println(mapNameLength) // [4, 4, 3, 6]

}

class PersonName(val name: String) {}