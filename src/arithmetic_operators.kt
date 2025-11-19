fun main() {

    val num1 = 1
    val num2 = 2
    val res1 = num1 + num2
    println(res1)

    val num3 = 4
    val num4 = 5
    val res2 = num3 - num4
    println(res2)

    val num5 = 4
    val num6 = 5
    val res3 = num5 * num6
    println(res3)

    val num7 = 10
    val num8 = 2
    val res4 = num7 / num8
    println(res4)

    val num9 = 10
    val num10 = 3
    val res5 = num9 % num10
    println(res5)

    var num11 = 10
    num11 += 3 // num11 = num11 +3
    println(num11)

    var num12 = 10
    num12 -= 3 // num12 = num12 - 3
    println(num12)

    var num13 = 10
    num13 *= 3 // num13 = num13 * 3
    println(num13)


    var num14 = 20
    num14 /= 2 // num14 = num14 / 2
    println(num14)

    // comparison operations
    // return bool value

    val val15: Boolean = num14 == num13
    val val16: Boolean = num14 != num13
    val val17: Boolean = num14 <= num13
    val val18: Boolean = num14 >= num13
    val val19: Boolean = num14 > num13
    val val20: Boolean = num14 < num13


    // Logical operations
    val val21: Boolean = num14 < num13 || num12 < num11 // or
    val val22: Boolean = num14 < num13 && num12 < num11  // and
    val val23: Boolean = !(num14 < num13)  // not

    // prefix increment
    ++num13 // num13 = num13 +1
    // prefix decrement
    --num13 // num13 = num13 -1
    //postfix increment
    num14++ // num14 = num14 then increment num14 +1
    //postfix decrement
    num12-- // num12 = num12 then increment num12 -1

}