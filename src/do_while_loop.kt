fun main() {
//    var count: Int = 0
//    do {
//        println("Count is : $count")
//        count++
//    } while (count <= 5)
    val secretNum: Int = (1..10).random()
    var count = 1
    do {
        if (count > 1) println("Try again")
        print("Guess a number : ")
        val guess = readln().toInt()
        count++
    } while (count <= 3 && guess != secretNum)
    if (count <= 3) {
        println("Winner")
    } else {
        println("Hard luck")
    }

}