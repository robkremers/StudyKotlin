fun main() {
    // 8:51:37 Underscore Parameters in Lamba Functions
    // Continue here tomorrow.

    // Source: https://www.lipsum.com/feed/html
    val loreTeIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla porttitor neque in ullamcorper venenatis. Praesent eu hendrerit lectus, sed elementum leo. Nam ac neque ut massa tristique vulputate. Nunc vitae pulvinar ex. Sed quis volutpat urna. Phasellus ornare ante eget eros bibendum, eget varius orci tempor. Mauris et pretium ligula, non varius arcu. Proin lacinia est non dui convallis, condimentum porta ante maximus. Ut quis mi eu turpis malesuada faucibus. Aliquam venenatis lorem mi. Etiam pellentesque lorem id risus finibus, sit amet maximus tellus aliquam. Phasellus est ligula, cursus vitae iaculis sed, feugiat ut dolor. Nulla at erat metus. In at aliquet nunc. Nunc non sem tempus, varius magna vel, cursus lectus. Aenean luctus lacus at odio venenatis, id pellentesque augue varius."

    val wordsLoreTeIpsum = loreTeIpsum.split(' ')
    var latinwords = wordsLoreTeIpsum
        .map {
            val length = it.length
            val lastCharacter = it.substring(length - 1, length)
            if (lastCharacter.equals(",") || lastCharacter.equals(".")) {
                it.substring(0, length - 1)
            } else {
                it
            }
        }.toList()

    /**
     *
     * block: A lambda with definition (Int, String) -> Unit)
     * times: the number of times until index that block needs to be executed.
     */
    fun loremIpsum(times: Int, block: (Int, String) -> Unit) {
        repeat(times) { index ->
            val word = latinwords.random()
            block(index, word)
        }
    }

    loremIpsum(5) { Index: Int, word: String ->
        print(word)
        print(" ")
    }
    println("\n--------------------")

    /**
     * Underscore '_' indicates to Kotlin that the parameter will not be used.
     * In this case it is understandable since the repeat function already has an input: times.
     */
    loremIpsum(5) { _, word: String ->
        print(word)
        print(" ")
    }

}

