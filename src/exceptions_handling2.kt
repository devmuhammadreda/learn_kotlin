fun main() {
  val result : Result<Boolean> = runCatching { login("admin" , "123456") }
    result.onSuccess {

        println("Success $it")
    }
    result.onFailure {
        println("Error ${it.message}")
    }
}

fun login (userName : String , password : String): Boolean{
    return userName == "admin" && password == "123456"
}