import java.util.*

fun main() {
    val scanner: Scanner = Scanner(System.`in`)
    print("Enter number : ")
    val num: Int = scanner.nextInt()
//    if (num >= 0) {
//        println("Positive number")
//    } else {
//        println("Negative number")
//    }
//    println("Number = $num")

    val res: String = if (num >= 0) "Positive number" else "Negative number"
    println(res)
}