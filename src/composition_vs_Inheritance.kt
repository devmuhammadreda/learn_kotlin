fun main() {
    val washingMachine = WashingMachine(brand = "LG", capacity = 8)
    washingMachine.turnOn()
    washingMachine.startWashingMachine()
    val microwave = Microwave("LG", power = 10)
    microwave.turnOn()
    microwave.startMicrowave()
    val keyboard = Keyboard("Mechanical")
    val computer = Computer(keyboard = keyboard)
    computer.typeText("welcome Reda")

}

// if relation is A , like dog is animal so we should use inheritance
// is relation is having A , like can have engine so we should use composition
open class Appliance(val brand: String) {
    fun turnOn() {
        println("Appliance $brand is on")
    }

    fun turnOff() {
        println("Appliance $brand is off")
    }
}

class WashingMachine(brand: String, val capacity: Int) : Appliance(brand) {
    fun startWashingMachine() {
        println("Washing Machine $brand with $capacity is started")
        turnOff()
    }
}

class Microwave(brand: String, val power: Int) : Appliance(brand) {
    fun startMicrowave() {
        println("Microwave $brand is on with $power watt is heating food")
        turnOff()
    }
}

class Keyboard(val type: String) {
    fun pressKey(key: String) {
        println("Keyboard $type pressed key $key")
    }
}

class Computer(val keyboard: Keyboard) {
    fun typeText(text: String) {
        println("start typing in Keyboard ${keyboard.type}")
        text.forEach { keyboard.pressKey(it.toString()) }
    }
}