# Kotlin study

[[_TOC_]]

Based on:
- Donn Felker - Freelancing for Software Developers
  - Kotlin Tutorial for Beginners: The Kotlin Programming Language Full 9-hour Kotlin Course
    - https://www.youtube.com/watch?v=wuiT4T_LJQo&list=PL2JJ4C58058I2hWaIyHSqLqHhtCx8Hnqi&index=5

## Documentation and References

1. kotlin-in-action-v12.pdf
2. kotlin-reference.pdf

## Tips and Tricks

- Shift + ctrl + R: run application.
- 

## Topics:

### Constants:
- https://www.geeksforgeeks.org/whats-the-difference-between-const-and-val-in-kotlin/
- Can be defined via:
  - local constant: val
    - Can be defined at runtime.
  - const val 
    - Defined at compile time.
  - Are often placed in a companion object struct:
    - Will be static, but still part of a class.

```kotlin
class User {
  // Singleton Scoped: so like a Java static property. Static elements will be defined using companion object {}.
  companion object {
    private const val MAX_AGE = 18
  }   
}
```

### Late-initialized properties and variables

Reference:
- https://kotlinlang.org/docs/properties.html#late-initialized-properties-and-variables

Normally, properties declared as having a non-null type must be initialized in the constructor. However, it is often the case
that doing so is not convenient. For example, properties can be initialized through dependency injection, or in the setup
method of a unit test. In these cases, you cannot supply a non-null initializer in the constructor, but you still want to avoid null
checks when referencing the property inside the body of a class.  

To handle such cases, you can mark the property with the lateinit modifier:  
```kotlin
public class MyTest {
  // Since it is a lateinit it has to be a var.
  lateinit var subject: TestSubject
  @SetUp fun setup() {
    subject = TestSubject()
  }
  @Test fun test() {
    subject.method() // dereference directly
  }
}
```

### Nested classes

By default, nested classes do not have access to the properties of the containing class in which they are nested.  
In order to access these properties the keyword 'inner' can be used.

### Exhaustive vs Non-Exhaustive When

Reference:
- https://java-to-kotlin.dev/route_changes/exhaustiveness-of-when-statements.html
  - Non exhaustive 'when' statements on enum will be prohibited in 1.7
    - Set this in Settings | Editor | Kotlin | Migration.
      - Set the property!

For example, if using when to handle elements of the following enum:
```kotlin
enum class Direction {
    NORTH, EAST, SOUTH, WEST
}
```
The compiler will not complain if you miss an element in a statement:
```kotlin
fun runInDirection(direction: Direction) {
    when (direction) {
        Direction.NORTH -> move(0, -1)
        Direction.EAST -> move(1, 0)
        Direction.WEST -> move(-1, 0)
        // no branch for Direction.SOUTH
    }
}
```
In Kotlin 1.7 onwards a non-exhaustive when statement will be a compile-time error.  
Set this as an error in IntelliJ:
- Set this in Settings | Editor | Kotlin | Migration.
  - Set the property!

### Data Classes

Reference:
- https://kotlinlang.org/docs/data-classes.html

In such classes, some standard functionality and some utility functions are often 
mechanically derivable from the data.  
In Kotlin, these are called data classes and are marked with data:
```kotlin
data class User(val name: String, val age: Int)
// Or
data class User(val name: String = "", val age: Int = 0)
```

The compiler automatically derives the following members from all properties declared in the primary constructor:
- equals()/hashCode() pair
- toString() of the form "User(name=John, age=42)"
- **componentN()** functions corresponding to the properties in their order of declaration.
- copy() function.

To ensure consistency and meaningful behavior of the generated code, data classes have to fulfill the following requirements:
- The primary constructor needs to have at least one parameter.
- All primary constructor parameters need to be marked as val or var.
- Data classes cannot be abstract, open, sealed, or inner.

### Open and public classes

Kotlin has a special feature i.e. classes and methods are not open for extension by default, 
which means they are by default final class or final function.  
It means **Open classes and methods** in Kotlin are equivalent to the opposite of final in Java, an open method is 
overridable and an open class is extendable in Kotlin. 

class A { ... } in Java is equal to open class A { ... } in Kotlin.
final class B { ... } in Java is equal to class B { ...} in Kotlin.

An abstract class is implicitly declared as open.
 
**public** 
- means the class or method can be used from other files including from other modules.
- is default if nothing else is specified.

** internal**
If you mark a declaration as **private**, it will only be visible inside the file that contains the declaration. 
If you mark it as **internal**, it will be visible everywhere in the same module.

### Non-null asserted:

non-null asserted: use this: !!. Example: stuff!!
- Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?


