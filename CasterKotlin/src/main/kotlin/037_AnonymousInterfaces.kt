fun main() {
    // 4:35:39 Anonymous Interfaces

    /**
     * Anonymous interfaces are created using the keyword 'object'.
     * Reference:
     * - https://kotlinlang.org/docs/object-declarations.html#object-expressions
     * - https://kotlinlang.org/docs/object-declarations.html#inheriting-anonymous-objects-from-supertypes
     *
     * The Kotlin equivalent of a Java anonymous class.
     */

    var button = Button()
    // button.clickListener receives a pointer to a new instance of class MyListener.
    button.clickListener = MyListener()
    button.click()

    button.clickListener = object : OnClickListener {
        override fun onClick() {
            println("Clicked via an anonymous interface implementation of interface OnClickListener.")
        }
    }
    button.click()

    button.setMyListener(object : OnClickListener {
        override fun onClick() {
            println("Clicked via an anonymous interface implementation of interface OnClickListener via a setter.")
        }
    })
    button.click()
    // Accessing the method On
    button.clickListener.onClick()

//    val map = Map<Any>()
//    map.clickListener = object : OnClickListener {
//        override fun onClick() {
//            println("Clicked via an anonymous interface implementation of interface OnClickListener for a Map.")
//        }
//    }
//    map.click()

}

// Concrete implementation of interface OnClickListener
class MyListener : OnClickListener {
    override fun onClick() {
        println("Clicked via a concrete implementation of interface OnClickListener.")
    }
}

interface OnClickListener {
    fun onClick()
}

open abstract class View {
    lateinit var clickListener: OnClickListener

    fun setMyListener(clickListener: OnClickListener) {
        this.clickListener = clickListener
    }

    fun click() {
        clickListener.onClick()
    }
}

class Button : View()
class Image : View()
class Map<T, U> : View()
