import java.lang.Thread.sleep
import kotlin.random.Random

fun main() {
    // 8:02:26 Lazy Initializer Block

    /**
     * The lazy block will have the calculation executed once.
     * Reason for using this is that the calculation is expensive.
     * The result will be cached anyway.
     * See:
     * C:\Users\robkr\.m2\repository\org\jetbrains\kotlin\kotlin-stdlib\1.7.10\kotlin-stdlib-1.7.10-sources.jar!\kotlin\util\LazyJVM.kt
     * for more information.
     *
     */
    val result = lazy { someExpensiveOperation() }
    println(result)
    println("Is Initialized: ${result.isInitialized()}")
    println(result.value)
    println(result.value)
    println(result.value)

}

fun someExpensiveOperation(): Int {
    println("Computed")
    sleep(1000)
    return Random(System.currentTimeMillis()).nextInt()
}