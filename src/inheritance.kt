fun main() {
    val myDog = Dog()
    myDog.name = "Peter"
    myDog.sound()
    myDog.bark()
    myDog.eat()
}


open class Animal {
    var name: String = "unknow"
    fun eat() {
        println("$name is eating")
    }

    // لازم استخدم open عشان اسمح ان المسثود يتعمل ليها override
    open fun sound() {
        println("$name is sounding")
    }
}

class Dog : Animal() {
    fun bark() {
        println("Dog is barking")
    }

    override fun sound() {
        println("Dog is sound")
    }
}