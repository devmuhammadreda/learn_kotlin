fun main() {

    try {
     riskOperation()
    }catch (e : Exception){
        println(e.message)
    }finally {
        println("end")
    }

}

fun riskOperation(){
    throw Exception("invalid user data")
}