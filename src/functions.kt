fun main() {
    printInfo("Muhammad", 25)
    val res: Int = sum(1, 2)
    println(res)
    println(getSquare(num = 10))

    // Lambdas
    val result = { num: Int -> num * num }

    val list = listOf<Int>(1, 2, 3, 4, 5)
    val oddNum: List<Int> = list.filter { it % 2 != 0 }
    println(oddNum)



    println(result(9))

}

fun printInfo(name: String, age: Int): Unit {
    println("name $name , age $age")
}


fun sum(num1: Int, num2: Int): Int {
    return num1 + num1
}

fun getSquare(num: Int = 5): Int = num * num