fun main() {
    val res = applyOperation(a = 4, b = 4, operation = { num1, num2 -> num1 * num2 })
    println(res)
}

fun applyOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}