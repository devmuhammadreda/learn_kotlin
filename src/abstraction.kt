// Abstraction hide not important things in class show only important
// Abstraction not should to make force using
// Interface force concrete class to use all methods and override them

fun main() {
    val myDog = MyDog()
    myDog.eat()
    myDog.makeSound()
}

// Abstraction
abstract class MyAnimal {
    abstract fun makeSound()
    fun eat() {
        println("My animal is eating")
    }
}

// concrete class
class MyDog : MyAnimal() {
    override fun makeSound() {
        println("park")
    }
}

// Interface
interface Drivable {
    fun drive()
}

class MyCar : Drivable {
    override fun drive() {
        println("Car is driving")
    }
}