fun main() {
    val user1 = User2("John", 20)
    val user2 = User2("John", 20)

    println(user1 == user2)
    println(user1)
    println(user2)
    println(user1.hashCode())
    println(user1.hashCode())
    println(user1.hashCode() == user2.hashCode())

    val circle = Circle(5.0)
    val rectangle = Rectangle(2.0, 4.0)
    println(describeShapes(circle))
    println(describeShapes(rectangle))
    println(calculateArea(rectangle))
    println(calculateArea(circle))

}

/*
A Kotlin data class is a class designed primarily to hold data,
which automatically generates boilerplate functions like equals(), hashCode(), toString(), and copy().
This eliminates the need for manually writing these common methods, reducing code and potential errors.
 */
data class User2(val name: String, val age: Int)

/*
A sealed class in Kotlin is used to represent restricted class hierarchies,
meaning all its direct subclasses are known at compile time.
This provides type safety and is particularly useful for modeling a finite set of states or outcomes,
such as network responses or UI states (e.g., Loading, Success, Error).
* */
sealed class Shape
data class Circle(val radius: Double) : Shape()
data class Rectangle(val width: Double, val height: Double) : Shape()

fun describeShapes(e: Shape): String {
    return when (e) {
        is Circle -> "Circle with radius ${e.radius}"
        is Rectangle -> "Rectangle with width ${e.width} , height=${e.height}"
    }
}


fun calculateArea(shape: Shape): Double = when (shape) {
    is Circle -> 2 * 3.14 * shape.radius * shape.radius
    is Rectangle -> shape.width * shape.height
}
