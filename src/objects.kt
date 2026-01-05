fun main() {
  val myCar : Car = Car()
    myCar.brand = "BMW"
    myCar.accelerate()
    val myCar1 : Car1 = Car1(
        "bmw",
        speed = 10
    )
    myCar1.accelerate()

    val car2 : Car2 = Car2(brand = "BMW")
    car2.accelerate()
}


class Car{
    var speed: Int = 0
    var brand : String = ""
    fun accelerate(){
        speed+=10
        println("Now car is going at $speed KM/H")
    }
}

// val cant edit it in runtime , var i can change it value in runtime
// primary constructor
class Car1 ( brand: String,var speed: Int) {
    fun accelerate(){
        speed+=10
        println("Now car is going at $speed KM/H")
    }
}


// secondary constructor
class Car2 ( var brand: String) {
    var speed: Int = 0
    constructor(brand: String,speed: Int) : this(brand){
        this.speed = speed
    }
    fun accelerate(){
        speed+=10
        println("Now car is going at $speed KM/H")
    }
}