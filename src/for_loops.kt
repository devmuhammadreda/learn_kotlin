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

}