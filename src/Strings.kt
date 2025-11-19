fun main() {
    val firstName: String = "Muhammad"
    val lastName: String = "Reda"
//    val fullName: String = "$firstName $lastName"
    val fullName: String = firstName.plus(" ").plus(lastName)
    println(fullName)
}