import java.util.*

fun main() {

    for (i in 1..10) {
        println("Hello World $i")
    }

    for (item in 1..100 step 3) {
        println(item)
    }

    for (i in 1 until 10 step 2) {
        println(i)
    }

    for (i in 10 downTo 1 step 2) {
        println(i)
    }

    // nested loop
    for (x in 1..5) {
        for (y in 1..5) {
            println("($x , $y)")
        }
    }

    for (line in 1..5) {
        for (count in 1..line) {
            print("*")
        }
        println()
    }

    for (item in 1..10) {
        if (item % 2 == 0) continue
        println(item)
    }


    for (item in 1..10) {
        if (item > 5) break
        println(item)
    }

    val scanner: Scanner = Scanner(System.`in`)
    print("Enter Number : ")
    val num: Int = scanner.nextInt()
    var factorial: Int = 1
    for (item in num downTo 1) {
        factorial *= item
    }

    println("factorial of $num = $factorial")

}