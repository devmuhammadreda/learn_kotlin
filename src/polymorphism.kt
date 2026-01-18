// Polymorphism
// 1- Compile time polymorphism (method overloading)
// 2- Runtime polymorphism (method overriding)
// method overloading => method with same name with different parameters and data types
// method overriding => edit method from parent class in child class and use it with different implementation

fun main() {
    val cal = Calculator()
    println(cal.add(1, 2))
    println(cal.add(1, 2, 3))
    println(cal.add(1.5, 2.8))

}

// example on method overloading
class Calculator() {
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun add(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }


    fun add(a: Double, b: Double): Double {
        return a + b
    }
}

// example on method overriding
open class Vehicle() {
    open val name: String = "unknown"
    open fun drive() {
        println("$name driving")
    }
}

class Car3 : Vehicle() {
    override val name: String = "unknown"
    override fun drive() {
        // super with call implementation from parent class
        super<Vehicle>.drive()
        println("$name driving")
    }
}