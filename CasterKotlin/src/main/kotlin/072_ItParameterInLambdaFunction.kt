fun main() {
    // 8:54:24 The 'it' Paramter in Lambda Functions

    /**
     * val lambdaName: (InputType) -> ReturnType = { arguments:InputType -> body }
     */

    repeat(10) {
        index: Int -> println("This is index $index")
    }
    /**
     * The type is clearly Int since the repeat is using 'index' as Int and it has the same type as time.
     * So the type can be left out.
      */
    repeat(10) {
            index -> println("This is index $index")
    }
    /**
     * Actually the parameter can be removed altogether.
     * If there is only one parameter, in this case 'times' by default Kotlin
     * will replace it with 'it' in the function body.
     */
    repeat(10) {
            println("This is index $it")
    }




}