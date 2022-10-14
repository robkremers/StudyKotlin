import java.util.concurrent.TimeUnit
import kotlin.system.measureNanoTime

fun main() {
    // 6:20:22 Generating Large Sequences
    // 6:23:11 Measuring Performance

    runListAsSequence()

}

fun runList() {
    // Take a good look at the Sequences.kt library to understand measureNanoTime().

    lateinit var list: List<Int>

    // Note that 'measure'is the function defined below.
    measure {
        list = getListOfCustomers()
    }

    measure {
        val average = list.filter { it % 3 == 0 }
            .average();
        println(average) // 2.50000005E7
        println("Done.")
    }

    // Resulting time to calculate: 2559 milliseconds
    /**
     * 2012 milliseconds
    479 milliseconds
    2.50000005E7
    Done.
     */
}

fun runListAsSequence() {

    lateinit var list: List<Int>
    measure {
        list = getListOfCustomers()
    }
    var average:Double = 0.0
    measure {
        average = list
            .asSequence() // Using this will result in running a List as a sequence.
            .filter { it % 3 == 0 }
            .average();
    }
    println(average)
    println("Done.")
}
/**
 * 1927 milliseconds
309 milliseconds
2.50000005E7
Done.
 So definitely an improvement in performance.
 */

/**
 * The parameter block will be a function and has no Unit. It's basically a void.
 * measureNanoTime() will calculate how much time it took for the functionality in the
 * block to execute.
 * Again: see the library content.
 *
 * Potential problem:
 * The Garbage Collection can be executed at any time. That can disturb the calculation.
 */
fun measure(block: () -> Unit) {
    val nanoTime = measureNanoTime(block)
    val millis = TimeUnit.NANOSECONDS.toMillis(nanoTime)
    println("$millis milliseconds")
}

fun getListOfCustomers(): List<Int> {
    return generateSequence(1) { it + 1 }
        .take(50_000_000)
        .toList()
}