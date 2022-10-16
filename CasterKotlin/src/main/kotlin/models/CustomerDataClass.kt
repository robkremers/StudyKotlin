package models

data class CustomerDataClass(var name: String) {
    // 8:56:38 Calling Kotlin from Java
    // 9:11:15 Kotlin REPL (Read- Eval- Print- Loop)

    /**
     * - https://kotlinlang.org/docs/run-code-snippets.html
     *
     * https://play.kotlinlang.org
         Kotlin Playground: Edit, Run, Share Kotlin Code Onlinehttps://play.kotlinlang.org
     */

    fun customerHasLongName() = name.length > 10

}