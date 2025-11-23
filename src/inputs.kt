import java.util.*

fun main() {
    val scanner: Scanner = Scanner(System.`in`)
//    print("Please enter your name:")
//    val name: String = scanner.nextLine()
//    println("Welcome back $name")
//    println("Account registration")
//    println("First name")
//    val firstName: String = scanner.nextLine()
//    println("Last name")
//    val lastName: String = scanner.nextLine()
//    println("Email address")
//    val emailAddress: String = scanner.nextLine()
//    println("Age")
//    val age: Byte = scanner.nextByte()
//    println("Gender (M for male , F for female)")
//    val gender: Char = scanner.next().single()
//    scanner.nextLine()
//    println("Password")
//    val password: String = scanner.nextLine()
//    println("Account created success $firstName , $lastName , $age , $emailAddress , $gender , $password")

    val pi: Double = 3.14
    println("please enter circle radius")
    val radius: Double = scanner.nextDouble()
    val area: Double = 2 * pi * radius * radius
    println("circle area $area")
}