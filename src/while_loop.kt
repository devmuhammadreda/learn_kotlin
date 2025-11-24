fun main() {
    var count: Int = 1
    while (count < 5) {
        println(count++)
    }

    val secretNum: Int = (1..5).random()
    var guess: Int = readln().toInt()

    while (guess != secretNum) {
        println("try again")
        guess = readln().toInt()
    }
}