import java.util.*

fun main() {
    val scanner: Scanner = Scanner(System.`in`)
    print("Enter month number:")
    val month: Int = scanner.nextInt()
    when (month) {
        1 -> {
            println("jan")
        }

        2 -> {
            println("feb")
        }

        3 -> {
            println("mar")
        }

        4 -> {
            println("apr")
        }

        5 -> {
            println("may")
        }

        6 -> {
            println("jun")
        }

        7 -> {
            println("jul")
        }

        8 -> {
            println("aug")
        }

        9 -> {
            println("sep")
        }

        10 -> {
            println("oct")
        }

        11 -> {
            println("nov")
        }

        12 ->
            println("dec")

        else -> {
            println("invalid num")
            println("try again")
        }
    }

    when (month) {
        12, 1, 2 -> println("winter")
        3, 4, 5 -> println("spring")
        6, 7, 8 -> println("summer")
        9, 10, 11 -> println("fall")
    }

    val res = when (month) {
        12, 1, 2 -> "winter"
        3, 4, 5 -> "spring"
        6, 7, 8 -> "summer"
        9, 10, 11 -> "fall"
        else -> "invalid month"
    }

    println(res)

}